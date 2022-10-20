# StartExportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_bucket** | **str** | Start export request s3 bucket. | 
**s3_bucket_owner** | **str** | Start export request s3 bucket owner. | [optional] 
**s3_key** | **str** | Start export request s3key. | 

## Example

```python
from openapi_client.models.start_export_request import StartExportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartExportRequest from a JSON string
start_export_request_instance = StartExportRequest.from_json(json)
# print the JSON string representation of the object
print(StartExportRequest.to_json())

# convert the object into a dict
start_export_request_dict = start_export_request_instance.to_dict()
# create an instance of StartExportRequest from a dict
start_export_request_from_dict = StartExportRequest.from_dict(start_export_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


