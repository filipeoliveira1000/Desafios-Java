package br.com.dio.desafio;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String rCompetidores = scan.nextLine();

        String[] rCompetidoresSplit = rCompetidores.split(" ");
//TODO: Complete o código com uma possível solução para o problema.
        int count = 0;

        for (int i = 0 ; i < rCompetidoresSplit.length ; i++) {
            if (rCompetidoresSplit[i].equals(T)) {
                count++;
            }
        }
        System.out.println(count);
    }
}


