# openapi_client.PCIQuestionnairesApi

All URIs are relative to *https://kyc-test.adyen.com/lem/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_legal_entities_id_pci_questionnaires**](PCIQuestionnairesApi.md#get_legal_entities_id_pci_questionnaires) | **GET** /legalEntities/{id}/pciQuestionnaires | Get PCI questionnaire details
[**get_legal_entities_id_pci_questionnaires_pciid**](PCIQuestionnairesApi.md#get_legal_entities_id_pci_questionnaires_pciid) | **GET** /legalEntities/{id}/pciQuestionnaires/{pciid} | Get PCI questionnaire
[**post_legal_entities_id_pci_questionnaires_generate_pci_templates**](PCIQuestionnairesApi.md#post_legal_entities_id_pci_questionnaires_generate_pci_templates) | **POST** /legalEntities/{id}/pciQuestionnaires/generatePciTemplates | Generate PCI questionnaire
[**post_legal_entities_id_pci_questionnaires_sign_pci_templates**](PCIQuestionnairesApi.md#post_legal_entities_id_pci_questionnaires_sign_pci_templates) | **POST** /legalEntities/{id}/pciQuestionnaires/signPciTemplates | Sign PCI questionnaire


# **get_legal_entities_id_pci_questionnaires**
> GetPciQuestionnaireInfosResponse get_legal_entities_id_pci_questionnaires(id)

Get PCI questionnaire details

Get a list of signed PCI questionnaires.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.get_pci_questionnaire_infos_response import GetPciQuestionnaireInfosResponse
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
    api_instance = openapi_client.PCIQuestionnairesApi(api_client)
    id = 'id_example' # str | The unique identifier of the legal entity to get PCI questionnaire information.

    try:
        # Get PCI questionnaire details
        api_response = api_instance.get_legal_entities_id_pci_questionnaires(id)
        print("The response of PCIQuestionnairesApi->get_legal_entities_id_pci_questionnaires:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PCIQuestionnairesApi->get_legal_entities_id_pci_questionnaires: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the legal entity to get PCI questionnaire information. | 

### Return type

[**GetPciQuestionnaireInfosResponse**](GetPciQuestionnaireInfosResponse.md)

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

# **get_legal_entities_id_pci_questionnaires_pciid**
> GetPciQuestionnaireResponse get_legal_entities_id_pci_questionnaires_pciid(id, pciid)

Get PCI questionnaire

Returns the signed PCI questionnaire.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.get_pci_questionnaire_response import GetPciQuestionnaireResponse
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
    api_instance = openapi_client.PCIQuestionnairesApi(api_client)
    id = 'id_example' # str | The legal entity ID of the individual who signed the PCI questionnaire.
    pciid = 'pciid_example' # str | The unique identifier of the signed PCI questionnaire.

    try:
        # Get PCI questionnaire
        api_response = api_instance.get_legal_entities_id_pci_questionnaires_pciid(id, pciid)
        print("The response of PCIQuestionnairesApi->get_legal_entities_id_pci_questionnaires_pciid:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PCIQuestionnairesApi->get_legal_entities_id_pci_questionnaires_pciid: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The legal entity ID of the individual who signed the PCI questionnaire. | 
 **pciid** | **str**| The unique identifier of the signed PCI questionnaire. | 

### Return type

[**GetPciQuestionnaireResponse**](GetPciQuestionnaireResponse.md)

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

# **post_legal_entities_id_pci_questionnaires_generate_pci_templates**
> GeneratePciDescriptionResponse post_legal_entities_id_pci_questionnaires_generate_pci_templates(id, generate_pci_description_request=generate_pci_description_request)

Generate PCI questionnaire

Generates the required PCI questionnaire based on the user's [salesChannel](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines__reqParam_salesChannels). If multiple questionnaires are required, this request creates a single consodilated document to be signed.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.generate_pci_description_request import GeneratePciDescriptionRequest
from openapi_client.models.generate_pci_description_response import GeneratePciDescriptionResponse
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
    api_instance = openapi_client.PCIQuestionnairesApi(api_client)
    id = 'id_example' # str | The legal entity ID of the individual who will sign the PCI questionnaire.
    generate_pci_description_request = openapi_client.GeneratePciDescriptionRequest() # GeneratePciDescriptionRequest |  (optional)

    try:
        # Generate PCI questionnaire
        api_response = api_instance.post_legal_entities_id_pci_questionnaires_generate_pci_templates(id, generate_pci_description_request=generate_pci_description_request)
        print("The response of PCIQuestionnairesApi->post_legal_entities_id_pci_questionnaires_generate_pci_templates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PCIQuestionnairesApi->post_legal_entities_id_pci_questionnaires_generate_pci_templates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The legal entity ID of the individual who will sign the PCI questionnaire. | 
 **generate_pci_description_request** | [**GeneratePciDescriptionRequest**](GeneratePciDescriptionRequest.md)|  | [optional] 

### Return type

[**GeneratePciDescriptionResponse**](GeneratePciDescriptionResponse.md)

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

# **post_legal_entities_id_pci_questionnaires_sign_pci_templates**
> PciSigningResponse post_legal_entities_id_pci_questionnaires_sign_pci_templates(id, pci_signing_request=pci_signing_request)

Sign PCI questionnaire

Signs the required PCI questionnaire.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import openapi_client
from openapi_client.models.pci_signing_request import PciSigningRequest
from openapi_client.models.pci_signing_response import PciSigningResponse
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
    api_instance = openapi_client.PCIQuestionnairesApi(api_client)
    id = 'id_example' # str | The legal entity ID of the individual who signed the PCI questionnaire.
    pci_signing_request = openapi_client.PciSigningRequest() # PciSigningRequest |  (optional)

    try:
        # Sign PCI questionnaire
        api_response = api_instance.post_legal_entities_id_pci_questionnaires_sign_pci_templates(id, pci_signing_request=pci_signing_request)
        print("The response of PCIQuestionnairesApi->post_legal_entities_id_pci_questionnaires_sign_pci_templates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PCIQuestionnairesApi->post_legal_entities_id_pci_questionnaires_sign_pci_templates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The legal entity ID of the individual who signed the PCI questionnaire. | 
 **pci_signing_request** | [**PciSigningRequest**](PciSigningRequest.md)|  | [optional] 

### Return type

[**PciSigningResponse**](PciSigningResponse.md)

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

