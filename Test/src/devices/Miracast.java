package devices;

public class Miracast implements Device {
    public Boolean active = true;
    public String name = "Miracast";

    public Miracast() {}

    public Miracast(String name, Boolean active) {
        this.name = name;
        this.active = active;
    }

    @Override
    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public Boolean isActive() {
        return this.active;
    }

    @Override
    public String getContent() {
        return "I am " + this.name + " and I am " + (this.active == true ? "active" : "inactive");
    }
}
