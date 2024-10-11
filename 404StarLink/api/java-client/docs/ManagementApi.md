# ManagementApi

All URIs are relative to *https://www.googleapis.com/analytics/v2.4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsManagementAccountsList**](ManagementApi.md#analyticsManagementAccountsList) | **GET** /management/accounts |  |
| [**analyticsManagementGoalsList**](ManagementApi.md#analyticsManagementGoalsList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals |  |
| [**analyticsManagementProfilesList**](ManagementApi.md#analyticsManagementProfilesList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles |  |
| [**analyticsManagementSegmentsList**](ManagementApi.md#analyticsManagementSegmentsList) | **GET** /management/segments |  |
| [**analyticsManagementWebpropertiesList**](ManagementApi.md#analyticsManagementWebpropertiesList) | **GET** /management/accounts/{accountId}/webproperties |  |


<a id="analyticsManagementAccountsList"></a>
# **analyticsManagementAccountsList**
> analyticsManagementAccountsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists all accounts to which the user has access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagementApi;

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

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String alt = "atom"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = false; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of accounts to include in this response.
    Integer startIndex = 56; // Integer | An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      apiInstance.analyticsManagementAccountsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementAccountsList");
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
| **alt** | **String**| Data format for the response. | [optional] [default to atom] [enum: atom] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] [default to false] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of accounts to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

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

<a id="analyticsManagementGoalsList"></a>
# **analyticsManagementGoalsList**
> analyticsManagementGoalsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists goals to which the user has access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagementApi;

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

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve goals for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve goals for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve goals for. Can either be a specific view (profile) ID or '~all', which refers to all the views (profiles) that user has access to.
    String alt = "atom"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = false; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of goals to include in this response.
    Integer startIndex = 56; // Integer | An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      apiInstance.analyticsManagementGoalsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementGoalsList");
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
| **accountId** | **String**| Account ID to retrieve goals for. Can either be a specific account ID or &#39;~all&#39;, which refers to all the accounts that user has access to. | |
| **webPropertyId** | **String**| Web property ID to retrieve goals for. Can either be a specific web property ID or &#39;~all&#39;, which refers to all the web properties that user has access to. | |
| **profileId** | **String**| View (Profile) ID to retrieve goals for. Can either be a specific view (profile) ID or &#39;~all&#39;, which refers to all the views (profiles) that user has access to. | |
| **alt** | **String**| Data format for the response. | [optional] [default to atom] [enum: atom] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] [default to false] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of goals to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

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

<a id="analyticsManagementProfilesList"></a>
# **analyticsManagementProfilesList**
> analyticsManagementProfilesList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists views (profiles) to which the user has access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagementApi;

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

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the views (profiles) to retrieve. Can either be a specific account ID or '~all', which refers to all the accounts to which the user has access.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties to which the user has access.
    String alt = "atom"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = false; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of views (profiles) to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      apiInstance.analyticsManagementProfilesList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfilesList");
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
| **accountId** | **String**| Account ID for the views (profiles) to retrieve. Can either be a specific account ID or &#39;~all&#39;, which refers to all the accounts to which the user has access. | |
| **webPropertyId** | **String**| Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or &#39;~all&#39;, which refers to all the web properties to which the user has access. | |
| **alt** | **String**| Data format for the response. | [optional] [default to atom] [enum: atom] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] [default to false] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of views (profiles) to include in this response. | [optional] |
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

<a id="analyticsManagementSegmentsList"></a>
# **analyticsManagementSegmentsList**
> analyticsManagementSegmentsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists advanced segments to which the user has access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagementApi;

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

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String alt = "atom"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = false; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of advanced segments to include in this response.
    Integer startIndex = 56; // Integer | An index of the first advanced segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      apiInstance.analyticsManagementSegmentsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementSegmentsList");
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
| **alt** | **String**| Data format for the response. | [optional] [default to atom] [enum: atom] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] [default to false] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of advanced segments to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first advanced segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

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

<a id="analyticsManagementWebpropertiesList"></a>
# **analyticsManagementWebpropertiesList**
> analyticsManagementWebpropertiesList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists web properties to which the user has access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagementApi;

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

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve web properties for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    String alt = "atom"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = false; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of web properties to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      apiInstance.analyticsManagementWebpropertiesList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertiesList");
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
| **accountId** | **String**| Account ID to retrieve web properties for. Can either be a specific account ID or &#39;~all&#39;, which refers to all the accounts that user has access to. | |
| **alt** | **String**| Data format for the response. | [optional] [default to atom] [enum: atom] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] [default to false] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of web properties to include in this response. | [optional] |
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

