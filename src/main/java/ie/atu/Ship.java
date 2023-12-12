package ie.atu;

public class Ship {
    private String shipName;
    private String shipYear;
    private int numCrew;


    public Ship(String shipName, String shipYear, int numCrew) {
        this.shipName = shipName;
        this.shipYear = shipYear;
        this.numCrew = numCrew;
    }

    public Ship() {

    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipYear() {
        return shipYear;
    }

    public void setShipYear(String shipYear) {
        this.shipYear = shipYear;
    }

    public int getNumCrew() {
        return numCrew;
    }

    public void setNumCrew(int numCrew) {
        this.numCrew = numCrew;
    }


    public String vesselDetails() {
        return "Ship{" +
                "shipName='" + shipName + '\'' +
                ", shipYear='" + shipYear + '\'' +
                ", numCrew=" + numCrew +
                '}';
    }
    @Override
    public String toString() {
        return
                "shipName='" + shipName + '\'';
    }
}
