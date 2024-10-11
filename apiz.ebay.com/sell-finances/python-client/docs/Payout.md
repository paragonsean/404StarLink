# Payout

This type is used to express the details of one seller payout that is returned with the <strong>getPayout</strong> or <strong>getPayouts</strong> methods.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | [optional] 
**bank_reference** | **str** | This field contains additional information provided by the bank and passed on by the payment processor; e.g., the manner in which the transaction will appear on the seller&#39;s bank statement. The field is returned only when provided by the bank and processor. | [optional] 
**last_attempted_payout_date** | **str** | This timestamp indicates the date/time when eBay last attempted to process a seller payout but it failed. This field is only returned if a seller payout fails, and the &lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;. A seller can filter on the &lt;b&gt;lastAttemptedPayoutDate&lt;/b&gt; in a &lt;b&gt;getPayouts&lt;/b&gt; request. | [optional] 
**payout_date** | **str** | This timestamp indicates when the seller payout began processing. The following format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;. This field is still returned even if the payout was pending but failed (&lt;strong&gt;payoutStatus&lt;/strong&gt; value shows &lt;code&gt;RETRYABLE_FAILED&lt;/code&gt; or &lt;code&gt;TERMINAL_FAILED&lt;/code&gt;). | [optional] 
**payout_id** | **str** | The unique identifier of the seller payout. This identifier is generated once eBay begins processing the payout to the seller&#39;s bank account. | [optional] 
**payout_instrument** | [**PayoutInstrument**](PayoutInstrument.md) |  | [optional] 
**payout_memo** | **str** | This field contains information provided by upstream components, based on internal and external commitments. A typical message would contain the expected arrival time of the payout. | [optional] 
**payout_status** | **str** | This enumeration value indicates the current status of the seller payout. For a successful payout, the value returned will be &lt;code&gt;SUCCEEDED&lt;/code&gt;. See the &lt;strong&gt;PayoutStatusEnum&lt;/strong&gt; type for more details on each payout status value. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/finances/types/pay:PayoutStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; | [optional] 
**payout_status_description** | **str** | This field provides more details about the current status of payout. The description returned here will correspond with enumeration value returned in the &lt;strong&gt;payoutStatus&lt;/strong&gt; field. The following shows what description text might appear based on the different &lt;strong&gt;payoutStatus&lt;/strong&gt; values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;INITIATED&lt;/code&gt;: &lt;em&gt;Preparing to send&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;SUCCEEDED&lt;/code&gt;: &lt;em&gt;Funds sent&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;REVERSED&lt;/code&gt;: &lt;em&gt;Waiting to retry : Money rejected by seller&#39;s bank&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;RETRYABLE_FAILED&lt;/code&gt;: &lt;em&gt;Waiting to retry&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;TERMINAL_FAILED&lt;/code&gt;: &lt;em&gt;Payout failed&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 
**total_amount** | [**Amount**](Amount.md) |  | [optional] 
**total_fee** | [**Amount**](Amount.md) |  | [optional] 
**transaction_count** | **int** | This integer value indicates the number of monetary transactions (all orders, refunds, and credits, etc.) that have occurred with the corresponding payout. Its value should always be at least &lt;code&gt;1&lt;/code&gt;, since there is at least one order per seller payout. | [optional] 

## Example

```python
from openapi_client.models.payout import Payout

# TODO update the JSON string below
json = "{}"
# create an instance of Payout from a JSON string
payout_instance = Payout.from_json(json)
# print the JSON string representation of the object
print(Payout.to_json())

# convert the object into a dict
payout_dict = payout_instance.to_dict()
# create an instance of Payout from a dict
payout_from_dict = Payout.from_dict(payout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


