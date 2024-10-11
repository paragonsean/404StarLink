# SegmentDimensionsLocation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**SegmentLocationCountry**](SegmentLocationCountry.md) |  | [optional] 
**gps_point** | [**SegmentLocationGPSPoint**](SegmentLocationGPSPoint.md) |  | [optional] 

## Example

```python
from openapi_client.models.segment_dimensions_location import SegmentDimensionsLocation

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentDimensionsLocation from a JSON string
segment_dimensions_location_instance = SegmentDimensionsLocation.from_json(json)
# print the JSON string representation of the object
print(SegmentDimensionsLocation.to_json())

# convert the object into a dict
segment_dimensions_location_dict = segment_dimensions_location_instance.to_dict()
# create an instance of SegmentDimensionsLocation from a dict
segment_dimensions_location_from_dict = SegmentDimensionsLocation.from_dict(segment_dimensions_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


