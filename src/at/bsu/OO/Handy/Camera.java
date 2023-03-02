package at.bsu.OO.Handy;

public class Camera {
    public enum RESOLUTION{High, Medium, Low};
    private RESOLUTION resolution;


    //Constructor
    public Camera(RESOLUTION resolution){
        this.resolution = resolution;
    }


    //Funktion
    public Photofile takePicture(){
        Photofile pic = new Photofile(Photofile.TYPE.jpg, "pictutre", 2);
        return pic;
    }




    //Setter und Getter
    public RESOLUTION getResolution() {
        return resolution;
    }

    public void setResolution(RESOLUTION resolution) {
        this.resolution = resolution;
    }
}
