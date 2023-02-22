

# Segments

An segment collection lists Analytics segments that the user has access to. Each resource in the collection corresponds to a single Analytics segment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;Segment&gt;**](Segment.md) | A list of segments. |  [optional] |
|**itemsPerPage** | **Integer** | The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter. |  [optional] |
|**kind** | **String** | Collection type for segments. |  [optional] |
|**nextLink** | **String** | Link to next page for this segment collection. |  [optional] |
|**previousLink** | **String** | Link to previous page for this segment collection. |  [optional] |
|**startIndex** | **Integer** | The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. |  [optional] |
|**totalResults** | **Integer** | The total number of results for the query, regardless of the number of results in the response. |  [optional] |
|**username** | **String** | Email ID of the authenticated user |  [optional] |



