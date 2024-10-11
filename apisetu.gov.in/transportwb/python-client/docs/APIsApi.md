# openapi_client.APIsApi

All URIs are relative to *https://apisetu.gov.in/transportwb/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**drvlc**](APIsApi.md#drvlc) | **POST** /drvlc/certificate | Driving License
[**rvcer**](APIsApi.md#rvcer) | **POST** /rvcer/certificate | Registration of Vehicles


# **drvlc**
> drvlc(drvlc_request=drvlc_request)

Driving License

API to verify Driving License.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.drvlc_request import DrvlcRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/transportwb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/transportwb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    drvlc_request = openapi_client.DrvlcRequest() # DrvlcRequest | Request format (optional)

    try:
        # Driving License
        api_instance.drvlc(drvlc_request=drvlc_request)
    except Exception as e:
        print("Exception when calling APIsApi->drvlc: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drvlc_request** | [**DrvlcRequest**](DrvlcRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/xml, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rvcer**
> rvcer(rvcer_request=rvcer_request)

Registration of Vehicles

API to verify Registration of Vehicles.

### Example

* Api Key Authentication (clientId):
* Api Key Authentication (apiKey):

```python
import openapi_client
from openapi_client.models.rvcer_request import RvcerRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apisetu.gov.in/transportwb/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apisetu.gov.in/transportwb/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: clientId
configuration.api_key['clientId'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['clientId'] = 'Bearer'

# Configure API key authorization: apiKey
configuration.api_key['apiKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apiKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.APIsApi(api_client)
    rvcer_request = openapi_client.RvcerRequest() # RvcerRequest | Request format (optional)

    try:
        # Registration of Vehicles
        api_instance.rvcer(rvcer_request=rvcer_request)
    except Exception as e:
        print("Exception when calling APIsApi->rvcer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rvcer_request** | [**RvcerRequest**](RvcerRequest.md)| Request format | [optional] 

### Return type

void (empty response body)

### Authorization

[clientId](../README.md#clientId), [apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf, application/xml, application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The certificate data in response body in PDF, XML or JSON format as requested in format parameter. |  -  |
**400** | Bad request |  -  |
**401** | Unauthorized access |  -  |
**404** | No record found |  -  |
**500** | Internal server error |  -  |
**502** | Bad gateway |  -  |
**503** | Service unavailable |  -  |
**504** | Gateway timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

