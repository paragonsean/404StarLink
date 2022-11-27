# SegmentDemographicsChannel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension_type** | [**DimensionType**](DimensionType.md) |  | [optional] 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.segment_demographics_channel import SegmentDemographicsChannel

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDemographicsChannel from a JSON string
segment_demographics_channel_instance = SegmentDemographicsChannel.from_json(json)
# print the JSON string representation of the object
print(SegmentDemographicsChannel.to_json())

# convert the object into a dict
segment_demographics_channel_dict = segment_demographics_channel_instance.to_dict()
# create an instance of SegmentDemographicsChannel from a dict
segment_demographics_channel_from_dict = SegmentDemographicsChannel.from_dict(segment_demographics_channel_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


