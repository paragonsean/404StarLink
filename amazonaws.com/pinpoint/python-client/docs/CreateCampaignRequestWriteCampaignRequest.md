# CreateCampaignRequestWriteCampaignRequest

Specifies the configuration and other settings for a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_treatments** | **List** |  | [optional] 
**custom_delivery_configuration** | [**CreateCampaignRequestWriteCampaignRequestCustomDeliveryConfiguration**](CreateCampaignRequestWriteCampaignRequestCustomDeliveryConfiguration.md) |  | [optional] 
**description** | **str** |  | [optional] 
**holdout_percent** | **int** |  | [optional] 
**hook** | [**CreateCampaignRequestWriteCampaignRequestHook**](CreateCampaignRequestWriteCampaignRequestHook.md) |  | [optional] 
**is_paused** | **bool** |  | [optional] 
**limits** | [**CreateCampaignRequestWriteCampaignRequestLimits**](CreateCampaignRequestWriteCampaignRequestLimits.md) |  | [optional] 
**message_configuration** | [**CreateCampaignRequestWriteCampaignRequestMessageConfiguration**](CreateCampaignRequestWriteCampaignRequestMessageConfiguration.md) |  | [optional] 
**name** | **str** |  | [optional] 
**schedule** | [**CreateCampaignRequestWriteCampaignRequestSchedule**](CreateCampaignRequestWriteCampaignRequestSchedule.md) |  | [optional] 
**segment_id** | **str** |  | [optional] 
**segment_version** | **int** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_configuration** | [**CreateCampaignRequestWriteCampaignRequestTemplateConfiguration**](CreateCampaignRequestWriteCampaignRequestTemplateConfiguration.md) |  | [optional] 
**treatment_description** | **str** |  | [optional] 
**treatment_name** | **str** |  | [optional] 
**priority** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.create_campaign_request_write_campaign_request import CreateCampaignRequestWriteCampaignRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCampaignRequestWriteCampaignRequest from a JSON string
create_campaign_request_write_campaign_request_instance = CreateCampaignRequestWriteCampaignRequest.from_json(json)
# print the JSON string representation of the object
print(CreateCampaignRequestWriteCampaignRequest.to_json())

# convert the object into a dict
create_campaign_request_write_campaign_request_dict = create_campaign_request_write_campaign_request_instance.to_dict()
# create an instance of CreateCampaignRequestWriteCampaignRequest from a dict
create_campaign_request_write_campaign_request_from_dict = CreateCampaignRequestWriteCampaignRequest.from_dict(create_campaign_request_write_campaign_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


