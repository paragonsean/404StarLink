# openapi_client.MachineLearningApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_delivery_prediction**](MachineLearningApi.md#get_delivery_prediction) | **POST** /ml/delivery-prediction | Get a delivery prediction for a project


# **get_delivery_prediction**
> DeliveryPredictionResponse get_delivery_prediction(delivery_prediction_payload=delivery_prediction_payload)

Get a delivery prediction for a project

Get a delivery prediction for a project

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.delivery_prediction_payload import DeliveryPredictionPayload
from openapi_client.models.delivery_prediction_response import DeliveryPredictionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.MachineLearningApi(api_client)
    delivery_prediction_payload = openapi_client.DeliveryPredictionPayload() # DeliveryPredictionPayload |  (optional)

    try:
        # Get a delivery prediction for a project
        api_response = api_instance.get_delivery_prediction(delivery_prediction_payload=delivery_prediction_payload)
        print("The response of MachineLearningApi->get_delivery_prediction:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MachineLearningApi->get_delivery_prediction: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delivery_prediction_payload** | [**DeliveryPredictionPayload**](DeliveryPredictionPayload.md)|  | [optional] 

### Return type

[**DeliveryPredictionResponse**](DeliveryPredictionResponse.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Prediction and its probability |  -  |
**400** | MissingParameter |  -  |
**404** | ProjectNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

