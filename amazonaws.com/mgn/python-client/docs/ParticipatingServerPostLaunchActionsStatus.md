# ParticipatingServerPostLaunchActionsStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**post_launch_actions_launch_status_list** | **List** |  | [optional] 
**ssm_agent_discovery_datetime** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.participating_server_post_launch_actions_status import ParticipatingServerPostLaunchActionsStatus

# TODO update the JSON string below
json = "{}"
# create an instance of ParticipatingServerPostLaunchActionsStatus from a JSON string
participating_server_post_launch_actions_status_instance = ParticipatingServerPostLaunchActionsStatus.from_json(json)
# print the JSON string representation of the object
print(ParticipatingServerPostLaunchActionsStatus.to_json())

# convert the object into a dict
participating_server_post_launch_actions_status_dict = participating_server_post_launch_actions_status_instance.to_dict()
# create an instance of ParticipatingServerPostLaunchActionsStatus from a dict
participating_server_post_launch_actions_status_from_dict = ParticipatingServerPostLaunchActionsStatus.from_dict(participating_server_post_launch_actions_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


