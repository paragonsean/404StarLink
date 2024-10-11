# UpdateWirelessDeviceImportTaskRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**UpdateWirelessDeviceImportTaskRequestSidewalk**](UpdateWirelessDeviceImportTaskRequestSidewalk.md) |  | 

## Example

```python
from openapi_client.models.update_wireless_device_import_task_request import UpdateWirelessDeviceImportTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWirelessDeviceImportTaskRequest from a JSON string
update_wireless_device_import_task_request_instance = UpdateWirelessDeviceImportTaskRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateWirelessDeviceImportTaskRequest.to_json())

# convert the object into a dict
update_wireless_device_import_task_request_dict = update_wireless_device_import_task_request_instance.to_dict()
# create an instance of UpdateWirelessDeviceImportTaskRequest from a dict
update_wireless_device_import_task_request_from_dict = UpdateWirelessDeviceImportTaskRequest.from_dict(update_wireless_device_import_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


