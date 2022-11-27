# CreateExportJobRequestExportJobRequest

Specifies the settings for a job that exports endpoint definitions to an Amazon Simple Storage Service (Amazon S3) bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | [optional] 
**s3_url_prefix** | **str** |  | [optional] 
**segment_id** | **str** |  | [optional] 
**segment_version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.create_export_job_request_export_job_request import CreateExportJobRequestExportJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateExportJobRequestExportJobRequest from a JSON string
create_export_job_request_export_job_request_instance = CreateExportJobRequestExportJobRequest.from_json(json)
# print the JSON string representation of the object
print(CreateExportJobRequestExportJobRequest.to_json())

# convert the object into a dict
create_export_job_request_export_job_request_dict = create_export_job_request_export_job_request_instance.to_dict()
# create an instance of CreateExportJobRequestExportJobRequest from a dict
create_export_job_request_export_job_request_from_dict = CreateExportJobRequestExportJobRequest.from_dict(create_export_job_request_export_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


