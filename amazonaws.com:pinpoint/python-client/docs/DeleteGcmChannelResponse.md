# DeleteGcmChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gcm_channel_response** | [**GCMChannelResponse**](GCMChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_gcm_channel_response import DeleteGcmChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteGcmChannelResponse from a JSON string
delete_gcm_channel_response_instance = DeleteGcmChannelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteGcmChannelResponse.to_json())

# convert the object into a dict
delete_gcm_channel_response_dict = delete_gcm_channel_response_instance.to_dict()
# create an instance of DeleteGcmChannelResponse from a dict
delete_gcm_channel_response_from_dict = DeleteGcmChannelResponse.from_dict(delete_gcm_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


