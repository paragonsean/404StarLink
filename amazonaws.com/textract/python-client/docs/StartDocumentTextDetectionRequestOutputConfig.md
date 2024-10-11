# StartDocumentTextDetectionRequestOutputConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3_bucket** | **str** |  | 
**s3_prefix** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.start_document_text_detection_request_output_config import StartDocumentTextDetectionRequestOutputConfig

# TODO update the JSON string below
json = "{}"
# create an instance of StartDocumentTextDetectionRequestOutputConfig from a JSON string
start_document_text_detection_request_output_config_instance = StartDocumentTextDetectionRequestOutputConfig.from_json(json)
# print the JSON string representation of the object
print(StartDocumentTextDetectionRequestOutputConfig.to_json())

# convert the object into a dict
start_document_text_detection_request_output_config_dict = start_document_text_detection_request_output_config_instance.to_dict()
# create an instance of StartDocumentTextDetectionRequestOutputConfig from a dict
start_document_text_detection_request_output_config_from_dict = StartDocumentTextDetectionRequestOutputConfig.from_dict(start_document_text_detection_request_output_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


