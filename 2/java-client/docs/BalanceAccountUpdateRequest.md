

# BalanceAccountUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountHolderId** | **String** | The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account. |  [optional] |
|**defaultCurrencyCode** | **String** | The default currency code of this balance account, in three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) format.  The default value is **EUR**. |  [optional] |
|**description** | **String** | A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder. |  [optional] |
|**reference** | **String** | Your reference to the balance account, maximum 150 characters. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **active**.  Possible values: **active**, **inactive**, **closed**, **suspended**. |  [optional] |
|**timeZone** | **String** | The [time zone](https://www.iana.org/time-zones) of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| CLOSED | &quot;closed&quot; |
| INACTIVE | &quot;inactive&quot; |
| SUSPENDED | &quot;suspended&quot; |



