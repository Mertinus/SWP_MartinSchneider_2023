package components;

public class Camera {
    private String resolution;

    public Camera(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public PhoneFile MakePicture() {
        System.out.println("Picture taken with resolution: " + this.resolution);
        return new PhoneFile(".png", 10, Integer.toString(PhoneFile.fileCounter));
    }
}
