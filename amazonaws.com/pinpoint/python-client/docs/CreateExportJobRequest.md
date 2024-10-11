# CreateExportJobRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_job_request** | [**CreateExportJobRequestExportJobRequest**](CreateExportJobRequestExportJobRequest.md) |  | 

## Example

```python
from openapi_client.models.create_export_job_request import CreateExportJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateExportJobRequest from a JSON string
create_export_job_request_instance = CreateExportJobRequest.from_json(json)
# print the JSON string representation of the object
print(CreateExportJobRequest.to_json())

# convert the object into a dict
create_export_job_request_dict = create_export_job_request_instance.to_dict()
# create an instance of CreateExportJobRequest from a dict
create_export_job_request_from_dict = CreateExportJobRequest.from_dict(create_export_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


