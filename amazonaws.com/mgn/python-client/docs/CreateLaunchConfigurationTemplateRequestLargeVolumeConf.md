# CreateLaunchConfigurationTemplateRequestLargeVolumeConf

Launch template disk configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iops** | **int** |  | [optional] 
**throughput** | **int** |  | [optional] 
**volume_type** | [**VolumeType**](VolumeType.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_launch_configuration_template_request_large_volume_conf import CreateLaunchConfigurationTemplateRequestLargeVolumeConf

# TODO update the JSON string below
json = "{}"
# create an instance of CreateLaunchConfigurationTemplateRequestLargeVolumeConf from a JSON string
create_launch_configuration_template_request_large_volume_conf_instance = CreateLaunchConfigurationTemplateRequestLargeVolumeConf.from_json(json)
# print the JSON string representation of the object
print(CreateLaunchConfigurationTemplateRequestLargeVolumeConf.to_json())

# convert the object into a dict
create_launch_configuration_template_request_large_volume_conf_dict = create_launch_configuration_template_request_large_volume_conf_instance.to_dict()
# create an instance of CreateLaunchConfigurationTemplateRequestLargeVolumeConf from a dict
create_launch_configuration_template_request_large_volume_conf_from_dict = CreateLaunchConfigurationTemplateRequestLargeVolumeConf.from_dict(create_launch_configuration_template_request_large_volume_conf_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


