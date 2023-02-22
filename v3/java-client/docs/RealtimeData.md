

# RealtimeData

Real time data for a given view (profile).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnHeaders** | [**List&lt;GaDataColumnHeadersInner&gt;**](GaDataColumnHeadersInner.md) | Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. |  [optional] |
|**id** | **String** | Unique ID for this data response. |  [optional] |
|**kind** | **String** | Resource type. |  [optional] |
|**profileInfo** | [**RealtimeDataProfileInfo**](RealtimeDataProfileInfo.md) |  |  [optional] |
|**query** | [**RealtimeDataQuery**](RealtimeDataQuery.md) |  |  [optional] |
|**rows** | **List&lt;List&lt;String&gt;&gt;** | Real time data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as specified in the request. |  [optional] |
|**selfLink** | **String** | Link to this page. |  [optional] |
|**totalResults** | **Integer** | The total number of rows for the query, regardless of the number of rows in the response. |  [optional] |
|**totalsForAllResults** | **Map&lt;String, String&gt;** | Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as the metric order specified in the request. |  [optional] |



