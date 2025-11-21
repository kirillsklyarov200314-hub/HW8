import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] arr = new double[10];
        double middleWeitght = 0;
        int peopleCount=0;

        for(int i=0 ; i<arr.length; i++) {
            arr[i] = (new Random().nextDouble() * 60) + 40;
            middleWeitght += arr[i];
            if(arr[i] >= 60 && arr[i] <= 80) {
                peopleCount++;
            }
        }

        System.out.println("Средний вес: " + (middleWeitght / arr.length));
        System.out.println("Кол-во людей: " + peopleCount);
    }
}
