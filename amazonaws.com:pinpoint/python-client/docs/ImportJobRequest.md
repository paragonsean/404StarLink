# ImportJobRequest

Specifies the settings for a job that imports endpoint definitions from an Amazon Simple Storage Service (Amazon S3) bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**define_segment** | **bool** |  | [optional] 
**external_id** | **str** |  | [optional] 
**format** | [**Format**](Format.md) |  | 
**register_endpoints** | **bool** |  | [optional] 
**role_arn** | **str** |  | 
**s3_url** | **str** |  | 
**segment_id** | **str** |  | [optional] 
**segment_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.import_job_request import ImportJobRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ImportJobRequest from a JSON string
import_job_request_instance = ImportJobRequest.from_json(json)
# print the JSON string representation of the object
print(ImportJobRequest.to_json())

# convert the object into a dict
import_job_request_dict = import_job_request_instance.to_dict()
# create an instance of ImportJobRequest from a dict
import_job_request_from_dict = ImportJobRequest.from_dict(import_job_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


