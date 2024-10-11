# SimpleModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.simple_model import SimpleModel

# TODO update the JSON string below
json = "{}"
# create an instance of SimpleModel from a JSON string
simple_model_instance = SimpleModel.from_json(json)
# print the JSON string representation of the object
print(SimpleModel.to_json())

# convert the object into a dict
simple_model_dict = simple_model_instance.to_dict()
# create an instance of SimpleModel from a dict
simple_model_from_dict = SimpleModel.from_dict(simple_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


