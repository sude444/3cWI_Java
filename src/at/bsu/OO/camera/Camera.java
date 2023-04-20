package at.bsu.OO.camera;

public class Camera {
    private String color;
    private float weight;
    private int pixel;
    private CamManufacturer camManufacturer;
    private LensManufacturer lensManufacturer;
    private SDcard sDcard;

    //Constructor


    public Camera(String color, float weight, int pixel, CamManufacturer camManufacturer, LensManufacturer lensManufacturer, SDcard sDcard) {
        this.color = color;
        this.weight = weight;
        this.pixel = pixel;
        this.camManufacturer = camManufacturer;
        this.lensManufacturer = lensManufacturer;
        this.sDcard = sDcard;
    }

    public void getInfo(){
        System.out.println("Camera:\n" + "color: "+ color + ", \n" + "weight: " + weight + ", \n" + "pixel: " + pixel +
                ",\n" +"----------------------\n"+ "Camera Manufacturer: " );
        camManufacturer.getInfo();
        System.out.println("----------------------\n" + "Lens Manufacturer: ");
        lensManufacturer.getInfo();
        System.out.println("----------------------\n" + "SDCard: ");
        sDcard.getInfo();
    }

    public void takePic()
    {
        System.out.println("Picture taken");

    }

    //Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public CamManufacturer getCamManufacturer() {
        return camManufacturer;
    }

    public void setCamManufacturer(CamManufacturer camManufacturer) {
        this.camManufacturer = camManufacturer;
    }

    public LensManufacturer getLensManufacturer() {
        return lensManufacturer;
    }

    public void setLensManufacturer(LensManufacturer lensManufacturer) {
        this.lensManufacturer = lensManufacturer;
    }
}
