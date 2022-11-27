# UpdateGcmChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gcm_channel_response** | [**GCMChannelResponse**](GCMChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.update_gcm_channel_response import UpdateGcmChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateGcmChannelResponse from a JSON string
update_gcm_channel_response_instance = UpdateGcmChannelResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateGcmChannelResponse.to_json())

# convert the object into a dict
update_gcm_channel_response_dict = update_gcm_channel_response_instance.to_dict()
# create an instance of UpdateGcmChannelResponse from a dict
update_gcm_channel_response_from_dict = UpdateGcmChannelResponse.from_dict(update_gcm_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


