# ActivityResponse

Provides information about an activity that was performed by a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**campaign_id** | **str** |  | 
**end** | **str** |  | [optional] 
**id** | **str** |  | 
**result** | **str** |  | [optional] 
**scheduled_start** | **str** |  | [optional] 
**start** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**successful_endpoint_count** | **int** |  | [optional] 
**timezones_completed_count** | **int** |  | [optional] 
**timezones_total_count** | **int** |  | [optional] 
**total_endpoint_count** | **int** |  | [optional] 
**treatment_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.activity_response import ActivityResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityResponse from a JSON string
activity_response_instance = ActivityResponse.from_json(json)
# print the JSON string representation of the object
print(ActivityResponse.to_json())

# convert the object into a dict
activity_response_dict = activity_response_instance.to_dict()
# create an instance of ActivityResponse from a dict
activity_response_from_dict = ActivityResponse.from_dict(activity_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


