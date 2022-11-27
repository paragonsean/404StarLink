# CampaignState

Provides information about the status of a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_status** | [**CampaignStatus**](CampaignStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.campaign_state import CampaignState

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignState from a JSON string
campaign_state_instance = CampaignState.from_json(json)
# print the JSON string representation of the object
print(CampaignState.to_json())

# convert the object into a dict
campaign_state_dict = campaign_state_instance.to_dict()
# create an instance of CampaignState from a dict
campaign_state_from_dict = CampaignState.from_dict(campaign_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


