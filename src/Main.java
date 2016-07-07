


import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;
import com.sun.corba.se.impl.util.PackagePrefixChecker;

import java.util.*;

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

        int c = 3;
        int d = 6;
        System.out.println("3, 6:  " + findBiggerValue(c, d)); // first value is smaller
        System.out.println("6, 3:  " + findBiggerValue(d, c)); // first value is bigger
        System.out.println("3, 3:  " + findBiggerValue(c, c)); // first and second are equal

        int val1 = 0;
        int val2 = 7116;
        int val3 = 9319;
        System.out.println();
        System.out.println(val1 + " = " + convertIntToEnglish(val1));
        System.out.println(val2 + " = " + convertIntToEnglish(val2));
        System.out.println(val3 + " = " + convertIntToEnglish(val3));

        int val4 = 2000;
        System.out.println();
        System.out.println("The number of 2s from 0 to " + val4 + " = " + count2s(val4));


        int val5 = 25;

        System.out.println();
        System.out.println(val5 + " values of the fibonacci sequence");
        long startTime = System.currentTimeMillis();
        System.out.print("Fibonacci value at " + val5 + " = " + fibonacci(val5));
        System.out.println("\nExponential fibonacci method took " +
                            (System.currentTimeMillis() - startTime) + "ms\n" +
                                "for " + val5 + " values.");


        System.out.println();
        System.out.println(val5 + " values of the fibonacci sequence");
        startTime = System.currentTimeMillis();
        System.out.print("Fibonacci value at " + val5 + " = " + fibonacciMemoization(val5));
        System.out.println("\nLinear fibonacci method took " +
                (System.currentTimeMillis() - startTime) + "ms\n" +
                "for " + val5 + " values.");

        //Create nodes
        GraphNode gnA = new GraphNode('A');
        GraphNode gnB = new GraphNode('B');
        GraphNode gnC = new GraphNode('C');
        GraphNode gnD = new GraphNode('D');
        GraphNode gnE = new GraphNode('E');
        GraphNode gnF = new GraphNode('F');

        //Create graph / Add nodes / Create edges
        Graph graph = new Graph();
        graph.addNode(gnA);
        graph.addNode(gnB);
        graph.addNode(gnC);
        graph.addNode(gnD);
        graph.addNode(gnE);
        graph.addNode(gnF);
        graph.setRootNode(gnA);

        graph.connectNode(gnA, gnB);
        graph.connectNode(gnA, gnC);
        graph.connectNode(gnA, gnD);

        graph.connectNode(gnB, gnE);
        graph.connectNode(gnB, gnF);

        graph.connectNode(gnC, gnF);

        System.out.println();
        System.out.println("Breadth-First Search of graph:   ");
        graph.breadthFirstSearch();

        System.out.println();
        System.out.println("Depth-First Search of graph:   ");
        graph.depthFirstSearch();

        System.out.println();
        System.out.println();

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(5);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        System.out.println("myLinkedList = " + myLinkedList.toString());

        System.out.println("Remove 5");
        myLinkedList.removeOneInstance(5);
        System.out.println("myLinkedList = " + myLinkedList.toString());

        System.out.println("Remove 3");
        myLinkedList.removeOneInstance(3);
        System.out.println("myLinkedList = " + myLinkedList.toString());

        System.out.println("Remove 4");
        myLinkedList.removeOneInstance(4);
        System.out.println("myLinkedList = " + myLinkedList.toString());

        System.out.println("Remove 1");
        myLinkedList.removeOneInstance(1);
        System.out.println("myLinkedList = " + myLinkedList.toString());

        System.out.println("Remove 2");
        myLinkedList.removeOneInstance(2);
        System.out.println("myLinkedList = " + myLinkedList.toString());

        System.out.println();

        MyLinkedList<String> myStrLinkedList = new MyLinkedList<>("Head!!");
        myStrLinkedList.add("First added!");
        myStrLinkedList.add("Second added!");
        myStrLinkedList.add("Third added!");
        myStrLinkedList.add("Fourth added!");

        System.out.println("myStrLinkedList = " + myStrLinkedList.toString());

        System.out.println("Remove \"Second added!\"");
        myStrLinkedList.removeOneInstance("Second added!");
        System.out.println("myStrLinkedList = " + myStrLinkedList.toString());

        System.out.println();
        System.out.println();

        /* Polymorphism concepts */

        Animal animal = new Animal();
        System.out.print("animal.sayHello() = ");
        animal.sayHello();

        Animal dog = new Dog();
        System.out.print("dog.sayHello() = ");
        dog.sayHello();

        Animal cat = new Cat();
        System.out.print("cat.sayHello() = ");
        cat.sayHello();

        animal = new Dog();
        System.out.println("animal casted to Dog()");
        System.out.print("animal.sayHello() = ");
        animal.sayHello();

        dog = new Cat();
        System.out.println("dog casted to Cat()");
        System.out.print("dog.sayHello() = ");
        dog.sayHello();

        System.out.println();
        System.out.println();

        System.out.println("Stack created with linked list");
        MyStack<Integer> stack = new MyStack<>(5);
        System.out.println("size of stack is " + stack.size() );
        System.out.println("popped value is " + stack.pop() );
        System.out.println("size of stack is " + stack.size() );
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("size of stack is " + stack.size() );

        stack.insertAfter(3, 10);
        stack.insertAfter(10, 100);
        stack.insertAfter(4, 1000);
        stack.insertAfter(1, 10000);


        System.out.println(stack.toString());
        System.out.println(stack.delete(4));
        System.out.println(stack.toString());
        System.out.println(stack.delete(2));
        System.out.println(stack.toString());
        System.out.println(stack.delete(1));
        System.out.println(stack.toString());

        System.out.println("popped value is " + stack.pop() );
        System.out.println(stack.toString());

        System.out.println();
        System.out.println();

        System.out.println("Binary Tree getHeight question");
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.right = node8;

        BinaryTree binaryTree = new BinaryTree(node1);
        System.out.println("Binary Tree height is " + binaryTree.getHeight());

        System.out.println("Preorder traversal");
        binaryTree.preorder();

        System.out.println("\nPreorder traversal (No recursion)");
        binaryTree.preorderNoRecursion();


        System.out.println("\nBinary Tree Lowest Common Ancestor question");
        TreeNode bsnode1 = new TreeNode(5);
        TreeNode bsnode2 = new TreeNode(3);
        TreeNode bsnode3 = new TreeNode(7);
        TreeNode bsnode4 = new TreeNode(1);
        TreeNode bsnode5 = new TreeNode(4);
        TreeNode bsnode6 = new TreeNode(6);
        TreeNode bsnode7 = new TreeNode(8);
        TreeNode bsnode8 = new TreeNode(2);

        bsnode1.left  = bsnode2;
        bsnode1.right = bsnode3;
        bsnode2.left  = bsnode4;
        bsnode2.right = bsnode5;
        bsnode3.left  = bsnode6;
        bsnode3.right = bsnode7;
        bsnode4.right = bsnode8;

        BinaryTree binarySearchTree = new BinaryTree(bsnode1);
        System.out.println("\nThe lowest common ancestor of 2 and 8 is : " + binarySearchTree.findLowestCommonFactor(2, 8));
        System.out.println("The lowest common ancestor of 2 and 4 is : " + binarySearchTree.findLowestCommonFactor(2, 4));
        System.out.println("The lowest common ancestor of 6 and 8 is : " + binarySearchTree.findLowestCommonFactor(6, 8));

        System.out.println();
        System.out.println();

        System.out.println("Find first nonrepeatedchar question");

        System.out.println("Hello = " + findFirstNonRepeatedChar("Hello"));
        System.out.println("Goodbye = " + findFirstNonRepeatedChar("Goodbye"));
        System.out.println("Helloh = " + findFirstNonRepeatedChar("Helloh"));
        System.out.println("GoodbyeG = " + findFirstNonRepeatedChar("GoodbyeG"));

        System.out.println();
        System.out.println();

        System.out.println("removeChars question");
        System.out.println("\"Hello this is a sentence\" with \"e\" removed = " + removeChars("Hello this is a sentence", "e"));

        System.out.println();
        System.out.println();

        System.out.println("reverseWords question");
        System.out.println("\"Hello this is a sentence\" reversed = " + reverseWords("Hello this is a sentence"));

        System.out.println();
        System.out.println();

        System.out.println("Binary Search (recursive) on sorted int array question");
        int [] sortedIntArray = { 1, 3, 4, 8, 9, 12, 16, 21, 23 };

        System.out.println("The index of 3 is " + findIndex(sortedIntArray, 3));
        System.out.println("The index of 1 is " + findIndex(sortedIntArray, 1));
        System.out.println("The index of 23 is " + findIndex(sortedIntArray, 23));
        System.out.println("The index of 9 is " + findIndex(sortedIntArray, 9));
        System.out.println("(Error case) The index of 0 is " + findIndex(sortedIntArray, 0));

        System.out.println();
        System.out.println();

        System.out.println("Print all permutations of string question");
        Permutations abcPermutations = new Permutations("abc");
        System.out.println("Permutations of abc:");
        abcPermutations.permute();

        System.out.println();
        System.out.println();

        System.out.println("Print all combinations of string question");
        Combinations abcCombinations = new Combinations("abc");
        System.out.println("Combinations of abc:");
        abcCombinations.combine();

        System.out.println();
        System.out.println();

        System.out.println("Find number of ones in binary of a number question");
        System.out.println("Number of ones in 5 (binary) = " + numOnesInBinary(5));
        System.out.println("Number of ones in 15 (binary) = " + numOnesInBinary(15));
        System.out.println("Number of ones in 115 (binary) = " + numOnesInBinary(115));

        System.out.println();
        System.out.println();

        System.out.println("mth to last element in linked list question");
        MyElementLinkedList<Integer> intLinkedList = new MyElementLinkedList<>(5);
        intLinkedList.add(12);
        intLinkedList.add(3);
        intLinkedList.add(9);
        intLinkedList.add(2);
        intLinkedList.add(1);
        intLinkedList.add(8);
        System.out.println("intLinkedList = " + intLinkedList);
        System.out.println("last element int linkedList is : " + intLinkedList.findmthToLastElement(0));
        System.out.println("6th to last element int linkedList is : " + intLinkedList.findmthToLastElement(6));
        System.out.println("5th to last element int linkedList is : " + intLinkedList.findmthToLastElement(5));
        System.out.println("1st to last element int linkedList is : " + intLinkedList.findmthToLastElement(1));


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

    private static int findBiggerValue(int first, int second) {

        int difference = first - second; //get difference between the 2 values
        int result = (difference >> 31) & 0x1; // Check the signed bit
                                               // if result = 0 the first value was bigger,
                                               // else the second value is bigger (except if they're equal)
        int max = first - result * difference; // subtract the first value by the result (0 or 1) multiplied
                                               // by the difference e.g. -3 or 3
                                               // NOTE: the first value will never be subtracted by a positive number.
        //System.out.println("result * difference = " + (result * difference));
        return max;
    }

    private static String convertIntToEnglish(int val) {
        /**
         * Not compatible for ints bigger than 9,999
         */

        if (val == 0) {
            return "Zero";
        }

        String result = "";
        String valToString = Integer.toString(val);

        int counter = valToString.length() - 1;

        for (int i = 0; i < valToString.length(); i++) {

            if (counter == 1) {
                //tenth place - special naming e.g. forty, fifty
                switch (valToString.charAt(i)) {
                    case '0': break;
                    case '1': switch (valToString.charAt(i+1)) {
                        case '0': break;
                        case '1': return result + "Eleven";
                        case '2': return result + "Twelve";
                        case '3': return result + "Thirteen";
                        case '4': return result + "Fourteen";
                        case '5': return result + "Fifteen";
                        case '6': return result + "Sixteen";
                        case '7': return result + "Seventeen";
                        case '8': return result + "Eighteen";
                        case '9': return result + "Nineteen";
                        default: result = "Something went wrong: Error 2" + result; break;
                    }

                        result = result+"teen";     break;
                    case '2': result = result + "Twenty-";  break;
                    case '3': result = result + "Thirty-";  break;
                    case '4': result = result + "Forty-";   break;
                    case '5': result = result + "Fifty-";   break;
                    case '6': result = result + "Sixty-";   break;
                    case '7': result = result + "Seventy-"; break;
                    case '8': result = result + "Eighty-";  break;
                    case '9': result = result + "Ninety-";  break;
                    default: result = "Something went wrong: Error 1" + result; break;
                }
            } else {
                switch (valToString.charAt(i)) {
                    case '0': break;
                    case '1': result = result + "One";   break;
                    case '2': result = result + "Two";   break;
                    case '3': result = result + "Three"; break;
                    case '4': result = result + "Four";  break;
                    case '5': result = result + "Five";  break;
                    case '6': result = result + "Six";   break;
                    case '7': result = result + "Seven"; break;
                    case '8': result = result + "Eight"; break;
                    case '9': result = result + "Nine";  break;
                    default: result = "Something went wrong: Error 2" + result; break;
                }

                switch (counter) {
                    case 0: break;
                    case 1: result = "This should have never happened" + result; break; //should never happen due to separate if condition
                    case 2: result = result + " Hundred ";  break;
                    case 3: result = result + " Thousand "; break;
                }
            }

            counter--; // decrement the counter

        }


        return result;
    }

    private static int count2s(int val) {

        int result = 0;
        int temp;
        for (int i = 0; i <= val; i++) {
            temp = i;
            while (temp > 0) {
                if (temp % 10 == 2) {
                   result++;
                }
                temp /= 10;
            }
        }
        return result;
    }

    private static int fibonacci(int val) {
        //2^n time (exponential time / not very good)
        if (val == 0 || val == 1) {
            return val;
        }
        return (fibonacci(val - 2) + fibonacci( val - 1 ));
    }

    private static int fibonacciMemoization(int val) {
        //n time (linear)
        int a = 0;
        int b = 1;

        for (int i = 2; i < val; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return a + b;
    }

    public static class GraphNode {
        private char data;
        boolean visited = false;
        GraphNode(char data) {
            this.data = data;
        }
    }

    public static class Graph {
        private GraphNode rootNode;
        public ArrayList<GraphNode> nodes = new ArrayList<>();
        public int[][] adjMatrix; //This is how edges are represented
        private int size = 0; //init to 0

        public void setRootNode(GraphNode node) {
            this.rootNode = node;
        }

        public GraphNode getRootNode() {
            return this.rootNode;
        }

        public void addNode(GraphNode node) {
            nodes.add(node);
        }

        public void connectNode(GraphNode start, GraphNode end) {
            if (adjMatrix == null) {
                this.size = nodes.size();
                adjMatrix = new int[size][size];
            }

            int startIndex = nodes.indexOf(start);
            int endIndex = nodes.indexOf(end);
            adjMatrix[startIndex][endIndex] = 1;
            adjMatrix[endIndex][startIndex] = 1;
        }

        private GraphNode getUnvisitedChildren(GraphNode node) {
            int index = nodes.indexOf(node);
            for (int i = 0; i < this.size; i++) {
                if (adjMatrix[index][i] == 1 && nodes.get(i).visited == false) {
                    return nodes.get(i);
                }
            }
            return null;
        }

        public void breadthFirstSearch() {
            Queue<GraphNode> queue = new LinkedList<>();
            queue.add(this.rootNode);
            this.rootNode.visited = true;
            printNode(rootNode);

            while (!queue.isEmpty()) {
                GraphNode node = queue.remove();
                GraphNode child = null;

                while ((child = getUnvisitedChildren(node)) != null) {
                    child.visited = true;
                    printNode(child);
                    queue.add(child);
                }
            }

            clearNodes(); //Clears the visited properties of the nodes

        }

        public void depthFirstSearch() {
            Stack<GraphNode> stack = new Stack<>();
            stack.push(this.rootNode);
            this.rootNode.visited = true;
            printNode(rootNode);

            while (!stack.isEmpty()) {
                GraphNode node = stack.peek();
                GraphNode child = getUnvisitedChildren(node);

                if (child != null) {
                    child.visited = true;
                    printNode(child);
                    stack.push(child);
                } else {
                    stack.pop();
                }
            }

            clearNodes(); //Clears the visited properties of the nodes

        }

        private void clearNodes() {

            for (int i = 0; i < size; i++) {
                GraphNode node = nodes.get(i);
                node.visited = false;
            }
        }

        private void printNode(GraphNode node) {
            System.out.print(node.data + " ");
        }

    }

    public static class Node <T> {
        private T data;
        public Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    public static class MyLinkedList <T> {
        private Node head = null;

        public MyLinkedList(T val) {
            Node<T> head = new Node<>(val);
            this.head = head;
        }

        public Node getHead() {
            return head;
        }

        public void add(T val) {
            Node<T> next = new Node<>(val);
            if (head == null) {
                head = next;
                return;
            }
            Node iter = head;

            while (iter.next != null) {
                iter = iter.next;
            }
            iter.next = next;
        }

        public void removeOneInstance(T val) {

            if (head == null) {
                return;
            }
            if (head.data == val) {
                head = head.next;
                return;
            }
            Node iter = head;
            Node prev = null;

            while (iter.next != null) {
                if (iter.data == val) {
                    prev.next = iter.next;
                    return;
                }
                prev = iter;
                iter = iter.next;
            }
            if (iter.data == val) {
                prev.next = null;
            }

        }

        @Override
        public String toString() {
            if (head == null) {
                return "The List Is Empty.";
            }
            Node iter   = head;
            String result = iter.data + " ";

            while (iter.next != null) {
                iter = iter.next;
                result += iter.data + " ";
            }
            return result;
        }


    }


    public static class Animal {

        public void sayHello() {
            System.out.println("Generic noise!");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sayHello() {
            System.out.println("WOOF!");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sayHello() {
            System.out.println("MEOW!");
        }
    }


    public static class MyElement <T> {
        public MyElement <T> next;
        public T data;

        //Might want to make a constructor to initialize
        //Make data and next private and use constructors
    }

    public static class MyElementLinkedList <T> {
        public MyElement <T> head;
        public MyElementLinkedList (T data) {
            head = new MyElement<>();
            head.data = data;
            head.next = null;
        }
        public T findmthToLastElement(int m) {
            int size = 0;
            MyElement<T> iter = head;
            while ( iter.next != null ) {
                iter = iter.next;
                size++;
            }
            int eleLocation = size - m;
            iter = head;
            while (eleLocation > 0 && iter.next != null ) {
                eleLocation--;
                iter = iter.next;
            }
            return iter.data;
        }
        public void add(T nextData) {
            MyElement<T> iter = head;
            while (iter.next != null) {
                iter = iter.next;
            }
            MyElement<T> temp = new MyElement<>();
            iter.next = temp;
            temp.data = nextData;
            temp.next = null;
        }
        @Override
        public String toString() {
            String result = "";
            MyElement<T> iter = head;
            result += "[ ";
            while (iter != null) {
                result += iter.data + " ";
                iter = iter.next;
            }
            result += "]";
            return result;
        }

    }

    public static class MyStack <T> {
        private MyElement <T> head;
        private int size = 0;

        public MyStack(T data) {
            this.head = new MyElement<>();
            this.head.data = data;
            this.head.next = null;
            size++;
        }
        public void push (T data) {
            MyElement newElement = new MyElement();
            newElement.data = data;
            newElement.next = this.head;
            this.head = newElement;
            size++;
        }
        public T pop() {
            if (head == null) {
                System.out.println("The stack is empty!!");
                return null;
            }
            T tempData = head.data;
            this.head = this.head.next;
            size--;
            return tempData;
        }
        public int size() {
            return size;
        }
        public boolean delete (T value) {
            if ( head == null) {
                return false;
            }
            MyElement <T> orig = head;
            MyElement <T> prev = null;
            while (head != null) {
                if ( head.data == value) {
                    size--;
                    if ( prev == null ) {
                        //first value
                        head = head.next;
                        return true;
                    }
                    prev.next = head.next;
                    head = orig;
                    return true;
                }
                prev = head;
                head = head.next;
            }
            head = orig;
            return false;
        }

        public boolean insertAfter(T dataAtPosition, T dataToInsert) {
            if (head == null) {
                return false;
            }
            MyElement<T> orig = head;
            while ( head != null ) {
                if ( head.data == dataAtPosition ) {
                    MyElement<T> temp = new MyElement<>();
                    temp.data = dataToInsert;
                    temp.next = head.next;
                    head.next = temp;
                    head = orig;
                    return true;
                }
                head = head.next;
            }
            head = orig;
            return false;
        }

        @Override
        public String toString() {
            MyElement<T> orig = head;
            String result = "";
            while (head != null) {
                if (head.next == null) {
                    result += head.data;
                } else {
                    result += head.data + ", ";
                }
                head = head.next;
            }
            head = orig;
            return result;
        }
}

    public static class TreeNode {
        public TreeNode left = null;
        public TreeNode right = null;
        private Integer data = null;
        public TreeNode(Integer value) {
            this.data = value;
        }
        public Integer getData() {
            return data;
        }
    }

    public static class BinaryTree {
        private TreeNode root = null;
        public BinaryTree(TreeNode root) {
            this.root = root;
        }
        public TreeNode getRoot() {
            return root;
        }
        public int getHeight() {
            return getHeight(root);
        }
        private int getHeight( TreeNode node ) {
            if (node == null) {
                return 0;
            }
            return 1 + Math.max(
                    getHeight(node.left),
                    getHeight(node.right) );
        }

        public void preorder() {
            preorder(root);
        }
        private void preorder(TreeNode node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
        public void preorderNoRecursion() {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode temp = stack.peek();
                stack.pop();
                System.out.print(temp.data + " ");
                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }
            }
        }
        public Integer findLowestCommonFactor( int val1, int val2 ) {
            TreeNode iter = this.root;
            while ( iter != null ) {
                Integer data = iter.getData();
                if ( data < val1 && data < val2 ) {
                    iter = iter.right;
                } else if ( data > val1 && data > val2 ) {
                    iter = iter.left;
                } else {
                    return iter.getData();
                }
            }
            return null;
        }

    }

    public static char findFirstNonRepeatedChar( String s ) {

        char c = '\u0000';

        if (s.isEmpty() || s == null) {
            return c;
        }
        s = s.toUpperCase();

        HashMap<Character, Integer> instancesOfChars = new HashMap<>();

        for ( int i = 0; i < s.length(); i++ ) {
            c = s.charAt(i);

            if (instancesOfChars.containsKey(c)) {
                instancesOfChars.put(c, instancesOfChars.get(c) + 1);
            } else {
                instancesOfChars.put(c, 1); //first value found
            }
        }
        for ( int i = 0; i < s.length(); i++ ) {
            c = s.charAt(i);
            if (instancesOfChars.get(c) == 1) {
                return c;
            }
        }

        c = '\u0000';
        return c;
    }

    public static String removeChars(String str, String remove) {
        HashSet<Character> charsToRemove = new HashSet<>();
        String result = "";
        char c;
        for (int i = 0; i < remove.length(); i++) {
            charsToRemove.add(remove.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if ( !charsToRemove.contains( c ) ) {
                result += c;
            }
        }
        return result;
    }

    public static String reverseWords( String s ) {
        if ( s.isEmpty() || s == null) {
            return s;
        }
        String result = "";
        String [] sArray = s.split(" ");
        for ( int i = sArray.length - 1; i >= 0; i--) {
            if ( i == 0 ) {
                result += sArray[i];
            } else {
                result += sArray[i] + " ";
            }
        }
        return result;
    }
    public static int findIndex(int[] intArray, int val) {
        return findIndex(intArray, val, 0, intArray.length);
    }
    private static int findIndex(int[] intArray, int val, int lower, int upper) {
        int middle = (lower + upper) / 2;
        if (lower == upper) {
            return -1;
        }

        if ( intArray[middle] > val ) {
            return findIndex(intArray, val, lower, middle);
        } else if ( intArray[middle] < val ) {
            return findIndex(intArray, val, middle, upper);
        } else {
            //intArray[middle] == val
            return middle;
        }

    }

    public static class Permutations {
        private boolean [] used;
        private StringBuilder out = new StringBuilder();
        private final String in;
        public Permutations(final String str) {
            in = str;
            used = new boolean[ in.length() ];
        }
        public void permute() {
            if ( out.length() == in.length() ) {
                System.out.print( out + " ");
                return;
            }
            for ( int i = 0; i < in.length(); i++) {
                if ( used[i] ) continue;
                out.append(in.charAt(i));
                used[i] = true;
                permute();
                used[i] = false;
                out.setLength( out.length() - 1 );
            }
        }
    }

    public static class Combinations {
        private StringBuilder out = new StringBuilder();
        private final String in;

        public Combinations(final String str) {
            in = str;
        }

        public void combine() {
            combine(0);
        }

        private void combine(int start) {
            for (int i = start; i < in.length(); i++) {
                out.append(in.charAt(i));
                System.out.print(out + " ");
                if (i < in.length()) {
                    combine(i + 1);
                }
                out.setLength(out.length() - 1);
            }
        }
    }

    public static int numOnesInBinary( int num ) {
        int numOnes = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                numOnes++;
            }
            num = num >>> 1;
        }

        return numOnes;
    }

}



