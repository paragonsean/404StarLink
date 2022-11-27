# CampaignDateRangeKpiResponse

Provides the results of a query that retrieved the data for a standard metric that applies to a campaign, and provides information about that query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**campaign_id** | **str** |  | 
**end_time** | **datetime** |  | 
**kpi_name** | **str** |  | 
**kpi_result** | [**ApplicationDateRangeKpiResponseKpiResult**](ApplicationDateRangeKpiResponseKpiResult.md) |  | 
**next_token** | **str** |  | [optional] 
**start_time** | **datetime** |  | 

## Example

```python
from openapi_client.models.campaign_date_range_kpi_response import CampaignDateRangeKpiResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignDateRangeKpiResponse from a JSON string
campaign_date_range_kpi_response_instance = CampaignDateRangeKpiResponse.from_json(json)
# print the JSON string representation of the object
print(CampaignDateRangeKpiResponse.to_json())

# convert the object into a dict
campaign_date_range_kpi_response_dict = campaign_date_range_kpi_response_instance.to_dict()
# create an instance of CampaignDateRangeKpiResponse from a dict
campaign_date_range_kpi_response_from_dict = CampaignDateRangeKpiResponse.from_dict(campaign_date_range_kpi_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


