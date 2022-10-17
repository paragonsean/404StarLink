# H265QvbrSettings

Settings for quality-defined variable bitrate encoding with the H.265 codec. Use these settings only when you set QVBR for Rate control mode (RateControlMode).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_average_bitrate** | **int** |  | [optional] 
**qvbr_quality_level** | **int** |  | [optional] 
**qvbr_quality_level_fine_tune** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.h265_qvbr_settings import H265QvbrSettings

# TODO update the JSON string below
json = "{}"
# create an instance of H265QvbrSettings from a JSON string
h265_qvbr_settings_instance = H265QvbrSettings.from_json(json)
# print the JSON string representation of the object
print(H265QvbrSettings.to_json())

# convert the object into a dict
h265_qvbr_settings_dict = h265_qvbr_settings_instance.to_dict()
# create an instance of H265QvbrSettings from a dict
h265_qvbr_settings_from_dict = H265QvbrSettings.from_dict(h265_qvbr_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


