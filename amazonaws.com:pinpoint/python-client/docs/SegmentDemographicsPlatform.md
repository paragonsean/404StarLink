# SegmentDemographicsPlatform


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension_type** | [**DimensionType**](DimensionType.md) |  | [optional] 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.segment_demographics_platform import SegmentDemographicsPlatform

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDemographicsPlatform from a JSON string
segment_demographics_platform_instance = SegmentDemographicsPlatform.from_json(json)
# print the JSON string representation of the object
print(SegmentDemographicsPlatform.to_json())

# convert the object into a dict
segment_demographics_platform_dict = segment_demographics_platform_instance.to_dict()
# create an instance of SegmentDemographicsPlatform from a dict
segment_demographics_platform_from_dict = SegmentDemographicsPlatform.from_dict(segment_demographics_platform_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


