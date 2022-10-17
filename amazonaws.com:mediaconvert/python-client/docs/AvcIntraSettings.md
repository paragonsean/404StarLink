# AvcIntraSettings

Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avc_intra_class** | [**AvcIntraClass**](AvcIntraClass.md) |  | [optional] 
**avc_intra_uhd_settings** | [**AvcIntraSettingsAvcIntraUhdSettings**](AvcIntraSettingsAvcIntraUhdSettings.md) |  | [optional] 
**framerate_control** | [**AvcIntraFramerateControl**](AvcIntraFramerateControl.md) |  | [optional] 
**framerate_conversion_algorithm** | [**AvcIntraFramerateConversionAlgorithm**](AvcIntraFramerateConversionAlgorithm.md) |  | [optional] 
**framerate_denominator** | **int** |  | [optional] 
**framerate_numerator** | **int** |  | [optional] 
**interlace_mode** | [**AvcIntraInterlaceMode**](AvcIntraInterlaceMode.md) |  | [optional] 
**scan_type_conversion_mode** | [**AvcIntraScanTypeConversionMode**](AvcIntraScanTypeConversionMode.md) |  | [optional] 
**slow_pal** | [**AvcIntraSlowPal**](AvcIntraSlowPal.md) |  | [optional] 
**telecine** | [**AvcIntraTelecine**](AvcIntraTelecine.md) |  | [optional] 

## Example

```python
from openapi_client.models.avc_intra_settings import AvcIntraSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AvcIntraSettings from a JSON string
avc_intra_settings_instance = AvcIntraSettings.from_json(json)
# print the JSON string representation of the object
print(AvcIntraSettings.to_json())

# convert the object into a dict
avc_intra_settings_dict = avc_intra_settings_instance.to_dict()
# create an instance of AvcIntraSettings from a dict
avc_intra_settings_from_dict = AvcIntraSettings.from_dict(avc_intra_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


