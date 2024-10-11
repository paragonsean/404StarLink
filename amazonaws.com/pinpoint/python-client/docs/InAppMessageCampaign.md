# InAppMessageCampaign

Targeted in-app message campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **str** |  | [optional] 
**daily_cap** | **int** |  | [optional] 
**in_app_message** | [**InAppMessageCampaignInAppMessage**](InAppMessageCampaignInAppMessage.md) |  | [optional] 
**priority** | **int** |  | [optional] 
**schedule** | [**InAppMessageCampaignSchedule**](InAppMessageCampaignSchedule.md) |  | [optional] 
**session_cap** | **int** |  | [optional] 
**total_cap** | **int** |  | [optional] 
**treatment_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.in_app_message_campaign import InAppMessageCampaign

# TODO update the JSON string below
json = "{}"
# create an instance of InAppMessageCampaign from a JSON string
in_app_message_campaign_instance = InAppMessageCampaign.from_json(json)
# print the JSON string representation of the object
print(InAppMessageCampaign.to_json())

# convert the object into a dict
in_app_message_campaign_dict = in_app_message_campaign_instance.to_dict()
# create an instance of InAppMessageCampaign from a dict
in_app_message_campaign_from_dict = InAppMessageCampaign.from_dict(in_app_message_campaign_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


