# PostLaunchActionsStatus

Status of the Post Launch Actions running on the Test or Cutover instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**post_launch_actions_launch_status_list** | **List** |  | [optional] 
**ssm_agent_discovery_datetime** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.post_launch_actions_status import PostLaunchActionsStatus

# TODO update the JSON string below
json = "{}"
# create an instance of PostLaunchActionsStatus from a JSON string
post_launch_actions_status_instance = PostLaunchActionsStatus.from_json(json)
# print the JSON string representation of the object
print(PostLaunchActionsStatus.to_json())

# convert the object into a dict
post_launch_actions_status_dict = post_launch_actions_status_instance.to_dict()
# create an instance of PostLaunchActionsStatus from a dict
post_launch_actions_status_from_dict = PostLaunchActionsStatus.from_dict(post_launch_actions_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


