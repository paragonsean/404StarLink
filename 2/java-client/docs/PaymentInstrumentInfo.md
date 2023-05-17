

# PaymentInstrumentInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**balanceAccountId** | **String** | The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument. |  |
|**card** | [**CardInfo**](CardInfo.md) | Contains information about the card. Required when you create a payment instrument of &#x60;type&#x60; **card**. |  [optional] |
|**description** | **String** | Your description for the payment instrument, maximum 300 characters. |  [optional] |
|**issuingCountryCode** | **String** | The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**. |  |
|**paymentInstrumentGroupId** | **String** | The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs. |  [optional] |
|**reference** | **String** | Your reference for the payment instrument, maximum 150 characters. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.    |  [optional] |
|**statusReason** | [**StatusReasonEnum**](#StatusReasonEnum) | The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of payment instrument.  Possible value: **card**, **bankAccount**.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| CLOSED | &quot;closed&quot; |
| INACTIVE | &quot;inactive&quot; |
| SUSPENDED | &quot;suspended&quot; |



## Enum: StatusReasonEnum

| Name | Value |
|---- | -----|
| ACCOUNT_CLOSURE | &quot;accountClosure&quot; |
| DAMAGED | &quot;damaged&quot; |
| END_OF_LIFE | &quot;endOfLife&quot; |
| EXPIRED | &quot;expired&quot; |
| LOST | &quot;lost&quot; |
| OTHER | &quot;other&quot; |
| STOLEN | &quot;stolen&quot; |
| SUSPECTED_FRAUD | &quot;suspectedFraud&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BANK_ACCOUNT | &quot;bankAccount&quot; |
| CARD | &quot;card&quot; |



