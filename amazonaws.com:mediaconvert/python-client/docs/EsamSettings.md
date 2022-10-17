# EsamSettings

Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manifest_confirm_condition_notification** | [**EsamSettingsManifestConfirmConditionNotification**](EsamSettingsManifestConfirmConditionNotification.md) |  | [optional] 
**response_signal_preroll** | **int** |  | [optional] 
**signal_processing_notification** | [**EsamSettingsSignalProcessingNotification**](EsamSettingsSignalProcessingNotification.md) |  | [optional] 

## Example

```python
from openapi_client.models.esam_settings import EsamSettings

# TODO update the JSON string below
json = "{}"
# create an instance of EsamSettings from a JSON string
esam_settings_instance = EsamSettings.from_json(json)
# print the JSON string representation of the object
print(EsamSettings.to_json())

# convert the object into a dict
esam_settings_dict = esam_settings_instance.to_dict()
# create an instance of EsamSettings from a dict
esam_settings_from_dict = EsamSettings.from_dict(esam_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


