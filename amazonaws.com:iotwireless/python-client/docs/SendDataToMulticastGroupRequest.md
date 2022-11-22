# SendDataToMulticastGroupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payload_data** | **str** | The binary to be sent to the end device, encoded in base64. | 
**wireless_metadata** | [**SendDataToMulticastGroupRequestWirelessMetadata**](SendDataToMulticastGroupRequestWirelessMetadata.md) |  | 

## Example

```python
from openapi_client.models.send_data_to_multicast_group_request import SendDataToMulticastGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendDataToMulticastGroupRequest from a JSON string
send_data_to_multicast_group_request_instance = SendDataToMulticastGroupRequest.from_json(json)
# print the JSON string representation of the object
print(SendDataToMulticastGroupRequest.to_json())

# convert the object into a dict
send_data_to_multicast_group_request_dict = send_data_to_multicast_group_request_instance.to_dict()
# create an instance of SendDataToMulticastGroupRequest from a dict
send_data_to_multicast_group_request_from_dict = SendDataToMulticastGroupRequest.from_dict(send_data_to_multicast_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


