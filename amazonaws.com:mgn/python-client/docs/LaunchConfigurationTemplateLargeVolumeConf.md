# LaunchConfigurationTemplateLargeVolumeConf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iops** | **int** |  | [optional] 
**throughput** | **int** |  | [optional] 
**volume_type** | [**VolumeType**](VolumeType.md) |  | [optional] 

## Example

```python
from openapi_client.models.launch_configuration_template_large_volume_conf import LaunchConfigurationTemplateLargeVolumeConf

# TODO update the JSON string below
json = "{}"
# create an instance of LaunchConfigurationTemplateLargeVolumeConf from a JSON string
launch_configuration_template_large_volume_conf_instance = LaunchConfigurationTemplateLargeVolumeConf.from_json(json)
# print the JSON string representation of the object
print(LaunchConfigurationTemplateLargeVolumeConf.to_json())

# convert the object into a dict
launch_configuration_template_large_volume_conf_dict = launch_configuration_template_large_volume_conf_instance.to_dict()
# create an instance of LaunchConfigurationTemplateLargeVolumeConf from a dict
launch_configuration_template_large_volume_conf_from_dict = LaunchConfigurationTemplateLargeVolumeConf.from_dict(launch_configuration_template_large_volume_conf_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


