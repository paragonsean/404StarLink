# ExportJobResource

Provides information about the resource settings for a job that exports endpoint definitions to a file. The file can be added directly to an Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or downloaded directly to a computer by using the Amazon Pinpoint console.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**s3_url_prefix** | **str** |  | 
**segment_id** | **str** |  | [optional] 
**segment_version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.export_job_resource import ExportJobResource

# TODO update the JSON string below
json = "{}"
# create an instance of ExportJobResource from a JSON string
export_job_resource_instance = ExportJobResource.from_json(json)
# print the JSON string representation of the object
print(ExportJobResource.to_json())

# convert the object into a dict
export_job_resource_dict = export_job_resource_instance.to_dict()
# create an instance of ExportJobResource from a dict
export_job_resource_from_dict = ExportJobResource.from_dict(export_job_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


