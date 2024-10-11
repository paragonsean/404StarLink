# ActivityWait


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_activity** | **str** |  | [optional] 
**wait_time** | [**WaitActivityWaitTime**](WaitActivityWaitTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.activity_wait import ActivityWait

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityWait from a JSON string
activity_wait_instance = ActivityWait.from_json(json)
# print the JSON string representation of the object
print(ActivityWait.to_json())

# convert the object into a dict
activity_wait_dict = activity_wait_instance.to_dict()
# create an instance of ActivityWait from a dict
activity_wait_from_dict = ActivityWait.from_dict(activity_wait_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


