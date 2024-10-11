# CreateWirelessDeviceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The wireless device type. | 
**name** | **str** | The name of the new resource. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**destination_name** | **str** | The name of the destination to assign to the new wireless device. | 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 
**lo_ra_wan** | [**CreateWirelessDeviceRequestLoRaWAN**](CreateWirelessDeviceRequestLoRaWAN.md) |  | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 
**positioning** | **str** | FPort values for the GNSS, stream, and ClockSync functions of the positioning information. | [optional] 
**sidewalk** | [**CreateWirelessDeviceRequestSidewalk**](CreateWirelessDeviceRequestSidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_wireless_device_request import CreateWirelessDeviceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWirelessDeviceRequest from a JSON string
create_wireless_device_request_instance = CreateWirelessDeviceRequest.from_json(json)
# print the JSON string representation of the object
print(CreateWirelessDeviceRequest.to_json())

# convert the object into a dict
create_wireless_device_request_dict = create_wireless_device_request_instance.to_dict()
# create an instance of CreateWirelessDeviceRequest from a dict
create_wireless_device_request_from_dict = CreateWirelessDeviceRequest.from_dict(create_wireless_device_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


