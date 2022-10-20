# StartImportRequestS3BucketSource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_bucket** | **str** |  | 
**s3_bucket_owner** | **str** |  | [optional] 
**s3_key** | **str** |  | 

## Example

```python
from openapi_client.models.start_import_request_s3_bucket_source import StartImportRequestS3BucketSource

# TODO update the JSON string below
json = "{}"
# create an instance of StartImportRequestS3BucketSource from a JSON string
start_import_request_s3_bucket_source_instance = StartImportRequestS3BucketSource.from_json(json)
# print the JSON string representation of the object
print(StartImportRequestS3BucketSource.to_json())

# convert the object into a dict
start_import_request_s3_bucket_source_dict = start_import_request_s3_bucket_source_instance.to_dict()
# create an instance of StartImportRequestS3BucketSource from a dict
start_import_request_s3_bucket_source_from_dict = StartImportRequestS3BucketSource.from_dict(start_import_request_s3_bucket_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


