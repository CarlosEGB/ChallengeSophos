package com.challenge.rest.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Esta clase de utilidad, nos permite obtener el Token y Url de la API del data.properties.
 *
 * @author Carlos Garcia
 */
public class Utilities {

    private final Properties properties = new Properties();

    private void getDataProperties() {
        try {
            properties.load(new FileReader("src/test/resources/com/challenge/rest/data/data.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAccessToken() {
        this.getDataProperties();
        return properties.getProperty("AccessToken");
    }

    public String getUrlApi() {
        this.getDataProperties();
        return properties.getProperty("UrlApi");
    }
}
