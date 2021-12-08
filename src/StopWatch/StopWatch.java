package StopWatch;

public class StopWatch {
    long startTime, endTime;

    public StopWatch() {

    }
//    public StopWatch(double startTime, double endTime){
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    public long getStartTime() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long getEndTime() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public double stopWatch(){
        return (endTime - startTime)/1000.0;
    }
}

