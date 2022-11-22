# SidewalkGetDeviceProfile

Gets information about a Sidewalk device profile.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_server_public_key** | **str** |  | [optional] 
**qualification_status** | **bool** |  | [optional] 
**dak_certificate_metadata** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_get_device_profile import SidewalkGetDeviceProfile

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkGetDeviceProfile from a JSON string
sidewalk_get_device_profile_instance = SidewalkGetDeviceProfile.from_json(json)
# print the JSON string representation of the object
print(SidewalkGetDeviceProfile.to_json())

# convert the object into a dict
sidewalk_get_device_profile_dict = sidewalk_get_device_profile_instance.to_dict()
# create an instance of SidewalkGetDeviceProfile from a dict
sidewalk_get_device_profile_from_dict = SidewalkGetDeviceProfile.from_dict(sidewalk_get_device_profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


