# AnalyzeDocumentResponseHumanLoopActivationOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**human_loop_arn** | **str** |  | [optional] 
**human_loop_activation_reasons** | **List** |  | [optional] 
**human_loop_activation_conditions_evaluation_results** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.analyze_document_response_human_loop_activation_output import AnalyzeDocumentResponseHumanLoopActivationOutput

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyzeDocumentResponseHumanLoopActivationOutput from a JSON string
analyze_document_response_human_loop_activation_output_instance = AnalyzeDocumentResponseHumanLoopActivationOutput.from_json(json)
# print the JSON string representation of the object
print(AnalyzeDocumentResponseHumanLoopActivationOutput.to_json())

# convert the object into a dict
analyze_document_response_human_loop_activation_output_dict = analyze_document_response_human_loop_activation_output_instance.to_dict()
# create an instance of AnalyzeDocumentResponseHumanLoopActivationOutput from a dict
analyze_document_response_human_loop_activation_output_from_dict = AnalyzeDocumentResponseHumanLoopActivationOutput.from_dict(analyze_document_response_human_loop_activation_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


