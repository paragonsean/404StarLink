# JobSettings

JobSettings contains all the transcode settings for a job.

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
from openapi_client.models.job_settings import JobSettings

# TODO update the JSON string below
json = "{}"
# create an instance of JobSettings from a JSON string
job_settings_instance = JobSettings.from_json(json)
# print the JSON string representation of the object
print(JobSettings.to_json())

# convert the object into a dict
job_settings_dict = job_settings_instance.to_dict()
# create an instance of JobSettings from a dict
job_settings_from_dict = JobSettings.from_dict(job_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


