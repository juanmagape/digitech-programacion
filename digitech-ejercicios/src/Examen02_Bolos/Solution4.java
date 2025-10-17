package Examen02_Bolos;
import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);

        int decAct = print.nextInt();
        int decLim = print.nextInt();
        boolean tapones = print.nextBoolean();
        int tieneTapones = decLim * 2;

        boolean peligro = decAct > decLim;
        boolean peligroTapones = tapones && decAct > tieneTapones;

        System.out.println(peligro || peligroTapones);
    }
}