# GetGcmChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gcm_channel_response** | [**GCMChannelResponse**](GCMChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.get_gcm_channel_response import GetGcmChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetGcmChannelResponse from a JSON string
get_gcm_channel_response_instance = GetGcmChannelResponse.from_json(json)
# print the JSON string representation of the object
print(GetGcmChannelResponse.to_json())

# convert the object into a dict
get_gcm_channel_response_dict = get_gcm_channel_response_instance.to_dict()
# create an instance of GetGcmChannelResponse from a dict
get_gcm_channel_response_from_dict = GetGcmChannelResponse.from_dict(get_gcm_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


