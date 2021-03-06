package model;


/**
 * This interface defines the standard operations to be performed on
 * a reservation object. Note that each implementor can implement all
 * these methods in their own ways.
 */
public interface ReservationDao {
    Reservation getReservation(int reservationId);
    void updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
    void insertReservation(Reservation reservation);
}
