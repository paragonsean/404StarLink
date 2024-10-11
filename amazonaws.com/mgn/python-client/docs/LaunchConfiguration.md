# LaunchConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boot_mode** | [**BootMode**](BootMode.md) |  | [optional] 
**copy_private_ip** | **bool** |  | [optional] 
**copy_tags** | **bool** |  | [optional] 
**ec2_launch_template_id** | **str** |  | [optional] 
**enable_map_auto_tagging** | **bool** |  | [optional] 
**launch_disposition** | [**LaunchDisposition**](LaunchDisposition.md) |  | [optional] 
**licensing** | [**LaunchConfigurationLicensing**](LaunchConfigurationLicensing.md) |  | [optional] 
**map_auto_tagging_mpe_id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**post_launch_actions** | [**PostLaunchActions**](PostLaunchActions.md) |  | [optional] 
**source_server_id** | **str** |  | [optional] 
**target_instance_type_right_sizing_method** | [**TargetInstanceTypeRightSizingMethod**](TargetInstanceTypeRightSizingMethod.md) |  | [optional] 

## Example

```python
from openapi_client.models.launch_configuration import LaunchConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of LaunchConfiguration from a JSON string
launch_configuration_instance = LaunchConfiguration.from_json(json)
# print the JSON string representation of the object
print(LaunchConfiguration.to_json())

# convert the object into a dict
launch_configuration_dict = launch_configuration_instance.to_dict()
# create an instance of LaunchConfiguration from a dict
launch_configuration_from_dict = LaunchConfiguration.from_dict(launch_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


