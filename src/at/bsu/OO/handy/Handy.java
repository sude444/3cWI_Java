package at.bsu.OO.handy;

public class Handy {
    private SimCard simCard;
    private Camera camera;
    private MemoryCard memoryCard;


    //Constructor
    public Handy(SimCard simCard, Camera camera, MemoryCard memoryCard) {
        this.simCard = simCard;
        this.camera = camera;
        this.memoryCard = memoryCard;
    }


    //Funktionen

    public void takePicture(){
        if(MemoryCard.getFreeSpace() > 0)
        {
            MemoryCard.saveFile(camera.makePic());
            System.out.println("Cheese!");
        }
        else
        {
            System.out.println("Kein Speicherplatz mehr!");
        }
    }

    public void makeCall(String number){
        simCard.whatNumber(number);
    }

    public void getFreeSpace(){
        MemoryCard.getFreeSpace();
    }

    public void ptintAllFiles(){
        MemoryCard.getAllFiles();
    }


    //Getter and Setter
    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
}
