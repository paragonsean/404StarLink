# UpdateApplicationSettingsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**write_application_settings_request** | [**UpdateApplicationSettingsRequestWriteApplicationSettingsRequest**](UpdateApplicationSettingsRequestWriteApplicationSettingsRequest.md) |  | 

## Example

```python
from openapi_client.models.update_application_settings_request import UpdateApplicationSettingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateApplicationSettingsRequest from a JSON string
update_application_settings_request_instance = UpdateApplicationSettingsRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateApplicationSettingsRequest.to_json())

# convert the object into a dict
update_application_settings_request_dict = update_application_settings_request_instance.to_dict()
# create an instance of UpdateApplicationSettingsRequest from a dict
update_application_settings_request_from_dict = UpdateApplicationSettingsRequest.from_dict(update_application_settings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


