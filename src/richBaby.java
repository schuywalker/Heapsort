import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class richBaby {

    public static void main(String[] args) {

        //int[] A = new int[10001];

       // int[] A = {0, 16, 7, 10, 8, 14, 16, 16, 16, 16};//for testing purposes.
        int[] A = {0,1,2,3,4,5};//for testing purposes.
//        File file = new File(args[0]);
//        try {
//            Scanner sc = new Scanner(file);
//
//            int numsScanned = 0;
//            while (numsScanned <= 11) {
//                int newNum = sc.nextInt();
//                numsScanned++; // want to start at array index 1 for array based indexing.
//                playA[numsScanned] = newNum;
//            }

        maxHeap.printA(A);
        //convert array into a maxheap
        //maxHeap.Build_Max_Heap(playA);
//        maxHeap.Max_Heapify(A, 4);
//        maxHeap.Max_Heapify(A, 3);
//        maxHeap.Max_Heapify(A, 2);
        //maxHeap.Max_Heapify(A, 9);
        maxHeap.Build_Max_Heap(A);


        System.out.println("after");
        maxHeap.printA(A);

        System.out.println("after");
        maxHeap.Heapsort(A);
        maxHeap.printA(A);


//
//        } catch (FileNotFoundException e) {
//            System.out.println("File Not Found...");
//        }


    }
}
