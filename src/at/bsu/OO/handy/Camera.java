package at.bsu.OO.handy;

public class Camera {
    public enum RESOLUTION{High, Medium, Low};
    private RESOLUTION resolution;


    //Constructor
    public Camera(RESOLUTION resolution){
        this.resolution = resolution;
    }


    //Funktion
    public Photofile makePic(){
        Photofile pic = new Photofile(Photofile.TYPE.jpg, "pictutre", 2);
        return pic;
    }


    //Setter and Getter
    public RESOLUTION getResolution() {
        return resolution;
    }

    public void setResolution(RESOLUTION resolution) {
        this.resolution = resolution;
    }
}
