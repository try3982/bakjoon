package boj.problem;

import java.util.Scanner;

public class B5_9086_문자열 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            String str = in.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }
    }
}
