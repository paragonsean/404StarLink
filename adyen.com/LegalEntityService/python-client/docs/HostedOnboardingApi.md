# openapi_client.HostedOnboardingApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_themes**](HostedOnboardingApi.md#get_themes) | **GET** /themes | Get a list of hosted onboarding page themes
[**get_themes_id**](HostedOnboardingApi.md#get_themes_id) | **GET** /themes/{id} | Get an onboarding link theme
[**post_legal_entities_id_onboarding_links**](HostedOnboardingApi.md#post_legal_entities_id_onboarding_links) | **POST** /legalEntities/{id}/onboardingLinks | Get a link to an Adyen-hosted onboarding page


# **get_themes**
> OnboardingThemes get_themes()

Get a list of hosted onboarding page themes

Returns a list of hosted onboarding page themes.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.onboarding_themes import OnboardingThemes
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
    api_instance = openapi_client.HostedOnboardingApi(api_client)

    try:
        # Get a list of hosted onboarding page themes
        api_response = api_instance.get_themes()
        print("The response of HostedOnboardingApi->get_themes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HostedOnboardingApi->get_themes: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**OnboardingThemes**](OnboardingThemes.md)

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

# **get_themes_id**
> OnboardingTheme get_themes_id(id)

Get an onboarding link theme

Returns the details of the theme identified in the path.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.onboarding_theme import OnboardingTheme
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
    api_instance = openapi_client.HostedOnboardingApi(api_client)
    id = 'id_example' # str | The unique identifier of the theme

    try:
        # Get an onboarding link theme
        api_response = api_instance.get_themes_id(id)
        print("The response of HostedOnboardingApi->get_themes_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HostedOnboardingApi->get_themes_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the theme | 

### Return type

[**OnboardingTheme**](OnboardingTheme.md)

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

# **post_legal_entities_id_onboarding_links**
> OnboardingLink post_legal_entities_id_onboarding_links(id, onboarding_link_info=onboarding_link_info)

Get a link to an Adyen-hosted onboarding page

Returns a link to an Adyen-hosted onboarding page where you need to redirect your user.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.onboarding_link import OnboardingLink
from openapi_client.models.onboarding_link_info import OnboardingLinkInfo
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
    api_instance = openapi_client.HostedOnboardingApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity
    onboarding_link_info = openapi_client.OnboardingLinkInfo() # OnboardingLinkInfo |  (optional)

    try:
        # Get a link to an Adyen-hosted onboarding page
        api_response = api_instance.post_legal_entities_id_onboarding_links(id, onboarding_link_info=onboarding_link_info)
        print("The response of HostedOnboardingApi->post_legal_entities_id_onboarding_links:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling HostedOnboardingApi->post_legal_entities_id_onboarding_links: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity | 
 **onboarding_link_info** | [**OnboardingLinkInfo**](OnboardingLinkInfo.md)|  | [optional] 

### Return type

[**OnboardingLink**](OnboardingLink.md)

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

