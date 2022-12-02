# Processor

Describes a data processor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**ProcessorType**](ProcessorType.md) |  | 
**parameters** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.processor import Processor

# TODO update the JSON string below
json = "{}"
# create an instance of Processor from a JSON string
processor_instance = Processor.from_json(json)
# print the JSON string representation of the object
print(Processor.to_json())

# convert the object into a dict
processor_dict = processor_instance.to_dict()
# create an instance of Processor from a dict
processor_from_dict = Processor.from_dict(processor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


