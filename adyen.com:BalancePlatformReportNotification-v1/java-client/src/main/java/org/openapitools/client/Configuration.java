/*
 * Report webhooks
 * Adyen sends notifications through webhooks to inform your system that reports were generated and are ready to be downloaded.  You can download reports programmatically by making an HTTP GET request, or manually from your [Balance Platform Customer Area](https://balanceplatform-test.adyen.com/balanceplatform).
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-11T01:58:02.753478-04:00[America/New_York]", comments = "Generator version: 7.9.0")
public class Configuration {
    public static final String VERSION = "1";

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
