package pruebas;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();

        String palabras [] = palabra.split("  ");

        for (int a = 0; a <= palabras.length; a++) {
            System.out.println(palabras[a]);
        }
    }
}
