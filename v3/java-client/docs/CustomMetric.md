

# CustomMetric

JSON template for Analytics Custom Metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID. |  [optional] |
|**active** | **Boolean** | Boolean indicating whether the custom metric is active. |  [optional] |
|**created** | **OffsetDateTime** | Time the custom metric was created. |  [optional] [readonly] |
|**id** | **String** | Custom metric ID. |  [optional] |
|**index** | **Integer** | Index of the custom metric. |  [optional] [readonly] |
|**kind** | **String** | Kind value for a custom metric. Set to \&quot;analytics#customMetric\&quot;. It is a read-only field. |  [optional] [readonly] |
|**maxValue** | **String** | Max value of custom metric. |  [optional] |
|**minValue** | **String** | Min value of custom metric. |  [optional] |
|**name** | **String** | Name of the custom metric. |  [optional] |
|**parentLink** | [**CustomMetricParentLink**](CustomMetricParentLink.md) |  |  [optional] |
|**scope** | **String** | Scope of the custom metric: HIT or PRODUCT. |  [optional] |
|**selfLink** | **String** | Link for the custom metric |  [optional] [readonly] |
|**type** | **String** | Data type of custom metric. |  [optional] |
|**updated** | **OffsetDateTime** | Time the custom metric was last modified. |  [optional] [readonly] |
|**webPropertyId** | **String** | Property ID. |  [optional] |



