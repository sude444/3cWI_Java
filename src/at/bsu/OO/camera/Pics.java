package at.bsu.OO.camera;

public class Pics {
    private String name;
    private double date;
    public enum SIZE{zweiGB, vierGB, sechsGB}
    private SIZE size;


    //Constructor
    public Pics(String name, double date, SIZE size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }


    public void takePic(){
        Pics picture ;
        if (size == Pics.SIZE.zweiGB) {
            //  make picture
            picture = new Pics("image",03.03, SIZE.zweiGB);
        }
        else if (size == SIZE.vierGB){
            picture = new Pics("image",2.11,SIZE.vierGB);
        } else  {
            picture = new Pics("image",04.04,SIZE.sechsGB);
        }
    }


    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public float getSize() {
        if(size == SIZE.zweiGB){
            return 2;
        }
        if(size == SIZE.vierGB){
            return 4;
        }
        if(size == SIZE.sechsGB){
            return 6;
        }
        else{
            return 0;
        }
    }

    public void getInfo(){
        System.out.println("Name: "+ name +", " + "Date: " + date + ", " + "Größe: " + size );
    }

    public void setSize(SIZE size) {
        this.size = size;
    }
}
