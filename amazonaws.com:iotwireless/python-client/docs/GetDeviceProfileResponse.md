# GetDeviceProfileResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**lo_ra_wan** | [**GetDeviceProfileResponseLoRaWAN**](GetDeviceProfileResponseLoRaWAN.md) |  | [optional] 
**sidewalk** | [**GetDeviceProfileResponseSidewalk**](GetDeviceProfileResponseSidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_device_profile_response import GetDeviceProfileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetDeviceProfileResponse from a JSON string
get_device_profile_response_instance = GetDeviceProfileResponse.from_json(json)
# print the JSON string representation of the object
print(GetDeviceProfileResponse.to_json())

# convert the object into a dict
get_device_profile_response_dict = get_device_profile_response_instance.to_dict()
# create an instance of GetDeviceProfileResponse from a dict
get_device_profile_response_from_dict = GetDeviceProfileResponse.from_dict(get_device_profile_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


