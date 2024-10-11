# HumanLoopConfig

Sets up the human review workflow the document will be sent to if one of the conditions is met. You can also set certain attributes of the image before review. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**human_loop_name** | **str** |  | 
**flow_definition_arn** | **str** |  | 
**data_attributes** | [**HumanLoopConfigDataAttributes**](HumanLoopConfigDataAttributes.md) |  | [optional] 

## Example

```python
from openapi_client.models.human_loop_config import HumanLoopConfig

# TODO update the JSON string below
json = "{}"
# create an instance of HumanLoopConfig from a JSON string
human_loop_config_instance = HumanLoopConfig.from_json(json)
# print the JSON string representation of the object
print(HumanLoopConfig.to_json())

# convert the object into a dict
human_loop_config_dict = human_loop_config_instance.to_dict()
# create an instance of HumanLoopConfig from a dict
human_loop_config_from_dict = HumanLoopConfig.from_dict(human_loop_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


