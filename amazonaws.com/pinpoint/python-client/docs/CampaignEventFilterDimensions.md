# CampaignEventFilterDimensions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**event_type** | [**EventDimensionsEventType**](EventDimensionsEventType.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_event_filter_dimensions import CampaignEventFilterDimensions

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignEventFilterDimensions from a JSON string
campaign_event_filter_dimensions_instance = CampaignEventFilterDimensions.from_json(json)
# print the JSON string representation of the object
print(CampaignEventFilterDimensions.to_json())

# convert the object into a dict
campaign_event_filter_dimensions_dict = campaign_event_filter_dimensions_instance.to_dict()
# create an instance of CampaignEventFilterDimensions from a dict
campaign_event_filter_dimensions_from_dict = CampaignEventFilterDimensions.from_dict(campaign_event_filter_dimensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


