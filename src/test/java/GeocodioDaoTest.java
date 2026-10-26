import com.geocodio.Location;
import com.jackerickson.musiclessonfinder.persistence.GeocodioDao;
import org.junit.jupiter.api.Test;
import com.jackerickson.musiclessonfinder.util.PropertiesLoader;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class GeocodioDaoTest implements PropertiesLoader{

    @Test
    public void testGeocodioJSON() throws Exception {
        Properties properties = loadProperties("/geocodio.properties");
        String apiKey = properties.getProperty("geocodio.api.key");

        String zipCodeTest = "53703";
        double expectedLat = 43.079575;
        double expectedLng = -89.378389;

        GeocodioDao dao = new GeocodioDao(apiKey);

        Location location = dao.getCoordinates(zipCodeTest);

        assertNotNull(location);
        assertEquals(expectedLat, location.getLat());
        assertEquals(expectedLng, location.getLng());
    }
}
