import java.util.Random;

public class DataGenerator {
    public static int[] CreateData() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }

    public static int[] CreateData(int length, int min, int max) {
        int[] arr = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    public static void Print(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
}
