# ChangeServerLifeCycleStateRequestLifeCycle


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**ChangeServerLifeCycleStateSourceServerLifecycleState**](ChangeServerLifeCycleStateSourceServerLifecycleState.md) |  | 

## Example

```python
from openapi_client.models.change_server_life_cycle_state_request_life_cycle import ChangeServerLifeCycleStateRequestLifeCycle

# TODO update the JSON string below
json = "{}"
# create an instance of ChangeServerLifeCycleStateRequestLifeCycle from a JSON string
change_server_life_cycle_state_request_life_cycle_instance = ChangeServerLifeCycleStateRequestLifeCycle.from_json(json)
# print the JSON string representation of the object
print(ChangeServerLifeCycleStateRequestLifeCycle.to_json())

# convert the object into a dict
change_server_life_cycle_state_request_life_cycle_dict = change_server_life_cycle_state_request_life_cycle_instance.to_dict()
# create an instance of ChangeServerLifeCycleStateRequestLifeCycle from a dict
change_server_life_cycle_state_request_life_cycle_from_dict = ChangeServerLifeCycleStateRequestLifeCycle.from_dict(change_server_life_cycle_state_request_life_cycle_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


