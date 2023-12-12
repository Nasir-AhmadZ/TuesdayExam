package ie.atu;

public class Trawler extends Ship{
    private int cargoCap;

    public Trawler() {
    }

    public Trawler(String shipName, String shipYear, int numCrew, int cargoCap) {
        super(shipName, shipYear, numCrew);
        this.cargoCap = cargoCap;
    }

    public Trawler(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    public String vesselDetails() {
        return "Trawler{" +
                "cargoCap=" + cargoCap + " Name:"+super.getShipName()+
                '}';
    }

}
