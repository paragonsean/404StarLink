# openapi_client.PaymentApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_credit_card**](PaymentApi.md#delete_credit_card) | **DELETE** /payment/{cardId}/delete | Delete credit card
[**get_credit_card**](PaymentApi.md#get_credit_card) | **GET** /payment/{cardId} | View saved credit card
[**reset_card_payment_code**](PaymentApi.md#reset_card_payment_code) | **POST** /payment/{cardId}/reset-payment-code | Reset credit card payment code
[**reset_corporate_payment_code**](PaymentApi.md#reset_corporate_payment_code) | **POST** /payment/reset-corporate-payment-code | Reset payment code
[**toggle_corporate_auto_charge**](PaymentApi.md#toggle_corporate_auto_charge) | **POST** /payment/toggle-corporate-auto-charge | Manage automatic charges on your credit card


# **delete_credit_card**
> OperationStatus delete_credit_card(card_id)

Delete credit card

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
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
    api_instance = openapi_client.PaymentApi(api_client)
    card_id = 56 # int | Credit Card ID

    try:
        # Delete credit card
        api_response = api_instance.delete_credit_card(card_id)
        print("The response of PaymentApi->delete_credit_card:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentApi->delete_credit_card: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | **int**| Credit Card ID | 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**404** | UserNotFound MissingCorporateAccount MissingParameter MissingCreditCard UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_credit_card**
> CreditCard get_credit_card(card_id)

View saved credit card

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.credit_card import CreditCard
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
    api_instance = openapi_client.PaymentApi(api_client)
    card_id = 56 # int | Credit Card ID

    try:
        # View saved credit card
        api_response = api_instance.get_credit_card(card_id)
        print("The response of PaymentApi->get_credit_card:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentApi->get_credit_card: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | **int**| Credit Card ID | 

### Return type

[**CreditCard**](CreditCard.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Credit card content |  -  |
**404** | MissingCreditCard |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_card_payment_code**
> CreditCard reset_card_payment_code(card_id)

Reset credit card payment code

Reset the payment code used to bypass credit card payment. This will invalidate your current payment code and your users should be aware of this change while ordering translations.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.credit_card import CreditCard
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
    api_instance = openapi_client.PaymentApi(api_client)
    card_id = 56 # int | Credit Card ID

    try:
        # Reset credit card payment code
        api_response = api_instance.reset_card_payment_code(card_id)
        print("The response of PaymentApi->reset_card_payment_code:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentApi->reset_card_payment_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | **int**| Credit Card ID | 

### Return type

[**CreditCard**](CreditCard.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Credit card content |  -  |
**404** | UserNotFound MissingCorporateAccount MissingParameter MissingCreditCard UnauthorizedUser |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_corporate_payment_code**
> CreditCard reset_corporate_payment_code()

Reset payment code

Reset your corporate account's payment code to bypass credit card payment. This will invalidate your current payment code and your users should be aware of this change while ordering translations.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.credit_card import CreditCard
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
    api_instance = openapi_client.PaymentApi(api_client)

    try:
        # Reset payment code
        api_response = api_instance.reset_corporate_payment_code()
        print("The response of PaymentApi->reset_corporate_payment_code:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentApi->reset_corporate_payment_code: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**CreditCard**](CreditCard.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Credit card content |  -  |
**404** | UserNotFound UnauthorizedUser MissingCorporateAccount |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **toggle_corporate_auto_charge**
> OperationStatus toggle_corporate_auto_charge()

Manage automatic charges on your credit card

Toggle (enable/disable) automatic charges on the credit card on file.

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
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
    api_instance = openapi_client.PaymentApi(api_client)

    try:
        # Manage automatic charges on your credit card
        api_response = api_instance.toggle_corporate_auto_charge()
        print("The response of PaymentApi->toggle_corporate_auto_charge:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentApi->toggle_corporate_auto_charge: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**404** | UserNotFound UnauthorizedUser MissingCorporateAccount |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

