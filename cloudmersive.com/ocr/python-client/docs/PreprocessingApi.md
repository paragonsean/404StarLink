# openapi_client.PreprocessingApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preprocessing_binarize**](PreprocessingApi.md#preprocessing_binarize) | **POST** /ocr/preprocessing/image/binarize | Convert an image of text into a binarized (light and dark) view
[**preprocessing_binarize_advanced**](PreprocessingApi.md#preprocessing_binarize_advanced) | **POST** /ocr/preprocessing/image/binarize/advanced | Convert an image of text into a binary (light and dark) view with ML
[**preprocessing_get_page_angle**](PreprocessingApi.md#preprocessing_get_page_angle) | **POST** /ocr/preprocessing/image/get-page-angle | Get the angle of the page / document / receipt
[**preprocessing_unrotate**](PreprocessingApi.md#preprocessing_unrotate) | **POST** /ocr/preprocessing/image/unrotate | Detect and unrotate a document image
[**preprocessing_unrotate_advanced**](PreprocessingApi.md#preprocessing_unrotate_advanced) | **POST** /ocr/preprocessing/image/unrotate/advanced | Detect and unrotate a document image (advanced)
[**preprocessing_unskew**](PreprocessingApi.md#preprocessing_unskew) | **POST** /ocr/preprocessing/image/unskew | Detect and unskew a photo of a document


# **preprocessing_binarize**
> bytearray preprocessing_binarize(image_file)

Convert an image of text into a binarized (light and dark) view

Perform an adaptive binarization algorithm on the input image to prepare it for further OCR operations.

### Example

* Api Key Authentication (Apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudmersive.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.cloudmersive.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Apikey
configuration.api_key['Apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PreprocessingApi(api_client)
    image_file = None # bytearray | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.

    try:
        # Convert an image of text into a binarized (light and dark) view
        api_response = api_instance.preprocessing_binarize(image_file)
        print("The response of PreprocessingApi->preprocessing_binarize:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PreprocessingApi->preprocessing_binarize: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image_file** | **bytearray**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | 

### Return type

**bytearray**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, text/json, text/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **preprocessing_binarize_advanced**
> bytearray preprocessing_binarize_advanced(image_file)

Convert an image of text into a binary (light and dark) view with ML

Perform an advanced adaptive, Deep Learning-based binarization algorithm on the input image to prepare it for further OCR operations.  Provides enhanced accuracy than adaptive binarization.  Image will be upsampled to 300 DPI if it has a DPI below 300.

### Example

* Api Key Authentication (Apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudmersive.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.cloudmersive.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Apikey
configuration.api_key['Apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PreprocessingApi(api_client)
    image_file = None # bytearray | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.

    try:
        # Convert an image of text into a binary (light and dark) view with ML
        api_response = api_instance.preprocessing_binarize_advanced(image_file)
        print("The response of PreprocessingApi->preprocessing_binarize_advanced:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PreprocessingApi->preprocessing_binarize_advanced: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image_file** | **bytearray**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | 

### Return type

**bytearray**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, text/json, text/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **preprocessing_get_page_angle**
> GetPageAngleResult preprocessing_get_page_angle(image_file)

Get the angle of the page / document / receipt

Analyzes a photo or image of a document and identifies the rotation angle of the page.

### Example

* Api Key Authentication (Apikey):

```python
import openapi_client
from openapi_client.models.get_page_angle_result import GetPageAngleResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudmersive.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.cloudmersive.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Apikey
configuration.api_key['Apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PreprocessingApi(api_client)
    image_file = None # bytearray | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.

    try:
        # Get the angle of the page / document / receipt
        api_response = api_instance.preprocessing_get_page_angle(image_file)
        print("The response of PreprocessingApi->preprocessing_get_page_angle:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PreprocessingApi->preprocessing_get_page_angle: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image_file** | **bytearray**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | 

### Return type

[**GetPageAngleResult**](GetPageAngleResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, text/json, text/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **preprocessing_unrotate**
> bytearray preprocessing_unrotate(image_file)

Detect and unrotate a document image

Detect and unrotate an image of a document (e.g. that was scanned at an angle).  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.

### Example

* Api Key Authentication (Apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudmersive.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.cloudmersive.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Apikey
configuration.api_key['Apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PreprocessingApi(api_client)
    image_file = None # bytearray | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.

    try:
        # Detect and unrotate a document image
        api_response = api_instance.preprocessing_unrotate(image_file)
        print("The response of PreprocessingApi->preprocessing_unrotate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PreprocessingApi->preprocessing_unrotate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image_file** | **bytearray**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | 

### Return type

**bytearray**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, text/json, text/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **preprocessing_unrotate_advanced**
> bytearray preprocessing_unrotate_advanced(image_file)

Detect and unrotate a document image (advanced)

Detect and unrotate an image of a document (e.g. that was scanned at an angle) using deep learning.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.

### Example

* Api Key Authentication (Apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudmersive.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.cloudmersive.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Apikey
configuration.api_key['Apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PreprocessingApi(api_client)
    image_file = None # bytearray | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.

    try:
        # Detect and unrotate a document image (advanced)
        api_response = api_instance.preprocessing_unrotate_advanced(image_file)
        print("The response of PreprocessingApi->preprocessing_unrotate_advanced:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PreprocessingApi->preprocessing_unrotate_advanced: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image_file** | **bytearray**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | 

### Return type

**bytearray**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, text/json, text/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **preprocessing_unskew**
> bytearray preprocessing_unskew(image_file)

Detect and unskew a photo of a document

Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.

### Example

* Api Key Authentication (Apikey):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.cloudmersive.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.cloudmersive.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Apikey
configuration.api_key['Apikey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Apikey'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.PreprocessingApi(api_client)
    image_file = None # bytearray | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.

    try:
        # Detect and unskew a photo of a document
        api_response = api_instance.preprocessing_unskew(image_file)
        print("The response of PreprocessingApi->preprocessing_unskew:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PreprocessingApi->preprocessing_unskew: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image_file** | **bytearray**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. | 

### Return type

**bytearray**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, text/json, text/xml

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

