package model;

/**
 * This class acts as a singleton root controller for the UI controllers. This class
 * receives messages from the UI layer and performs checks and validation before delegating the
 * requests to the domain classes.
 */
public class ProgramFacadeController {
    private static ProgramFacadeController instance;
    private ReservationDao reservationDao;

    /**
     * Constructor used to initialize DAOs and other necessary requirements
     * for the facade controller
     */
    private ProgramFacadeController(){
        reservationDao = new ReservationDaoImpl();
    }

    /**
     * Standard method for obtaining the singleton instance
     * @return the singleton instance
     */
    public static ProgramFacadeController getInstance(){
        if(instance == null){
             instance = new ProgramFacadeController();
        }
        return instance;
    }

    /**
     * Creates the reservation.
     * @param startTime Timestamp in Unix Epoch for when the booking starts
     * @param endTime Timestamp in Unix Epoch for when the booking ends
     * @param caravanId The ID of the caravan to check the availability of
     */
    public void createReservation(String startTime, String endTime, int caravanId) {
        // we could use the ReservationDaoImpl to insert into the database, but this works fine too

        if(Reservation.checkAvailability(startTime,endTime,caravanId))
        {
            //Reservation.addReservation(startTime,endTime,caravanId);
        }
    }
}
