# CreateImportJobResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**import_job_response** | [**ImportJobResponse**](ImportJobResponse.md) |  | 

## Example

```python
from openapi_client.models.create_import_job_response import CreateImportJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateImportJobResponse from a JSON string
create_import_job_response_instance = CreateImportJobResponse.from_json(json)
# print the JSON string representation of the object
print(CreateImportJobResponse.to_json())

# convert the object into a dict
create_import_job_response_dict = create_import_job_response_instance.to_dict()
# create an instance of CreateImportJobResponse from a dict
create_import_job_response_from_dict = CreateImportJobResponse.from_dict(create_import_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


