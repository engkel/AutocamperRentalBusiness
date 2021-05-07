package unitTests;

import model.Reservation;
import org.junit.jupiter.api.Assertions;

class ReservationTest {

    @org.junit.jupiter.api.Test
    void checkAvailability() {
        // Not Available
        Assertions.assertEquals(false, Reservation.checkAvailability("2020-12-30", "2021-01-30", 1));

        // Available
        Assertions.assertEquals(true, Reservation.checkAvailability("2020-11-01", "2020-11-30", 1));
    }
}