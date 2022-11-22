# DeviceProfile

Describes a device profile.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.device_profile import DeviceProfile

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceProfile from a JSON string
device_profile_instance = DeviceProfile.from_json(json)
# print the JSON string representation of the object
print(DeviceProfile.to_json())

# convert the object into a dict
device_profile_dict = device_profile_instance.to_dict()
# create an instance of DeviceProfile from a dict
device_profile_from_dict = DeviceProfile.from_dict(device_profile_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


