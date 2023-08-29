package Backjoon.Implementation.Q2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            for (int j=i; j<n-1; j++) sb.append(" ");
            for (int j=0; j<i*2+1; j++) sb.append("*");
            sb.append("\n");
        }

        for (int i=1; i<n; i++) {
            for (int j=0; j<i; j++) sb.append(" ");
            for (int j=2*i; j<2*n-1; j++) sb.append("*");
            sb.append("\n");
        }

        System.out.print(sb);
    }
}