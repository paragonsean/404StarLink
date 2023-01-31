

# ListRuntimesResponse

Response for listing Managed Notebook Runtimes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | Page token that can be used to continue listing from the last result in the next list call. |  [optional] |
|**runtimes** | [**List&lt;Runtime&gt;**](Runtime.md) | A list of returned Runtimes. |  [optional] |
|**unreachable** | **List&lt;String&gt;** | Locations that could not be reached. For example, &#x60;[&#39;us-west1&#39;, &#39;us-central1&#39;]&#x60;. A ListRuntimesResponse will only contain either runtimes or unreachables, |  [optional] |



