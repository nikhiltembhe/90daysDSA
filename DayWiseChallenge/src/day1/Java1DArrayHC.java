package day1;

import java.util.Scanner;

// question :- https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=false
public class Java1DArrayHC {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int[] a = new int[n];
            for(int i =0; i<n; i++){
                a[i] = scan.nextInt();
            }
            scan.close();

            // Prints each sequential element in array a
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }


