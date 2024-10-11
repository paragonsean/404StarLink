# DeleteSmsChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sms_channel_response** | [**SMSChannelResponse**](SMSChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_sms_channel_response import DeleteSmsChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteSmsChannelResponse from a JSON string
delete_sms_channel_response_instance = DeleteSmsChannelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteSmsChannelResponse.to_json())

# convert the object into a dict
delete_sms_channel_response_dict = delete_sms_channel_response_instance.to_dict()
# create an instance of DeleteSmsChannelResponse from a dict
delete_sms_channel_response_from_dict = DeleteSmsChannelResponse.from_dict(delete_sms_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


