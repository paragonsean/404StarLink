# CampaignResponse

Provides information about the status, configuration, and other settings for a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_treatments** | **List** |  | [optional] 
**application_id** | **str** |  | 
**arn** | **str** |  | 
**creation_date** | **str** |  | 
**custom_delivery_configuration** | [**CampaignResponseCustomDeliveryConfiguration**](CampaignResponseCustomDeliveryConfiguration.md) |  | [optional] 
**default_state** | [**CampaignResponseDefaultState**](CampaignResponseDefaultState.md) |  | [optional] 
**description** | **str** |  | [optional] 
**holdout_percent** | **int** |  | [optional] 
**hook** | [**CampaignResponseHook**](CampaignResponseHook.md) |  | [optional] 
**id** | **str** |  | 
**is_paused** | **bool** |  | [optional] 
**last_modified_date** | **str** |  | 
**limits** | [**CreateCampaignRequestWriteCampaignRequestLimits**](CreateCampaignRequestWriteCampaignRequestLimits.md) |  | [optional] 
**message_configuration** | [**CreateCampaignRequestWriteCampaignRequestMessageConfiguration**](CreateCampaignRequestWriteCampaignRequestMessageConfiguration.md) |  | [optional] 
**name** | **str** |  | [optional] 
**schedule** | [**CreateCampaignRequestWriteCampaignRequestSchedule**](CreateCampaignRequestWriteCampaignRequestSchedule.md) |  | [optional] 
**segment_id** | **str** |  | 
**segment_version** | **int** |  | 
**state** | [**CampaignResponseState**](CampaignResponseState.md) |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_configuration** | [**CampaignResponseTemplateConfiguration**](CampaignResponseTemplateConfiguration.md) |  | [optional] 
**treatment_description** | **str** |  | [optional] 
**treatment_name** | **str** |  | [optional] 
**version** | **int** |  | [optional] 
**priority** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.campaign_response import CampaignResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignResponse from a JSON string
campaign_response_instance = CampaignResponse.from_json(json)
# print the JSON string representation of the object
print(CampaignResponse.to_json())

# convert the object into a dict
campaign_response_dict = campaign_response_instance.to_dict()
# create an instance of CampaignResponse from a dict
campaign_response_from_dict = CampaignResponse.from_dict(campaign_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


