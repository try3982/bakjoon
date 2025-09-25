package boj;

import java.util.Scanner;

public class B4_2440 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i>0; i--) { // n이  5 4 3 2 1
            for(int j=1; j<=n; j++) {
                if(j <=i) System.out.print("*");
                else System.out.println(" ");
            }
            System.out.println();
        }


    }
}
