

# Accounts

An account collection provides a list of Analytics accounts to which a user has access. The account collection is the entry point to all management information. Each resource in the collection corresponds to a single Analytics account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;Account&gt;**](Account.md) | A list of accounts. |  [optional] |
|**itemsPerPage** | **Integer** | The maximum number of entries the response can contain, regardless of the actual number of entries returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter. |  [optional] |
|**kind** | **String** | Collection type. |  [optional] |
|**nextLink** | **String** | Next link for this account collection. |  [optional] |
|**previousLink** | **String** | Previous link for this account collection. |  [optional] |
|**startIndex** | **Integer** | The starting index of the entries, which is 1 by default or otherwise specified by the start-index query parameter. |  [optional] |
|**totalResults** | **Integer** | The total number of results for the query, regardless of the number of results in the response. |  [optional] |
|**username** | **String** | Email ID of the authenticated user |  [optional] |



