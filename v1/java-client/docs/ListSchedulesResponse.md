

# ListSchedulesResponse

Response for listing scheduled notebook job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | Page token that can be used to continue listing from the last result in the next list call. |  [optional] |
|**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | A list of returned instances. |  [optional] |
|**unreachable** | **List&lt;String&gt;** | Schedules that could not be reached. For example: [&#39;projects/{project_id}/location/{location}/schedules/monthly_digest&#39;, &#39;projects/{project_id}/location/{location}/schedules/weekly_sentiment&#39;] |  [optional] |



