/*
 * Cloud Translation API
 * Integrates text translation into your website or application.
 *
 * The version of the OpenAPI document: v3beta1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BatchTranslateDocumentRequest;
import org.openapitools.client.model.BatchTranslateTextRequest;
import org.openapitools.client.model.DetectLanguageRequest;
import org.openapitools.client.model.DetectLanguageResponse;
import org.openapitools.client.model.Glossary;
import org.openapitools.client.model.ListGlossariesResponse;
import org.openapitools.client.model.ListLocationsResponse;
import org.openapitools.client.model.ListOperationsResponse;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.SupportedLanguages;
import org.openapitools.client.model.TranslateDocumentRequest;
import org.openapitools.client.model.TranslateDocumentResponse;
import org.openapitools.client.model.TranslateTextRequest;
import org.openapitools.client.model.TranslateTextResponse;
import org.openapitools.client.model.WaitOperationRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Disabled
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    /**
     * Translates a large volume of document in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial results (for an input file, it&#39;s all or nothing) may still be available on the specified output location. This call returns immediately and you can use google.longrunning.Operation.name to poll the status of the call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsBatchTranslateDocumentTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        BatchTranslateDocumentRequest batchTranslateDocumentRequest = null;
        Operation response = api.translateProjectsLocationsBatchTranslateDocument(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, batchTranslateDocumentRequest);
        // TODO: test validations
    }

    /**
     * Translates a large volume of text in asynchronous batch mode. This function provides real-time output as the inputs are being processed. If caller cancels a request, the partial results (for an input file, it&#39;s all or nothing) may still be available on the specified output location. This call returns immediately and you can use google.longrunning.Operation.name to poll the status of the call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsBatchTranslateTextTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        BatchTranslateTextRequest batchTranslateTextRequest = null;
        Operation response = api.translateProjectsLocationsBatchTranslateText(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, batchTranslateTextRequest);
        // TODO: test validations
    }

    /**
     * Detects the language of text within a request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsDetectLanguageTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        DetectLanguageRequest detectLanguageRequest = null;
        DetectLanguageResponse response = api.translateProjectsLocationsDetectLanguage(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, detectLanguageRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of supported languages for translation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsGetSupportedLanguagesTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String displayLanguageCode = null;
        String model = null;
        SupportedLanguages response = api.translateProjectsLocationsGetSupportedLanguages(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, displayLanguageCode, model);
        // TODO: test validations
    }

    /**
     * Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project doesn&#39;t exist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsGlossariesCreateTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Glossary glossary = null;
        Operation response = api.translateProjectsLocationsGlossariesCreate(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, glossary);
        // TODO: test validations
    }

    /**
     * Lists glossaries in a project. Returns NOT_FOUND, if the project doesn&#39;t exist.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsGlossariesListTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ListGlossariesResponse response = api.translateProjectsLocationsGlossariesList(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Lists information about the supported locations for this service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ListLocationsResponse response = api.translateProjectsLocationsList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn&#39;t support this method, it returns &#x60;google.rpc.Code.UNIMPLEMENTED&#x60;. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to &#x60;Code.CANCELLED&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsOperationsCancelTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Object body = null;
        Object response = api.translateProjectsLocationsOperationsCancel(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, body);
        // TODO: test validations
    }

    /**
     * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn&#39;t support this method, it returns &#x60;google.rpc.Code.UNIMPLEMENTED&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsOperationsDeleteTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Object response = api.translateProjectsLocationsOperationsDelete(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType);
        // TODO: test validations
    }

    /**
     * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsOperationsGetTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        Operation response = api.translateProjectsLocationsOperationsGet(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType);
        // TODO: test validations
    }

    /**
     * Lists operations that match the specified filter in the request. If the server doesn&#39;t support this method, it returns &#x60;UNIMPLEMENTED&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsOperationsListTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ListOperationsResponse response = api.translateProjectsLocationsOperationsList(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, filter, pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Waits until the specified long-running operation is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it returns &#x60;google.rpc.Code.UNIMPLEMENTED&#x60;. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately), meaning even an immediate response is no guarantee that the operation is done.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsOperationsWaitTest() throws ApiException {
        String name = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        WaitOperationRequest waitOperationRequest = null;
        Operation response = api.translateProjectsLocationsOperationsWait(name, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, waitOperationRequest);
        // TODO: test validations
    }

    /**
     * Translates documents in synchronous mode.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsTranslateDocumentTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        TranslateDocumentRequest translateDocumentRequest = null;
        TranslateDocumentResponse response = api.translateProjectsLocationsTranslateDocument(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, translateDocumentRequest);
        // TODO: test validations
    }

    /**
     * Translates input text and returns translated text.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateProjectsLocationsTranslateTextTest() throws ApiException {
        String parent = null;
        String $xgafv = null;
        String accessToken = null;
        String alt = null;
        String paramCallback = null;
        String fields = null;
        String key = null;
        String oauthToken = null;
        Boolean prettyPrint = null;
        String quotaUser = null;
        String uploadProtocol = null;
        String uploadType = null;
        TranslateTextRequest translateTextRequest = null;
        TranslateTextResponse response = api.translateProjectsLocationsTranslateText(parent, $xgafv, accessToken, alt, paramCallback, fields, key, oauthToken, prettyPrint, quotaUser, uploadProtocol, uploadType, translateTextRequest);
        // TODO: test validations
    }

}
