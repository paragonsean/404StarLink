# GetWirelessDeviceImportTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**arn** | **str** |  | [optional] 
**destination_name** | **str** |  | [optional] 
**sidewalk** | [**GetWirelessDeviceImportTaskResponseSidewalk**](GetWirelessDeviceImportTaskResponseSidewalk.md) |  | [optional] 
**creation_time** | **datetime** |  | [optional] 
**status** | [**ImportTaskStatus**](ImportTaskStatus.md) |  | [optional] 
**status_reason** | **str** |  | [optional] 
**initialized_imported_device_count** | **int** |  | [optional] 
**pending_imported_device_count** | **int** |  | [optional] 
**onboarded_imported_device_count** | **int** |  | [optional] 
**failed_imported_device_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.get_wireless_device_import_task_response import GetWirelessDeviceImportTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWirelessDeviceImportTaskResponse from a JSON string
get_wireless_device_import_task_response_instance = GetWirelessDeviceImportTaskResponse.from_json(json)
# print the JSON string representation of the object
print(GetWirelessDeviceImportTaskResponse.to_json())

# convert the object into a dict
get_wireless_device_import_task_response_dict = get_wireless_device_import_task_response_instance.to_dict()
# create an instance of GetWirelessDeviceImportTaskResponse from a dict
get_wireless_device_import_task_response_from_dict = GetWirelessDeviceImportTaskResponse.from_dict(get_wireless_device_import_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


