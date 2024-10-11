

# TimeSeriesQuery

TimeSeriesQuery collects the set of supported methods for querying time series data from the Stackdriver metrics API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prometheusQuery** | **String** | A query used to fetch time series with PromQL. |  [optional] |
|**timeSeriesFilter** | [**TimeSeriesFilter**](TimeSeriesFilter.md) |  |  [optional] |
|**timeSeriesFilterRatio** | [**TimeSeriesFilterRatio**](TimeSeriesFilterRatio.md) |  |  [optional] |
|**timeSeriesQueryLanguage** | **String** | A query used to fetch time series with MQL. |  [optional] |
|**unitOverride** | **String** | The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor. |  [optional] |



