# LaunchTemplateDiskConf

Launch template disk configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iops** | **int** |  | [optional] 
**throughput** | **int** |  | [optional] 
**volume_type** | [**VolumeType**](VolumeType.md) |  | [optional] 

## Example

```python
from openapi_client.models.launch_template_disk_conf import LaunchTemplateDiskConf

# TODO update the JSON string below
json = "{}"
# create an instance of LaunchTemplateDiskConf from a JSON string
launch_template_disk_conf_instance = LaunchTemplateDiskConf.from_json(json)
# print the JSON string representation of the object
print(LaunchTemplateDiskConf.to_json())

# convert the object into a dict
launch_template_disk_conf_dict = launch_template_disk_conf_instance.to_dict()
# create an instance of LaunchTemplateDiskConf from a dict
launch_template_disk_conf_from_dict = LaunchTemplateDiskConf.from_dict(launch_template_disk_conf_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


