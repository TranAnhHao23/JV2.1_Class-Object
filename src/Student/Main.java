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
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);

        Student[] student = new Student[3];  // Mark this point!!!
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].toString());
        }
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student.length; j++) {
                if (student[i].averageMark() > student[j].averageMark()) {
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        System.out.println("Sắp xếp theo điểm trung bình: ");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].toString());
        }
    }
}
