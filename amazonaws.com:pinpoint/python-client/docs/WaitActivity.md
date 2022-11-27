# WaitActivity

Specifies the settings for a wait activity in a journey. This type of activity waits for a certain amount of time or until a specific date and time before moving participants to the next activity in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_activity** | **str** |  | [optional] 
**wait_time** | [**WaitActivityWaitTime**](WaitActivityWaitTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.wait_activity import WaitActivity

# TODO update the JSON string below
json = "{}"
# create an instance of WaitActivity from a JSON string
wait_activity_instance = WaitActivity.from_json(json)
# print the JSON string representation of the object
print(WaitActivity.to_json())

# convert the object into a dict
wait_activity_dict = wait_activity_instance.to_dict()
# create an instance of WaitActivity from a dict
wait_activity_from_dict = WaitActivity.from_dict(wait_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


