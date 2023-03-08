# DefaultApi

All URIs are relative to *https://trusthub.twilio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomerProfile**](DefaultApi.md#createCustomerProfile) | **POST** /v1/CustomerProfiles |  |
| [**createCustomerProfileChannelEndpointAssignment**](DefaultApi.md#createCustomerProfileChannelEndpointAssignment) | **POST** /v1/CustomerProfiles/{CustomerProfileSid}/ChannelEndpointAssignments |  |
| [**createCustomerProfileEntityAssignment**](DefaultApi.md#createCustomerProfileEntityAssignment) | **POST** /v1/CustomerProfiles/{CustomerProfileSid}/EntityAssignments |  |
| [**createCustomerProfileEvaluation**](DefaultApi.md#createCustomerProfileEvaluation) | **POST** /v1/CustomerProfiles/{CustomerProfileSid}/Evaluations |  |
| [**createEndUser**](DefaultApi.md#createEndUser) | **POST** /v1/EndUsers |  |
| [**createSupportingDocument**](DefaultApi.md#createSupportingDocument) | **POST** /v1/SupportingDocuments |  |
| [**createTrustProduct**](DefaultApi.md#createTrustProduct) | **POST** /v1/TrustProducts |  |
| [**createTrustProductChannelEndpointAssignment**](DefaultApi.md#createTrustProductChannelEndpointAssignment) | **POST** /v1/TrustProducts/{TrustProductSid}/ChannelEndpointAssignments |  |
| [**createTrustProductEntityAssignment**](DefaultApi.md#createTrustProductEntityAssignment) | **POST** /v1/TrustProducts/{TrustProductSid}/EntityAssignments |  |
| [**createTrustProductEvaluation**](DefaultApi.md#createTrustProductEvaluation) | **POST** /v1/TrustProducts/{TrustProductSid}/Evaluations |  |
| [**deleteCustomerProfile**](DefaultApi.md#deleteCustomerProfile) | **DELETE** /v1/CustomerProfiles/{Sid} |  |
| [**deleteCustomerProfileChannelEndpointAssignment**](DefaultApi.md#deleteCustomerProfileChannelEndpointAssignment) | **DELETE** /v1/CustomerProfiles/{CustomerProfileSid}/ChannelEndpointAssignments/{Sid} |  |
| [**deleteCustomerProfileEntityAssignment**](DefaultApi.md#deleteCustomerProfileEntityAssignment) | **DELETE** /v1/CustomerProfiles/{CustomerProfileSid}/EntityAssignments/{Sid} |  |
| [**deleteEndUser**](DefaultApi.md#deleteEndUser) | **DELETE** /v1/EndUsers/{Sid} |  |
| [**deleteSupportingDocument**](DefaultApi.md#deleteSupportingDocument) | **DELETE** /v1/SupportingDocuments/{Sid} |  |
| [**deleteTrustProduct**](DefaultApi.md#deleteTrustProduct) | **DELETE** /v1/TrustProducts/{Sid} |  |
| [**deleteTrustProductChannelEndpointAssignment**](DefaultApi.md#deleteTrustProductChannelEndpointAssignment) | **DELETE** /v1/TrustProducts/{TrustProductSid}/ChannelEndpointAssignments/{Sid} |  |
| [**deleteTrustProductEntityAssignment**](DefaultApi.md#deleteTrustProductEntityAssignment) | **DELETE** /v1/TrustProducts/{TrustProductSid}/EntityAssignments/{Sid} |  |
| [**fetchCustomerProfile**](DefaultApi.md#fetchCustomerProfile) | **GET** /v1/CustomerProfiles/{Sid} |  |
| [**fetchCustomerProfileChannelEndpointAssignment**](DefaultApi.md#fetchCustomerProfileChannelEndpointAssignment) | **GET** /v1/CustomerProfiles/{CustomerProfileSid}/ChannelEndpointAssignments/{Sid} |  |
| [**fetchCustomerProfileEntityAssignment**](DefaultApi.md#fetchCustomerProfileEntityAssignment) | **GET** /v1/CustomerProfiles/{CustomerProfileSid}/EntityAssignments/{Sid} |  |
| [**fetchCustomerProfileEvaluation**](DefaultApi.md#fetchCustomerProfileEvaluation) | **GET** /v1/CustomerProfiles/{CustomerProfileSid}/Evaluations/{Sid} |  |
| [**fetchEndUser**](DefaultApi.md#fetchEndUser) | **GET** /v1/EndUsers/{Sid} |  |
| [**fetchEndUserType**](DefaultApi.md#fetchEndUserType) | **GET** /v1/EndUserTypes/{Sid} |  |
| [**fetchPolicies**](DefaultApi.md#fetchPolicies) | **GET** /v1/Policies/{Sid} |  |
| [**fetchSupportingDocument**](DefaultApi.md#fetchSupportingDocument) | **GET** /v1/SupportingDocuments/{Sid} |  |
| [**fetchSupportingDocumentType**](DefaultApi.md#fetchSupportingDocumentType) | **GET** /v1/SupportingDocumentTypes/{Sid} |  |
| [**fetchTrustProduct**](DefaultApi.md#fetchTrustProduct) | **GET** /v1/TrustProducts/{Sid} |  |
| [**fetchTrustProductChannelEndpointAssignment**](DefaultApi.md#fetchTrustProductChannelEndpointAssignment) | **GET** /v1/TrustProducts/{TrustProductSid}/ChannelEndpointAssignments/{Sid} |  |
| [**fetchTrustProductEntityAssignment**](DefaultApi.md#fetchTrustProductEntityAssignment) | **GET** /v1/TrustProducts/{TrustProductSid}/EntityAssignments/{Sid} |  |
| [**fetchTrustProductEvaluation**](DefaultApi.md#fetchTrustProductEvaluation) | **GET** /v1/TrustProducts/{TrustProductSid}/Evaluations/{Sid} |  |
| [**listCustomerProfile**](DefaultApi.md#listCustomerProfile) | **GET** /v1/CustomerProfiles |  |
| [**listCustomerProfileChannelEndpointAssignment**](DefaultApi.md#listCustomerProfileChannelEndpointAssignment) | **GET** /v1/CustomerProfiles/{CustomerProfileSid}/ChannelEndpointAssignments |  |
| [**listCustomerProfileEntityAssignment**](DefaultApi.md#listCustomerProfileEntityAssignment) | **GET** /v1/CustomerProfiles/{CustomerProfileSid}/EntityAssignments |  |
| [**listCustomerProfileEvaluation**](DefaultApi.md#listCustomerProfileEvaluation) | **GET** /v1/CustomerProfiles/{CustomerProfileSid}/Evaluations |  |
| [**listEndUser**](DefaultApi.md#listEndUser) | **GET** /v1/EndUsers |  |
| [**listEndUserType**](DefaultApi.md#listEndUserType) | **GET** /v1/EndUserTypes |  |
| [**listPolicies**](DefaultApi.md#listPolicies) | **GET** /v1/Policies |  |
| [**listSupportingDocument**](DefaultApi.md#listSupportingDocument) | **GET** /v1/SupportingDocuments |  |
| [**listSupportingDocumentType**](DefaultApi.md#listSupportingDocumentType) | **GET** /v1/SupportingDocumentTypes |  |
| [**listTrustProduct**](DefaultApi.md#listTrustProduct) | **GET** /v1/TrustProducts |  |
| [**listTrustProductChannelEndpointAssignment**](DefaultApi.md#listTrustProductChannelEndpointAssignment) | **GET** /v1/TrustProducts/{TrustProductSid}/ChannelEndpointAssignments |  |
| [**listTrustProductEntityAssignment**](DefaultApi.md#listTrustProductEntityAssignment) | **GET** /v1/TrustProducts/{TrustProductSid}/EntityAssignments |  |
| [**listTrustProductEvaluation**](DefaultApi.md#listTrustProductEvaluation) | **GET** /v1/TrustProducts/{TrustProductSid}/Evaluations |  |
| [**updateCustomerProfile**](DefaultApi.md#updateCustomerProfile) | **POST** /v1/CustomerProfiles/{Sid} |  |
| [**updateEndUser**](DefaultApi.md#updateEndUser) | **POST** /v1/EndUsers/{Sid} |  |
| [**updateSupportingDocument**](DefaultApi.md#updateSupportingDocument) | **POST** /v1/SupportingDocuments/{Sid} |  |
| [**updateTrustProduct**](DefaultApi.md#updateTrustProduct) | **POST** /v1/TrustProducts/{Sid} |  |


<a id="createCustomerProfile"></a>
# **createCustomerProfile**
> TrusthubV1CustomerProfile createCustomerProfile(email, friendlyName, policySid, statusCallback)



Create a new Customer-Profile.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | The email address that will receive updates when the Customer-Profile resource changes status.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    String policySid = "policySid_example"; // String | The unique string of a policy that is associated to the Customer-Profile resource.
    URI statusCallback = new URI(); // URI | The URL we call to inform your application of status changes.
    try {
      TrusthubV1CustomerProfile result = apiInstance.createCustomerProfile(email, friendlyName, policySid, statusCallback);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createCustomerProfile");
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
| **email** | **String**| The email address that will receive updates when the Customer-Profile resource changes status. | |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | |
| **policySid** | **String**| The unique string of a policy that is associated to the Customer-Profile resource. | |
| **statusCallback** | **URI**| The URL we call to inform your application of status changes. | [optional] |

### Return type

[**TrusthubV1CustomerProfile**](TrusthubV1CustomerProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCustomerProfileChannelEndpointAssignment"></a>
# **createCustomerProfileChannelEndpointAssignment**
> TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment createCustomerProfileChannelEndpointAssignment(customerProfileSid, channelEndpointSid, channelEndpointType)



Create a new Assigned Item.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String channelEndpointSid = "channelEndpointSid_example"; // String | The SID of an channel endpoint
    String channelEndpointType = "channelEndpointType_example"; // String | The type of channel endpoint. eg: phone-number
    try {
      TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment result = apiInstance.createCustomerProfileChannelEndpointAssignment(customerProfileSid, channelEndpointSid, channelEndpointType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createCustomerProfileChannelEndpointAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **channelEndpointSid** | **String**| The SID of an channel endpoint | |
| **channelEndpointType** | **String**| The type of channel endpoint. eg: phone-number | |

### Return type

[**TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment**](TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCustomerProfileEntityAssignment"></a>
# **createCustomerProfileEntityAssignment**
> TrusthubV1CustomerProfileCustomerProfileEntityAssignment createCustomerProfileEntityAssignment(customerProfileSid, objectSid)



Create a new Assigned Item.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String objectSid = "objectSid_example"; // String | The SID of an object bag that holds information of the different items.
    try {
      TrusthubV1CustomerProfileCustomerProfileEntityAssignment result = apiInstance.createCustomerProfileEntityAssignment(customerProfileSid, objectSid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createCustomerProfileEntityAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **objectSid** | **String**| The SID of an object bag that holds information of the different items. | |

### Return type

[**TrusthubV1CustomerProfileCustomerProfileEntityAssignment**](TrusthubV1CustomerProfileCustomerProfileEntityAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCustomerProfileEvaluation"></a>
# **createCustomerProfileEvaluation**
> TrusthubV1CustomerProfileCustomerProfileEvaluation createCustomerProfileEvaluation(customerProfileSid, policySid)



Create a new Evaluation

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String policySid = "policySid_example"; // String | The unique string of a policy that is associated to the customer_profile resource.
    try {
      TrusthubV1CustomerProfileCustomerProfileEvaluation result = apiInstance.createCustomerProfileEvaluation(customerProfileSid, policySid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createCustomerProfileEvaluation");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **policySid** | **String**| The unique string of a policy that is associated to the customer_profile resource. | |

### Return type

[**TrusthubV1CustomerProfileCustomerProfileEvaluation**](TrusthubV1CustomerProfileCustomerProfileEvaluation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createEndUser"></a>
# **createEndUser**
> TrusthubV1EndUser createEndUser(friendlyName, type, attributes)



Create a new End User.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    String type = "type_example"; // String | The type of end user of the Bundle resource - can be `individual` or `business`.
    Object attributes = null; // Object | The set of parameters that are the attributes of the End User resource which are derived End User Types.
    try {
      TrusthubV1EndUser result = apiInstance.createEndUser(friendlyName, type, attributes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createEndUser");
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
| **friendlyName** | **String**| The string that you assigned to describe the resource. | |
| **type** | **String**| The type of end user of the Bundle resource - can be &#x60;individual&#x60; or &#x60;business&#x60;. | |
| **attributes** | [**Object**](Object.md)| The set of parameters that are the attributes of the End User resource which are derived End User Types. | [optional] |

### Return type

[**TrusthubV1EndUser**](TrusthubV1EndUser.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createSupportingDocument"></a>
# **createSupportingDocument**
> TrusthubV1SupportingDocument createSupportingDocument(friendlyName, type, attributes)



Create a new Supporting Document.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    String type = "type_example"; // String | The type of the Supporting Document.
    Object attributes = null; // Object | The set of parameters that are the attributes of the Supporting Documents resource which are derived Supporting Document Types.
    try {
      TrusthubV1SupportingDocument result = apiInstance.createSupportingDocument(friendlyName, type, attributes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSupportingDocument");
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
| **friendlyName** | **String**| The string that you assigned to describe the resource. | |
| **type** | **String**| The type of the Supporting Document. | |
| **attributes** | [**Object**](Object.md)| The set of parameters that are the attributes of the Supporting Documents resource which are derived Supporting Document Types. | [optional] |

### Return type

[**TrusthubV1SupportingDocument**](TrusthubV1SupportingDocument.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createTrustProduct"></a>
# **createTrustProduct**
> TrusthubV1TrustProduct createTrustProduct(email, friendlyName, policySid, statusCallback)



Create a new Customer-Profile.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | The email address that will receive updates when the Customer-Profile resource changes status.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    String policySid = "policySid_example"; // String | The unique string of a policy that is associated to the Customer-Profile resource.
    URI statusCallback = new URI(); // URI | The URL we call to inform your application of status changes.
    try {
      TrusthubV1TrustProduct result = apiInstance.createTrustProduct(email, friendlyName, policySid, statusCallback);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTrustProduct");
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
| **email** | **String**| The email address that will receive updates when the Customer-Profile resource changes status. | |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | |
| **policySid** | **String**| The unique string of a policy that is associated to the Customer-Profile resource. | |
| **statusCallback** | **URI**| The URL we call to inform your application of status changes. | [optional] |

### Return type

[**TrusthubV1TrustProduct**](TrusthubV1TrustProduct.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createTrustProductChannelEndpointAssignment"></a>
# **createTrustProductChannelEndpointAssignment**
> TrusthubV1TrustProductTrustProductChannelEndpointAssignment createTrustProductChannelEndpointAssignment(trustProductSid, channelEndpointSid, channelEndpointType)



Create a new Assigned Item.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String channelEndpointSid = "channelEndpointSid_example"; // String | The SID of an channel endpoint
    String channelEndpointType = "channelEndpointType_example"; // String | The type of channel endpoint. eg: phone-number
    try {
      TrusthubV1TrustProductTrustProductChannelEndpointAssignment result = apiInstance.createTrustProductChannelEndpointAssignment(trustProductSid, channelEndpointSid, channelEndpointType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTrustProductChannelEndpointAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **channelEndpointSid** | **String**| The SID of an channel endpoint | |
| **channelEndpointType** | **String**| The type of channel endpoint. eg: phone-number | |

### Return type

[**TrusthubV1TrustProductTrustProductChannelEndpointAssignment**](TrusthubV1TrustProductTrustProductChannelEndpointAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createTrustProductEntityAssignment"></a>
# **createTrustProductEntityAssignment**
> TrusthubV1TrustProductTrustProductEntityAssignment createTrustProductEntityAssignment(trustProductSid, objectSid)



Create a new Assigned Item.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the TrustProduct resource.
    String objectSid = "objectSid_example"; // String | The SID of an object bag that holds information of the different items.
    try {
      TrusthubV1TrustProductTrustProductEntityAssignment result = apiInstance.createTrustProductEntityAssignment(trustProductSid, objectSid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTrustProductEntityAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the TrustProduct resource. | |
| **objectSid** | **String**| The SID of an object bag that holds information of the different items. | |

### Return type

[**TrusthubV1TrustProductTrustProductEntityAssignment**](TrusthubV1TrustProductTrustProductEntityAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createTrustProductEvaluation"></a>
# **createTrustProductEvaluation**
> TrusthubV1TrustProductTrustProductEvaluation createTrustProductEvaluation(trustProductSid, policySid)



Create a new Evaluation

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the trust_product resource.
    String policySid = "policySid_example"; // String | The unique string of a policy that is associated to the customer_profile resource.
    try {
      TrusthubV1TrustProductTrustProductEvaluation result = apiInstance.createTrustProductEvaluation(trustProductSid, policySid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTrustProductEvaluation");
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
| **trustProductSid** | **String**| The unique string that we created to identify the trust_product resource. | |
| **policySid** | **String**| The unique string of a policy that is associated to the customer_profile resource. | |

### Return type

[**TrusthubV1TrustProductTrustProductEvaluation**](TrusthubV1TrustProductTrustProductEvaluation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteCustomerProfile"></a>
# **deleteCustomerProfile**
> deleteCustomerProfile(sid)



Delete a specific Customer-Profile.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that we created to identify the Customer-Profile resource.
    try {
      apiInstance.deleteCustomerProfile(sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteCustomerProfile");
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
| **sid** | **String**| The unique string that we created to identify the Customer-Profile resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="deleteCustomerProfileChannelEndpointAssignment"></a>
# **deleteCustomerProfileChannelEndpointAssignment**
> deleteCustomerProfileChannelEndpointAssignment(customerProfileSid, sid)



Remove an Assignment Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the resource.
    try {
      apiInstance.deleteCustomerProfileChannelEndpointAssignment(customerProfileSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteCustomerProfileChannelEndpointAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **sid** | **String**| The unique string that we created to identify the resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="deleteCustomerProfileEntityAssignment"></a>
# **deleteCustomerProfileEntityAssignment**
> deleteCustomerProfileEntityAssignment(customerProfileSid, sid)



Remove an Assignment Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the Identity resource.
    try {
      apiInstance.deleteCustomerProfileEntityAssignment(customerProfileSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteCustomerProfileEntityAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **sid** | **String**| The unique string that we created to identify the Identity resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="deleteEndUser"></a>
# **deleteEndUser**
> deleteEndUser(sid)



Delete a specific End User.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string created by Twilio to identify the End User resource.
    try {
      apiInstance.deleteEndUser(sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteEndUser");
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
| **sid** | **String**| The unique string created by Twilio to identify the End User resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="deleteSupportingDocument"></a>
# **deleteSupportingDocument**
> deleteSupportingDocument(sid)



Delete a specific Supporting Document.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string created by Twilio to identify the Supporting Document resource.
    try {
      apiInstance.deleteSupportingDocument(sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteSupportingDocument");
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
| **sid** | **String**| The unique string created by Twilio to identify the Supporting Document resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="deleteTrustProduct"></a>
# **deleteTrustProduct**
> deleteTrustProduct(sid)



Delete a specific Customer-Profile.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that we created to identify the Customer-Profile resource.
    try {
      apiInstance.deleteTrustProduct(sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteTrustProduct");
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
| **sid** | **String**| The unique string that we created to identify the Customer-Profile resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="deleteTrustProductChannelEndpointAssignment"></a>
# **deleteTrustProductChannelEndpointAssignment**
> deleteTrustProductChannelEndpointAssignment(trustProductSid, sid)



Remove an Assignment Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the resource.
    try {
      apiInstance.deleteTrustProductChannelEndpointAssignment(trustProductSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteTrustProductChannelEndpointAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **sid** | **String**| The unique string that we created to identify the resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="deleteTrustProductEntityAssignment"></a>
# **deleteTrustProductEntityAssignment**
> deleteTrustProductEntityAssignment(trustProductSid, sid)



Remove an Assignment Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the TrustProduct resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the Identity resource.
    try {
      apiInstance.deleteTrustProductEntityAssignment(trustProductSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteTrustProductEntityAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the TrustProduct resource. | |
| **sid** | **String**| The unique string that we created to identify the Identity resource. | |

### Return type

null (empty response body)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |

<a id="fetchCustomerProfile"></a>
# **fetchCustomerProfile**
> TrusthubV1CustomerProfile fetchCustomerProfile(sid)



Fetch a specific Customer-Profile instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that we created to identify the Customer-Profile resource.
    try {
      TrusthubV1CustomerProfile result = apiInstance.fetchCustomerProfile(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchCustomerProfile");
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
| **sid** | **String**| The unique string that we created to identify the Customer-Profile resource. | |

### Return type

[**TrusthubV1CustomerProfile**](TrusthubV1CustomerProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchCustomerProfileChannelEndpointAssignment"></a>
# **fetchCustomerProfileChannelEndpointAssignment**
> TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment fetchCustomerProfileChannelEndpointAssignment(customerProfileSid, sid)



Fetch specific Assigned Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the resource.
    try {
      TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment result = apiInstance.fetchCustomerProfileChannelEndpointAssignment(customerProfileSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchCustomerProfileChannelEndpointAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **sid** | **String**| The unique string that we created to identify the resource. | |

### Return type

[**TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment**](TrusthubV1CustomerProfileCustomerProfileChannelEndpointAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchCustomerProfileEntityAssignment"></a>
# **fetchCustomerProfileEntityAssignment**
> TrusthubV1CustomerProfileCustomerProfileEntityAssignment fetchCustomerProfileEntityAssignment(customerProfileSid, sid)



Fetch specific Assigned Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the Identity resource.
    try {
      TrusthubV1CustomerProfileCustomerProfileEntityAssignment result = apiInstance.fetchCustomerProfileEntityAssignment(customerProfileSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchCustomerProfileEntityAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **sid** | **String**| The unique string that we created to identify the Identity resource. | |

### Return type

[**TrusthubV1CustomerProfileCustomerProfileEntityAssignment**](TrusthubV1CustomerProfileCustomerProfileEntityAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchCustomerProfileEvaluation"></a>
# **fetchCustomerProfileEvaluation**
> TrusthubV1CustomerProfileCustomerProfileEvaluation fetchCustomerProfileEvaluation(customerProfileSid, sid)



Fetch specific Evaluation Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the customer_profile resource.
    String sid = "sid_example"; // String | The unique string that identifies the Evaluation resource.
    try {
      TrusthubV1CustomerProfileCustomerProfileEvaluation result = apiInstance.fetchCustomerProfileEvaluation(customerProfileSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchCustomerProfileEvaluation");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the customer_profile resource. | |
| **sid** | **String**| The unique string that identifies the Evaluation resource. | |

### Return type

[**TrusthubV1CustomerProfileCustomerProfileEvaluation**](TrusthubV1CustomerProfileCustomerProfileEvaluation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchEndUser"></a>
# **fetchEndUser**
> TrusthubV1EndUser fetchEndUser(sid)



Fetch specific End User Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string created by Twilio to identify the End User resource.
    try {
      TrusthubV1EndUser result = apiInstance.fetchEndUser(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchEndUser");
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
| **sid** | **String**| The unique string created by Twilio to identify the End User resource. | |

### Return type

[**TrusthubV1EndUser**](TrusthubV1EndUser.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchEndUserType"></a>
# **fetchEndUserType**
> TrusthubV1EndUserType fetchEndUserType(sid)



Fetch a specific End-User Type Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that identifies the End-User Type resource.
    try {
      TrusthubV1EndUserType result = apiInstance.fetchEndUserType(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchEndUserType");
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
| **sid** | **String**| The unique string that identifies the End-User Type resource. | |

### Return type

[**TrusthubV1EndUserType**](TrusthubV1EndUserType.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchPolicies"></a>
# **fetchPolicies**
> TrusthubV1Policies fetchPolicies(sid)



Fetch specific Policy Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that identifies the Policy resource.
    try {
      TrusthubV1Policies result = apiInstance.fetchPolicies(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchPolicies");
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
| **sid** | **String**| The unique string that identifies the Policy resource. | |

### Return type

[**TrusthubV1Policies**](TrusthubV1Policies.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchSupportingDocument"></a>
# **fetchSupportingDocument**
> TrusthubV1SupportingDocument fetchSupportingDocument(sid)



Fetch specific Supporting Document Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string created by Twilio to identify the Supporting Document resource.
    try {
      TrusthubV1SupportingDocument result = apiInstance.fetchSupportingDocument(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchSupportingDocument");
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
| **sid** | **String**| The unique string created by Twilio to identify the Supporting Document resource. | |

### Return type

[**TrusthubV1SupportingDocument**](TrusthubV1SupportingDocument.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchSupportingDocumentType"></a>
# **fetchSupportingDocumentType**
> TrusthubV1SupportingDocumentType fetchSupportingDocumentType(sid)



Fetch a specific Supporting Document Type Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that identifies the Supporting Document Type resource.
    try {
      TrusthubV1SupportingDocumentType result = apiInstance.fetchSupportingDocumentType(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchSupportingDocumentType");
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
| **sid** | **String**| The unique string that identifies the Supporting Document Type resource. | |

### Return type

[**TrusthubV1SupportingDocumentType**](TrusthubV1SupportingDocumentType.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchTrustProduct"></a>
# **fetchTrustProduct**
> TrusthubV1TrustProduct fetchTrustProduct(sid)



Fetch a specific Customer-Profile instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that we created to identify the Customer-Profile resource.
    try {
      TrusthubV1TrustProduct result = apiInstance.fetchTrustProduct(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchTrustProduct");
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
| **sid** | **String**| The unique string that we created to identify the Customer-Profile resource. | |

### Return type

[**TrusthubV1TrustProduct**](TrusthubV1TrustProduct.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchTrustProductChannelEndpointAssignment"></a>
# **fetchTrustProductChannelEndpointAssignment**
> TrusthubV1TrustProductTrustProductChannelEndpointAssignment fetchTrustProductChannelEndpointAssignment(trustProductSid, sid)



Fetch specific Assigned Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the resource.
    try {
      TrusthubV1TrustProductTrustProductChannelEndpointAssignment result = apiInstance.fetchTrustProductChannelEndpointAssignment(trustProductSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchTrustProductChannelEndpointAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **sid** | **String**| The unique string that we created to identify the resource. | |

### Return type

[**TrusthubV1TrustProductTrustProductChannelEndpointAssignment**](TrusthubV1TrustProductTrustProductChannelEndpointAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchTrustProductEntityAssignment"></a>
# **fetchTrustProductEntityAssignment**
> TrusthubV1TrustProductTrustProductEntityAssignment fetchTrustProductEntityAssignment(trustProductSid, sid)



Fetch specific Assigned Item Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the TrustProduct resource.
    String sid = "sid_example"; // String | The unique string that we created to identify the Identity resource.
    try {
      TrusthubV1TrustProductTrustProductEntityAssignment result = apiInstance.fetchTrustProductEntityAssignment(trustProductSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchTrustProductEntityAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the TrustProduct resource. | |
| **sid** | **String**| The unique string that we created to identify the Identity resource. | |

### Return type

[**TrusthubV1TrustProductTrustProductEntityAssignment**](TrusthubV1TrustProductTrustProductEntityAssignment.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchTrustProductEvaluation"></a>
# **fetchTrustProductEvaluation**
> TrusthubV1TrustProductTrustProductEvaluation fetchTrustProductEvaluation(trustProductSid, sid)



Fetch specific Evaluation Instance.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the trust_product resource.
    String sid = "sid_example"; // String | The unique string that identifies the Evaluation resource.
    try {
      TrusthubV1TrustProductTrustProductEvaluation result = apiInstance.fetchTrustProductEvaluation(trustProductSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchTrustProductEvaluation");
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
| **trustProductSid** | **String**| The unique string that we created to identify the trust_product resource. | |
| **sid** | **String**| The unique string that identifies the Evaluation resource. | |

### Return type

[**TrusthubV1TrustProductTrustProductEvaluation**](TrusthubV1TrustProductTrustProductEvaluation.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCustomerProfile"></a>
# **listCustomerProfile**
> ListCustomerProfileResponse listCustomerProfile(status, friendlyName, policySid, pageSize, page, pageToken)



Retrieve a list of all Customer-Profiles for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CustomerProfileEnumStatus status = CustomerProfileEnumStatus.fromValue("draft"); // CustomerProfileEnumStatus | The verification status of the Customer-Profile resource.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    String policySid = "policySid_example"; // String | The unique string of a policy that is associated to the Customer-Profile resource.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListCustomerProfileResponse result = apiInstance.listCustomerProfile(status, friendlyName, policySid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCustomerProfile");
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
| **status** | [**CustomerProfileEnumStatus**](.md)| The verification status of the Customer-Profile resource. | [optional] [enum: draft, pending-review, in-review, twilio-rejected, twilio-approved] |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | [optional] |
| **policySid** | **String**| The unique string of a policy that is associated to the Customer-Profile resource. | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListCustomerProfileResponse**](ListCustomerProfileResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCustomerProfileChannelEndpointAssignment"></a>
# **listCustomerProfileChannelEndpointAssignment**
> ListCustomerProfileChannelEndpointAssignmentResponse listCustomerProfileChannelEndpointAssignment(customerProfileSid, channelEndpointSid, channelEndpointSids, pageSize, page, pageToken)



Retrieve a list of all Assigned Items for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String channelEndpointSid = "channelEndpointSid_example"; // String | The SID of an channel endpoint
    String channelEndpointSids = "channelEndpointSids_example"; // String | comma separated list of channel endpoint sids
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListCustomerProfileChannelEndpointAssignmentResponse result = apiInstance.listCustomerProfileChannelEndpointAssignment(customerProfileSid, channelEndpointSid, channelEndpointSids, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCustomerProfileChannelEndpointAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **channelEndpointSid** | **String**| The SID of an channel endpoint | [optional] |
| **channelEndpointSids** | **String**| comma separated list of channel endpoint sids | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListCustomerProfileChannelEndpointAssignmentResponse**](ListCustomerProfileChannelEndpointAssignmentResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCustomerProfileEntityAssignment"></a>
# **listCustomerProfileEntityAssignment**
> ListCustomerProfileEntityAssignmentResponse listCustomerProfileEntityAssignment(customerProfileSid, pageSize, page, pageToken)



Retrieve a list of all Assigned Items for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListCustomerProfileEntityAssignmentResponse result = apiInstance.listCustomerProfileEntityAssignment(customerProfileSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCustomerProfileEntityAssignment");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListCustomerProfileEntityAssignmentResponse**](ListCustomerProfileEntityAssignmentResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCustomerProfileEvaluation"></a>
# **listCustomerProfileEvaluation**
> ListCustomerProfileEvaluationResponse listCustomerProfileEvaluation(customerProfileSid, pageSize, page, pageToken)



Retrieve a list of Evaluations associated to the customer_profile resource.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String customerProfileSid = "customerProfileSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListCustomerProfileEvaluationResponse result = apiInstance.listCustomerProfileEvaluation(customerProfileSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCustomerProfileEvaluation");
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
| **customerProfileSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListCustomerProfileEvaluationResponse**](ListCustomerProfileEvaluationResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listEndUser"></a>
# **listEndUser**
> ListEndUserResponse listEndUser(pageSize, page, pageToken)



Retrieve a list of all End User for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListEndUserResponse result = apiInstance.listEndUser(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listEndUser");
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
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListEndUserResponse**](ListEndUserResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listEndUserType"></a>
# **listEndUserType**
> ListEndUserTypeResponse listEndUserType(pageSize, page, pageToken)



Retrieve a list of all End-User Types.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListEndUserTypeResponse result = apiInstance.listEndUserType(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listEndUserType");
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
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListEndUserTypeResponse**](ListEndUserTypeResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listPolicies"></a>
# **listPolicies**
> ListPoliciesResponse listPolicies(pageSize, page, pageToken)



Retrieve a list of all Policys.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListPoliciesResponse result = apiInstance.listPolicies(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listPolicies");
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
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListPoliciesResponse**](ListPoliciesResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSupportingDocument"></a>
# **listSupportingDocument**
> ListSupportingDocumentResponse listSupportingDocument(pageSize, page, pageToken)



Retrieve a list of all Supporting Document for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListSupportingDocumentResponse result = apiInstance.listSupportingDocument(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSupportingDocument");
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
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListSupportingDocumentResponse**](ListSupportingDocumentResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSupportingDocumentType"></a>
# **listSupportingDocumentType**
> ListSupportingDocumentTypeResponse listSupportingDocumentType(pageSize, page, pageToken)



Retrieve a list of all Supporting Document Types.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListSupportingDocumentTypeResponse result = apiInstance.listSupportingDocumentType(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSupportingDocumentType");
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
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListSupportingDocumentTypeResponse**](ListSupportingDocumentTypeResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTrustProduct"></a>
# **listTrustProduct**
> ListTrustProductResponse listTrustProduct(status, friendlyName, policySid, pageSize, page, pageToken)



Retrieve a list of all Customer-Profiles for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TrustProductEnumStatus status = TrustProductEnumStatus.fromValue("draft"); // TrustProductEnumStatus | The verification status of the Customer-Profile resource.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    String policySid = "policySid_example"; // String | The unique string of a policy that is associated to the Customer-Profile resource.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListTrustProductResponse result = apiInstance.listTrustProduct(status, friendlyName, policySid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTrustProduct");
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
| **status** | [**TrustProductEnumStatus**](.md)| The verification status of the Customer-Profile resource. | [optional] [enum: draft, pending-review, in-review, twilio-rejected, twilio-approved] |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | [optional] |
| **policySid** | **String**| The unique string of a policy that is associated to the Customer-Profile resource. | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListTrustProductResponse**](ListTrustProductResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTrustProductChannelEndpointAssignment"></a>
# **listTrustProductChannelEndpointAssignment**
> ListTrustProductChannelEndpointAssignmentResponse listTrustProductChannelEndpointAssignment(trustProductSid, channelEndpointSid, channelEndpointSids, pageSize, page, pageToken)



Retrieve a list of all Assigned Items for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the CustomerProfile resource.
    String channelEndpointSid = "channelEndpointSid_example"; // String | The SID of an channel endpoint
    String channelEndpointSids = "channelEndpointSids_example"; // String | comma separated list of channel endpoint sids
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListTrustProductChannelEndpointAssignmentResponse result = apiInstance.listTrustProductChannelEndpointAssignment(trustProductSid, channelEndpointSid, channelEndpointSids, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTrustProductChannelEndpointAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the CustomerProfile resource. | |
| **channelEndpointSid** | **String**| The SID of an channel endpoint | [optional] |
| **channelEndpointSids** | **String**| comma separated list of channel endpoint sids | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListTrustProductChannelEndpointAssignmentResponse**](ListTrustProductChannelEndpointAssignmentResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTrustProductEntityAssignment"></a>
# **listTrustProductEntityAssignment**
> ListTrustProductEntityAssignmentResponse listTrustProductEntityAssignment(trustProductSid, pageSize, page, pageToken)



Retrieve a list of all Assigned Items for an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the TrustProduct resource.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListTrustProductEntityAssignmentResponse result = apiInstance.listTrustProductEntityAssignment(trustProductSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTrustProductEntityAssignment");
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
| **trustProductSid** | **String**| The unique string that we created to identify the TrustProduct resource. | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListTrustProductEntityAssignmentResponse**](ListTrustProductEntityAssignmentResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTrustProductEvaluation"></a>
# **listTrustProductEvaluation**
> ListTrustProductEvaluationResponse listTrustProductEvaluation(trustProductSid, pageSize, page, pageToken)



Retrieve a list of Evaluations associated to the trust_product resource.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String trustProductSid = "trustProductSid_example"; // String | The unique string that we created to identify the trust_product resource.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListTrustProductEvaluationResponse result = apiInstance.listTrustProductEvaluation(trustProductSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTrustProductEvaluation");
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
| **trustProductSid** | **String**| The unique string that we created to identify the trust_product resource. | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListTrustProductEvaluationResponse**](ListTrustProductEvaluationResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCustomerProfile"></a>
# **updateCustomerProfile**
> TrusthubV1CustomerProfile updateCustomerProfile(sid, email, friendlyName, status, statusCallback)



Updates a Customer-Profile in an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that we created to identify the Customer-Profile resource.
    String email = "email_example"; // String | The email address that will receive updates when the Customer-Profile resource changes status.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    CustomerProfileEnumStatus status = CustomerProfileEnumStatus.fromValue("draft"); // CustomerProfileEnumStatus | 
    URI statusCallback = new URI(); // URI | The URL we call to inform your application of status changes.
    try {
      TrusthubV1CustomerProfile result = apiInstance.updateCustomerProfile(sid, email, friendlyName, status, statusCallback);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateCustomerProfile");
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
| **sid** | **String**| The unique string that we created to identify the Customer-Profile resource. | |
| **email** | **String**| The email address that will receive updates when the Customer-Profile resource changes status. | [optional] |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | [optional] |
| **status** | [**CustomerProfileEnumStatus**](CustomerProfileEnumStatus.md)|  | [optional] [enum: draft, pending-review, in-review, twilio-rejected, twilio-approved] |
| **statusCallback** | **URI**| The URL we call to inform your application of status changes. | [optional] |

### Return type

[**TrusthubV1CustomerProfile**](TrusthubV1CustomerProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEndUser"></a>
# **updateEndUser**
> TrusthubV1EndUser updateEndUser(sid, attributes, friendlyName)



Update an existing End User.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string created by Twilio to identify the End User resource.
    Object attributes = null; // Object | The set of parameters that are the attributes of the End User resource which are derived End User Types.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    try {
      TrusthubV1EndUser result = apiInstance.updateEndUser(sid, attributes, friendlyName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateEndUser");
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
| **sid** | **String**| The unique string created by Twilio to identify the End User resource. | |
| **attributes** | [**Object**](Object.md)| The set of parameters that are the attributes of the End User resource which are derived End User Types. | [optional] |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | [optional] |

### Return type

[**TrusthubV1EndUser**](TrusthubV1EndUser.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateSupportingDocument"></a>
# **updateSupportingDocument**
> TrusthubV1SupportingDocument updateSupportingDocument(sid, attributes, friendlyName)



Update an existing Supporting Document.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string created by Twilio to identify the Supporting Document resource.
    Object attributes = null; // Object | The set of parameters that are the attributes of the Supporting Document resource which are derived Supporting Document Types.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    try {
      TrusthubV1SupportingDocument result = apiInstance.updateSupportingDocument(sid, attributes, friendlyName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateSupportingDocument");
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
| **sid** | **String**| The unique string created by Twilio to identify the Supporting Document resource. | |
| **attributes** | [**Object**](Object.md)| The set of parameters that are the attributes of the Supporting Document resource which are derived Supporting Document Types. | [optional] |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | [optional] |

### Return type

[**TrusthubV1SupportingDocument**](TrusthubV1SupportingDocument.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTrustProduct"></a>
# **updateTrustProduct**
> TrusthubV1TrustProduct updateTrustProduct(sid, email, friendlyName, status, statusCallback)



Updates a Customer-Profile in an account.

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
    defaultClient.setBasePath("https://trusthub.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The unique string that we created to identify the Customer-Profile resource.
    String email = "email_example"; // String | The email address that will receive updates when the Customer-Profile resource changes status.
    String friendlyName = "friendlyName_example"; // String | The string that you assigned to describe the resource.
    TrustProductEnumStatus status = TrustProductEnumStatus.fromValue("draft"); // TrustProductEnumStatus | 
    URI statusCallback = new URI(); // URI | The URL we call to inform your application of status changes.
    try {
      TrusthubV1TrustProduct result = apiInstance.updateTrustProduct(sid, email, friendlyName, status, statusCallback);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateTrustProduct");
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
| **sid** | **String**| The unique string that we created to identify the Customer-Profile resource. | |
| **email** | **String**| The email address that will receive updates when the Customer-Profile resource changes status. | [optional] |
| **friendlyName** | **String**| The string that you assigned to describe the resource. | [optional] |
| **status** | [**TrustProductEnumStatus**](TrustProductEnumStatus.md)|  | [optional] [enum: draft, pending-review, in-review, twilio-rejected, twilio-approved] |
| **statusCallback** | **URI**| The URL we call to inform your application of status changes. | [optional] |

### Return type

[**TrusthubV1TrustProduct**](TrusthubV1TrustProduct.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

