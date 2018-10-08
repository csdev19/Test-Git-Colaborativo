package DAO;

public class Publishers {

    private int pubID;
    private String namePub;

    public Publishers(int pubID, String namePub) {
        this.pubID = pubID;
        this.namePub = namePub;
    }

    public Publishers() {
    }

    /**
     * @return the pubID
     */
    public int getPubID() {
        return pubID;
    }

    /**
     * @param pubID the pubID to set
     */
    public void setPubID(int pubID) {
        this.pubID = pubID;
    }

    /**
     * @return the namePub
     */
    public String getNamePub() {
        return namePub;
    }

    /**
     * @param namePub the namePub to set
     */
    public void setNamePub(String namePub) {
        this.namePub = namePub;
    }

    @Override
    public String toString() {
        return "Publishers{" + "pubID=" + pubID + ", namePub=" + namePub + '}';
    }

}
