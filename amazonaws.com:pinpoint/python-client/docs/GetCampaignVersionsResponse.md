# GetCampaignVersionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaigns_response** | [**CampaignsResponse**](CampaignsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_campaign_versions_response import GetCampaignVersionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignVersionsResponse from a JSON string
get_campaign_versions_response_instance = GetCampaignVersionsResponse.from_json(json)
# print the JSON string representation of the object
print(GetCampaignVersionsResponse.to_json())

# convert the object into a dict
get_campaign_versions_response_dict = get_campaign_versions_response_instance.to_dict()
# create an instance of GetCampaignVersionsResponse from a dict
get_campaign_versions_response_from_dict = GetCampaignVersionsResponse.from_dict(get_campaign_versions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


