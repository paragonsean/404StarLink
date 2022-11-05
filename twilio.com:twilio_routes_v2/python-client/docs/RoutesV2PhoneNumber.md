# RoutesV2PhoneNumber


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_sid** | **str** | The unique SID identifier of the Account. | [optional] 
**date_created** | **datetime** | The date that this phone number was assigned an Inbound Processing Region, given in ISO 8601 format. | [optional] 
**date_updated** | **datetime** | The date that the Inbound Processing Region was updated for this phone number, given in ISO 8601 format. | [optional] 
**friendly_name** | **str** | A human readable description of the Inbound Processing Region assignments for this phone number, up to 64 characters. | [optional] 
**phone_number** | **str** | The phone number in E.164 format | [optional] 
**sid** | **str** | A 34 character string that uniquely identifies the Inbound Processing Region assignments for this phone number. | [optional] 
**url** | **str** | The absolute URL of the resource. | [optional] 
**voice_region** | **str** | The Inbound Processing Region used for this phone number for voice. | [optional] 

## Example

```python
from openapi_client.models.routes_v2_phone_number import RoutesV2PhoneNumber

# TODO update the JSON string below
json = "{}"
# create an instance of RoutesV2PhoneNumber from a JSON string
routes_v2_phone_number_instance = RoutesV2PhoneNumber.from_json(json)
# print the JSON string representation of the object
print(RoutesV2PhoneNumber.to_json())

# convert the object into a dict
routes_v2_phone_number_dict = routes_v2_phone_number_instance.to_dict()
# create an instance of RoutesV2PhoneNumber from a dict
routes_v2_phone_number_from_dict = RoutesV2PhoneNumber.from_dict(routes_v2_phone_number_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


