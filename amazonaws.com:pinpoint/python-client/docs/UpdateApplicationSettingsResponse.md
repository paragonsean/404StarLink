# UpdateApplicationSettingsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_settings_resource** | [**ApplicationSettingsResource**](ApplicationSettingsResource.md) |  | 

## Example

```python
from openapi_client.models.update_application_settings_response import UpdateApplicationSettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateApplicationSettingsResponse from a JSON string
update_application_settings_response_instance = UpdateApplicationSettingsResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateApplicationSettingsResponse.to_json())

# convert the object into a dict
update_application_settings_response_dict = update_application_settings_response_instance.to_dict()
# create an instance of UpdateApplicationSettingsResponse from a dict
update_application_settings_response_from_dict = UpdateApplicationSettingsResponse.from_dict(update_application_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


