# ProcessorParameter

Describes the processor parameter. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_name** | [**ProcessorParameterName**](ProcessorParameterName.md) |  | 
**parameter_value** | **str** |  | 

## Example

```python
from openapi_client.models.processor_parameter import ProcessorParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ProcessorParameter from a JSON string
processor_parameter_instance = ProcessorParameter.from_json(json)
# print the JSON string representation of the object
print(ProcessorParameter.to_json())

# convert the object into a dict
processor_parameter_dict = processor_parameter_instance.to_dict()
# create an instance of ProcessorParameter from a dict
processor_parameter_from_dict = ProcessorParameter.from_dict(processor_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


