import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;

        do {
            System.out.print("Enter size: ");
            size = sc.nextInt();
            if(size > 20) {
                System.out.println("size not be less than 20");
            }
        }while (size > 20);

        arr = new int[size];
        for (int i=0; i < size ; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();//xuống dòng;

        int min = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + min);
    }
}
