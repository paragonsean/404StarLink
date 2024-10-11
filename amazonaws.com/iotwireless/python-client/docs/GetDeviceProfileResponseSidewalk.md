# GetDeviceProfileResponseSidewalk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_server_public_key** | **str** |  | [optional] 
**qualification_status** | **bool** |  | [optional] 
**dak_certificate_metadata** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.get_device_profile_response_sidewalk import GetDeviceProfileResponseSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of GetDeviceProfileResponseSidewalk from a JSON string
get_device_profile_response_sidewalk_instance = GetDeviceProfileResponseSidewalk.from_json(json)
# print the JSON string representation of the object
print(GetDeviceProfileResponseSidewalk.to_json())

# convert the object into a dict
get_device_profile_response_sidewalk_dict = get_device_profile_response_sidewalk_instance.to_dict()
# create an instance of GetDeviceProfileResponseSidewalk from a dict
get_device_profile_response_sidewalk_from_dict = GetDeviceProfileResponseSidewalk.from_dict(get_device_profile_response_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


