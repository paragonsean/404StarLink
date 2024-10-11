# H264SettingsBandwidthReductionFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sharpening** | [**BandwidthReductionFilterSharpening**](BandwidthReductionFilterSharpening.md) |  | [optional] 
**strength** | [**BandwidthReductionFilterStrength**](BandwidthReductionFilterStrength.md) |  | [optional] 

## Example

```python
from openapi_client.models.h264_settings_bandwidth_reduction_filter import H264SettingsBandwidthReductionFilter

# TODO update the JSON string below
json = "{}"
# create an instance of H264SettingsBandwidthReductionFilter from a JSON string
h264_settings_bandwidth_reduction_filter_instance = H264SettingsBandwidthReductionFilter.from_json(json)
# print the JSON string representation of the object
print(H264SettingsBandwidthReductionFilter.to_json())

# convert the object into a dict
h264_settings_bandwidth_reduction_filter_dict = h264_settings_bandwidth_reduction_filter_instance.to_dict()
# create an instance of H264SettingsBandwidthReductionFilter from a dict
h264_settings_bandwidth_reduction_filter_from_dict = H264SettingsBandwidthReductionFilter.from_dict(h264_settings_bandwidth_reduction_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


