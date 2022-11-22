# ListWirelessDeviceImportTasksResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**wireless_device_import_task_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_wireless_device_import_tasks_response import ListWirelessDeviceImportTasksResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWirelessDeviceImportTasksResponse from a JSON string
list_wireless_device_import_tasks_response_instance = ListWirelessDeviceImportTasksResponse.from_json(json)
# print the JSON string representation of the object
print(ListWirelessDeviceImportTasksResponse.to_json())

# convert the object into a dict
list_wireless_device_import_tasks_response_dict = list_wireless_device_import_tasks_response_instance.to_dict()
# create an instance of ListWirelessDeviceImportTasksResponse from a dict
list_wireless_device_import_tasks_response_from_dict = ListWirelessDeviceImportTasksResponse.from_dict(list_wireless_device_import_tasks_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


