# CreateJobRequestSettingsEsam


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manifest_confirm_condition_notification** | [**EsamSettingsManifestConfirmConditionNotification**](EsamSettingsManifestConfirmConditionNotification.md) |  | [optional] 
**response_signal_preroll** | **int** |  | [optional] 
**signal_processing_notification** | [**EsamSettingsSignalProcessingNotification**](EsamSettingsSignalProcessingNotification.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings_esam import CreateJobRequestSettingsEsam

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettingsEsam from a JSON string
create_job_request_settings_esam_instance = CreateJobRequestSettingsEsam.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettingsEsam.to_json())

# convert the object into a dict
create_job_request_settings_esam_dict = create_job_request_settings_esam_instance.to_dict()
# create an instance of CreateJobRequestSettingsEsam from a dict
create_job_request_settings_esam_from_dict = CreateJobRequestSettingsEsam.from_dict(create_job_request_settings_esam_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


