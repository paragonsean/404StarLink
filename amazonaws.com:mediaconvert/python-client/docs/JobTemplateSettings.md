# JobTemplateSettings

JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.

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
from openapi_client.models.job_template_settings import JobTemplateSettings

# TODO update the JSON string below
json = "{}"
# create an instance of JobTemplateSettings from a JSON string
job_template_settings_instance = JobTemplateSettings.from_json(json)
# print the JSON string representation of the object
print(JobTemplateSettings.to_json())

# convert the object into a dict
job_template_settings_dict = job_template_settings_instance.to_dict()
# create an instance of JobTemplateSettings from a dict
job_template_settings_from_dict = JobTemplateSettings.from_dict(job_template_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


