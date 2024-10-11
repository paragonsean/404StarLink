# DefaultApi

All URIs are relative to *https://supersim.twilio.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEsimProfile**](DefaultApi.md#createEsimProfile) | **POST** /v1/ESimProfiles |  |
| [**createFleet**](DefaultApi.md#createFleet) | **POST** /v1/Fleets |  |
| [**createIpCommand**](DefaultApi.md#createIpCommand) | **POST** /v1/IpCommands |  |
| [**createNetworkAccessProfile**](DefaultApi.md#createNetworkAccessProfile) | **POST** /v1/NetworkAccessProfiles |  |
| [**createNetworkAccessProfileNetwork**](DefaultApi.md#createNetworkAccessProfileNetwork) | **POST** /v1/NetworkAccessProfiles/{NetworkAccessProfileSid}/Networks |  |
| [**createSim**](DefaultApi.md#createSim) | **POST** /v1/Sims |  |
| [**createSmsCommand**](DefaultApi.md#createSmsCommand) | **POST** /v1/SmsCommands |  |
| [**deleteNetworkAccessProfileNetwork**](DefaultApi.md#deleteNetworkAccessProfileNetwork) | **DELETE** /v1/NetworkAccessProfiles/{NetworkAccessProfileSid}/Networks/{Sid} |  |
| [**fetchEsimProfile**](DefaultApi.md#fetchEsimProfile) | **GET** /v1/ESimProfiles/{Sid} |  |
| [**fetchFleet**](DefaultApi.md#fetchFleet) | **GET** /v1/Fleets/{Sid} |  |
| [**fetchIpCommand**](DefaultApi.md#fetchIpCommand) | **GET** /v1/IpCommands/{Sid} |  |
| [**fetchNetwork**](DefaultApi.md#fetchNetwork) | **GET** /v1/Networks/{Sid} |  |
| [**fetchNetworkAccessProfile**](DefaultApi.md#fetchNetworkAccessProfile) | **GET** /v1/NetworkAccessProfiles/{Sid} |  |
| [**fetchNetworkAccessProfileNetwork**](DefaultApi.md#fetchNetworkAccessProfileNetwork) | **GET** /v1/NetworkAccessProfiles/{NetworkAccessProfileSid}/Networks/{Sid} |  |
| [**fetchSim**](DefaultApi.md#fetchSim) | **GET** /v1/Sims/{Sid} |  |
| [**fetchSmsCommand**](DefaultApi.md#fetchSmsCommand) | **GET** /v1/SmsCommands/{Sid} |  |
| [**listBillingPeriod**](DefaultApi.md#listBillingPeriod) | **GET** /v1/Sims/{SimSid}/BillingPeriods |  |
| [**listEsimProfile**](DefaultApi.md#listEsimProfile) | **GET** /v1/ESimProfiles |  |
| [**listFleet**](DefaultApi.md#listFleet) | **GET** /v1/Fleets |  |
| [**listIpCommand**](DefaultApi.md#listIpCommand) | **GET** /v1/IpCommands |  |
| [**listNetwork**](DefaultApi.md#listNetwork) | **GET** /v1/Networks |  |
| [**listNetworkAccessProfile**](DefaultApi.md#listNetworkAccessProfile) | **GET** /v1/NetworkAccessProfiles |  |
| [**listNetworkAccessProfileNetwork**](DefaultApi.md#listNetworkAccessProfileNetwork) | **GET** /v1/NetworkAccessProfiles/{NetworkAccessProfileSid}/Networks |  |
| [**listSettingsUpdate**](DefaultApi.md#listSettingsUpdate) | **GET** /v1/SettingsUpdates |  |
| [**listSim**](DefaultApi.md#listSim) | **GET** /v1/Sims |  |
| [**listSimIpAddress**](DefaultApi.md#listSimIpAddress) | **GET** /v1/Sims/{SimSid}/IpAddresses |  |
| [**listSmsCommand**](DefaultApi.md#listSmsCommand) | **GET** /v1/SmsCommands |  |
| [**listUsageRecord**](DefaultApi.md#listUsageRecord) | **GET** /v1/UsageRecords |  |
| [**updateFleet**](DefaultApi.md#updateFleet) | **POST** /v1/Fleets/{Sid} |  |
| [**updateNetworkAccessProfile**](DefaultApi.md#updateNetworkAccessProfile) | **POST** /v1/NetworkAccessProfiles/{Sid} |  |
| [**updateSim**](DefaultApi.md#updateSim) | **POST** /v1/Sims/{Sid} |  |


<a id="createEsimProfile"></a>
# **createEsimProfile**
> SupersimV1EsimProfile createEsimProfile(callbackMethod, callbackUrl, eid, generateMatchingId)



Order an eSIM Profile.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String callbackMethod = "HEAD"; // String | The HTTP method we should use to call `callback_url`. Can be: `GET` or `POST` and the default is POST.
    String callbackUrl = "callbackUrl_example"; // String | The URL we should call using the `callback_method` when the status of the eSIM Profile changes. At this stage of the eSIM Profile pilot, the a request to the URL will only be called when the ESimProfile resource changes from `reserving` to `available`.
    String eid = "eid_example"; // String | Identifier of the eUICC that will claim the eSIM Profile.
    Boolean generateMatchingId = true; // Boolean | When set to `true`, a value for `Eid` does not need to be provided. Instead, when the eSIM profile is reserved, a matching ID will be generated and returned via the `matching_id` property. This identifies the specific eSIM profile that can be used by any capable device to claim and download the profile.
    try {
      SupersimV1EsimProfile result = apiInstance.createEsimProfile(callbackMethod, callbackUrl, eid, generateMatchingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createEsimProfile");
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
| **callbackMethod** | **String**| The HTTP method we should use to call &#x60;callback_url&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and the default is POST. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **callbackUrl** | **String**| The URL we should call using the &#x60;callback_method&#x60; when the status of the eSIM Profile changes. At this stage of the eSIM Profile pilot, the a request to the URL will only be called when the ESimProfile resource changes from &#x60;reserving&#x60; to &#x60;available&#x60;. | [optional] |
| **eid** | **String**| Identifier of the eUICC that will claim the eSIM Profile. | [optional] |
| **generateMatchingId** | **Boolean**| When set to &#x60;true&#x60;, a value for &#x60;Eid&#x60; does not need to be provided. Instead, when the eSIM profile is reserved, a matching ID will be generated and returned via the &#x60;matching_id&#x60; property. This identifies the specific eSIM profile that can be used by any capable device to claim and download the profile. | [optional] |

### Return type

[**SupersimV1EsimProfile**](SupersimV1EsimProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createFleet"></a>
# **createFleet**
> SupersimV1Fleet createFleet(networkAccessProfile, dataEnabled, dataLimit, ipCommandsMethod, ipCommandsUrl, smsCommandsEnabled, smsCommandsMethod, smsCommandsUrl, uniqueName)



Create a Fleet

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String networkAccessProfile = "networkAccessProfile_example"; // String | The SID or unique name of the Network Access Profile that will control which cellular networks the Fleet's SIMs can connect to.
    Boolean dataEnabled = true; // Boolean | Defines whether SIMs in the Fleet are capable of using 2G/3G/4G/LTE/CAT-M data connectivity. Defaults to `true`.
    Integer dataLimit = 56; // Integer | The total data usage (download and upload combined) in Megabytes that each Super SIM assigned to the Fleet can consume during a billing period (normally one month). Value must be between 1MB (1) and 2TB (2,000,000). Defaults to 1GB (1,000).
    String ipCommandsMethod = "HEAD"; // String | A string representing the HTTP method to use when making a request to `ip_commands_url`. Can be one of `POST` or `GET`. Defaults to `POST`.
    URI ipCommandsUrl = new URI(); // URI | The URL that will receive a webhook when a Super SIM in the Fleet is used to send an IP Command from your device to a special IP address. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored.
    Boolean smsCommandsEnabled = true; // Boolean | Defines whether SIMs in the Fleet are capable of sending and receiving machine-to-machine SMS via Commands. Defaults to `true`.
    String smsCommandsMethod = "HEAD"; // String | A string representing the HTTP method to use when making a request to `sms_commands_url`. Can be one of `POST` or `GET`. Defaults to `POST`.
    URI smsCommandsUrl = new URI(); // URI | The URL that will receive a webhook when a Super SIM in the Fleet is used to send an SMS from your device to the SMS Commands number. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored.
    String uniqueName = "uniqueName_example"; // String | An application-defined string that uniquely identifies the resource. It can be used in place of the resource's `sid` in the URL to address the resource.
    try {
      SupersimV1Fleet result = apiInstance.createFleet(networkAccessProfile, dataEnabled, dataLimit, ipCommandsMethod, ipCommandsUrl, smsCommandsEnabled, smsCommandsMethod, smsCommandsUrl, uniqueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createFleet");
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
| **networkAccessProfile** | **String**| The SID or unique name of the Network Access Profile that will control which cellular networks the Fleet&#39;s SIMs can connect to. | |
| **dataEnabled** | **Boolean**| Defines whether SIMs in the Fleet are capable of using 2G/3G/4G/LTE/CAT-M data connectivity. Defaults to &#x60;true&#x60;. | [optional] |
| **dataLimit** | **Integer**| The total data usage (download and upload combined) in Megabytes that each Super SIM assigned to the Fleet can consume during a billing period (normally one month). Value must be between 1MB (1) and 2TB (2,000,000). Defaults to 1GB (1,000). | [optional] |
| **ipCommandsMethod** | **String**| A string representing the HTTP method to use when making a request to &#x60;ip_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **ipCommandsUrl** | **URI**| The URL that will receive a webhook when a Super SIM in the Fleet is used to send an IP Command from your device to a special IP address. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored. | [optional] |
| **smsCommandsEnabled** | **Boolean**| Defines whether SIMs in the Fleet are capable of sending and receiving machine-to-machine SMS via Commands. Defaults to &#x60;true&#x60;. | [optional] |
| **smsCommandsMethod** | **String**| A string representing the HTTP method to use when making a request to &#x60;sms_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **smsCommandsUrl** | **URI**| The URL that will receive a webhook when a Super SIM in the Fleet is used to send an SMS from your device to the SMS Commands number. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored. | [optional] |
| **uniqueName** | **String**| An application-defined string that uniquely identifies the resource. It can be used in place of the resource&#39;s &#x60;sid&#x60; in the URL to address the resource. | [optional] |

### Return type

[**SupersimV1Fleet**](SupersimV1Fleet.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createIpCommand"></a>
# **createIpCommand**
> SupersimV1IpCommand createIpCommand(devicePort, payload, sim, callbackMethod, callbackUrl, payloadType)



Send an IP Command to a Super SIM.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer devicePort = 56; // Integer | The device port to which the IP Command will be sent.
    String payload = "payload_example"; // String | The data that will be sent to the device. The payload cannot exceed 1300 bytes. If the PayloadType is set to text, the payload is encoded in UTF-8. If PayloadType is set to binary, the payload is encoded in Base64.
    String sim = "sim_example"; // String | The `sid` or `unique_name` of the [Super SIM](https://www.twilio.com/docs/iot/supersim/api/sim-resource) to send the IP Command to.
    String callbackMethod = "HEAD"; // String | The HTTP method we should use to call `callback_url`. Can be `GET` or `POST`, and the default is `POST`.
    URI callbackUrl = new URI(); // URI | The URL we should call using the `callback_method` after we have sent the IP Command.
    IpCommandEnumPayloadType payloadType = IpCommandEnumPayloadType.fromValue("text"); // IpCommandEnumPayloadType | 
    try {
      SupersimV1IpCommand result = apiInstance.createIpCommand(devicePort, payload, sim, callbackMethod, callbackUrl, payloadType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createIpCommand");
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
| **devicePort** | **Integer**| The device port to which the IP Command will be sent. | |
| **payload** | **String**| The data that will be sent to the device. The payload cannot exceed 1300 bytes. If the PayloadType is set to text, the payload is encoded in UTF-8. If PayloadType is set to binary, the payload is encoded in Base64. | |
| **sim** | **String**| The &#x60;sid&#x60; or &#x60;unique_name&#x60; of the [Super SIM](https://www.twilio.com/docs/iot/supersim/api/sim-resource) to send the IP Command to. | |
| **callbackMethod** | **String**| The HTTP method we should use to call &#x60;callback_url&#x60;. Can be &#x60;GET&#x60; or &#x60;POST&#x60;, and the default is &#x60;POST&#x60;. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **callbackUrl** | **URI**| The URL we should call using the &#x60;callback_method&#x60; after we have sent the IP Command. | [optional] |
| **payloadType** | **IpCommandEnumPayloadType**|  | [optional] [enum: text, binary] |

### Return type

[**SupersimV1IpCommand**](SupersimV1IpCommand.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createNetworkAccessProfile"></a>
# **createNetworkAccessProfile**
> SupersimV1NetworkAccessProfile createNetworkAccessProfile(networks, uniqueName)



Create a new Network Access Profile

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<String> networks = Arrays.asList(); // List<String> | List of Network SIDs that this Network Access Profile will allow connections to.
    String uniqueName = "uniqueName_example"; // String | An application-defined string that uniquely identifies the resource. It can be used in place of the resource's `sid` in the URL to address the resource.
    try {
      SupersimV1NetworkAccessProfile result = apiInstance.createNetworkAccessProfile(networks, uniqueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createNetworkAccessProfile");
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
| **networks** | [**List&lt;String&gt;**](String.md)| List of Network SIDs that this Network Access Profile will allow connections to. | [optional] |
| **uniqueName** | **String**| An application-defined string that uniquely identifies the resource. It can be used in place of the resource&#39;s &#x60;sid&#x60; in the URL to address the resource. | [optional] |

### Return type

[**SupersimV1NetworkAccessProfile**](SupersimV1NetworkAccessProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createNetworkAccessProfileNetwork"></a>
# **createNetworkAccessProfileNetwork**
> SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork createNetworkAccessProfileNetwork(networkAccessProfileSid, network)



Add a Network resource to the Network Access Profile resource.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String networkAccessProfileSid = "networkAccessProfileSid_example"; // String | The unique string that identifies the Network Access Profile resource.
    String network = "network_example"; // String | The SID of the Network resource to be added to the Network Access Profile resource.
    try {
      SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork result = apiInstance.createNetworkAccessProfileNetwork(networkAccessProfileSid, network);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createNetworkAccessProfileNetwork");
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
| **networkAccessProfileSid** | **String**| The unique string that identifies the Network Access Profile resource. | |
| **network** | **String**| The SID of the Network resource to be added to the Network Access Profile resource. | |

### Return type

[**SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork**](SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createSim"></a>
# **createSim**
> SupersimV1Sim createSim(iccid, registrationCode)



Register a Super SIM to your Account

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String iccid = "iccid_example"; // String | The [ICCID](https://en.wikipedia.org/wiki/Subscriber_identity_module#ICCID) of the Super SIM to be added to your Account.
    String registrationCode = "registrationCode_example"; // String | The 10-digit code required to claim the Super SIM for your Account.
    try {
      SupersimV1Sim result = apiInstance.createSim(iccid, registrationCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSim");
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
| **iccid** | **String**| The [ICCID](https://en.wikipedia.org/wiki/Subscriber_identity_module#ICCID) of the Super SIM to be added to your Account. | |
| **registrationCode** | **String**| The 10-digit code required to claim the Super SIM for your Account. | |

### Return type

[**SupersimV1Sim**](SupersimV1Sim.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createSmsCommand"></a>
# **createSmsCommand**
> SupersimV1SmsCommand createSmsCommand(payload, sim, callbackMethod, callbackUrl)



Send SMS Command to a Sim.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String payload = "payload_example"; // String | The message body of the SMS Command.
    String sim = "sim_example"; // String | The `sid` or `unique_name` of the [SIM](https://www.twilio.com/docs/iot/supersim/api/sim-resource) to send the SMS Command to.
    String callbackMethod = "HEAD"; // String | The HTTP method we should use to call `callback_url`. Can be: `GET` or `POST` and the default is POST.
    URI callbackUrl = new URI(); // URI | The URL we should call using the `callback_method` after we have sent the command.
    try {
      SupersimV1SmsCommand result = apiInstance.createSmsCommand(payload, sim, callbackMethod, callbackUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSmsCommand");
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
| **payload** | **String**| The message body of the SMS Command. | |
| **sim** | **String**| The &#x60;sid&#x60; or &#x60;unique_name&#x60; of the [SIM](https://www.twilio.com/docs/iot/supersim/api/sim-resource) to send the SMS Command to. | |
| **callbackMethod** | **String**| The HTTP method we should use to call &#x60;callback_url&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and the default is POST. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **callbackUrl** | **URI**| The URL we should call using the &#x60;callback_method&#x60; after we have sent the command. | [optional] |

### Return type

[**SupersimV1SmsCommand**](SupersimV1SmsCommand.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteNetworkAccessProfileNetwork"></a>
# **deleteNetworkAccessProfileNetwork**
> deleteNetworkAccessProfileNetwork(networkAccessProfileSid, sid)



Remove a Network resource from the Network Access Profile resource&#39;s.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String networkAccessProfileSid = "networkAccessProfileSid_example"; // String | The unique string that identifies the Network Access Profile resource.
    String sid = "sid_example"; // String | The SID of the Network resource to be removed from the Network Access Profile resource.
    try {
      apiInstance.deleteNetworkAccessProfileNetwork(networkAccessProfileSid, sid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteNetworkAccessProfileNetwork");
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
| **networkAccessProfileSid** | **String**| The unique string that identifies the Network Access Profile resource. | |
| **sid** | **String**| The SID of the Network resource to be removed from the Network Access Profile resource. | |

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

<a id="fetchEsimProfile"></a>
# **fetchEsimProfile**
> SupersimV1EsimProfile fetchEsimProfile(sid)



Fetch an eSIM Profile.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the eSIM Profile resource to fetch.
    try {
      SupersimV1EsimProfile result = apiInstance.fetchEsimProfile(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchEsimProfile");
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
| **sid** | **String**| The SID of the eSIM Profile resource to fetch. | |

### Return type

[**SupersimV1EsimProfile**](SupersimV1EsimProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchFleet"></a>
# **fetchFleet**
> SupersimV1Fleet fetchFleet(sid)



Fetch a Fleet instance from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the Fleet resource to fetch.
    try {
      SupersimV1Fleet result = apiInstance.fetchFleet(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchFleet");
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
| **sid** | **String**| The SID of the Fleet resource to fetch. | |

### Return type

[**SupersimV1Fleet**](SupersimV1Fleet.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchIpCommand"></a>
# **fetchIpCommand**
> SupersimV1IpCommand fetchIpCommand(sid)



Fetch IP Command instance from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the IP Command resource to fetch.
    try {
      SupersimV1IpCommand result = apiInstance.fetchIpCommand(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchIpCommand");
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
| **sid** | **String**| The SID of the IP Command resource to fetch. | |

### Return type

[**SupersimV1IpCommand**](SupersimV1IpCommand.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchNetwork"></a>
# **fetchNetwork**
> SupersimV1Network fetchNetwork(sid)



Fetch a Network resource.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the Network resource to fetch.
    try {
      SupersimV1Network result = apiInstance.fetchNetwork(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchNetwork");
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
| **sid** | **String**| The SID of the Network resource to fetch. | |

### Return type

[**SupersimV1Network**](SupersimV1Network.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchNetworkAccessProfile"></a>
# **fetchNetworkAccessProfile**
> SupersimV1NetworkAccessProfile fetchNetworkAccessProfile(sid)



Fetch a Network Access Profile instance from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the Network Access Profile resource to fetch.
    try {
      SupersimV1NetworkAccessProfile result = apiInstance.fetchNetworkAccessProfile(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchNetworkAccessProfile");
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
| **sid** | **String**| The SID of the Network Access Profile resource to fetch. | |

### Return type

[**SupersimV1NetworkAccessProfile**](SupersimV1NetworkAccessProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchNetworkAccessProfileNetwork"></a>
# **fetchNetworkAccessProfileNetwork**
> SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork fetchNetworkAccessProfileNetwork(networkAccessProfileSid, sid)



Fetch a Network Access Profile resource&#39;s Network resource.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String networkAccessProfileSid = "networkAccessProfileSid_example"; // String | The unique string that identifies the Network Access Profile resource.
    String sid = "sid_example"; // String | The SID of the Network resource to fetch.
    try {
      SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork result = apiInstance.fetchNetworkAccessProfileNetwork(networkAccessProfileSid, sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchNetworkAccessProfileNetwork");
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
| **networkAccessProfileSid** | **String**| The unique string that identifies the Network Access Profile resource. | |
| **sid** | **String**| The SID of the Network resource to fetch. | |

### Return type

[**SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork**](SupersimV1NetworkAccessProfileNetworkAccessProfileNetwork.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchSim"></a>
# **fetchSim**
> SupersimV1Sim fetchSim(sid)



Fetch a Super SIM instance from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the Sim resource to fetch.
    try {
      SupersimV1Sim result = apiInstance.fetchSim(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchSim");
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
| **sid** | **String**| The SID of the Sim resource to fetch. | |

### Return type

[**SupersimV1Sim**](SupersimV1Sim.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchSmsCommand"></a>
# **fetchSmsCommand**
> SupersimV1SmsCommand fetchSmsCommand(sid)



Fetch SMS Command instance from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the SMS Command resource to fetch.
    try {
      SupersimV1SmsCommand result = apiInstance.fetchSmsCommand(sid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fetchSmsCommand");
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
| **sid** | **String**| The SID of the SMS Command resource to fetch. | |

### Return type

[**SupersimV1SmsCommand**](SupersimV1SmsCommand.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listBillingPeriod"></a>
# **listBillingPeriod**
> ListBillingPeriodResponse listBillingPeriod(simSid, pageSize, page, pageToken)



Retrieve a list of Billing Periods for a Super SIM.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String simSid = "simSid_example"; // String | The SID of the Super SIM to list Billing Periods for.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListBillingPeriodResponse result = apiInstance.listBillingPeriod(simSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listBillingPeriod");
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
| **simSid** | **String**| The SID of the Super SIM to list Billing Periods for. | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListBillingPeriodResponse**](ListBillingPeriodResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listEsimProfile"></a>
# **listEsimProfile**
> ListEsimProfileResponse listEsimProfile(eid, simSid, status, pageSize, page, pageToken)



Retrieve a list of eSIM Profiles.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String eid = "eid_example"; // String | List the eSIM Profiles that have been associated with an EId.
    String simSid = "simSid_example"; // String | Find the eSIM Profile resource related to a [Sim](https://www.twilio.com/docs/wireless/api/sim-resource) resource by providing the SIM SID. Will always return an array with either 1 or 0 records.
    EsimProfileEnumStatus status = EsimProfileEnumStatus.fromValue("new"); // EsimProfileEnumStatus | List the eSIM Profiles that are in a given status.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListEsimProfileResponse result = apiInstance.listEsimProfile(eid, simSid, status, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listEsimProfile");
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
| **eid** | **String**| List the eSIM Profiles that have been associated with an EId. | [optional] |
| **simSid** | **String**| Find the eSIM Profile resource related to a [Sim](https://www.twilio.com/docs/wireless/api/sim-resource) resource by providing the SIM SID. Will always return an array with either 1 or 0 records. | [optional] |
| **status** | **EsimProfileEnumStatus**| List the eSIM Profiles that are in a given status. | [optional] [enum: new, reserving, available, downloaded, installed, failed] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListEsimProfileResponse**](ListEsimProfileResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listFleet"></a>
# **listFleet**
> ListFleetResponse listFleet(networkAccessProfile, pageSize, page, pageToken)



Retrieve a list of Fleets from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String networkAccessProfile = "networkAccessProfile_example"; // String | The SID or unique name of the Network Access Profile that controls which cellular networks the Fleet's SIMs can connect to.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListFleetResponse result = apiInstance.listFleet(networkAccessProfile, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listFleet");
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
| **networkAccessProfile** | **String**| The SID or unique name of the Network Access Profile that controls which cellular networks the Fleet&#39;s SIMs can connect to. | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListFleetResponse**](ListFleetResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listIpCommand"></a>
# **listIpCommand**
> ListIpCommandResponse listIpCommand(sim, simIccid, status, direction, pageSize, page, pageToken)



Retrieve a list of IP Commands from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sim = "sim_example"; // String | The SID or unique name of the Sim resource that IP Command was sent to or from.
    String simIccid = "simIccid_example"; // String | The ICCID of the Sim resource that IP Command was sent to or from.
    IpCommandEnumStatus status = IpCommandEnumStatus.fromValue("queued"); // IpCommandEnumStatus | The status of the IP Command. Can be: `queued`, `sent`, `received` or `failed`. See the [IP Command Status Values](https://www.twilio.com/docs/wireless/api/ipcommand-resource#status-values) for a description of each.
    IpCommandEnumDirection direction = IpCommandEnumDirection.fromValue("to_sim"); // IpCommandEnumDirection | The direction of the IP Command. Can be `to_sim` or `from_sim`. The value of `to_sim` is synonymous with the term `mobile terminated`, and `from_sim` is synonymous with the term `mobile originated`.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListIpCommandResponse result = apiInstance.listIpCommand(sim, simIccid, status, direction, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listIpCommand");
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
| **sim** | **String**| The SID or unique name of the Sim resource that IP Command was sent to or from. | [optional] |
| **simIccid** | **String**| The ICCID of the Sim resource that IP Command was sent to or from. | [optional] |
| **status** | **IpCommandEnumStatus**| The status of the IP Command. Can be: &#x60;queued&#x60;, &#x60;sent&#x60;, &#x60;received&#x60; or &#x60;failed&#x60;. See the [IP Command Status Values](https://www.twilio.com/docs/wireless/api/ipcommand-resource#status-values) for a description of each. | [optional] [enum: queued, sent, received, failed] |
| **direction** | **IpCommandEnumDirection**| The direction of the IP Command. Can be &#x60;to_sim&#x60; or &#x60;from_sim&#x60;. The value of &#x60;to_sim&#x60; is synonymous with the term &#x60;mobile terminated&#x60;, and &#x60;from_sim&#x60; is synonymous with the term &#x60;mobile originated&#x60;. | [optional] [enum: to_sim, from_sim] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListIpCommandResponse**](ListIpCommandResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listNetwork"></a>
# **listNetwork**
> ListNetworkResponse listNetwork(isoCountry, mcc, mnc, pageSize, page, pageToken)



Retrieve a list of Network resources.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String isoCountry = "isoCountry_example"; // String | The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the Network resources to read.
    String mcc = "mcc_example"; // String | The 'mobile country code' of a country. Network resources with this `mcc` in their `identifiers` will be read.
    String mnc = "mnc_example"; // String | The 'mobile network code' of a mobile operator network. Network resources with this `mnc` in their `identifiers` will be read.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListNetworkResponse result = apiInstance.listNetwork(isoCountry, mcc, mnc, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listNetwork");
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
| **isoCountry** | **String**| The [ISO country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) of the Network resources to read. | [optional] |
| **mcc** | **String**| The &#39;mobile country code&#39; of a country. Network resources with this &#x60;mcc&#x60; in their &#x60;identifiers&#x60; will be read. | [optional] |
| **mnc** | **String**| The &#39;mobile network code&#39; of a mobile operator network. Network resources with this &#x60;mnc&#x60; in their &#x60;identifiers&#x60; will be read. | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListNetworkResponse**](ListNetworkResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listNetworkAccessProfile"></a>
# **listNetworkAccessProfile**
> ListNetworkAccessProfileResponse listNetworkAccessProfile(pageSize, page, pageToken)



Retrieve a list of Network Access Profiles from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListNetworkAccessProfileResponse result = apiInstance.listNetworkAccessProfile(pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listNetworkAccessProfile");
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

[**ListNetworkAccessProfileResponse**](ListNetworkAccessProfileResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listNetworkAccessProfileNetwork"></a>
# **listNetworkAccessProfileNetwork**
> ListNetworkAccessProfileNetworkResponse listNetworkAccessProfileNetwork(networkAccessProfileSid, pageSize, page, pageToken)



Retrieve a list of Network Access Profile resource&#39;s Network resource.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String networkAccessProfileSid = "networkAccessProfileSid_example"; // String | The unique string that identifies the Network Access Profile resource.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListNetworkAccessProfileNetworkResponse result = apiInstance.listNetworkAccessProfileNetwork(networkAccessProfileSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listNetworkAccessProfileNetwork");
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
| **networkAccessProfileSid** | **String**| The unique string that identifies the Network Access Profile resource. | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListNetworkAccessProfileNetworkResponse**](ListNetworkAccessProfileNetworkResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSettingsUpdate"></a>
# **listSettingsUpdate**
> ListSettingsUpdateResponse listSettingsUpdate(sim, status, pageSize, page, pageToken)



Retrieve a list of Settings Updates.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sim = "sim_example"; // String | Filter the Settings Updates by a Super SIM's SID or UniqueName.
    SettingsUpdateEnumStatus status = SettingsUpdateEnumStatus.fromValue("scheduled"); // SettingsUpdateEnumStatus | Filter the Settings Updates by status. Can be `scheduled`, `in-progress`, `successful`, or `failed`.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListSettingsUpdateResponse result = apiInstance.listSettingsUpdate(sim, status, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSettingsUpdate");
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
| **sim** | **String**| Filter the Settings Updates by a Super SIM&#39;s SID or UniqueName. | [optional] |
| **status** | **SettingsUpdateEnumStatus**| Filter the Settings Updates by status. Can be &#x60;scheduled&#x60;, &#x60;in-progress&#x60;, &#x60;successful&#x60;, or &#x60;failed&#x60;. | [optional] [enum: scheduled, in-progress, successful, failed] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListSettingsUpdateResponse**](ListSettingsUpdateResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSim"></a>
# **listSim**
> ListSimResponse listSim(status, fleet, iccid, pageSize, page, pageToken)



Retrieve a list of Super SIMs from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    SimEnumStatus status = SimEnumStatus.fromValue("new"); // SimEnumStatus | The status of the Sim resources to read. Can be `new`, `ready`, `active`, `inactive`, or `scheduled`.
    String fleet = "fleet_example"; // String | The SID or unique name of the Fleet to which a list of Sims are assigned.
    String iccid = "iccid_example"; // String | The [ICCID](https://en.wikipedia.org/wiki/Subscriber_identity_module#ICCID) associated with a Super SIM to filter the list by. Passing this parameter will always return a list containing zero or one SIMs.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListSimResponse result = apiInstance.listSim(status, fleet, iccid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSim");
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
| **status** | **SimEnumStatus**| The status of the Sim resources to read. Can be &#x60;new&#x60;, &#x60;ready&#x60;, &#x60;active&#x60;, &#x60;inactive&#x60;, or &#x60;scheduled&#x60;. | [optional] [enum: new, ready, active, inactive, scheduled] |
| **fleet** | **String**| The SID or unique name of the Fleet to which a list of Sims are assigned. | [optional] |
| **iccid** | **String**| The [ICCID](https://en.wikipedia.org/wiki/Subscriber_identity_module#ICCID) associated with a Super SIM to filter the list by. Passing this parameter will always return a list containing zero or one SIMs. | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListSimResponse**](ListSimResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSimIpAddress"></a>
# **listSimIpAddress**
> ListSimIpAddressResponse listSimIpAddress(simSid, pageSize, page, pageToken)



Retrieve a list of IP Addresses for the given Super SIM.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String simSid = "simSid_example"; // String | The SID of the Super SIM to list IP Addresses for.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListSimIpAddressResponse result = apiInstance.listSimIpAddress(simSid, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSimIpAddress");
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
| **simSid** | **String**| The SID of the Super SIM to list IP Addresses for. | |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListSimIpAddressResponse**](ListSimIpAddressResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSmsCommand"></a>
# **listSmsCommand**
> ListSmsCommandResponse listSmsCommand(sim, status, direction, pageSize, page, pageToken)



Retrieve a list of SMS Commands from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sim = "sim_example"; // String | The SID or unique name of the Sim resource that SMS Command was sent to or from.
    SmsCommandEnumStatus status = SmsCommandEnumStatus.fromValue("queued"); // SmsCommandEnumStatus | The status of the SMS Command. Can be: `queued`, `sent`, `delivered`, `received` or `failed`. See the [SMS Command Status Values](https://www.twilio.com/docs/iot/supersim/api/smscommand-resource#status-values) for a description of each.
    SmsCommandEnumDirection direction = SmsCommandEnumDirection.fromValue("to_sim"); // SmsCommandEnumDirection | The direction of the SMS Command. Can be `to_sim` or `from_sim`. The value of `to_sim` is synonymous with the term `mobile terminated`, and `from_sim` is synonymous with the term `mobile originated`.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListSmsCommandResponse result = apiInstance.listSmsCommand(sim, status, direction, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSmsCommand");
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
| **sim** | **String**| The SID or unique name of the Sim resource that SMS Command was sent to or from. | [optional] |
| **status** | **SmsCommandEnumStatus**| The status of the SMS Command. Can be: &#x60;queued&#x60;, &#x60;sent&#x60;, &#x60;delivered&#x60;, &#x60;received&#x60; or &#x60;failed&#x60;. See the [SMS Command Status Values](https://www.twilio.com/docs/iot/supersim/api/smscommand-resource#status-values) for a description of each. | [optional] [enum: queued, sent, delivered, received, failed] |
| **direction** | **SmsCommandEnumDirection**| The direction of the SMS Command. Can be &#x60;to_sim&#x60; or &#x60;from_sim&#x60;. The value of &#x60;to_sim&#x60; is synonymous with the term &#x60;mobile terminated&#x60;, and &#x60;from_sim&#x60; is synonymous with the term &#x60;mobile originated&#x60;. | [optional] [enum: to_sim, from_sim] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListSmsCommandResponse**](ListSmsCommandResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listUsageRecord"></a>
# **listUsageRecord**
> ListUsageRecordResponse listUsageRecord(sim, fleet, network, isoCountry, group, granularity, startTime, endTime, pageSize, page, pageToken)



List UsageRecords

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sim = "sim_example"; // String | SID or unique name of a Sim resource. Only show UsageRecords representing usage incurred by this Super SIM.
    String fleet = "fleet_example"; // String | SID or unique name of a Fleet resource. Only show UsageRecords representing usage for Super SIMs belonging to this Fleet resource at the time the usage occurred.
    String network = "network_example"; // String | SID of a Network resource. Only show UsageRecords representing usage on this network.
    String isoCountry = "isoCountry_example"; // String | Alpha-2 ISO Country Code. Only show UsageRecords representing usage in this country.
    UsageRecordEnumGroup group = UsageRecordEnumGroup.fromValue("sim"); // UsageRecordEnumGroup | Dimension over which to aggregate usage records. Can be: `sim`, `fleet`, `network`, `isoCountry`. Default is to not aggregate across any of these dimensions, UsageRecords will be aggregated into the time buckets described by the `Granularity` parameter.
    UsageRecordEnumGranularity granularity = UsageRecordEnumGranularity.fromValue("hour"); // UsageRecordEnumGranularity | Time-based grouping that UsageRecords should be aggregated by. Can be: `hour`, `day`, or `all`. Default is `all`. `all` returns one UsageRecord that describes the usage for the entire period.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Only include usage that occurred at or after this time, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Default is one month before the `end_time`.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | Only include usage that occurred before this time (exclusive), specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Default is the current time.
    Integer pageSize = 56; // Integer | How many resources to return in each list page. The default is 50, and the maximum is 1000.
    Integer page = 56; // Integer | The page index. This value is simply for client state.
    String pageToken = "pageToken_example"; // String | The page token. This is provided by the API.
    try {
      ListUsageRecordResponse result = apiInstance.listUsageRecord(sim, fleet, network, isoCountry, group, granularity, startTime, endTime, pageSize, page, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listUsageRecord");
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
| **sim** | **String**| SID or unique name of a Sim resource. Only show UsageRecords representing usage incurred by this Super SIM. | [optional] |
| **fleet** | **String**| SID or unique name of a Fleet resource. Only show UsageRecords representing usage for Super SIMs belonging to this Fleet resource at the time the usage occurred. | [optional] |
| **network** | **String**| SID of a Network resource. Only show UsageRecords representing usage on this network. | [optional] |
| **isoCountry** | **String**| Alpha-2 ISO Country Code. Only show UsageRecords representing usage in this country. | [optional] |
| **group** | **UsageRecordEnumGroup**| Dimension over which to aggregate usage records. Can be: &#x60;sim&#x60;, &#x60;fleet&#x60;, &#x60;network&#x60;, &#x60;isoCountry&#x60;. Default is to not aggregate across any of these dimensions, UsageRecords will be aggregated into the time buckets described by the &#x60;Granularity&#x60; parameter. | [optional] [enum: sim, fleet, network, isoCountry] |
| **granularity** | **UsageRecordEnumGranularity**| Time-based grouping that UsageRecords should be aggregated by. Can be: &#x60;hour&#x60;, &#x60;day&#x60;, or &#x60;all&#x60;. Default is &#x60;all&#x60;. &#x60;all&#x60; returns one UsageRecord that describes the usage for the entire period. | [optional] [enum: hour, day, all] |
| **startTime** | **OffsetDateTime**| Only include usage that occurred at or after this time, specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Default is one month before the &#x60;end_time&#x60;. | [optional] |
| **endTime** | **OffsetDateTime**| Only include usage that occurred before this time (exclusive), specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Default is the current time. | [optional] |
| **pageSize** | **Integer**| How many resources to return in each list page. The default is 50, and the maximum is 1000. | [optional] |
| **page** | **Integer**| The page index. This value is simply for client state. | [optional] |
| **pageToken** | **String**| The page token. This is provided by the API. | [optional] |

### Return type

[**ListUsageRecordResponse**](ListUsageRecordResponse.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateFleet"></a>
# **updateFleet**
> SupersimV1Fleet updateFleet(sid, dataLimit, ipCommandsMethod, ipCommandsUrl, networkAccessProfile, smsCommandsMethod, smsCommandsUrl, uniqueName)



Updates the given properties of a Super SIM Fleet instance from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the Fleet resource to update.
    Integer dataLimit = 56; // Integer | The total data usage (download and upload combined) in Megabytes that each Super SIM assigned to the Fleet can consume during a billing period (normally one month). Value must be between 1MB (1) and 2TB (2,000,000). Defaults to 1GB (1,000).
    String ipCommandsMethod = "HEAD"; // String | A string representing the HTTP method to use when making a request to `ip_commands_url`. Can be one of `POST` or `GET`. Defaults to `POST`.
    URI ipCommandsUrl = new URI(); // URI | The URL that will receive a webhook when a Super SIM in the Fleet is used to send an IP Command from your device to a special IP address. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored.
    String networkAccessProfile = "networkAccessProfile_example"; // String | The SID or unique name of the Network Access Profile that will control which cellular networks the Fleet's SIMs can connect to.
    String smsCommandsMethod = "HEAD"; // String | A string representing the HTTP method to use when making a request to `sms_commands_url`. Can be one of `POST` or `GET`. Defaults to `POST`.
    URI smsCommandsUrl = new URI(); // URI | The URL that will receive a webhook when a Super SIM in the Fleet is used to send an SMS from your device to the SMS Commands number. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored.
    String uniqueName = "uniqueName_example"; // String | An application-defined string that uniquely identifies the resource. It can be used in place of the resource's `sid` in the URL to address the resource.
    try {
      SupersimV1Fleet result = apiInstance.updateFleet(sid, dataLimit, ipCommandsMethod, ipCommandsUrl, networkAccessProfile, smsCommandsMethod, smsCommandsUrl, uniqueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateFleet");
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
| **sid** | **String**| The SID of the Fleet resource to update. | |
| **dataLimit** | **Integer**| The total data usage (download and upload combined) in Megabytes that each Super SIM assigned to the Fleet can consume during a billing period (normally one month). Value must be between 1MB (1) and 2TB (2,000,000). Defaults to 1GB (1,000). | [optional] |
| **ipCommandsMethod** | **String**| A string representing the HTTP method to use when making a request to &#x60;ip_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **ipCommandsUrl** | **URI**| The URL that will receive a webhook when a Super SIM in the Fleet is used to send an IP Command from your device to a special IP address. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored. | [optional] |
| **networkAccessProfile** | **String**| The SID or unique name of the Network Access Profile that will control which cellular networks the Fleet&#39;s SIMs can connect to. | [optional] |
| **smsCommandsMethod** | **String**| A string representing the HTTP method to use when making a request to &#x60;sms_commands_url&#x60;. Can be one of &#x60;POST&#x60; or &#x60;GET&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **smsCommandsUrl** | **URI**| The URL that will receive a webhook when a Super SIM in the Fleet is used to send an SMS from your device to the SMS Commands number. Your server should respond with an HTTP status code in the 200 range; any response body will be ignored. | [optional] |
| **uniqueName** | **String**| An application-defined string that uniquely identifies the resource. It can be used in place of the resource&#39;s &#x60;sid&#x60; in the URL to address the resource. | [optional] |

### Return type

[**SupersimV1Fleet**](SupersimV1Fleet.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateNetworkAccessProfile"></a>
# **updateNetworkAccessProfile**
> SupersimV1NetworkAccessProfile updateNetworkAccessProfile(sid, uniqueName)



Updates the given properties of a Network Access Profile in your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the Network Access Profile to update.
    String uniqueName = "uniqueName_example"; // String | The new unique name of the Network Access Profile.
    try {
      SupersimV1NetworkAccessProfile result = apiInstance.updateNetworkAccessProfile(sid, uniqueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateNetworkAccessProfile");
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
| **sid** | **String**| The SID of the Network Access Profile to update. | |
| **uniqueName** | **String**| The new unique name of the Network Access Profile. | [optional] |

### Return type

[**SupersimV1NetworkAccessProfile**](SupersimV1NetworkAccessProfile.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateSim"></a>
# **updateSim**
> SupersimV1Sim updateSim(sid, accountSid, callbackMethod, callbackUrl, fleet, status, uniqueName)



Updates the given properties of a Super SIM instance from your account.

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
    defaultClient.setBasePath("https://supersim.twilio.com");
    
    // Configure HTTP basic authorization: accountSid_authToken
    HttpBasicAuth accountSid_authToken = (HttpBasicAuth) defaultClient.getAuthentication("accountSid_authToken");
    accountSid_authToken.setUsername("YOUR USERNAME");
    accountSid_authToken.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String sid = "sid_example"; // String | The SID of the Sim resource to update.
    String accountSid = "accountSid_example"; // String | The SID of the Account to which the Sim resource should belong. The Account SID can only be that of the requesting Account or that of a Subaccount of the requesting Account. Only valid when the Sim resource's status is new.
    String callbackMethod = "HEAD"; // String | The HTTP method we should use to call `callback_url`. Can be: `GET` or `POST` and the default is POST.
    URI callbackUrl = new URI(); // URI | The URL we should call using the `callback_method` after an asynchronous update has finished.
    String fleet = "fleet_example"; // String | The SID or unique name of the Fleet to which the SIM resource should be assigned.
    SimEnumStatusUpdate status = SimEnumStatusUpdate.fromValue("ready"); // SimEnumStatusUpdate | 
    String uniqueName = "uniqueName_example"; // String | An application-defined string that uniquely identifies the resource. It can be used in place of the resource's `sid` in the URL to address the resource.
    try {
      SupersimV1Sim result = apiInstance.updateSim(sid, accountSid, callbackMethod, callbackUrl, fleet, status, uniqueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateSim");
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
| **sid** | **String**| The SID of the Sim resource to update. | |
| **accountSid** | **String**| The SID of the Account to which the Sim resource should belong. The Account SID can only be that of the requesting Account or that of a Subaccount of the requesting Account. Only valid when the Sim resource&#39;s status is new. | [optional] |
| **callbackMethod** | **String**| The HTTP method we should use to call &#x60;callback_url&#x60;. Can be: &#x60;GET&#x60; or &#x60;POST&#x60; and the default is POST. | [optional] [enum: HEAD, GET, POST, PATCH, PUT, DELETE] |
| **callbackUrl** | **URI**| The URL we should call using the &#x60;callback_method&#x60; after an asynchronous update has finished. | [optional] |
| **fleet** | **String**| The SID or unique name of the Fleet to which the SIM resource should be assigned. | [optional] |
| **status** | **SimEnumStatusUpdate**|  | [optional] [enum: ready, active, inactive] |
| **uniqueName** | **String**| An application-defined string that uniquely identifies the resource. It can be used in place of the resource&#39;s &#x60;sid&#x60; in the URL to address the resource. | [optional] |

### Return type

[**SupersimV1Sim**](SupersimV1Sim.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **202** | Accepted |  -  |

