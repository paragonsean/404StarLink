# CampaignLimits

For a campaign, specifies limits on the messages that the campaign can send. For an application, specifies the default limits for messages that campaigns in the application can send.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily** | **int** |  | [optional] 
**maximum_duration** | **int** |  | [optional] 
**messages_per_second** | **int** |  | [optional] 
**total** | **int** |  | [optional] 
**session** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_limits import CampaignLimits

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignLimits from a JSON string
campaign_limits_instance = CampaignLimits.from_json(json)
# print the JSON string representation of the object
print(CampaignLimits.to_json())

# convert the object into a dict
campaign_limits_dict = campaign_limits_instance.to_dict()
# create an instance of CampaignLimits from a dict
campaign_limits_from_dict = CampaignLimits.from_dict(campaign_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


