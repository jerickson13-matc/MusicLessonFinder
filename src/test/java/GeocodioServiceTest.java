import org.junit.jupiter.api.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.jackerickson.musiclessonfinder.util.PropertiesLoader;
import java.util.Properties;

public class GeocodioServiceTest implements PropertiesLoader{

    @Test
    public void testGeocodioJSON() throws Exception {
        Properties properties = loadProperties("/geocodio.properties");
        String apiKey = properties.getProperty("geocodio.api.key");
        Integer zipcode = 53703;

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.geocod.io/v2/geocode?q=" + zipcode + "&api_key=" + apiKey);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        assertEquals("???", response);
    }
}
