# UpdateApnsChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_channel_request** | [**UpdateApnsChannelRequestAPNSChannelRequest**](UpdateApnsChannelRequestAPNSChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_apns_channel_request import UpdateApnsChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateApnsChannelRequest from a JSON string
update_apns_channel_request_instance = UpdateApnsChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateApnsChannelRequest.to_json())

# convert the object into a dict
update_apns_channel_request_dict = update_apns_channel_request_instance.to_dict()
# create an instance of UpdateApnsChannelRequest from a dict
update_apns_channel_request_from_dict = UpdateApnsChannelRequest.from_dict(update_apns_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


