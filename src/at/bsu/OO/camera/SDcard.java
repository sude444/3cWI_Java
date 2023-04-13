package at.bsu.OO.camera;
import java.util.ArrayList;
import java.util.List;

public class SDcard {
    private float capacity;
    private List<Pics> files;
    private Pics.SIZE size;


    //Constuructor
    public SDcard (float capacity){
        this.capacity = capacity;
        this.files = new ArrayList<Pics>();
    }

    public void saveFile(Pics file){
        if(capacity < file.getSize()){
            System.out.println("Bild konte nicht gespeichert werden. Speicher ist voll!");
        }
        else{
            this.files.add(file);
            this.capacity -= file.getSize();
            System.out.println("File gespeichert");
        }
    }


    //Setter und Getter

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public List<Pics> getFiles() {
        return files;
    }

    public void setFiles(List<Pics> files) {
        this.files = files;
    }

    public Pics.SIZE getSize() {
        return size;
    }

    public void setSize(Pics.SIZE size) {
        this.size = size;
    }
}
