# GetApnsSandboxChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_sandbox_channel_response** | [**APNSSandboxChannelResponse**](APNSSandboxChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.get_apns_sandbox_channel_response import GetApnsSandboxChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetApnsSandboxChannelResponse from a JSON string
get_apns_sandbox_channel_response_instance = GetApnsSandboxChannelResponse.from_json(json)
# print the JSON string representation of the object
print(GetApnsSandboxChannelResponse.to_json())

# convert the object into a dict
get_apns_sandbox_channel_response_dict = get_apns_sandbox_channel_response_instance.to_dict()
# create an instance of GetApnsSandboxChannelResponse from a dict
get_apns_sandbox_channel_response_from_dict = GetApnsSandboxChannelResponse.from_dict(get_apns_sandbox_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


