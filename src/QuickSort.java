public class QuickSort{

    // Une fonction utilitaire pour échanger deux éléments
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* Cette fonction prend le dernier élément comme pivot, place
     l'élément pivot à sa position correcte dans le tri
     tableau, et place tous plus petit (plus petit que pivot)
     à gauche du pivot et tous les éléments supérieurs à droite
     de pivot */
    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index du plus petit élément et
        // indique la bonne position
        // du pivot trouvé jusqu'à présent
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            // Si l'élément courant est plus petit
            // que le pivot
            if (arr[j] < pivot)
            {

                // on incrémente le plus petit element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* La fonction principale qui implémente QuickSort
             arr[] --> Tableau à trier,
             low --> Indice de départ,
             high --> Indice de fin
    */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi est l'index de partitionnement, arr[p]
            // est maintenant au bon endroit
            int pi = partition(arr, low, high);

            // Trier les éléments séparément avant
            // partition et après partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // fonction qui affiche le tableau
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // méthode qui teste
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}