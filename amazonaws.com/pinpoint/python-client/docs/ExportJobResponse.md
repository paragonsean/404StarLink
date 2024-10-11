# ExportJobResponse

Provides information about the status and settings of a job that exports endpoint definitions to a file. The file can be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or downloaded directly to a computer by using the Amazon Pinpoint console.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**completed_pieces** | **int** |  | [optional] 
**completion_date** | **str** |  | [optional] 
**creation_date** | **str** |  | 
**definition** | [**ExportJobResponseDefinition**](ExportJobResponseDefinition.md) |  | 
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
from openapi_client.models.export_job_response import ExportJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ExportJobResponse from a JSON string
export_job_response_instance = ExportJobResponse.from_json(json)
# print the JSON string representation of the object
print(ExportJobResponse.to_json())

# convert the object into a dict
export_job_response_dict = export_job_response_instance.to_dict()
# create an instance of ExportJobResponse from a dict
export_job_response_from_dict = ExportJobResponse.from_dict(export_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


