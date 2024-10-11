# GetCampaignVersionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_response** | [**CampaignResponse**](CampaignResponse.md) |  | 

## Example

```python
from openapi_client.models.get_campaign_version_response import GetCampaignVersionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignVersionResponse from a JSON string
get_campaign_version_response_instance = GetCampaignVersionResponse.from_json(json)
# print the JSON string representation of the object
print(GetCampaignVersionResponse.to_json())

# convert the object into a dict
get_campaign_version_response_dict = get_campaign_version_response_instance.to_dict()
# create an instance of GetCampaignVersionResponse from a dict
get_campaign_version_response_from_dict = GetCampaignVersionResponse.from_dict(get_campaign_version_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


