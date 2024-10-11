# SidewalkDeviceMetadata

MetaData for Sidewalk device.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rssi** | **int** |  | [optional] 
**battery_level** | [**BatteryLevel**](BatteryLevel.md) |  | [optional] 
**event** | [**Event**](Event.md) |  | [optional] 
**device_state** | [**DeviceState**](DeviceState.md) |  | [optional] 

## Example

```python
from openapi_client.models.sidewalk_device_metadata import SidewalkDeviceMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of SidewalkDeviceMetadata from a JSON string
sidewalk_device_metadata_instance = SidewalkDeviceMetadata.from_json(json)
# print the JSON string representation of the object
print(SidewalkDeviceMetadata.to_json())

# convert the object into a dict
sidewalk_device_metadata_dict = sidewalk_device_metadata_instance.to_dict()
# create an instance of SidewalkDeviceMetadata from a dict
sidewalk_device_metadata_from_dict = SidewalkDeviceMetadata.from_dict(sidewalk_device_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


