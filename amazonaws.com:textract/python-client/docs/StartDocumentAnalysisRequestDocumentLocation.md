# StartDocumentAnalysisRequestDocumentLocation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_object** | [**DocumentLocationS3Object**](DocumentLocationS3Object.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_document_analysis_request_document_location import StartDocumentAnalysisRequestDocumentLocation

# TODO update the JSON string below
json = "{}"
# create an instance of StartDocumentAnalysisRequestDocumentLocation from a JSON string
start_document_analysis_request_document_location_instance = StartDocumentAnalysisRequestDocumentLocation.from_json(json)
# print the JSON string representation of the object
print(StartDocumentAnalysisRequestDocumentLocation.to_json())

# convert the object into a dict
start_document_analysis_request_document_location_dict = start_document_analysis_request_document_location_instance.to_dict()
# create an instance of StartDocumentAnalysisRequestDocumentLocation from a dict
start_document_analysis_request_document_location_from_dict = StartDocumentAnalysisRequestDocumentLocation.from_dict(start_document_analysis_request_document_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


