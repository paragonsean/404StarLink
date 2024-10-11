# Transaction

This type is used to express the details of one of the following monetary transactions: a buyer's payment for an order, a refund to the buyer for a returned item or cancelled order, or a credit issued by eBay to the seller's account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount**](Amount.md) |  | [optional] 
**booking_entry** | **str** | The enumeration value returned in this field indicates if the monetary transaction amount is a (&lt;code&gt;CREDIT&lt;/code&gt;) or a (&lt;code&gt;DEBIT&lt;/code&gt;) to the seller&#39;s account. Typically, the &lt;code&gt;SALE&lt;/code&gt; and &lt;code&gt;CREDIT&lt;/code&gt; transaction types are credits to the seller&#39;s account, and the &lt;code&gt;REFUND&lt;/code&gt;, &lt;code&gt;DISPUTE&lt;/code&gt;, &lt;code&gt;SHIPPING_LABEL&lt;/code&gt;, and &lt;code&gt;TRANSFER&lt;/code&gt; transaction types are debits to the seller&#39;s account. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/finances/types/pay:BookingEntryEnum&#39;&gt;eBay API documentation&lt;/a&gt; | [optional] 
**buyer** | [**Buyer**](Buyer.md) |  | [optional] 
**e_bay_collected_tax_amount** | [**Amount**](Amount.md) |  | [optional] 
**fee_jurisdiction** | [**FeeJurisdiction**](FeeJurisdiction.md) |  | [optional] 
**fee_type** | **str** | The type of fee. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/finances/types/api:FeeTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; | [optional] 
**order_id** | **str** | The unique identifier of the eBay order associated with the monetary transaction. | [optional] 
**order_line_items** | [**List[OrderLineItem]**](OrderLineItem.md) | This array shows the fees that are deducted from a seller payout for each line item in an order.&lt;br&gt;&lt;br&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; In some cases, a transaction fee might be returned asynchronously from the associated order. In such cases, you can determine the order to which the fee applies by examining the referenceID value of the fee, which should match the ID of the order. | [optional] 
**payments_entity** | **str** | This string value indicates the entity that is processing  the payment. | [optional] 
**payout_id** | **str** | The unique identifier of the seller payout associated with the monetary transaction. This identifier is generated once eBay begins processing the payout for the corresponding order. This field will not be returned if eBay has not yet begun processing the payout for an order. | [optional] 
**references** | [**List[Reference]**](Reference.md) | This field contains reference information for the transaction fee. This includes an ID and the type of ID provided (such as item ID). | [optional] 
**sales_record_reference** | **str** | The Sales Record Number associated with a sales order. Sales Record Numbers are Selling Manager/Selling Manager Pro identifiers that are created at order checkout.&lt;br&gt;&lt;br&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For all orders originating after February 1, 2020, a value of &lt;code&gt;0&lt;/code&gt; will be returned in this field. The Sales Record Number field has also been removed from Seller Hub. Instead of &lt;strong&gt;salesRecordReference&lt;/strong&gt;, depend on &lt;strong&gt;orderId&lt;/strong&gt; instead as the identifier of the order. The &lt;strong&gt;salesRecordReference&lt;/strong&gt; field has been scheduled for deprecation, and a date for when this field will no longer be returned at all will be announced soon.&lt;/span&gt; | [optional] 
**total_fee_amount** | [**Amount**](Amount.md) |  | [optional] 
**total_fee_basis_amount** | [**Amount**](Amount.md) |  | [optional] 
**transaction_date** | **str** | This timestamp indicates when the monetary transaction (order purchase, buyer refund, seller credit) occurred. The following (UTC) format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;. | [optional] 
**transaction_id** | **str** | The unique identifier of the monetary transaction. A monetary transaction can be a sales order, an order refund to the buyer, a credit to the seller&#39;s account, a debit to the seller for the purchase of a shipping label, or a transaction where eBay recouped money from the seller if the seller lost a buyer-initiated payment dispute. | [optional] 
**transaction_memo** | **str** | This field provides more details on shipping label transactions and transactions where the funds are being held by eBay. For shipping label transactions, the &lt;b&gt;transactionMemo&lt;/b&gt; gives details about a purchase, a refund, or a price adjustment to the cost of the shipping label. For on-hold transactions, the &lt;b&gt;transactionMemo&lt;/b&gt; provides information on the reason for the hold or when the hold will be released (e.g., \&quot;Funds on hold. Estimated release on Jun 1\&quot;).&lt;br&gt;&lt;br&gt;This field is only returned if applicable/available. | [optional] 
**transaction_status** | **str** | This enumeration value indicates the current status of the seller payout associated with the monetary transaction. See the &lt;code&gt;TransactionStatusEnum&lt;/code&gt; type for more information on the different states. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionStatusEnum&#39;&gt;eBay API documentation&lt;/a&gt; | [optional] 
**transaction_type** | **str** | This enumeration value indicates the type of monetary transaction. Examples of monetary transactions include a buyer&#39;s payment for an order, a refund to the buyer for a returned item or cancelled order, or a credit issued by eBay to the seller&#39;s account. For a complete list of monetary transaction types within the &lt;strong&gt;Finances API&lt;/strong&gt;, see the &lt;a href&#x3D;\&quot;/api-docs/sell/finances/types/pay:TransactionTypeEnum\&quot;&gt;TransactionTypeEnum&lt;/a&gt; type. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/finances/types/pay:TransactionTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; | [optional] 

## Example

```python
from openapi_client.models.transaction import Transaction

# TODO update the JSON string below
json = "{}"
# create an instance of Transaction from a JSON string
transaction_instance = Transaction.from_json(json)
# print the JSON string representation of the object
print(Transaction.to_json())

# convert the object into a dict
transaction_dict = transaction_instance.to_dict()
# create an instance of Transaction from a dict
transaction_from_dict = Transaction.from_dict(transaction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


