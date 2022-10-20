# CPU

Source server CPU information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cores** | **int** |  | [optional] 
**model_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.cpu import CPU

# TODO update the JSON string below
json = "{}"
# create an instance of CPU from a JSON string
cpu_instance = CPU.from_json(json)
# print the JSON string representation of the object
print(CPU.to_json())

# convert the object into a dict
cpu_dict = cpu_instance.to_dict()
# create an instance of CPU from a dict
cpu_from_dict = CPU.from_dict(cpu_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


