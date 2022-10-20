# StartImportResponseImportTask


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_date_time** | **str** |  | [optional] 
**end_date_time** | **str** |  | [optional] 
**import_id** | **str** |  | [optional] 
**progress_percentage** | **float** |  | [optional] 
**s3_bucket_source** | [**ImportTaskS3BucketSource**](ImportTaskS3BucketSource.md) |  | [optional] 
**status** | [**ImportStatus**](ImportStatus.md) |  | [optional] 
**summary** | [**ImportTaskSummary**](ImportTaskSummary.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_import_response_import_task import StartImportResponseImportTask

# TODO update the JSON string below
json = "{}"
# create an instance of StartImportResponseImportTask from a JSON string
start_import_response_import_task_instance = StartImportResponseImportTask.from_json(json)
# print the JSON string representation of the object
print(StartImportResponseImportTask.to_json())

# convert the object into a dict
start_import_response_import_task_dict = start_import_response_import_task_instance.to_dict()
# create an instance of StartImportResponseImportTask from a dict
start_import_response_import_task_from_dict = StartImportResponseImportTask.from_dict(start_import_response_import_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


