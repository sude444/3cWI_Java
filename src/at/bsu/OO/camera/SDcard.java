package at.bsu.OO.camera;
import java.util.ArrayList;
import java.util.List;

public class SDcard {
    private float capacity;
    private List<Pics> files;
    private Pics.SIZE size;

    public SDcard (float capacity){
        this.capacity = capacity;
        this.files = new ArrayList<Pics>();

    }
}
