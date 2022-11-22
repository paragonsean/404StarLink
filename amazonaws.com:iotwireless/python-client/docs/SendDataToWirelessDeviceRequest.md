# SendDataToWirelessDeviceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transmit_mode** | **int** | The transmit mode to use to send data to the wireless device. Can be: &lt;code&gt;0&lt;/code&gt; for UM (unacknowledge mode) or &lt;code&gt;1&lt;/code&gt; for AM (acknowledge mode). | 
**payload_data** | **str** | The binary to be sent to the end device, encoded in base64. | 
**wireless_metadata** | [**SendDataToWirelessDeviceRequestWirelessMetadata**](SendDataToWirelessDeviceRequestWirelessMetadata.md) |  | [optional] 

## Example

```python
from openapi_client.models.send_data_to_wireless_device_request import SendDataToWirelessDeviceRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendDataToWirelessDeviceRequest from a JSON string
send_data_to_wireless_device_request_instance = SendDataToWirelessDeviceRequest.from_json(json)
# print the JSON string representation of the object
print(SendDataToWirelessDeviceRequest.to_json())

# convert the object into a dict
send_data_to_wireless_device_request_dict = send_data_to_wireless_device_request_instance.to_dict()
# create an instance of SendDataToWirelessDeviceRequest from a dict
send_data_to_wireless_device_request_from_dict = SendDataToWirelessDeviceRequest.from_dict(send_data_to_wireless_device_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


