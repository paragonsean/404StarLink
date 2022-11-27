# HoldoutActivity

Specifies the settings for a holdout activity in a journey. This type of activity stops a journey for a specified percentage of participants.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_activity** | **str** |  | [optional] 
**percentage** | **int** |  | 

## Example

```python
from openapi_client.models.holdout_activity import HoldoutActivity

# TODO update the JSON string below
json = "{}"
# create an instance of HoldoutActivity from a JSON string
holdout_activity_instance = HoldoutActivity.from_json(json)
# print the JSON string representation of the object
print(HoldoutActivity.to_json())

# convert the object into a dict
holdout_activity_dict = holdout_activity_instance.to_dict()
# create an instance of HoldoutActivity from a dict
holdout_activity_from_dict = HoldoutActivity.from_dict(holdout_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


