package FanClass;

public class Fan {
     int speed;
     boolean turnOn;
     int radius;
     String color;

    public Fan(int speed, boolean turnOn, int radius, String color) {
        this.speed = speed;
        this.turnOn = turnOn;
        this.radius = radius;
        this.color = color;
    }

    public Fan(){
        this.speed = 1;
        this.turnOn = false;
        this.radius = 5;
        this.color = "blue";
    }

    public String getSpeed() {
        if (this.speed == 1){
            return "SLOW";
        } else if (this.speed == 2){
            return "MEDIUM";
        } else{
            return "FAST";
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String isTurnOn() {
        if (this.turnOn){
            return "isTurnOn";
        }else {
            return "isTurnOff";
        }
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Fan{" +
                "speed= " + getSpeed() +
                ", turnOn= " + isTurnOn() +
                ", radius= " + getRadius() +
                ", color= '" + getColor() + '\'' +
                '}';
    }
}
