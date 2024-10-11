# S3BucketSource

S3 bucket source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_bucket** | **str** |  | 
**s3_bucket_owner** | **str** |  | [optional] 
**s3_key** | **str** |  | 

## Example

```python
from openapi_client.models.s3_bucket_source import S3BucketSource

# TODO update the JSON string below
json = "{}"
# create an instance of S3BucketSource from a JSON string
s3_bucket_source_instance = S3BucketSource.from_json(json)
# print the JSON string representation of the object
print(S3BucketSource.to_json())

# convert the object into a dict
s3_bucket_source_dict = s3_bucket_source_instance.to_dict()
# create an instance of S3BucketSource from a dict
s3_bucket_source_from_dict = S3BucketSource.from_dict(s3_bucket_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


