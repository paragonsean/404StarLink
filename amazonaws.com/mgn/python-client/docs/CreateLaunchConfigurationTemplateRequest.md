# CreateLaunchConfigurationTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associate_public_ip_address** | **bool** | Associate public Ip address. | [optional] 
**boot_mode** | **str** | Launch configuration template boot mode. | [optional] 
**copy_private_ip** | **bool** | Copy private Ip. | [optional] 
**copy_tags** | **bool** | Copy tags. | [optional] 
**enable_map_auto_tagging** | **bool** | Enable map auto tagging. | [optional] 
**large_volume_conf** | [**CreateLaunchConfigurationTemplateRequestLargeVolumeConf**](CreateLaunchConfigurationTemplateRequestLargeVolumeConf.md) |  | [optional] 
**launch_disposition** | **str** | Launch disposition. | [optional] 
**licensing** | [**CreateLaunchConfigurationTemplateRequestLicensing**](CreateLaunchConfigurationTemplateRequestLicensing.md) |  | [optional] 
**map_auto_tagging_mpe_id** | **str** | Launch configuration template map auto tagging MPE ID. | [optional] 
**post_launch_actions** | [**CreateLaunchConfigurationTemplateRequestPostLaunchActions**](CreateLaunchConfigurationTemplateRequestPostLaunchActions.md) |  | [optional] 
**small_volume_conf** | [**CreateLaunchConfigurationTemplateRequestLargeVolumeConf**](CreateLaunchConfigurationTemplateRequestLargeVolumeConf.md) |  | [optional] 
**small_volume_max_size** | **int** | Small volume maximum size. | [optional] 
**tags** | **Dict[str, str]** | Request to associate tags during creation of a Launch Configuration Template. | [optional] 
**target_instance_type_right_sizing_method** | **str** | Target instance type right-sizing method. | [optional] 

## Example

```python
from openapi_client.models.create_launch_configuration_template_request import CreateLaunchConfigurationTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateLaunchConfigurationTemplateRequest from a JSON string
create_launch_configuration_template_request_instance = CreateLaunchConfigurationTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CreateLaunchConfigurationTemplateRequest.to_json())

# convert the object into a dict
create_launch_configuration_template_request_dict = create_launch_configuration_template_request_instance.to_dict()
# create an instance of CreateLaunchConfigurationTemplateRequest from a dict
create_launch_configuration_template_request_from_dict = CreateLaunchConfigurationTemplateRequest.from_dict(create_launch_configuration_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


