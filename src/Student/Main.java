package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin học sinh thứ 1: ");
        Student student1 = new Student(sc);
        System.out.println("Nhập thông tin học sinh thứ 2: ");
        Student student2 = new Student(sc);
        System.out.println("Nhập thông tin học sinh thứ 3: ");
        Student student3 = new Student(sc);
        System.out.println("Tổng kết thông tin học sinh");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Tổng kết thông tin học sinh theo điểm tb");
        double ave1 = student1.averageMark();
        double ave2 = student2.averageMark();
        double ave3 = student3.averageMark();
        if (ave1 > ave2 && ave1 > ave3){
            if (ave2 > ave3){
                System.out.println(student1);
                System.out.println(student2);
                System.out.println(student3);
            } else {
                System.out.println(student1);
                System.out.println(student3);
                System.out.println(student2);
            }
        } else if (ave2 > ave3){
            if (ave1 > ave3){
                System.out.println(student2);
                System.out.println(student1);
                System.out.println(student3);
            } else {
                System.out.println(student2);
                System.out.println(student3);
                System.out.println(student1);
            }
        } else {
            if (ave1 > ave2){
                System.out.println(student3);
                System.out.println(student1);
                System.out.println(student2);
            } else {
                System.out.println(student3);
                System.out.println(student2);
                System.out.println(student1);
            }
        }
        Student student4 = new Student("Hào",19,"Male","Hà Lội");
        System.out.println(" Nhập điểm Toán cho student4: ");
        double student4Math = sc.nextDouble();
        System.out.println(" Nhập điểm Anh cho student4: ");
        double student4Lite = sc.nextDouble();
        System.out.println(" Nhập điểm Văn cho student4: ");
        double student4Eng = sc.nextDouble();
        student4.setMath(student4Math);
        student4.setEnglish(student4Eng);
        student4.setLiterature(student4Lite);

        System.out.println(student4);
    }
}
