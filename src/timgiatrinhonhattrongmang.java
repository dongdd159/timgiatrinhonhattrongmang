import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class timgiatrinhonhattrongmang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("Giá trị nhỏ nhất của mảng là: "+findmin(array));
    }
    public static int findmin(int []arr){
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
