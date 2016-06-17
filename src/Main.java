


import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

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



}



