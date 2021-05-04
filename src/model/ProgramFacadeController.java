package model;

/**
 * This class acts as a root controller for the UI controllers. This class receives
 * messages from the UI layer and performs checks and validation before delegating the
 * requests to the domain classes.
 */
public class ProgramFacadeController {
    private static ProgramFacadeController instance;
    private ReservationDao reservationDao;


    private ProgramFacadeController(){
        reservationDao = new ReservationDaoImpl();
    }

    public static ProgramFacadeController getInstance(){
        if(instance == null){
             instance = new ProgramFacadeController();
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
