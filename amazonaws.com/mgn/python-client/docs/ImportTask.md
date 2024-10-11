# ImportTask

Import task.

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
from openapi_client.models.import_task import ImportTask

# TODO update the JSON string below
json = "{}"
# create an instance of ImportTask from a JSON string
import_task_instance = ImportTask.from_json(json)
# print the JSON string representation of the object
print(ImportTask.to_json())

# convert the object into a dict
import_task_dict = import_task_instance.to_dict()
# create an instance of ImportTask from a dict
import_task_from_dict = ImportTask.from_dict(import_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


