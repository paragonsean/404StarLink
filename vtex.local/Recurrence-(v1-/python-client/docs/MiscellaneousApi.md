# openapi_client.MiscellaneousApi

All URIs are relative to *https://vtex.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addrecurrenceitem**](MiscellaneousApi.md#addrecurrenceitem) | **POST** /subscriptions/{recurrenceId}/items | Add Subscription item
[**get_recurrencebyemail**](MiscellaneousApi.md#get_recurrencebyemail) | **GET** /subscriptions | Get Subscriptions
[**get_recurrencebyrecurrence_id**](MiscellaneousApi.md#get_recurrencebyrecurrence_id) | **GET** /subscriptions/{recurrenceId} | Get Subscription by recurrenceId
[**getpaymentaccounts**](MiscellaneousApi.md#getpaymentaccounts) | **GET** /subscriptions/{recurrenceid}/accounts | Get payment accounts
[**getrecurrenceaddresses**](MiscellaneousApi.md#getrecurrenceaddresses) | **GET** /subscriptions/{recurrenceId}/addresses | Get Subscription addresses
[**getrecurrencesettings**](MiscellaneousApi.md#getrecurrencesettings) | **GET** /subscriptions/settings | Get Subscription settings
[**getselfrecurrence**](MiscellaneousApi.md#getselfrecurrence) | **GET** /subscriptions/me | Get self Subscription
[**reindexrecurrence**](MiscellaneousApi.md#reindexrecurrence) | **PATCH** /subscriptions/{recurrenceId}/reindex | Reindex Subscription
[**updatepartialrecurrence**](MiscellaneousApi.md#updatepartialrecurrence) | **PATCH** /subscriptions/{recurrenceId} | Update partial Subscription
[**updaterecurrence**](MiscellaneousApi.md#updaterecurrence) | **PUT** /subscriptions | Update Subscription
[**updaterecurrencesettings**](MiscellaneousApi.md#updaterecurrencesettings) | **PUT** /subscriptions/settings | Update Subscription settings


# **addrecurrenceitem**
> addrecurrenceitem(content_type, accept, recurrence_id, addrecurrenceitem_request)

Add Subscription item

Adds an item to a Subscription (formerly Recurrence).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.addrecurrenceitem_request import AddrecurrenceitemRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    recurrence_id = 'recurrence_id_example' # str | 
    addrecurrenceitem_request = [{"frequency":{"interval":1,"periodicity":"monthly"},"quantity":2,"seller":"1","shippingAddressId":"-1461618656161","sku":"20"}] # List[AddrecurrenceitemRequest] | 

    try:
        # Add Subscription item
        api_instance.addrecurrenceitem(content_type, accept, recurrence_id, addrecurrenceitem_request)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->addrecurrenceitem: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **recurrence_id** | **str**|  | 
 **addrecurrenceitem_request** | [**List[AddrecurrenceitemRequest]**](AddrecurrenceitemRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recurrencebyemail**
> get_recurrencebyemail(content_type, accept, email=email, cycle_status=cycle_status)

Get Subscriptions

Retrieves a given Subscription (formerly recurrence). There are three options of filtering your Subscruptions v1. It's possible to get a list of all Subscriptions v1, by not adding any query params to your request, and simply executing a call to the url. It is also possible to list the Subscriptions by email, filtering by the email query param. And finnally, it is possible to list recurrences with failures on the last execution cycle, filtering by the cycleStatus query param.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    email = '{{email}}' # str | If you wish to list tasks by email, insert the desired user's email. (optional)
    cycle_status = '{{cycleStatus}}' # str | If you wish to list tasks by Subscriptions with failures on the last execution cycle, insert the desired cycleStatus. (optional)

    try:
        # Get Subscriptions
        api_instance.get_recurrencebyemail(content_type, accept, email=email, cycle_status=cycle_status)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->get_recurrencebyemail: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **email** | **str**| If you wish to list tasks by email, insert the desired user&#39;s email. | [optional] 
 **cycle_status** | **str**| If you wish to list tasks by Subscriptions with failures on the last execution cycle, insert the desired cycleStatus. | [optional] 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recurrencebyrecurrence_id**
> get_recurrencebyrecurrence_id(content_type, accept, recurrence_id)

Get Subscription by recurrenceId

Retrieves a given Subscription (formerly recurrence) by recurrenceId.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    recurrence_id = 'recurrence_id_example' # str | 

    try:
        # Get Subscription by recurrenceId
        api_instance.get_recurrencebyrecurrence_id(content_type, accept, recurrence_id)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->get_recurrencebyrecurrence_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **recurrence_id** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getpaymentaccounts**
> getpaymentaccounts(recurrenceid, content_type, accept)

Get payment accounts

Lists payment accounts of a given Subscription (formerly Recurrence) by recurrenceId.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    recurrenceid = 'recurrenceid_example' # str | 
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand

    try:
        # Get payment accounts
        api_instance.getpaymentaccounts(recurrenceid, content_type, accept)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->getpaymentaccounts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurrenceid** | **str**|  | 
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getrecurrenceaddresses**
> getrecurrenceaddresses(content_type, accept, recurrence_id)

Get Subscription addresses

Retrieves the addresses attached to a given subscription (formerly recurrence) by recurrenceId.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    recurrence_id = 'recurrence_id_example' # str | 

    try:
        # Get Subscription addresses
        api_instance.getrecurrenceaddresses(content_type, accept, recurrence_id)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->getrecurrenceaddresses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **recurrence_id** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getrecurrencesettings**
> getrecurrencesettings(content_type, accept)

Get Subscription settings

Retrieves your store's Subscriptions' (formerly recurrence) settings.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand

    try:
        # Get Subscription settings
        api_instance.getrecurrencesettings(content_type, accept)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->getrecurrencesettings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getselfrecurrence**
> getselfrecurrence(content_type, accept)

Get self Subscription

Lists details of your self Subscription (formerly Recurrence).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand

    try:
        # Get self Subscription
        api_instance.getselfrecurrence(content_type, accept)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->getselfrecurrence: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reindexrecurrence**
> reindexrecurrence(recurrence_id, content_type, accept, reindexrecurrence_request)

Reindex Subscription

Alters the frequency of a given Subscription (formerly Recurrence) by changing period and interval.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.reindexrecurrence_request import ReindexrecurrenceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    recurrence_id = 'recurrence_id_example' # str | 
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    reindexrecurrence_request = [{"frequency":{"interval":1,"periodicity":"yearly"}}] # List[ReindexrecurrenceRequest] | 

    try:
        # Reindex Subscription
        api_instance.reindexrecurrence(recurrence_id, content_type, accept, reindexrecurrence_request)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->reindexrecurrence: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurrence_id** | **str**|  | 
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **reindexrecurrence_request** | [**List[ReindexrecurrenceRequest]**](ReindexrecurrenceRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updatepartialrecurrence**
> updatepartialrecurrence(recurrence_id, content_type, accept, updatepartialrecurrence_request)

Update partial Subscription

Updates partial information of a given subscription (formerly Recurrence).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.updatepartialrecurrence_request import UpdatepartialrecurrenceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    recurrence_id = 'recurrence_id_example' # str | 
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    updatepartialrecurrence_request = {"deliveryDay":18,"deliveryWeekday":"Monday","status":"inactive"} # UpdatepartialrecurrenceRequest | 

    try:
        # Update partial Subscription
        api_instance.updatepartialrecurrence(recurrence_id, content_type, accept, updatepartialrecurrence_request)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->updatepartialrecurrence: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurrence_id** | **str**|  | 
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **updatepartialrecurrence_request** | [**UpdatepartialrecurrenceRequest**](UpdatepartialrecurrenceRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updaterecurrence**
> updaterecurrence(content_type, accept, updaterecurrence_request)

Update Subscription

Updates details of a given Subscription (formerly recurrence).

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.updaterecurrence_request import UpdaterecurrenceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    updaterecurrence_request = {"deliveryDay":26,"deliveryWeekday":"Friday","email":"user@vtex.com.br","items":[{"frequency":{"interval":1,"periodicity":"weekly"},"quantity":2,"seller":"1","shippingAddressId":"-1461618656161","sku":"18"}],"paymentAccountId":"87FE21B06C0D42908D31A5B11E6FC043"} # UpdaterecurrenceRequest | 

    try:
        # Update Subscription
        api_instance.updaterecurrence(content_type, accept, updaterecurrence_request)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->updaterecurrence: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **updaterecurrence_request** | [**UpdaterecurrenceRequest**](UpdaterecurrenceRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updaterecurrencesettings**
> updaterecurrencesettings(content_type, accept, updaterecurrencesettings_request)

Update Subscription settings

Updates the Subscriptions' (formerly Recurrence) settings of your store by salesChannel and defaultSLA.

### Example

* Api Key Authentication (appToken):
* Api Key Authentication (appKey):

```python
import openapi_client
from openapi_client.models.updaterecurrencesettings_request import UpdaterecurrencesettingsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://vtex.local
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://vtex.local"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: appToken
configuration.api_key['appToken'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appToken'] = 'Bearer'

# Configure API key authorization: appKey
configuration.api_key['appKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['appKey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MiscellaneousApi(api_client)
    content_type = 'application/json' # str | Type of the content being sent
    accept = 'application/json' # str | HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand
    updaterecurrencesettings_request = {"defaultSLA":"Normal","salesChannel":"1"} # UpdaterecurrencesettingsRequest | 

    try:
        # Update Subscription settings
        api_instance.updaterecurrencesettings(content_type, accept, updaterecurrencesettings_request)
    except Exception as e:
        print("Exception when calling MiscellaneousApi->updaterecurrencesettings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_type** | **str**| Type of the content being sent | 
 **accept** | **str**| HTTP Client Negotiation Accept Header. Indicates the types of responses the client can understand | 
 **updaterecurrencesettings_request** | [**UpdaterecurrencesettingsRequest**](UpdaterecurrencesettingsRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[appToken](../README.md#appToken), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

