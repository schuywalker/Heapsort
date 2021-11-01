/*
Schuyler Asplin
CSCD320 Professor Xu
prog2 Richest People
Due October 30th 2021
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Richest {

    public static void main(String[] args){

        int[] A = new int[10001];

        int[] playA = {16,14,10,8,7,9,3,2,4,1};//for testing purposes.

        File file = new File(args[0]);
        try {
            Scanner sc = new Scanner(file);

            int numsScanned = 0;
            while (numsScanned <= 10000){
                int newNum = sc.nextInt();
                numsScanned++; // want to start at array index 1 for array based indexing.
                A[numsScanned] = newNum;
            }



            //convert array into a minheap




        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found...");
        }



    }




}
