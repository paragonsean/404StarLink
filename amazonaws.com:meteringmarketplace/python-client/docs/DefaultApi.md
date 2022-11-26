# openapi_client.DefaultApi

All URIs are relative to *http://metering.marketplace.us-east-1.amazonaws.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_meter_usage**](DefaultApi.md#batch_meter_usage) | **POST** /#X-Amz-Target&#x3D;AWSMPMeteringService.BatchMeterUsage | 
[**meter_usage**](DefaultApi.md#meter_usage) | **POST** /#X-Amz-Target&#x3D;AWSMPMeteringService.MeterUsage | 
[**register_usage**](DefaultApi.md#register_usage) | **POST** /#X-Amz-Target&#x3D;AWSMPMeteringService.RegisterUsage | 
[**resolve_customer**](DefaultApi.md#resolve_customer) | **POST** /#X-Amz-Target&#x3D;AWSMPMeteringService.ResolveCustomer | 


# **batch_meter_usage**
> BatchMeterUsageResult batch_meter_usage(x_amz_target, batch_meter_usage_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p> <code>BatchMeterUsage</code> is called from a SaaS application listed on AWS Marketplace to post metering records for a set of customers.</p> <p>For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records.</p> <p>Every request to <code>BatchMeterUsage</code> is for one product. If you need to meter usage for multiple products, you must make multiple calls to <code>BatchMeterUsage</code>.</p> <p>Usage records are expected to be submitted as quickly as possible after the event that is being recorded, and are not accepted more than 6 hours after the event.</p> <p> <code>BatchMeterUsage</code> can process up to 25 <code>UsageRecords</code> at a time.</p> <p>A <code>UsageRecord</code> can optionally include multiple usage allocations, to provide customers with usage data split into buckets by tags that you define (or allow the customer to define).</p> <p> <code>BatchMeterUsage</code> returns a list of <code>UsageRecordResult</code> objects, showing the result for each <code>UsageRecord</code>, as well as a list of <code>UnprocessedRecords</code>, indicating errors in the service side that you should retry.</p> <p> <code>BatchMeterUsage</code> requests must be less than 1MB in size.</p> <note> <p>For an example of using <code>BatchMeterUsage</code>, see <a href=\"https://docs.aws.amazon.com/marketplace/latest/userguide/saas-code-examples.html#saas-batchmeterusage-example\"> BatchMeterUsage code example</a> in the <i>AWS Marketplace Seller Guide</i>.</p> </note>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.batch_meter_usage_request import BatchMeterUsageRequest
from openapi_client.models.batch_meter_usage_result import BatchMeterUsageResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://metering.marketplace.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://metering.marketplace.us-east-1.amazonaws.com"
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
    batch_meter_usage_request = openapi_client.BatchMeterUsageRequest() # BatchMeterUsageRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.batch_meter_usage(x_amz_target, batch_meter_usage_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->batch_meter_usage:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->batch_meter_usage: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **batch_meter_usage_request** | [**BatchMeterUsageRequest**](BatchMeterUsageRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**BatchMeterUsageResult**](BatchMeterUsageResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InternalServiceErrorException |  -  |
**481** | InvalidProductCodeException |  -  |
**482** | InvalidUsageDimensionException |  -  |
**483** | InvalidTagException |  -  |
**484** | InvalidUsageAllocationsException |  -  |
**485** | InvalidCustomerIdentifierException |  -  |
**486** | TimestampOutOfBoundsException |  -  |
**487** | ThrottlingException |  -  |
**488** | DisabledApiException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **meter_usage**
> MeterUsageResult meter_usage(x_amz_target, meter_usage_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID.</p> <p> <code>MeterUsage</code> is authenticated on the buyer's AWS account using credentials from the EC2 instance, ECS task, or EKS pod.</p> <p> <code>MeterUsage</code> can optionally include multiple usage allocations, to provide customers with usage data split into buckets by tags that you define (or allow the customer to define).</p> <p>Usage records are expected to be submitted as quickly as possible after the event that is being recorded, and are not accepted more than 6 hours after the event.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.meter_usage_request import MeterUsageRequest
from openapi_client.models.meter_usage_result import MeterUsageResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://metering.marketplace.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://metering.marketplace.us-east-1.amazonaws.com"
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
    meter_usage_request = openapi_client.MeterUsageRequest() # MeterUsageRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.meter_usage(x_amz_target, meter_usage_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->meter_usage:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->meter_usage: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **meter_usage_request** | [**MeterUsageRequest**](MeterUsageRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**MeterUsageResult**](MeterUsageResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InternalServiceErrorException |  -  |
**481** | InvalidProductCodeException |  -  |
**482** | InvalidUsageDimensionException |  -  |
**483** | InvalidTagException |  -  |
**484** | InvalidUsageAllocationsException |  -  |
**485** | InvalidEndpointRegionException |  -  |
**486** | TimestampOutOfBoundsException |  -  |
**487** | DuplicateRequestException |  -  |
**488** | ThrottlingException |  -  |
**489** | CustomerNotEntitledException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **register_usage**
> RegisterUsageResult register_usage(x_amz_target, register_usage_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the <code>RegisterUsage</code> operation for software entitlement and metering. Free and BYOL products for Amazon ECS or Amazon EKS aren't required to call <code>RegisterUsage</code>, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of <code>RegisterUsage</code>. <code>RegisterUsage</code> performs two primary functions: metering and entitlement.</p> <ul> <li> <p> <i>Entitlement</i>: <code>RegisterUsage</code> allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with <code>RegisterUsage</code> is only required to guard against unauthorized use at container startup, as such a <code>CustomerNotSubscribedException</code> or <code>PlatformNotSupportedException</code> will only be thrown on the initial call to <code>RegisterUsage</code>. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) or Amazon EKS pod will not throw a <code>CustomerNotSubscribedException</code>, even if the customer unsubscribes while the Amazon ECS task or Amazon EKS pod is still running.</p> </li> <li> <p> <i>Metering</i>: <code>RegisterUsage</code> meters software use per ECS task, per hour, or per pod for Amazon EKS with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node Amazon ECS or Amazon EKS cluster and a service configured as a Daemon Set, then Amazon ECS or Amazon EKS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call <code>RegisterUsage</code> once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks and Amazon EKS pods, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.</p> </li> </ul>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.register_usage_request import RegisterUsageRequest
from openapi_client.models.register_usage_result import RegisterUsageResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://metering.marketplace.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://metering.marketplace.us-east-1.amazonaws.com"
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
    register_usage_request = openapi_client.RegisterUsageRequest() # RegisterUsageRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.register_usage(x_amz_target, register_usage_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->register_usage:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->register_usage: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **register_usage_request** | [**RegisterUsageRequest**](RegisterUsageRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**RegisterUsageResult**](RegisterUsageResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidProductCodeException |  -  |
**481** | InvalidRegionException |  -  |
**482** | InvalidPublicKeyVersionException |  -  |
**483** | PlatformNotSupportedException |  -  |
**484** | CustomerNotEntitledException |  -  |
**485** | ThrottlingException |  -  |
**486** | InternalServiceErrorException |  -  |
**487** | DisabledApiException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resolve_customer**
> ResolveCustomerResult resolve_customer(x_amz_target, resolve_customer_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p> <code>ResolveCustomer</code> is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a <code>CustomerIdentifier</code> along with the <code>CustomerAWSAccountId</code> and <code>ProductCode</code>.</p> <note> <p>The API needs to called from the seller account id used to publish the SaaS application to successfully resolve the token.</p> <p>For an example of using <code>ResolveCustomer</code>, see <a href=\"https://docs.aws.amazon.com/marketplace/latest/userguide/saas-code-examples.html#saas-resolvecustomer-example\"> ResolveCustomer code example</a> in the <i>AWS Marketplace Seller Guide</i>.</p> </note>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.resolve_customer_request import ResolveCustomerRequest
from openapi_client.models.resolve_customer_result import ResolveCustomerResult
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://metering.marketplace.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://metering.marketplace.us-east-1.amazonaws.com"
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
    resolve_customer_request = openapi_client.ResolveCustomerRequest() # ResolveCustomerRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.resolve_customer(x_amz_target, resolve_customer_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->resolve_customer:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->resolve_customer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **resolve_customer_request** | [**ResolveCustomerRequest**](ResolveCustomerRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**ResolveCustomerResult**](ResolveCustomerResult.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidTokenException |  -  |
**481** | ExpiredTokenException |  -  |
**482** | ThrottlingException |  -  |
**483** | InternalServiceErrorException |  -  |
**484** | DisabledApiException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

