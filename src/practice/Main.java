package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
   //N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
        Scanner  in  = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
