# CreateJobRequestSettingsTimecodeConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | **str** |  | [optional] 
**source** | [**TimecodeSource**](TimecodeSource.md) |  | [optional] 
**start** | **str** |  | [optional] 
**timestamp_offset** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings_timecode_config import CreateJobRequestSettingsTimecodeConfig

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettingsTimecodeConfig from a JSON string
create_job_request_settings_timecode_config_instance = CreateJobRequestSettingsTimecodeConfig.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettingsTimecodeConfig.to_json())

# convert the object into a dict
create_job_request_settings_timecode_config_dict = create_job_request_settings_timecode_config_instance.to_dict()
# create an instance of CreateJobRequestSettingsTimecodeConfig from a dict
create_job_request_settings_timecode_config_from_dict = CreateJobRequestSettingsTimecodeConfig.from_dict(create_job_request_settings_timecode_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


