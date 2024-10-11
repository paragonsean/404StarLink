# CampaignInAppMessage

In-app message configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**content** | **List** |  | [optional] 
**custom_config** | **Dict** |  | [optional] 
**layout** | [**Layout**](Layout.md) |  | [optional] 

## Example

```python
from openapi_client.models.campaign_in_app_message import CampaignInAppMessage

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignInAppMessage from a JSON string
campaign_in_app_message_instance = CampaignInAppMessage.from_json(json)
# print the JSON string representation of the object
print(CampaignInAppMessage.to_json())

# convert the object into a dict
campaign_in_app_message_dict = campaign_in_app_message_instance.to_dict()
# create an instance of CampaignInAppMessage from a dict
campaign_in_app_message_from_dict = CampaignInAppMessage.from_dict(campaign_in_app_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


