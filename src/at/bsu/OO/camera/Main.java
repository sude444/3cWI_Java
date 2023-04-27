package at.bsu.OO.camera;

public class Main {

    public static void main(String[] args) {
        CamManufacturer cm = new CamManufacturer("Canon", "Japan");
        LensManufacturer lm = new LensManufacturer("Sony", "Austria");
        SDcard sd = new SDcard(10);
        Camera cam = new Camera("red", 10, 1000, cm, lm, sd);

        cam.getInfo();
        Pics pic1 = cam.takePic("pic1", 222002, Pics.SIZE.vierGB);
        sd.saveImage(pic1);
        Pics pic2 = cam.takePic("pic2", 222002, Pics.SIZE.vierGB);
        sd.saveImage(pic1);
        Pics pic3 = cam.takePic("pic3", 222002, Pics.SIZE.vierGB);
        sd.saveImage(pic1);
    }
}
