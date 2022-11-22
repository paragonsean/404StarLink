# WirelessDeviceImportTask

Information about an import task for wireless devices.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**arn** | **str** |  | [optional] 
**destination_name** | **str** |  | [optional] 
**sidewalk** | [**WirelessDeviceImportTaskSidewalk**](WirelessDeviceImportTaskSidewalk.md) |  | [optional] 
**creation_time** | **datetime** |  | [optional] 
**status** | [**ImportTaskStatus**](ImportTaskStatus.md) |  | [optional] 
**status_reason** | **str** |  | [optional] 
**initialized_imported_device_count** | **int** |  | [optional] 
**pending_imported_device_count** | **int** |  | [optional] 
**onboarded_imported_device_count** | **int** |  | [optional] 
**failed_imported_device_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.wireless_device_import_task import WirelessDeviceImportTask

# TODO update the JSON string below
json = "{}"
# create an instance of WirelessDeviceImportTask from a JSON string
wireless_device_import_task_instance = WirelessDeviceImportTask.from_json(json)
# print the JSON string representation of the object
print(WirelessDeviceImportTask.to_json())

# convert the object into a dict
wireless_device_import_task_dict = wireless_device_import_task_instance.to_dict()
# create an instance of WirelessDeviceImportTask from a dict
wireless_device_import_task_from_dict = WirelessDeviceImportTask.from_dict(wireless_device_import_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


