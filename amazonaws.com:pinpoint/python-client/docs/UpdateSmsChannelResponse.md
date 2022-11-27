# UpdateSmsChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sms_channel_response** | [**SMSChannelResponse**](SMSChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.update_sms_channel_response import UpdateSmsChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSmsChannelResponse from a JSON string
update_sms_channel_response_instance = UpdateSmsChannelResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateSmsChannelResponse.to_json())

# convert the object into a dict
update_sms_channel_response_dict = update_sms_channel_response_instance.to_dict()
# create an instance of UpdateSmsChannelResponse from a dict
update_sms_channel_response_from_dict = UpdateSmsChannelResponse.from_dict(update_sms_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


