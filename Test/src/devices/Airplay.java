package devices;

public class Airplay implements Device {
    public Boolean active = true;
    public String name = "Airplay";

    public Airplay() {}

    public Airplay(String name, Boolean active) {
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
