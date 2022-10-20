# UpdateLaunchConfigurationTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associate_public_ip_address** | **bool** | Associate public Ip address. | [optional] 
**boot_mode** | **str** | Launch configuration template boot mode. | [optional] 
**copy_private_ip** | **bool** | Copy private Ip. | [optional] 
**copy_tags** | **bool** | Copy tags. | [optional] 
**enable_map_auto_tagging** | **bool** | Enable map auto tagging. | [optional] 
**large_volume_conf** | [**CreateLaunchConfigurationTemplateRequestLargeVolumeConf**](CreateLaunchConfigurationTemplateRequestLargeVolumeConf.md) |  | [optional] 
**launch_configuration_template_id** | **str** | Launch Configuration Template ID. | 
**launch_disposition** | **str** | Launch disposition. | [optional] 
**licensing** | [**CreateLaunchConfigurationTemplateRequestLicensing**](CreateLaunchConfigurationTemplateRequestLicensing.md) |  | [optional] 
**map_auto_tagging_mpe_id** | **str** | Launch configuration template map auto tagging MPE ID. | [optional] 
**post_launch_actions** | [**CreateLaunchConfigurationTemplateRequestPostLaunchActions**](CreateLaunchConfigurationTemplateRequestPostLaunchActions.md) |  | [optional] 
**small_volume_conf** | [**CreateLaunchConfigurationTemplateRequestLargeVolumeConf**](CreateLaunchConfigurationTemplateRequestLargeVolumeConf.md) |  | [optional] 
**small_volume_max_size** | **int** | Small volume maximum size. | [optional] 
**target_instance_type_right_sizing_method** | **str** | Target instance type right-sizing method. | [optional] 

## Example

```python
from openapi_client.models.update_launch_configuration_template_request import UpdateLaunchConfigurationTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateLaunchConfigurationTemplateRequest from a JSON string
update_launch_configuration_template_request_instance = UpdateLaunchConfigurationTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateLaunchConfigurationTemplateRequest.to_json())

# convert the object into a dict
update_launch_configuration_template_request_dict = update_launch_configuration_template_request_instance.to_dict()
# create an instance of UpdateLaunchConfigurationTemplateRequest from a dict
update_launch_configuration_template_request_from_dict = UpdateLaunchConfigurationTemplateRequest.from_dict(update_launch_configuration_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


