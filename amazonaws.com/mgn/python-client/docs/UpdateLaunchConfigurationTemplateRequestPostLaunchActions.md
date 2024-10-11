# UpdateLaunchConfigurationTemplateRequestPostLaunchActions


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
from openapi_client.models.update_launch_configuration_template_request_post_launch_actions import UpdateLaunchConfigurationTemplateRequestPostLaunchActions

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateLaunchConfigurationTemplateRequestPostLaunchActions from a JSON string
update_launch_configuration_template_request_post_launch_actions_instance = UpdateLaunchConfigurationTemplateRequestPostLaunchActions.from_json(json)
# print the JSON string representation of the object
print(UpdateLaunchConfigurationTemplateRequestPostLaunchActions.to_json())

# convert the object into a dict
update_launch_configuration_template_request_post_launch_actions_dict = update_launch_configuration_template_request_post_launch_actions_instance.to_dict()
# create an instance of UpdateLaunchConfigurationTemplateRequestPostLaunchActions from a dict
update_launch_configuration_template_request_post_launch_actions_from_dict = UpdateLaunchConfigurationTemplateRequestPostLaunchActions.from_dict(update_launch_configuration_template_request_post_launch_actions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


