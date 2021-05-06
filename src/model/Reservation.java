package model;

public class Reservation {
    private int id;
    private long startDate;
    private long endDate;

    public Reservation(int id, long startDate, long endDate) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Checks whether or not there already is a booking that
     * overlaps with a given time period and caravan.
     * @param startTime Timestamp in Unix Epoch for when the booking starts
     * @param endTime Timestamp in Unix Epoch for when the booking ends
     * @param caravanId The ID of the caravan to check the availability of
     * @return Boolean, true means the caravan is available in the given time period, false means not available.
     */
    public static boolean checkAvailability(String startTime, String endTime, int caravanId) {
        DB.selectSQL("SELECT COUNT(*) FROM tbl_reservations WHERE fld_reservation_start_date < '" + endTime + "' AND fld_reservation_end_date > '" + startTime + "' AND fld_camper_id = " + caravanId);

        if (!DB.getData().equals("0")) {
            DB.clearData();
            return false; // Not available
        }

        DB.clearData();
        return true; // Available
    }


    /**
     * Will add a reservation to the database. This method WILL NOT generate
     * deposits, insurance nor
     * @return Boolean, true if the reservation was successfully added.
     */
    public static boolean addReservation(String startTime, String endTime, int caravanId) {

        //DB.insertSQL("INSERT INTO ");
        return true;
    }
}
