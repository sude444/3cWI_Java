package at.bsu.OO.Remote;

public class Batterie {

    private float chargingStatus;

    public Batterie(float chargingStatus)
    {
        this.chargingStatus = chargingStatus;
    }


    public float getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(float chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}
