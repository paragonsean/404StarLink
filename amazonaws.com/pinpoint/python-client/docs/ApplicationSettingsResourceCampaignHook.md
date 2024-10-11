# ApplicationSettingsResourceCampaignHook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lambda_function_name** | **str** |  | [optional] 
**mode** | [**Mode**](Mode.md) |  | [optional] 
**web_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.application_settings_resource_campaign_hook import ApplicationSettingsResourceCampaignHook

# TODO update the JSON string below
json = "{}"
# create an instance of ApplicationSettingsResourceCampaignHook from a JSON string
application_settings_resource_campaign_hook_instance = ApplicationSettingsResourceCampaignHook.from_json(json)
# print the JSON string representation of the object
print(ApplicationSettingsResourceCampaignHook.to_json())

# convert the object into a dict
application_settings_resource_campaign_hook_dict = application_settings_resource_campaign_hook_instance.to_dict()
# create an instance of ApplicationSettingsResourceCampaignHook from a dict
application_settings_resource_campaign_hook_from_dict = ApplicationSettingsResourceCampaignHook.from_dict(application_settings_resource_campaign_hook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


