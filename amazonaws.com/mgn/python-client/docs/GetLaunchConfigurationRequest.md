# GetLaunchConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | Request to get Launch Configuration information by Source Server ID. | 

## Example

```python
from openapi_client.models.get_launch_configuration_request import GetLaunchConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetLaunchConfigurationRequest from a JSON string
get_launch_configuration_request_instance = GetLaunchConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(GetLaunchConfigurationRequest.to_json())

# convert the object into a dict
get_launch_configuration_request_dict = get_launch_configuration_request_instance.to_dict()
# create an instance of GetLaunchConfigurationRequest from a dict
get_launch_configuration_request_from_dict = GetLaunchConfigurationRequest.from_dict(get_launch_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


