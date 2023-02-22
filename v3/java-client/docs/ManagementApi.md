# ManagementApi

All URIs are relative to *https://analytics.googleapis.com/analytics/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsManagementAccountSummariesList**](ManagementApi.md#analyticsManagementAccountSummariesList) | **GET** /management/accountSummaries |  |
| [**analyticsManagementAccountUserLinksDelete**](ManagementApi.md#analyticsManagementAccountUserLinksDelete) | **DELETE** /management/accounts/{accountId}/entityUserLinks/{linkId} |  |
| [**analyticsManagementAccountUserLinksInsert**](ManagementApi.md#analyticsManagementAccountUserLinksInsert) | **POST** /management/accounts/{accountId}/entityUserLinks |  |
| [**analyticsManagementAccountUserLinksList**](ManagementApi.md#analyticsManagementAccountUserLinksList) | **GET** /management/accounts/{accountId}/entityUserLinks |  |
| [**analyticsManagementAccountUserLinksUpdate**](ManagementApi.md#analyticsManagementAccountUserLinksUpdate) | **PUT** /management/accounts/{accountId}/entityUserLinks/{linkId} |  |
| [**analyticsManagementAccountsList**](ManagementApi.md#analyticsManagementAccountsList) | **GET** /management/accounts |  |
| [**analyticsManagementClientIdHashClientId**](ManagementApi.md#analyticsManagementClientIdHashClientId) | **POST** /management/clientId:hashClientId |  |
| [**analyticsManagementCustomDataSourcesList**](ManagementApi.md#analyticsManagementCustomDataSourcesList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources |  |
| [**analyticsManagementCustomDimensionsGet**](ManagementApi.md#analyticsManagementCustomDimensionsGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions/{customDimensionId} |  |
| [**analyticsManagementCustomDimensionsInsert**](ManagementApi.md#analyticsManagementCustomDimensionsInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions |  |
| [**analyticsManagementCustomDimensionsList**](ManagementApi.md#analyticsManagementCustomDimensionsList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions |  |
| [**analyticsManagementCustomDimensionsPatch**](ManagementApi.md#analyticsManagementCustomDimensionsPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions/{customDimensionId} |  |
| [**analyticsManagementCustomDimensionsUpdate**](ManagementApi.md#analyticsManagementCustomDimensionsUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDimensions/{customDimensionId} |  |
| [**analyticsManagementCustomMetricsGet**](ManagementApi.md#analyticsManagementCustomMetricsGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics/{customMetricId} |  |
| [**analyticsManagementCustomMetricsInsert**](ManagementApi.md#analyticsManagementCustomMetricsInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics |  |
| [**analyticsManagementCustomMetricsList**](ManagementApi.md#analyticsManagementCustomMetricsList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics |  |
| [**analyticsManagementCustomMetricsPatch**](ManagementApi.md#analyticsManagementCustomMetricsPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics/{customMetricId} |  |
| [**analyticsManagementCustomMetricsUpdate**](ManagementApi.md#analyticsManagementCustomMetricsUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/customMetrics/{customMetricId} |  |
| [**analyticsManagementExperimentsDelete**](ManagementApi.md#analyticsManagementExperimentsDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId} |  |
| [**analyticsManagementExperimentsGet**](ManagementApi.md#analyticsManagementExperimentsGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId} |  |
| [**analyticsManagementExperimentsInsert**](ManagementApi.md#analyticsManagementExperimentsInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments |  |
| [**analyticsManagementExperimentsList**](ManagementApi.md#analyticsManagementExperimentsList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments |  |
| [**analyticsManagementExperimentsPatch**](ManagementApi.md#analyticsManagementExperimentsPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId} |  |
| [**analyticsManagementExperimentsUpdate**](ManagementApi.md#analyticsManagementExperimentsUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/experiments/{experimentId} |  |
| [**analyticsManagementFiltersDelete**](ManagementApi.md#analyticsManagementFiltersDelete) | **DELETE** /management/accounts/{accountId}/filters/{filterId} |  |
| [**analyticsManagementFiltersGet**](ManagementApi.md#analyticsManagementFiltersGet) | **GET** /management/accounts/{accountId}/filters/{filterId} |  |
| [**analyticsManagementFiltersInsert**](ManagementApi.md#analyticsManagementFiltersInsert) | **POST** /management/accounts/{accountId}/filters |  |
| [**analyticsManagementFiltersList**](ManagementApi.md#analyticsManagementFiltersList) | **GET** /management/accounts/{accountId}/filters |  |
| [**analyticsManagementFiltersPatch**](ManagementApi.md#analyticsManagementFiltersPatch) | **PATCH** /management/accounts/{accountId}/filters/{filterId} |  |
| [**analyticsManagementFiltersUpdate**](ManagementApi.md#analyticsManagementFiltersUpdate) | **PUT** /management/accounts/{accountId}/filters/{filterId} |  |
| [**analyticsManagementGoalsGet**](ManagementApi.md#analyticsManagementGoalsGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals/{goalId} |  |
| [**analyticsManagementGoalsInsert**](ManagementApi.md#analyticsManagementGoalsInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals |  |
| [**analyticsManagementGoalsList**](ManagementApi.md#analyticsManagementGoalsList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals |  |
| [**analyticsManagementGoalsPatch**](ManagementApi.md#analyticsManagementGoalsPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals/{goalId} |  |
| [**analyticsManagementGoalsUpdate**](ManagementApi.md#analyticsManagementGoalsUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals/{goalId} |  |
| [**analyticsManagementProfileFilterLinksDelete**](ManagementApi.md#analyticsManagementProfileFilterLinksDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId} |  |
| [**analyticsManagementProfileFilterLinksGet**](ManagementApi.md#analyticsManagementProfileFilterLinksGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId} |  |
| [**analyticsManagementProfileFilterLinksInsert**](ManagementApi.md#analyticsManagementProfileFilterLinksInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks |  |
| [**analyticsManagementProfileFilterLinksList**](ManagementApi.md#analyticsManagementProfileFilterLinksList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks |  |
| [**analyticsManagementProfileFilterLinksPatch**](ManagementApi.md#analyticsManagementProfileFilterLinksPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId} |  |
| [**analyticsManagementProfileFilterLinksUpdate**](ManagementApi.md#analyticsManagementProfileFilterLinksUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/profileFilterLinks/{linkId} |  |
| [**analyticsManagementProfileUserLinksDelete**](ManagementApi.md#analyticsManagementProfileUserLinksDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks/{linkId} |  |
| [**analyticsManagementProfileUserLinksInsert**](ManagementApi.md#analyticsManagementProfileUserLinksInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks |  |
| [**analyticsManagementProfileUserLinksList**](ManagementApi.md#analyticsManagementProfileUserLinksList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks |  |
| [**analyticsManagementProfileUserLinksUpdate**](ManagementApi.md#analyticsManagementProfileUserLinksUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/entityUserLinks/{linkId} |  |
| [**analyticsManagementProfilesDelete**](ManagementApi.md#analyticsManagementProfilesDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId} |  |
| [**analyticsManagementProfilesGet**](ManagementApi.md#analyticsManagementProfilesGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId} |  |
| [**analyticsManagementProfilesInsert**](ManagementApi.md#analyticsManagementProfilesInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles |  |
| [**analyticsManagementProfilesList**](ManagementApi.md#analyticsManagementProfilesList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles |  |
| [**analyticsManagementProfilesPatch**](ManagementApi.md#analyticsManagementProfilesPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId} |  |
| [**analyticsManagementProfilesUpdate**](ManagementApi.md#analyticsManagementProfilesUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId} |  |
| [**analyticsManagementRemarketingAudienceDelete**](ManagementApi.md#analyticsManagementRemarketingAudienceDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId} |  |
| [**analyticsManagementRemarketingAudienceGet**](ManagementApi.md#analyticsManagementRemarketingAudienceGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId} |  |
| [**analyticsManagementRemarketingAudienceInsert**](ManagementApi.md#analyticsManagementRemarketingAudienceInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences |  |
| [**analyticsManagementRemarketingAudienceList**](ManagementApi.md#analyticsManagementRemarketingAudienceList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences |  |
| [**analyticsManagementRemarketingAudiencePatch**](ManagementApi.md#analyticsManagementRemarketingAudiencePatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId} |  |
| [**analyticsManagementRemarketingAudienceUpdate**](ManagementApi.md#analyticsManagementRemarketingAudienceUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/remarketingAudiences/{remarketingAudienceId} |  |
| [**analyticsManagementSegmentsList**](ManagementApi.md#analyticsManagementSegmentsList) | **GET** /management/segments |  |
| [**analyticsManagementUnsampledReportsDelete**](ManagementApi.md#analyticsManagementUnsampledReportsDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports/{unsampledReportId} |  |
| [**analyticsManagementUnsampledReportsGet**](ManagementApi.md#analyticsManagementUnsampledReportsGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports/{unsampledReportId} |  |
| [**analyticsManagementUnsampledReportsInsert**](ManagementApi.md#analyticsManagementUnsampledReportsInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports |  |
| [**analyticsManagementUnsampledReportsList**](ManagementApi.md#analyticsManagementUnsampledReportsList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/unsampledReports |  |
| [**analyticsManagementUploadsDeleteUploadData**](ManagementApi.md#analyticsManagementUploadsDeleteUploadData) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/deleteUploadData |  |
| [**analyticsManagementUploadsGet**](ManagementApi.md#analyticsManagementUploadsGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/uploads/{uploadId} |  |
| [**analyticsManagementUploadsList**](ManagementApi.md#analyticsManagementUploadsList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/uploads |  |
| [**analyticsManagementUploadsUploadData**](ManagementApi.md#analyticsManagementUploadsUploadData) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/customDataSources/{customDataSourceId}/uploads |  |
| [**analyticsManagementWebPropertyAdWordsLinksDelete**](ManagementApi.md#analyticsManagementWebPropertyAdWordsLinksDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId} |  |
| [**analyticsManagementWebPropertyAdWordsLinksGet**](ManagementApi.md#analyticsManagementWebPropertyAdWordsLinksGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId} |  |
| [**analyticsManagementWebPropertyAdWordsLinksInsert**](ManagementApi.md#analyticsManagementWebPropertyAdWordsLinksInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks |  |
| [**analyticsManagementWebPropertyAdWordsLinksList**](ManagementApi.md#analyticsManagementWebPropertyAdWordsLinksList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks |  |
| [**analyticsManagementWebPropertyAdWordsLinksPatch**](ManagementApi.md#analyticsManagementWebPropertyAdWordsLinksPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId} |  |
| [**analyticsManagementWebPropertyAdWordsLinksUpdate**](ManagementApi.md#analyticsManagementWebPropertyAdWordsLinksUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityAdWordsLinks/{webPropertyAdWordsLinkId} |  |
| [**analyticsManagementWebpropertiesGet**](ManagementApi.md#analyticsManagementWebpropertiesGet) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId} |  |
| [**analyticsManagementWebpropertiesInsert**](ManagementApi.md#analyticsManagementWebpropertiesInsert) | **POST** /management/accounts/{accountId}/webproperties |  |
| [**analyticsManagementWebpropertiesList**](ManagementApi.md#analyticsManagementWebpropertiesList) | **GET** /management/accounts/{accountId}/webproperties |  |
| [**analyticsManagementWebpropertiesPatch**](ManagementApi.md#analyticsManagementWebpropertiesPatch) | **PATCH** /management/accounts/{accountId}/webproperties/{webPropertyId} |  |
| [**analyticsManagementWebpropertiesUpdate**](ManagementApi.md#analyticsManagementWebpropertiesUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId} |  |
| [**analyticsManagementWebpropertyUserLinksDelete**](ManagementApi.md#analyticsManagementWebpropertyUserLinksDelete) | **DELETE** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks/{linkId} |  |
| [**analyticsManagementWebpropertyUserLinksInsert**](ManagementApi.md#analyticsManagementWebpropertyUserLinksInsert) | **POST** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks |  |
| [**analyticsManagementWebpropertyUserLinksList**](ManagementApi.md#analyticsManagementWebpropertyUserLinksList) | **GET** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks |  |
| [**analyticsManagementWebpropertyUserLinksUpdate**](ManagementApi.md#analyticsManagementWebpropertyUserLinksUpdate) | **PUT** /management/accounts/{accountId}/webproperties/{webPropertyId}/entityUserLinks/{linkId} |  |


<a id="analyticsManagementAccountSummariesList"></a>
# **analyticsManagementAccountSummariesList**
> AccountSummaries analyticsManagementAccountSummariesList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of account summaries to include in this response, where the largest acceptable value is 1000.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      AccountSummaries result = apiInstance.analyticsManagementAccountSummariesList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementAccountSummariesList");
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
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of account summaries to include in this response, where the largest acceptable value is 1000. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**AccountSummaries**](AccountSummaries.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementAccountUserLinksDelete"></a>
# **analyticsManagementAccountUserLinksDelete**
> analyticsManagementAccountUserLinksDelete(accountId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Removes a user from the given account.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to delete the user link for.
    String linkId = "linkId_example"; // String | Link ID to delete the user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementAccountUserLinksDelete(accountId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementAccountUserLinksDelete");
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
| **accountId** | **String**| Account ID to delete the user link for. | |
| **linkId** | **String**| Link ID to delete the user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementAccountUserLinksInsert"></a>
# **analyticsManagementAccountUserLinksInsert**
> EntityUserLink analyticsManagementAccountUserLinksInsert(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink)



Adds a new user to the given account.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityUserLink entityUserLink = new EntityUserLink(); // EntityUserLink | 
    try {
      EntityUserLink result = apiInstance.analyticsManagementAccountUserLinksInsert(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementAccountUserLinksInsert");
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
| **accountId** | **String**| Account ID to create the user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityUserLink** | [**EntityUserLink**](EntityUserLink.md)|  | [optional] |

### Return type

[**EntityUserLink**](EntityUserLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementAccountUserLinksList"></a>
# **analyticsManagementAccountUserLinksList**
> EntityUserLinks analyticsManagementAccountUserLinksList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists account-user links for a given account.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve the user links for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of account-user links to include in this response.
    Integer startIndex = 56; // Integer | An index of the first account-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      EntityUserLinks result = apiInstance.analyticsManagementAccountUserLinksList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementAccountUserLinksList");
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
| **accountId** | **String**| Account ID to retrieve the user links for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of account-user links to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first account-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**EntityUserLinks**](EntityUserLinks.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementAccountUserLinksUpdate"></a>
# **analyticsManagementAccountUserLinksUpdate**
> EntityUserLink analyticsManagementAccountUserLinksUpdate(accountId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink)



Updates permissions for an existing user on the given account.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to update the account-user link for.
    String linkId = "linkId_example"; // String | Link ID to update the account-user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityUserLink entityUserLink = new EntityUserLink(); // EntityUserLink | 
    try {
      EntityUserLink result = apiInstance.analyticsManagementAccountUserLinksUpdate(accountId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementAccountUserLinksUpdate");
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
| **accountId** | **String**| Account ID to update the account-user link for. | |
| **linkId** | **String**| Link ID to update the account-user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityUserLink** | [**EntityUserLink**](EntityUserLink.md)|  | [optional] |

### Return type

[**EntityUserLink**](EntityUserLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementAccountsList"></a>
# **analyticsManagementAccountsList**
> Accounts analyticsManagementAccountsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of accounts to include in this response.
    Integer startIndex = 56; // Integer | An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Accounts result = apiInstance.analyticsManagementAccountsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
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
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of accounts to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Accounts**](Accounts.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementClientIdHashClientId"></a>
# **analyticsManagementClientIdHashClientId**
> HashClientIdResponse analyticsManagementClientIdHashClientId(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, hashClientIdRequest)



Hashes the given Client ID.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    HashClientIdRequest hashClientIdRequest = new HashClientIdRequest(); // HashClientIdRequest | 
    try {
      HashClientIdResponse result = apiInstance.analyticsManagementClientIdHashClientId(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, hashClientIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementClientIdHashClientId");
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
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **hashClientIdRequest** | [**HashClientIdRequest**](HashClientIdRequest.md)|  | [optional] |

### Return type

[**HashClientIdResponse**](HashClientIdResponse.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomDataSourcesList"></a>
# **analyticsManagementCustomDataSourcesList**
> CustomDataSources analyticsManagementCustomDataSourcesList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



List custom data sources to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account Id for the custom data sources to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id for the custom data sources to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of custom data sources to include in this response.
    Integer startIndex = 56; // Integer | A 1-based index of the first custom data source to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      CustomDataSources result = apiInstance.analyticsManagementCustomDataSourcesList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomDataSourcesList");
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
| **accountId** | **String**| Account Id for the custom data sources to retrieve. | |
| **webPropertyId** | **String**| Web property Id for the custom data sources to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of custom data sources to include in this response. | [optional] |
| **startIndex** | **Integer**| A 1-based index of the first custom data source to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**CustomDataSources**](CustomDataSources.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomDimensionsGet"></a>
# **analyticsManagementCustomDimensionsGet**
> CustomDimension analyticsManagementCustomDimensionsGet(accountId, webPropertyId, customDimensionId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Get a custom dimension to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom dimension to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom dimension to retrieve.
    String customDimensionId = "customDimensionId_example"; // String | The ID of the custom dimension to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      CustomDimension result = apiInstance.analyticsManagementCustomDimensionsGet(accountId, webPropertyId, customDimensionId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomDimensionsGet");
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
| **accountId** | **String**| Account ID for the custom dimension to retrieve. | |
| **webPropertyId** | **String**| Web property ID for the custom dimension to retrieve. | |
| **customDimensionId** | **String**| The ID of the custom dimension to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**CustomDimension**](CustomDimension.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomDimensionsInsert"></a>
# **analyticsManagementCustomDimensionsInsert**
> CustomDimension analyticsManagementCustomDimensionsInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, customDimension)



Create a new custom dimension.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom dimension to create.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom dimension to create.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    CustomDimension customDimension = new CustomDimension(); // CustomDimension | 
    try {
      CustomDimension result = apiInstance.analyticsManagementCustomDimensionsInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, customDimension);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomDimensionsInsert");
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
| **accountId** | **String**| Account ID for the custom dimension to create. | |
| **webPropertyId** | **String**| Web property ID for the custom dimension to create. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **customDimension** | [**CustomDimension**](CustomDimension.md)|  | [optional] |

### Return type

[**CustomDimension**](CustomDimension.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomDimensionsList"></a>
# **analyticsManagementCustomDimensionsList**
> CustomDimensions analyticsManagementCustomDimensionsList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists custom dimensions to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom dimensions to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom dimensions to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of custom dimensions to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      CustomDimensions result = apiInstance.analyticsManagementCustomDimensionsList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomDimensionsList");
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
| **accountId** | **String**| Account ID for the custom dimensions to retrieve. | |
| **webPropertyId** | **String**| Web property ID for the custom dimensions to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of custom dimensions to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**CustomDimensions**](CustomDimensions.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomDimensionsPatch"></a>
# **analyticsManagementCustomDimensionsPatch**
> CustomDimension analyticsManagementCustomDimensionsPatch(accountId, webPropertyId, customDimensionId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customDimension)



Updates an existing custom dimension. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom dimension to update.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom dimension to update.
    String customDimensionId = "customDimensionId_example"; // String | Custom dimension ID for the custom dimension to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Boolean ignoreCustomDataSourceLinks = true; // Boolean | Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    CustomDimension customDimension = new CustomDimension(); // CustomDimension | 
    try {
      CustomDimension result = apiInstance.analyticsManagementCustomDimensionsPatch(accountId, webPropertyId, customDimensionId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customDimension);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomDimensionsPatch");
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
| **accountId** | **String**| Account ID for the custom dimension to update. | |
| **webPropertyId** | **String**| Web property ID for the custom dimension to update. | |
| **customDimensionId** | **String**| Custom dimension ID for the custom dimension to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **ignoreCustomDataSourceLinks** | **Boolean**| Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set. | [optional] |
| **customDimension** | [**CustomDimension**](CustomDimension.md)|  | [optional] |

### Return type

[**CustomDimension**](CustomDimension.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomDimensionsUpdate"></a>
# **analyticsManagementCustomDimensionsUpdate**
> CustomDimension analyticsManagementCustomDimensionsUpdate(accountId, webPropertyId, customDimensionId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customDimension)



Updates an existing custom dimension.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom dimension to update.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom dimension to update.
    String customDimensionId = "customDimensionId_example"; // String | Custom dimension ID for the custom dimension to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Boolean ignoreCustomDataSourceLinks = true; // Boolean | Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    CustomDimension customDimension = new CustomDimension(); // CustomDimension | 
    try {
      CustomDimension result = apiInstance.analyticsManagementCustomDimensionsUpdate(accountId, webPropertyId, customDimensionId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customDimension);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomDimensionsUpdate");
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
| **accountId** | **String**| Account ID for the custom dimension to update. | |
| **webPropertyId** | **String**| Web property ID for the custom dimension to update. | |
| **customDimensionId** | **String**| Custom dimension ID for the custom dimension to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **ignoreCustomDataSourceLinks** | **Boolean**| Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set. | [optional] |
| **customDimension** | [**CustomDimension**](CustomDimension.md)|  | [optional] |

### Return type

[**CustomDimension**](CustomDimension.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomMetricsGet"></a>
# **analyticsManagementCustomMetricsGet**
> CustomMetric analyticsManagementCustomMetricsGet(accountId, webPropertyId, customMetricId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Get a custom metric to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom metric to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom metric to retrieve.
    String customMetricId = "customMetricId_example"; // String | The ID of the custom metric to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      CustomMetric result = apiInstance.analyticsManagementCustomMetricsGet(accountId, webPropertyId, customMetricId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomMetricsGet");
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
| **accountId** | **String**| Account ID for the custom metric to retrieve. | |
| **webPropertyId** | **String**| Web property ID for the custom metric to retrieve. | |
| **customMetricId** | **String**| The ID of the custom metric to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**CustomMetric**](CustomMetric.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomMetricsInsert"></a>
# **analyticsManagementCustomMetricsInsert**
> CustomMetric analyticsManagementCustomMetricsInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, customMetric)



Create a new custom metric.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom metric to create.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom dimension to create.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    CustomMetric customMetric = new CustomMetric(); // CustomMetric | 
    try {
      CustomMetric result = apiInstance.analyticsManagementCustomMetricsInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, customMetric);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomMetricsInsert");
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
| **accountId** | **String**| Account ID for the custom metric to create. | |
| **webPropertyId** | **String**| Web property ID for the custom dimension to create. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **customMetric** | [**CustomMetric**](CustomMetric.md)|  | [optional] |

### Return type

[**CustomMetric**](CustomMetric.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomMetricsList"></a>
# **analyticsManagementCustomMetricsList**
> CustomMetrics analyticsManagementCustomMetricsList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists custom metrics to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom metrics to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom metrics to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of custom metrics to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      CustomMetrics result = apiInstance.analyticsManagementCustomMetricsList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomMetricsList");
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
| **accountId** | **String**| Account ID for the custom metrics to retrieve. | |
| **webPropertyId** | **String**| Web property ID for the custom metrics to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of custom metrics to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**CustomMetrics**](CustomMetrics.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomMetricsPatch"></a>
# **analyticsManagementCustomMetricsPatch**
> CustomMetric analyticsManagementCustomMetricsPatch(accountId, webPropertyId, customMetricId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customMetric)



Updates an existing custom metric. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom metric to update.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom metric to update.
    String customMetricId = "customMetricId_example"; // String | Custom metric ID for the custom metric to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Boolean ignoreCustomDataSourceLinks = true; // Boolean | Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    CustomMetric customMetric = new CustomMetric(); // CustomMetric | 
    try {
      CustomMetric result = apiInstance.analyticsManagementCustomMetricsPatch(accountId, webPropertyId, customMetricId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customMetric);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomMetricsPatch");
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
| **accountId** | **String**| Account ID for the custom metric to update. | |
| **webPropertyId** | **String**| Web property ID for the custom metric to update. | |
| **customMetricId** | **String**| Custom metric ID for the custom metric to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **ignoreCustomDataSourceLinks** | **Boolean**| Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set. | [optional] |
| **customMetric** | [**CustomMetric**](CustomMetric.md)|  | [optional] |

### Return type

[**CustomMetric**](CustomMetric.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementCustomMetricsUpdate"></a>
# **analyticsManagementCustomMetricsUpdate**
> CustomMetric analyticsManagementCustomMetricsUpdate(accountId, webPropertyId, customMetricId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customMetric)



Updates an existing custom metric.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the custom metric to update.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the custom metric to update.
    String customMetricId = "customMetricId_example"; // String | Custom metric ID for the custom metric to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Boolean ignoreCustomDataSourceLinks = true; // Boolean | Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    CustomMetric customMetric = new CustomMetric(); // CustomMetric | 
    try {
      CustomMetric result = apiInstance.analyticsManagementCustomMetricsUpdate(accountId, webPropertyId, customMetricId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, ignoreCustomDataSourceLinks, customMetric);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementCustomMetricsUpdate");
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
| **accountId** | **String**| Account ID for the custom metric to update. | |
| **webPropertyId** | **String**| Web property ID for the custom metric to update. | |
| **customMetricId** | **String**| Custom metric ID for the custom metric to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **ignoreCustomDataSourceLinks** | **Boolean**| Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set. | [optional] |
| **customMetric** | [**CustomMetric**](CustomMetric.md)|  | [optional] |

### Return type

[**CustomMetric**](CustomMetric.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementExperimentsDelete"></a>
# **analyticsManagementExperimentsDelete**
> analyticsManagementExperimentsDelete(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Delete an experiment.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the experiment belongs
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to which the experiment belongs
    String profileId = "profileId_example"; // String | View (Profile) ID to which the experiment belongs
    String experimentId = "experimentId_example"; // String | ID of the experiment to delete
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementExperimentsDelete(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementExperimentsDelete");
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
| **accountId** | **String**| Account ID to which the experiment belongs | |
| **webPropertyId** | **String**| Web property ID to which the experiment belongs | |
| **profileId** | **String**| View (Profile) ID to which the experiment belongs | |
| **experimentId** | **String**| ID of the experiment to delete | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementExperimentsGet"></a>
# **analyticsManagementExperimentsGet**
> Experiment analyticsManagementExperimentsGet(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Returns an experiment to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve the experiment for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve the experiment for.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve the experiment for.
    String experimentId = "experimentId_example"; // String | Experiment ID to retrieve the experiment for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Experiment result = apiInstance.analyticsManagementExperimentsGet(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementExperimentsGet");
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
| **accountId** | **String**| Account ID to retrieve the experiment for. | |
| **webPropertyId** | **String**| Web property ID to retrieve the experiment for. | |
| **profileId** | **String**| View (Profile) ID to retrieve the experiment for. | |
| **experimentId** | **String**| Experiment ID to retrieve the experiment for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Experiment**](Experiment.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementExperimentsInsert"></a>
# **analyticsManagementExperimentsInsert**
> Experiment analyticsManagementExperimentsInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, experiment)



Create a new experiment.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the experiment for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to create the experiment for.
    String profileId = "profileId_example"; // String | View (Profile) ID to create the experiment for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Experiment experiment = new Experiment(); // Experiment | 
    try {
      Experiment result = apiInstance.analyticsManagementExperimentsInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, experiment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementExperimentsInsert");
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
| **accountId** | **String**| Account ID to create the experiment for. | |
| **webPropertyId** | **String**| Web property ID to create the experiment for. | |
| **profileId** | **String**| View (Profile) ID to create the experiment for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **experiment** | [**Experiment**](Experiment.md)|  | [optional] |

### Return type

[**Experiment**](Experiment.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementExperimentsList"></a>
# **analyticsManagementExperimentsList**
> Experiments analyticsManagementExperimentsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists experiments to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve experiments for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve experiments for.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve experiments for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of experiments to include in this response.
    Integer startIndex = 56; // Integer | An index of the first experiment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Experiments result = apiInstance.analyticsManagementExperimentsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementExperimentsList");
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
| **accountId** | **String**| Account ID to retrieve experiments for. | |
| **webPropertyId** | **String**| Web property ID to retrieve experiments for. | |
| **profileId** | **String**| View (Profile) ID to retrieve experiments for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of experiments to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first experiment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Experiments**](Experiments.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementExperimentsPatch"></a>
# **analyticsManagementExperimentsPatch**
> Experiment analyticsManagementExperimentsPatch(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, experiment)



Update an existing experiment. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID of the experiment to update.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID of the experiment to update.
    String profileId = "profileId_example"; // String | View (Profile) ID of the experiment to update.
    String experimentId = "experimentId_example"; // String | Experiment ID of the experiment to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Experiment experiment = new Experiment(); // Experiment | 
    try {
      Experiment result = apiInstance.analyticsManagementExperimentsPatch(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, experiment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementExperimentsPatch");
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
| **accountId** | **String**| Account ID of the experiment to update. | |
| **webPropertyId** | **String**| Web property ID of the experiment to update. | |
| **profileId** | **String**| View (Profile) ID of the experiment to update. | |
| **experimentId** | **String**| Experiment ID of the experiment to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **experiment** | [**Experiment**](Experiment.md)|  | [optional] |

### Return type

[**Experiment**](Experiment.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementExperimentsUpdate"></a>
# **analyticsManagementExperimentsUpdate**
> Experiment analyticsManagementExperimentsUpdate(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, experiment)



Update an existing experiment.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID of the experiment to update.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID of the experiment to update.
    String profileId = "profileId_example"; // String | View (Profile) ID of the experiment to update.
    String experimentId = "experimentId_example"; // String | Experiment ID of the experiment to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Experiment experiment = new Experiment(); // Experiment | 
    try {
      Experiment result = apiInstance.analyticsManagementExperimentsUpdate(accountId, webPropertyId, profileId, experimentId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, experiment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementExperimentsUpdate");
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
| **accountId** | **String**| Account ID of the experiment to update. | |
| **webPropertyId** | **String**| Web property ID of the experiment to update. | |
| **profileId** | **String**| View (Profile) ID of the experiment to update. | |
| **experimentId** | **String**| Experiment ID of the experiment to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **experiment** | [**Experiment**](Experiment.md)|  | [optional] |

### Return type

[**Experiment**](Experiment.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementFiltersDelete"></a>
# **analyticsManagementFiltersDelete**
> Filter analyticsManagementFiltersDelete(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Delete a filter.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to delete the filter for.
    String filterId = "filterId_example"; // String | ID of the filter to be deleted.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Filter result = apiInstance.analyticsManagementFiltersDelete(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementFiltersDelete");
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
| **accountId** | **String**| Account ID to delete the filter for. | |
| **filterId** | **String**| ID of the filter to be deleted. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Filter**](Filter.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementFiltersGet"></a>
# **analyticsManagementFiltersGet**
> Filter analyticsManagementFiltersGet(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Returns filters to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve filters for.
    String filterId = "filterId_example"; // String | Filter ID to retrieve filters for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Filter result = apiInstance.analyticsManagementFiltersGet(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementFiltersGet");
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
| **accountId** | **String**| Account ID to retrieve filters for. | |
| **filterId** | **String**| Filter ID to retrieve filters for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Filter**](Filter.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementFiltersInsert"></a>
# **analyticsManagementFiltersInsert**
> Filter analyticsManagementFiltersInsert(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, filter)



Create a new filter.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create filter for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Filter filter = new Filter(); // Filter | 
    try {
      Filter result = apiInstance.analyticsManagementFiltersInsert(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementFiltersInsert");
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
| **accountId** | **String**| Account ID to create filter for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **filter** | [**Filter**](Filter.md)|  | [optional] |

### Return type

[**Filter**](Filter.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementFiltersList"></a>
# **analyticsManagementFiltersList**
> Filters analyticsManagementFiltersList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists all filters for an account

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve filters for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of filters to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Filters result = apiInstance.analyticsManagementFiltersList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementFiltersList");
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
| **accountId** | **String**| Account ID to retrieve filters for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of filters to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Filters**](Filters.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementFiltersPatch"></a>
# **analyticsManagementFiltersPatch**
> Filter analyticsManagementFiltersPatch(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, filter)



Updates an existing filter. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the filter belongs.
    String filterId = "filterId_example"; // String | ID of the filter to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Filter filter = new Filter(); // Filter | 
    try {
      Filter result = apiInstance.analyticsManagementFiltersPatch(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementFiltersPatch");
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
| **accountId** | **String**| Account ID to which the filter belongs. | |
| **filterId** | **String**| ID of the filter to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **filter** | [**Filter**](Filter.md)|  | [optional] |

### Return type

[**Filter**](Filter.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementFiltersUpdate"></a>
# **analyticsManagementFiltersUpdate**
> Filter analyticsManagementFiltersUpdate(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, filter)



Updates an existing filter.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the filter belongs.
    String filterId = "filterId_example"; // String | ID of the filter to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Filter filter = new Filter(); // Filter | 
    try {
      Filter result = apiInstance.analyticsManagementFiltersUpdate(accountId, filterId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementFiltersUpdate");
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
| **accountId** | **String**| Account ID to which the filter belongs. | |
| **filterId** | **String**| ID of the filter to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **filter** | [**Filter**](Filter.md)|  | [optional] |

### Return type

[**Filter**](Filter.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementGoalsGet"></a>
# **analyticsManagementGoalsGet**
> Goal analyticsManagementGoalsGet(accountId, webPropertyId, profileId, goalId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Gets a goal to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve the goal for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve the goal for.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve the goal for.
    String goalId = "goalId_example"; // String | Goal ID to retrieve the goal for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Goal result = apiInstance.analyticsManagementGoalsGet(accountId, webPropertyId, profileId, goalId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementGoalsGet");
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
| **accountId** | **String**| Account ID to retrieve the goal for. | |
| **webPropertyId** | **String**| Web property ID to retrieve the goal for. | |
| **profileId** | **String**| View (Profile) ID to retrieve the goal for. | |
| **goalId** | **String**| Goal ID to retrieve the goal for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Goal**](Goal.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementGoalsInsert"></a>
# **analyticsManagementGoalsInsert**
> Goal analyticsManagementGoalsInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, goal)



Create a new goal.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the goal for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to create the goal for.
    String profileId = "profileId_example"; // String | View (Profile) ID to create the goal for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Goal goal = new Goal(); // Goal | 
    try {
      Goal result = apiInstance.analyticsManagementGoalsInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, goal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementGoalsInsert");
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
| **accountId** | **String**| Account ID to create the goal for. | |
| **webPropertyId** | **String**| Web property ID to create the goal for. | |
| **profileId** | **String**| View (Profile) ID to create the goal for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **goal** | [**Goal**](Goal.md)|  | [optional] |

### Return type

[**Goal**](Goal.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementGoalsList"></a>
# **analyticsManagementGoalsList**
> Goals analyticsManagementGoalsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
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
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of goals to include in this response.
    Integer startIndex = 56; // Integer | An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Goals result = apiInstance.analyticsManagementGoalsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
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
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of goals to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Goals**](Goals.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementGoalsPatch"></a>
# **analyticsManagementGoalsPatch**
> Goal analyticsManagementGoalsPatch(accountId, webPropertyId, profileId, goalId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, goal)



Updates an existing goal. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to update the goal.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to update the goal.
    String profileId = "profileId_example"; // String | View (Profile) ID to update the goal.
    String goalId = "goalId_example"; // String | Index of the goal to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Goal goal = new Goal(); // Goal | 
    try {
      Goal result = apiInstance.analyticsManagementGoalsPatch(accountId, webPropertyId, profileId, goalId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, goal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementGoalsPatch");
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
| **accountId** | **String**| Account ID to update the goal. | |
| **webPropertyId** | **String**| Web property ID to update the goal. | |
| **profileId** | **String**| View (Profile) ID to update the goal. | |
| **goalId** | **String**| Index of the goal to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **goal** | [**Goal**](Goal.md)|  | [optional] |

### Return type

[**Goal**](Goal.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementGoalsUpdate"></a>
# **analyticsManagementGoalsUpdate**
> Goal analyticsManagementGoalsUpdate(accountId, webPropertyId, profileId, goalId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, goal)



Updates an existing goal.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to update the goal.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to update the goal.
    String profileId = "profileId_example"; // String | View (Profile) ID to update the goal.
    String goalId = "goalId_example"; // String | Index of the goal to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Goal goal = new Goal(); // Goal | 
    try {
      Goal result = apiInstance.analyticsManagementGoalsUpdate(accountId, webPropertyId, profileId, goalId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, goal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementGoalsUpdate");
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
| **accountId** | **String**| Account ID to update the goal. | |
| **webPropertyId** | **String**| Web property ID to update the goal. | |
| **profileId** | **String**| View (Profile) ID to update the goal. | |
| **goalId** | **String**| Index of the goal to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **goal** | [**Goal**](Goal.md)|  | [optional] |

### Return type

[**Goal**](Goal.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileFilterLinksDelete"></a>
# **analyticsManagementProfileFilterLinksDelete**
> analyticsManagementProfileFilterLinksDelete(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Delete a profile filter link.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the profile filter link belongs.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id to which the profile filter link belongs.
    String profileId = "profileId_example"; // String | Profile ID to which the filter link belongs.
    String linkId = "linkId_example"; // String | ID of the profile filter link to delete.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementProfileFilterLinksDelete(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileFilterLinksDelete");
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
| **accountId** | **String**| Account ID to which the profile filter link belongs. | |
| **webPropertyId** | **String**| Web property Id to which the profile filter link belongs. | |
| **profileId** | **String**| Profile ID to which the filter link belongs. | |
| **linkId** | **String**| ID of the profile filter link to delete. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementProfileFilterLinksGet"></a>
# **analyticsManagementProfileFilterLinksGet**
> ProfileFilterLink analyticsManagementProfileFilterLinksGet(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Returns a single profile filter link.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve profile filter link for.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id to retrieve profile filter link for.
    String profileId = "profileId_example"; // String | Profile ID to retrieve filter link for.
    String linkId = "linkId_example"; // String | ID of the profile filter link.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      ProfileFilterLink result = apiInstance.analyticsManagementProfileFilterLinksGet(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileFilterLinksGet");
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
| **accountId** | **String**| Account ID to retrieve profile filter link for. | |
| **webPropertyId** | **String**| Web property Id to retrieve profile filter link for. | |
| **profileId** | **String**| Profile ID to retrieve filter link for. | |
| **linkId** | **String**| ID of the profile filter link. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**ProfileFilterLink**](ProfileFilterLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileFilterLinksInsert"></a>
# **analyticsManagementProfileFilterLinksInsert**
> ProfileFilterLink analyticsManagementProfileFilterLinksInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profileFilterLink)



Create a new profile filter link.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create profile filter link for.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id to create profile filter link for.
    String profileId = "profileId_example"; // String | Profile ID to create filter link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    ProfileFilterLink profileFilterLink = new ProfileFilterLink(); // ProfileFilterLink | 
    try {
      ProfileFilterLink result = apiInstance.analyticsManagementProfileFilterLinksInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profileFilterLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileFilterLinksInsert");
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
| **accountId** | **String**| Account ID to create profile filter link for. | |
| **webPropertyId** | **String**| Web property Id to create profile filter link for. | |
| **profileId** | **String**| Profile ID to create filter link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **profileFilterLink** | [**ProfileFilterLink**](ProfileFilterLink.md)|  | [optional] |

### Return type

[**ProfileFilterLink**](ProfileFilterLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileFilterLinksList"></a>
# **analyticsManagementProfileFilterLinksList**
> ProfileFilterLinks analyticsManagementProfileFilterLinksList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists all profile filter links for a profile.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve profile filter links for.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id for profile filter links for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    String profileId = "profileId_example"; // String | Profile ID to retrieve filter links for. Can either be a specific profile ID or '~all', which refers to all the profiles that user has access to.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of profile filter links to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      ProfileFilterLinks result = apiInstance.analyticsManagementProfileFilterLinksList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileFilterLinksList");
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
| **accountId** | **String**| Account ID to retrieve profile filter links for. | |
| **webPropertyId** | **String**| Web property Id for profile filter links for. Can either be a specific web property ID or &#39;~all&#39;, which refers to all the web properties that user has access to. | |
| **profileId** | **String**| Profile ID to retrieve filter links for. Can either be a specific profile ID or &#39;~all&#39;, which refers to all the profiles that user has access to. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of profile filter links to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**ProfileFilterLinks**](ProfileFilterLinks.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileFilterLinksPatch"></a>
# **analyticsManagementProfileFilterLinksPatch**
> ProfileFilterLink analyticsManagementProfileFilterLinksPatch(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profileFilterLink)



Update an existing profile filter link. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which profile filter link belongs.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id to which profile filter link belongs
    String profileId = "profileId_example"; // String | Profile ID to which filter link belongs
    String linkId = "linkId_example"; // String | ID of the profile filter link to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    ProfileFilterLink profileFilterLink = new ProfileFilterLink(); // ProfileFilterLink | 
    try {
      ProfileFilterLink result = apiInstance.analyticsManagementProfileFilterLinksPatch(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profileFilterLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileFilterLinksPatch");
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
| **accountId** | **String**| Account ID to which profile filter link belongs. | |
| **webPropertyId** | **String**| Web property Id to which profile filter link belongs | |
| **profileId** | **String**| Profile ID to which filter link belongs | |
| **linkId** | **String**| ID of the profile filter link to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **profileFilterLink** | [**ProfileFilterLink**](ProfileFilterLink.md)|  | [optional] |

### Return type

[**ProfileFilterLink**](ProfileFilterLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileFilterLinksUpdate"></a>
# **analyticsManagementProfileFilterLinksUpdate**
> ProfileFilterLink analyticsManagementProfileFilterLinksUpdate(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profileFilterLink)



Update an existing profile filter link.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which profile filter link belongs.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id to which profile filter link belongs
    String profileId = "profileId_example"; // String | Profile ID to which filter link belongs
    String linkId = "linkId_example"; // String | ID of the profile filter link to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    ProfileFilterLink profileFilterLink = new ProfileFilterLink(); // ProfileFilterLink | 
    try {
      ProfileFilterLink result = apiInstance.analyticsManagementProfileFilterLinksUpdate(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profileFilterLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileFilterLinksUpdate");
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
| **accountId** | **String**| Account ID to which profile filter link belongs. | |
| **webPropertyId** | **String**| Web property Id to which profile filter link belongs | |
| **profileId** | **String**| Profile ID to which filter link belongs | |
| **linkId** | **String**| ID of the profile filter link to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **profileFilterLink** | [**ProfileFilterLink**](ProfileFilterLink.md)|  | [optional] |

### Return type

[**ProfileFilterLink**](ProfileFilterLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileUserLinksDelete"></a>
# **analyticsManagementProfileUserLinksDelete**
> analyticsManagementProfileUserLinksDelete(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Removes a user from the given view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to delete the user link for.
    String webPropertyId = "webPropertyId_example"; // String | Web Property ID to delete the user link for.
    String profileId = "profileId_example"; // String | View (Profile) ID to delete the user link for.
    String linkId = "linkId_example"; // String | Link ID to delete the user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementProfileUserLinksDelete(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileUserLinksDelete");
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
| **accountId** | **String**| Account ID to delete the user link for. | |
| **webPropertyId** | **String**| Web Property ID to delete the user link for. | |
| **profileId** | **String**| View (Profile) ID to delete the user link for. | |
| **linkId** | **String**| Link ID to delete the user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementProfileUserLinksInsert"></a>
# **analyticsManagementProfileUserLinksInsert**
> EntityUserLink analyticsManagementProfileUserLinksInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink)



Adds a new user to the given view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the user link for.
    String webPropertyId = "webPropertyId_example"; // String | Web Property ID to create the user link for.
    String profileId = "profileId_example"; // String | View (Profile) ID to create the user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityUserLink entityUserLink = new EntityUserLink(); // EntityUserLink | 
    try {
      EntityUserLink result = apiInstance.analyticsManagementProfileUserLinksInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileUserLinksInsert");
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
| **accountId** | **String**| Account ID to create the user link for. | |
| **webPropertyId** | **String**| Web Property ID to create the user link for. | |
| **profileId** | **String**| View (Profile) ID to create the user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityUserLink** | [**EntityUserLink**](EntityUserLink.md)|  | [optional] |

### Return type

[**EntityUserLink**](EntityUserLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileUserLinksList"></a>
# **analyticsManagementProfileUserLinksList**
> EntityUserLinks analyticsManagementProfileUserLinksList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists profile-user links for a given view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID which the given view (profile) belongs to.
    String webPropertyId = "webPropertyId_example"; // String | Web Property ID which the given view (profile) belongs to. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve the profile-user links for. Can either be a specific profile ID or '~all', which refers to all the profiles that user has access to.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of profile-user links to include in this response.
    Integer startIndex = 56; // Integer | An index of the first profile-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      EntityUserLinks result = apiInstance.analyticsManagementProfileUserLinksList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileUserLinksList");
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
| **accountId** | **String**| Account ID which the given view (profile) belongs to. | |
| **webPropertyId** | **String**| Web Property ID which the given view (profile) belongs to. Can either be a specific web property ID or &#39;~all&#39;, which refers to all the web properties that user has access to. | |
| **profileId** | **String**| View (Profile) ID to retrieve the profile-user links for. Can either be a specific profile ID or &#39;~all&#39;, which refers to all the profiles that user has access to. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of profile-user links to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first profile-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**EntityUserLinks**](EntityUserLinks.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfileUserLinksUpdate"></a>
# **analyticsManagementProfileUserLinksUpdate**
> EntityUserLink analyticsManagementProfileUserLinksUpdate(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink)



Updates permissions for an existing user on the given view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to update the user link for.
    String webPropertyId = "webPropertyId_example"; // String | Web Property ID to update the user link for.
    String profileId = "profileId_example"; // String | View (Profile ID) to update the user link for.
    String linkId = "linkId_example"; // String | Link ID to update the user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityUserLink entityUserLink = new EntityUserLink(); // EntityUserLink | 
    try {
      EntityUserLink result = apiInstance.analyticsManagementProfileUserLinksUpdate(accountId, webPropertyId, profileId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfileUserLinksUpdate");
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
| **accountId** | **String**| Account ID to update the user link for. | |
| **webPropertyId** | **String**| Web Property ID to update the user link for. | |
| **profileId** | **String**| View (Profile ID) to update the user link for. | |
| **linkId** | **String**| Link ID to update the user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityUserLink** | [**EntityUserLink**](EntityUserLink.md)|  | [optional] |

### Return type

[**EntityUserLink**](EntityUserLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfilesDelete"></a>
# **analyticsManagementProfilesDelete**
> analyticsManagementProfilesDelete(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Deletes a view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to delete the view (profile) for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to delete the view (profile) for.
    String profileId = "profileId_example"; // String | ID of the view (profile) to be deleted.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementProfilesDelete(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfilesDelete");
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
| **accountId** | **String**| Account ID to delete the view (profile) for. | |
| **webPropertyId** | **String**| Web property ID to delete the view (profile) for. | |
| **profileId** | **String**| ID of the view (profile) to be deleted. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementProfilesGet"></a>
# **analyticsManagementProfilesGet**
> Profile analyticsManagementProfilesGet(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Gets a view (profile) to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve the view (profile) for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve the view (profile) for.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve the view (profile) for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Profile result = apiInstance.analyticsManagementProfilesGet(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfilesGet");
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
| **accountId** | **String**| Account ID to retrieve the view (profile) for. | |
| **webPropertyId** | **String**| Web property ID to retrieve the view (profile) for. | |
| **profileId** | **String**| View (Profile) ID to retrieve the view (profile) for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Profile**](Profile.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfilesInsert"></a>
# **analyticsManagementProfilesInsert**
> Profile analyticsManagementProfilesInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profile)



Create a new view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the view (profile) for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to create the view (profile) for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Profile profile = new Profile(); // Profile | 
    try {
      Profile result = apiInstance.analyticsManagementProfilesInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfilesInsert");
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
| **accountId** | **String**| Account ID to create the view (profile) for. | |
| **webPropertyId** | **String**| Web property ID to create the view (profile) for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **profile** | [**Profile**](Profile.md)|  | [optional] |

### Return type

[**Profile**](Profile.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfilesList"></a>
# **analyticsManagementProfilesList**
> Profiles analyticsManagementProfilesList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID for the view (profiles) to retrieve. Can either be a specific account ID or '~all', which refers to all the accounts to which the user has access.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties to which the user has access.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of views (profiles) to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Profiles result = apiInstance.analyticsManagementProfilesList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
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
| **accountId** | **String**| Account ID for the view (profiles) to retrieve. Can either be a specific account ID or &#39;~all&#39;, which refers to all the accounts to which the user has access. | |
| **webPropertyId** | **String**| Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or &#39;~all&#39;, which refers to all the web properties to which the user has access. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of views (profiles) to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Profiles**](Profiles.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfilesPatch"></a>
# **analyticsManagementProfilesPatch**
> Profile analyticsManagementProfilesPatch(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profile)



Updates an existing view (profile). This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the view (profile) belongs
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to which the view (profile) belongs
    String profileId = "profileId_example"; // String | ID of the view (profile) to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Profile profile = new Profile(); // Profile | 
    try {
      Profile result = apiInstance.analyticsManagementProfilesPatch(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfilesPatch");
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
| **accountId** | **String**| Account ID to which the view (profile) belongs | |
| **webPropertyId** | **String**| Web property ID to which the view (profile) belongs | |
| **profileId** | **String**| ID of the view (profile) to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **profile** | [**Profile**](Profile.md)|  | [optional] |

### Return type

[**Profile**](Profile.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementProfilesUpdate"></a>
# **analyticsManagementProfilesUpdate**
> Profile analyticsManagementProfilesUpdate(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profile)



Updates an existing view (profile).

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the view (profile) belongs
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to which the view (profile) belongs
    String profileId = "profileId_example"; // String | ID of the view (profile) to be updated.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Profile profile = new Profile(); // Profile | 
    try {
      Profile result = apiInstance.analyticsManagementProfilesUpdate(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, profile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementProfilesUpdate");
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
| **accountId** | **String**| Account ID to which the view (profile) belongs | |
| **webPropertyId** | **String**| Web property ID to which the view (profile) belongs | |
| **profileId** | **String**| ID of the view (profile) to be updated. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **profile** | [**Profile**](Profile.md)|  | [optional] |

### Return type

[**Profile**](Profile.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementRemarketingAudienceDelete"></a>
# **analyticsManagementRemarketingAudienceDelete**
> analyticsManagementRemarketingAudienceDelete(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Delete a remarketing audience.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the remarketing audience belongs.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to which the remarketing audience belongs.
    String remarketingAudienceId = "remarketingAudienceId_example"; // String | The ID of the remarketing audience to delete.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementRemarketingAudienceDelete(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementRemarketingAudienceDelete");
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
| **accountId** | **String**| Account ID to which the remarketing audience belongs. | |
| **webPropertyId** | **String**| Web property ID to which the remarketing audience belongs. | |
| **remarketingAudienceId** | **String**| The ID of the remarketing audience to delete. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementRemarketingAudienceGet"></a>
# **analyticsManagementRemarketingAudienceGet**
> RemarketingAudience analyticsManagementRemarketingAudienceGet(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Gets a remarketing audience to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | The account ID of the remarketing audience to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | The web property ID of the remarketing audience to retrieve.
    String remarketingAudienceId = "remarketingAudienceId_example"; // String | The ID of the remarketing audience to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      RemarketingAudience result = apiInstance.analyticsManagementRemarketingAudienceGet(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementRemarketingAudienceGet");
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
| **accountId** | **String**| The account ID of the remarketing audience to retrieve. | |
| **webPropertyId** | **String**| The web property ID of the remarketing audience to retrieve. | |
| **remarketingAudienceId** | **String**| The ID of the remarketing audience to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**RemarketingAudience**](RemarketingAudience.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementRemarketingAudienceInsert"></a>
# **analyticsManagementRemarketingAudienceInsert**
> RemarketingAudience analyticsManagementRemarketingAudienceInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, remarketingAudience)



Creates a new remarketing audience.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | The account ID for which to create the remarketing audience.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID for which to create the remarketing audience.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    RemarketingAudience remarketingAudience = new RemarketingAudience(); // RemarketingAudience | 
    try {
      RemarketingAudience result = apiInstance.analyticsManagementRemarketingAudienceInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, remarketingAudience);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementRemarketingAudienceInsert");
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
| **accountId** | **String**| The account ID for which to create the remarketing audience. | |
| **webPropertyId** | **String**| Web property ID for which to create the remarketing audience. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **remarketingAudience** | [**RemarketingAudience**](RemarketingAudience.md)|  | [optional] |

### Return type

[**RemarketingAudience**](RemarketingAudience.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementRemarketingAudienceList"></a>
# **analyticsManagementRemarketingAudienceList**
> RemarketingAudiences analyticsManagementRemarketingAudienceList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex, type)



Lists remarketing audiences to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | The account ID of the remarketing audiences to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | The web property ID of the remarketing audiences to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of remarketing audiences to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    String type = "type_example"; // String | 
    try {
      RemarketingAudiences result = apiInstance.analyticsManagementRemarketingAudienceList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementRemarketingAudienceList");
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
| **accountId** | **String**| The account ID of the remarketing audiences to retrieve. | |
| **webPropertyId** | **String**| The web property ID of the remarketing audiences to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of remarketing audiences to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |
| **type** | **String**|  | [optional] |

### Return type

[**RemarketingAudiences**](RemarketingAudiences.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementRemarketingAudiencePatch"></a>
# **analyticsManagementRemarketingAudiencePatch**
> RemarketingAudience analyticsManagementRemarketingAudiencePatch(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, remarketingAudience)



Updates an existing remarketing audience. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | The account ID of the remarketing audience to update.
    String webPropertyId = "webPropertyId_example"; // String | The web property ID of the remarketing audience to update.
    String remarketingAudienceId = "remarketingAudienceId_example"; // String | The ID of the remarketing audience to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    RemarketingAudience remarketingAudience = new RemarketingAudience(); // RemarketingAudience | 
    try {
      RemarketingAudience result = apiInstance.analyticsManagementRemarketingAudiencePatch(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, remarketingAudience);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementRemarketingAudiencePatch");
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
| **accountId** | **String**| The account ID of the remarketing audience to update. | |
| **webPropertyId** | **String**| The web property ID of the remarketing audience to update. | |
| **remarketingAudienceId** | **String**| The ID of the remarketing audience to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **remarketingAudience** | [**RemarketingAudience**](RemarketingAudience.md)|  | [optional] |

### Return type

[**RemarketingAudience**](RemarketingAudience.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementRemarketingAudienceUpdate"></a>
# **analyticsManagementRemarketingAudienceUpdate**
> RemarketingAudience analyticsManagementRemarketingAudienceUpdate(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, remarketingAudience)



Updates an existing remarketing audience.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | The account ID of the remarketing audience to update.
    String webPropertyId = "webPropertyId_example"; // String | The web property ID of the remarketing audience to update.
    String remarketingAudienceId = "remarketingAudienceId_example"; // String | The ID of the remarketing audience to update.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    RemarketingAudience remarketingAudience = new RemarketingAudience(); // RemarketingAudience | 
    try {
      RemarketingAudience result = apiInstance.analyticsManagementRemarketingAudienceUpdate(accountId, webPropertyId, remarketingAudienceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, remarketingAudience);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementRemarketingAudienceUpdate");
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
| **accountId** | **String**| The account ID of the remarketing audience to update. | |
| **webPropertyId** | **String**| The web property ID of the remarketing audience to update. | |
| **remarketingAudienceId** | **String**| The ID of the remarketing audience to update. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **remarketingAudience** | [**RemarketingAudience**](RemarketingAudience.md)|  | [optional] |

### Return type

[**RemarketingAudience**](RemarketingAudience.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementSegmentsList"></a>
# **analyticsManagementSegmentsList**
> Segments analyticsManagementSegmentsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists segments to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of segments to include in this response.
    Integer startIndex = 56; // Integer | An index of the first segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Segments result = apiInstance.analyticsManagementSegmentsList(alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
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
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of segments to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Segments**](Segments.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementUnsampledReportsDelete"></a>
# **analyticsManagementUnsampledReportsDelete**
> analyticsManagementUnsampledReportsDelete(accountId, webPropertyId, profileId, unsampledReportId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Deletes an unsampled report.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to delete the unsampled report for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to delete the unsampled reports for.
    String profileId = "profileId_example"; // String | View (Profile) ID to delete the unsampled report for.
    String unsampledReportId = "unsampledReportId_example"; // String | ID of the unsampled report to be deleted.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementUnsampledReportsDelete(accountId, webPropertyId, profileId, unsampledReportId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUnsampledReportsDelete");
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
| **accountId** | **String**| Account ID to delete the unsampled report for. | |
| **webPropertyId** | **String**| Web property ID to delete the unsampled reports for. | |
| **profileId** | **String**| View (Profile) ID to delete the unsampled report for. | |
| **unsampledReportId** | **String**| ID of the unsampled report to be deleted. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementUnsampledReportsGet"></a>
# **analyticsManagementUnsampledReportsGet**
> UnsampledReport analyticsManagementUnsampledReportsGet(accountId, webPropertyId, profileId, unsampledReportId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Returns a single unsampled report.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve unsampled report for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve unsampled reports for.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve unsampled report for.
    String unsampledReportId = "unsampledReportId_example"; // String | ID of the unsampled report to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      UnsampledReport result = apiInstance.analyticsManagementUnsampledReportsGet(accountId, webPropertyId, profileId, unsampledReportId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUnsampledReportsGet");
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
| **accountId** | **String**| Account ID to retrieve unsampled report for. | |
| **webPropertyId** | **String**| Web property ID to retrieve unsampled reports for. | |
| **profileId** | **String**| View (Profile) ID to retrieve unsampled report for. | |
| **unsampledReportId** | **String**| ID of the unsampled report to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**UnsampledReport**](UnsampledReport.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementUnsampledReportsInsert"></a>
# **analyticsManagementUnsampledReportsInsert**
> UnsampledReport analyticsManagementUnsampledReportsInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, unsampledReport)



Create a new unsampled report.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the unsampled report for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to create the unsampled report for.
    String profileId = "profileId_example"; // String | View (Profile) ID to create the unsampled report for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    UnsampledReport unsampledReport = new UnsampledReport(); // UnsampledReport | 
    try {
      UnsampledReport result = apiInstance.analyticsManagementUnsampledReportsInsert(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, unsampledReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUnsampledReportsInsert");
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
| **accountId** | **String**| Account ID to create the unsampled report for. | |
| **webPropertyId** | **String**| Web property ID to create the unsampled report for. | |
| **profileId** | **String**| View (Profile) ID to create the unsampled report for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **unsampledReport** | [**UnsampledReport**](UnsampledReport.md)|  | [optional] |

### Return type

[**UnsampledReport**](UnsampledReport.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementUnsampledReportsList"></a>
# **analyticsManagementUnsampledReportsList**
> UnsampledReports analyticsManagementUnsampledReportsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists unsampled reports to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve unsampled reports for. Must be a specific account ID, ~all is not supported.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve unsampled reports for. Must be a specific web property ID, ~all is not supported.
    String profileId = "profileId_example"; // String | View (Profile) ID to retrieve unsampled reports for. Must be a specific view (profile) ID, ~all is not supported.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of unsampled reports to include in this response.
    Integer startIndex = 56; // Integer | An index of the first unsampled report to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      UnsampledReports result = apiInstance.analyticsManagementUnsampledReportsList(accountId, webPropertyId, profileId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUnsampledReportsList");
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
| **accountId** | **String**| Account ID to retrieve unsampled reports for. Must be a specific account ID, ~all is not supported. | |
| **webPropertyId** | **String**| Web property ID to retrieve unsampled reports for. Must be a specific web property ID, ~all is not supported. | |
| **profileId** | **String**| View (Profile) ID to retrieve unsampled reports for. Must be a specific view (profile) ID, ~all is not supported. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of unsampled reports to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first unsampled report to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**UnsampledReports**](UnsampledReports.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementUploadsDeleteUploadData"></a>
# **analyticsManagementUploadsDeleteUploadData**
> analyticsManagementUploadsDeleteUploadData(accountId, webPropertyId, customDataSourceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, analyticsDataimportDeleteUploadDataRequest)



Delete data associated with a previous upload.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account Id for the uploads to be deleted.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id for the uploads to be deleted.
    String customDataSourceId = "customDataSourceId_example"; // String | Custom data source Id for the uploads to be deleted.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    AnalyticsDataimportDeleteUploadDataRequest analyticsDataimportDeleteUploadDataRequest = new AnalyticsDataimportDeleteUploadDataRequest(); // AnalyticsDataimportDeleteUploadDataRequest | 
    try {
      apiInstance.analyticsManagementUploadsDeleteUploadData(accountId, webPropertyId, customDataSourceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, analyticsDataimportDeleteUploadDataRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUploadsDeleteUploadData");
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
| **accountId** | **String**| Account Id for the uploads to be deleted. | |
| **webPropertyId** | **String**| Web property Id for the uploads to be deleted. | |
| **customDataSourceId** | **String**| Custom data source Id for the uploads to be deleted. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **analyticsDataimportDeleteUploadDataRequest** | [**AnalyticsDataimportDeleteUploadDataRequest**](AnalyticsDataimportDeleteUploadDataRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementUploadsGet"></a>
# **analyticsManagementUploadsGet**
> Upload analyticsManagementUploadsGet(accountId, webPropertyId, customDataSourceId, uploadId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



List uploads to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account Id for the upload to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id for the upload to retrieve.
    String customDataSourceId = "customDataSourceId_example"; // String | Custom data source Id for upload to retrieve.
    String uploadId = "uploadId_example"; // String | Upload Id to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Upload result = apiInstance.analyticsManagementUploadsGet(accountId, webPropertyId, customDataSourceId, uploadId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUploadsGet");
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
| **accountId** | **String**| Account Id for the upload to retrieve. | |
| **webPropertyId** | **String**| Web property Id for the upload to retrieve. | |
| **customDataSourceId** | **String**| Custom data source Id for upload to retrieve. | |
| **uploadId** | **String**| Upload Id to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Upload**](Upload.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementUploadsList"></a>
# **analyticsManagementUploadsList**
> Uploads analyticsManagementUploadsList(accountId, webPropertyId, customDataSourceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



List uploads to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account Id for the uploads to retrieve.
    String webPropertyId = "webPropertyId_example"; // String | Web property Id for the uploads to retrieve.
    String customDataSourceId = "customDataSourceId_example"; // String | Custom data source Id for uploads to retrieve.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of uploads to include in this response.
    Integer startIndex = 56; // Integer | A 1-based index of the first upload to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Uploads result = apiInstance.analyticsManagementUploadsList(accountId, webPropertyId, customDataSourceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUploadsList");
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
| **accountId** | **String**| Account Id for the uploads to retrieve. | |
| **webPropertyId** | **String**| Web property Id for the uploads to retrieve. | |
| **customDataSourceId** | **String**| Custom data source Id for uploads to retrieve. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of uploads to include in this response. | [optional] |
| **startIndex** | **Integer**| A 1-based index of the first upload to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Uploads**](Uploads.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementUploadsUploadData"></a>
# **analyticsManagementUploadsUploadData**
> Upload analyticsManagementUploadsUploadData(accountId, webPropertyId, customDataSourceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Upload data for a custom data source.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account Id associated with the upload.
    String webPropertyId = "webPropertyId_example"; // String | Web property UA-string associated with the upload.
    String customDataSourceId = "customDataSourceId_example"; // String | Custom data source Id to which the data being uploaded belongs.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Upload result = apiInstance.analyticsManagementUploadsUploadData(accountId, webPropertyId, customDataSourceId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementUploadsUploadData");
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
| **accountId** | **String**| Account Id associated with the upload. | |
| **webPropertyId** | **String**| Web property UA-string associated with the upload. | |
| **customDataSourceId** | **String**| Custom data source Id to which the data being uploaded belongs. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Upload**](Upload.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebPropertyAdWordsLinksDelete"></a>
# **analyticsManagementWebPropertyAdWordsLinksDelete**
> analyticsManagementWebPropertyAdWordsLinksDelete(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Deletes a web property-Google Ads link.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | ID of the account which the given web property belongs to.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to delete the Google Ads link for.
    String webPropertyAdWordsLinkId = "webPropertyAdWordsLinkId_example"; // String | Web property Google Ads link ID.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementWebPropertyAdWordsLinksDelete(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebPropertyAdWordsLinksDelete");
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
| **accountId** | **String**| ID of the account which the given web property belongs to. | |
| **webPropertyId** | **String**| Web property ID to delete the Google Ads link for. | |
| **webPropertyAdWordsLinkId** | **String**| Web property Google Ads link ID. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementWebPropertyAdWordsLinksGet"></a>
# **analyticsManagementWebPropertyAdWordsLinksGet**
> EntityAdWordsLink analyticsManagementWebPropertyAdWordsLinksGet(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Returns a web property-Google Ads link to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | ID of the account which the given web property belongs to.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve the Google Ads link for.
    String webPropertyAdWordsLinkId = "webPropertyAdWordsLinkId_example"; // String | Web property-Google Ads link ID.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      EntityAdWordsLink result = apiInstance.analyticsManagementWebPropertyAdWordsLinksGet(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebPropertyAdWordsLinksGet");
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
| **accountId** | **String**| ID of the account which the given web property belongs to. | |
| **webPropertyId** | **String**| Web property ID to retrieve the Google Ads link for. | |
| **webPropertyAdWordsLinkId** | **String**| Web property-Google Ads link ID. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**EntityAdWordsLink**](EntityAdWordsLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebPropertyAdWordsLinksInsert"></a>
# **analyticsManagementWebPropertyAdWordsLinksInsert**
> EntityAdWordsLink analyticsManagementWebPropertyAdWordsLinksInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityAdWordsLink)



Creates a webProperty-Google Ads link.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | ID of the Google Analytics account to create the link for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to create the link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityAdWordsLink entityAdWordsLink = new EntityAdWordsLink(); // EntityAdWordsLink | 
    try {
      EntityAdWordsLink result = apiInstance.analyticsManagementWebPropertyAdWordsLinksInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityAdWordsLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebPropertyAdWordsLinksInsert");
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
| **accountId** | **String**| ID of the Google Analytics account to create the link for. | |
| **webPropertyId** | **String**| Web property ID to create the link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityAdWordsLink** | [**EntityAdWordsLink**](EntityAdWordsLink.md)|  | [optional] |

### Return type

[**EntityAdWordsLink**](EntityAdWordsLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebPropertyAdWordsLinksList"></a>
# **analyticsManagementWebPropertyAdWordsLinksList**
> EntityAdWordsLinks analyticsManagementWebPropertyAdWordsLinksList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists webProperty-Google Ads links for a given web property.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | ID of the account which the given web property belongs to.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve the Google Ads links for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of webProperty-Google Ads links to include in this response.
    Integer startIndex = 56; // Integer | An index of the first webProperty-Google Ads link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      EntityAdWordsLinks result = apiInstance.analyticsManagementWebPropertyAdWordsLinksList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebPropertyAdWordsLinksList");
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
| **accountId** | **String**| ID of the account which the given web property belongs to. | |
| **webPropertyId** | **String**| Web property ID to retrieve the Google Ads links for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of webProperty-Google Ads links to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first webProperty-Google Ads link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**EntityAdWordsLinks**](EntityAdWordsLinks.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebPropertyAdWordsLinksPatch"></a>
# **analyticsManagementWebPropertyAdWordsLinksPatch**
> EntityAdWordsLink analyticsManagementWebPropertyAdWordsLinksPatch(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityAdWordsLink)



Updates an existing webProperty-Google Ads link. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | ID of the account which the given web property belongs to.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve the Google Ads link for.
    String webPropertyAdWordsLinkId = "webPropertyAdWordsLinkId_example"; // String | Web property-Google Ads link ID.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityAdWordsLink entityAdWordsLink = new EntityAdWordsLink(); // EntityAdWordsLink | 
    try {
      EntityAdWordsLink result = apiInstance.analyticsManagementWebPropertyAdWordsLinksPatch(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityAdWordsLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebPropertyAdWordsLinksPatch");
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
| **accountId** | **String**| ID of the account which the given web property belongs to. | |
| **webPropertyId** | **String**| Web property ID to retrieve the Google Ads link for. | |
| **webPropertyAdWordsLinkId** | **String**| Web property-Google Ads link ID. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityAdWordsLink** | [**EntityAdWordsLink**](EntityAdWordsLink.md)|  | [optional] |

### Return type

[**EntityAdWordsLink**](EntityAdWordsLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebPropertyAdWordsLinksUpdate"></a>
# **analyticsManagementWebPropertyAdWordsLinksUpdate**
> EntityAdWordsLink analyticsManagementWebPropertyAdWordsLinksUpdate(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityAdWordsLink)



Updates an existing webProperty-Google Ads link.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | ID of the account which the given web property belongs to.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to retrieve the Google Ads link for.
    String webPropertyAdWordsLinkId = "webPropertyAdWordsLinkId_example"; // String | Web property-Google Ads link ID.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityAdWordsLink entityAdWordsLink = new EntityAdWordsLink(); // EntityAdWordsLink | 
    try {
      EntityAdWordsLink result = apiInstance.analyticsManagementWebPropertyAdWordsLinksUpdate(accountId, webPropertyId, webPropertyAdWordsLinkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityAdWordsLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebPropertyAdWordsLinksUpdate");
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
| **accountId** | **String**| ID of the account which the given web property belongs to. | |
| **webPropertyId** | **String**| Web property ID to retrieve the Google Ads link for. | |
| **webPropertyAdWordsLinkId** | **String**| Web property-Google Ads link ID. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityAdWordsLink** | [**EntityAdWordsLink**](EntityAdWordsLink.md)|  | [optional] |

### Return type

[**EntityAdWordsLink**](EntityAdWordsLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertiesGet"></a>
# **analyticsManagementWebpropertiesGet**
> Webproperty analyticsManagementWebpropertiesGet(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Gets a web property to which the user has access.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve the web property for.
    String webPropertyId = "webPropertyId_example"; // String | ID to retrieve the web property for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      Webproperty result = apiInstance.analyticsManagementWebpropertiesGet(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertiesGet");
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
| **accountId** | **String**| Account ID to retrieve the web property for. | |
| **webPropertyId** | **String**| ID to retrieve the web property for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

### Return type

[**Webproperty**](Webproperty.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertiesInsert"></a>
# **analyticsManagementWebpropertiesInsert**
> Webproperty analyticsManagementWebpropertiesInsert(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, webproperty)



Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at least one profile.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the web property for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Webproperty webproperty = new Webproperty(); // Webproperty | 
    try {
      Webproperty result = apiInstance.analyticsManagementWebpropertiesInsert(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, webproperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertiesInsert");
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
| **accountId** | **String**| Account ID to create the web property for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **webproperty** | [**Webproperty**](Webproperty.md)|  | [optional] |

### Return type

[**Webproperty**](Webproperty.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertiesList"></a>
# **analyticsManagementWebpropertiesList**
> Webproperties analyticsManagementWebpropertiesList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to retrieve web properties for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of web properties to include in this response.
    Integer startIndex = 56; // Integer | An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      Webproperties result = apiInstance.analyticsManagementWebpropertiesList(accountId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
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
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of web properties to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**Webproperties**](Webproperties.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertiesPatch"></a>
# **analyticsManagementWebpropertiesPatch**
> Webproperty analyticsManagementWebpropertiesPatch(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, webproperty)



Updates an existing web property. This method supports patch semantics.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the web property belongs
    String webPropertyId = "webPropertyId_example"; // String | Web property ID
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Webproperty webproperty = new Webproperty(); // Webproperty | 
    try {
      Webproperty result = apiInstance.analyticsManagementWebpropertiesPatch(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, webproperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertiesPatch");
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
| **accountId** | **String**| Account ID to which the web property belongs | |
| **webPropertyId** | **String**| Web property ID | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **webproperty** | [**Webproperty**](Webproperty.md)|  | [optional] |

### Return type

[**Webproperty**](Webproperty.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertiesUpdate"></a>
# **analyticsManagementWebpropertiesUpdate**
> Webproperty analyticsManagementWebpropertiesUpdate(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, webproperty)



Updates an existing web property.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to which the web property belongs
    String webPropertyId = "webPropertyId_example"; // String | Web property ID
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Webproperty webproperty = new Webproperty(); // Webproperty | 
    try {
      Webproperty result = apiInstance.analyticsManagementWebpropertiesUpdate(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, webproperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertiesUpdate");
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
| **accountId** | **String**| Account ID to which the web property belongs | |
| **webPropertyId** | **String**| Web property ID | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **webproperty** | [**Webproperty**](Webproperty.md)|  | [optional] |

### Return type

[**Webproperty**](Webproperty.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertyUserLinksDelete"></a>
# **analyticsManagementWebpropertyUserLinksDelete**
> analyticsManagementWebpropertyUserLinksDelete(accountId, webPropertyId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp)



Removes a user from the given web property.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to delete the user link for.
    String webPropertyId = "webPropertyId_example"; // String | Web Property ID to delete the user link for.
    String linkId = "linkId_example"; // String | Link ID to delete the user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    try {
      apiInstance.analyticsManagementWebpropertyUserLinksDelete(accountId, webPropertyId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertyUserLinksDelete");
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
| **accountId** | **String**| Account ID to delete the user link for. | |
| **webPropertyId** | **String**| Web Property ID to delete the user link for. | |
| **linkId** | **String**| Link ID to delete the user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |

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

<a id="analyticsManagementWebpropertyUserLinksInsert"></a>
# **analyticsManagementWebpropertyUserLinksInsert**
> EntityUserLink analyticsManagementWebpropertyUserLinksInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink)



Adds a new user to the given web property.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to create the user link for.
    String webPropertyId = "webPropertyId_example"; // String | Web Property ID to create the user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityUserLink entityUserLink = new EntityUserLink(); // EntityUserLink | 
    try {
      EntityUserLink result = apiInstance.analyticsManagementWebpropertyUserLinksInsert(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertyUserLinksInsert");
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
| **accountId** | **String**| Account ID to create the user link for. | |
| **webPropertyId** | **String**| Web Property ID to create the user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityUserLink** | [**EntityUserLink**](EntityUserLink.md)|  | [optional] |

### Return type

[**EntityUserLink**](EntityUserLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertyUserLinksList"></a>
# **analyticsManagementWebpropertyUserLinksList**
> EntityUserLinks analyticsManagementWebpropertyUserLinksList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex)



Lists webProperty-user links for a given web property.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID which the given web property belongs to.
    String webPropertyId = "webPropertyId_example"; // String | Web Property ID for the webProperty-user links to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    Integer maxResults = 56; // Integer | The maximum number of webProperty-user Links to include in this response.
    Integer startIndex = 56; // Integer | An index of the first webProperty-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    try {
      EntityUserLinks result = apiInstance.analyticsManagementWebpropertyUserLinksList(accountId, webPropertyId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, maxResults, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertyUserLinksList");
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
| **accountId** | **String**| Account ID which the given web property belongs to. | |
| **webPropertyId** | **String**| Web Property ID for the webProperty-user links to retrieve. Can either be a specific web property ID or &#39;~all&#39;, which refers to all the web properties that user has access to. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **maxResults** | **Integer**| The maximum number of webProperty-user Links to include in this response. | [optional] |
| **startIndex** | **Integer**| An index of the first webProperty-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. | [optional] |

### Return type

[**EntityUserLinks**](EntityUserLinks.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="analyticsManagementWebpropertyUserLinksUpdate"></a>
# **analyticsManagementWebpropertyUserLinksUpdate**
> EntityUserLink analyticsManagementWebpropertyUserLinksUpdate(accountId, webPropertyId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink)



Updates permissions for an existing user on the given web property.

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
    defaultClient.setBasePath("https://analytics.googleapis.com/analytics/v3");
    
    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID to update the account-user link for.
    String webPropertyId = "webPropertyId_example"; // String | Web property ID to update the account-user link for.
    String linkId = "linkId_example"; // String | Link ID to update the account-user link for.
    String alt = "json"; // String | Data format for the response.
    String fields = "fields_example"; // String | Selector specifying which fields to include in a partial response.
    String key = "key_example"; // String | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
    String oauthToken = "oauthToken_example"; // String | OAuth 2.0 token for the current user.
    Boolean prettyPrint = true; // Boolean | Returns response with indentations and line breaks.
    String quotaUser = "quotaUser_example"; // String | An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
    String userIp = "userIp_example"; // String | Deprecated. Please use quotaUser instead.
    EntityUserLink entityUserLink = new EntityUserLink(); // EntityUserLink | 
    try {
      EntityUserLink result = apiInstance.analyticsManagementWebpropertyUserLinksUpdate(accountId, webPropertyId, linkId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp, entityUserLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#analyticsManagementWebpropertyUserLinksUpdate");
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
| **accountId** | **String**| Account ID to update the account-user link for. | |
| **webPropertyId** | **String**| Web property ID to update the account-user link for. | |
| **linkId** | **String**| Link ID to update the account-user link for. | |
| **alt** | **String**| Data format for the response. | [optional] [enum: json] |
| **fields** | **String**| Selector specifying which fields to include in a partial response. | [optional] |
| **key** | **String**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] |
| **oauthToken** | **String**| OAuth 2.0 token for the current user. | [optional] |
| **prettyPrint** | **Boolean**| Returns response with indentations and line breaks. | [optional] |
| **quotaUser** | **String**| An opaque string that represents a user for quota purposes. Must not exceed 40 characters. | [optional] |
| **userIp** | **String**| Deprecated. Please use quotaUser instead. | [optional] |
| **entityUserLink** | [**EntityUserLink**](EntityUserLink.md)|  | [optional] |

### Return type

[**EntityUserLink**](EntityUserLink.md)

### Authorization

[Oauth2c](../README.md#Oauth2c), [Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

