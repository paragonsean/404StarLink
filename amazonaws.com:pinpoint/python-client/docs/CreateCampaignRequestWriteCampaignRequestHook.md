# CreateCampaignRequestWriteCampaignRequestHook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lambda_function_name** | **str** |  | [optional] 
**mode** | [**Mode**](Mode.md) |  | [optional] 
**web_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_campaign_request_write_campaign_request_hook import CreateCampaignRequestWriteCampaignRequestHook

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCampaignRequestWriteCampaignRequestHook from a JSON string
create_campaign_request_write_campaign_request_hook_instance = CreateCampaignRequestWriteCampaignRequestHook.from_json(json)
# print the JSON string representation of the object
print(CreateCampaignRequestWriteCampaignRequestHook.to_json())

# convert the object into a dict
create_campaign_request_write_campaign_request_hook_dict = create_campaign_request_write_campaign_request_hook_instance.to_dict()
# create an instance of CreateCampaignRequestWriteCampaignRequestHook from a dict
create_campaign_request_write_campaign_request_hook_from_dict = CreateCampaignRequestWriteCampaignRequestHook.from_dict(create_campaign_request_write_campaign_request_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


