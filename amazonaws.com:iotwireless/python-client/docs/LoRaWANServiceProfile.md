# LoRaWANServiceProfile

LoRaWANServiceProfile object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add_gw_metadata** | **bool** |  | [optional] 
**dr_min** | **int** |  | [optional] 
**dr_max** | **int** |  | [optional] 
**pr_allowed** | **bool** |  | [optional] 
**ra_allowed** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_service_profile import LoRaWANServiceProfile

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANServiceProfile from a JSON string
lo_ra_wan_service_profile_instance = LoRaWANServiceProfile.from_json(json)
# print the JSON string representation of the object
print(LoRaWANServiceProfile.to_json())

# convert the object into a dict
lo_ra_wan_service_profile_dict = lo_ra_wan_service_profile_instance.to_dict()
# create an instance of LoRaWANServiceProfile from a dict
lo_ra_wan_service_profile_from_dict = LoRaWANServiceProfile.from_dict(lo_ra_wan_service_profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


