# DefaultApi

All URIs are relative to *https://ip-messaging.twilio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChannel**](DefaultApi.md#createChannel) | **POST** /v1/Services/{ServiceSid}/Channels |  |
| [**createCredential**](DefaultApi.md#createCredential) | **POST** /v1/Credentials |  |
| [**createInvite**](DefaultApi.md#createInvite) | **POST** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Invites |  |
| [**createMember**](DefaultApi.md#createMember) | **POST** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Members |  |
| [**createMessage**](DefaultApi.md#createMessage) | **POST** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Messages |  |
| [**createRole**](DefaultApi.md#createRole) | **POST** /v1/Services/{ServiceSid}/Roles |  |
| [**createService**](DefaultApi.md#createService) | **POST** /v1/Services |  |
| [**createUser**](DefaultApi.md#createUser) | **POST** /v1/Services/{ServiceSid}/Users |  |
| [**deleteChannel**](DefaultApi.md#deleteChannel) | **DELETE** /v1/Services/{ServiceSid}/Channels/{Sid} |  |
| [**deleteCredential**](DefaultApi.md#deleteCredential) | **DELETE** /v1/Credentials/{Sid} |  |
| [**deleteInvite**](DefaultApi.md#deleteInvite) | **DELETE** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Invites/{Sid} |  |
| [**deleteMember**](DefaultApi.md#deleteMember) | **DELETE** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Members/{Sid} |  |
| [**deleteMessage**](DefaultApi.md#deleteMessage) | **DELETE** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Messages/{Sid} |  |
| [**deleteRole**](DefaultApi.md#deleteRole) | **DELETE** /v1/Services/{ServiceSid}/Roles/{Sid} |  |
| [**deleteService**](DefaultApi.md#deleteService) | **DELETE** /v1/Services/{Sid} |  |
| [**deleteUser**](DefaultApi.md#deleteUser) | **DELETE** /v1/Services/{ServiceSid}/Users/{Sid} |  |
| [**fetchChannel**](DefaultApi.md#fetchChannel) | **GET** /v1/Services/{ServiceSid}/Channels/{Sid} |  |
| [**fetchCredential**](DefaultApi.md#fetchCredential) | **GET** /v1/Credentials/{Sid} |  |
| [**fetchInvite**](DefaultApi.md#fetchInvite) | **GET** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Invites/{Sid} |  |
| [**fetchMember**](DefaultApi.md#fetchMember) | **GET** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Members/{Sid} |  |
| [**fetchMessage**](DefaultApi.md#fetchMessage) | **GET** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Messages/{Sid} |  |
| [**fetchRole**](DefaultApi.md#fetchRole) | **GET** /v1/Services/{ServiceSid}/Roles/{Sid} |  |
| [**fetchService**](DefaultApi.md#fetchService) | **GET** /v1/Services/{Sid} |  |
| [**fetchUser**](DefaultApi.md#fetchUser) | **GET** /v1/Services/{ServiceSid}/Users/{Sid} |  |
| [**listChannel**](DefaultApi.md#listChannel) | **GET** /v1/Services/{ServiceSid}/Channels |  |
| [**listCredential**](DefaultApi.md#listCredential) | **GET** /v1/Credentials |  |
| [**listInvite**](DefaultApi.md#listInvite) | **GET** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Invites |  |
| [**listMember**](DefaultApi.md#listMember) | **GET** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Members |  |
| [**listMessage**](DefaultApi.md#listMessage) | **GET** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Messages |  |
| [**listRole**](DefaultApi.md#listRole) | **GET** /v1/Services/{ServiceSid}/Roles |  |
| [**listService**](DefaultApi.md#listService) | **GET** /v1/Services |  |
| [**listUser**](DefaultApi.md#listUser) | **GET** /v1/Services/{ServiceSid}/Users |  |
| [**listUserChannel**](DefaultApi.md#listUserChannel) | **GET** /v1/Services/{ServiceSid}/Users/{UserSid}/Channels |  |
| [**updateChannel**](DefaultApi.md#updateChannel) | **POST** /v1/Services/{ServiceSid}/Channels/{Sid} |  |
| [**updateCredential**](DefaultApi.md#updateCredential) | **POST** /v1/Credentials/{Sid} |  |
| [**updateMember**](DefaultApi.md#updateMember) | **POST** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Members/{Sid} |  |
| [**updateMessage**](DefaultApi.md#updateMessage) | **POST** /v1/Services/{ServiceSid}/Channels/{ChannelSid}/Messages/{Sid} |  |
| [**updateRole**](DefaultApi.md#updateRole) | **POST** /v1/Services/{ServiceSid}/Roles/{Sid} |  |
| [**updateService**](DefaultApi.md#updateService) | **POST** /v1/Services/{Sid} |  |
| [**updateUser**](DefaultApi.md#updateUser) | **POST** /v1/Services/{ServiceSid}/Users/{Sid} |  |


<a id="createChannel"></a>
# **createChannel**
> IpMessagingV1ServiceChannel createChannel(serviceSid, attributes, friendlyName, type, uniqueName)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String attributes = "attributes_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    ChannelEnumChannelType type = ChannelEnumChannelType.fromValue("public"); // ChannelEnumChannelType | 
    String uniqueName = "uniqueName_example"; // String | 
    try {
      IpMessagingV1ServiceChannel result = apiInstance.createChannel(serviceSid, attributes, friendlyName, type, uniqueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createChannel");
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
| **serviceSid** | **String**|  | |
| **attributes** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **type** | [**ChannelEnumChannelType**](ChannelEnumChannelType.md)|  | [optional] [enum: public, private] |
| **uniqueName** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceChannel**](IpMessagingV1ServiceChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createCredential"></a>
# **createCredential**
> IpMessagingV1Credential createCredential(type, apiKey, certificate, friendlyName, privateKey, sandbox, secret)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CredentialEnumPushService type = CredentialEnumPushService.fromValue("gcm"); // CredentialEnumPushService | 
    String apiKey = "apiKey_example"; // String | 
    String certificate = "certificate_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    String privateKey = "privateKey_example"; // String | 
    Boolean sandbox = true; // Boolean | 
    String secret = "secret_example"; // String | 
    try {
      IpMessagingV1Credential result = apiInstance.createCredential(type, apiKey, certificate, friendlyName, privateKey, sandbox, secret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createCredential");
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
| **type** | [**CredentialEnumPushService**](CredentialEnumPushService.md)|  | [enum: gcm, apn, fcm] |
| **apiKey** | **String**|  | [optional] |
| **certificate** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **privateKey** | **String**|  | [optional] |
| **sandbox** | **Boolean**|  | [optional] |
| **secret** | **String**|  | [optional] |

### Return type

[**IpMessagingV1Credential**](IpMessagingV1Credential.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createInvite"></a>
# **createInvite**
> IpMessagingV1ServiceChannelInvite createInvite(serviceSid, channelSid, identity, roleSid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String identity = "identity_example"; // String | 
    String roleSid = "roleSid_example"; // String | 
    try {
      IpMessagingV1ServiceChannelInvite result = apiInstance.createInvite(serviceSid, channelSid, identity, roleSid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createInvite");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **identity** | **String**|  | |
| **roleSid** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceChannelInvite**](IpMessagingV1ServiceChannelInvite.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createMember"></a>
# **createMember**
> IpMessagingV1ServiceChannelMember createMember(serviceSid, channelSid, identity, roleSid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String identity = "identity_example"; // String | 
    String roleSid = "roleSid_example"; // String | 
    try {
      IpMessagingV1ServiceChannelMember result = apiInstance.createMember(serviceSid, channelSid, identity, roleSid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createMember");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **identity** | **String**|  | |
| **roleSid** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceChannelMember**](IpMessagingV1ServiceChannelMember.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createMessage"></a>
# **createMessage**
> IpMessagingV1ServiceChannelMessage createMessage(serviceSid, channelSid, body, attributes, from)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String body = "body_example"; // String | 
    String attributes = "attributes_example"; // String | 
    String from = "from_example"; // String | 
    try {
      IpMessagingV1ServiceChannelMessage result = apiInstance.createMessage(serviceSid, channelSid, body, attributes, from);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createMessage");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **body** | **String**|  | |
| **attributes** | **String**|  | [optional] |
| **from** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceChannelMessage**](IpMessagingV1ServiceChannelMessage.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createRole"></a>
# **createRole**
> IpMessagingV1ServiceRole createRole(serviceSid, friendlyName, permission, type)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    List<String> permission = Arrays.asList(); // List<String> | 
    RoleEnumRoleType type = RoleEnumRoleType.fromValue("channel"); // RoleEnumRoleType | 
    try {
      IpMessagingV1ServiceRole result = apiInstance.createRole(serviceSid, friendlyName, permission, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createRole");
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
| **serviceSid** | **String**|  | |
| **friendlyName** | **String**|  | |
| **permission** | [**List&lt;String&gt;**](String.md)|  | |
| **type** | [**RoleEnumRoleType**](RoleEnumRoleType.md)|  | [enum: channel, deployment] |

### Return type

[**IpMessagingV1ServiceRole**](IpMessagingV1ServiceRole.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createService"></a>
# **createService**
> IpMessagingV1Service createService(friendlyName)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String friendlyName = "friendlyName_example"; // String | 
    try {
      IpMessagingV1Service result = apiInstance.createService(friendlyName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createService");
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
| **friendlyName** | **String**|  | |

### Return type

[**IpMessagingV1Service**](IpMessagingV1Service.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createUser"></a>
# **createUser**
> IpMessagingV1ServiceUser createUser(serviceSid, identity, attributes, friendlyName, roleSid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String identity = "identity_example"; // String | 
    String attributes = "attributes_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    String roleSid = "roleSid_example"; // String | 
    try {
      IpMessagingV1ServiceUser result = apiInstance.createUser(serviceSid, identity, attributes, friendlyName, roleSid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createUser");
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
| **serviceSid** | **String**|  | |
| **identity** | **String**|  | |
| **attributes** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **roleSid** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceUser**](IpMessagingV1ServiceUser.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteChannel"></a>
# **deleteChannel**
> deleteChannel(serviceSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteChannel(serviceSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteChannel");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |

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

<a id="deleteCredential"></a>
# **deleteCredential**
> deleteCredential(sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteCredential(sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteCredential");
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
| **sid** | **String**|  | |

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

<a id="deleteInvite"></a>
# **deleteInvite**
> deleteInvite(serviceSid, channelSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteInvite(serviceSid, channelSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteInvite");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |

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

<a id="deleteMember"></a>
# **deleteMember**
> deleteMember(serviceSid, channelSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteMember(serviceSid, channelSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteMember");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |

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

<a id="deleteMessage"></a>
# **deleteMessage**
> deleteMessage(serviceSid, channelSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteMessage(serviceSid, channelSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteMessage");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |

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

<a id="deleteRole"></a>
# **deleteRole**
> deleteRole(serviceSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteRole(serviceSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteRole");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |

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

<a id="deleteService"></a>
# **deleteService**
> deleteService(sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteService(sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteService");
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
| **sid** | **String**|  | |

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

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(serviceSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      apiInstance.deleteUser(serviceSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteUser");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |

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

<a id="fetchChannel"></a>
# **fetchChannel**
> IpMessagingV1ServiceChannel fetchChannel(serviceSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1ServiceChannel result = apiInstance.fetchChannel(serviceSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchChannel");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1ServiceChannel**](IpMessagingV1ServiceChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchCredential"></a>
# **fetchCredential**
> IpMessagingV1Credential fetchCredential(sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1Credential result = apiInstance.fetchCredential(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchCredential");
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
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1Credential**](IpMessagingV1Credential.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchInvite"></a>
# **fetchInvite**
> IpMessagingV1ServiceChannelInvite fetchInvite(serviceSid, channelSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1ServiceChannelInvite result = apiInstance.fetchInvite(serviceSid, channelSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchInvite");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1ServiceChannelInvite**](IpMessagingV1ServiceChannelInvite.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchMember"></a>
# **fetchMember**
> IpMessagingV1ServiceChannelMember fetchMember(serviceSid, channelSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1ServiceChannelMember result = apiInstance.fetchMember(serviceSid, channelSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchMember");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1ServiceChannelMember**](IpMessagingV1ServiceChannelMember.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchMessage"></a>
# **fetchMessage**
> IpMessagingV1ServiceChannelMessage fetchMessage(serviceSid, channelSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1ServiceChannelMessage result = apiInstance.fetchMessage(serviceSid, channelSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchMessage");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1ServiceChannelMessage**](IpMessagingV1ServiceChannelMessage.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchRole"></a>
# **fetchRole**
> IpMessagingV1ServiceRole fetchRole(serviceSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1ServiceRole result = apiInstance.fetchRole(serviceSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchRole");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1ServiceRole**](IpMessagingV1ServiceRole.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchService"></a>
# **fetchService**
> IpMessagingV1Service fetchService(sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1Service result = apiInstance.fetchService(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchService");
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
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1Service**](IpMessagingV1Service.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchUser"></a>
# **fetchUser**
> IpMessagingV1ServiceUser fetchUser(serviceSid, sid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    try {
      IpMessagingV1ServiceUser result = apiInstance.fetchUser(serviceSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchUser");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |

### Return type

[**IpMessagingV1ServiceUser**](IpMessagingV1ServiceUser.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listChannel"></a>
# **listChannel**
> ListChannelResponse listChannel(serviceSid, type, pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    List<ChannelEnumChannelType> type = Arrays.asList(); // List<ChannelEnumChannelType> | 
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListChannelResponse result = apiInstance.listChannel(serviceSid, type, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listChannel");
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
| **serviceSid** | **String**|  | |
| **type** | [**List&lt;ChannelEnumChannelType&gt;**](ChannelEnumChannelType.md)|  | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListChannelResponse**](ListChannelResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCredential"></a>
# **listCredential**
> ListCredentialResponse listCredential(pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListCredentialResponse result = apiInstance.listCredential(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCredential");
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

[**ListCredentialResponse**](ListCredentialResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInvite"></a>
# **listInvite**
> ListInviteResponse listInvite(serviceSid, channelSid, identity, pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    List<String> identity = Arrays.asList(); // List<String> | 
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListInviteResponse result = apiInstance.listInvite(serviceSid, channelSid, identity, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listInvite");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **identity** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListInviteResponse**](ListInviteResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMember"></a>
# **listMember**
> ListMemberResponse listMember(serviceSid, channelSid, identity, pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    List<String> identity = Arrays.asList(); // List<String> | 
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListMemberResponse result = apiInstance.listMember(serviceSid, channelSid, identity, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listMember");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **identity** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListMemberResponse**](ListMemberResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMessage"></a>
# **listMessage**
> ListMessageResponse listMessage(serviceSid, channelSid, order, pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    MessageEnumOrderType order = MessageEnumOrderType.fromValue("asc"); // MessageEnumOrderType | 
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListMessageResponse result = apiInstance.listMessage(serviceSid, channelSid, order, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listMessage");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **order** | [**MessageEnumOrderType**](.md)|  | [optional] [enum: asc, desc] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListMessageResponse**](ListMessageResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listRole"></a>
# **listRole**
> ListRoleResponse listRole(serviceSid, pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListRoleResponse result = apiInstance.listRole(serviceSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listRole");
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
| **serviceSid** | **String**|  | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListRoleResponse**](ListRoleResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listService"></a>
# **listService**
> ListServiceResponse listService(pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListServiceResponse result = apiInstance.listService(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listService");
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

[**ListServiceResponse**](ListServiceResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listUser"></a>
# **listUser**
> ListUserResponse listUser(serviceSid, pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListUserResponse result = apiInstance.listUser(serviceSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listUser");
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
| **serviceSid** | **String**|  | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListUserResponse**](ListUserResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listUserChannel"></a>
# **listUserChannel**
> ListUserChannelResponse listUserChannel(serviceSid, userSid, pageSize, page, pageToken)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String userSid = "userSid_example"; // String | 
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListUserChannelResponse result = apiInstance.listUserChannel(serviceSid, userSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listUserChannel");
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
| **serviceSid** | **String**|  | |
| **userSid** | **String**|  | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListUserChannelResponse**](ListUserChannelResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateChannel"></a>
# **updateChannel**
> IpMessagingV1ServiceChannel updateChannel(serviceSid, sid, attributes, friendlyName, uniqueName)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    String attributes = "attributes_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    String uniqueName = "uniqueName_example"; // String | 
    try {
      IpMessagingV1ServiceChannel result = apiInstance.updateChannel(serviceSid, sid, attributes, friendlyName, uniqueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateChannel");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |
| **attributes** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **uniqueName** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceChannel**](IpMessagingV1ServiceChannel.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCredential"></a>
# **updateCredential**
> IpMessagingV1Credential updateCredential(sid, apiKey, certificate, friendlyName, privateKey, sandbox, secret)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | 
    String apiKey = "apiKey_example"; // String | 
    String certificate = "certificate_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    String privateKey = "privateKey_example"; // String | 
    Boolean sandbox = true; // Boolean | 
    String secret = "secret_example"; // String | 
    try {
      IpMessagingV1Credential result = apiInstance.updateCredential(sid, apiKey, certificate, friendlyName, privateKey, sandbox, secret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateCredential");
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
| **sid** | **String**|  | |
| **apiKey** | **String**|  | [optional] |
| **certificate** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **privateKey** | **String**|  | [optional] |
| **sandbox** | **Boolean**|  | [optional] |
| **secret** | **String**|  | [optional] |

### Return type

[**IpMessagingV1Credential**](IpMessagingV1Credential.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMember"></a>
# **updateMember**
> IpMessagingV1ServiceChannelMember updateMember(serviceSid, channelSid, sid, lastConsumedMessageIndex, roleSid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    Integer lastConsumedMessageIndex = 56; // Integer | 
    String roleSid = "roleSid_example"; // String | 
    try {
      IpMessagingV1ServiceChannelMember result = apiInstance.updateMember(serviceSid, channelSid, sid, lastConsumedMessageIndex, roleSid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateMember");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |
| **lastConsumedMessageIndex** | **Integer**|  | [optional] |
| **roleSid** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceChannelMember**](IpMessagingV1ServiceChannelMember.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMessage"></a>
# **updateMessage**
> IpMessagingV1ServiceChannelMessage updateMessage(serviceSid, channelSid, sid, attributes, body)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String channelSid = "channelSid_example"; // String | 
    String sid = "sid_example"; // String | 
    String attributes = "attributes_example"; // String | 
    String body = "body_example"; // String | 
    try {
      IpMessagingV1ServiceChannelMessage result = apiInstance.updateMessage(serviceSid, channelSid, sid, attributes, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateMessage");
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
| **serviceSid** | **String**|  | |
| **channelSid** | **String**|  | |
| **sid** | **String**|  | |
| **attributes** | **String**|  | [optional] |
| **body** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceChannelMessage**](IpMessagingV1ServiceChannelMessage.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateRole"></a>
# **updateRole**
> IpMessagingV1ServiceRole updateRole(serviceSid, sid, permission)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    List<String> permission = Arrays.asList(); // List<String> | 
    try {
      IpMessagingV1ServiceRole result = apiInstance.updateRole(serviceSid, sid, permission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateRole");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |
| **permission** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**IpMessagingV1ServiceRole**](IpMessagingV1ServiceRole.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateService"></a>
# **updateService**
> IpMessagingV1Service updateService(sid, consumptionReportInterval, defaultChannelCreatorRoleSid, defaultChannelRoleSid, defaultServiceRoleSid, friendlyName, limitsChannelMembers, limitsUserChannels, notificationsAddedToChannelEnabled, notificationsAddedToChannelTemplate, notificationsInvitedToChannelEnabled, notificationsInvitedToChannelTemplate, notificationsNewMessageEnabled, notificationsNewMessageTemplate, notificationsRemovedFromChannelEnabled, notificationsRemovedFromChannelTemplate, postWebhookUrl, preWebhookUrl, reachabilityEnabled, readStatusEnabled, typingIndicatorTimeout, webhookFilters, webhookMethod, webhooksOnChannelAddMethod, webhooksOnChannelAddUrl, webhooksOnChannelAddedMethod, webhooksOnChannelAddedUrl, webhooksOnChannelDestroyMethod, webhooksOnChannelDestroyUrl, webhooksOnChannelDestroyedMethod, webhooksOnChannelDestroyedUrl, webhooksOnChannelUpdateMethod, webhooksOnChannelUpdateUrl, webhooksOnChannelUpdatedMethod, webhooksOnChannelUpdatedUrl, webhooksOnMemberAddMethod, webhooksOnMemberAddUrl, webhooksOnMemberAddedMethod, webhooksOnMemberAddedUrl, webhooksOnMemberRemoveMethod, webhooksOnMemberRemoveUrl, webhooksOnMemberRemovedMethod, webhooksOnMemberRemovedUrl, webhooksOnMessageRemoveMethod, webhooksOnMessageRemoveUrl, webhooksOnMessageRemovedMethod, webhooksOnMessageRemovedUrl, webhooksOnMessageSendMethod, webhooksOnMessageSendUrl, webhooksOnMessageSentMethod, webhooksOnMessageSentUrl, webhooksOnMessageUpdateMethod, webhooksOnMessageUpdateUrl, webhooksOnMessageUpdatedMethod, webhooksOnMessageUpdatedUrl)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | 
    Integer consumptionReportInterval = 56; // Integer | 
    String defaultChannelCreatorRoleSid = "defaultChannelCreatorRoleSid_example"; // String | 
    String defaultChannelRoleSid = "defaultChannelRoleSid_example"; // String | 
    String defaultServiceRoleSid = "defaultServiceRoleSid_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    Integer limitsChannelMembers = 56; // Integer | 
    Integer limitsUserChannels = 56; // Integer | 
    Boolean notificationsAddedToChannelEnabled = true; // Boolean | 
    String notificationsAddedToChannelTemplate = "notificationsAddedToChannelTemplate_example"; // String | 
    Boolean notificationsInvitedToChannelEnabled = true; // Boolean | 
    String notificationsInvitedToChannelTemplate = "notificationsInvitedToChannelTemplate_example"; // String | 
    Boolean notificationsNewMessageEnabled = true; // Boolean | 
    String notificationsNewMessageTemplate = "notificationsNewMessageTemplate_example"; // String | 
    Boolean notificationsRemovedFromChannelEnabled = true; // Boolean | 
    String notificationsRemovedFromChannelTemplate = "notificationsRemovedFromChannelTemplate_example"; // String | 
    URI postWebhookUrl = new URI(); // URI | 
    URI preWebhookUrl = new URI(); // URI | 
    Boolean reachabilityEnabled = true; // Boolean | 
    Boolean readStatusEnabled = true; // Boolean | 
    Integer typingIndicatorTimeout = 56; // Integer | 
    List<String> webhookFilters = Arrays.asList(); // List<String> | 
    String webhookMethod = "HEAD"; // String | 
    String webhooksOnChannelAddMethod = "HEAD"; // String | 
    URI webhooksOnChannelAddUrl = new URI(); // URI | 
    String webhooksOnChannelAddedMethod = "HEAD"; // String | 
    URI webhooksOnChannelAddedUrl = new URI(); // URI | 
    String webhooksOnChannelDestroyMethod = "HEAD"; // String | 
    URI webhooksOnChannelDestroyUrl = new URI(); // URI | 
    String webhooksOnChannelDestroyedMethod = "HEAD"; // String | 
    URI webhooksOnChannelDestroyedUrl = new URI(); // URI | 
    String webhooksOnChannelUpdateMethod = "HEAD"; // String | 
    URI webhooksOnChannelUpdateUrl = new URI(); // URI | 
    String webhooksOnChannelUpdatedMethod = "HEAD"; // String | 
    URI webhooksOnChannelUpdatedUrl = new URI(); // URI | 
    String webhooksOnMemberAddMethod = "HEAD"; // String | 
    URI webhooksOnMemberAddUrl = new URI(); // URI | 
    String webhooksOnMemberAddedMethod = "HEAD"; // String | 
    URI webhooksOnMemberAddedUrl = new URI(); // URI | 
    String webhooksOnMemberRemoveMethod = "HEAD"; // String | 
    URI webhooksOnMemberRemoveUrl = new URI(); // URI | 
    String webhooksOnMemberRemovedMethod = "HEAD"; // String | 
    URI webhooksOnMemberRemovedUrl = new URI(); // URI | 
    String webhooksOnMessageRemoveMethod = "HEAD"; // String | 
    URI webhooksOnMessageRemoveUrl = new URI(); // URI | 
    String webhooksOnMessageRemovedMethod = "HEAD"; // String | 
    URI webhooksOnMessageRemovedUrl = new URI(); // URI | 
    String webhooksOnMessageSendMethod = "HEAD"; // String | 
    URI webhooksOnMessageSendUrl = new URI(); // URI | 
    String webhooksOnMessageSentMethod = "HEAD"; // String | 
    URI webhooksOnMessageSentUrl = new URI(); // URI | 
    String webhooksOnMessageUpdateMethod = "HEAD"; // String | 
    URI webhooksOnMessageUpdateUrl = new URI(); // URI | 
    String webhooksOnMessageUpdatedMethod = "HEAD"; // String | 
    URI webhooksOnMessageUpdatedUrl = new URI(); // URI | 
    try {
      IpMessagingV1Service result = apiInstance.updateService(sid, consumptionReportInterval, defaultChannelCreatorRoleSid, defaultChannelRoleSid, defaultServiceRoleSid, friendlyName, limitsChannelMembers, limitsUserChannels, notificationsAddedToChannelEnabled, notificationsAddedToChannelTemplate, notificationsInvitedToChannelEnabled, notificationsInvitedToChannelTemplate, notificationsNewMessageEnabled, notificationsNewMessageTemplate, notificationsRemovedFromChannelEnabled, notificationsRemovedFromChannelTemplate, postWebhookUrl, preWebhookUrl, reachabilityEnabled, readStatusEnabled, typingIndicatorTimeout, webhookFilters, webhookMethod, webhooksOnChannelAddMethod, webhooksOnChannelAddUrl, webhooksOnChannelAddedMethod, webhooksOnChannelAddedUrl, webhooksOnChannelDestroyMethod, webhooksOnChannelDestroyUrl, webhooksOnChannelDestroyedMethod, webhooksOnChannelDestroyedUrl, webhooksOnChannelUpdateMethod, webhooksOnChannelUpdateUrl, webhooksOnChannelUpdatedMethod, webhooksOnChannelUpdatedUrl, webhooksOnMemberAddMethod, webhooksOnMemberAddUrl, webhooksOnMemberAddedMethod, webhooksOnMemberAddedUrl, webhooksOnMemberRemoveMethod, webhooksOnMemberRemoveUrl, webhooksOnMemberRemovedMethod, webhooksOnMemberRemovedUrl, webhooksOnMessageRemoveMethod, webhooksOnMessageRemoveUrl, webhooksOnMessageRemovedMethod, webhooksOnMessageRemovedUrl, webhooksOnMessageSendMethod, webhooksOnMessageSendUrl, webhooksOnMessageSentMethod, webhooksOnMessageSentUrl, webhooksOnMessageUpdateMethod, webhooksOnMessageUpdateUrl, webhooksOnMessageUpdatedMethod, webhooksOnMessageUpdatedUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateService");
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
| **sid** | **String**|  | |
| **consumptionReportInterval** | **Integer**|  | [optional] |
| **defaultChannelCreatorRoleSid** | **String**|  | [optional] |
| **defaultChannelRoleSid** | **String**|  | [optional] |
| **defaultServiceRoleSid** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **limitsChannelMembers** | **Integer**|  | [optional] |
| **limitsUserChannels** | **Integer**|  | [optional] |
| **notificationsAddedToChannelEnabled** | **Boolean**|  | [optional] |
| **notificationsAddedToChannelTemplate** | **String**|  | [optional] |
| **notificationsInvitedToChannelEnabled** | **Boolean**|  | [optional] |
| **notificationsInvitedToChannelTemplate** | **String**|  | [optional] |
| **notificationsNewMessageEnabled** | **Boolean**|  | [optional] |
| **notificationsNewMessageTemplate** | **String**|  | [optional] |
| **notificationsRemovedFromChannelEnabled** | **Boolean**|  | [optional] |
| **notificationsRemovedFromChannelTemplate** | **String**|  | [optional] |
| **postWebhookUrl** | **URI**|  | [optional] |
| **preWebhookUrl** | **URI**|  | [optional] |
| **reachabilityEnabled** | **Boolean**|  | [optional] |
| **readStatusEnabled** | **Boolean**|  | [optional] |
| **typingIndicatorTimeout** | **Integer**|  | [optional] |
| **webhookFilters** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **webhookMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnChannelAddMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnChannelAddUrl** | **URI**|  | [optional] |
| **webhooksOnChannelAddedMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnChannelAddedUrl** | **URI**|  | [optional] |
| **webhooksOnChannelDestroyMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnChannelDestroyUrl** | **URI**|  | [optional] |
| **webhooksOnChannelDestroyedMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnChannelDestroyedUrl** | **URI**|  | [optional] |
| **webhooksOnChannelUpdateMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnChannelUpdateUrl** | **URI**|  | [optional] |
| **webhooksOnChannelUpdatedMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnChannelUpdatedUrl** | **URI**|  | [optional] |
| **webhooksOnMemberAddMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMemberAddUrl** | **URI**|  | [optional] |
| **webhooksOnMemberAddedMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMemberAddedUrl** | **URI**|  | [optional] |
| **webhooksOnMemberRemoveMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMemberRemoveUrl** | **URI**|  | [optional] |
| **webhooksOnMemberRemovedMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMemberRemovedUrl** | **URI**|  | [optional] |
| **webhooksOnMessageRemoveMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMessageRemoveUrl** | **URI**|  | [optional] |
| **webhooksOnMessageRemovedMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMessageRemovedUrl** | **URI**|  | [optional] |
| **webhooksOnMessageSendMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMessageSendUrl** | **URI**|  | [optional] |
| **webhooksOnMessageSentMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMessageSentUrl** | **URI**|  | [optional] |
| **webhooksOnMessageUpdateMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMessageUpdateUrl** | **URI**|  | [optional] |
| **webhooksOnMessageUpdatedMethod** | **String**|  | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **webhooksOnMessageUpdatedUrl** | **URI**|  | [optional] |

### Return type

[**IpMessagingV1Service**](IpMessagingV1Service.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateUser"></a>
# **updateUser**
> IpMessagingV1ServiceUser updateUser(serviceSid, sid, attributes, friendlyName, roleSid)





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
    defaultClient.setBasePath("https://ip-messaging.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String serviceSid = "serviceSid_example"; // String | 
    String sid = "sid_example"; // String | 
    String attributes = "attributes_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    String roleSid = "roleSid_example"; // String | 
    try {
      IpMessagingV1ServiceUser result = apiInstance.updateUser(serviceSid, sid, attributes, friendlyName, roleSid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateUser");
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
| **serviceSid** | **String**|  | |
| **sid** | **String**|  | |
| **attributes** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **roleSid** | **String**|  | [optional] |

### Return type

[**IpMessagingV1ServiceUser**](IpMessagingV1ServiceUser.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

