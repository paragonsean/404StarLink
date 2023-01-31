

# ListInstancesResponse

Response for listing notebook instances.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instances** | [**List&lt;Instance&gt;**](Instance.md) | A list of returned instances. |  [optional] |
|**nextPageToken** | **String** | Page token that can be used to continue listing from the last result in the next list call. |  [optional] |
|**unreachable** | **List&lt;String&gt;** | Locations that could not be reached. For example, &#x60;[&#39;us-west1-a&#39;, &#39;us-central1-b&#39;]&#x60;. A ListInstancesResponse will only contain either instances or unreachables, |  [optional] |



