

# SweepSchedule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The schedule type.  Possible values:  * **cron**: push out funds based on a cron expression.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: pull in funds instantly if the balance is less than or equal to the &#x60;triggerAmount&#x60;. You can only use this for sweeps of &#x60;type&#x60; **pull** and when the source is a &#x60;merchantAccount&#x60; or &#x60;transferInstrument&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| BALANCE | &quot;balance&quot; |
| CRON | &quot;cron&quot; |



