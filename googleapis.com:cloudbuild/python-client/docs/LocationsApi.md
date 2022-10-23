# openapi_client.LocationsApi

All URIs are relative to *https://cloudbuild.googleapis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudbuild_locations_regional_webhook**](LocationsApi.md#cloudbuild_locations_regional_webhook) | **POST** /v1/{location}/regionalWebhook | 


# **cloudbuild_locations_regional_webhook**
> object cloudbuild_locations_regional_webhook(location, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, webhook_key=webhook_key, http_body=http_body)



ReceiveRegionalWebhook is called when the API receives a regional GitHub webhook.

### Example


```python
import openapi_client
from openapi_client.models.http_body import HttpBody
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://cloudbuild.googleapis.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://cloudbuild.googleapis.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LocationsApi(api_client)
    location = 'location_example' # str | Required. The location where the webhook should be sent.
    xgafv = 'xgafv_example' # str | V1 error format. (optional)
    access_token = 'access_token_example' # str | OAuth access token. (optional)
    alt = 'alt_example' # str | Data format for response. (optional)
    param_callback = 'param_callback_example' # str | JSONP (optional)
    fields = 'fields_example' # str | Selector specifying which fields to include in a partial response. (optional)
    key = 'key_example' # str | API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. (optional)
    oauth_token = 'oauth_token_example' # str | OAuth 2.0 token for the current user. (optional)
    pretty_print = True # bool | Returns response with indentations and line breaks. (optional)
    quota_user = 'quota_user_example' # str | Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. (optional)
    upload_protocol = 'upload_protocol_example' # str | Upload protocol for media (e.g. \"raw\", \"multipart\"). (optional)
    upload_type = 'upload_type_example' # str | Legacy upload protocol for media (e.g. \"media\", \"multipart\"). (optional)
    webhook_key = 'webhook_key_example' # str | For GitHub Enterprise webhooks, this key is used to associate the webhook request with the GitHubEnterpriseConfig to use for validation. (optional)
    http_body = openapi_client.HttpBody() # HttpBody |  (optional)

    try:
        api_response = api_instance.cloudbuild_locations_regional_webhook(location, xgafv=xgafv, access_token=access_token, alt=alt, param_callback=param_callback, fields=fields, key=key, oauth_token=oauth_token, pretty_print=pretty_print, quota_user=quota_user, upload_protocol=upload_protocol, upload_type=upload_type, webhook_key=webhook_key, http_body=http_body)
        print("The response of LocationsApi->cloudbuild_locations_regional_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LocationsApi->cloudbuild_locations_regional_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | **str**| Required. The location where the webhook should be sent. | 
 **xgafv** | **str**| V1 error format. | [optional] 
 **access_token** | **str**| OAuth access token. | [optional] 
 **alt** | **str**| Data format for response. | [optional] 
 **param_callback** | **str**| JSONP | [optional] 
 **fields** | **str**| Selector specifying which fields to include in a partial response. | [optional] 
 **key** | **str**| API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. | [optional] 
 **oauth_token** | **str**| OAuth 2.0 token for the current user. | [optional] 
 **pretty_print** | **bool**| Returns response with indentations and line breaks. | [optional] 
 **quota_user** | **str**| Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. | [optional] 
 **upload_protocol** | **str**| Upload protocol for media (e.g. \&quot;raw\&quot;, \&quot;multipart\&quot;). | [optional] 
 **upload_type** | **str**| Legacy upload protocol for media (e.g. \&quot;media\&quot;, \&quot;multipart\&quot;). | [optional] 
 **webhook_key** | **str**| For GitHub Enterprise webhooks, this key is used to associate the webhook request with the GitHubEnterpriseConfig to use for validation. | [optional] 
 **http_body** | [**HttpBody**](HttpBody.md)|  | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

