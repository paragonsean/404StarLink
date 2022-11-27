# GetExportJobResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_job_response** | [**ExportJobResponse**](ExportJobResponse.md) |  | 

## Example

```python
from openapi_client.models.get_export_job_response import GetExportJobResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetExportJobResponse from a JSON string
get_export_job_response_instance = GetExportJobResponse.from_json(json)
# print the JSON string representation of the object
print(GetExportJobResponse.to_json())

# convert the object into a dict
get_export_job_response_dict = get_export_job_response_instance.to_dict()
# create an instance of GetExportJobResponse from a dict
get_export_job_response_from_dict = GetExportJobResponse.from_dict(get_export_job_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


