package br.com.dio.desafio;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int M = leitor.nextInt();
        HashSet<Integer> compradas = new HashSet<Integer>();
        for (int i = 0; i < M; i++) {
            compradas.add(leitor.nextInt());
        }
        int faltam = N - compradas.size();
        System.out.println(faltam);
    }

}