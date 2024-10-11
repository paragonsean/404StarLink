# VenueGeneralInfo

Venue general information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**child_rule** | **str** | Venue children rule | [optional] 
**general_rule** | **str** | Venue general rules | [optional] 

## Example

```python
from openapi_client.models.venue_general_info import VenueGeneralInfo

# TODO update the JSON string below
json = "{}"
# create an instance of VenueGeneralInfo from a JSON string
venue_general_info_instance = VenueGeneralInfo.from_json(json)
# print the JSON string representation of the object
print(VenueGeneralInfo.to_json())

# convert the object into a dict
venue_general_info_dict = venue_general_info_instance.to_dict()
# create an instance of VenueGeneralInfo from a dict
venue_general_info_from_dict = VenueGeneralInfo.from_dict(venue_general_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


