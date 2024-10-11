# SidewalkSendDataToDevice

Information about a Sidewalk router.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seq** | **int** |  | [optional] 
**message_type** | [**MessageType**](MessageType.md) |  | [optional] 
**ack_mode_retry_duration_secs** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_send_data_to_device import SidewalkSendDataToDevice

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkSendDataToDevice from a JSON string
sidewalk_send_data_to_device_instance = SidewalkSendDataToDevice.from_json(json)
# print the JSON string representation of the object
print(SidewalkSendDataToDevice.to_json())

# convert the object into a dict
sidewalk_send_data_to_device_dict = sidewalk_send_data_to_device_instance.to_dict()
# create an instance of SidewalkSendDataToDevice from a dict
sidewalk_send_data_to_device_from_dict = SidewalkSendDataToDevice.from_dict(sidewalk_send_data_to_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


