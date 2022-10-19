# openapi_client.DefaultApi

All URIs are relative to *http://devices.iot1click.us-east-1.amazonaws.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**claim_devices_by_claim_code**](DefaultApi.md#claim_devices_by_claim_code) | **PUT** /claims/{claimCode} | 
[**describe_device**](DefaultApi.md#describe_device) | **GET** /devices/{deviceId} | 
[**finalize_device_claim**](DefaultApi.md#finalize_device_claim) | **PUT** /devices/{deviceId}/finalize-claim | 
[**get_device_methods**](DefaultApi.md#get_device_methods) | **GET** /devices/{deviceId}/methods | 
[**initiate_device_claim**](DefaultApi.md#initiate_device_claim) | **PUT** /devices/{deviceId}/initiate-claim | 
[**invoke_device_method**](DefaultApi.md#invoke_device_method) | **POST** /devices/{deviceId}/methods | 
[**list_device_events**](DefaultApi.md#list_device_events) | **GET** /devices/{deviceId}/events#fromTimeStamp&amp;toTimeStamp | 
[**list_devices**](DefaultApi.md#list_devices) | **GET** /devices | 
[**list_tags_for_resource**](DefaultApi.md#list_tags_for_resource) | **GET** /tags/{resource-arn} | 
[**tag_resource**](DefaultApi.md#tag_resource) | **POST** /tags/{resource-arn} | 
[**unclaim_device**](DefaultApi.md#unclaim_device) | **PUT** /devices/{deviceId}/unclaim | 
[**untag_resource**](DefaultApi.md#untag_resource) | **DELETE** /tags/{resource-arn}#tagKeys | 
[**update_device_state**](DefaultApi.md#update_device_state) | **PUT** /devices/{deviceId}/state | 


# **claim_devices_by_claim_code**
> ClaimDevicesByClaimCodeResponse claim_devices_by_claim_code(claim_code, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Adds device(s) to your account (i.e., claim one or more devices) if and only if you  received a claim code with the device(s).

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.claim_devices_by_claim_code_response import ClaimDevicesByClaimCodeResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    claim_code = 'claim_code_example' # str | The claim code, starting with \"C-\", as provided by the device manufacturer.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.claim_devices_by_claim_code(claim_code, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->claim_devices_by_claim_code:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->claim_devices_by_claim_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **claim_code** | **str**| The claim code, starting with \&quot;C-\&quot;, as provided by the device manufacturer. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**ClaimDevicesByClaimCodeResponse**](ClaimDevicesByClaimCodeResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidRequestException |  -  |
**481** | InternalFailureException |  -  |
**482** | ForbiddenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **describe_device**
> DescribeDeviceResponse describe_device(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Given a device ID, returns a DescribeDeviceResponse object describing the  details of the device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.describe_device_response import DescribeDeviceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.describe_device(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->describe_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->describe_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DescribeDeviceResponse**](DescribeDeviceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **finalize_device_claim**
> FinalizeDeviceClaimResponse finalize_device_claim(device_id, finalize_device_claim_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Given a device ID, finalizes the claim request for the associated device.</p><note>  <p>Claiming a device consists of initiating a claim, then publishing a device event,  and finalizing the claim. For a device of type button, a device event can  be published by simply clicking the device.</p>  </note>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.finalize_device_claim_request import FinalizeDeviceClaimRequest
from openapi_client.models.finalize_device_claim_response import FinalizeDeviceClaimResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    finalize_device_claim_request = openapi_client.FinalizeDeviceClaimRequest() # FinalizeDeviceClaimRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.finalize_device_claim(device_id, finalize_device_claim_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->finalize_device_claim:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->finalize_device_claim: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **finalize_device_claim_request** | [**FinalizeDeviceClaimRequest**](FinalizeDeviceClaimRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**FinalizeDeviceClaimResponse**](FinalizeDeviceClaimResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |
**483** | PreconditionFailedException |  -  |
**484** | ResourceConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_device_methods**
> GetDeviceMethodsResponse get_device_methods(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Given a device ID, returns the invokable methods associated with the device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_device_methods_response import GetDeviceMethodsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_device_methods(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_device_methods:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_device_methods: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetDeviceMethodsResponse**](GetDeviceMethodsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **initiate_device_claim**
> InitiateDeviceClaimResponse initiate_device_claim(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Given a device ID, initiates a claim request for the associated device.</p><note>  <p>Claiming a device consists of initiating a claim, then publishing a device event,  and finalizing the claim. For a device of type button, a device event can  be published by simply clicking the device.</p>  </note>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.initiate_device_claim_response import InitiateDeviceClaimResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.initiate_device_claim(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->initiate_device_claim:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->initiate_device_claim: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**InitiateDeviceClaimResponse**](InitiateDeviceClaimResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |
**483** | ResourceConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoke_device_method**
> InvokeDeviceMethodResponse invoke_device_method(device_id, invoke_device_method_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Given a device ID, issues a request to invoke a named device method (with possible  parameters). See the \"Example POST\" code snippet below.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.invoke_device_method_request import InvokeDeviceMethodRequest
from openapi_client.models.invoke_device_method_response import InvokeDeviceMethodResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    invoke_device_method_request = openapi_client.InvokeDeviceMethodRequest() # InvokeDeviceMethodRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.invoke_device_method(device_id, invoke_device_method_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->invoke_device_method:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->invoke_device_method: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **invoke_device_method_request** | [**InvokeDeviceMethodRequest**](InvokeDeviceMethodRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**InvokeDeviceMethodResponse**](InvokeDeviceMethodResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidRequestException |  -  |
**481** | PreconditionFailedException |  -  |
**482** | InternalFailureException |  -  |
**483** | ResourceNotFoundException |  -  |
**484** | RangeNotSatisfiableException |  -  |
**485** | ResourceConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_device_events**
> ListDeviceEventsResponse list_device_events(device_id, from_time_stamp, to_time_stamp, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



Using a device ID, returns a DeviceEventsResponse object containing an  array of events for the device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_device_events_response import ListDeviceEventsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    from_time_stamp = '2013-10-20T19:20:30+01:00' # datetime | The start date for the device event query, in ISO8061 format. For example,  2018-03-28T15:45:12.880Z  
    to_time_stamp = '2013-10-20T19:20:30+01:00' # datetime | The end date for the device event query, in ISO8061 format. For example,  2018-03-28T15:45:12.880Z  
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 56 # int | The maximum number of results to return per request. If not set, a default value of  100 is used. (optional)
    next_token = 'next_token_example' # str | The token to retrieve the next set of results. (optional)

    try:
        api_response = api_instance.list_device_events(device_id, from_time_stamp, to_time_stamp, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->list_device_events:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_device_events: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **from_time_stamp** | **datetime**| The start date for the device event query, in ISO8061 format. For example,  2018-03-28T15:45:12.880Z   | 
 **to_time_stamp** | **datetime**| The end date for the device event query, in ISO8061 format. For example,  2018-03-28T15:45:12.880Z   | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **int**| The maximum number of results to return per request. If not set, a default value of  100 is used. | [optional] 
 **next_token** | **str**| The token to retrieve the next set of results. | [optional] 

### Return type

[**ListDeviceEventsResponse**](ListDeviceEventsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | RangeNotSatisfiableException |  -  |
**482** | InvalidRequestException |  -  |
**483** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_devices**
> ListDevicesResponse list_devices(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, device_type=device_type, max_results=max_results, next_token=next_token)



Lists the 1-Click compatible devices associated with your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_devices_response import ListDevicesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    device_type = 'device_type_example' # str | The type of the device, such as \"button\". (optional)
    max_results = 56 # int | The maximum number of results to return per request. If not set, a default value of  100 is used. (optional)
    next_token = 'next_token_example' # str | The token to retrieve the next set of results. (optional)

    try:
        api_response = api_instance.list_devices(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, device_type=device_type, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->list_devices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_devices: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **device_type** | **str**| The type of the device, such as \&quot;button\&quot;. | [optional] 
 **max_results** | **int**| The maximum number of results to return per request. If not set, a default value of  100 is used. | [optional] 
 **next_token** | **str**| The token to retrieve the next set of results. | [optional] 

### Return type

[**ListDevicesResponse**](ListDevicesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | RangeNotSatisfiableException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_tags_for_resource**
> ListTagsForResourceResponse list_tags_for_resource(resource_arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Lists the tags associated with the specified resource ARN.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_tags_for_resource_response import ListTagsForResourceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    resource_arn = 'resource_arn_example' # str | The ARN of the resource.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.list_tags_for_resource(resource_arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->list_tags_for_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_tags_for_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The ARN of the resource. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**ListTagsForResourceResponse**](ListTagsForResourceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tag_resource**
> tag_resource(resource_arn, tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Adds or updates the tags associated with the resource ARN. See <a href=\"https://docs.aws.amazon.com/iot-1-click/latest/developerguide/1click-appendix.html#1click-limits\">AWS IoT 1-Click Service Limits</a> for the maximum number of tags allowed per  resource.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.tag_resource_request import TagResourceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    resource_arn = 'resource_arn_example' # str | The ARN of the resource.
    tag_resource_request = openapi_client.TagResourceRequest() # TagResourceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_instance.tag_resource(resource_arn, tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
    except Exception as e:
        print("Exception when calling DefaultApi->tag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The ARN of the resource. | 
 **tag_resource_request** | [**TagResourceRequest**](TagResourceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unclaim_device**
> UnclaimDeviceResponse unclaim_device(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates a device from your AWS account using its device ID.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.unclaim_device_response import UnclaimDeviceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.unclaim_device(device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->unclaim_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->unclaim_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UnclaimDeviceResponse**](UnclaimDeviceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **untag_resource**
> untag_resource(resource_arn, tag_keys, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Using tag keys, deletes the tags (key/value pairs) associated with the specified  resource ARN.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    resource_arn = 'resource_arn_example' # str | The ARN of the resource.
    tag_keys = ['tag_keys_example'] # List[str] | A collections of tag keys. For example, {\"key1\",\"key2\"}
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_instance.untag_resource(resource_arn, tag_keys, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
    except Exception as e:
        print("Exception when calling DefaultApi->untag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The ARN of the resource. | 
 **tag_keys** | [**List[str]**](str.md)| A collections of tag keys. For example, {\&quot;key1\&quot;,\&quot;key2\&quot;} | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_device_state**
> object update_device_state(device_id, update_device_state_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Using a Boolean value (true or false), this operation  enables or disables the device given a device ID.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_device_state_request import UpdateDeviceStateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://devices.iot1click.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://devices.iot1click.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    device_id = 'device_id_example' # str | The unique identifier of the device.
    update_device_state_request = openapi_client.UpdateDeviceStateRequest() # UpdateDeviceStateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_device_state(device_id, update_device_state_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_device_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_device_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**| The unique identifier of the device. | 
 **update_device_state_request** | [**UpdateDeviceStateRequest**](UpdateDeviceStateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ResourceNotFoundException |  -  |
**481** | InvalidRequestException |  -  |
**482** | InternalFailureException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

