# DataApi

All URIs are relative to *https://analytics.googleapis.com/analytics/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsDataGaGet**](DataApi.md#analyticsDataGaGet) | **GET** /data/ga |  |
| [**analyticsDataMcfGet**](DataApi.md#analyticsDataMcfGet) | **GET** /data/mcf |  |
| [**analyticsDataRealtimeGet**](DataApi.md#analyticsDataRealtimeGet) | **GET** /data/realtime |  |


<a id="analyticsDataGaGet"></a>
# **analyticsDataGaGet**
> GaData analyticsDataGaGet(ids, startDate, endDate, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, includeEmptyRows, maxResults, output, samplingLevel, segment, sort, startIndex)



Returns Analytics data for a view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String ids = "ids_example"; // String | Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    String startDate = "startDate_example"; // String | Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    String endDate = "endDate_example"; // String | End date for fetching Analytics data. Request can should specify an end date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is yesterday.
    String metrics = "metrics_example"; // String | A comma-separated list of Analytics metrics. E.g., 'ga:sessions,ga:pageviews'. At least one metric must be specified.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    String dimensions = "dimensions_example"; // String | A comma-separated list of Analytics dimensions. E.g., 'ga:browser,ga:city'.
    String filters = "filters_example"; // String | A comma-separated list of dimension or metric filters to be applied to Analytics data.
    Boolean includeEmptyRows = true; // Boolean | The response will include empty rows if this parameter is set to true, the default is true
    Integer maxResults = 56; // Integer | The maximum number of entries to include in this feed.
    String output = "dataTable"; // String | The selected format for the response. Default format is JSON.
    String samplingLevel = "DEFAULT"; // String | The desired sampling level.
    String segment = "segment_example"; // String | An Analytics segment to be applied to data.
    String sort = "sort_example"; // String | A comma-separated list of dimensions or metrics that determine the sort order for Analytics data.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      GaData result = apiInstance.analyticsDataGaGet(ids, startDate, endDate, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, includeEmptyRows, maxResults, output, samplingLevel, segment, sort, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#analyticsDataGaGet");
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
| **ids** | **String**| Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID. | |
| **startDate** | **String**| Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo. | |
| **endDate** | **String**| End date for fetching Analytics data. Request can should specify an end date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is yesterday. | |
| **metrics** | **String**| A comma-separated list of Analytics metrics. E.g., &#39;ga:sessions,ga:pageviews&#39;. At least one metric must be specified. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **dimensions** | **String**| A comma-separated list of Analytics dimensions. E.g., &#39;ga:browser,ga:city&#39;. | [optional] |
| **filters** | **String**| A comma-separated list of dimension or metric filters to be applied to Analytics data. | [optional] |
| **includeEmptyRows** | **Boolean**| The response will include empty rows if this parameter is set to true, the default is true | [optional] |
| **maxResults** | **Integer**| The maximum number of entries to include in this feed. | [optional] |
| **output** | **String**| The selected format for the response. Default format is JSON. | [optional] [enum: dataTable, json] |
| **samplingLevel** | **String**| The desired sampling level. | [optional] [enum: DEFAULT, FASTER, HIGHER_PRECISION] |
| **segment** | **String**| An Analytics segment to be applied to data. | [optional] |
| **sort** | **String**| A comma-separated list of dimensions or metrics that determine the sort order for Analytics data. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**GaData**](GaData.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsDataMcfGet"></a>
# **analyticsDataMcfGet**
> McfData analyticsDataMcfGet(ids, startDate, endDate, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, maxResults, samplingLevel, sort, startIndex)



Returns Analytics Multi-Channel Funnels data for a view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String ids = "ids_example"; // String | Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    String startDate = "startDate_example"; // String | Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    String endDate = "endDate_example"; // String | End date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    String metrics = "metrics_example"; // String | A comma-separated list of Multi-Channel Funnels metrics. E.g., 'mcf:totalConversions,mcf:totalConversionValue'. At least one metric must be specified.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    String dimensions = "dimensions_example"; // String | A comma-separated list of Multi-Channel Funnels dimensions. E.g., 'mcf:source,mcf:medium'.
    String filters = "filters_example"; // String | A comma-separated list of dimension or metric filters to be applied to the Analytics data.
    Integer maxResults = 56; // Integer | The maximum number of entries to include in this feed.
    String samplingLevel = "DEFAULT"; // String | The desired sampling level.
    String sort = "sort_example"; // String | A comma-separated list of dimensions or metrics that determine the sort order for the Analytics data.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      McfData result = apiInstance.analyticsDataMcfGet(ids, startDate, endDate, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, maxResults, samplingLevel, sort, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#analyticsDataMcfGet");
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
| **ids** | **String**| Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID. | |
| **startDate** | **String**| Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo. | |
| **endDate** | **String**| End date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo. | |
| **metrics** | **String**| A comma-separated list of Multi-Channel Funnels metrics. E.g., &#39;mcf:totalConversions,mcf:totalConversionValue&#39;. At least one metric must be specified. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **dimensions** | **String**| A comma-separated list of Multi-Channel Funnels dimensions. E.g., &#39;mcf:source,mcf:medium&#39;. | [optional] |
| **filters** | **String**| A comma-separated list of dimension or metric filters to be applied to the Analytics data. | [optional] |
| **maxResults** | **Integer**| The maximum number of entries to include in this feed. | [optional] |
| **samplingLevel** | **String**| The desired sampling level. | [optional] [enum: DEFAULT, FASTER, HIGHER_PRECISION] |
| **sort** | **String**| A comma-separated list of dimensions or metrics that determine the sort order for the Analytics data. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**McfData**](McfData.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsDataRealtimeGet"></a>
# **analyticsDataRealtimeGet**
> RealtimeData analyticsDataRealtimeGet(ids, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, maxResults, sort)



Returns real time data for a view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataApi apiInstance = new DataApi(defaultClient);
    String ids = "ids_example"; // String | Unique table ID for retrieving real time data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    String metrics = "metrics_example"; // String | A comma-separated list of real time metrics. E.g., 'rt:activeUsers'. At least one metric must be specified.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    String dimensions = "dimensions_example"; // String | A comma-separated list of real time dimensions. E.g., 'rt:medium,rt:city'.
    String filters = "filters_example"; // String | A comma-separated list of dimension or metric filters to be applied to real time data.
    Integer maxResults = 56; // Integer | The maximum number of entries to include in this feed.
    String sort = "sort_example"; // String | A comma-separated list of dimensions or metrics that determine the sort order for real time data.
    try {
      RealtimeData result = apiInstance.analyticsDataRealtimeGet(ids, metrics, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, dimensions, filters, maxResults, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#analyticsDataRealtimeGet");
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
| **ids** | **String**| Unique table ID for retrieving real time data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID. | |
| **metrics** | **String**| A comma-separated list of real time metrics. E.g., &#39;rt:activeUsers&#39;. At least one metric must be specified. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **dimensions** | **String**| A comma-separated list of real time dimensions. E.g., &#39;rt:medium,rt:city&#39;. | [optional] |
| **filters** | **String**| A comma-separated list of dimension or metric filters to be applied to real time data. | [optional] |
| **maxResults** | **Integer**| The maximum number of entries to include in this feed. | [optional] |
| **sort** | **String**| A comma-separated list of dimensions or metrics that determine the sort order for real time data. | [optional] |

### Return type

[**RealtimeData**](RealtimeData.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

