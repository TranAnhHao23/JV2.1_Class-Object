package QuadraticEquation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public double solution1(){
        return -(this.b + Math.pow(getDiscriminant(),0.5))/(2*this.a);
    }
    public double solution2(){
        return -(this.b - Math.pow(getDiscriminant(),0.5))/(2*this.a);
    }

    public void result() {
        if ( this.a == 0){
            System.out.println("Không phải phương trình bậc 2, đưng hỏi nữa");
        } else {
            if (this.getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (this.getDiscriminant() == 0) {
                System.out.println("Phương trình có 1 nghiệm = " + (-this.b / 2 / this.a));
            } else {
                System.out.println("Phương trình có 2 nghiệm  = "+ this.solution1() + " và "+ this.solution2());
            }
        }
    }
}
