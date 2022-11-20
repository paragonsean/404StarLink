# HumanLoopActivationOutput

Shows the results of the human in the loop evaluation. If there is no HumanLoopArn, the input did not trigger human review.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**human_loop_arn** | **str** |  | [optional] 
**human_loop_activation_reasons** | **List** |  | [optional] 
**human_loop_activation_conditions_evaluation_results** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.human_loop_activation_output import HumanLoopActivationOutput

# TODO update the JSON string below
json = "{}"
# create an instance of HumanLoopActivationOutput from a JSON string
human_loop_activation_output_instance = HumanLoopActivationOutput.from_json(json)
# print the JSON string representation of the object
print(HumanLoopActivationOutput.to_json())

# convert the object into a dict
human_loop_activation_output_dict = human_loop_activation_output_instance.to_dict()
# create an instance of HumanLoopActivationOutput from a dict
human_loop_activation_output_from_dict = HumanLoopActivationOutput.from_dict(human_loop_activation_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


