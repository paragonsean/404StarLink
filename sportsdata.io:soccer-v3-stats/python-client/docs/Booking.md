# Booking


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**booking_id** | **int** |  | [optional] 
**game_id** | **int** |  | [optional] 
**game_minute** | **int** |  | [optional] 
**game_minute_extra** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**team_id** | **int** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.booking import Booking

# TODO update the JSON string below
json = "{}"
# create an instance of Booking from a JSON string
booking_instance = Booking.from_json(json)
# print the JSON string representation of the object
print(Booking.to_json())

# convert the object into a dict
booking_dict = booking_instance.to_dict()
# create an instance of Booking from a dict
booking_from_dict = Booking.from_dict(booking_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


