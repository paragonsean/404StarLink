# openapi_client.LegalEntitiesApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_legal_entities_id**](LegalEntitiesApi.md#get_legal_entities_id) | **GET** /legalEntities/{id} | Get a legal entity
[**get_legal_entities_id_business_lines**](LegalEntitiesApi.md#get_legal_entities_id_business_lines) | **GET** /legalEntities/{id}/businessLines | Get all business lines under a legal entity
[**patch_legal_entities_id**](LegalEntitiesApi.md#patch_legal_entities_id) | **PATCH** /legalEntities/{id} | Update a legal entity
[**post_legal_entities**](LegalEntitiesApi.md#post_legal_entities) | **POST** /legalEntities | Create a legal entity
[**post_legal_entities_id_check_verification_errors**](LegalEntitiesApi.md#post_legal_entities_id_check_verification_errors) | **POST** /legalEntities/{id}/checkVerificationErrors | Check a legal entity&#39;s verification errors


# **get_legal_entities_id**
> LegalEntity get_legal_entities_id(id)

Get a legal entity

Returns a legal entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.legal_entity import LegalEntity
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
    api_instance = openapi_client.LegalEntitiesApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity.

    try:
        # Get a legal entity
        api_response = api_instance.get_legal_entities_id(id)
        print("The response of LegalEntitiesApi->get_legal_entities_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LegalEntitiesApi->get_legal_entities_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity. | 

### Return type

[**LegalEntity**](LegalEntity.md)

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

# **get_legal_entities_id_business_lines**
> BusinessLines get_legal_entities_id_business_lines(id)

Get all business lines under a legal entity

Returns the business lines owned by a legal entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.business_lines import BusinessLines
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
    api_instance = openapi_client.LegalEntitiesApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity.

    try:
        # Get all business lines under a legal entity
        api_response = api_instance.get_legal_entities_id_business_lines(id)
        print("The response of LegalEntitiesApi->get_legal_entities_id_business_lines:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LegalEntitiesApi->get_legal_entities_id_business_lines: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity. | 

### Return type

[**BusinessLines**](BusinessLines.md)

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

# **patch_legal_entities_id**
> LegalEntity patch_legal_entities_id(id, legal_entity_info=legal_entity_info)

Update a legal entity

Updates a legal entity.   >To change the legal entity type, include only the new `type` in your request. To update the `entityAssociations` array, you need to replace the entire array. For example, if the array has 3 entries and you want to remove 1 entry, you need to PATCH the resource with the remaining 2 entries.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.legal_entity import LegalEntity
from openapi_client.models.legal_entity_info import LegalEntityInfo
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
    api_instance = openapi_client.LegalEntitiesApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity.
    legal_entity_info = openapi_client.LegalEntityInfo() # LegalEntityInfo |  (optional)

    try:
        # Update a legal entity
        api_response = api_instance.patch_legal_entities_id(id, legal_entity_info=legal_entity_info)
        print("The response of LegalEntitiesApi->patch_legal_entities_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LegalEntitiesApi->patch_legal_entities_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity. | 
 **legal_entity_info** | [**LegalEntityInfo**](LegalEntityInfo.md)|  | [optional] 

### Return type

[**LegalEntity**](LegalEntity.md)

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

# **post_legal_entities**
> LegalEntity post_legal_entities(legal_entity_info_required_type=legal_entity_info_required_type)

Create a legal entity

Creates a legal entity.   This resource contains information about the user that will be onboarded in your platform. Adyen uses this information to perform verification checks as required by payment industry regulations. Adyen informs you of the verification results through webhooks or API responses.   

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.legal_entity import LegalEntity
from openapi_client.models.legal_entity_info_required_type import LegalEntityInfoRequiredType
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
    api_instance = openapi_client.LegalEntitiesApi(api_client)
    legal_entity_info_required_type = openapi_client.LegalEntityInfoRequiredType() # LegalEntityInfoRequiredType |  (optional)

    try:
        # Create a legal entity
        api_response = api_instance.post_legal_entities(legal_entity_info_required_type=legal_entity_info_required_type)
        print("The response of LegalEntitiesApi->post_legal_entities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LegalEntitiesApi->post_legal_entities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legal_entity_info_required_type** | [**LegalEntityInfoRequiredType**](LegalEntityInfoRequiredType.md)|  | [optional] 

### Return type

[**LegalEntity**](LegalEntity.md)

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

# **post_legal_entities_id_check_verification_errors**
> VerificationErrors post_legal_entities_id_check_verification_errors(id)

Check a legal entity's verification errors

Returns the verification errors for a legal entity and its supporting entities.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.verification_errors import VerificationErrors
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
    api_instance = openapi_client.LegalEntitiesApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity.

    try:
        # Check a legal entity's verification errors
        api_response = api_instance.post_legal_entities_id_check_verification_errors(id)
        print("The response of LegalEntitiesApi->post_legal_entities_id_check_verification_errors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LegalEntitiesApi->post_legal_entities_id_check_verification_errors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity. | 

### Return type

[**VerificationErrors**](VerificationErrors.md)

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

