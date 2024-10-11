# LoRaWANMulticast

The LoRaWAN information that is to be used with the multicast group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rf_region** | [**SupportedRfRegion**](SupportedRfRegion.md) |  | [optional] 
**dl_class** | [**DlClass**](DlClass.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_multicast import LoRaWANMulticast

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANMulticast from a JSON string
lo_ra_wan_multicast_instance = LoRaWANMulticast.from_json(json)
# print the JSON string representation of the object
print(LoRaWANMulticast.to_json())

# convert the object into a dict
lo_ra_wan_multicast_dict = lo_ra_wan_multicast_instance.to_dict()
# create an instance of LoRaWANMulticast from a dict
lo_ra_wan_multicast_from_dict = LoRaWANMulticast.from_dict(lo_ra_wan_multicast_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


