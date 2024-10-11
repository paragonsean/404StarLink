# CreateWirelessDeviceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_wireless_device_response import CreateWirelessDeviceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessDeviceResponse from a JSON string
create_wireless_device_response_instance = CreateWirelessDeviceResponse.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessDeviceResponse.to_json())

# convert the object into a dict
create_wireless_device_response_dict = create_wireless_device_response_instance.to_dict()
# create an instance of CreateWirelessDeviceResponse from a dict
create_wireless_device_response_from_dict = CreateWirelessDeviceResponse.from_dict(create_wireless_device_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


