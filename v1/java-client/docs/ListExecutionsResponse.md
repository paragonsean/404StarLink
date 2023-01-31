

# ListExecutionsResponse

Response for listing scheduled notebook executions

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executions** | [**List&lt;Execution&gt;**](Execution.md) | A list of returned instances. |  [optional] |
|**nextPageToken** | **String** | Page token that can be used to continue listing from the last result in the next list call. |  [optional] |
|**unreachable** | **List&lt;String&gt;** | Executions IDs that could not be reached. For example: [&#39;projects/{project_id}/location/{location}/executions/imagenet_test1&#39;, &#39;projects/{project_id}/location/{location}/executions/classifier_train1&#39;] |  [optional] |



