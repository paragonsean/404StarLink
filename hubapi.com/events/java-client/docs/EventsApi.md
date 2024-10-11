# EventsApi

All URIs are relative to *https://api.hubapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventsV3EventsGetPage**](EventsApi.md#getEventsV3EventsGetPage) | **GET** /events/v3/events | Returns a collection of events matching a query. |


<a id="getEventsV3EventsGetPage"></a>
# **getEventsV3EventsGetPage**
> CollectionResponseExternalUnifiedEvent getEventsV3EventsGetPage(occurredAfter, occurredBefore, objectType, objectId, eventType, after, before, limit, sort)

Returns a collection of events matching a query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hubapi.com");
    
    // Configure OAuth2 access token for authorization: oauth2_legacy
    OAuth oauth2_legacy = (OAuth) defaultClient.getAuthentication("oauth2_legacy");
    oauth2_legacy.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: hapikey
    ApiKeyAuth hapikey = (ApiKeyAuth) defaultClient.getAuthentication("hapikey");
    hapikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //hapikey.setApiKeyPrefix("Token");

    // Configure API key authorization: private_apps_legacy
    ApiKeyAuth private_apps_legacy = (ApiKeyAuth) defaultClient.getAuthentication("private_apps_legacy");
    private_apps_legacy.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //private_apps_legacy.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    OffsetDateTime occurredAfter = OffsetDateTime.now(); // OffsetDateTime | The starting time as an ISO 8601 timestamp.
    OffsetDateTime occurredBefore = OffsetDateTime.now(); // OffsetDateTime | The ending time as an ISO 8601 timestamp.
    String objectType = "objectType_example"; // String | The type of object being selected. Valid values are hubspot named object types (e.g. `contact`).
    Long objectId = 56L; // Long | The id of the selected object. If not present, then the `objectProperty` parameter is required.
    String eventType = "eventType_example"; // String | Limits the response to the specified event type.  For example `&eventType=e_visited_page` returns only `e_visited_page` events.  If not present all event types are returned.
    String after = "after_example"; // String | An additional parameter that may be used to get the next `limit` set of results.
    String before = "before_example"; // String | 
    Integer limit = 56; // Integer | The maximum number of events to return, defaults to 20.
    List<String> sort = Arrays.asList(); // List<String> | Selects the sort field and order. Defaults to ascending, prefix with `-` for descending order. `occurredAt` is the only field supported for sorting.
    try {
      CollectionResponseExternalUnifiedEvent result = apiInstance.getEventsV3EventsGetPage(occurredAfter, occurredBefore, objectType, objectId, eventType, after, before, limit, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEventsV3EventsGetPage");
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
| **occurredAfter** | **OffsetDateTime**| The starting time as an ISO 8601 timestamp. | [optional] |
| **occurredBefore** | **OffsetDateTime**| The ending time as an ISO 8601 timestamp. | [optional] |
| **objectType** | **String**| The type of object being selected. Valid values are hubspot named object types (e.g. &#x60;contact&#x60;). | [optional] |
| **objectId** | **Long**| The id of the selected object. If not present, then the &#x60;objectProperty&#x60; parameter is required. | [optional] |
| **eventType** | **String**| Limits the response to the specified event type.  For example &#x60;&amp;eventType&#x3D;e_visited_page&#x60; returns only &#x60;e_visited_page&#x60; events.  If not present all event types are returned. | [optional] |
| **after** | **String**| An additional parameter that may be used to get the next &#x60;limit&#x60; set of results. | [optional] |
| **before** | **String**|  | [optional] |
| **limit** | **Integer**| The maximum number of events to return, defaults to 20. | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Selects the sort field and order. Defaults to ascending, prefix with &#x60;-&#x60; for descending order. &#x60;occurredAt&#x60; is the only field supported for sorting. | [optional] |

### Return type

[**CollectionResponseExternalUnifiedEvent**](CollectionResponseExternalUnifiedEvent.md)

### Authorization

[oauth2_legacy](../README.md#oauth2_legacy), [hapikey](../README.md#hapikey), [private_apps_legacy](../README.md#private_apps_legacy)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **0** | An error occurred. |  -  |

