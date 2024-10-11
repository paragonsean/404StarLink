# SidewalkListDevice

Sidewalk object used by list functions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** |  | [optional] 
**sidewalk_id** | **str** |  | [optional] 
**sidewalk_manufacturing_sn** | **str** |  | [optional] 
**device_certificates** | **List** |  | [optional] 
**device_profile_id** | **str** |  | [optional] 
**status** | [**WirelessDeviceSidewalkStatus**](WirelessDeviceSidewalkStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_list_device import SidewalkListDevice

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkListDevice from a JSON string
sidewalk_list_device_instance = SidewalkListDevice.from_json(json)
# print the JSON string representation of the object
print(SidewalkListDevice.to_json())

# convert the object into a dict
sidewalk_list_device_dict = sidewalk_list_device_instance.to_dict()
# create an instance of SidewalkListDevice from a dict
sidewalk_list_device_from_dict = SidewalkListDevice.from_dict(sidewalk_list_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


