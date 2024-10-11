

# TransactionRuleInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | [**Amount**](Amount.md) |  |  [optional] |
|**balancePlatformId** | **String** | The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/get/balancePlatforms/{id}__queryParam_id) to which the rule applies. |  [optional] |
|**countries** | **List&lt;String&gt;** | List of countries to which the rule applies. For example: **[\&quot;NL\&quot;,\&quot;US\&quot;]**. |  [optional] |
|**description** | **String** | Your description for the transaction rule, maximum 300 characters. |  |
|**endDate** | **String** | The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**. |  [optional] |
|**entryModes** | [**List&lt;EntryModesEnum&gt;**](#List&lt;EntryModesEnum&gt;) | List of point-of-sale entry modes to which the rule applies.  Possible values: **manual**, **chip**, **magstripe**, **contactless**, **cof**, **token**, **server**, **barcode**, **ocr**. |  [optional] |
|**interval** | [**TransactionRuleInterval**](TransactionRuleInterval.md) |  |  |
|**maxTransactions** | **Integer** | The maximum number of transactions that a payment instrument can be used for in the period specified in the &#x60;interval.type&#x60;. |  [optional] |
|**mccs** | **List&lt;String&gt;** | List of Merchant Category Codes (MCCs) to which the rule applies. |  [optional] |
|**paymentInstrumentGroupId** | **String** | The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstrumentGroups__resParam_id) to which the rule applies. |  [optional] |
|**paymentInstrumentId** | **String** | The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments__resParam_id) to which the rule applies. |  [optional] |
|**processingTypes** | [**List&lt;ProcessingTypesEnum&gt;**](#List&lt;ProcessingTypesEnum&gt;) | List of processing types to which the rule applies.  Possible values: **atmWithdraw**, **pos**, **ecommerce**, **moto**, **recurring**, **balanceInquiry**. |  [optional] |
|**reference** | **String** | Your reference for the transaction rule, maximum 150 characters. |  |
|**startDate** | **String** | The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the &#x60;startDate&#x60; is set to the date when the rule status is set to **active**.    |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of conditions provided in the rule.  Possible values:   * **allowList**: The rule provides categories (such as country and MCC) where payments must be allowed.  * **blockList**: The rule provides categories (such as country and MCC) where payments must be blocked.  * **maxUsage**: The rule sets limits for the maximum amount or maximum number of transactions for the lifetime of the payment instrument.  * **velocity**: The rule sets limits for the maximum amount or maximum number of transactions for a given time interval.  |  |



## Enum: List&lt;EntryModesEnum&gt;

| Name | Value |
|---- | -----|
| BARCODE | &quot;barcode&quot; |
| CHIP | &quot;chip&quot; |
| COF | &quot;cof&quot; |
| CONTACTLESS | &quot;contactless&quot; |
| MAGSTRIPE | &quot;magstripe&quot; |
| MANUAL | &quot;manual&quot; |
| OCR | &quot;ocr&quot; |
| SERVER | &quot;server&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: List&lt;ProcessingTypesEnum&gt;

| Name | Value |
|---- | -----|
| ATM_WITHDRAW | &quot;atmWithdraw&quot; |
| BALANCE_INQUIRY | &quot;balanceInquiry&quot; |
| ECOMMERCE | &quot;ecommerce&quot; |
| MOTO | &quot;moto&quot; |
| POS | &quot;pos&quot; |
| RECURRING | &quot;recurring&quot; |
| TOKEN | &quot;token&quot; |
| UNKNOWN | &quot;unknown&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALLOW_LIST | &quot;allowList&quot; |
| BLOCK_LIST | &quot;blockList&quot; |
| MAX_USAGE | &quot;maxUsage&quot; |
| VELOCITY | &quot;velocity&quot; |



