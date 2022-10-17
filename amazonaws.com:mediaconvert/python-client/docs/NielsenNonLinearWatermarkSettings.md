# NielsenNonLinearWatermarkSettings

Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that MediaConvert uses to generate and place Nielsen watermarks in your output audio. In addition to specifying these values, you also need to set up your cloud TIC server. These settings apply to every output in your job. The MediaConvert implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]

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
from openapi_client.models.nielsen_non_linear_watermark_settings import NielsenNonLinearWatermarkSettings

# TODO update the JSON string below
json = "{}"
# create an instance of NielsenNonLinearWatermarkSettings from a JSON string
nielsen_non_linear_watermark_settings_instance = NielsenNonLinearWatermarkSettings.from_json(json)
# print the JSON string representation of the object
print(NielsenNonLinearWatermarkSettings.to_json())

# convert the object into a dict
nielsen_non_linear_watermark_settings_dict = nielsen_non_linear_watermark_settings_instance.to_dict()
# create an instance of NielsenNonLinearWatermarkSettings from a dict
nielsen_non_linear_watermark_settings_from_dict = NielsenNonLinearWatermarkSettings.from_dict(nielsen_non_linear_watermark_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


