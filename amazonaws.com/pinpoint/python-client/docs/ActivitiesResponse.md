# ActivitiesResponse

Provides information about the activities that were performed by a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.activities_response import ActivitiesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ActivitiesResponse from a JSON string
activities_response_instance = ActivitiesResponse.from_json(json)
# print the JSON string representation of the object
print(ActivitiesResponse.to_json())

# convert the object into a dict
activities_response_dict = activities_response_instance.to_dict()
# create an instance of ActivitiesResponse from a dict
activities_response_from_dict = ActivitiesResponse.from_dict(activities_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


