# SidewalkDevice

Sidewalk device object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** | The Sidewalk Amazon ID. | [optional] 
**sidewalk_id** | **str** |  | [optional] 
**sidewalk_manufacturing_sn** | **str** |  | [optional] 
**device_certificates** | **List** |  | [optional] 
**private_keys** | **List** |  | [optional] 
**device_profile_id** | **str** |  | [optional] 
**certificate_id** | **str** |  | [optional] 
**status** | [**WirelessDeviceSidewalkStatus**](WirelessDeviceSidewalkStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_device import SidewalkDevice

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkDevice from a JSON string
sidewalk_device_instance = SidewalkDevice.from_json(json)
# print the JSON string representation of the object
print(SidewalkDevice.to_json())

# convert the object into a dict
sidewalk_device_dict = sidewalk_device_instance.to_dict()
# create an instance of SidewalkDevice from a dict
sidewalk_device_from_dict = SidewalkDevice.from_dict(sidewalk_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


