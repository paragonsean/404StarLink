# PartnerWatermarkingNexguardFileMarkerSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**license** | **str** |  | [optional] 
**payload** | **int** |  | [optional] 
**preset** | **str** |  | [optional] 
**strength** | [**WatermarkingStrength**](WatermarkingStrength.md) |  | [optional] 

## Example

```python
from openapi_client.models.partner_watermarking_nexguard_file_marker_settings import PartnerWatermarkingNexguardFileMarkerSettings

# TODO update the JSON string below
json = "{}"
# create an instance of PartnerWatermarkingNexguardFileMarkerSettings from a JSON string
partner_watermarking_nexguard_file_marker_settings_instance = PartnerWatermarkingNexguardFileMarkerSettings.from_json(json)
# print the JSON string representation of the object
print(PartnerWatermarkingNexguardFileMarkerSettings.to_json())

# convert the object into a dict
partner_watermarking_nexguard_file_marker_settings_dict = partner_watermarking_nexguard_file_marker_settings_instance.to_dict()
# create an instance of PartnerWatermarkingNexguardFileMarkerSettings from a dict
partner_watermarking_nexguard_file_marker_settings_from_dict = PartnerWatermarkingNexguardFileMarkerSettings.from_dict(partner_watermarking_nexguard_file_marker_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


