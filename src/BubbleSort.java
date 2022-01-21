public class BubbleSort {
    static void bubbleSort(int[] tab) {
            int size = tab.length;
            int tmp = 0;

            for(int i=0; i < size; i++) {
                for(int j=1; j < (size-i); j++) {
                    if(tab[j-1] > tab[j]) {

                        //Switch elements
                        tmp = tab[j-1];
                        tab[j-1] = tab[j];
                        tab[j] = tmp;
                    }
                }
            }
        }

        static void displayTab(int[] tab) {
            for(int i=0; i < tab.length; i++) {
                System.out.print(tab[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int arr[] ={84, 12, 1, 43, 5, 10};

            displayTab(arr);

            //Sort elements of the array with bubble sort
            bubbleSort(arr);

            displayTab(arr);
        }
    }
