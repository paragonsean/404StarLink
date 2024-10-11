# ExportJobsResponse

Provides information about all the export jobs that are associated with an application or segment. An export job is a job that exports endpoint definitions to a file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.export_jobs_response import ExportJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ExportJobsResponse from a JSON string
export_jobs_response_instance = ExportJobsResponse.from_json(json)
# print the JSON string representation of the object
print(ExportJobsResponse.to_json())

# convert the object into a dict
export_jobs_response_dict = export_jobs_response_instance.to_dict()
# create an instance of ExportJobsResponse from a dict
export_jobs_response_from_dict = ExportJobsResponse.from_dict(export_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


