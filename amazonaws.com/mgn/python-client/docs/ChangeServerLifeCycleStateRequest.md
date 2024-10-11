# ChangeServerLifeCycleStateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**life_cycle** | [**ChangeServerLifeCycleStateRequestLifeCycle**](ChangeServerLifeCycleStateRequestLifeCycle.md) |  | 
**source_server_id** | **str** | The request to change the source server migration lifecycle state by source server ID. | 

## Example

```python
from openapi_client.models.change_server_life_cycle_state_request import ChangeServerLifeCycleStateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ChangeServerLifeCycleStateRequest from a JSON string
change_server_life_cycle_state_request_instance = ChangeServerLifeCycleStateRequest.from_json(json)
# print the JSON string representation of the object
print(ChangeServerLifeCycleStateRequest.to_json())

# convert the object into a dict
change_server_life_cycle_state_request_dict = change_server_life_cycle_state_request_instance.to_dict()
# create an instance of ChangeServerLifeCycleStateRequest from a dict
change_server_life_cycle_state_request_from_dict = ChangeServerLifeCycleStateRequest.from_dict(change_server_life_cycle_state_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


