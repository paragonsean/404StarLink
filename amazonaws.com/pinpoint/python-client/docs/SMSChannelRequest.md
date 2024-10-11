# SMSChannelRequest

Specifies the status and settings of the SMS channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**short_code** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sms_channel_request import SMSChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SMSChannelRequest from a JSON string
sms_channel_request_instance = SMSChannelRequest.from_json(json)
# print the JSON string representation of the object
print(SMSChannelRequest.to_json())

# convert the object into a dict
sms_channel_request_dict = sms_channel_request_instance.to_dict()
# create an instance of SMSChannelRequest from a dict
sms_channel_request_from_dict = SMSChannelRequest.from_dict(sms_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


