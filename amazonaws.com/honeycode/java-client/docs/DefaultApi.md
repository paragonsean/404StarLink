# DefaultApi

All URIs are relative to *http://honeycode.us-east-1.amazonaws.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchCreateTableRows**](DefaultApi.md#batchCreateTableRows) | **POST** /workbooks/{workbookId}/tables/{tableId}/rows/batchcreate |  |
| [**batchDeleteTableRows**](DefaultApi.md#batchDeleteTableRows) | **POST** /workbooks/{workbookId}/tables/{tableId}/rows/batchdelete |  |
| [**batchUpdateTableRows**](DefaultApi.md#batchUpdateTableRows) | **POST** /workbooks/{workbookId}/tables/{tableId}/rows/batchupdate |  |
| [**batchUpsertTableRows**](DefaultApi.md#batchUpsertTableRows) | **POST** /workbooks/{workbookId}/tables/{tableId}/rows/batchupsert |  |
| [**describeTableDataImportJob**](DefaultApi.md#describeTableDataImportJob) | **GET** /workbooks/{workbookId}/tables/{tableId}/import/{jobId} |  |
| [**getScreenData**](DefaultApi.md#getScreenData) | **POST** /screendata |  |
| [**invokeScreenAutomation**](DefaultApi.md#invokeScreenAutomation) | **POST** /workbooks/{workbookId}/apps/{appId}/screens/{screenId}/automations/{automationId} |  |
| [**listTableColumns**](DefaultApi.md#listTableColumns) | **GET** /workbooks/{workbookId}/tables/{tableId}/columns |  |
| [**listTableRows**](DefaultApi.md#listTableRows) | **POST** /workbooks/{workbookId}/tables/{tableId}/rows/list |  |
| [**listTables**](DefaultApi.md#listTables) | **GET** /workbooks/{workbookId}/tables |  |
| [**listTagsForResource**](DefaultApi.md#listTagsForResource) | **GET** /tags/{resourceArn} |  |
| [**queryTableRows**](DefaultApi.md#queryTableRows) | **POST** /workbooks/{workbookId}/tables/{tableId}/rows/query |  |
| [**startTableDataImportJob**](DefaultApi.md#startTableDataImportJob) | **POST** /workbooks/{workbookId}/tables/{tableId}/import |  |
| [**tagResource**](DefaultApi.md#tagResource) | **POST** /tags/{resourceArn} |  |
| [**untagResource**](DefaultApi.md#untagResource) | **DELETE** /tags/{resourceArn}#tagKeys |  |


<a id="batchCreateTableRows"></a>
# **batchCreateTableRows**
> BatchCreateTableRowsResult batchCreateTableRows(workbookId, tableId, batchCreateTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



&lt;p&gt; The BatchCreateTableRows API allows you to create one or more rows at the end of a table in a workbook. The API allows you to specify the values to set in some or all of the columns in the new rows. &lt;/p&gt; &lt;p&gt; If a column is not explicitly set in a specific row, then the column level formula specified in the table will be applied to the new row. If there is no column level formula but the last row of the table has a formula, then that formula will be copied down to the new row. If there is no column level formula and no formula in the last row of the table, then that column will be left blank for the new rows. &lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook where the new rows are being added.</p> <p> If a workbook with the specified ID could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table where the new rows are being added.</p> <p> If a table with the specified ID could not be found, this API throws ResourceNotFoundException. </p>
    BatchCreateTableRowsRequest batchCreateTableRowsRequest = new BatchCreateTableRowsRequest(); // BatchCreateTableRowsRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      BatchCreateTableRowsResult result = apiInstance.batchCreateTableRows(workbookId, tableId, batchCreateTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#batchCreateTableRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook where the new rows are being added.&lt;/p&gt; &lt;p&gt; If a workbook with the specified ID could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table where the new rows are being added.&lt;/p&gt; &lt;p&gt; If a table with the specified ID could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **batchCreateTableRowsRequest** | [**BatchCreateTableRowsRequest**](BatchCreateTableRowsRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**BatchCreateTableRowsResult**](BatchCreateTableRowsResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceQuotaExceededException |  -  |
| **485** | ServiceUnavailableException |  -  |
| **486** | ThrottlingException |  -  |
| **487** | ValidationException |  -  |

<a id="batchDeleteTableRows"></a>
# **batchDeleteTableRows**
> BatchDeleteTableRowsResult batchDeleteTableRows(workbookId, tableId, batchDeleteTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The BatchDeleteTableRows API allows you to delete one or more rows from a table in a workbook. You need to specify the ids of the rows that you want to delete from the table. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook where the rows are being deleted.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table where the rows are being deleted.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    BatchDeleteTableRowsRequest batchDeleteTableRowsRequest = new BatchDeleteTableRowsRequest(); // BatchDeleteTableRowsRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      BatchDeleteTableRowsResult result = apiInstance.batchDeleteTableRows(workbookId, tableId, batchDeleteTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#batchDeleteTableRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook where the rows are being deleted.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table where the rows are being deleted.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **batchDeleteTableRowsRequest** | [**BatchDeleteTableRowsRequest**](BatchDeleteTableRowsRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**BatchDeleteTableRowsResult**](BatchDeleteTableRowsResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | ResourceNotFoundException |  -  |
| **483** | ServiceUnavailableException |  -  |
| **484** | ValidationException |  -  |
| **485** | RequestTimeoutException |  -  |
| **486** | ThrottlingException |  -  |

<a id="batchUpdateTableRows"></a>
# **batchUpdateTableRows**
> BatchUpdateTableRowsResult batchUpdateTableRows(workbookId, tableId, batchUpdateTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



&lt;p&gt; The BatchUpdateTableRows API allows you to update one or more rows in a table in a workbook. &lt;/p&gt; &lt;p&gt; You can specify the values to set in some or all of the columns in the table for the specified rows. If a column is not explicitly specified in a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (\&quot;\&quot;). &lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook where the rows are being updated.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table where the rows are being updated.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    BatchUpdateTableRowsRequest batchUpdateTableRowsRequest = new BatchUpdateTableRowsRequest(); // BatchUpdateTableRowsRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      BatchUpdateTableRowsResult result = apiInstance.batchUpdateTableRows(workbookId, tableId, batchUpdateTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#batchUpdateTableRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook where the rows are being updated.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table where the rows are being updated.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **batchUpdateTableRowsRequest** | [**BatchUpdateTableRowsRequest**](BatchUpdateTableRowsRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**BatchUpdateTableRowsResult**](BatchUpdateTableRowsResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | ResourceNotFoundException |  -  |
| **483** | ServiceUnavailableException |  -  |
| **484** | ValidationException |  -  |
| **485** | RequestTimeoutException |  -  |
| **486** | ThrottlingException |  -  |

<a id="batchUpsertTableRows"></a>
# **batchUpsertTableRows**
> BatchUpsertTableRowsResult batchUpsertTableRows(workbookId, tableId, batchUpsertTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



&lt;p&gt; The BatchUpsertTableRows API allows you to upsert one or more rows in a table. The upsert operation takes a filter expression as input and evaluates it to find matching rows on the destination table. If matching rows are found, it will update the cells in the matching rows to new values specified in the request. If no matching rows are found, a new row is added at the end of the table and the cells in that row are set to the new values specified in the request. &lt;/p&gt; &lt;p&gt; You can specify the values to set in some or all of the columns in the table for the matching or newly appended rows. If a column is not explicitly specified for a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (\&quot;\&quot;). &lt;/p&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook where the rows are being upserted.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table where the rows are being upserted.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    BatchUpsertTableRowsRequest batchUpsertTableRowsRequest = new BatchUpsertTableRowsRequest(); // BatchUpsertTableRowsRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      BatchUpsertTableRowsResult result = apiInstance.batchUpsertTableRows(workbookId, tableId, batchUpsertTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#batchUpsertTableRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook where the rows are being upserted.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table where the rows are being upserted.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **batchUpsertTableRowsRequest** | [**BatchUpsertTableRowsRequest**](BatchUpsertTableRowsRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**BatchUpsertTableRowsResult**](BatchUpsertTableRowsResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceQuotaExceededException |  -  |
| **485** | ServiceUnavailableException |  -  |
| **486** | ThrottlingException |  -  |
| **487** | ValidationException |  -  |

<a id="describeTableDataImportJob"></a>
# **describeTableDataImportJob**
> DescribeTableDataImportJobResult describeTableDataImportJob(workbookId, tableId, jobId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The DescribeTableDataImportJob API allows you to retrieve the status and details of a table data import job. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook into which data was imported.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table into which data was imported.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String jobId = "jobId_example"; // String | <p>The ID of the job that was returned by the StartTableDataImportJob request.</p> <p> If a job with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      DescribeTableDataImportJobResult result = apiInstance.describeTableDataImportJob(workbookId, tableId, jobId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#describeTableDataImportJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook into which data was imported.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table into which data was imported.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **jobId** | **String**| &lt;p&gt;The ID of the job that was returned by the StartTableDataImportJob request.&lt;/p&gt; &lt;p&gt; If a job with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**DescribeTableDataImportJobResult**](DescribeTableDataImportJobResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | ResourceNotFoundException |  -  |
| **483** | ServiceUnavailableException |  -  |
| **484** | ThrottlingException |  -  |
| **485** | ValidationException |  -  |
| **486** | RequestTimeoutException |  -  |

<a id="getScreenData"></a>
# **getScreenData**
> GetScreenDataResult getScreenData(getScreenDataRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local variables in the screen to filter, sort or otherwise affect what will be displayed on the screen. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    GetScreenDataRequest getScreenDataRequest = new GetScreenDataRequest(); // GetScreenDataRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      GetScreenDataResult result = apiInstance.getScreenData(getScreenDataRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getScreenData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getScreenDataRequest** | [**GetScreenDataRequest**](GetScreenDataRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**GetScreenDataResult**](GetScreenDataResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceUnavailableException |  -  |
| **485** | ThrottlingException |  -  |
| **486** | ValidationException |  -  |

<a id="invokeScreenAutomation"></a>
# **invokeScreenAutomation**
> InvokeScreenAutomationResult invokeScreenAutomation(workbookId, appId, screenId, automationId, invokeScreenAutomationRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows setting local variables, which can then be used in the automation being invoked. This allows automating the Honeycode app interactions to write, update or delete data in the workbook. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | The ID of the workbook that contains the screen automation.
    String appId = "appId_example"; // String | The ID of the app that contains the screen automation.
    String screenId = "screenId_example"; // String | The ID of the screen that contains the screen automation.
    String automationId = "automationId_example"; // String | The ID of the automation action to be performed.
    InvokeScreenAutomationRequest invokeScreenAutomationRequest = new InvokeScreenAutomationRequest(); // InvokeScreenAutomationRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      InvokeScreenAutomationResult result = apiInstance.invokeScreenAutomation(workbookId, appId, screenId, automationId, invokeScreenAutomationRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#invokeScreenAutomation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| The ID of the workbook that contains the screen automation. | |
| **appId** | **String**| The ID of the app that contains the screen automation. | |
| **screenId** | **String**| The ID of the screen that contains the screen automation. | |
| **automationId** | **String**| The ID of the automation action to be performed. | |
| **invokeScreenAutomationRequest** | [**InvokeScreenAutomationRequest**](InvokeScreenAutomationRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**InvokeScreenAutomationResult**](InvokeScreenAutomationResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | ResourceNotFoundException |  -  |
| **483** | ValidationException |  -  |
| **484** | ThrottlingException |  -  |
| **485** | ServiceUnavailableException |  -  |
| **486** | AutomationExecutionException |  -  |
| **487** | AutomationExecutionTimeoutException |  -  |
| **488** | RequestTimeoutException |  -  |
| **489** | ServiceQuotaExceededException |  -  |

<a id="listTableColumns"></a>
# **listTableColumns**
> ListTableColumnsResult listTableColumns(workbookId, tableId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, nextToken)



 The ListTableColumns API allows you to retrieve a list of all the columns in a table in a workbook. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook that contains the table whose columns are being retrieved.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table whose columns are being retrieved.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    String nextToken = "nextToken_example"; // String | <p> This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p> <p> Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. </p>
    try {
      ListTableColumnsResult result = apiInstance.listTableColumns(workbookId, tableId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTableColumns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook that contains the table whose columns are being retrieved.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table whose columns are being retrieved.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **nextToken** | **String**| &lt;p&gt; This parameter is optional. If a nextToken is not specified, the API returns the first page of data. &lt;/p&gt; &lt;p&gt; Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. &lt;/p&gt; | [optional] |

### Return type

[**ListTableColumnsResult**](ListTableColumnsResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceUnavailableException |  -  |
| **485** | ThrottlingException |  -  |
| **486** | ValidationException |  -  |

<a id="listTableRows"></a>
# **listTableRows**
> ListTableRowsResult listTableRows(workbookId, tableId, listTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken)



 The ListTableRows API allows you to retrieve a list of all the rows in a table in a workbook. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook that contains the table whose rows are being retrieved.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table whose rows are being retrieved.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    ListTableRowsRequest listTableRowsRequest = new ListTableRowsRequest(); // ListTableRowsRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    String maxResults = "maxResults_example"; // String | Pagination limit
    String nextToken = "nextToken_example"; // String | Pagination token
    try {
      ListTableRowsResult result = apiInstance.listTableRows(workbookId, tableId, listTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTableRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook that contains the table whose rows are being retrieved.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table whose rows are being retrieved.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **listTableRowsRequest** | [**ListTableRowsRequest**](ListTableRowsRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **maxResults** | **String**| Pagination limit | [optional] |
| **nextToken** | **String**| Pagination token | [optional] |

### Return type

[**ListTableRowsResult**](ListTableRowsResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | ResourceNotFoundException |  -  |
| **483** | ServiceUnavailableException |  -  |
| **484** | ValidationException |  -  |
| **485** | RequestTimeoutException |  -  |
| **486** | ThrottlingException |  -  |

<a id="listTables"></a>
# **listTables**
> ListTablesResult listTables(workbookId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken)



 The ListTables API allows you to retrieve a list of all the tables in a workbook. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook whose tables are being retrieved.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    Integer maxResults = 56; // Integer | The maximum number of tables to return in each page of the results.
    String nextToken = "nextToken_example"; // String | <p> This parameter is optional. If a nextToken is not specified, the API returns the first page of data. </p> <p> Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. </p>
    try {
      ListTablesResult result = apiInstance.listTables(workbookId, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTables");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook whose tables are being retrieved.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **maxResults** | **Integer**| The maximum number of tables to return in each page of the results. | [optional] |
| **nextToken** | **String**| &lt;p&gt; This parameter is optional. If a nextToken is not specified, the API returns the first page of data. &lt;/p&gt; &lt;p&gt; Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. &lt;/p&gt; | [optional] |

### Return type

[**ListTablesResult**](ListTablesResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceUnavailableException |  -  |
| **485** | ThrottlingException |  -  |
| **486** | ValidationException |  -  |

<a id="listTagsForResource"></a>
# **listTagsForResource**
> ListTagsForResourceResult listTagsForResource(resourceArn, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The ListTagsForResource API allows you to return a resource&#39;s tags. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String resourceArn = "resourceArn_example"; // String | The resource's Amazon Resource Name (ARN).
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      ListTagsForResourceResult result = apiInstance.listTagsForResource(resourceArn, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTagsForResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceArn** | **String**| The resource&#39;s Amazon Resource Name (ARN). | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**ListTagsForResourceResult**](ListTagsForResourceResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceUnavailableException |  -  |
| **485** | ThrottlingException |  -  |
| **486** | ValidationException |  -  |

<a id="queryTableRows"></a>
# **queryTableRows**
> QueryTableRowsResult queryTableRows(workbookId, tableId, queryTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken)



 The QueryTableRows API allows you to use a filter formula to query for specific rows in a table. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook whose table rows are being queried.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table whose rows are being queried.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    QueryTableRowsRequest queryTableRowsRequest = new QueryTableRowsRequest(); // QueryTableRowsRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    String maxResults = "maxResults_example"; // String | Pagination limit
    String nextToken = "nextToken_example"; // String | Pagination token
    try {
      QueryTableRowsResult result = apiInstance.queryTableRows(workbookId, tableId, queryTableRowsRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders, maxResults, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#queryTableRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook whose table rows are being queried.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table whose rows are being queried.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **queryTableRowsRequest** | [**QueryTableRowsRequest**](QueryTableRowsRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |
| **maxResults** | **String**| Pagination limit | [optional] |
| **nextToken** | **String**| Pagination token | [optional] |

### Return type

[**QueryTableRowsResult**](QueryTableRowsResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceUnavailableException |  -  |
| **485** | ThrottlingException |  -  |
| **486** | ValidationException |  -  |

<a id="startTableDataImportJob"></a>
# **startTableDataImportJob**
> StartTableDataImportJobResult startTableDataImportJob(workbookId, tableId, startTableDataImportJobRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The StartTableDataImportJob API allows you to start an import job on a table. This API will only return the id of the job that was started. To find out the status of the import request, you need to call the DescribeTableDataImportJob API. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String workbookId = "workbookId_example"; // String | <p>The ID of the workbook where the rows are being imported.</p> <p> If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    String tableId = "tableId_example"; // String | <p>The ID of the table where the rows are being imported.</p> <p> If a table with the specified id could not be found, this API throws ResourceNotFoundException. </p>
    StartTableDataImportJobRequest startTableDataImportJobRequest = new StartTableDataImportJobRequest(); // StartTableDataImportJobRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      StartTableDataImportJobResult result = apiInstance.startTableDataImportJob(workbookId, tableId, startTableDataImportJobRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#startTableDataImportJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workbookId** | **String**| &lt;p&gt;The ID of the workbook where the rows are being imported.&lt;/p&gt; &lt;p&gt; If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **tableId** | **String**| &lt;p&gt;The ID of the table where the rows are being imported.&lt;/p&gt; &lt;p&gt; If a table with the specified id could not be found, this API throws ResourceNotFoundException. &lt;/p&gt; | |
| **startTableDataImportJobRequest** | [**StartTableDataImportJobRequest**](StartTableDataImportJobRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

[**StartTableDataImportJobResult**](StartTableDataImportJobResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | ResourceNotFoundException |  -  |
| **483** | ServiceUnavailableException |  -  |
| **484** | ThrottlingException |  -  |
| **485** | ValidationException |  -  |
| **486** | RequestTimeoutException |  -  |
| **487** | ServiceQuotaExceededException |  -  |

<a id="tagResource"></a>
# **tagResource**
> Object tagResource(resourceArn, tagResourceRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The TagResource API allows you to add tags to an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String resourceArn = "resourceArn_example"; // String | The resource's Amazon Resource Name (ARN).
    TagResourceRequest tagResourceRequest = new TagResourceRequest(); // TagResourceRequest | 
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      Object result = apiInstance.tagResource(resourceArn, tagResourceRequest, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tagResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceArn** | **String**| The resource&#39;s Amazon Resource Name (ARN). | |
| **tagResourceRequest** | [**TagResourceRequest**](TagResourceRequest.md)|  | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceUnavailableException |  -  |
| **485** | ThrottlingException |  -  |
| **486** | ValidationException |  -  |

<a id="untagResource"></a>
# **untagResource**
> Object untagResource(resourceArn, tagKeys, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders)



 The UntagResource API allows you to removes tags from an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://honeycode.us-east-1.amazonaws.com");
    
    // Configure API key authorization: hmac
    ApiKeyAuth hmac = (ApiKeyAuth) defaultClient.getAuthentication("hmac");
    hmac.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hmac.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String resourceArn = "resourceArn_example"; // String | The resource's Amazon Resource Name (ARN).
    List<String> tagKeys = Arrays.asList(); // List<String> | A list of tag keys to remove from the resource.
    String xAmzContentSha256 = "xAmzContentSha256_example"; // String | 
    String xAmzDate = "xAmzDate_example"; // String | 
    String xAmzAlgorithm = "xAmzAlgorithm_example"; // String | 
    String xAmzCredential = "xAmzCredential_example"; // String | 
    String xAmzSecurityToken = "xAmzSecurityToken_example"; // String | 
    String xAmzSignature = "xAmzSignature_example"; // String | 
    String xAmzSignedHeaders = "xAmzSignedHeaders_example"; // String | 
    try {
      Object result = apiInstance.untagResource(resourceArn, tagKeys, xAmzContentSha256, xAmzDate, xAmzAlgorithm, xAmzCredential, xAmzSecurityToken, xAmzSignature, xAmzSignedHeaders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#untagResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceArn** | **String**| The resource&#39;s Amazon Resource Name (ARN). | |
| **tagKeys** | [**List&lt;String&gt;**](String.md)| A list of tag keys to remove from the resource. | |
| **xAmzContentSha256** | **String**|  | [optional] |
| **xAmzDate** | **String**|  | [optional] |
| **xAmzAlgorithm** | **String**|  | [optional] |
| **xAmzCredential** | **String**|  | [optional] |
| **xAmzSecurityToken** | **String**|  | [optional] |
| **xAmzSignature** | **String**|  | [optional] |
| **xAmzSignedHeaders** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **480** | AccessDeniedException |  -  |
| **481** | InternalServerException |  -  |
| **482** | RequestTimeoutException |  -  |
| **483** | ResourceNotFoundException |  -  |
| **484** | ServiceUnavailableException |  -  |
| **485** | ThrottlingException |  -  |
| **486** | ValidationException |  -  |

