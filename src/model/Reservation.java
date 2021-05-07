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
    // TODO: find discount percentage from customerId
    public static boolean addReservation(int customerId, int camperId, int discountPercentage, String reservationStartDate, String reservationEndDate) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO tbl_reservations (fld_customer_id, fld_camper_id, fld_discount_percentage, fld_reservation_start_date, fld_reservation_end_date) VALUES (");
        sb.append(customerId);
        sb.append(", ");
        sb.append(camperId);
        sb.append(", ");
        sb.append(discountPercentage);
        sb.append(", '");
        sb.append(reservationStartDate);
        sb.append("', '");
        sb.append(reservationEndDate);
        sb.append("')");
        DB.insertSQL(sb.toString());
        return true;
    }
}
