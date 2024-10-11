# ListDevicesForWirelessDeviceImportTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**destination_name** | **str** |  | [optional] 
**imported_wireless_device_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_devices_for_wireless_device_import_task_response import ListDevicesForWirelessDeviceImportTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListDevicesForWirelessDeviceImportTaskResponse from a JSON string
list_devices_for_wireless_device_import_task_response_instance = ListDevicesForWirelessDeviceImportTaskResponse.from_json(json)
# print the JSON string representation of the object
print(ListDevicesForWirelessDeviceImportTaskResponse.to_json())

# convert the object into a dict
list_devices_for_wireless_device_import_task_response_dict = list_devices_for_wireless_device_import_task_response_instance.to_dict()
# create an instance of ListDevicesForWirelessDeviceImportTaskResponse from a dict
list_devices_for_wireless_device_import_task_response_from_dict = ListDevicesForWirelessDeviceImportTaskResponse.from_dict(list_devices_for_wireless_device_import_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


