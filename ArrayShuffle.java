import java.util.Random;
import java.util.Scanner;
public class ArrayShuffle {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] originalArray=new int[n];
        for(int i=0;i<n;i++)originalArray[i]=sc.nextInt();
        System.out.print("Original Array:");
        for(int i=0;i<n;i++)System.out.print(originalArray[i]+" ");
        shuffleArray(originalArray);
        System.out.print("\nShuffled Array: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
    }
    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
