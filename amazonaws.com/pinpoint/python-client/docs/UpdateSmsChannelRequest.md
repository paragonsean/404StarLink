# UpdateSmsChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sms_channel_request** | [**UpdateSmsChannelRequestSMSChannelRequest**](UpdateSmsChannelRequestSMSChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_sms_channel_request import UpdateSmsChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSmsChannelRequest from a JSON string
update_sms_channel_request_instance = UpdateSmsChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateSmsChannelRequest.to_json())

# convert the object into a dict
update_sms_channel_request_dict = update_sms_channel_request_instance.to_dict()
# create an instance of UpdateSmsChannelRequest from a dict
update_sms_channel_request_from_dict = UpdateSmsChannelRequest.from_dict(update_sms_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


