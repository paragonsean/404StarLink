# LoRaWANMulticastGet

The LoRaWAN information that is to be returned from getting multicast group information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rf_region** | [**SupportedRfRegion**](SupportedRfRegion.md) |  | [optional] 
**dl_class** | [**DlClass**](DlClass.md) |  | [optional] 
**number_of_devices_requested** | **int** | Number of devices that are requested to be associated with the multicast group. | [optional] 
**number_of_devices_in_group** | **int** | Number of devices that are associated to the multicast group. | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_multicast_get import LoRaWANMulticastGet

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANMulticastGet from a JSON string
lo_ra_wan_multicast_get_instance = LoRaWANMulticastGet.from_json(json)
# print the JSON string representation of the object
print(LoRaWANMulticastGet.to_json())

# convert the object into a dict
lo_ra_wan_multicast_get_dict = lo_ra_wan_multicast_get_instance.to_dict()
# create an instance of LoRaWANMulticastGet from a dict
lo_ra_wan_multicast_get_from_dict = LoRaWANMulticastGet.from_dict(lo_ra_wan_multicast_get_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


