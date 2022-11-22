# DownlinkQueueMessage

The message in the downlink queue.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_id** | **str** |  | [optional] 
**transmit_mode** | **int** |  | [optional] 
**received_at** | **str** |  | [optional] 
**lo_ra_wan** | [**LoRaWANSendDataToDevice**](LoRaWANSendDataToDevice.md) |  | [optional] 

## Example

```python
from openapi_client.models.downlink_queue_message import DownlinkQueueMessage

# TODO update the JSON string below
json = "{}"
# create an instance of DownlinkQueueMessage from a JSON string
downlink_queue_message_instance = DownlinkQueueMessage.from_json(json)
# print the JSON string representation of the object
print(DownlinkQueueMessage.to_json())

# convert the object into a dict
downlink_queue_message_dict = downlink_queue_message_instance.to_dict()
# create an instance of DownlinkQueueMessage from a dict
downlink_queue_message_from_dict = DownlinkQueueMessage.from_dict(downlink_queue_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


