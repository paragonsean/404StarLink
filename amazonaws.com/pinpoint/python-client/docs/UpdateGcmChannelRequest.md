# UpdateGcmChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gcm_channel_request** | [**UpdateGcmChannelRequestGCMChannelRequest**](UpdateGcmChannelRequestGCMChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_gcm_channel_request import UpdateGcmChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateGcmChannelRequest from a JSON string
update_gcm_channel_request_instance = UpdateGcmChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateGcmChannelRequest.to_json())

# convert the object into a dict
update_gcm_channel_request_dict = update_gcm_channel_request_instance.to_dict()
# create an instance of UpdateGcmChannelRequest from a dict
update_gcm_channel_request_from_dict = UpdateGcmChannelRequest.from_dict(update_gcm_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


