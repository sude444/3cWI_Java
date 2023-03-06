package at.bsu.OO.handy;

public class Photofile {
    public enum TYPE{jpg,png, mp4}
    private int filesize;
    public String name;
    private TYPE type;
    public Photofile(TYPE dataType,String name,int fileSiz){
        this.type = type;
        this.filesize = filesize;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("File name: "+ this.name +" File size: "+ this.filesize +" File Type: "+ this.filesize);
    }


    //Getter and Setter
    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
