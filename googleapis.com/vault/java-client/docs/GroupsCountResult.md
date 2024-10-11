

# GroupsCountResult

Groups specific count metrics.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountCountErrors** | [**List&lt;AccountCountError&gt;**](AccountCountError.md) | Error occurred when querying these accounts. |  [optional] |
|**accountCounts** | [**List&lt;AccountCount&gt;**](AccountCount.md) | Subtotal count per matching account that have more than zero messages. |  [optional] |
|**matchingAccountsCount** | **String** | Total number of accounts that can be queried and have more than zero messages. |  [optional] |
|**nonQueryableAccounts** | **List&lt;String&gt;** | When **DataScope** is **HELD_DATA**, these accounts in the request are not queried because they are not on hold. For other data scope, this field is not set. |  [optional] |
|**queriedAccountsCount** | **String** | Total number of accounts involved in this count operation. |  [optional] |



