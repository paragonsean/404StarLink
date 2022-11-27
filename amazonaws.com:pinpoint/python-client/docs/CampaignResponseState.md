# CampaignResponseState


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_status** | [**CampaignStatus**](CampaignStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.campaign_response_state import CampaignResponseState

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignResponseState from a JSON string
campaign_response_state_instance = CampaignResponseState.from_json(json)
# print the JSON string representation of the object
print(CampaignResponseState.to_json())

# convert the object into a dict
campaign_response_state_dict = campaign_response_state_instance.to_dict()
# create an instance of CampaignResponseState from a dict
campaign_response_state_from_dict = CampaignResponseState.from_dict(campaign_response_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


