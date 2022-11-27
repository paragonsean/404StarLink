# DeleteApnsChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_channel_response** | [**APNSChannelResponse**](APNSChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_apns_channel_response import DeleteApnsChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteApnsChannelResponse from a JSON string
delete_apns_channel_response_instance = DeleteApnsChannelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteApnsChannelResponse.to_json())

# convert the object into a dict
delete_apns_channel_response_dict = delete_apns_channel_response_instance.to_dict()
# create an instance of DeleteApnsChannelResponse from a dict
delete_apns_channel_response_from_dict = DeleteApnsChannelResponse.from_dict(delete_apns_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


