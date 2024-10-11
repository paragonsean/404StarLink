

# MailCountResult

Gmail and classic Hangouts-specific count metrics.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountCountErrors** | [**List&lt;AccountCountError&gt;**](AccountCountError.md) | Errors occurred when querying these accounts. |  [optional] |
|**accountCounts** | [**List&lt;AccountCount&gt;**](AccountCount.md) | Subtotal count per matching account that have more than zero messages. |  [optional] |
|**matchingAccountsCount** | **String** | Total number of accounts that can be queried and have more than zero messages. |  [optional] |
|**nonQueryableAccounts** | **List&lt;String&gt;** | When **DataScope** is **HELD_DATA** and when account emails are passed in explicitly, the list of accounts in the request that are not queried because they are not on hold in the matter. For other data scopes, this field is not set. |  [optional] |
|**queriedAccountsCount** | **String** | Total number of accounts involved in this count operation. |  [optional] |



