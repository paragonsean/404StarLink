

# TransactionRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aggregationLevel** | **String** | The level at which data must be accumulated, used in rules with &#x60;type&#x60; **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the &#x60;entityKey&#x60;.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**. |  [optional] |
|**description** | **String** | Your description for the transaction rule, maximum 300 characters. |  |
|**endDate** | **String** | The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**. |  [optional] |
|**entityKey** | [**TransactionRuleEntityKey**](TransactionRuleEntityKey.md) | The type and unique identifier of the resource to which the rule applies. |  |
|**id** | **String** | The unique identifier of the transaction rule. |  [optional] |
|**interval** | [**TransactionRuleInterval**](TransactionRuleInterval.md) | The [time interval](https://docs.adyen.com/issuing/transaction-rules#time-intervals) when the rule conditions apply. |  |
|**outcomeType** | [**OutcomeTypeEnum**](#OutcomeTypeEnum) | The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the &#x60;score&#x60; you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined. |  [optional] |
|**reference** | **String** | Your reference for the transaction rule, maximum 150 characters. |  |
|**requestType** | [**RequestTypeEnum**](#RequestTypeEnum) | Indicates the type of request to which the rule applies.  Possible values: **authorization**, **authentication**, **tokenization**. |  [optional] |
|**ruleRestrictions** | [**TransactionRuleRestrictions**](TransactionRuleRestrictions.md) | Contains one or more objects that define the [rule conditions](https://docs.adyen.com/issuing/transaction-rules#conditions). Each object must have a value and an operation which determines how the values must be evaluated.  For example, a &#x60;countries&#x60; object can have a list of country codes **[\&quot;US\&quot;, \&quot;CA\&quot;]** in the &#x60;value&#x60; field and **anyMatch** in the &#x60;operation&#x60; field. |  |
|**score** | **Integer** | A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when &#x60;outcomeType&#x60; is **scoreBased**.  The value must be between **-100** and **100**. |  [optional] |
|**startDate** | **String** | The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the &#x60;startDate&#x60; is set to the date when the rule status is set to **active**.    |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met.  |  |



## Enum: OutcomeTypeEnum

| Name | Value |
|---- | -----|
| HARD_BLOCK | &quot;hardBlock&quot; |
| SCORE_BASED | &quot;scoreBased&quot; |



## Enum: RequestTypeEnum

| Name | Value |
|---- | -----|
| AUTHENTICATION | &quot;authentication&quot; |
| AUTHORIZATION | &quot;authorization&quot; |
| TOKENIZATION | &quot;tokenization&quot; |



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



