# StartExportResponseExportTask


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
from openapi_client.models.start_export_response_export_task import StartExportResponseExportTask

# TODO update the JSON string below
json = "{}"
# create an instance of StartExportResponseExportTask from a JSON string
start_export_response_export_task_instance = StartExportResponseExportTask.from_json(json)
# print the JSON string representation of the object
print(StartExportResponseExportTask.to_json())

# convert the object into a dict
start_export_response_export_task_dict = start_export_response_export_task_instance.to_dict()
# create an instance of StartExportResponseExportTask from a dict
start_export_response_export_task_from_dict = StartExportResponseExportTask.from_dict(start_export_response_export_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


