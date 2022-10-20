# StartImportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_token** | **str** | Start import request client token. | [optional] 
**s3_bucket_source** | [**StartImportRequestS3BucketSource**](StartImportRequestS3BucketSource.md) |  | 

## Example

```python
from openapi_client.models.start_import_request import StartImportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartImportRequest from a JSON string
start_import_request_instance = StartImportRequest.from_json(json)
# print the JSON string representation of the object
print(StartImportRequest.to_json())

# convert the object into a dict
start_import_request_dict = start_import_request_instance.to_dict()
# create an instance of StartImportRequest from a dict
start_import_request_from_dict = StartImportRequest.from_dict(start_import_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


