# GPSPointDimension

Specifies GPS-based criteria for including or excluding endpoints from a segment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coordinates** | [**GPSPointDimensionCoordinates**](GPSPointDimensionCoordinates.md) |  | 
**range_in_kilometers** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.gps_point_dimension import GPSPointDimension

# TODO update the JSON string below
json = "{}"
# create an instance of GPSPointDimension from a JSON string
gps_point_dimension_instance = GPSPointDimension.from_json(json)
# print the JSON string representation of the object
print(GPSPointDimension.to_json())

# convert the object into a dict
gps_point_dimension_dict = gps_point_dimension_instance.to_dict()
# create an instance of GPSPointDimension from a dict
gps_point_dimension_from_dict = GPSPointDimension.from_dict(gps_point_dimension_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


