package Rectangle;

public class ClassRectangle {
    double width, height;

    public ClassRectangle() {
    }

    public ClassRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    public void display(){
        System.out.println("Rectangle have width = "+this.width + ", height = "+this.height);
        System.out.println("Area = "+getArea());
        System.out.println("Perimeter = "+getPerimeter());
    }

}