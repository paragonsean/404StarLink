# MetricDimension

Specifies metric-based criteria for including or excluding endpoints from a segment. These criteria derive from custom metrics that you define for endpoints.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparison_operator** | **str** |  | 
**value** | **float** |  | 

## Example

```python
from openapi_client.models.metric_dimension import MetricDimension

# TODO update the JSON string below
json = "{}"
# create an instance of MetricDimension from a JSON string
metric_dimension_instance = MetricDimension.from_json(json)
# print the JSON string representation of the object
print(MetricDimension.to_json())

# convert the object into a dict
metric_dimension_dict = metric_dimension_instance.to_dict()
# create an instance of MetricDimension from a dict
metric_dimension_from_dict = MetricDimension.from_dict(metric_dimension_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


