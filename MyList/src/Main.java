public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.Add(10);
        list.Add(15);
        list.Add(5);
        list.Add(40);
        list.Add(60);
        list.Print();

        list.Remove(0);
        list.Remove(4);
        System.out.println("Item at: " + list.Get(0));
        list.Print();
    }
}