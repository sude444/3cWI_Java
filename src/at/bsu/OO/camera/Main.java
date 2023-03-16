package at.bsu.OO.camera;

public class Main {
    CamManufacturer cm = new CamManufacturer("Canon", "Japan");
    LensManufacturer lm = new LensManufacturer("Sony", "Austria");
    Pics p1 = new Pics("Picture1", 02.11, Pics.SIZE.sechsGB);
    Pics p2 = new Pics("Picture2", 04.04, Pics.SIZE.zweiGB);
    Pics p3 = new Pics("Picture3", 03.03, Pics.SIZE.vierGB);

}
