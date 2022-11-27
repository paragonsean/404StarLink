# DeleteApnsVoipChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_voip_channel_response** | [**APNSVoipChannelResponse**](APNSVoipChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_apns_voip_channel_response import DeleteApnsVoipChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteApnsVoipChannelResponse from a JSON string
delete_apns_voip_channel_response_instance = DeleteApnsVoipChannelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteApnsVoipChannelResponse.to_json())

# convert the object into a dict
delete_apns_voip_channel_response_dict = delete_apns_voip_channel_response_instance.to_dict()
# create an instance of DeleteApnsVoipChannelResponse from a dict
delete_apns_voip_channel_response_from_dict = DeleteApnsVoipChannelResponse.from_dict(delete_apns_voip_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


