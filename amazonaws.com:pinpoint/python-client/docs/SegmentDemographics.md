# SegmentDemographics

Specifies demographic-based dimension settings for including or excluding endpoints from a segment. These settings derive from characteristics of endpoint devices, such as platform, make, and model.

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
from openapi_client.models.segment_demographics import SegmentDemographics

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDemographics from a JSON string
segment_demographics_instance = SegmentDemographics.from_json(json)
# print the JSON string representation of the object
print(SegmentDemographics.to_json())

# convert the object into a dict
segment_demographics_dict = segment_demographics_instance.to_dict()
# create an instance of SegmentDemographics from a dict
segment_demographics_from_dict = SegmentDemographics.from_dict(segment_demographics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


