# ExportTaskError

Export task error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_data** | [**ExportTaskErrorErrorData**](ExportTaskErrorErrorData.md) |  | [optional] 
**error_date_time** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.export_task_error import ExportTaskError

# TODO update the JSON string below
json = "{}"
# create an instance of ExportTaskError from a JSON string
export_task_error_instance = ExportTaskError.from_json(json)
# print the JSON string representation of the object
print(ExportTaskError.to_json())

# convert the object into a dict
export_task_error_dict = export_task_error_instance.to_dict()
# create an instance of ExportTaskError from a dict
export_task_error_from_dict = ExportTaskError.from_dict(export_task_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


