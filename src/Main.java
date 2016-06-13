
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Add 3 + 5 = " + addIteratively(3,5));
        System.out.println("Add 1 + 3 = " + addIteratively(1,3));
        System.out.println("Add 6 + 5 = " + addIteratively(6,5));
        System.out.println("Add 1 + 9 = " + addRecursively(1,9));
        System.out.println("Add 5 + 5 = " + addRecursively(5,5));
        System.out.println("Add 0 + 3 = " + addRecursively(0,3));

        System.out.println();

        exampleTemplateMethod(new String[5]);
        exampleTemplateMethod(new Integer[5]);
        exampleTemplateMethod(new Double[5]);
        exampleTemplateMethod(new Float[5]);
        exampleTemplateMethod(new Boolean[5]);
        exampleTemplateMethod(new Short[5]);
        exampleTemplateMethod(new Long[5]);
        exampleTemplateMethod(new Character[5]);

        System.out.println();

        int ARRAY_SIZE = 10000;

        Integer [] intArray0 = createRandomIntArray(ARRAY_SIZE);
        Integer[] insertionSortedArray = insertionSort(intArray0);
        //displayArray(insertionSortedArray);

        Integer [] intArray1 = createRandomIntArray(ARRAY_SIZE);
        Integer[] selectionSortedArray = selectionSort(intArray1);
        //displayArray(selectionSortedArray);

        Integer [] intArray2 = createRandomIntArray(ARRAY_SIZE);
        Integer[] bubbleSortedArray = bubbleSort(intArray2);
        //displayArray(bubbleSortedArray);

        Integer [] intArray3 = createRandomIntArray(ARRAY_SIZE);
        Integer[] shellSortedArray = shellSort(intArray3);
        //displayArray(shellSortedArray);

        Integer [] intArray4 = createRandomIntArray(ARRAY_SIZE);
        Integer[] mergeSortedArray = mergeSort(intArray4);
        //displayArray(mergeSortedArray);

        Integer [] intArray5 = createRandomIntArray(ARRAY_SIZE);
        Integer[] heapSortedArray = heapSort(intArray5);
        //displayArray(heapSortedArray);

        Integer [] intArray6 = createRandomIntArray(ARRAY_SIZE);
        Integer[] quickSortedArray = quickSort(intArray6);
        //displayArray(quickSortedArray);

        Integer [] intArray7 = createRandomIntArray(ARRAY_SIZE);
        Integer[] quickSorted3Array = quickSort3(intArray7);
        //displayArray(quickSorted3Array);

        int a = 4;
        int b = 10;
        swapWithoutTemp(a, b);



    }

    public static int addIteratively(int x, int y) {
        /**
         * Iterative version
         */
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
        public static int addRecursively(int x, int y) {
        /**
         * Recursive version
         */
        if (y == 0) {
            return x;
        } else {
            return addRecursively(x ^ y, (x & y) << 1);
        }
    }

    public static <T> void exampleTemplateMethod(T[] array) {

        System.out.println("Type of array is " + array.getClass());
    }

    public static Integer[] createRandomIntArray(int size) {
        Integer[] intArray = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

    public static <T> void displayArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            //System.out.println("Array at index " + i + " = " + array[i]);
        }
        System.out.println();
    }

    public static Integer[] insertionSort(Integer[] array) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            //loop through the entire array
            Integer temp = array[i];
            //set temporary variable
            int j;
            //define j outside of inner forLoop scope
            for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                //if j is greater than 0 or equal to zero and the value at index j is greater than the temp
                //integer than we should set index at j+1 equal to j
                //displayArray(array); //this allows me to visualize the sort
                array[j+1] = array[j];
            }
            //the value of j+1 will be set to the value of temp
            array[j+1] = temp;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("InsertionSort took " + (endTime - startTime) + " milliseconds.");

        return array;
    }

    public static Integer[] selectionSort(Integer[] array) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = index+1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            //Swap the elements
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("selectionSort took " + (endTime - startTime) + " milliseconds.");
        return array;
    }

    public static Integer[] bubbleSort(Integer[] array) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++)
            if (array[j-1] > array[j]) {
                //Swap the elements
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("bubbleSort took " + (endTime - startTime) + " milliseconds.");
        return array;
    }

    public static Integer[] shellSort(Integer[] array) {
        long startTime = System.currentTimeMillis();

        //int [] iterators = { 121, 40, 13, 4, 1 };
        int [] iterators = { 5, 4, 3, 2, 1 };

        for (int it : iterators) {
            for (int i = 0; i < array.length; i = i + it ) {
                Integer temp = array[i];
                int j;
                for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                    //swap values
                    array[j + 1] = array[j];
                }
                array[j + 1] = temp;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("shellSort took " + (endTime - startTime) + " milliseconds.");
        return array;
    }

    //MergeSort Starts here

    /**
     * This method is the wrapper for the real mergeSort to avoid over complexity when calling method
     */
    public static Integer[] mergeSort(Integer[] array) {
        long startTime = System.currentTimeMillis();

        Integer[] tmp = new Integer[array.length];
        mergeSort(array, tmp, 0, array.length - 1);

        long endTime = System.currentTimeMillis();
        System.out.println("mergeSort took " + (endTime - startTime) + " milliseconds.");
        return array;
    }

    private static void mergeSort(Integer[] array, Integer[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(array, tmp, left, center);
            mergeSort(array, tmp, center + 1, right);
            merge(array, tmp, left, center + 1, right);
        }
    }

    private static void merge(Integer [] array, Integer [] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if(array[left].compareTo(array[right]) <= 0) {
                tmp[k++] = array[left++];
            } else {
                tmp[k++] = array[right++];
            }
        }

        while (left <= leftEnd) {
            tmp[k++] = array[left++];
        }

        while (right <= rightEnd) {
            tmp[k++] = array[right++];
        }

        for (int i = 0; i < num; i++, rightEnd--) {
            array[rightEnd] = tmp[rightEnd];
        }
    }


    //MergeSort ends here

    //Heapsort starts here

    public static Integer[] heapSort(Integer[] array) {
        long startTime = System.currentTimeMillis();

        int N = array.length;
        for (int k = N/2; k >= 1; k--) {
            sink(array, k, N);
        }
        while (N > 1) {
            exch(array, 1, N--);
            sink(array, 1, N);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("heapSort took " + (endTime - startTime) + " milliseconds.");
        return array;
    }

    private static void sink(Integer [] array, int k, int N) {
        while (2*k <= N) {
            int j = 2*k;
            if ( j < N && less(array, j, j+1)) {
                j++;
            }
            if (!less(array, k, j)) {
                break;
            }
            exch(array, k, j);
            k = j;
        }
    }

    private static boolean less(Integer[] array, int i, int j) {
        return array[i-1].compareTo(array[j-1]) < 0;
    }

    private static void exch(Integer[] array, int i, int j) {
        Integer swap = array[i-1];
        array[i-1] = array[j-1];
        array[j-1] = swap;
    }

    //heapsort ends here

    //quicksort starts here

    public static Integer[] quickSort(Integer[] array) {
        long startTime = System.currentTimeMillis();

        quickSort(array, 0, array.length - 1);

        long endTime = System.currentTimeMillis();
        System.out.println("quickSort took " + (endTime - startTime) + " milliseconds.");
        return array;
    }

    private static void quickSort(Integer[] array, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(array, lo, hi);
        quickSort(array, lo, j-1);
        quickSort(array, j+1, hi);
    }

    private static int partition(Integer[] array, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Integer v = array[lo];

        while (true) {
            while (less_q(array[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less_q(v, array[--j])) {
                if ( j == lo) {
                    break;
                }
            }
            if ( i >= j) {
                break;
            }

            exch_q(array, i, j);
        }

        exch_q(array, lo, j);


        return j;
    }

    private static boolean less_q(Integer v, Integer w) {
        return v.compareTo(w) < 0;
    }

    private static void exch_q(Integer[] array, int i, int j) {
        Integer swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }

    //quicksort ends here

    //quickSort3 starts here

    public static Integer[] quickSort3(Integer[] array) {
        long startTime = System.currentTimeMillis();

        quickSort3(array, 0, array.length - 1);

        long endTime = System.currentTimeMillis();
        System.out.println("quickSort3 took " + (endTime - startTime) + " milliseconds.");
        return array;
    }

    public static void quickSort3(Integer[] array, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo;
        int gt = hi;

        Integer v = array[lo];

        int i = lo;

        while (i <= gt) {
            int cmp = array[i].compareTo(v);
            if (cmp < 0) {
                exch_q3(array, lt++, i++);
            } else if (cmp > 0) {
                exch_q3(array, i, gt--);
            } else {
                i++;
            }
        }

        quickSort3(array, lo, lt-1);
        quickSort3(array, gt+1, hi);

    }

    private static void exch_q3(Integer[] array, int i, int j) {
        Integer swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }

    //quickSort3 ends here

    private static void swapWithoutTemp(int a, int b) {
        System.out.println("\nswapWithoutTemp(a = "+a+", b = "+b+");");
        // swap using xor
        a = b ^ a;
        b = b ^ a;
        a = b ^ a;

        /*
        a = b - a;
        b = b - a;
        a = b + a; */

        System.out.print("Result:  ");
        System.out.print("a = " + a + "\t");
        System.out.println("b = " + b);
    }


}
