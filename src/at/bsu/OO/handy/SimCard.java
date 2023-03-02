package at.bsu.OO.handy;

public class SimCard {
    private int id;
    private String phoneNumber;

    //Constructor
    public SimCard(int id, String phoneNumber){
        this.id = id;
        this.phoneNumber = phoneNumber;
    }


    //Funktion
    public void whatNumber(String phoneNumber){
        System.out.println("Ihre Telefonnummer lautet: "+ this.phoneNumber +". Ihre ID lautet: "+ this.id);
    }



    // Getter und Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.phoneNumber = phoneNumber;
    }
}
