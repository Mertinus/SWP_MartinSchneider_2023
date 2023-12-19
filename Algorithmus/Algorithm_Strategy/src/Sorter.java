import algo.Algorithm;

public class Sorter {
    public Algorithm currentAlgo;

    public Sorter(Algorithm algo) {
        currentAlgo = algo;
    }

    public void SetAlgo(Algorithm algo) {
        currentAlgo = algo;
    }

    public int[] Sort(int[] input) {
        return currentAlgo.Sort(input);
    }
}
