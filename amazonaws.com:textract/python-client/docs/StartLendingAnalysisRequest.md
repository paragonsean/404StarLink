# StartLendingAnalysisRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_location** | [**DocumentLocation**](DocumentLocation.md) |  | 
**client_request_token** | **str** |  | [optional] 
**job_tag** | **str** |  | [optional] 
**notification_channel** | [**NotificationChannel**](NotificationChannel.md) |  | [optional] 
**output_config** | [**OutputConfig**](OutputConfig.md) |  | [optional] 
**kms_key_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.start_lending_analysis_request import StartLendingAnalysisRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartLendingAnalysisRequest from a JSON string
start_lending_analysis_request_instance = StartLendingAnalysisRequest.from_json(json)
# print the JSON string representation of the object
print(StartLendingAnalysisRequest.to_json())

# convert the object into a dict
start_lending_analysis_request_dict = start_lending_analysis_request_instance.to_dict()
# create an instance of StartLendingAnalysisRequest from a dict
start_lending_analysis_request_from_dict = StartLendingAnalysisRequest.from_dict(start_lending_analysis_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


