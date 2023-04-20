package at.bsu.OO.camera;

public class Main {

    public static void main(String[] args) {
        CamManufacturer cm = new CamManufacturer("Canon", "Japan");
        LensManufacturer lm = new LensManufacturer("Sony", "Austria");
        SDcard sd = new SDcard(2000);
        Camera cam = new Camera("red", 10, 1000, cm, lm, sd);

        cam.getInfo();
        cam.takePic();
        /*Pics p1 = new Pics("Picture1", 02.11, Pics.SIZE.sechsGB);
        Pics p2 = new Pics("Picture2", 04.04, Pics.SIZE.zweiGB);
        Pics p3 = new Pics("Picture3", 03.03, Pics.SIZE.vierGB);
        p1.getInfo();*/
    }

}
