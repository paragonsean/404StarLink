# openapi_client.DefaultApi

All URIs are relative to *https://routes.twilio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetch_phone_number**](DefaultApi.md#fetch_phone_number) | **GET** /v2/PhoneNumbers/{PhoneNumber} | 
[**fetch_sip_domain**](DefaultApi.md#fetch_sip_domain) | **GET** /v2/SipDomains/{SipDomain} | 
[**fetch_trunks**](DefaultApi.md#fetch_trunks) | **GET** /v2/Trunks/{SipTrunkDomain} | 
[**update_phone_number**](DefaultApi.md#update_phone_number) | **POST** /v2/PhoneNumbers/{PhoneNumber} | 
[**update_sip_domain**](DefaultApi.md#update_sip_domain) | **POST** /v2/SipDomains/{SipDomain} | 
[**update_trunks**](DefaultApi.md#update_trunks) | **POST** /v2/Trunks/{SipTrunkDomain} | 


# **fetch_phone_number**
> RoutesV2PhoneNumber fetch_phone_number(phone_number)



Fetch the Inbound Processing Region assigned to a phone number.

### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.routes_v2_phone_number import RoutesV2PhoneNumber
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://routes.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://routes.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    phone_number = 'phone_number_example' # str | The phone number in E.164 format

    try:
        api_response = api_instance.fetch_phone_number(phone_number)
        print("The response of DefaultApi->fetch_phone_number:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_phone_number: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| The phone number in E.164 format | 

### Return type

[**RoutesV2PhoneNumber**](RoutesV2PhoneNumber.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_sip_domain**
> RoutesV2SipDomain fetch_sip_domain(sip_domain)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.routes_v2_sip_domain import RoutesV2SipDomain
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://routes.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://routes.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sip_domain = 'sip_domain_example' # str | 

    try:
        api_response = api_instance.fetch_sip_domain(sip_domain)
        print("The response of DefaultApi->fetch_sip_domain:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_sip_domain: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sip_domain** | **str**|  | 

### Return type

[**RoutesV2SipDomain**](RoutesV2SipDomain.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_trunks**
> RoutesV2Trunks fetch_trunks(sip_trunk_domain)



Fetch the Inbound Processing Region assigned to a SIP Trunk.

### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.routes_v2_trunks import RoutesV2Trunks
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://routes.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://routes.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sip_trunk_domain = 'sip_trunk_domain_example' # str | The absolute URL of the SIP Trunk

    try:
        api_response = api_instance.fetch_trunks(sip_trunk_domain)
        print("The response of DefaultApi->fetch_trunks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->fetch_trunks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sip_trunk_domain** | **str**| The absolute URL of the SIP Trunk | 

### Return type

[**RoutesV2Trunks**](RoutesV2Trunks.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_phone_number**
> RoutesV2PhoneNumber update_phone_number(phone_number, friendly_name=friendly_name, voice_region=voice_region)



Assign an Inbound Processing Region to a phone number.

### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.routes_v2_phone_number import RoutesV2PhoneNumber
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://routes.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://routes.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    phone_number = 'phone_number_example' # str | The phone number in E.164 format
    friendly_name = 'friendly_name_example' # str | A human readable description of this resource, up to 64 characters. (optional)
    voice_region = 'voice_region_example' # str | The Inbound Processing Region used for this phone number for voice (optional)

    try:
        api_response = api_instance.update_phone_number(phone_number, friendly_name=friendly_name, voice_region=voice_region)
        print("The response of DefaultApi->update_phone_number:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_phone_number: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number** | **str**| The phone number in E.164 format | 
 **friendly_name** | **str**| A human readable description of this resource, up to 64 characters. | [optional] 
 **voice_region** | **str**| The Inbound Processing Region used for this phone number for voice | [optional] 

### Return type

[**RoutesV2PhoneNumber**](RoutesV2PhoneNumber.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_sip_domain**
> RoutesV2SipDomain update_sip_domain(sip_domain, friendly_name=friendly_name, voice_region=voice_region)





### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.routes_v2_sip_domain import RoutesV2SipDomain
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://routes.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://routes.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sip_domain = 'sip_domain_example' # str | 
    friendly_name = 'friendly_name_example' # str |  (optional)
    voice_region = 'voice_region_example' # str |  (optional)

    try:
        api_response = api_instance.update_sip_domain(sip_domain, friendly_name=friendly_name, voice_region=voice_region)
        print("The response of DefaultApi->update_sip_domain:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_sip_domain: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sip_domain** | **str**|  | 
 **friendly_name** | **str**|  | [optional] 
 **voice_region** | **str**|  | [optional] 

### Return type

[**RoutesV2SipDomain**](RoutesV2SipDomain.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_trunks**
> RoutesV2Trunks update_trunks(sip_trunk_domain, friendly_name=friendly_name, voice_region=voice_region)



Assign an Inbound Processing Region to a SIP Trunk

### Example

* Basic Authentication (accountSid_authToken):

```python
import openapi_client
from openapi_client.models.routes_v2_trunks import RoutesV2Trunks
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://routes.twilio.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://routes.twilio.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: accountSid_authToken
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    sip_trunk_domain = 'sip_trunk_domain_example' # str | The absolute URL of the SIP Trunk
    friendly_name = 'friendly_name_example' # str | A human readable description of this resource, up to 64 characters. (optional)
    voice_region = 'voice_region_example' # str | The Inbound Processing Region used for this SIP Trunk for voice (optional)

    try:
        api_response = api_instance.update_trunks(sip_trunk_domain, friendly_name=friendly_name, voice_region=voice_region)
        print("The response of DefaultApi->update_trunks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_trunks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sip_trunk_domain** | **str**| The absolute URL of the SIP Trunk | 
 **friendly_name** | **str**| A human readable description of this resource, up to 64 characters. | [optional] 
 **voice_region** | **str**| The Inbound Processing Region used for this SIP Trunk for voice | [optional] 

### Return type

[**RoutesV2Trunks**](RoutesV2Trunks.md)

### Authorization

[accountSid_authToken](../README.md#accountSid_authToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

