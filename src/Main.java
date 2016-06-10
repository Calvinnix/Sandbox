import com.sun.tools.classfile.Method;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Add 3 + 5 = " + addIteratively(3,5));
        System.out.println("Add 1 + 3 = " + addIteratively(1,3));
        System.out.println("Add 6 + 5 = " + addIteratively(6,5));
        System.out.println("Add 1 + 9 = " + addRecursively(1,9));
        System.out.println("Add 5 + 5 = " + addRecursively(5,5));
        System.out.println("Add 0 + 3 = " + addRecursively(0,3));


        exampleTemplateMethod(new String[5]);
        exampleTemplateMethod(new Integer[5]);
        exampleTemplateMethod(new Double[5]);
        exampleTemplateMethod(new Float[5]);
        exampleTemplateMethod(new Boolean[5]);
        exampleTemplateMethod(new Short[5]);
        exampleTemplateMethod(new Long[5]);
        exampleTemplateMethod(new Character[5]);


        Integer [] intArray = createRandomIntArray(10);

        Integer[] insertionSortedArray = insertionSort(intArray);
        displayArray(insertionSortedArray);
        selectionSort(intArray);
        bubbleSort(intArray);
        mergeSort(intArray);
        shellSort(intArray);
        heapSort(intArray);
        quickSort(intArray);
        quickSort3(intArray);



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

        long startTime = System.nanoTime();

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

        long endTime = System.nanoTime();
        System.out.println("InsertionSort took " + (endTime - startTime) + " nanoseconds.");

        return array;
    }

    public static Integer[] selectionSort(Integer[] array) {
        long startTime = System.nanoTime();

        //TODO: implement

        long endTime = System.nanoTime();
        System.out.println("selectionSort took " + (endTime - startTime) + " nanoseconds.");
        return array;
    }

    public static Integer[] bubbleSort(Integer[] array) {
        long startTime = System.nanoTime();

        //TODO: implement

        long endTime = System.nanoTime();
        System.out.println("bubbleSort took " + (endTime - startTime) + " nanoseconds.");
        return array;
    }

    public static Integer[] shellSort(Integer[] array) {
        long startTime = System.nanoTime();

        //TODO: implement

        long endTime = System.nanoTime();
        System.out.println("shellSort took " + (endTime - startTime) + " nanoseconds.");
        return array;
    }

    public static Integer[] mergeSort(Integer[] array) {
        long startTime = System.nanoTime();

        //TODO: implement

        long endTime = System.nanoTime();
        System.out.println("mergeSort took " + (endTime - startTime) + " nanoseconds.");
        return array;
    }

    public static Integer[] heapSort(Integer[] array) {
        long startTime = System.nanoTime();

        //TODO: implement

        long endTime = System.nanoTime();
        System.out.println("heapSort took " + (endTime - startTime) + " nanoseconds.");
        return array;
    }

    public static Integer[] quickSort(Integer[] array) {
        long startTime = System.nanoTime();

        //TODO: implement

        long endTime = System.nanoTime();
        System.out.println("quickSort took " + (endTime - startTime) + " nanoseconds.");
        return array;
    }

    public static Integer[] quickSort3(Integer[] array) {
        long startTime = System.nanoTime();

        //TODO: implement

        long endTime = System.nanoTime();
        System.out.println("quickSort3 took " + (endTime - startTime) + " nanoseconds.");
        return array;
    }

}
