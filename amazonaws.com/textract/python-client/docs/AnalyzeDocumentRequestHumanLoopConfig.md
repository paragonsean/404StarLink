# AnalyzeDocumentRequestHumanLoopConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**human_loop_name** | **str** |  | 
**flow_definition_arn** | **str** |  | 
**data_attributes** | [**HumanLoopConfigDataAttributes**](HumanLoopConfigDataAttributes.md) |  | [optional] 

## Example

```python
from openapi_client.models.analyze_document_request_human_loop_config import AnalyzeDocumentRequestHumanLoopConfig

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeDocumentRequestHumanLoopConfig from a JSON string
analyze_document_request_human_loop_config_instance = AnalyzeDocumentRequestHumanLoopConfig.from_json(json)
# print the JSON string representation of the object
print(AnalyzeDocumentRequestHumanLoopConfig.to_json())

# convert the object into a dict
analyze_document_request_human_loop_config_dict = analyze_document_request_human_loop_config_instance.to_dict()
# create an instance of AnalyzeDocumentRequestHumanLoopConfig from a dict
analyze_document_request_human_loop_config_from_dict = AnalyzeDocumentRequestHumanLoopConfig.from_dict(analyze_document_request_human_loop_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


