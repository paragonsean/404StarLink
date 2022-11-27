# ImportJobsResponse

Provides information about the status and settings of all the import jobs that are associated with an application or segment. An import job is a job that imports endpoint definitions from one or more files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.import_jobs_response import ImportJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ImportJobsResponse from a JSON string
import_jobs_response_instance = ImportJobsResponse.from_json(json)
# print the JSON string representation of the object
print(ImportJobsResponse.to_json())

# convert the object into a dict
import_jobs_response_dict = import_jobs_response_instance.to_dict()
# create an instance of ImportJobsResponse from a dict
import_jobs_response_from_dict = ImportJobsResponse.from_dict(import_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


