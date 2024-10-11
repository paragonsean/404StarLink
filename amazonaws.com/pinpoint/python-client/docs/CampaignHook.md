# CampaignHook

Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lambda_function_name** | **str** |  | [optional] 
**mode** | [**Mode**](Mode.md) |  | [optional] 
**web_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_hook import CampaignHook

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignHook from a JSON string
campaign_hook_instance = CampaignHook.from_json(json)
# print the JSON string representation of the object
print(CampaignHook.to_json())

# convert the object into a dict
campaign_hook_dict = campaign_hook_instance.to_dict()
# create an instance of CampaignHook from a dict
campaign_hook_from_dict = CampaignHook.from_dict(campaign_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


