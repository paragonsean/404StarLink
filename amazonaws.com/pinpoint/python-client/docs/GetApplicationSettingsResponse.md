# GetApplicationSettingsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_settings_resource** | [**ApplicationSettingsResource**](ApplicationSettingsResource.md) |  | 

## Example

```python
from openapi_client.models.get_application_settings_response import GetApplicationSettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetApplicationSettingsResponse from a JSON string
get_application_settings_response_instance = GetApplicationSettingsResponse.from_json(json)
# print the JSON string representation of the object
print(GetApplicationSettingsResponse.to_json())

# convert the object into a dict
get_application_settings_response_dict = get_application_settings_response_instance.to_dict()
# create an instance of GetApplicationSettingsResponse from a dict
get_application_settings_response_from_dict = GetApplicationSettingsResponse.from_dict(get_application_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


