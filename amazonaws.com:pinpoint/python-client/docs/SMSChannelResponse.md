# SMSChannelResponse

Provides information about the status and settings of the SMS channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**has_credential** | **bool** |  | [optional] 
**id** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_by** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**platform** | **str** |  | 
**promotional_messages_per_second** | **int** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**short_code** | **str** |  | [optional] 
**transactional_messages_per_second** | **int** |  | [optional] 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.sms_channel_response import SMSChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SMSChannelResponse from a JSON string
sms_channel_response_instance = SMSChannelResponse.from_json(json)
# print the JSON string representation of the object
print(SMSChannelResponse.to_json())

# convert the object into a dict
sms_channel_response_dict = sms_channel_response_instance.to_dict()
# create an instance of SMSChannelResponse from a dict
sms_channel_response_from_dict = SMSChannelResponse.from_dict(sms_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


