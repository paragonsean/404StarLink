# SegmentDemographicsAppVersion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimension_type** | [**DimensionType**](DimensionType.md) |  | [optional] 
**values** | **List** |  | 

## Example

```python
from openapi_client.models.segment_demographics_app_version import SegmentDemographicsAppVersion

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDemographicsAppVersion from a JSON string
segment_demographics_app_version_instance = SegmentDemographicsAppVersion.from_json(json)
# print the JSON string representation of the object
print(SegmentDemographicsAppVersion.to_json())

# convert the object into a dict
segment_demographics_app_version_dict = segment_demographics_app_version_instance.to_dict()
# create an instance of SegmentDemographicsAppVersion from a dict
segment_demographics_app_version_from_dict = SegmentDemographicsAppVersion.from_dict(segment_demographics_app_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


