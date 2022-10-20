# PostLaunchActions

Post Launch Actions to executed on the Test or Cutover instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_watch_log_group_name** | **str** |  | [optional] 
**deployment** | [**PostLaunchActionsDeploymentType**](PostLaunchActionsDeploymentType.md) |  | [optional] 
**s3_log_bucket** | **str** |  | [optional] 
**s3_output_key_prefix** | **str** |  | [optional] 
**ssm_documents** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.post_launch_actions import PostLaunchActions

# TODO update the JSON string below
json = "{}"
# create an instance of PostLaunchActions from a JSON string
post_launch_actions_instance = PostLaunchActions.from_json(json)
# print the JSON string representation of the object
print(PostLaunchActions.to_json())

# convert the object into a dict
post_launch_actions_dict = post_launch_actions_instance.to_dict()
# create an instance of PostLaunchActions from a dict
post_launch_actions_from_dict = PostLaunchActions.from_dict(post_launch_actions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


