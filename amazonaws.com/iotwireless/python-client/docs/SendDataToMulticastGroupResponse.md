# SendDataToMulticastGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_id** | **str** | ID of a multicast group message. | [optional] 

## Example

```python
from openapi_client.models.send_data_to_multicast_group_response import SendDataToMulticastGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SendDataToMulticastGroupResponse from a JSON string
send_data_to_multicast_group_response_instance = SendDataToMulticastGroupResponse.from_json(json)
# print the JSON string representation of the object
print(SendDataToMulticastGroupResponse.to_json())

# convert the object into a dict
send_data_to_multicast_group_response_dict = send_data_to_multicast_group_response_instance.to_dict()
# create an instance of SendDataToMulticastGroupResponse from a dict
send_data_to_multicast_group_response_from_dict = SendDataToMulticastGroupResponse.from_dict(send_data_to_multicast_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


