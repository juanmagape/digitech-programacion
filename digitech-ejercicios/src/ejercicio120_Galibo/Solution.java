package ejercicio120_Galibo;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        int alt = print.nextInt();
        int num = print.nextInt();
        int alturaPuente = 0;

        for (int i = 0; i < num; i++) {
            alturaPuente = print.nextInt();
            if (alturaPuente > alt) {
                System.out.println("choca con el puente " + i);
            } else {

            }
        }
    }
}