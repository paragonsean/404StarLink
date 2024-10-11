# CreateImportJobRequestImportJobRequest

Specifies the settings for a job that imports endpoint definitions from an Amazon Simple Storage Service (Amazon S3) bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**define_segment** | **bool** |  | [optional] 
**external_id** | **str** |  | [optional] 
**format** | [**Format**](Format.md) |  | [optional] 
**register_endpoints** | **bool** |  | [optional] 
**role_arn** | **str** |  | [optional] 
**s3_url** | **str** |  | [optional] 
**segment_id** | **str** |  | [optional] 
**segment_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_import_job_request_import_job_request import CreateImportJobRequestImportJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateImportJobRequestImportJobRequest from a JSON string
create_import_job_request_import_job_request_instance = CreateImportJobRequestImportJobRequest.from_json(json)
# print the JSON string representation of the object
print(CreateImportJobRequestImportJobRequest.to_json())

# convert the object into a dict
create_import_job_request_import_job_request_dict = create_import_job_request_import_job_request_instance.to_dict()
# create an instance of CreateImportJobRequestImportJobRequest from a dict
create_import_job_request_import_job_request_from_dict = CreateImportJobRequestImportJobRequest.from_dict(create_import_job_request_import_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


