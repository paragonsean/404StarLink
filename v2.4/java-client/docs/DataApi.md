# DataApi

All URIs are relative to *https://www.googleapis.com/analytics/v2.4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsDataGet**](DataApi.md#analyticsDataGet) | **GET** /data |  |


<a id="analyticsDataGet"></a>
# **analyticsDataGet**
> analyticsDataGet(ids, startDate, endDate, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, maxResults, segment, sort, startIndex)



Returns Analytics report data for a view (profile).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.googleapis.com/analytics/v2.4");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String ids = "ids_example"; // String | Unique table ID for retrieving report data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    String startDate = "startDate_example"; // String | Start date for fetching report data. All requests should specify a start date formatted as YYYY-MM-DD.
    String endDate = "endDate_example"; // String | End date for fetching report data. All requests should specify an end date formatted as YYYY-MM-DD.
    String metrics = "metrics_example"; // String | A comma-separated list of Analytics metrics. E.g., 'ga:sessions,ga:pageviews'. At least one metric must be specified to retrieve a valid Analytics report.
    String alt = "atom"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = false; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    String dimensions = "dimensions_example"; // String | A comma-separated list of Analytics dimensions. E.g., 'ga:browser,ga:city'.
    String filters = "filters_example"; // String | A comma-separated list of dimension or metric filters to be applied to the report data.
    Integer maxResults = 56; // Integer | The maximum number of entries to include in this feed.
    String segment = "segment_example"; // String | An Analytics advanced segment to be applied to the report data.
    String sort = "sort_example"; // String | A comma-separated list of dimensions or metrics that determine the sort order for the report data.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      apiInstance.analyticsDataGet(ids, startDate, endDate, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, maxResults, segment, sort, startIndex);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#analyticsDataGet");
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
| **ids** | **String**| Unique table ID for retrieving report data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID. | |
| **startDate** | **String**| Start date for fetching report data. All requests should specify a start date formatted as YYYY-MM-DD. | |
| **endDate** | **String**| End date for fetching report data. All requests should specify an end date formatted as YYYY-MM-DD. | |
| **metrics** | **String**| A comma-separated list of Analytics metrics. E.g., &#39;ga:sessions,ga:pageviews&#39;. At least one metric must be specified to retrieve a valid Analytics report. | |
| **alt** | **String**| Data format for the response. | [optional] [default to atom] [enum: atom] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] [default to false] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **dimensions** | **String**| A comma-separated list of Analytics dimensions. E.g., &#39;ga:browser,ga:city&#39;. | [optional] |
| **filters** | **String**| A comma-separated list of dimension or metric filters to be applied to the report data. | [optional] |
| **maxResults** | **Integer**| The maximum number of entries to include in this feed. | [optional] |
| **segment** | **String**| An Analytics advanced segment to be applied to the report data. | [optional] |
| **sort** | **String**| A comma-separated list of dimensions or metrics that determine the sort order for the report data. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

null (empty response body)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

