/*
 * Amazon Honeycode
 *  Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals, resources, and even your team. 
 *
 * The version of the OpenAPI document: 2020-03-01
 * Contact: mike.ralphson@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BatchCreateTableRowsRequest;
import org.openapitools.client.model.BatchCreateTableRowsResult;
import org.openapitools.client.model.BatchDeleteTableRowsRequest;
import org.openapitools.client.model.BatchDeleteTableRowsResult;
import org.openapitools.client.model.BatchUpdateTableRowsRequest;
import org.openapitools.client.model.BatchUpdateTableRowsResult;
import org.openapitools.client.model.BatchUpsertTableRowsRequest;
import org.openapitools.client.model.BatchUpsertTableRowsResult;
import org.openapitools.client.model.DescribeTableDataImportJobResult;
import org.openapitools.client.model.GetScreenDataRequest;
import org.openapitools.client.model.GetScreenDataResult;
import org.openapitools.client.model.InvokeScreenAutomationRequest;
import org.openapitools.client.model.InvokeScreenAutomationResult;
import org.openapitools.client.model.ListTableColumnsResult;
import org.openapitools.client.model.ListTableRowsRequest;
import org.openapitools.client.model.ListTableRowsResult;
import org.openapitools.client.model.ListTablesResult;
import org.openapitools.client.model.ListTagsForResourceResult;
import org.openapitools.client.model.QueryTableRowsRequest;
import org.openapitools.client.model.QueryTableRowsResult;
import org.openapitools.client.model.StartTableDataImportJobRequest;
import org.openapitools.client.model.StartTableDataImportJobResult;
import org.openapitools.client.model.TagResourceRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * &lt;p&gt; The BatchCreateTableRows API allows you to create one or more rows at the end of a table in a workbook. The API allows you to specify the values to set in some or all of the columns in the new rows. &lt;/p&gt; &lt;p&gt; If a column is not explicitly set in a specific row, then the column level formula specified in the table will be applied to the new row. If there is no column level formula but the last row of the table has a formula, then that formula will be copied down to the new row. If there is no column level formula and no formula in the last row of the table, then that column will be left blank for the new rows. &lt;/p&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchCreateTableRowsTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        BatchCreateTableRowsRequest batchCreateTableRowsRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        BatchCreateTableRowsResult response = api.batchCreateTableRows(workbookId, tableId, batchCreateTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The BatchDeleteTableRows API allows you to delete one or more rows from a table in a workbook. You need to specify the ids of the rows that you want to delete from the table. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchDeleteTableRowsTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        BatchDeleteTableRowsRequest batchDeleteTableRowsRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        BatchDeleteTableRowsResult response = api.batchDeleteTableRows(workbookId, tableId, batchDeleteTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     * &lt;p&gt; The BatchUpdateTableRows API allows you to update one or more rows in a table in a workbook. &lt;/p&gt; &lt;p&gt; You can specify the values to set in some or all of the columns in the table for the specified rows. If a column is not explicitly specified in a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (\&quot;\&quot;). &lt;/p&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchUpdateTableRowsTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        BatchUpdateTableRowsRequest batchUpdateTableRowsRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        BatchUpdateTableRowsResult response = api.batchUpdateTableRows(workbookId, tableId, batchUpdateTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     * &lt;p&gt; The BatchUpsertTableRows API allows you to upsert one or more rows in a table. The upsert operation takes a filter expression as input and evaluates it to find matching rows on the destination table. If matching rows are found, it will update the cells in the matching rows to new values specified in the request. If no matching rows are found, a new row is added at the end of the table and the cells in that row are set to the new values specified in the request. &lt;/p&gt; &lt;p&gt; You can specify the values to set in some or all of the columns in the table for the matching or newly appended rows. If a column is not explicitly specified for a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (\&quot;\&quot;). &lt;/p&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchUpsertTableRowsTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        BatchUpsertTableRowsRequest batchUpsertTableRowsRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        BatchUpsertTableRowsResult response = api.batchUpsertTableRows(workbookId, tableId, batchUpsertTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The DescribeTableDataImportJob API allows you to retrieve the status and details of a table data import job. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void describeTableDataImportJobTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        String jobId = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        DescribeTableDataImportJobResult response = api.describeTableDataImportJob(workbookId, tableId, jobId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local variables in the screen to filter, sort or otherwise affect what will be displayed on the screen. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScreenDataTest() throws ApiException {
        GetScreenDataRequest getScreenDataRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        GetScreenDataResult response = api.getScreenData(getScreenDataRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows setting local variables, which can then be used in the automation being invoked. This allows automating the Honeycode app interactions to write, update or delete data in the workbook. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invokeScreenAutomationTest() throws ApiException {
        String workbookId = null;
        String appId = null;
        String screenId = null;
        String automationId = null;
        InvokeScreenAutomationRequest invokeScreenAutomationRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        InvokeScreenAutomationResult response = api.invokeScreenAutomation(workbookId, appId, screenId, automationId, invokeScreenAutomationRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The ListTableColumns API allows you to retrieve a list of all the columns in a table in a workbook. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTableColumnsTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        String nextToken = null;
        ListTableColumnsResult response = api.listTableColumns(workbookId, tableId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, nextToken);
        // TODO: test validations
    }

    /**
     *  The ListTableRows API allows you to retrieve a list of all the rows in a table in a workbook. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTableRowsTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        ListTableRowsRequest listTableRowsRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        String maxResults = null;
        String nextToken = null;
        ListTableRowsResult response = api.listTableRows(workbookId, tableId, listTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken);
        // TODO: test validations
    }

    /**
     *  The ListTables API allows you to retrieve a list of all the tables in a workbook. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTablesTest() throws ApiException {
        String workbookId = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        Integer maxResults = null;
        String nextToken = null;
        ListTablesResult response = api.listTables(workbookId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken);
        // TODO: test validations
    }

    /**
     *  The ListTagsForResource API allows you to return a resource&#39;s tags. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTagsForResourceTest() throws ApiException {
        String resourceArn = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        ListTagsForResourceResult response = api.listTagsForResource(resourceArn, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The QueryTableRows API allows you to use a filter formula to query for specific rows in a table. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryTableRowsTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        QueryTableRowsRequest queryTableRowsRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        String maxResults = null;
        String nextToken = null;
        QueryTableRowsResult response = api.queryTableRows(workbookId, tableId, queryTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken);
        // TODO: test validations
    }

    /**
     *  The StartTableDataImportJob API allows you to start an import job on a table. This API will only return the id of the job that was started. To find out the status of the import request, you need to call the DescribeTableDataImportJob API. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void startTableDataImportJobTest() throws ApiException {
        String workbookId = null;
        String tableId = null;
        StartTableDataImportJobRequest startTableDataImportJobRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        StartTableDataImportJobResult response = api.startTableDataImportJob(workbookId, tableId, startTableDataImportJobRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The TagResource API allows you to add tags to an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tagResourceTest() throws ApiException {
        String resourceArn = null;
        TagResourceRequest tagResourceRequest = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        Object response = api.tagResource(resourceArn, tagResourceRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

    /**
     *  The UntagResource API allows you to removes tags from an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void untagResourceTest() throws ApiException {
        String resourceArn = null;
        List<String> tagKeys = null;
        String xAmzContentSha256 = null;
        String xAmzDate = null;
        String xAmzAlgorithm = null;
        String xAmzCredential = null;
        String xAmzSecurityToken = null;
        String xAmzSignature = null;
        String xAmzSignedHeaders = null;
        Object response = api.untagResource(resourceArn, tagKeys, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
        // TODO: test validations
    }

}
