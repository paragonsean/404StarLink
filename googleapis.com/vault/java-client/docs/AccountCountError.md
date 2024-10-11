

# AccountCountError

An error that occurred when querying a specific account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | [**UserInfo**](UserInfo.md) |  |  [optional] |
|**errorType** | [**ErrorTypeEnum**](#ErrorTypeEnum) | Account query error. |  [optional] |



## Enum: ErrorTypeEnum

| Name | Value |
|---- | -----|
| ERROR_TYPE_UNSPECIFIED | &quot;ERROR_TYPE_UNSPECIFIED&quot; |
| WILDCARD_TOO_BROAD | &quot;WILDCARD_TOO_BROAD&quot; |
| TOO_MANY_TERMS | &quot;TOO_MANY_TERMS&quot; |
| LOCATION_UNAVAILABLE | &quot;LOCATION_UNAVAILABLE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| DEADLINE_EXCEEDED | &quot;DEADLINE_EXCEEDED&quot; |



