# CreateJobRequestSettingsNielsenNonLinearWatermark


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_watermark_process** | [**NielsenActiveWatermarkProcessType**](NielsenActiveWatermarkProcessType.md) |  | [optional] 
**adi_filename** | **str** |  | [optional] 
**asset_id** | **str** |  | [optional] 
**asset_name** | **str** |  | [optional] 
**cbet_source_id** | **str** |  | [optional] 
**episode_id** | **str** |  | [optional] 
**metadata_destination** | **str** |  | [optional] 
**source_id** | **int** |  | [optional] 
**source_watermark_status** | [**NielsenSourceWatermarkStatusType**](NielsenSourceWatermarkStatusType.md) |  | [optional] 
**tic_server_url** | **str** |  | [optional] 
**unique_tic_per_audio_track** | [**NielsenUniqueTicPerAudioTrackType**](NielsenUniqueTicPerAudioTrackType.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings_nielsen_non_linear_watermark import CreateJobRequestSettingsNielsenNonLinearWatermark

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettingsNielsenNonLinearWatermark from a JSON string
create_job_request_settings_nielsen_non_linear_watermark_instance = CreateJobRequestSettingsNielsenNonLinearWatermark.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettingsNielsenNonLinearWatermark.to_json())

# convert the object into a dict
create_job_request_settings_nielsen_non_linear_watermark_dict = create_job_request_settings_nielsen_non_linear_watermark_instance.to_dict()
# create an instance of CreateJobRequestSettingsNielsenNonLinearWatermark from a dict
create_job_request_settings_nielsen_non_linear_watermark_from_dict = CreateJobRequestSettingsNielsenNonLinearWatermark.from_dict(create_job_request_settings_nielsen_non_linear_watermark_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


