package boj.problem;

import java.util.Scanner;

public class B3_5597_과제_안내신분 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[30];
        for (int i = 0; i < 28; i++) {
            int num = in.nextInt();
            arr[num]++;
        }

        for(int i=1; i<=30; i++) {
            if(arr[i]==0) {
                System.out.println(i);
            }
        }

    }
}
