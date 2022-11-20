# StartDocumentAnalysisRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_location** | [**StartDocumentAnalysisRequestDocumentLocation**](StartDocumentAnalysisRequestDocumentLocation.md) |  | 
**feature_types** | **List** |  | 
**client_request_token** | **str** |  | [optional] 
**job_tag** | **str** |  | [optional] 
**notification_channel** | [**StartDocumentAnalysisRequestNotificationChannel**](StartDocumentAnalysisRequestNotificationChannel.md) |  | [optional] 
**output_config** | [**StartDocumentAnalysisRequestOutputConfig**](StartDocumentAnalysisRequestOutputConfig.md) |  | [optional] 
**kms_key_id** | **str** |  | [optional] 
**queries_config** | [**QueriesConfig**](QueriesConfig.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_document_analysis_request import StartDocumentAnalysisRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartDocumentAnalysisRequest from a JSON string
start_document_analysis_request_instance = StartDocumentAnalysisRequest.from_json(json)
# print the JSON string representation of the object
print(StartDocumentAnalysisRequest.to_json())

# convert the object into a dict
start_document_analysis_request_dict = start_document_analysis_request_instance.to_dict()
# create an instance of StartDocumentAnalysisRequest from a dict
start_document_analysis_request_from_dict = StartDocumentAnalysisRequest.from_dict(start_document_analysis_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


