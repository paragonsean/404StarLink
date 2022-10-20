# CreateLaunchConfigurationTemplateRequestLicensing

Configure Licensing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**os_byol** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.create_launch_configuration_template_request_licensing import CreateLaunchConfigurationTemplateRequestLicensing

# TODO update the JSON string below
json = "{}"
# create an instance of CreateLaunchConfigurationTemplateRequestLicensing from a JSON string
create_launch_configuration_template_request_licensing_instance = CreateLaunchConfigurationTemplateRequestLicensing.from_json(json)
# print the JSON string representation of the object
print(CreateLaunchConfigurationTemplateRequestLicensing.to_json())

# convert the object into a dict
create_launch_configuration_template_request_licensing_dict = create_launch_configuration_template_request_licensing_instance.to_dict()
# create an instance of CreateLaunchConfigurationTemplateRequestLicensing from a dict
create_launch_configuration_template_request_licensing_from_dict = CreateLaunchConfigurationTemplateRequestLicensing.from_dict(create_launch_configuration_template_request_licensing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


