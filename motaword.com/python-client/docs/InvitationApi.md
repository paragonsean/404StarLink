# openapi_client.InvitationApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_invitation_vendors**](InvitationApi.md#get_invitation_vendors) | **POST** /invitation/vendors | Get vendor list for compiled invitation needs


# **get_invitation_vendors**
> VendorInvitationList get_invitation_vendors(file_needs_vendor=file_needs_vendor)

Get vendor list for compiled invitation needs

Get vendor list for compiled invitation needs

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.file_needs_vendor import FileNeedsVendor
from openapi_client.models.vendor_invitation_list import VendorInvitationList
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
    api_instance = openapi_client.InvitationApi(api_client)
    file_needs_vendor = [openapi_client.FileNeedsVendor()] # List[FileNeedsVendor] |  (optional)

    try:
        # Get vendor list for compiled invitation needs
        api_response = api_instance.get_invitation_vendors(file_needs_vendor=file_needs_vendor)
        print("The response of InvitationApi->get_invitation_vendors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InvitationApi->get_invitation_vendors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_needs_vendor** | [**List[FileNeedsVendor]**](FileNeedsVendor.md)|  | [optional] 

### Return type

[**VendorInvitationList**](VendorInvitationList.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invitation need grouped by vendor |  -  |
**400** | FileTooLarge FileTooSmall NoFileUploaded |  -  |
**405** | UnsupportedGlossaryFormat |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

