# GetSmsChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sms_channel_response** | [**SMSChannelResponse**](SMSChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.get_sms_channel_response import GetSmsChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSmsChannelResponse from a JSON string
get_sms_channel_response_instance = GetSmsChannelResponse.from_json(json)
# print the JSON string representation of the object
print(GetSmsChannelResponse.to_json())

# convert the object into a dict
get_sms_channel_response_dict = get_sms_channel_response_instance.to_dict()
# create an instance of GetSmsChannelResponse from a dict
get_sms_channel_response_from_dict = GetSmsChannelResponse.from_dict(get_sms_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


