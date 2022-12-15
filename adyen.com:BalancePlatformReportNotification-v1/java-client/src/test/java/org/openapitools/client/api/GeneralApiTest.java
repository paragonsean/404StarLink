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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BalancePlatformNotificationResponse;
import org.openapitools.client.model.ReportNotificationRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralApi
 */
@Disabled
public class GeneralApiTest {

    private final GeneralApi api = new GeneralApi();

    /**
     * Report generated
     *
     * Adyen sends this webhook after a report is generated and ready to be downloaded. The webhook contains the URL at which the report can be downloaded.  Before you download reports, ask your Adyen contact for your report credentials. You must use your the credentials to authenticate your GET request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postBalancePlatformReportCreatedTest() throws ApiException {
        ReportNotificationRequest reportNotificationRequest = null;
        BalancePlatformNotificationResponse response = api.postBalancePlatformReportCreated(reportNotificationRequest);
        // TODO: test validations
    }

}
