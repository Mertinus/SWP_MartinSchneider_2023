import algo.Bubble;
import algo.Insertion;
import algo.Selection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = DataGenerator.CreateData(15,0,10);
        DataGenerator.Print(arr);

        Selection selection = new Selection();
        Bubble bubble = new Bubble();
        Insertion insertion = new Insertion();
        Sorter sorter = new Sorter(insertion);
        sorter.Sort(arr);

        DataGenerator.Print(arr);
    }
}