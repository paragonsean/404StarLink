# SegmentLocation

Specifies geographical dimension settings for a segment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**SegmentLocationCountry**](SegmentLocationCountry.md) |  | [optional] 
**gps_point** | [**SegmentLocationGPSPoint**](SegmentLocationGPSPoint.md) |  | [optional] 

## Example

```python
from openapi_client.models.segment_location import SegmentLocation

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentLocation from a JSON string
segment_location_instance = SegmentLocation.from_json(json)
# print the JSON string representation of the object
print(SegmentLocation.to_json())

# convert the object into a dict
segment_location_dict = segment_location_instance.to_dict()
# create an instance of SegmentLocation from a dict
segment_location_from_dict = SegmentLocation.from_dict(segment_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


