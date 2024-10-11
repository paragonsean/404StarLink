# SegmentDimensionsDemographic


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_version** | [**SegmentDemographicsAppVersion**](SegmentDemographicsAppVersion.md) |  | [optional] 
**channel** | [**SegmentDemographicsChannel**](SegmentDemographicsChannel.md) |  | [optional] 
**device_type** | [**SegmentDemographicsDeviceType**](SegmentDemographicsDeviceType.md) |  | [optional] 
**make** | [**SegmentDemographicsMake**](SegmentDemographicsMake.md) |  | [optional] 
**model** | [**SegmentDemographicsModel**](SegmentDemographicsModel.md) |  | [optional] 
**platform** | [**SegmentDemographicsPlatform**](SegmentDemographicsPlatform.md) |  | [optional] 

## Example

```python
from openapi_client.models.segment_dimensions_demographic import SegmentDimensionsDemographic

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDimensionsDemographic from a JSON string
segment_dimensions_demographic_instance = SegmentDimensionsDemographic.from_json(json)
# print the JSON string representation of the object
print(SegmentDimensionsDemographic.to_json())

# convert the object into a dict
segment_dimensions_demographic_dict = segment_dimensions_demographic_instance.to_dict()
# create an instance of SegmentDimensionsDemographic from a dict
segment_dimensions_demographic_from_dict = SegmentDimensionsDemographic.from_dict(segment_dimensions_demographic_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


