# openapi_client.DefaultApi

All URIs are relative to *https://staging.truanon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_profile**](DefaultApi.md#get_profile) | **GET** /api/get_profile | Get Profile
[**get_token**](DefaultApi.md#get_token) | **GET** /api/request_token | Get Token


# **get_profile**
> get_profile(id=id, service=service)

Get Profile

get_profile Private API: Request confirmed profile data for your unique member ID

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging.truanon.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://staging.truanon.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = '{{your-member-id}}' # str | This is your unique username or member ID (optional)
    service = '{{service-identifier}}' # str | The service name given to you by TruAnon (optional)

    try:
        # Get Profile
        api_instance.get_profile(id=id, service=service)
    except Exception as e:
        print("Exception when calling DefaultApi->get_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| This is your unique username or member ID | [optional] 
 **service** | **str**| The service name given to you by TruAnon | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token**
> get_token(id=id, service=service)

Get Token

request_token Private API: Request a Proof token to let the member confirm in a popup interface          {\"id\":\"qjgblv72bzzio\",\"type\":\"Proof\",\"active\":true,\"name\":\"New Proof\"}  Step 2. Create a verifyProfile Public Web link: Use the Proof token id as the token argument in your public URL used to open a new target popup. This activity is where members may confirm immediately.              https://staging.truanon.com/verifyProfile?id=john_doe&service=securecannabisalliance&token=qjgblv72bzzio

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging.truanon.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://staging.truanon.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    id = '{{your-member-id}}' # str | This is your unique username or member ID (optional)
    service = '{{service-identifier}}' # str | The service name given to you by TruAnon (optional)

    try:
        # Get Token
        api_instance.get_token(id=id, service=service)
    except Exception as e:
        print("Exception when calling DefaultApi->get_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| This is your unique username or member ID | [optional] 
 **service** | **str**| The service name given to you by TruAnon | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

