package at.bsu.OO.handy;

import java.util.ArrayList;

public class MemoryCard {
    private static int capacity;
    private static ArrayList<Photofile> files;


    //Constructor
    public MemoryCard(int capacity){
        this.capacity = capacity;
        this.files = new ArrayList<Photofile>();
    }


    public static void saveFile(Photofile file){
        files.add(file);
        capacity -= file.getSize();
    }

    public static void getAllFiles()
    {
        for(int i = 0; i < files.size(); i++)
        {
            this.files.get(i).getInfo();
        }
    }

    public static int getFreeSpace()
    {
        return capacity;
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
