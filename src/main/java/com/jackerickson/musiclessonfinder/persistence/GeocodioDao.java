package com.jackerickson.musiclessonfinder.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.geocodio.GeocodioResponse;
import com.geocodio.Location;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

public class GeocodioDao {

    private final String apiKey;

    public GeocodioDao(String apiKey) {
        this.apiKey = apiKey;
    }

    public Location getCoordinates(String zipCode) {
        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("https://api.geocod.io/v2/geocode")
                .queryParam("q", zipCode)
                .queryParam("api_key", apiKey);

        String response = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);

        ObjectMapper mapper = new ObjectMapper();

        GeocodioResponse geocodioResponse = null;

        try {
            geocodioResponse = mapper.readValue(response, GeocodioResponse.class);
        } catch (JsonProcessingException e) {
            // TODO set up log4J
            throw new RuntimeException(e);
        }
        return geocodioResponse.getResults().get(0).getLocation();
    }
}
