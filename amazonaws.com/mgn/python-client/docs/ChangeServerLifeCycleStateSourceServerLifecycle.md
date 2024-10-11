# ChangeServerLifeCycleStateSourceServerLifecycle

The request to change the source server migration lifecycle state.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**ChangeServerLifeCycleStateSourceServerLifecycleState**](ChangeServerLifeCycleStateSourceServerLifecycleState.md) |  | 

## Example

```python
from openapi_client.models.change_server_life_cycle_state_source_server_lifecycle import ChangeServerLifeCycleStateSourceServerLifecycle

# TODO update the JSON string below
json = "{}"
# create an instance of ChangeServerLifeCycleStateSourceServerLifecycle from a JSON string
change_server_life_cycle_state_source_server_lifecycle_instance = ChangeServerLifeCycleStateSourceServerLifecycle.from_json(json)
# print the JSON string representation of the object
print(ChangeServerLifeCycleStateSourceServerLifecycle.to_json())

# convert the object into a dict
change_server_life_cycle_state_source_server_lifecycle_dict = change_server_life_cycle_state_source_server_lifecycle_instance.to_dict()
# create an instance of ChangeServerLifeCycleStateSourceServerLifecycle from a dict
change_server_life_cycle_state_source_server_lifecycle_from_dict = ChangeServerLifeCycleStateSourceServerLifecycle.from_dict(change_server_life_cycle_state_source_server_lifecycle_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


