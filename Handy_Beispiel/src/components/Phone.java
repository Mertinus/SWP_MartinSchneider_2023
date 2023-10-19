package components;

import java.util.List;

public class Phone {
    private String color;
    private Camera camera;
    private SIM sim;
    private SDCard sdCard;

    public Phone(String color, String resolution, String number, int capacity) {
        this.color = color;
        this.camera = new Camera("1920x1080");
        this.sim = new SIM(0, "+43067765948393");
        this.sdCard = new SDCard(100000);
    }

    public void TakePicture() {
        PhoneFile picture = this.camera.MakePicture();
        sdCard.SaveFile(picture);
    }

    public void MakeCall(String c) {
        sim.DoCall("+4367767468495");
    }

    public int GetFreeSpace() {
        return sdCard.GetFreeSpace();
    }

    public void PrintAllFiles() {
        List<PhoneFile> phoneFiles = sdCard.GetAllFiles();
        System.out.println("The SDCard contains the following files:");
        for (PhoneFile file : phoneFiles) {
            System.out.println(file.getName() + file.getExtension() + " " + file.getSize());
        }
    }
}
