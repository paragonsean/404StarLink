# StartExpenseAnalysisRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_location** | [**StartDocumentAnalysisRequestDocumentLocation**](StartDocumentAnalysisRequestDocumentLocation.md) |  | 
**client_request_token** | **str** |  | [optional] 
**job_tag** | **str** |  | [optional] 
**notification_channel** | [**StartDocumentAnalysisRequestNotificationChannel**](StartDocumentAnalysisRequestNotificationChannel.md) |  | [optional] 
**output_config** | [**StartExpenseAnalysisRequestOutputConfig**](StartExpenseAnalysisRequestOutputConfig.md) |  | [optional] 
**kms_key_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.start_expense_analysis_request import StartExpenseAnalysisRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartExpenseAnalysisRequest from a JSON string
start_expense_analysis_request_instance = StartExpenseAnalysisRequest.from_json(json)
# print the JSON string representation of the object
print(StartExpenseAnalysisRequest.to_json())

# convert the object into a dict
start_expense_analysis_request_dict = start_expense_analysis_request_instance.to_dict()
# create an instance of StartExpenseAnalysisRequest from a dict
start_expense_analysis_request_from_dict = StartExpenseAnalysisRequest.from_dict(start_expense_analysis_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


