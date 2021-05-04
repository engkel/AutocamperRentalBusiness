package model;

public class ProgramLogic {
    private static ProgramLogic instance;
    private ReservationDao reservationDao;


    private ProgramLogic(){
        reservationDao = new ReservationDaoImpl();
    }

    public static ProgramLogic getInstance(){
        if(instance == null){
             instance = new ProgramLogic();
        }
        return instance;
    }


    public void createReservation(long startDate, long endDate, int autocamperId) {
        // we could use the ReservationDaoImpl to insert into the database, but this works fine too

        if(Reservation.checkAvailability(startDate,endDate,autocamperId))
        {
            Reservation.addReservation(startDate,endDate,autocamperId);
        }
    }
}
