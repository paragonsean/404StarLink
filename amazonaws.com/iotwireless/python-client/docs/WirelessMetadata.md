# WirelessMetadata

WirelessMetadata object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN**](SendDataToWirelessDeviceRequestWirelessMetadataLoRaWAN.md) |  | [optional] 
**sidewalk** | [**SendDataToWirelessDeviceRequestWirelessMetadataSidewalk**](SendDataToWirelessDeviceRequestWirelessMetadataSidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.wireless_metadata import WirelessMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessMetadata from a JSON string
wireless_metadata_instance = WirelessMetadata.from_json(json)
# print the JSON string representation of the object
print(WirelessMetadata.to_json())

# convert the object into a dict
wireless_metadata_dict = wireless_metadata_instance.to_dict()
# create an instance of WirelessMetadata from a dict
wireless_metadata_from_dict = WirelessMetadata.from_dict(wireless_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


