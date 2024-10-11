# SidewalkCreateWirelessDevice

Sidewalk object for creating a wireless device.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_profile_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_create_wireless_device import SidewalkCreateWirelessDevice

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkCreateWirelessDevice from a JSON string
sidewalk_create_wireless_device_instance = SidewalkCreateWirelessDevice.from_json(json)
# print the JSON string representation of the object
print(SidewalkCreateWirelessDevice.to_json())

# convert the object into a dict
sidewalk_create_wireless_device_dict = sidewalk_create_wireless_device_instance.to_dict()
# create an instance of SidewalkCreateWirelessDevice from a dict
sidewalk_create_wireless_device_from_dict = SidewalkCreateWirelessDevice.from_dict(sidewalk_create_wireless_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


