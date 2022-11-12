# openapi_client.BusinessLinesApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_business_lines_id**](BusinessLinesApi.md#delete_business_lines_id) | **DELETE** /businessLines/{id} | Delete a business line
[**get_business_lines_id**](BusinessLinesApi.md#get_business_lines_id) | **GET** /businessLines/{id} | Get a business line
[**patch_business_lines_id**](BusinessLinesApi.md#patch_business_lines_id) | **PATCH** /businessLines/{id} | Update a business line
[**post_business_lines**](BusinessLinesApi.md#post_business_lines) | **POST** /businessLines | Create a business line


# **delete_business_lines_id**
> delete_business_lines_id(id)

Delete a business line

Deletes a business line.   >If you delete a business line linked to a [payment method](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api), it can affect your merchant account's ability to use the [payment method](https://docs.adyen.com/api-explorer/Management/latest/post/merchants/_merchantId_/paymentMethodSettings). The business line is removed from all linked merchant accounts.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://kyc-test.adyen.com/lem/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://kyc-test.adyen.com/lem/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessLinesApi(api_client)
    id = 'id_example' # str | The unique identifier of the business line to be deleted.

    try:
        # Delete a business line
        api_instance.delete_business_lines_id(id)
    except Exception as e:
        print("Exception when calling BusinessLinesApi->delete_business_lines_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the business line to be deleted. | 

### Return type

void (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content - the request has been successfully processed, but there is no additional content. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_lines_id**
> BusinessLine get_business_lines_id(id)

Get a business line

Returns the detail of a business line.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.business_line import BusinessLine
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://kyc-test.adyen.com/lem/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://kyc-test.adyen.com/lem/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessLinesApi(api_client)
    id = 'id_example' # str | The unique identifier of the business line.

    try:
        # Get a business line
        api_response = api_instance.get_business_lines_id(id)
        print("The response of BusinessLinesApi->get_business_lines_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessLinesApi->get_business_lines_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the business line. | 

### Return type

[**BusinessLine**](BusinessLine.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_business_lines_id**
> BusinessLine patch_business_lines_id(id, business_line_info_update=business_line_info_update)

Update a business line

Updates a business line.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.business_line import BusinessLine
from openapi_client.models.business_line_info_update import BusinessLineInfoUpdate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://kyc-test.adyen.com/lem/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://kyc-test.adyen.com/lem/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessLinesApi(api_client)
    id = 'id_example' # str | The unique identifier of the business line.
    business_line_info_update = openapi_client.BusinessLineInfoUpdate() # BusinessLineInfoUpdate |  (optional)

    try:
        # Update a business line
        api_response = api_instance.patch_business_lines_id(id, business_line_info_update=business_line_info_update)
        print("The response of BusinessLinesApi->patch_business_lines_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessLinesApi->patch_business_lines_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the business line. | 
 **business_line_info_update** | [**BusinessLineInfoUpdate**](BusinessLineInfoUpdate.md)|  | [optional] 

### Return type

[**BusinessLine**](BusinessLine.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_business_lines**
> BusinessLine post_business_lines(business_line_info=business_line_info)

Create a business line

Creates a business line.   This resource contains information about your user's line of business, including their industry and their source of funds. Adyen uses this information to verify your users as required by payment industry regulations. Adyen informs you of the verification results through webhooks or API responses.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.business_line import BusinessLine
from openapi_client.models.business_line_info import BusinessLineInfo
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://kyc-test.adyen.com/lem/v3
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://kyc-test.adyen.com/lem/v3"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = openapi_client.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessLinesApi(api_client)
    business_line_info = openapi_client.BusinessLineInfo() # BusinessLineInfo |  (optional)

    try:
        # Create a business line
        api_response = api_instance.post_business_lines(business_line_info=business_line_info)
        print("The response of BusinessLinesApi->post_business_lines:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessLinesApi->post_business_lines: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_line_info** | [**BusinessLineInfo**](BusinessLineInfo.md)|  | [optional] 

### Return type

[**BusinessLine**](BusinessLine.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

