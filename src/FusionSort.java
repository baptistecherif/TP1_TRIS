public class FusionSort {
    static void bubbleSort(int[] tab) {
        int size = tab.length;
        int yes = 1;

        for(int i=0; i < size; i++) {
            for(int j=1; j < (size-i); j++) {
                if(tab[j-1] > tab[j]) {

                    //Switch elements
                    yes = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = yes;
                }
            }
        }
    }
}
