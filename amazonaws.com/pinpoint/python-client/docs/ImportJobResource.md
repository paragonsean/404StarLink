# ImportJobResource

Provides information about the resource settings for a job that imports endpoint definitions from one or more files. The files can be stored in an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly from a computer by using the Amazon Pinpoint console.

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
from openapi_client.models.import_job_resource import ImportJobResource

# TODO update the JSON string below
json = "{}"
# create an instance of ImportJobResource from a JSON string
import_job_resource_instance = ImportJobResource.from_json(json)
# print the JSON string representation of the object
print(ImportJobResource.to_json())

# convert the object into a dict
import_job_resource_dict = import_job_resource_instance.to_dict()
# create an instance of ImportJobResource from a dict
import_job_resource_from_dict = ImportJobResource.from_dict(import_job_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


