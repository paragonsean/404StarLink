# ContainerSettingsM3u8Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_duration** | [**M3u8AudioDuration**](M3u8AudioDuration.md) |  | [optional] 
**audio_frames_per_pes** | **int** |  | [optional] 
**audio_pids** | **List** |  | [optional] 
**data_pts_control** | [**M3u8DataPtsControl**](M3u8DataPtsControl.md) |  | [optional] 
**max_pcr_interval** | **int** |  | [optional] 
**nielsen_id3** | [**M3u8NielsenId3**](M3u8NielsenId3.md) |  | [optional] 
**pat_interval** | **int** |  | [optional] 
**pcr_control** | [**M3u8PcrControl**](M3u8PcrControl.md) |  | [optional] 
**pcr_pid** | **int** |  | [optional] 
**pmt_interval** | **int** |  | [optional] 
**pmt_pid** | **int** |  | [optional] 
**private_metadata_pid** | **int** |  | [optional] 
**program_number** | **int** |  | [optional] 
**scte35_pid** | **int** |  | [optional] 
**scte35_source** | [**M3u8Scte35Source**](M3u8Scte35Source.md) |  | [optional] 
**timed_metadata** | [**TimedMetadata**](TimedMetadata.md) |  | [optional] 
**timed_metadata_pid** | **int** |  | [optional] 
**transport_stream_id** | **int** |  | [optional] 
**video_pid** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.container_settings_m3u8_settings import ContainerSettingsM3u8Settings

# TODO update the JSON string below
json = "{}"
# create an instance of ContainerSettingsM3u8Settings from a JSON string
container_settings_m3u8_settings_instance = ContainerSettingsM3u8Settings.from_json(json)
# print the JSON string representation of the object
print(ContainerSettingsM3u8Settings.to_json())

# convert the object into a dict
container_settings_m3u8_settings_dict = container_settings_m3u8_settings_instance.to_dict()
# create an instance of ContainerSettingsM3u8Settings from a dict
container_settings_m3u8_settings_from_dict = ContainerSettingsM3u8Settings.from_dict(container_settings_m3u8_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


