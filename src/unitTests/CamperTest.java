package unitTests;

import model.Camper;
import org.junit.jupiter.api.Assertions;

class CamperTest {

    @org.junit.jupiter.api.Test
    void checkAvailability() {
        // Getting an autocamper that does not exist.
        Assertions.assertNull(Camper.getCamper(9999999));

        // Getting a test autocamper
        Camper camper = Camper.getCamper(1);

        Assertions.assertEquals(1, camper.camperId);
        Assertions.assertEquals(1, camper.camperType);
        Assertions.assertEquals("Test Model 2", camper.vehicleModel);

    }
}