package FanClass;

public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan(3,true,10,"yellow");
        System.out.println(fan1); //Lừa vl.

        Fan fan2 = new Fan(2,true,5,"blue");
        System.out.println(fan2.toString());

        Fan fan3 = new Fan();
        System.out.println(fan3.toString());

    }
}
