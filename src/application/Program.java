package application;

import services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();


        System.out.println("How many values do you wish add?");

        var many = sc.nextInt();

        for (int i = 0; i < many; i++) {

            ps.addValue(sc.nextInt());
        }


        ps.Print();

        System.out.println(ps.first());

        sc.close();

    }
}
