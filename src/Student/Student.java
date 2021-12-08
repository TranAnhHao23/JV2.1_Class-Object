package Student;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double math, literature, english;

    public Student() {
    }

    public Student(Scanner sc) {
        System.out.println("Họ và tên: ");
        this.name = sc.nextLine();
        System.out.println("Tuổi: ");
        this.age = sc.nextInt();
        System.out.println("Giới tính: ");
        sc.nextLine();
        this.gender = sc.nextLine();
        System.out.println("Địa chỉ: ");
        this.address = sc.nextLine();
        System.out.println("Điểm Toán: ");
        this.math = sc.nextDouble();
        System.out.println("Điểm Văn: ");
        this.literature = sc.nextDouble();
        System.out.println("Điểm Anh: ");
        this.english = sc.nextDouble();
        sc.nextLine();
    }

// Một hàm thêm: 4 thuộc tính đầu tiên:

    public Student(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double averageMark(){
        return (this.math + this.literature + this.english)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                ", address = '" + address + '\'' +
                ", math = " + math +
                ", literature = " + literature +
                ", english = " + english +
                ", average = " + this.averageMark() +
                '}';
    }

}
