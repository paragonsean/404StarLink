# SegmentLocationGPSPoint


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coordinates** | [**GPSPointDimensionCoordinates**](GPSPointDimensionCoordinates.md) |  | 
**range_in_kilometers** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.segment_location_gps_point import SegmentLocationGPSPoint

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentLocationGPSPoint from a JSON string
segment_location_gps_point_instance = SegmentLocationGPSPoint.from_json(json)
# print the JSON string representation of the object
print(SegmentLocationGPSPoint.to_json())

# convert the object into a dict
segment_location_gps_point_dict = segment_location_gps_point_instance.to_dict()
# create an instance of SegmentLocationGPSPoint from a dict
segment_location_gps_point_from_dict = SegmentLocationGPSPoint.from_dict(segment_location_gps_point_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


