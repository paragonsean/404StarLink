# GetCampaignActivitiesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activities_response** | [**ActivitiesResponse**](ActivitiesResponse.md) |  | 

## Example

```python
from openapi_client.models.get_campaign_activities_response import GetCampaignActivitiesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignActivitiesResponse from a JSON string
get_campaign_activities_response_instance = GetCampaignActivitiesResponse.from_json(json)
# print the JSON string representation of the object
print(GetCampaignActivitiesResponse.to_json())

# convert the object into a dict
get_campaign_activities_response_dict = get_campaign_activities_response_instance.to_dict()
# create an instance of GetCampaignActivitiesResponse from a dict
get_campaign_activities_response_from_dict = GetCampaignActivitiesResponse.from_dict(get_campaign_activities_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


