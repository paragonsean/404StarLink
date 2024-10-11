# Input

Sets the value of an input field as if you had typed it in. You can also set the value of combo boxes, checkboxes, etc., using this action. In these cases, the value must be the value of the selected option, not visible text.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ignore_if_not_present** | **bool** |  | [optional] 
**selector** | **str** | Must be a valid CSS Selector | [optional] 
**value** | **str** | The value to input. | [optional] 

## Example

```python
from openapi_client.models.input import Input

# TODO update the JSON string below
json = "{}"
# create an instance of Input from a JSON string
input_instance = Input.from_json(json)
# print the JSON string representation of the object
print(Input.to_json())

# convert the object into a dict
input_dict = input_instance.to_dict()
# create an instance of Input from a dict
input_from_dict = Input.from_dict(input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


