# CreateLaunchConfigurationTemplateRequestPostLaunchActions


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
from openapi_client.models.create_launch_configuration_template_request_post_launch_actions import CreateLaunchConfigurationTemplateRequestPostLaunchActions

# TODO update the JSON string below
json = "{}"
# create an instance of CreateLaunchConfigurationTemplateRequestPostLaunchActions from a JSON string
create_launch_configuration_template_request_post_launch_actions_instance = CreateLaunchConfigurationTemplateRequestPostLaunchActions.from_json(json)
# print the JSON string representation of the object
print(CreateLaunchConfigurationTemplateRequestPostLaunchActions.to_json())

# convert the object into a dict
create_launch_configuration_template_request_post_launch_actions_dict = create_launch_configuration_template_request_post_launch_actions_instance.to_dict()
# create an instance of CreateLaunchConfigurationTemplateRequestPostLaunchActions from a dict
create_launch_configuration_template_request_post_launch_actions_from_dict = CreateLaunchConfigurationTemplateRequestPostLaunchActions.from_dict(create_launch_configuration_template_request_post_launch_actions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


