# openapi_client.PayoutApi

All URIs are relative to *https://apiz.ebay.com/sell/finances/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_payout**](PayoutApi.md#get_payout) | **GET** /payout/{payout_Id} | 
[**get_payout_summary**](PayoutApi.md#get_payout_summary) | **GET** /payout_summary | 
[**get_payouts**](PayoutApi.md#get_payouts) | **GET** /payout | 


# **get_payout**
> Payout get_payout(payout_id, x_ebay_c_marketplace_id=x_ebay_c_marketplace_id)



<div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span> Due to EU &amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all <b>Finances API</b> methods. Please refer to <a href=\"/develop/guides/digital-signatures-for-apis \" target=\"_blank\">Digital Signatures for APIs</a> to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.</p></div><br>This method retrieves details on a specific seller payout. The unique identfier of the payout is passed in as a path parameter at the end of the call URI. <br><br>The <b>getPayouts</b> method can be used to retrieve the unique identifier of a payout, or the user can check Seller Hub.

### Example

* OAuth Authentication (api_auth):

```python
import openapi_client
from openapi_client.models.payout import Payout
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
    api_instance = openapi_client.PayoutApi(api_client)
    payout_id = 'payout_id_example' # str | The unique identfier of the payout is passed in as a path parameter at the end of the call URI. <br><br>The <b>getPayouts</b> method can be used to retrieve the unique identifier of a payout, or the user can check Seller Hub to get the payout ID.
    x_ebay_c_marketplace_id = 'x_ebay_c_marketplace_id_example' # str | This header identifies the seller's eBay marketplace. It is required for all marketplaces outside of the US. See <a href=\"/api-docs/static/rest-request-components.html#marketpl \" target=\"_blank \">HTTP request headers</a> for the marketplace ID values. (optional)

    try:
        api_response = api_instance.get_payout(payout_id, x_ebay_c_marketplace_id=x_ebay_c_marketplace_id)
        print("The response of PayoutApi->get_payout:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PayoutApi->get_payout: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payout_id** | **str**| The unique identfier of the payout is passed in as a path parameter at the end of the call URI. &lt;br&gt;&lt;br&gt;The &lt;b&gt;getPayouts&lt;/b&gt; method can be used to retrieve the unique identifier of a payout, or the user can check Seller Hub to get the payout ID. | 
 **x_ebay_c_marketplace_id** | **str**| This header identifies the seller&#39;s eBay marketplace. It is required for all marketplaces outside of the US. See &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl \&quot; target&#x3D;\&quot;_blank \&quot;&gt;HTTP request headers&lt;/a&gt; for the marketplace ID values. | [optional] 

### Return type

[**Payout**](Payout.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_payout_summary**
> PayoutSummaryResponse get_payout_summary(x_ebay_c_marketplace_id=x_ebay_c_marketplace_id, filter=filter)



<div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span> Due to EU &amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all <b>Finances API</b> methods. Please refer to <a href=\"/develop/guides/digital-signatures-for-apis \" target=\"_blank\">Digital Signatures for APIs</a> to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.</p></div><br>This method is used to retrieve cumulative values for payouts in a particular state, or all states. The metadata in the response includes total payouts, the total number of monetary transactions (sales, refunds, credits) associated with those payouts, and the total dollar value of all payouts.<br><br>If the <b>filter</b> query parameter is used to filter by payout status, only one payout status value may be used. If the <b>filter</b> query parameter is not used to filter by a specific payout status, cumulative values for payouts in all states are returned.<br><br>The user can also use the <b>filter</b> query parameter to specify a date range, and then only payouts that were processed within that date range are considered.

### Example

* OAuth Authentication (api_auth):

```python
import openapi_client
from openapi_client.models.payout_summary_response import PayoutSummaryResponse
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
    api_instance = openapi_client.PayoutApi(api_client)
    x_ebay_c_marketplace_id = 'x_ebay_c_marketplace_id_example' # str | This header identifies the seller's eBay marketplace. It is required for all marketplaces outside of the US. See <a href=\"/api-docs/static/rest-request-components.html#marketpl \" target=\"_blank \">HTTP request headers</a> for the marketplace ID values. (optional)
    filter = 'filter_example' # str | The two filter types that can be used here are discussed below. One or both of these filter types can be used. If none of these filters are used, the data returned in the response will reflect payouts, in all states, processed within the last 90 days. <ul><li><b>payoutDate</b>: consider payouts processed within a specific range of dates. The date format to use is <code>YYYY-MM-DDTHH:MM:SS.SSSZ</code>. Below is the proper syntax to use if filtering by a date range: <br><br><code>https://apiz.ebay.com/sell/finances/v1/payout_summary?filter=payoutDate:[2018-12-17T00:00:01.000Z..2018-12-24T00:00:01.000Z]</code><br><br>Alternatively, the user could omit the ending date, and the date range would include the starting date and up to 90 days past that date, or the current date if the starting date is less than 90 days in the past.</li> <li><b>payoutStatus</b>: consider only the payouts in a particular state. Only one payout state can be specified with this filter. The supported <b>payoutStatus</b> values are as follows:<ul><li><code>INITIATED</code>: search for payouts that have been initiated but not processed.</li><li><code>SUCCEEDED</code>: consider only successful payouts.</li><li><code>RETRYABLE_FAILED</code>: consider only payouts that failed, but ones which will be tried again.</li><li><code>TERMINAL_FAILED</code>: consider only payouts that failed, and ones that will not be tried again.</li><li> <code>REVERSED</code>: consider only payouts that were reversed. </li></ul>Below is the proper syntax to use if filtering by payout status: <br><br><code>https://apiz.ebay.com/sell/finances/v1/payout_summary?filter=payoutStatus:{SUCCEEDED}</code></ul><br>If both the <b>payoutDate</b> and <b>payoutStatus</b> filters are used, only the payouts that satisfy both criteria are considered in the results. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField (optional)

    try:
        api_response = api_instance.get_payout_summary(x_ebay_c_marketplace_id=x_ebay_c_marketplace_id, filter=filter)
        print("The response of PayoutApi->get_payout_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PayoutApi->get_payout_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_ebay_c_marketplace_id** | **str**| This header identifies the seller&#39;s eBay marketplace. It is required for all marketplaces outside of the US. See &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl \&quot; target&#x3D;\&quot;_blank \&quot;&gt;HTTP request headers&lt;/a&gt; for the marketplace ID values. | [optional] 
 **filter** | **str**| The two filter types that can be used here are discussed below. One or both of these filter types can be used. If none of these filters are used, the data returned in the response will reflect payouts, in all states, processed within the last 90 days. &lt;ul&gt;&lt;li&gt;&lt;b&gt;payoutDate&lt;/b&gt;: consider payouts processed within a specific range of dates. The date format to use is &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. Below is the proper syntax to use if filtering by a date range: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout_summary?filter&#x3D;payoutDate:[2018-12-17T00:00:01.000Z..2018-12-24T00:00:01.000Z]&lt;/code&gt;&lt;br&gt;&lt;br&gt;Alternatively, the user could omit the ending date, and the date range would include the starting date and up to 90 days past that date, or the current date if the starting date is less than 90 days in the past.&lt;/li&gt; &lt;li&gt;&lt;b&gt;payoutStatus&lt;/b&gt;: consider only the payouts in a particular state. Only one payout state can be specified with this filter. The supported &lt;b&gt;payoutStatus&lt;/b&gt; values are as follows:&lt;ul&gt;&lt;li&gt;&lt;code&gt;INITIATED&lt;/code&gt;: search for payouts that have been initiated but not processed.&lt;/li&gt;&lt;li&gt;&lt;code&gt;SUCCEEDED&lt;/code&gt;: consider only successful payouts.&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;: consider only payouts that failed, but ones which will be tried again.&lt;/li&gt;&lt;li&gt;&lt;code&gt;TERMINAL_FAILED&lt;/code&gt;: consider only payouts that failed, and ones that will not be tried again.&lt;/li&gt;&lt;li&gt; &lt;code&gt;REVERSED&lt;/code&gt;: consider only payouts that were reversed. &lt;/li&gt;&lt;/ul&gt;Below is the proper syntax to use if filtering by payout status: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout_summary?filter&#x3D;payoutStatus:{SUCCEEDED}&lt;/code&gt;&lt;/ul&gt;&lt;br&gt;If both the &lt;b&gt;payoutDate&lt;/b&gt; and &lt;b&gt;payoutStatus&lt;/b&gt; filters are used, only the payouts that satisfy both criteria are considered in the results. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField | [optional] 

### Return type

[**PayoutSummaryResponse**](PayoutSummaryResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_payouts**
> Payouts get_payouts(x_ebay_c_marketplace_id=x_ebay_c_marketplace_id, filter=filter, limit=limit, offset=offset, sort=sort)



<div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span> Due to EU &amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including all <b>Finances API</b> methods. Please refer to <a href=\"/develop/guides/digital-signatures-for-apis \" target=\"_blank\">Digital Signatures for APIs</a> to learn more on the impacted APIs and the process to create signatures to be included in the HTTP payload.</p></div><br>This method is used to retrieve the details of one or more seller payouts. By using the <b>filter</b> query parameter, users can retrieve payouts processed within a specific date range, and/or they can retrieve payouts in a specific state.<br><br>There are also pagination and sort query parameters that allow users to control the payouts that are returned in the response.<br><br>If no payouts match the input criteria, an empty payload is returned.

### Example

* OAuth Authentication (api_auth):

```python
import openapi_client
from openapi_client.models.payouts import Payouts
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
    api_instance = openapi_client.PayoutApi(api_client)
    x_ebay_c_marketplace_id = 'x_ebay_c_marketplace_id_example' # str | This header identifies the seller's eBay marketplace. It is required for all marketplaces outside of the US. See <a href=\"/api-docs/static/rest-request-components.html#marketpl \" target=\"_blank \">HTTP request headers</a> for the marketplace ID values. (optional)
    filter = 'filter_example' # str | The three filter types that can be used here are discussed below. If none of these filters are used, all recent payouts in all states are returned:<ul><li><b>payoutDate</b>: search for payouts within a specific range of dates. The date format to use is <code>YYYY-MM-DDTHH:MM:SS.SSSZ</code>. Below is the proper syntax to use if filtering by a date range: <br><br><code>https://apiz.ebay.com/sell/finances/v1/payout?filter=payoutDate:[2018-12-17T00:00:01.000Z..2018-12-24T00:00:01.000Z]</code><br><br>Alternatively, the user could omit the ending date, and the date range would include the starting date and up to 90 days past that date, or the current date if the starting date is less than 90 days in the past.</li><li><b>lastAttemptedPayoutDate</b>: search for attempted payouts that failed within a specific range of dates. In order to use this filter, the <b>payoutStatus</b> filter must also be used and its value must be set to <code>RETRYABLE_FAILED</code>. The date format to use is <code>YYYY-MM-DDTHH:MM:SS.SSSZ</code>. The same syntax used for the <b>payoutDate</b> filter is also used for the <b>lastAttemptedPayoutDate</b> filter. <br><br>This filter is only applicable (and will return results) if one or more seller payouts have failed, but are retryable.</li> <li><b>payoutStatus</b>: search for payouts in a particular state. Only one payout state can be specified with this filter. The supported <b>payoutStatus</b> values are as follows:<ul><li><code>INITIATED</code>: search for payouts that have been initiated but not processed.</li><li><code>SUCCEEDED</code>: search for successful payouts.</li><li><code>RETRYABLE_FAILED</code>: search for payouts that failed, but ones which will be tried again. This value must be used if filtering by <b>lastAttemptedPayoutDate</b>. </li><li><code>TERMINAL_FAILED</code>: search for payouts that failed, and ones that will not be tried again.</li><li> <code>REVERSED</code>: search for payouts that were reversed. </li></ul>Below is the proper syntax to use if filtering by payout status: <br><br><code>https://apiz.ebay.com/sell/finances/v1/payout?filter=payoutStatus:{SUCCEEDED}</code></ul><br>If both the <b>payoutDate</b> and <b>payoutStatus</b> filters are used, payouts must satisfy both criteria to be returned. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField (optional)
    limit = 'limit_example' # str | The number of payouts to return per page of the result set. Use this parameter in conjunction with the <b>offset</b> parameter to control the pagination of the output. <br><br> For example, if <b>offset</b> is set to <code>10</code> and <b>limit</b> is set to <code>10</code>, the method retrieves payouts 11 thru 20 from the result set. <br><br> <span class=\"tablenote\"><strong>Note:</strong> This feature employs a zero-based list, where the first payout in the results set has an offset value of <code>0</code>. </span> <br><br> <b>Maximum:</b> <code>200</code> <br> <b>Default:</b> <code>20</code> (optional)
    offset = 'offset_example' # str | This integer value indicates the actual position that the first payout returned on the current page has in the results set. So, if you wanted to view the 11th payout of the result set, you would set the <strong>offset</strong> value in the request to <code>10</code>. <br><br>In the request, you can use the <b>offset</b> parameter in conjunction with the <b>limit</b> parameter to control the pagination of the output. For example, if <b>offset</b> is set to <code>30</code> and <b>limit</b> is set to <code>10</code>, the method retrieves payouts 31 thru 40 from the resulting collection of payouts. <br><br> <span class=\"tablenote\"><strong>Note:</strong> This feature employs a zero-based list, where the first payout in the results set has an offset value of <code>0</code>.</span><br><br><b>Default:</b> <code>0</code> (zero) (optional)
    sort = 'sort_example' # str | By default, payouts or failed payouts that match the input criteria are sorted in descending order according to the payout date/last attempted payout date (i.e., most recent payouts returned first).<br><br>To view payouts in ascending order instead (i.e., oldest payouts/attempted payouts first,) you would include the <b>sort</b> query parameter, and then set the value of its <b>field</b> parameter to <code>payoutDate</code> or <code>lastAttemptedPayoutDate</code> (if searching for failed, retryable payouts). Below is the proper syntax to use if filtering by a payout date range in ascending order:<br><br><code>https://apiz.ebay.com/sell/finances/v1/payout?filter=payoutDate:[2018-12-17T00:00:01.000Z..2018-12-24T00:00:01.000Z]&sort=payoutDate</code><br><br>Payouts can only be sorted according to payout date, and can not be sorted by payout status. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:SortField (optional)

    try:
        api_response = api_instance.get_payouts(x_ebay_c_marketplace_id=x_ebay_c_marketplace_id, filter=filter, limit=limit, offset=offset, sort=sort)
        print("The response of PayoutApi->get_payouts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PayoutApi->get_payouts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_ebay_c_marketplace_id** | **str**| This header identifies the seller&#39;s eBay marketplace. It is required for all marketplaces outside of the US. See &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#marketpl \&quot; target&#x3D;\&quot;_blank \&quot;&gt;HTTP request headers&lt;/a&gt; for the marketplace ID values. | [optional] 
 **filter** | **str**| The three filter types that can be used here are discussed below. If none of these filters are used, all recent payouts in all states are returned:&lt;ul&gt;&lt;li&gt;&lt;b&gt;payoutDate&lt;/b&gt;: search for payouts within a specific range of dates. The date format to use is &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. Below is the proper syntax to use if filtering by a date range: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout?filter&#x3D;payoutDate:[2018-12-17T00:00:01.000Z..2018-12-24T00:00:01.000Z]&lt;/code&gt;&lt;br&gt;&lt;br&gt;Alternatively, the user could omit the ending date, and the date range would include the starting date and up to 90 days past that date, or the current date if the starting date is less than 90 days in the past.&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt;: search for attempted payouts that failed within a specific range of dates. In order to use this filter, the &lt;b&gt;payoutStatus&lt;/b&gt; filter must also be used and its value must be set to &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;. The date format to use is &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. The same syntax used for the &lt;b&gt;payoutDate&lt;/b&gt; filter is also used for the &lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt; filter. &lt;br&gt;&lt;br&gt;This filter is only applicable (and will return results) if one or more seller payouts have failed, but are retryable.&lt;/li&gt; &lt;li&gt;&lt;b&gt;payoutStatus&lt;/b&gt;: search for payouts in a particular state. Only one payout state can be specified with this filter. The supported &lt;b&gt;payoutStatus&lt;/b&gt; values are as follows:&lt;ul&gt;&lt;li&gt;&lt;code&gt;INITIATED&lt;/code&gt;: search for payouts that have been initiated but not processed.&lt;/li&gt;&lt;li&gt;&lt;code&gt;SUCCEEDED&lt;/code&gt;: search for successful payouts.&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;: search for payouts that failed, but ones which will be tried again. This value must be used if filtering by &lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt;. &lt;/li&gt;&lt;li&gt;&lt;code&gt;TERMINAL_FAILED&lt;/code&gt;: search for payouts that failed, and ones that will not be tried again.&lt;/li&gt;&lt;li&gt; &lt;code&gt;REVERSED&lt;/code&gt;: search for payouts that were reversed. &lt;/li&gt;&lt;/ul&gt;Below is the proper syntax to use if filtering by payout status: &lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout?filter&#x3D;payoutStatus:{SUCCEEDED}&lt;/code&gt;&lt;/ul&gt;&lt;br&gt;If both the &lt;b&gt;payoutDate&lt;/b&gt; and &lt;b&gt;payoutStatus&lt;/b&gt; filters are used, payouts must satisfy both criteria to be returned. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:FilterField | [optional] 
 **limit** | **str**| The number of payouts to return per page of the result set. Use this parameter in conjunction with the &lt;b&gt;offset&lt;/b&gt; parameter to control the pagination of the output. &lt;br&gt;&lt;br&gt; For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method retrieves payouts 11 thru 20 from the result set. &lt;br&gt;&lt;br&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first payout in the results set has an offset value of &lt;code&gt;0&lt;/code&gt;. &lt;/span&gt; &lt;br&gt;&lt;br&gt; &lt;b&gt;Maximum:&lt;/b&gt; &lt;code&gt;200&lt;/code&gt; &lt;br&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt; | [optional] 
 **offset** | **str**| This integer value indicates the actual position that the first payout returned on the current page has in the results set. So, if you wanted to view the 11th payout of the result set, you would set the &lt;strong&gt;offset&lt;/strong&gt; value in the request to &lt;code&gt;10&lt;/code&gt;. &lt;br&gt;&lt;br&gt;In the request, you can use the &lt;b&gt;offset&lt;/b&gt; parameter in conjunction with the &lt;b&gt;limit&lt;/b&gt; parameter to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method retrieves payouts 31 thru 40 from the resulting collection of payouts. &lt;br&gt;&lt;br&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first payout in the results set has an offset value of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero) | [optional] 
 **sort** | **str**| By default, payouts or failed payouts that match the input criteria are sorted in descending order according to the payout date/last attempted payout date (i.e., most recent payouts returned first).&lt;br&gt;&lt;br&gt;To view payouts in ascending order instead (i.e., oldest payouts/attempted payouts first,) you would include the &lt;b&gt;sort&lt;/b&gt; query parameter, and then set the value of its &lt;b&gt;field&lt;/b&gt; parameter to &lt;code&gt;payoutDate&lt;/code&gt; or &lt;code&gt;lastAttemptedPayoutDate&lt;/code&gt; (if searching for failed, retryable payouts). Below is the proper syntax to use if filtering by a payout date range in ascending order:&lt;br&gt;&lt;br&gt;&lt;code&gt;https://apiz.ebay.com/sell/finances/v1/payout?filter&#x3D;payoutDate:[2018-12-17T00:00:01.000Z..2018-12-24T00:00:01.000Z]&amp;sort&#x3D;payoutDate&lt;/code&gt;&lt;br&gt;&lt;br&gt;Payouts can only be sorted according to payout date, and can not be sorted by payout status. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/finances/types/cos:SortField | [optional] 

### Return type

[**Payouts**](Payouts.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

