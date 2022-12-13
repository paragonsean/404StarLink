/*
 * NeoWs - (Near Earth Object Web Service)
 * A web service for near earth objects. All the data is from the <a href=\"http://neo.jpl.nasa.gov/\" target=\"_blank\">NASA JPL Asteroid team</a>.      NeoWs is proud to power AsteroidTracker on <a href=\"https://itunes.apple.com/us/app/asteroid-tracker/id689684901?mt=8\" target=\"_blank\">iOS</a> and <a href=\"https://play.google.com/store/apps/details?id=com.vitruviussoftware.bunifish.asteroidtracker&feature\" target=\"_blank\">Android</a> as well as related apps.    Follow us on <a href=\"https://twitter.com/AsteroidTracker\" target=\"_blank\">Twitter</a>
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:57:58.034595-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Configuration {
    public static final String VERSION = "1.0";

    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
