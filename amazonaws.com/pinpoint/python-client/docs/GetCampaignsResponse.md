# GetCampaignsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaigns_response** | [**CampaignsResponse**](CampaignsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_campaigns_response import GetCampaignsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignsResponse from a JSON string
get_campaigns_response_instance = GetCampaignsResponse.from_json(json)
# print the JSON string representation of the object
print(GetCampaignsResponse.to_json())

# convert the object into a dict
get_campaigns_response_dict = get_campaigns_response_instance.to_dict()
# create an instance of GetCampaignsResponse from a dict
get_campaigns_response_from_dict = GetCampaignsResponse.from_dict(get_campaigns_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


