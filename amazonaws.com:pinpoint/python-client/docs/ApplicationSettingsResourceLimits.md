# ApplicationSettingsResourceLimits


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily** | **int** |  | [optional] 
**maximum_duration** | **int** |  | [optional] 
**messages_per_second** | **int** |  | [optional] 
**total** | **int** |  | [optional] 
**session** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.application_settings_resource_limits import ApplicationSettingsResourceLimits

# TODO update the JSON string below
json = "{}"
# create an instance of ApplicationSettingsResourceLimits from a JSON string
application_settings_resource_limits_instance = ApplicationSettingsResourceLimits.from_json(json)
# print the JSON string representation of the object
print(ApplicationSettingsResourceLimits.to_json())

# convert the object into a dict
application_settings_resource_limits_dict = application_settings_resource_limits_instance.to_dict()
# create an instance of ApplicationSettingsResourceLimits from a dict
application_settings_resource_limits_from_dict = ApplicationSettingsResourceLimits.from_dict(application_settings_resource_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


