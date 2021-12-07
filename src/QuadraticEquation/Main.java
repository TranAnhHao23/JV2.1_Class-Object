package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a (khác 0 nhé): ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        equation.result();
    }
}
