# VenueBoxOfficeInfo

Venue box office information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted_payment_detail** | **str** | Venue box office accepted payment details | [optional] 
**open_hours_detail** | **str** | Venue box office opening hours | [optional] 
**phone_number_detail** | **str** | Venue box office phone number | [optional] 
**will_call_detail** | **str** | Venue box office will call details | [optional] 

## Example

```python
from openapi_client.models.venue_box_office_info import VenueBoxOfficeInfo

# TODO update the JSON string below
json = "{}"
# create an instance of VenueBoxOfficeInfo from a JSON string
venue_box_office_info_instance = VenueBoxOfficeInfo.from_json(json)
# print the JSON string representation of the object
print(VenueBoxOfficeInfo.to_json())

# convert the object into a dict
venue_box_office_info_dict = venue_box_office_info_instance.to_dict()
# create an instance of VenueBoxOfficeInfo from a dict
venue_box_office_info_from_dict = VenueBoxOfficeInfo.from_dict(venue_box_office_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


