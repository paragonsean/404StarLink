# UpdateApnsChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_channel_response** | [**APNSChannelResponse**](APNSChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.update_apns_channel_response import UpdateApnsChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateApnsChannelResponse from a JSON string
update_apns_channel_response_instance = UpdateApnsChannelResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateApnsChannelResponse.to_json())

# convert the object into a dict
update_apns_channel_response_dict = update_apns_channel_response_instance.to_dict()
# create an instance of UpdateApnsChannelResponse from a dict
update_apns_channel_response_from_dict = UpdateApnsChannelResponse.from_dict(update_apns_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


