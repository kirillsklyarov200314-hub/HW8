import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] arr = new int[10];
        double sum = 0;

        for(int i=0 ; i<arr.length; i++) {
            arr[i] = (new Random().nextInt(61)) + 40;
        }

        int n=0;
        for(int i=0 ; i<arr.length; i++) {
            sum += arr[i];
            if(arr[i] >= 60 && arr[i] <= 80) {
                n++;
                System.out.println("Макс" + arr[i]);
            }
        }

        System.out.println("Средний вес: " + sum/arr.length);
        System.out.println("Кол-во людей: " + n);
    }
}
