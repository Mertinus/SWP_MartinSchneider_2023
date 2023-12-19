package algo;

public class Bubble implements Algorithm {
    @Override
    public int[] Sort(int[] input) {
        for (int s = input.length - 1; s >= 0; s--) {
            for (int i = 0; i < s; i++) {
                if (input[i] < input[i + 1]) {
                    int temp = input[i + 1];
                    input[i + 1] = input[i];
                    input[i] = temp;
                }
            }
        }
        return input;
    }
}
