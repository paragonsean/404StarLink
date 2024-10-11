# GetImportJobsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**import_jobs_response** | [**ImportJobsResponse**](ImportJobsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_import_jobs_response import GetImportJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetImportJobsResponse from a JSON string
get_import_jobs_response_instance = GetImportJobsResponse.from_json(json)
# print the JSON string representation of the object
print(GetImportJobsResponse.to_json())

# convert the object into a dict
get_import_jobs_response_dict = get_import_jobs_response_instance.to_dict()
# create an instance of GetImportJobsResponse from a dict
get_import_jobs_response_from_dict = GetImportJobsResponse.from_dict(get_import_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


