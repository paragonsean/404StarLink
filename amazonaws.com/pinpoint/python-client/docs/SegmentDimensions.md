# SegmentDimensions

Specifies the dimension settings for a segment.

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
from openapi_client.models.segment_dimensions import SegmentDimensions

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDimensions from a JSON string
segment_dimensions_instance = SegmentDimensions.from_json(json)
# print the JSON string representation of the object
print(SegmentDimensions.to_json())

# convert the object into a dict
segment_dimensions_dict = segment_dimensions_instance.to_dict()
# create an instance of SegmentDimensions from a dict
segment_dimensions_from_dict = SegmentDimensions.from_dict(segment_dimensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


