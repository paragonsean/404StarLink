# SendDataToWirelessDeviceRequestWirelessMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN**](SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN.md) |  | [optional] 
**sidewalk** | [**SendDataToWirelessDeviceRequestWirelessMetadataSidewalk**](SendDataToWirelessDeviceRequestWirelessMetadataSidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.send_data_to_wireless_device_request_wireless_metadata import SendDataToWirelessDeviceRequestWirelessMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of SendDataToWirelessDeviceRequestWirelessMetadata from a JSON string
send_data_to_wireless_device_request_wireless_metadata_instance = SendDataToWirelessDeviceRequestWirelessMetadata.from_json(json)
# print the JSON string representation of the object
print(SendDataToWirelessDeviceRequestWirelessMetadata.to_json())

# convert the object into a dict
send_data_to_wireless_device_request_wireless_metadata_dict = send_data_to_wireless_device_request_wireless_metadata_instance.to_dict()
# create an instance of SendDataToWirelessDeviceRequestWirelessMetadata from a dict
send_data_to_wireless_device_request_wireless_metadata_from_dict = SendDataToWirelessDeviceRequestWirelessMetadata.from_dict(send_data_to_wireless_device_request_wireless_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


