# LaunchConfigurationTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**associate_public_ip_address** | **bool** |  | [optional] 
**boot_mode** | [**BootMode**](BootMode.md) |  | [optional] 
**copy_private_ip** | **bool** |  | [optional] 
**copy_tags** | **bool** |  | [optional] 
**ec2_launch_template_id** | **str** |  | [optional] 
**enable_map_auto_tagging** | **bool** |  | [optional] 
**large_volume_conf** | [**LaunchConfigurationTemplateLargeVolumeConf**](LaunchConfigurationTemplateLargeVolumeConf.md) |  | [optional] 
**launch_configuration_template_id** | **str** |  | 
**launch_disposition** | [**LaunchDisposition**](LaunchDisposition.md) |  | [optional] 
**licensing** | [**Licensing**](Licensing.md) |  | [optional] 
**map_auto_tagging_mpe_id** | **str** |  | [optional] 
**post_launch_actions** | [**LaunchConfigurationTemplatePostLaunchActions**](LaunchConfigurationTemplatePostLaunchActions.md) |  | [optional] 
**small_volume_conf** | [**LaunchConfigurationTemplateSmallVolumeConf**](LaunchConfigurationTemplateSmallVolumeConf.md) |  | [optional] 
**small_volume_max_size** | **int** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**target_instance_type_right_sizing_method** | [**TargetInstanceTypeRightSizingMethod**](TargetInstanceTypeRightSizingMethod.md) |  | [optional] 

## Example

```python
from openapi_client.models.launch_configuration_template import LaunchConfigurationTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of LaunchConfigurationTemplate from a JSON string
launch_configuration_template_instance = LaunchConfigurationTemplate.from_json(json)
# print the JSON string representation of the object
print(LaunchConfigurationTemplate.to_json())

# convert the object into a dict
launch_configuration_template_dict = launch_configuration_template_instance.to_dict()
# create an instance of LaunchConfigurationTemplate from a dict
launch_configuration_template_from_dict = LaunchConfigurationTemplate.from_dict(launch_configuration_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


