# UpdateSmsChannelRequestSMSChannelRequest

Specifies the status and settings of the SMS channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**short_code** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_sms_channel_request_sms_channel_request import UpdateSmsChannelRequestSMSChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSmsChannelRequestSMSChannelRequest from a JSON string
update_sms_channel_request_sms_channel_request_instance = UpdateSmsChannelRequestSMSChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateSmsChannelRequestSMSChannelRequest.to_json())

# convert the object into a dict
update_sms_channel_request_sms_channel_request_dict = update_sms_channel_request_sms_channel_request_instance.to_dict()
# create an instance of UpdateSmsChannelRequestSMSChannelRequest from a dict
update_sms_channel_request_sms_channel_request_from_dict = UpdateSmsChannelRequestSMSChannelRequest.from_dict(update_sms_channel_request_sms_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


