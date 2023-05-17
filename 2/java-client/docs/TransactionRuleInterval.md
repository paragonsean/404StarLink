

# TransactionRuleInterval


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dayOfMonth** | **Integer** | The day of month, used when the &#x60;duration.unit&#x60; is **months**. If not provided, by default, this is set to **1**, the first day of the month. |  [optional] |
|**dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum) | The day of week, used when the &#x60;duration.unit&#x60; is **weeks**. If not provided, by default, this is set to **monday**.  Possible values: **sunday**, **monday**, **tuesday**, **wednesday**, **thursday**, **friday**. |  [optional] |
|**duration** | [**Duration**](Duration.md) | The duration, which you can specify in hours, days, weeks, or months. The maximum duration is 90 days or an equivalent in other units. Required when the &#x60;type&#x60; is **rolling** or **sliding**. |  [optional] |
|**timeOfDay** | **String** | The time of day, in **hh:mm:ss** format, used when the &#x60;duration.unit&#x60; is **hours**. If not provided, by default, this is set to **00:00:00**. |  [optional] |
|**timeZone** | **String** | The [time zone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). For example, **Europe/Amsterdam**. By default, this is set to **UTC**. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The [type of interval](https://docs.adyen.com/issuing/transaction-rules#time-intervals) during which the rule conditions and limits apply, and how often counters are reset.  Possible values:   * **perTransaction**: conditions are evaluated and the counters are reset for every transaction.  * **daily**: the counters are reset daily at 00:00:00 UTC.  * **weekly**: the counters are reset every Monday at 00:00:00 UTC.   * **monthly**: the counters reset every first day of the month at 00:00:00 UTC.   * **lifetime**: conditions are applied to the lifetime of the payment instrument.  * **rolling**: conditions are applied and the counters are reset based on a &#x60;duration&#x60;. If the reset date and time are not provided, Adyen applies the default reset time similar to fixed intervals. For example, if the duration is every two weeks, the counter resets every third Monday at 00:00:00 UTC.  * **sliding**: conditions are applied and the counters are reset based on the current time and a &#x60;duration&#x60; that you specify. |  |



## Enum: DayOfWeekEnum

| Name | Value |
|---- | -----|
| FRIDAY | &quot;friday&quot; |
| MONDAY | &quot;monday&quot; |
| SATURDAY | &quot;saturday&quot; |
| SUNDAY | &quot;sunday&quot; |
| THURSDAY | &quot;thursday&quot; |
| TUESDAY | &quot;tuesday&quot; |
| WEDNESDAY | &quot;wednesday&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| LIFETIME | &quot;lifetime&quot; |
| MONTHLY | &quot;monthly&quot; |
| PER_TRANSACTION | &quot;perTransaction&quot; |
| ROLLING | &quot;rolling&quot; |
| SLIDING | &quot;sliding&quot; |
| WEEKLY | &quot;weekly&quot; |



