

# BalanceAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountHolderId** | **String** | The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account. |  |
|**balances** | [**List&lt;Balance&gt;**](Balance.md) | List of balances with the amount and currency. |  [optional] |
|**defaultCurrencyCode** | **String** | The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**. |  [optional] |
|**description** | **String** | A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder. |  [optional] |
|**id** | **String** | The unique identifier of the balance account. |  |
|**paymentInstruments** | [**List&lt;PaymentInstrumentReference&gt;**](PaymentInstrumentReference.md) | List of [payment instruments](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments) associated with the balance account. |  [optional] |
|**reference** | **String** | Your reference for the balance account, maximum 150 characters. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the balance account, set to **Active** by default.   |  [optional] |
|**sweepConfigurations** |  | Contains key-value pairs that specify configurations for balance sweeps per currency code. A sweep pulls in or pushes out funds based on a defined schedule, amount, and a source (for pulling funds) or a destination (for pushing funds).  The key must be a three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**. The value must be an object containing the sweep configuration. |  [optional] |
|**timeZone** | **String** | The [time zone](https://www.iana.org/time-zones) of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| CLOSED | &quot;Closed&quot; |
| INACTIVE | &quot;Inactive&quot; |
| SUSPENDED | &quot;Suspended&quot; |



