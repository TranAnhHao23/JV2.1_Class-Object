package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch dongHoBamGio = new StopWatch();
        dongHoBamGio.getStartTime();
        long[] arr = new long[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(Math.random() * 1000);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        dongHoBamGio.getEndTime();
        System.out.println(dongHoBamGio.stopWatch());
    }
}
