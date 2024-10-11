

# GoogleCloudRecaptchaenterpriseV1TransactionEvent

Describes an event in the lifecycle of a payment transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventTime** | **String** | Optional. Timestamp when this transaction event occurred; otherwise assumed to be the time of the API call. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Optional. The type of this transaction event. |  [optional] |
|**reason** | **String** | Optional. The reason or standardized code that corresponds with this transaction event, if one exists. For example, a CHARGEBACK event with code 6005. |  [optional] |
|**value** | **Double** | Optional. The value that corresponds with this transaction event, if one exists. For example, a refund event where $5.00 was refunded. Currency is obtained from the original transaction data. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| TRANSACTION_EVENT_TYPE_UNSPECIFIED | &quot;TRANSACTION_EVENT_TYPE_UNSPECIFIED&quot; |
| MERCHANT_APPROVE | &quot;MERCHANT_APPROVE&quot; |
| MERCHANT_DENY | &quot;MERCHANT_DENY&quot; |
| MANUAL_REVIEW | &quot;MANUAL_REVIEW&quot; |
| AUTHORIZATION | &quot;AUTHORIZATION&quot; |
| AUTHORIZATION_DECLINE | &quot;AUTHORIZATION_DECLINE&quot; |
| PAYMENT_CAPTURE | &quot;PAYMENT_CAPTURE&quot; |
| PAYMENT_CAPTURE_DECLINE | &quot;PAYMENT_CAPTURE_DECLINE&quot; |
| CANCEL | &quot;CANCEL&quot; |
| CHARGEBACK_INQUIRY | &quot;CHARGEBACK_INQUIRY&quot; |
| CHARGEBACK_ALERT | &quot;CHARGEBACK_ALERT&quot; |
| FRAUD_NOTIFICATION | &quot;FRAUD_NOTIFICATION&quot; |
| CHARGEBACK | &quot;CHARGEBACK&quot; |
| CHARGEBACK_REPRESENTMENT | &quot;CHARGEBACK_REPRESENTMENT&quot; |
| CHARGEBACK_REVERSE | &quot;CHARGEBACK_REVERSE&quot; |
| REFUND_REQUEST | &quot;REFUND_REQUEST&quot; |
| REFUND_DECLINE | &quot;REFUND_DECLINE&quot; |
| REFUND | &quot;REFUND&quot; |
| REFUND_REVERSE | &quot;REFUND_REVERSE&quot; |



