

# TransactionRuleInterval


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The [type of interval](https://docs.adyen.com/issuing/transaction-rules#time-intervals) during which the rule conditions and limits apply, and how often counters are reset.  Possible values:   * **perTransaction**: conditions are evaluated and the counters are reset for every transaction.  * **daily**: the counters are reset daily at 00:00:00 UTC.  * **weekly**: the counters are reset every Monday at 00:00:00 UTC.   * **monthly**: the counters reset every first day of the month at 00:00:00 UTC.   * **lifetime**: conditions are applied to the lifetime of the payment instrument.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| LIFETIME | &quot;lifetime&quot; |
| MONTHLY | &quot;monthly&quot; |
| PER_TRANSACTION | &quot;perTransaction&quot; |
| WEEKLY | &quot;weekly&quot; |



