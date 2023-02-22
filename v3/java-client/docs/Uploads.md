

# Uploads

Upload collection lists Analytics uploads to which the user has access. Each custom data source can have a set of uploads. Each resource in the upload collection corresponds to a single Analytics data upload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;Upload&gt;**](Upload.md) | A list of uploads. |  [optional] |
|**itemsPerPage** | **Integer** | The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter. |  [optional] |
|**kind** | **String** | Collection type. |  [optional] |
|**nextLink** | **String** | Link to next page for this upload collection. |  [optional] |
|**previousLink** | **String** | Link to previous page for this upload collection. |  [optional] |
|**startIndex** | **Integer** | The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. |  [optional] |
|**totalResults** | **Integer** | The total number of results for the query, regardless of the number of resources in the result. |  [optional] |



