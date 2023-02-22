

# Webproperties

A web property collection lists Analytics web properties to which the user has access. Each resource in the collection corresponds to a single Analytics web property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;Webproperty&gt;**](Webproperty.md) | A list of web properties. |  [optional] |
|**itemsPerPage** | **Integer** | The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter. |  [optional] |
|**kind** | **String** | Collection type. |  [optional] |
|**nextLink** | **String** | Link to next page for this web property collection. |  [optional] |
|**previousLink** | **String** | Link to previous page for this web property collection. |  [optional] |
|**startIndex** | **Integer** | The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. |  [optional] |
|**totalResults** | **Integer** | The total number of results for the query, regardless of the number of results in the response. |  [optional] |
|**username** | **String** | Email ID of the authenticated user |  [optional] |



