package components;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void DoCall(String number) {
        System.out.println("You dialed the number: " + number);
    }
}
