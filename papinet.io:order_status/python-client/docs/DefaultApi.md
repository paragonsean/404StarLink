# openapi_client.DefaultApi

All URIs are relative to *https://papinet.papinet.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orders_get**](DefaultApi.md#orders_get) | **GET** /orders | List &#x60;orders&#x60;
[**orders_order_id_get**](DefaultApi.md#orders_order_id_get) | **GET** /orders/{orderId} | Get an &#x60;order&#x60;


# **orders_get**
> ListOfOrders orders_get(order_status=order_status, offset=offset, limit=limit)

List `orders`

Gets a paginated list of all `orders`.

### Example


```python
import openapi_client
from openapi_client.models.list_of_orders import ListOfOrders
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://papinet.papinet.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://papinet.papinet.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    order_status = 'order_status_example' # str | Filter by status (optional)
    offset = 'offset_example' # str | The number of items to skip before starting to collect the result set. (optional)
    limit = 'limit_example' # str | The maximum number of items to return. If the value exceeds the maximum, then the maximum value will be used. (optional)

    try:
        # List `orders`
        api_response = api_instance.orders_get(order_status=order_status, offset=offset, limit=limit)
        print("The response of DefaultApi->orders_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->orders_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status** | **str**| Filter by status | [optional] 
 **offset** | **str**| The number of items to skip before starting to collect the result set. | [optional] 
 **limit** | **str**| The maximum number of items to return. If the value exceeds the maximum, then the maximum value will be used. | [optional] 

### Return type

[**ListOfOrders**](ListOfOrders.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orders_order_id_get**
> Order orders_order_id_get(order_id)

Get an `order`

Gets the details of a specific `order`, including a paginated list of all its lines.

### Example


```python
import openapi_client
from openapi_client.models.order import Order
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://papinet.papinet.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://papinet.papinet.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    order_id = 'order_id_example' # str | UUID of the `order` to get

    try:
        # Get an `order`
        api_response = api_instance.orders_order_id_get(order_id)
        print("The response of DefaultApi->orders_order_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->orders_order_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **str**| UUID of the &#x60;order&#x60; to get | 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

