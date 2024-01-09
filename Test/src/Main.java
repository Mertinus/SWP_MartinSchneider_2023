import devices.Airplay;
import devices.Device;
import devices.Miracast;

public class Main {
    public static void main(String[] args) {
        Cynapp cynapp = new Cynapp();

        Miracast miracast1 = new Miracast("Special Deluxe Miracast", false);
        Miracast miracast2 = new Miracast();
        Miracast miracast3 = new Miracast("Miracast number 3", true);
        Airplay airplay1 = new Airplay();
        Airplay airplay2 = new Airplay("Second Airplay", true);

        cynapp.addDevice(miracast1);
        cynapp.addDevice(airplay1);
        cynapp.addDevice(airplay2);
        cynapp.addDevice(miracast2);
        //cynapp.addDevice(miracast3);

        cynapp.showDevice(0);
        cynapp.showDevice(1);
        cynapp.showDevice(2);
        cynapp.showDevice(3);
        cynapp.showDevice(4);
    }
}