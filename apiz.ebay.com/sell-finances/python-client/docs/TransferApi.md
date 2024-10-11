# openapi_client.TransferApi

All URIs are relative to *https://apiz.ebay.com/sell/finances/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_transfer**](TransferApi.md#get_transfer) | **GET** /transfer/{transfer_Id} | 


# **get_transfer**
> Transfer get_transfer(transfer_id, x_ebay_c_marketplace_id=x_ebay_c_marketplace_id)



<div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span> Due to EU &amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all <b>Finances API</b> methods. Please refer to <a href=\"/develop/guides/digital-signatures-for-apis \" target=\"_blank\">Digital Signatures for APIs</a> to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.</p></div><br>This method retrieves detailed information regarding a <code>TRANSFER</code> transaction type. A <code>TRANSFER</code> is a  monetary transaction type that involves a seller transferring money to eBay for reimbursement of one or more charges. For example, when a seller reimburses eBay for a buyer refund.<br><br>If an ID is passed into the URI that is an identifier for another transaction type, this call will return an http status code of <code>404 Not found</code>.

### Example

* OAuth Authentication (api_auth):

```python
import openapi_client
from openapi_client.models.transfer import Transfer
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://apiz.ebay.com/sell/finances/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://apiz.ebay.com/sell/finances/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TransferApi(api_client)
    transfer_id = 'transfer_id_example' # str | The unique identifier of the <code>TRANSFER</code> transaction type you wish to retrieve.
    x_ebay_c_marketplace_id = 'x_ebay_c_marketplace_id_example' # str | This header identifies the seller's eBay marketplace. It is required for all marketplaces outside of the US. See <a href=\"/api-docs/static/rest-request-components.html#marketpl \" target=\"_blank \">HTTP request headers</a> for the marketplace ID values. (optional)

    try:
        api_response = api_instance.get_transfer(transfer_id, x_ebay_c_marketplace_id=x_ebay_c_marketplace_id)
        print("The response of TransferApi->get_transfer:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransferApi->get_transfer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_id** | **str**| The unique identifier of the &lt;code&gt;TRANSFER&lt;/code&gt; transaction type you wish to retrieve. | 
 **x_ebay_c_marketplace_id** | **str**| This header identifies the seller&#39;s eBay marketplace. It is required for all marketplaces outside of the US. See &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl \&quot; target&#x3D;\&quot;_blank \&quot;&gt;HTTP request headers&lt;/a&gt; for the marketplace ID values. | [optional] 

### Return type

[**Transfer**](Transfer.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad Request |  -  |
**404** | Not found. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

