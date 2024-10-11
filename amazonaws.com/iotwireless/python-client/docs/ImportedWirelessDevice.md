# ImportedWirelessDevice

Information about a wireless device that has been added to an import task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**ImportedWirelessDeviceSidewalk**](ImportedWirelessDeviceSidewalk.md) |  | [optional] 

## Example

```python
from openapi_client.models.imported_wireless_device import ImportedWirelessDevice

# TODO update the JSON string below
json = "{}"
# create an instance of ImportedWirelessDevice from a JSON string
imported_wireless_device_instance = ImportedWirelessDevice.from_json(json)
# print the JSON string representation of the object
print(ImportedWirelessDevice.to_json())

# convert the object into a dict
imported_wireless_device_dict = imported_wireless_device_instance.to_dict()
# create an instance of ImportedWirelessDevice from a dict
imported_wireless_device_from_dict = ImportedWirelessDevice.from_dict(imported_wireless_device_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


