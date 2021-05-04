package model;

public class ReservationDaoImpl implements ReservationDao{

    public ReservationDaoImpl(){

    }

    @Override
    public Reservation getReservation(int reservationId) {
        // query DB
        // if found, create new reservation object initialized with the id, start date, and end date
        // return new reservation object

        // return null if the reservation does not exist
        return null;
    }

    @Override
    public void updateReservation(Reservation reservation) {
        // code to update an existing reservation in DB
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        // code to delete and existing reservation in DB
    }

    @Override
    public void insertReservation(Reservation reservation) {
        // code to insert a reservation into DB
    }
}
