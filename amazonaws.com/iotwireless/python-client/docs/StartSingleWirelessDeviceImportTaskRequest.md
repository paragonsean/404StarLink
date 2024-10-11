# StartSingleWirelessDeviceImportTaskRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_name** | **str** | The name of the Sidewalk destination that describes the IoT rule to route messages from the device in the import task that will be onboarded to AWS IoT Wireless. | 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 
**device_name** | **str** | The name of the wireless device for which an import task is being started. | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 
**sidewalk** | [**StartSingleWirelessDeviceImportTaskRequestSidewalk**](StartSingleWirelessDeviceImportTaskRequestSidewalk.md) |  | 

## Example

```python
from openapi_client.models.start_single_wireless_device_import_task_request import StartSingleWirelessDeviceImportTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartSingleWirelessDeviceImportTaskRequest from a JSON string
start_single_wireless_device_import_task_request_instance = StartSingleWirelessDeviceImportTaskRequest.from_json(json)
# print the JSON string representation of the object
print(StartSingleWirelessDeviceImportTaskRequest.to_json())

# convert the object into a dict
start_single_wireless_device_import_task_request_dict = start_single_wireless_device_import_task_request_instance.to_dict()
# create an instance of StartSingleWirelessDeviceImportTaskRequest from a dict
start_single_wireless_device_import_task_request_from_dict = StartSingleWirelessDeviceImportTaskRequest.from_dict(start_single_wireless_device_import_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


