# openapi_client.DefaultApi

All URIs are relative to *http://api.pricing.us-east-1.amazonaws.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**describe_services**](DefaultApi.md#describe_services) | **POST** /#X-Amz-Target&#x3D;AWSPriceListService.DescribeServices | 
[**get_attribute_values**](DefaultApi.md#get_attribute_values) | **POST** /#X-Amz-Target&#x3D;AWSPriceListService.GetAttributeValues | 
[**get_price_list_file_url**](DefaultApi.md#get_price_list_file_url) | **POST** /#X-Amz-Target&#x3D;AWSPriceListService.GetPriceListFileUrl | 
[**get_products**](DefaultApi.md#get_products) | **POST** /#X-Amz-Target&#x3D;AWSPriceListService.GetProducts | 
[**list_price_lists**](DefaultApi.md#list_price_lists) | **POST** /#X-Amz-Target&#x3D;AWSPriceListService.ListPriceLists | 


# **describe_services**
> DescribeServicesResponse describe_services(x_amz_target, describe_services_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as <code>AmazonEC2</code>, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are <code>volumeType</code>, <code>maxIopsVolume</code>, <code>operation</code>, <code>locationType</code>, and <code>instanceCapacity10xlarge</code>.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.describe_services_request import DescribeServicesRequest
from openapi_client.models.describe_services_response import DescribeServicesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.pricing.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.pricing.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    describe_services_request = openapi_client.DescribeServicesRequest() # DescribeServicesRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 'max_results_example' # str | Pagination limit (optional)
    next_token = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.describe_services(x_amz_target, describe_services_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->describe_services:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->describe_services: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **describe_services_request** | [**DescribeServicesRequest**](DescribeServicesRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **str**| Pagination limit | [optional] 
 **next_token** | **str**| Pagination token | [optional] 

### Return type

[**DescribeServicesResponse**](DescribeServicesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InternalErrorException |  -  |
**481** | InvalidParameterException |  -  |
**482** | NotFoundException |  -  |
**483** | InvalidNextTokenException |  -  |
**484** | ExpiredNextTokenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_attribute_values**
> GetAttributeValuesResponse get_attribute_values(x_amz_target, get_attribute_values_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



Returns a list of attribute values. Attributes are similar to the details in a Price List API offer file. For a list of available attributes, see <a href=\"https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/reading-an-offer.html#pps-defs\">Offer File Definitions</a> in the <a href=\"https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-what-is.html\">Billing and Cost Management User Guide</a>.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_attribute_values_request import GetAttributeValuesRequest
from openapi_client.models.get_attribute_values_response import GetAttributeValuesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.pricing.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.pricing.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_attribute_values_request = openapi_client.GetAttributeValuesRequest() # GetAttributeValuesRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 'max_results_example' # str | Pagination limit (optional)
    next_token = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.get_attribute_values(x_amz_target, get_attribute_values_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->get_attribute_values:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_attribute_values: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_attribute_values_request** | [**GetAttributeValuesRequest**](GetAttributeValuesRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **str**| Pagination limit | [optional] 
 **next_token** | **str**| Pagination token | [optional] 

### Return type

[**GetAttributeValuesResponse**](GetAttributeValuesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InternalErrorException |  -  |
**481** | InvalidParameterException |  -  |
**482** | NotFoundException |  -  |
**483** | InvalidNextTokenException |  -  |
**484** | ExpiredNextTokenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_price_list_file_url**
> GetPriceListFileUrlResponse get_price_list_file_url(x_amz_target, get_price_list_file_url_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p> <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is subject to the Beta Service Participation terms of the <a href=\"https://aws.amazon.com/service-terms/\">Amazon Web Services Service Terms</a> (Section 1.10).</b> </i> </p> <p>This returns the URL that you can retrieve your Price List file from. This URL is based on the <code>PriceListArn</code> and <code>FileFormat</code> that you retrieve from the <a href=\"https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html\"> <code>ListPriceLists</code> </a> response. </p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_price_list_file_url_request import GetPriceListFileUrlRequest
from openapi_client.models.get_price_list_file_url_response import GetPriceListFileUrlResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.pricing.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.pricing.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_price_list_file_url_request = openapi_client.GetPriceListFileUrlRequest() # GetPriceListFileUrlRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_price_list_file_url(x_amz_target, get_price_list_file_url_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_price_list_file_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_price_list_file_url: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_price_list_file_url_request** | [**GetPriceListFileUrlRequest**](GetPriceListFileUrlRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetPriceListFileUrlResponse**](GetPriceListFileUrlResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InternalErrorException |  -  |
**481** | InvalidParameterException |  -  |
**482** | NotFoundException |  -  |
**483** | AccessDeniedException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_products**
> GetProductsResponse get_products(x_amz_target, get_products_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



Returns a list of all products that match the filter criteria.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_products_request import GetProductsRequest
from openapi_client.models.get_products_response import GetProductsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.pricing.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.pricing.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_products_request = openapi_client.GetProductsRequest() # GetProductsRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 'max_results_example' # str | Pagination limit (optional)
    next_token = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.get_products(x_amz_target, get_products_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->get_products:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_products: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_products_request** | [**GetProductsRequest**](GetProductsRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **str**| Pagination limit | [optional] 
 **next_token** | **str**| Pagination token | [optional] 

### Return type

[**GetProductsResponse**](GetProductsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InternalErrorException |  -  |
**481** | InvalidParameterException |  -  |
**482** | NotFoundException |  -  |
**483** | InvalidNextTokenException |  -  |
**484** | ExpiredNextTokenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_price_lists**
> ListPriceListsResponse list_price_lists(x_amz_target, list_price_lists_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



<p> <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is subject to the Beta Service Participation terms of the <a href=\"https://aws.amazon.com/service-terms/\">Amazon Web Services Service Terms</a> (Section 1.10).</b> </i> </p> <p>This returns a list of Price List references that the requester if authorized to view, given a <code>ServiceCode</code>, <code>CurrencyCode</code>, and an <code>EffectiveDate</code>. Use without a <code>RegionCode</code> filter to list Price List references from all available Amazon Web Services Regions. Use with a <code>RegionCode</code> filter to get the Price List reference that's specific to a specific Amazon Web Services Region. You can use the <code>PriceListArn</code> from the response to get your preferred Price List files through the <a href=\"https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetPriceListFileUrl.html\"> <code>GetPriceListFileUrl</code> </a> API.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_price_lists_request import ListPriceListsRequest
from openapi_client.models.list_price_lists_response import ListPriceListsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.pricing.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.pricing.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    list_price_lists_request = openapi_client.ListPriceListsRequest() # ListPriceListsRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 'max_results_example' # str | Pagination limit (optional)
    next_token = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_price_lists(x_amz_target, list_price_lists_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->list_price_lists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_price_lists: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **list_price_lists_request** | [**ListPriceListsRequest**](ListPriceListsRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **str**| Pagination limit | [optional] 
 **next_token** | **str**| Pagination token | [optional] 

### Return type

[**ListPriceListsResponse**](ListPriceListsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InternalErrorException |  -  |
**481** | InvalidParameterException |  -  |
**482** | NotFoundException |  -  |
**483** | InvalidNextTokenException |  -  |
**484** | ExpiredNextTokenException |  -  |
**485** | AccessDeniedException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

