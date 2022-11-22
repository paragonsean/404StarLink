# CreateDeviceProfileResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_device_profile_response import CreateDeviceProfileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeviceProfileResponse from a JSON string
create_device_profile_response_instance = CreateDeviceProfileResponse.from_json(json)
# print the JSON string representation of the object
print(CreateDeviceProfileResponse.to_json())

# convert the object into a dict
create_device_profile_response_dict = create_device_profile_response_instance.to_dict()
# create an instance of CreateDeviceProfileResponse from a dict
create_device_profile_response_from_dict = CreateDeviceProfileResponse.from_dict(create_device_profile_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


