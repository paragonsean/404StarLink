# ImportTaskS3BucketSource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_bucket** | **str** |  | 
**s3_bucket_owner** | **str** |  | [optional] 
**s3_key** | **str** |  | 

## Example

```python
from openapi_client.models.import_task_s3_bucket_source import ImportTaskS3BucketSource

# TODO update the JSON string below
json = "{}"
# create an instance of ImportTaskS3BucketSource from a JSON string
import_task_s3_bucket_source_instance = ImportTaskS3BucketSource.from_json(json)
# print the JSON string representation of the object
print(ImportTaskS3BucketSource.to_json())

# convert the object into a dict
import_task_s3_bucket_source_dict = import_task_s3_bucket_source_instance.to_dict()
# create an instance of ImportTaskS3BucketSource from a dict
import_task_s3_bucket_source_from_dict = ImportTaskS3BucketSource.from_dict(import_task_s3_bucket_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


