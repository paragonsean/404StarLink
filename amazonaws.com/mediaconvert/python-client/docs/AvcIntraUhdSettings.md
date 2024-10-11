# AvcIntraUhdSettings

Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra class to a different value, this object isn't allowed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quality_tuning_level** | [**AvcIntraUhdQualityTuningLevel**](AvcIntraUhdQualityTuningLevel.md) |  | [optional] 

## Example

```python
from openapi_client.models.avc_intra_uhd_settings import AvcIntraUhdSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AvcIntraUhdSettings from a JSON string
avc_intra_uhd_settings_instance = AvcIntraUhdSettings.from_json(json)
# print the JSON string representation of the object
print(AvcIntraUhdSettings.to_json())

# convert the object into a dict
avc_intra_uhd_settings_dict = avc_intra_uhd_settings_instance.to_dict()
# create an instance of AvcIntraUhdSettings from a dict
avc_intra_uhd_settings_from_dict = AvcIntraUhdSettings.from_dict(avc_intra_uhd_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


