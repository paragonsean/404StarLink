

# McfData

Multi-Channel Funnels data for a given view (profile).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnHeaders** | [**List&lt;McfDataColumnHeadersInner&gt;**](McfDataColumnHeadersInner.md) | Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. |  [optional] |
|**containsSampledData** | **Boolean** | Determines if the Analytics data contains sampled data. |  [optional] |
|**id** | **String** | Unique ID for this data response. |  [optional] |
|**itemsPerPage** | **Integer** | The maximum number of rows the response can contain, regardless of the actual number of rows returned. Its value ranges from 1 to 10,000 with a value of 1000 by default, or otherwise specified by the max-results query parameter. |  [optional] |
|**kind** | **String** | Resource type. |  [optional] |
|**nextLink** | **String** | Link to next page for this Analytics data query. |  [optional] |
|**previousLink** | **String** | Link to previous page for this Analytics data query. |  [optional] |
|**profileInfo** | [**GaDataProfileInfo**](GaDataProfileInfo.md) |  |  [optional] |
|**query** | [**GaDataQuery**](GaDataQuery.md) |  |  [optional] |
|**rows** | **List&lt;List&lt;McfDataRowsInnerInner&gt;&gt;** | Analytics data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as specified in the request. |  [optional] |
|**sampleSize** | **String** | The number of samples used to calculate the result. |  [optional] |
|**sampleSpace** | **String** | Total size of the sample space from which the samples were selected. |  [optional] |
|**selfLink** | **String** | Link to this page. |  [optional] |
|**totalResults** | **Integer** | The total number of rows for the query, regardless of the number of rows in the response. |  [optional] |
|**totalsForAllResults** | **Map&lt;String, String&gt;** | Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as the metric order specified in the request. |  [optional] |



