# SimpleConditionSegmentDimensions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**behavior** | [**SegmentDimensionsBehavior**](SegmentDimensionsBehavior.md) |  | [optional] 
**demographic** | [**SegmentDimensionsDemographic**](SegmentDimensionsDemographic.md) |  | [optional] 
**location** | [**SegmentDimensionsLocation**](SegmentDimensionsLocation.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 
**user_attributes** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.simple_condition_segment_dimensions import SimpleConditionSegmentDimensions

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleConditionSegmentDimensions from a JSON string
simple_condition_segment_dimensions_instance = SimpleConditionSegmentDimensions.from_json(json)
# print the JSON string representation of the object
print(SimpleConditionSegmentDimensions.to_json())

# convert the object into a dict
simple_condition_segment_dimensions_dict = simple_condition_segment_dimensions_instance.to_dict()
# create an instance of SimpleConditionSegmentDimensions from a dict
simple_condition_segment_dimensions_from_dict = SimpleConditionSegmentDimensions.from_dict(simple_condition_segment_dimensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


