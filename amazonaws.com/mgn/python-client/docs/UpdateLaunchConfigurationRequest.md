# UpdateLaunchConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boot_mode** | **str** | Update Launch configuration boot mode request. | [optional] 
**copy_private_ip** | **bool** | Update Launch configuration copy Private IP request. | [optional] 
**copy_tags** | **bool** | Update Launch configuration copy Tags request. | [optional] 
**enable_map_auto_tagging** | **bool** | Enable map auto tagging. | [optional] 
**launch_disposition** | **str** | Update Launch configuration launch disposition request. | [optional] 
**licensing** | [**CreateLaunchConfigurationTemplateRequestLicensing**](CreateLaunchConfigurationTemplateRequestLicensing.md) |  | [optional] 
**map_auto_tagging_mpe_id** | **str** | Launch configuration map auto tagging MPE ID. | [optional] 
**name** | **str** | Update Launch configuration name request. | [optional] 
**post_launch_actions** | [**CreateLaunchConfigurationTemplateRequestPostLaunchActions**](CreateLaunchConfigurationTemplateRequestPostLaunchActions.md) |  | [optional] 
**source_server_id** | **str** | Update Launch configuration by Source Server ID request. | 
**target_instance_type_right_sizing_method** | **str** | Update Launch configuration Target instance right sizing request. | [optional] 

## Example

```python
from openapi_client.models.update_launch_configuration_request import UpdateLaunchConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateLaunchConfigurationRequest from a JSON string
update_launch_configuration_request_instance = UpdateLaunchConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateLaunchConfigurationRequest.to_json())

# convert the object into a dict
update_launch_configuration_request_dict = update_launch_configuration_request_instance.to_dict()
# create an instance of UpdateLaunchConfigurationRequest from a dict
update_launch_configuration_request_from_dict = UpdateLaunchConfigurationRequest.from_dict(update_launch_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


