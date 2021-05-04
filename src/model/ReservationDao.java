package model;

public interface ReservationDao {
    Reservation getReservation(int reservationId);
    void updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
    void insertReservation(Reservation reservation);
}
