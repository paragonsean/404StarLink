# CampaignSmsMessage

Specifies the content and settings for an SMS message that's sent to recipients of a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**message_type** | [**MessageType**](MessageType.md) |  | [optional] 
**origination_number** | **str** |  | [optional] 
**sender_id** | **str** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**template_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_sms_message import CampaignSmsMessage

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignSmsMessage from a JSON string
campaign_sms_message_instance = CampaignSmsMessage.from_json(json)
# print the JSON string representation of the object
print(CampaignSmsMessage.to_json())

# convert the object into a dict
campaign_sms_message_dict = campaign_sms_message_instance.to_dict()
# create an instance of CampaignSmsMessage from a dict
campaign_sms_message_from_dict = CampaignSmsMessage.from_dict(campaign_sms_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


