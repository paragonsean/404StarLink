# GetImportJobResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**import_job_response** | [**ImportJobResponse**](ImportJobResponse.md) |  | 

## Example

```python
from openapi_client.models.get_import_job_response import GetImportJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetImportJobResponse from a JSON string
get_import_job_response_instance = GetImportJobResponse.from_json(json)
# print the JSON string representation of the object
print(GetImportJobResponse.to_json())

# convert the object into a dict
get_import_job_response_dict = get_import_job_response_instance.to_dict()
# create an instance of GetImportJobResponse from a dict
get_import_job_response_from_dict = GetImportJobResponse.from_dict(get_import_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


