public class MergeSort {

    // Fusionne de sous tableaux de arr[].
    // Premier sous tableau est arr[l..m]
    // Second sous tableau est arr[m+1..r]

    void merge(int arr[], int l, int m, int r) {
        // Trouve les tailles des deux sous tableau pour être fusionner
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Créer des tableaux temporaires */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copie les données des tableaux temporaires*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Fusionne les tableaux temporaires */

        // index initial du premier et deuxième sous tableau
        int i = 0, j = 0;

        // Index initial des sous tableaux fusionné
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copie les éléments restants de L[] s'il y en a */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copie les éléments restants de R[] le cas échéant */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Fonction principale qui trie arr[l..r] en utilisant
    // fusion()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Trouver le point médian
            int m =l+ (r-l)/2;

            // Trier la première et deuxième moitié
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Fusionner les moitiés triées
            merge(arr, l, m, r);
        }
    }

    /* Une fonction utilitaire pour imprimer un tableau de taille n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // method qui test
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
