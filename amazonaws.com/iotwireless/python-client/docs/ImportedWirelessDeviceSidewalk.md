# ImportedWirelessDeviceSidewalk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk_manufacturing_sn** | **str** |  | [optional] 
**onboarding_status** | [**OnboardStatus**](OnboardStatus.md) |  | [optional] 
**onboarding_status_reason** | **str** |  | [optional] 
**last_update_time** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.imported_wireless_device_sidewalk import ImportedWirelessDeviceSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of ImportedWirelessDeviceSidewalk from a JSON string
imported_wireless_device_sidewalk_instance = ImportedWirelessDeviceSidewalk.from_json(json)
# print the JSON string representation of the object
print(ImportedWirelessDeviceSidewalk.to_json())

# convert the object into a dict
imported_wireless_device_sidewalk_dict = imported_wireless_device_sidewalk_instance.to_dict()
# create an instance of ImportedWirelessDeviceSidewalk from a dict
imported_wireless_device_sidewalk_from_dict = ImportedWirelessDeviceSidewalk.from_dict(imported_wireless_device_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


