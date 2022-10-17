# ContainerSettingsM2tsSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_buffer_model** | [**M2tsAudioBufferModel**](M2tsAudioBufferModel.md) |  | [optional] 
**audio_duration** | [**M2tsAudioDuration**](M2tsAudioDuration.md) |  | [optional] 
**audio_frames_per_pes** | **int** |  | [optional] 
**audio_pids** | **List** |  | [optional] 
**bitrate** | **int** |  | [optional] 
**buffer_model** | [**M2tsBufferModel**](M2tsBufferModel.md) |  | [optional] 
**data_pts_control** | [**M2tsDataPtsControl**](M2tsDataPtsControl.md) |  | [optional] 
**dvb_nit_settings** | [**M2tsSettingsDvbNitSettings**](M2tsSettingsDvbNitSettings.md) |  | [optional] 
**dvb_sdt_settings** | [**M2tsSettingsDvbSdtSettings**](M2tsSettingsDvbSdtSettings.md) |  | [optional] 
**dvb_sub_pids** | **List** |  | [optional] 
**dvb_tdt_settings** | [**M2tsSettingsDvbTdtSettings**](M2tsSettingsDvbTdtSettings.md) |  | [optional] 
**dvb_teletext_pid** | **int** |  | [optional] 
**ebp_audio_interval** | [**M2tsEbpAudioInterval**](M2tsEbpAudioInterval.md) |  | [optional] 
**ebp_placement** | [**M2tsEbpPlacement**](M2tsEbpPlacement.md) |  | [optional] 
**es_rate_in_pes** | [**M2tsEsRateInPes**](M2tsEsRateInPes.md) |  | [optional] 
**force_ts_video_ebp_order** | [**M2tsForceTsVideoEbpOrder**](M2tsForceTsVideoEbpOrder.md) |  | [optional] 
**fragment_time** | **float** |  | [optional] 
**klv_metadata** | [**M2tsKlvMetadata**](M2tsKlvMetadata.md) |  | [optional] 
**max_pcr_interval** | **int** |  | [optional] 
**min_ebp_interval** | **int** |  | [optional] 
**nielsen_id3** | [**M2tsNielsenId3**](M2tsNielsenId3.md) |  | [optional] 
**null_packet_bitrate** | **float** |  | [optional] 
**pat_interval** | **int** |  | [optional] 
**pcr_control** | [**M2tsPcrControl**](M2tsPcrControl.md) |  | [optional] 
**pcr_pid** | **int** |  | [optional] 
**pmt_interval** | **int** |  | [optional] 
**pmt_pid** | **int** |  | [optional] 
**private_metadata_pid** | **int** |  | [optional] 
**program_number** | **int** |  | [optional] 
**rate_mode** | [**M2tsRateMode**](M2tsRateMode.md) |  | [optional] 
**scte35_esam** | [**M2tsSettingsScte35Esam**](M2tsSettingsScte35Esam.md) |  | [optional] 
**scte35_pid** | **int** |  | [optional] 
**scte35_source** | [**M2tsScte35Source**](M2tsScte35Source.md) |  | [optional] 
**segmentation_markers** | [**M2tsSegmentationMarkers**](M2tsSegmentationMarkers.md) |  | [optional] 
**segmentation_style** | [**M2tsSegmentationStyle**](M2tsSegmentationStyle.md) |  | [optional] 
**segmentation_time** | **float** |  | [optional] 
**timed_metadata_pid** | **int** |  | [optional] 
**transport_stream_id** | **int** |  | [optional] 
**video_pid** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.container_settings_m2ts_settings import ContainerSettingsM2tsSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ContainerSettingsM2tsSettings from a JSON string
container_settings_m2ts_settings_instance = ContainerSettingsM2tsSettings.from_json(json)
# print the JSON string representation of the object
print(ContainerSettingsM2tsSettings.to_json())

# convert the object into a dict
container_settings_m2ts_settings_dict = container_settings_m2ts_settings_instance.to_dict()
# create an instance of ContainerSettingsM2tsSettings from a dict
container_settings_m2ts_settings_from_dict = ContainerSettingsM2tsSettings.from_dict(container_settings_m2ts_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


