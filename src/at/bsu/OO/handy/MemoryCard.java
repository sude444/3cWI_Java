package at.bsu.OO.handy;

import java.util.ArrayList;

public class MemoryCard {
    private int capacity;
    private ArrayList<Photofile> files;


    //Constructor
    public MemoryCard(int capacity){
        this.capacity = capacity;
        this.files = new ArrayList<Photofile>();
    }







    //Getter and Setter
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Photofile> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<Photofile> files) {
        this.files = files;
    }
}
