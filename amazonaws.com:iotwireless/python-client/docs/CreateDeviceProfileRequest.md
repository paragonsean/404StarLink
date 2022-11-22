# CreateDeviceProfileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the new resource. | [optional] 
**lo_ra_wan** | [**CreateDeviceProfileRequestLoRaWAN**](CreateDeviceProfileRequestLoRaWAN.md) |  | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 
**sidewalk** | **object** | Sidewalk object for creating a device profile. | [optional] 

## Example

```python
from openapi_client.models.create_device_profile_request import CreateDeviceProfileRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateDeviceProfileRequest from a JSON string
create_device_profile_request_instance = CreateDeviceProfileRequest.from_json(json)
# print the JSON string representation of the object
print(CreateDeviceProfileRequest.to_json())

# convert the object into a dict
create_device_profile_request_dict = create_device_profile_request_instance.to_dict()
# create an instance of CreateDeviceProfileRequest from a dict
create_device_profile_request_from_dict = CreateDeviceProfileRequest.from_dict(create_device_profile_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


