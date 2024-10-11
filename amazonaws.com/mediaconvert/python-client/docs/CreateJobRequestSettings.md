# CreateJobRequestSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_avail_offset** | **int** |  | [optional] 
**avail_blanking** | [**CreateJobRequestSettingsAvailBlanking**](CreateJobRequestSettingsAvailBlanking.md) |  | [optional] 
**esam** | [**CreateJobRequestSettingsEsam**](CreateJobRequestSettingsEsam.md) |  | [optional] 
**extended_data_services** | [**CreateJobRequestSettingsExtendedDataServices**](CreateJobRequestSettingsExtendedDataServices.md) |  | [optional] 
**inputs** | **List** |  | [optional] 
**kantar_watermark** | [**CreateJobRequestSettingsKantarWatermark**](CreateJobRequestSettingsKantarWatermark.md) |  | [optional] 
**motion_image_inserter** | [**CreateJobRequestSettingsMotionImageInserter**](CreateJobRequestSettingsMotionImageInserter.md) |  | [optional] 
**nielsen_configuration** | [**CreateJobRequestSettingsNielsenConfiguration**](CreateJobRequestSettingsNielsenConfiguration.md) |  | [optional] 
**nielsen_non_linear_watermark** | [**CreateJobRequestSettingsNielsenNonLinearWatermark**](CreateJobRequestSettingsNielsenNonLinearWatermark.md) |  | [optional] 
**output_groups** | **List** |  | [optional] 
**timecode_config** | [**CreateJobRequestSettingsTimecodeConfig**](CreateJobRequestSettingsTimecodeConfig.md) |  | [optional] 
**timed_metadata_insertion** | [**CreateJobRequestSettingsTimedMetadataInsertion**](CreateJobRequestSettingsTimedMetadataInsertion.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings import CreateJobRequestSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettings from a JSON string
create_job_request_settings_instance = CreateJobRequestSettings.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettings.to_json())

# convert the object into a dict
create_job_request_settings_dict = create_job_request_settings_instance.to_dict()
# create an instance of CreateJobRequestSettings from a dict
create_job_request_settings_from_dict = CreateJobRequestSettings.from_dict(create_job_request_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


