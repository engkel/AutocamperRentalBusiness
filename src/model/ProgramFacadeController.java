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
     * Creates a reservation
     * @param customerId id of customer
     * @param camperId id of autocamper
     * @param discountPercentage customer discount percentage
     * @param reservationStartDate date string
     * @param reservationEndDate date string
     */
    public void createReservation(int customerId, int camperId, int discountPercentage, String reservationStartDate, String reservationEndDate) {
        if(Reservation.checkAvailability(reservationStartDate,reservationEndDate,camperId))
        {
            Reservation.addReservation(
                    customerId,
                    camperId,
                    discountPercentage,
                    reservationStartDate,
                    reservationEndDate
            );
        }
    }
}
