# LoopTimes

Loop action combines a set of actions and executes it as many times as specified in the \"times\" parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[Action]**](Action.md) | list of actions combined in the loop are executed step-by-step | [optional] [default to []]
**times** | **float** | the number of times to execute the wrapped actions within the &#39;loop .. times&#39; construction. | [optional] 

## Example

```python
from openapi_client.models.loop_times import LoopTimes

# TODO update the JSON string below
json = "{}"
# create an instance of LoopTimes from a JSON string
loop_times_instance = LoopTimes.from_json(json)
# print the JSON string representation of the object
print(LoopTimes.to_json())

# convert the object into a dict
loop_times_dict = loop_times_instance.to_dict()
# create an instance of LoopTimes from a dict
loop_times_from_dict = LoopTimes.from_dict(loop_times_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


