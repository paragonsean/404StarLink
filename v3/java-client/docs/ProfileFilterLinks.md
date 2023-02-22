

# ProfileFilterLinks

A profile filter link collection lists profile filter links between profiles and filters. Each resource in the collection corresponds to a profile filter link.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;ProfileFilterLink&gt;**](ProfileFilterLink.md) | A list of profile filter links. |  [optional] |
|**itemsPerPage** | **Integer** | The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1,000 with a value of 1000 by default, or otherwise specified by the max-results query parameter. |  [optional] |
|**kind** | **String** | Collection type. |  [optional] |
|**nextLink** | **String** | Link to next page for this profile filter link collection. |  [optional] |
|**previousLink** | **String** | Link to previous page for this profile filter link collection. |  [optional] |
|**startIndex** | **Integer** | The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. |  [optional] |
|**totalResults** | **Integer** | The total number of results for the query, regardless of the number of results in the response. |  [optional] |
|**username** | **String** | Email ID of the authenticated user |  [optional] |



