import devices.Device;

import java.util.ArrayList;
import java.util.List;

public class Cynapp {
    private List<Device> devices = new ArrayList<Device>();
    private Beamer beamer = new Beamer();

    public void setActive(int index) {
        if (index >= devices.size()) {
            System.out.println("Index out of bounds");
            return;
        }

        devices.get(index).setActive(true);
    }

    public void addDevice(Device device) {
        if (devices.size() < 4) {
            devices.add(device);
        }
        else {
            System.out.println("Max device count reached! The oldest device was replaced");
            devices.remove(0);
            devices.add(device);
        }
    }

    public void showDevice(int index) {
        if (index >= devices.size()) {
            System.out.println("Could not show device: Index out of bounds");
            return;
        }

        String content = devices.get(index).getContent();
        beamer.show(content);
    }
}
