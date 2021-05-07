package model;

public class Camper {
    public int camperId;
    public int camperType;
    public String vehicleModel;

    public Camper(int camperId, int camperType, String vehicleModel) {
        this.camperId = camperId;
        this.camperType = camperType;
        this.vehicleModel = vehicleModel;
    }

    /***
     * This method will find an autocamper in the database,
     * and return a new Camper instance with the type and model variables.
     * If an error occurs, then null is returned.
     * @param camperId The id of the autocamper to get data about.
     * @return An instance of Camper upon success, null upon an error.
     */
    public static Camper getCamper(int camperId) {
        DB.selectSQL("SELECT * FROM tbl_autocampers WHERE fld_camper_id = " + camperId);

        String first = DB.getData();

        if (first.equals("|ND|")) {
            return null;
        }

        return new Camper(Integer.parseInt(first), Integer.parseInt(DB.getData()), DB.getData());
    }
}
