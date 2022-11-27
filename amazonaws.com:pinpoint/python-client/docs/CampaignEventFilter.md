# CampaignEventFilter

Specifies the settings for events that cause a campaign to be sent.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | [**CampaignEventFilterDimensions**](CampaignEventFilterDimensions.md) |  | 
**filter_type** | [**FilterType**](FilterType.md) |  | 

## Example

```python
from openapi_client.models.campaign_event_filter import CampaignEventFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignEventFilter from a JSON string
campaign_event_filter_instance = CampaignEventFilter.from_json(json)
# print the JSON string representation of the object
print(CampaignEventFilter.to_json())

# convert the object into a dict
campaign_event_filter_dict = campaign_event_filter_instance.to_dict()
# create an instance of CampaignEventFilter from a dict
campaign_event_filter_from_dict = CampaignEventFilter.from_dict(campaign_event_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


