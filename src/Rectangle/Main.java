package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input width: ");
        double width = sc.nextDouble();
        System.out.println("Input height: ");
        double height = sc.nextDouble();

        ClassRectangle rec = new ClassRectangle(width,height);
        rec.display();

    }
}