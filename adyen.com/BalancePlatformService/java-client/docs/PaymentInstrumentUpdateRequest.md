

# PaymentInstrumentUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balanceAccountId** | **String** | The unique identifier of the balance account associated with this payment instrument. &gt;You can only change the balance account ID if the payment instrument has **Requested** or **Inactive** status. |  [optional] |
|**card** | [**CardInfo**](CardInfo.md) | Object that contains information about the card payment instrument. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **Active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **Requested**.  Possible values:    * **Active**:  The payment instrument is active and can be used to make payments.    * **Requested**: The payment instrument has been requested. This state is applicable for physical cards.   * **Inactive**: The payment instrument is inactive and cannot be used to make payments.    * **Suspended**: The payment instrument is temporarily suspended and cannot be used to make payments.    * **Closed**: The payment instrument is permanently closed. This action cannot be undone.   * **Stolen**    * **Lost**    |  [optional] |
|**statusComment** | **String** | Comment for the status of the payment instrument. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| CLOSED | &quot;Closed&quot; |
| INACTIVE | &quot;Inactive&quot; |
| LOST | &quot;Lost&quot; |
| REQUESTED | &quot;Requested&quot; |
| STOLEN | &quot;Stolen&quot; |
| SUSPENDED | &quot;Suspended&quot; |
| BLOCKED | &quot;blocked&quot; |
| DISCARDED | &quot;discarded&quot; |



