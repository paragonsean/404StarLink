# openapi_client.BillingApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billing_get_github_advanced_security_billing_ghe**](BillingApi.md#billing_get_github_advanced_security_billing_ghe) | **GET** /enterprises/{enterprise}/settings/billing/advanced-security | Get GitHub Advanced Security active committers for an enterprise
[**billing_get_github_advanced_security_billing_org**](BillingApi.md#billing_get_github_advanced_security_billing_org) | **GET** /orgs/{org}/settings/billing/advanced-security | Get GitHub Advanced Security active committers for an organization


# **billing_get_github_advanced_security_billing_ghe**
> AdvancedSecurityActiveCommitters billing_get_github_advanced_security_billing_ghe(enterprise, per_page=per_page, page=page)

Get GitHub Advanced Security active committers for an enterprise

Gets the GitHub Advanced Security active committers for an enterprise per repository.  Each distinct user login across all repositories is counted as a single Advanced Security seat, so the `total_advanced_security_committers` is not the sum of active_users for each repository.  The total number of repositories with committer information is tracked by the `total_count` field.

### Example


```python
import openapi_client
from openapi_client.models.advanced_security_active_committers import AdvancedSecurityActiveCommitters
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BillingApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # Get GitHub Advanced Security active committers for an enterprise
        api_response = api_instance.billing_get_github_advanced_security_billing_ghe(enterprise, per_page=per_page, page=page)
        print("The response of BillingApi->billing_get_github_advanced_security_billing_ghe:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BillingApi->billing_get_github_advanced_security_billing_ghe: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**AdvancedSecurityActiveCommitters**](AdvancedSecurityActiveCommitters.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billing_get_github_advanced_security_billing_org**
> AdvancedSecurityActiveCommitters billing_get_github_advanced_security_billing_org(org, per_page=per_page, page=page)

Get GitHub Advanced Security active committers for an organization

Gets the GitHub Advanced Security active committers for an organization per repository.  Each distinct user login across all repositories is counted as a single Advanced Security seat, so the `total_advanced_security_committers` is not the sum of advanced_security_committers for each repository.  If this organization defers to an enterprise for billing, the `total_advanced_security_committers` returned from the organization API may include some users that are in more than one organization, so they will only consume a single Advanced Security seat at the enterprise level.  The total number of repositories with committer information is tracked by the `total_count` field.

### Example


```python
import openapi_client
from openapi_client.models.advanced_security_active_committers import AdvancedSecurityActiveCommitters
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BillingApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # Get GitHub Advanced Security active committers for an organization
        api_response = api_instance.billing_get_github_advanced_security_billing_org(org, per_page=per_page, page=page)
        print("The response of BillingApi->billing_get_github_advanced_security_billing_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BillingApi->billing_get_github_advanced_security_billing_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**AdvancedSecurityActiveCommitters**](AdvancedSecurityActiveCommitters.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Response if GitHub Advanced Security is not enabled for this repository |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

