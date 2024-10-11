# LoRaWANListDevice

LoRaWAN object for list functions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_eui** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_list_device import LoRaWANListDevice

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANListDevice from a JSON string
lo_ra_wan_list_device_instance = LoRaWANListDevice.from_json(json)
# print the JSON string representation of the object
print(LoRaWANListDevice.to_json())

# convert the object into a dict
lo_ra_wan_list_device_dict = lo_ra_wan_list_device_instance.to_dict()
# create an instance of LoRaWANListDevice from a dict
lo_ra_wan_list_device_from_dict = LoRaWANListDevice.from_dict(lo_ra_wan_list_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


