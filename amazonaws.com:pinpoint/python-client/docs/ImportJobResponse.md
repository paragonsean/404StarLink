# ImportJobResponse

Provides information about the status and settings of a job that imports endpoint definitions from one or more files. The files can be stored in an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a computer by using the Amazon Pinpoint console.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**completed_pieces** | **int** |  | [optional] 
**completion_date** | **str** |  | [optional] 
**creation_date** | **str** |  | 
**definition** | [**ImportJobResponseDefinition**](ImportJobResponseDefinition.md) |  | 
**failed_pieces** | **int** |  | [optional] 
**failures** | **List** |  | [optional] 
**id** | **str** |  | 
**job_status** | [**JobStatus**](JobStatus.md) |  | 
**total_failures** | **int** |  | [optional] 
**total_pieces** | **int** |  | [optional] 
**total_processed** | **int** |  | [optional] 
**type** | **str** |  | 

## Example

```python
from openapi_client.models.import_job_response import ImportJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ImportJobResponse from a JSON string
import_job_response_instance = ImportJobResponse.from_json(json)
# print the JSON string representation of the object
print(ImportJobResponse.to_json())

# convert the object into a dict
import_job_response_dict = import_job_response_instance.to_dict()
# create an instance of ImportJobResponse from a dict
import_job_response_from_dict = ImportJobResponse.from_dict(import_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


