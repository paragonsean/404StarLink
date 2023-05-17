

# Duration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unit** | [**UnitEnum**](#UnitEnum) | The unit of time. You can only use **minutes** and **hours** if the &#x60;interval.type&#x60; is **sliding**.  Possible values: **minutes**, **hours**, **days**, **weeks**, or **months** |  [optional] |
|**value** | **Integer** | The length of time by the unit. For example, 5 days.  The maximum duration is 90 days or an equivalent in other units. For example, 3 months. |  [optional] |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;days&quot; |
| HOURS | &quot;hours&quot; |
| MINUTES | &quot;minutes&quot; |
| MONTHS | &quot;months&quot; |
| WEEKS | &quot;weeks&quot; |



