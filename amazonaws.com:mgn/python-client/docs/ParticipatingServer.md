# ParticipatingServer

Server participating in Job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launch_status** | [**LaunchStatus**](LaunchStatus.md) |  | [optional] 
**launched_ec2_instance_id** | **str** |  | [optional] 
**post_launch_actions_status** | [**ParticipatingServerPostLaunchActionsStatus**](ParticipatingServerPostLaunchActionsStatus.md) |  | [optional] 
**source_server_id** | **str** |  | 

## Example

```python
from openapi_client.models.participating_server import ParticipatingServer

# TODO update the JSON string below
json = "{}"
# create an instance of ParticipatingServer from a JSON string
participating_server_instance = ParticipatingServer.from_json(json)
# print the JSON string representation of the object
print(ParticipatingServer.to_json())

# convert the object into a dict
participating_server_dict = participating_server_instance.to_dict()
# create an instance of ParticipatingServer from a dict
participating_server_from_dict = ParticipatingServer.from_dict(participating_server_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


