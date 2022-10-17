# openapi_client.DefaultApi

All URIs are relative to *http://mediaconvert.us-east-1.amazonaws.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associate_certificate**](DefaultApi.md#associate_certificate) | **POST** /2017-08-29/certificates | 
[**cancel_job**](DefaultApi.md#cancel_job) | **DELETE** /2017-08-29/jobs/{id} | 
[**create_job**](DefaultApi.md#create_job) | **POST** /2017-08-29/jobs | 
[**create_job_template**](DefaultApi.md#create_job_template) | **POST** /2017-08-29/jobTemplates | 
[**create_preset**](DefaultApi.md#create_preset) | **POST** /2017-08-29/presets | 
[**create_queue**](DefaultApi.md#create_queue) | **POST** /2017-08-29/queues | 
[**delete_job_template**](DefaultApi.md#delete_job_template) | **DELETE** /2017-08-29/jobTemplates/{name} | 
[**delete_policy**](DefaultApi.md#delete_policy) | **DELETE** /2017-08-29/policy | 
[**delete_preset**](DefaultApi.md#delete_preset) | **DELETE** /2017-08-29/presets/{name} | 
[**delete_queue**](DefaultApi.md#delete_queue) | **DELETE** /2017-08-29/queues/{name} | 
[**describe_endpoints**](DefaultApi.md#describe_endpoints) | **POST** /2017-08-29/endpoints | 
[**disassociate_certificate**](DefaultApi.md#disassociate_certificate) | **DELETE** /2017-08-29/certificates/{arn} | 
[**get_job**](DefaultApi.md#get_job) | **GET** /2017-08-29/jobs/{id} | 
[**get_job_template**](DefaultApi.md#get_job_template) | **GET** /2017-08-29/jobTemplates/{name} | 
[**get_policy**](DefaultApi.md#get_policy) | **GET** /2017-08-29/policy | 
[**get_preset**](DefaultApi.md#get_preset) | **GET** /2017-08-29/presets/{name} | 
[**get_queue**](DefaultApi.md#get_queue) | **GET** /2017-08-29/queues/{name} | 
[**list_job_templates**](DefaultApi.md#list_job_templates) | **GET** /2017-08-29/jobTemplates | 
[**list_jobs**](DefaultApi.md#list_jobs) | **GET** /2017-08-29/jobs | 
[**list_presets**](DefaultApi.md#list_presets) | **GET** /2017-08-29/presets | 
[**list_queues**](DefaultApi.md#list_queues) | **GET** /2017-08-29/queues | 
[**list_tags_for_resource**](DefaultApi.md#list_tags_for_resource) | **GET** /2017-08-29/tags/{arn} | 
[**put_policy**](DefaultApi.md#put_policy) | **PUT** /2017-08-29/policy | 
[**tag_resource**](DefaultApi.md#tag_resource) | **POST** /2017-08-29/tags | 
[**untag_resource**](DefaultApi.md#untag_resource) | **PUT** /2017-08-29/tags/{arn} | 
[**update_job_template**](DefaultApi.md#update_job_template) | **PUT** /2017-08-29/jobTemplates/{name} | 
[**update_preset**](DefaultApi.md#update_preset) | **PUT** /2017-08-29/presets/{name} | 
[**update_queue**](DefaultApi.md#update_queue) | **PUT** /2017-08-29/queues/{name} | 


# **associate_certificate**
> object associate_certificate(associate_certificate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_certificate_request import AssociateCertificateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    associate_certificate_request = openapi_client.AssociateCertificateRequest() # AssociateCertificateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_certificate(associate_certificate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_certificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_certificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associate_certificate_request** | [**AssociateCertificateRequest**](AssociateCertificateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_job**
> object cancel_job(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Permanently cancel a job. Once you have canceled a job, you can't start it again.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The Job ID of the job to be cancelled.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.cancel_job(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->cancel_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->cancel_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The Job ID of the job to be cancelled. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_job**
> CreateJobResponse create_job(create_job_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_job_request import CreateJobRequest
from openapi_client.models.create_job_response import CreateJobResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    create_job_request = openapi_client.CreateJobRequest() # CreateJobRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_job(create_job_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_job_request** | [**CreateJobRequest**](CreateJobRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateJobResponse**](CreateJobResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_job_template**
> CreateJobTemplateResponse create_job_template(create_job_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_job_template_request import CreateJobTemplateRequest
from openapi_client.models.create_job_template_response import CreateJobTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    create_job_template_request = openapi_client.CreateJobTemplateRequest() # CreateJobTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_job_template(create_job_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_job_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_job_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_job_template_request** | [**CreateJobTemplateRequest**](CreateJobTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateJobTemplateResponse**](CreateJobTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_preset**
> CreatePresetResponse create_preset(create_preset_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_preset_request import CreatePresetRequest
from openapi_client.models.create_preset_response import CreatePresetResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    create_preset_request = openapi_client.CreatePresetRequest() # CreatePresetRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_preset(create_preset_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_preset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_preset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_preset_request** | [**CreatePresetRequest**](CreatePresetRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreatePresetResponse**](CreatePresetResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_queue**
> CreateQueueResponse create_queue(create_queue_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_queue_request import CreateQueueRequest
from openapi_client.models.create_queue_response import CreateQueueResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    create_queue_request = openapi_client.CreateQueueRequest() # CreateQueueRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_queue(create_queue_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_queue_request** | [**CreateQueueRequest**](CreateQueueRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateQueueResponse**](CreateQueueResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_job_template**
> object delete_job_template(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Permanently delete a job template you have created.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the job template to be deleted.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_job_template(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_job_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_job_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the job template to be deleted. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_policy**
> object delete_policy(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Permanently delete a policy that you created.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_policy(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_preset**
> object delete_preset(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Permanently delete a preset you have created.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the preset to be deleted.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_preset(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_preset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_preset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the preset to be deleted. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_queue**
> object delete_queue(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Permanently delete a queue you have created.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the queue that you want to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_queue(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the queue that you want to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **describe_endpoints**
> DescribeEndpointsResponse describe_endpoints(describe_endpoints_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



Send an request with an empty body to the regional API endpoint to get your account API endpoint.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.describe_endpoints_request import DescribeEndpointsRequest
from openapi_client.models.describe_endpoints_response import DescribeEndpointsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    describe_endpoints_request = openapi_client.DescribeEndpointsRequest() # DescribeEndpointsRequest | 
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
        api_response = api_instance.describe_endpoints(describe_endpoints_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->describe_endpoints:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->describe_endpoints: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **describe_endpoints_request** | [**DescribeEndpointsRequest**](DescribeEndpointsRequest.md)|  | 
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

[**DescribeEndpointsResponse**](DescribeEndpointsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_certificate**
> object disassociate_certificate(arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and an AWS Elemental MediaConvert resource.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    arn = 'arn_example' # str | The ARN of the ACM certificate that you want to disassociate from your MediaConvert resource.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_certificate(arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_certificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_certificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **arn** | **str**| The ARN of the ACM certificate that you want to disassociate from your MediaConvert resource. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_job**
> GetJobResponse get_job(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieve the JSON for a specific completed transcoding job.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_job_response import GetJobResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | the job ID of the job.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_job(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| the job ID of the job. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetJobResponse**](GetJobResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_job_template**
> GetJobTemplateResponse get_job_template(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieve the JSON for a specific job template.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_job_template_response import GetJobTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the job template.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_job_template(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_job_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_job_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the job template. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetJobTemplateResponse**](GetJobTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_policy**
> GetPolicyResponse get_policy(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieve the JSON for your policy.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_policy_response import GetPolicyResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_policy(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetPolicyResponse**](GetPolicyResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_preset**
> GetPresetResponse get_preset(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieve the JSON for a specific preset.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_preset_response import GetPresetResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the preset.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_preset(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_preset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_preset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the preset. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetPresetResponse**](GetPresetResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_queue**
> GetQueueResponse get_queue(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieve the JSON for a specific queue.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_queue_response import GetQueueResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the queue that you want information about.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_queue(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the queue that you want information about. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetQueueResponse**](GetQueueResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_job_templates**
> ListJobTemplatesResponse list_job_templates(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, category=category, list_by=list_by, max_results=max_results, next_token=next_token, order=order, max_results2=max_results2, next_token2=next_token2)



Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_job_templates_response import ListJobTemplatesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    category = 'category_example' # str | Optionally, specify a job template category to limit responses to only job templates from that category. (optional)
    list_by = 'list_by_example' # str | Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name. (optional)
    max_results = 56 # int | Optional. Number of job templates, up to twenty, that will be returned at one time. (optional)
    next_token = 'next_token_example' # str | Use this string, provided with the response to a previous request, to request the next batch of job templates. (optional)
    order = 'order_example' # str | Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_job_templates(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, category=category, list_by=list_by, max_results=max_results, next_token=next_token, order=order, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_job_templates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_job_templates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **category** | **str**| Optionally, specify a job template category to limit responses to only job templates from that category. | [optional] 
 **list_by** | **str**| Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don&#39;t specify, the service will list them by name. | [optional] 
 **max_results** | **int**| Optional. Number of job templates, up to twenty, that will be returned at one time. | [optional] 
 **next_token** | **str**| Use this string, provided with the response to a previous request, to request the next batch of job templates. | [optional] 
 **order** | **str**| Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListJobTemplatesResponse**](ListJobTemplatesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_jobs**
> ListJobsResponse list_jobs(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, order=order, queue=queue, status=status, max_results2=max_results2, next_token2=next_token2)



Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_jobs_response import ListJobsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 56 # int | Optional. Number of jobs, up to twenty, that will be returned at one time. (optional)
    next_token = 'next_token_example' # str | Optional. Use this string, provided with the response to a previous request, to request the next batch of jobs. (optional)
    order = 'order_example' # str | Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. (optional)
    queue = 'queue_example' # str | Optional. Provide a queue name to get back only jobs from that queue. (optional)
    status = 'status_example' # str | Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_jobs(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, order=order, queue=queue, status=status, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **int**| Optional. Number of jobs, up to twenty, that will be returned at one time. | [optional] 
 **next_token** | **str**| Optional. Use this string, provided with the response to a previous request, to request the next batch of jobs. | [optional] 
 **order** | **str**| Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. | [optional] 
 **queue** | **str**| Optional. Provide a queue name to get back only jobs from that queue. | [optional] 
 **status** | **str**| Optional. A job&#39;s status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListJobsResponse**](ListJobsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_presets**
> ListPresetsResponse list_presets(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, category=category, list_by=list_by, max_results=max_results, next_token=next_token, order=order, max_results2=max_results2, next_token2=next_token2)



Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_presets_response import ListPresetsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    category = 'category_example' # str | Optionally, specify a preset category to limit responses to only presets from that category. (optional)
    list_by = 'list_by_example' # str | Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name. (optional)
    max_results = 56 # int | Optional. Number of presets, up to twenty, that will be returned at one time (optional)
    next_token = 'next_token_example' # str | Use this string, provided with the response to a previous request, to request the next batch of presets. (optional)
    order = 'order_example' # str | Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_presets(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, category=category, list_by=list_by, max_results=max_results, next_token=next_token, order=order, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_presets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_presets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **category** | **str**| Optionally, specify a preset category to limit responses to only presets from that category. | [optional] 
 **list_by** | **str**| Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don&#39;t specify, the service will list them by name. | [optional] 
 **max_results** | **int**| Optional. Number of presets, up to twenty, that will be returned at one time | [optional] 
 **next_token** | **str**| Use this string, provided with the response to a previous request, to request the next batch of presets. | [optional] 
 **order** | **str**| Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListPresetsResponse**](ListPresetsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_queues**
> ListQueuesResponse list_queues(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, list_by=list_by, max_results=max_results, next_token=next_token, order=order, max_results2=max_results2, next_token2=next_token2)



Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_queues_response import ListQueuesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    list_by = 'list_by_example' # str | Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date. (optional)
    max_results = 56 # int | Optional. Number of queues, up to twenty, that will be returned at one time. (optional)
    next_token = 'next_token_example' # str | Use this string, provided with the response to a previous request, to request the next batch of queues. (optional)
    order = 'order_example' # str | Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_queues(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, list_by=list_by, max_results=max_results, next_token=next_token, order=order, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_queues:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_queues: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **list_by** | **str**| Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don&#39;t specify, the service will list them by creation date. | [optional] 
 **max_results** | **int**| Optional. Number of queues, up to twenty, that will be returned at one time. | [optional] 
 **next_token** | **str**| Use this string, provided with the response to a previous request, to request the next batch of queues. | [optional] 
 **order** | **str**| Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListQueuesResponse**](ListQueuesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_tags_for_resource**
> ListTagsForResourceResponse list_tags_for_resource(arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieve the tags for a MediaConvert resource.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_tags_for_resource_response import ListTagsForResourceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    arn = 'arn_example' # str | The Amazon Resource Name (ARN) of the resource that you want to list tags for. To get the ARN, send a GET request with the resource name.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.list_tags_for_resource(arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->list_tags_for_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_tags_for_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **arn** | **str**| The Amazon Resource Name (ARN) of the resource that you want to list tags for. To get the ARN, send a GET request with the resource name. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**ListTagsForResourceResponse**](ListTagsForResourceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_policy**
> PutPolicyResponse put_policy(put_policy_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Create or change your policy. For more information about policies, see the user guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.put_policy_request import PutPolicyRequest
from openapi_client.models.put_policy_response import PutPolicyResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    put_policy_request = openapi_client.PutPolicyRequest() # PutPolicyRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.put_policy(put_policy_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->put_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->put_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **put_policy_request** | [**PutPolicyRequest**](PutPolicyRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**PutPolicyResponse**](PutPolicyResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tag_resource**
> object tag_resource(tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.tag_resource_request import TagResourceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    tag_resource_request = openapi_client.TagResourceRequest() # TagResourceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.tag_resource(tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->tag_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag_resource_request** | [**TagResourceRequest**](TagResourceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **untag_resource**
> object untag_resource(arn, untag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.untag_resource_request import UntagResourceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    arn = 'arn_example' # str | The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET request with the resource name.
    untag_resource_request = openapi_client.UntagResourceRequest() # UntagResourceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.untag_resource(arn, untag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->untag_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->untag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **arn** | **str**| The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET request with the resource name. | 
 **untag_resource_request** | [**UntagResourceRequest**](UntagResourceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_job_template**
> UpdateJobTemplateResponse update_job_template(name, update_job_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Modify one of your existing job templates.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_job_template_request import UpdateJobTemplateRequest
from openapi_client.models.update_job_template_response import UpdateJobTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the job template you are modifying
    update_job_template_request = openapi_client.UpdateJobTemplateRequest() # UpdateJobTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_job_template(name, update_job_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_job_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_job_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the job template you are modifying | 
 **update_job_template_request** | [**UpdateJobTemplateRequest**](UpdateJobTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateJobTemplateResponse**](UpdateJobTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_preset**
> UpdatePresetResponse update_preset(name, update_preset_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Modify one of your existing presets.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_preset_request import UpdatePresetRequest
from openapi_client.models.update_preset_response import UpdatePresetResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the preset you are modifying.
    update_preset_request = openapi_client.UpdatePresetRequest() # UpdatePresetRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_preset(name, update_preset_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_preset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_preset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the preset you are modifying. | 
 **update_preset_request** | [**UpdatePresetRequest**](UpdatePresetRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdatePresetResponse**](UpdatePresetResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_queue**
> UpdateQueueResponse update_queue(name, update_queue_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Modify one of your existing queues.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_queue_request import UpdateQueueRequest
from openapi_client.models.update_queue_response import UpdateQueueResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://mediaconvert.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://mediaconvert.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the queue that you are modifying.
    update_queue_request = openapi_client.UpdateQueueRequest() # UpdateQueueRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_queue(name, update_queue_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_queue: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the queue that you are modifying. | 
 **update_queue_request** | [**UpdateQueueRequest**](UpdateQueueRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateQueueResponse**](UpdateQueueResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | ForbiddenException |  -  |
**483** | NotFoundException |  -  |
**484** | TooManyRequestsException |  -  |
**485** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

