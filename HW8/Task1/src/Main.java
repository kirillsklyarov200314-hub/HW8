public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========================");
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for(int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("========================");
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        for(int i=0; i<arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (1 + i)];
            arr[arr.length - (1 + i)] = temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
