# GetApnsVoipChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_voip_channel_response** | [**APNSVoipChannelResponse**](APNSVoipChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.get_apns_voip_channel_response import GetApnsVoipChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetApnsVoipChannelResponse from a JSON string
get_apns_voip_channel_response_instance = GetApnsVoipChannelResponse.from_json(json)
# print the JSON string representation of the object
print(GetApnsVoipChannelResponse.to_json())

# convert the object into a dict
get_apns_voip_channel_response_dict = get_apns_voip_channel_response_instance.to_dict()
# create an instance of GetApnsVoipChannelResponse from a dict
get_apns_voip_channel_response_from_dict = GetApnsVoipChannelResponse.from_dict(get_apns_voip_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


