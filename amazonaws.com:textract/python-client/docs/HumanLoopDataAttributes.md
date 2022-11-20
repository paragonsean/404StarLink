# HumanLoopDataAttributes

Allows you to set attributes of the image. Currently, you can declare an image as free of personally identifiable information and adult content. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_classifiers** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.human_loop_data_attributes import HumanLoopDataAttributes

# TODO update the JSON string below
json = "{}"
# create an instance of HumanLoopDataAttributes from a JSON string
human_loop_data_attributes_instance = HumanLoopDataAttributes.from_json(json)
# print the JSON string representation of the object
print(HumanLoopDataAttributes.to_json())

# convert the object into a dict
human_loop_data_attributes_dict = human_loop_data_attributes_instance.to_dict()
# create an instance of HumanLoopDataAttributes from a dict
human_loop_data_attributes_from_dict = HumanLoopDataAttributes.from_dict(human_loop_data_attributes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


