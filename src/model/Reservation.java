package model;

public class Reservation {
    /**
     * Checks whether or not there already is a booking that
     * overlaps with a given time period and caravan.
     * @param startTime Timestamp in Unix Epoch for when the booking starts
     * @param endTime Timestamp in Unix Epoch for when the booking ends
     * @param caravanId The ID of the caravan to check the availability of
     * @return Boolean, true means the caravan is available in the given time period, false means not available.
     */
    public static boolean checkAvailability(long startTime, long endTime, int caravanId){
        DB.selectSQL("SELECT ANY(*) FROM reservations WHERE fld_reservation_start_date < " + endTime + " && fld_reservation_end_date > " + startTime + " && fld_camper_id = " + caravanId);

        if (DB.getData().equals("true")) {
            DB.clearData();
            return false;
        }

        DB.clearData();
        return true;
    }


    /**
     * Will add a reservation to the database. This method WILL NOT generate
     * deposits, insurance nor
     * @return Boolean, true if the reservation was successfully added.
     */
    public static boolean addReservation(long startTime, long endTime, int caravanId) {

        //DB.insertSQL("INSERT INTO ");
        return true;
    }
}
