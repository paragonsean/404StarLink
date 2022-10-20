# DeleteLaunchConfigurationTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launch_configuration_template_id** | **str** | ID of resource to be deleted. | 

## Example

```python
from openapi_client.models.delete_launch_configuration_template_request import DeleteLaunchConfigurationTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteLaunchConfigurationTemplateRequest from a JSON string
delete_launch_configuration_template_request_instance = DeleteLaunchConfigurationTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteLaunchConfigurationTemplateRequest.to_json())

# convert the object into a dict
delete_launch_configuration_template_request_dict = delete_launch_configuration_template_request_instance.to_dict()
# create an instance of DeleteLaunchConfigurationTemplateRequest from a dict
delete_launch_configuration_template_request_from_dict = DeleteLaunchConfigurationTemplateRequest.from_dict(delete_launch_configuration_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


