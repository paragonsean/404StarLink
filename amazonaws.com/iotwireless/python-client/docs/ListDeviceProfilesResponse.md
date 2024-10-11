# ListDeviceProfilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**device_profile_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_device_profiles_response import ListDeviceProfilesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListDeviceProfilesResponse from a JSON string
list_device_profiles_response_instance = ListDeviceProfilesResponse.from_json(json)
# print the JSON string representation of the object
print(ListDeviceProfilesResponse.to_json())

# convert the object into a dict
list_device_profiles_response_dict = list_device_profiles_response_instance.to_dict()
# create an instance of ListDeviceProfilesResponse from a dict
list_device_profiles_response_from_dict = ListDeviceProfilesResponse.from_dict(list_device_profiles_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


