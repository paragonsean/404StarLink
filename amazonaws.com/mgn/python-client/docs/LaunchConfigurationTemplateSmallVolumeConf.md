# LaunchConfigurationTemplateSmallVolumeConf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iops** | **int** |  | [optional] 
**throughput** | **int** |  | [optional] 
**volume_type** | [**VolumeType**](VolumeType.md) |  | [optional] 

## Example

```python
from openapi_client.models.launch_configuration_template_small_volume_conf import LaunchConfigurationTemplateSmallVolumeConf

# TODO update the JSON string below
json = "{}"
# create an instance of LaunchConfigurationTemplateSmallVolumeConf from a JSON string
launch_configuration_template_small_volume_conf_instance = LaunchConfigurationTemplateSmallVolumeConf.from_json(json)
# print the JSON string representation of the object
print(LaunchConfigurationTemplateSmallVolumeConf.to_json())

# convert the object into a dict
launch_configuration_template_small_volume_conf_dict = launch_configuration_template_small_volume_conf_instance.to_dict()
# create an instance of LaunchConfigurationTemplateSmallVolumeConf from a dict
launch_configuration_template_small_volume_conf_from_dict = LaunchConfigurationTemplateSmallVolumeConf.from_dict(launch_configuration_template_small_volume_conf_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


