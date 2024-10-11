# SendDataToWirelessDeviceRequestWirelessMetadataSidewalk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seq** | **int** |  | [optional] 
**message_type** | [**MessageType**](MessageType.md) |  | [optional] 
**ack_mode_retry_duration_secs** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.send_data_to_wireless_device_request_wireless_metadata_sidewalk import SendDataToWirelessDeviceRequestWirelessMetadataSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of SendDataToWirelessDeviceRequestWirelessMetadataSidewalk from a JSON string
send_data_to_wireless_device_request_wireless_metadata_sidewalk_instance = SendDataToWirelessDeviceRequestWirelessMetadataSidewalk.from_json(json)
# print the JSON string representation of the object
print(SendDataToWirelessDeviceRequestWirelessMetadataSidewalk.to_json())

# convert the object into a dict
send_data_to_wireless_device_request_wireless_metadata_sidewalk_dict = send_data_to_wireless_device_request_wireless_metadata_sidewalk_instance.to_dict()
# create an instance of SendDataToWirelessDeviceRequestWirelessMetadataSidewalk from a dict
send_data_to_wireless_device_request_wireless_metadata_sidewalk_from_dict = SendDataToWirelessDeviceRequestWirelessMetadataSidewalk.from_dict(send_data_to_wireless_device_request_wireless_metadata_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


