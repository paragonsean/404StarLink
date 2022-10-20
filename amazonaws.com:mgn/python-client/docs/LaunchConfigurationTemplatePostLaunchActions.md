# LaunchConfigurationTemplatePostLaunchActions


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
from openapi_client.models.launch_configuration_template_post_launch_actions import LaunchConfigurationTemplatePostLaunchActions

# TODO update the JSON string below
json = "{}"
# create an instance of LaunchConfigurationTemplatePostLaunchActions from a JSON string
launch_configuration_template_post_launch_actions_instance = LaunchConfigurationTemplatePostLaunchActions.from_json(json)
# print the JSON string representation of the object
print(LaunchConfigurationTemplatePostLaunchActions.to_json())

# convert the object into a dict
launch_configuration_template_post_launch_actions_dict = launch_configuration_template_post_launch_actions_instance.to_dict()
# create an instance of LaunchConfigurationTemplatePostLaunchActions from a dict
launch_configuration_template_post_launch_actions_from_dict = LaunchConfigurationTemplatePostLaunchActions.from_dict(launch_configuration_template_post_launch_actions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


