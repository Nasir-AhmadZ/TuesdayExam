package ie.atu;

public class Ferry extends Ship {
    private int maxPass;


    public Ferry(String shipName, String shipYear, int numCrew, int maxPass) {
        super(shipName, shipYear, numCrew);
        this.maxPass = maxPass;
    }



    public Ferry(int maxPass) {
        this.maxPass = maxPass;
    }

    public int getMaxPass() {
        return maxPass;
    }

    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }

    public String vesselDetails() {
        return "Ferry{" +
                "maxPass=" + maxPass + " Name:"+super.getShipName()+
                '}';
    }

}
