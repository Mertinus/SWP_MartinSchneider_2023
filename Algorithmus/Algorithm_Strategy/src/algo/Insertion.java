package algo;

import java.util.ArrayList;
import java.util.List;

public class Insertion implements Algorithm {
    @Override
    public int[] Sort(int[] input) {
        //ArrayList<Integer> sorted = new ArrayList<Integer>();
        //int[] sorted = new int[input.length];
        //int sortedBorder = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (input[j] > input[i]) {
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = input[j];

                    //sortedBorder++;
                }
                else {

                }
            }
        }

        return input;
    }
}