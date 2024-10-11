# CreateExportJobResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_job_response** | [**ExportJobResponse**](ExportJobResponse.md) |  | 

## Example

```python
from openapi_client.models.create_export_job_response import CreateExportJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateExportJobResponse from a JSON string
create_export_job_response_instance = CreateExportJobResponse.from_json(json)
# print the JSON string representation of the object
print(CreateExportJobResponse.to_json())

# convert the object into a dict
create_export_job_response_dict = create_export_job_response_instance.to_dict()
# create an instance of CreateExportJobResponse from a dict
create_export_job_response_from_dict = CreateExportJobResponse.from_dict(create_export_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


