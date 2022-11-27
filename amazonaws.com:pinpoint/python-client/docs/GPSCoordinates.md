# GPSCoordinates

Specifies the GPS coordinates of a location.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **float** |  | 
**longitude** | **float** |  | 

## Example

```python
from openapi_client.models.gps_coordinates import GPSCoordinates

# TODO update the JSON string below
json = "{}"
# create an instance of GPSCoordinates from a JSON string
gps_coordinates_instance = GPSCoordinates.from_json(json)
# print the JSON string representation of the object
print(GPSCoordinates.to_json())

# convert the object into a dict
gps_coordinates_dict = gps_coordinates_instance.to_dict()
# create an instance of GPSCoordinates from a dict
gps_coordinates_from_dict = GPSCoordinates.from_dict(gps_coordinates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


