# UpdateApnsVoipChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_voip_channel_request** | [**UpdateApnsVoipChannelRequestAPNSVoipChannelRequest**](UpdateApnsVoipChannelRequestAPNSVoipChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_apns_voip_channel_request import UpdateApnsVoipChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateApnsVoipChannelRequest from a JSON string
update_apns_voip_channel_request_instance = UpdateApnsVoipChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateApnsVoipChannelRequest.to_json())

# convert the object into a dict
update_apns_voip_channel_request_dict = update_apns_voip_channel_request_instance.to_dict()
# create an instance of UpdateApnsVoipChannelRequest from a dict
update_apns_voip_channel_request_from_dict = UpdateApnsVoipChannelRequest.from_dict(update_apns_voip_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


