# ExportTask

Export task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_date_time** | **str** |  | [optional] 
**end_date_time** | **str** |  | [optional] 
**export_id** | **str** |  | [optional] 
**progress_percentage** | **float** |  | [optional] 
**s3_bucket** | **str** |  | [optional] 
**s3_bucket_owner** | **str** |  | [optional] 
**s3_key** | **str** |  | [optional] 
**status** | [**ExportStatus**](ExportStatus.md) |  | [optional] 
**summary** | [**ExportTaskSummary**](ExportTaskSummary.md) |  | [optional] 

## Example

```python
from openapi_client.models.export_task import ExportTask

# TODO update the JSON string below
json = "{}"
# create an instance of ExportTask from a JSON string
export_task_instance = ExportTask.from_json(json)
# print the JSON string representation of the object
print(ExportTask.to_json())

# convert the object into a dict
export_task_dict = export_task_instance.to_dict()
# create an instance of ExportTask from a dict
export_task_from_dict = ExportTask.from_dict(export_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


