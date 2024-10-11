# StartDocumentAnalysisRequestNotificationChannel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sns_topic_arn** | **str** |  | 
**role_arn** | **str** |  | 

## Example

```python
from openapi_client.models.start_document_analysis_request_notification_channel import StartDocumentAnalysisRequestNotificationChannel

# TODO update the JSON string below
json = "{}"
# create an instance of StartDocumentAnalysisRequestNotificationChannel from a JSON string
start_document_analysis_request_notification_channel_instance = StartDocumentAnalysisRequestNotificationChannel.from_json(json)
# print the JSON string representation of the object
print(StartDocumentAnalysisRequestNotificationChannel.to_json())

# convert the object into a dict
start_document_analysis_request_notification_channel_dict = start_document_analysis_request_notification_channel_instance.to_dict()
# create an instance of StartDocumentAnalysisRequestNotificationChannel from a dict
start_document_analysis_request_notification_channel_from_dict = StartDocumentAnalysisRequestNotificationChannel.from_dict(start_document_analysis_request_notification_channel_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


