# CampaignCustomMessage

Specifies the contents of a message that's sent through a custom channel to recipients of a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_custom_message import CampaignCustomMessage

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignCustomMessage from a JSON string
campaign_custom_message_instance = CampaignCustomMessage.from_json(json)
# print the JSON string representation of the object
print(CampaignCustomMessage.to_json())

# convert the object into a dict
campaign_custom_message_dict = campaign_custom_message_instance.to_dict()
# create an instance of CampaignCustomMessage from a dict
campaign_custom_message_from_dict = CampaignCustomMessage.from_dict(campaign_custom_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


