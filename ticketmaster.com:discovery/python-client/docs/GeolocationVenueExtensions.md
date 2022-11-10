# GeolocationVenueExtensions

Venue's geocode extension

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geocode** | [**GeocodeExtension**](GeocodeExtension.md) |  | [optional] 

## Example

```python
from openapi_client.models.geolocation_venue_extensions import GeolocationVenueExtensions

# TODO update the JSON string below
json = "{}"
# create an instance of GeolocationVenueExtensions from a JSON string
geolocation_venue_extensions_instance = GeolocationVenueExtensions.from_json(json)
# print the JSON string representation of the object
print(GeolocationVenueExtensions.to_json())

# convert the object into a dict
geolocation_venue_extensions_dict = geolocation_venue_extensions_instance.to_dict()
# create an instance of GeolocationVenueExtensions from a dict
geolocation_venue_extensions_from_dict = GeolocationVenueExtensions.from_dict(geolocation_venue_extensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


