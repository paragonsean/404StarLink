# CampaignEmailMessage

Specifies the content and \"From\" address for an email message that's sent to recipients of a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**from_address** | **str** |  | [optional] 
**html_body** | **str** |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_email_message import CampaignEmailMessage

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignEmailMessage from a JSON string
campaign_email_message_instance = CampaignEmailMessage.from_json(json)
# print the JSON string representation of the object
print(CampaignEmailMessage.to_json())

# convert the object into a dict
campaign_email_message_dict = campaign_email_message_instance.to_dict()
# create an instance of CampaignEmailMessage from a dict
campaign_email_message_from_dict = CampaignEmailMessage.from_dict(campaign_email_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


