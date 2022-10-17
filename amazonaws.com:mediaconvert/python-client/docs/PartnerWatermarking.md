# PartnerWatermarking

If you work with a third party video watermarking partner, use the group of settings that correspond with your watermarking partner to include watermarks in your output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nexguard_file_marker_settings** | [**PartnerWatermarkingNexguardFileMarkerSettings**](PartnerWatermarkingNexguardFileMarkerSettings.md) |  | [optional] 

## Example

```python
from openapi_client.models.partner_watermarking import PartnerWatermarking

# TODO update the JSON string below
json = "{}"
# create an instance of PartnerWatermarking from a JSON string
partner_watermarking_instance = PartnerWatermarking.from_json(json)
# print the JSON string representation of the object
print(PartnerWatermarking.to_json())

# convert the object into a dict
partner_watermarking_dict = partner_watermarking_instance.to_dict()
# create an instance of PartnerWatermarking from a dict
partner_watermarking_from_dict = PartnerWatermarking.from_dict(partner_watermarking_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


