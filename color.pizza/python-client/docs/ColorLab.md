# ColorLab


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**a** | **float** |  | [optional] 
**b** | **float** |  | [optional] 
**l** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.color_lab import ColorLab

# TODO update the JSON string below
json = "{}"
# create an instance of ColorLab from a JSON string
color_lab_instance = ColorLab.from_json(json)
# print the JSON string representation of the object
print(ColorLab.to_json())

# convert the object into a dict
color_lab_dict = color_lab_instance.to_dict()
# create an instance of ColorLab from a dict
color_lab_from_dict = ColorLab.from_dict(color_lab_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


