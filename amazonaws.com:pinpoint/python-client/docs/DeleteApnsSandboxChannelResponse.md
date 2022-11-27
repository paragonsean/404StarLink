# DeleteApnsSandboxChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apns_sandbox_channel_response** | [**APNSSandboxChannelResponse**](APNSSandboxChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_apns_sandbox_channel_response import DeleteApnsSandboxChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteApnsSandboxChannelResponse from a JSON string
delete_apns_sandbox_channel_response_instance = DeleteApnsSandboxChannelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteApnsSandboxChannelResponse.to_json())

# convert the object into a dict
delete_apns_sandbox_channel_response_dict = delete_apns_sandbox_channel_response_instance.to_dict()
# create an instance of DeleteApnsSandboxChannelResponse from a dict
delete_apns_sandbox_channel_response_from_dict = DeleteApnsSandboxChannelResponse.from_dict(delete_apns_sandbox_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


