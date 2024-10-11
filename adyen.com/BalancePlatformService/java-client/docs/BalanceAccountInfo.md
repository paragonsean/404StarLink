

# BalanceAccountInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountHolderId** | **String** | The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account. |  |
|**defaultCurrencyCode** | **String** | The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**. |  [optional] |
|**description** | **String** | A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder. |  [optional] |
|**reference** | **String** | Your reference for the balance account, maximum 150 characters. |  [optional] |
|**sweepConfigurations** | [**Map&lt;String, SweepConfiguration&gt;**](SweepConfiguration.md) | Contains key-value pairs that specify configurations for balance sweeps per currency code. A sweep pulls in or pushes out funds based on a defined schedule, amount, and a source (for pulling funds) or a destination (for pushing funds).  The key must be a three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**. The value must be an object containing the sweep configuration. |  [optional] |
|**timeZone** | **String** | The [time zone](https://www.iana.org/time-zones) of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). |  [optional] |



