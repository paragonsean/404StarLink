# VenueExtensions

All Venue's extensions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geolocation** | [**GeolocationVenueExtensions**](GeolocationVenueExtensions.md) |  | [optional] 

## Example

```python
from openapi_client.models.venue_extensions import VenueExtensions

# TODO update the JSON string below
json = "{}"
# create an instance of VenueExtensions from a JSON string
venue_extensions_instance = VenueExtensions.from_json(json)
# print the JSON string representation of the object
print(VenueExtensions.to_json())

# convert the object into a dict
venue_extensions_dict = venue_extensions_instance.to_dict()
# create an instance of VenueExtensions from a dict
venue_extensions_from_dict = VenueExtensions.from_dict(venue_extensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


