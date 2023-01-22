/*
 * Open States API v3
 *  * [More documentation](https://docs.openstates.org/en/latest/api/v3/index.html) * [Register for an account](https://openstates.org/accounts/signup/)   **We are currently working to restore experimental support for committees & events.**  During this period please note that data is not yet available for all states and the exact format of the new endpoints may change slightly depending on user feedback.  If you have any issues or questions use our [GitHub Issues](https://github.com/openstates/issues/issues) to give feedback. 
 *
 * The version of the OpenAPI document: 2021.11.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Bill;
import org.openapitools.client.model.BillInclude;
import org.openapitools.client.model.BillList;
import org.openapitools.client.model.BillSortOption;
import org.openapitools.client.model.HTTPValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillsApi
 */
@Disabled
public class BillsApiTest {

    private final BillsApi api = new BillsApi();

    /**
     * Bill Detail
     *
     * Obtain bill information based on (state, session, bill_id).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void billDetailBillsJurisdictionSessionBillIdGetTest() throws ApiException {
        String jurisdiction = null;
        String session = null;
        String billId = null;
        List<BillInclude> include = null;
        String apikey = null;
        String xApiKey = null;
        Bill response = api.billDetailBillsJurisdictionSessionBillIdGet(jurisdiction, session, billId, include, apikey, xApiKey);
        // TODO: test validations
    }

    /**
     * Bill Detail By Id
     *
     * Obtain bill information by internal ID in the format ocd-bill/_*uuid*.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void billDetailByIdBillsOcdBillOpenstatesBillIdGetTest() throws ApiException {
        String openstatesBillId = null;
        List<BillInclude> include = null;
        String apikey = null;
        String xApiKey = null;
        Bill response = api.billDetailByIdBillsOcdBillOpenstatesBillIdGet(openstatesBillId, include, apikey, xApiKey);
        // TODO: test validations
    }

    /**
     * Bills Search
     *
     * Search for bills matching given criteria.  Must either specify a jurisdiction or a full text query (q).  Additional parameters will futher restrict bills returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void billsSearchBillsGetTest() throws ApiException {
        String jurisdiction = null;
        String session = null;
        String chamber = null;
        List<String> identifier = null;
        String classification = null;
        List<String> subject = null;
        String updatedSince = null;
        String createdSince = null;
        String actionSince = null;
        BillSortOption sort = null;
        String sponsor = null;
        String sponsorClassification = null;
        String q = null;
        List<BillInclude> include = null;
        Integer page = null;
        Integer perPage = null;
        String apikey = null;
        String xApiKey = null;
        BillList response = api.billsSearchBillsGet(jurisdiction, session, chamber, identifier, classification, subject, updatedSince, createdSince, actionSince, sort, sponsor, sponsorClassification, q, include, page, perPage, apikey, xApiKey);
        // TODO: test validations
    }

}
