# SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**f_port** | **int** | The Fport value. | [optional] 
**participating_gateways** | [**LoRaWANSendDataToDeviceParticipatingGateways**](LoRaWANSendDataToDeviceParticipatingGateways.md) |  | [optional] 

## Example

```python
from openapi_client.models.send_data_to_wireless_device_request_wireless_metadata_lo_ra_wan import SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN from a JSON string
send_data_to_wireless_device_request_wireless_metadata_lo_ra_wan_instance = SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN.to_json())

# convert the object into a dict
send_data_to_wireless_device_request_wireless_metadata_lo_ra_wan_dict = send_data_to_wireless_device_request_wireless_metadata_lo_ra_wan_instance.to_dict()
# create an instance of SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN from a dict
send_data_to_wireless_device_request_wireless_metadata_lo_ra_wan_from_dict = SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN.from_dict(send_data_to_wireless_device_request_wireless_metadata_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


