# CreateCampaignRequestWriteCampaignRequestLimits


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily** | **int** |  | [optional] 
**maximum_duration** | **int** |  | [optional] 
**messages_per_second** | **int** |  | [optional] 
**total** | **int** |  | [optional] 
**session** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.create_campaign_request_write_campaign_request_limits import CreateCampaignRequestWriteCampaignRequestLimits

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCampaignRequestWriteCampaignRequestLimits from a JSON string
create_campaign_request_write_campaign_request_limits_instance = CreateCampaignRequestWriteCampaignRequestLimits.from_json(json)
# print the JSON string representation of the object
print(CreateCampaignRequestWriteCampaignRequestLimits.to_json())

# convert the object into a dict
create_campaign_request_write_campaign_request_limits_dict = create_campaign_request_write_campaign_request_limits_instance.to_dict()
# create an instance of CreateCampaignRequestWriteCampaignRequestLimits from a dict
create_campaign_request_write_campaign_request_limits_from_dict = CreateCampaignRequestWriteCampaignRequestLimits.from_dict(create_campaign_request_write_campaign_request_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


