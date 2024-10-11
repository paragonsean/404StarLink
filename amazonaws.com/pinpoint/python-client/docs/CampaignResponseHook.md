# CampaignResponseHook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lambda_function_name** | **str** |  | [optional] 
**mode** | [**Mode**](Mode.md) |  | [optional] 
**web_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_response_hook import CampaignResponseHook

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignResponseHook from a JSON string
campaign_response_hook_instance = CampaignResponseHook.from_json(json)
# print the JSON string representation of the object
print(CampaignResponseHook.to_json())

# convert the object into a dict
campaign_response_hook_dict = campaign_response_hook_instance.to_dict()
# create an instance of CampaignResponseHook from a dict
campaign_response_hook_from_dict = CampaignResponseHook.from_dict(campaign_response_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


