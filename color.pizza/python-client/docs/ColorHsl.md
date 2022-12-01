# ColorHsl


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**h** | **float** |  | [optional] 
**l** | **float** |  | [optional] 
**s** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.color_hsl import ColorHsl

# TODO update the JSON string below
json = "{}"
# create an instance of ColorHsl from a JSON string
color_hsl_instance = ColorHsl.from_json(json)
# print the JSON string representation of the object
print(ColorHsl.to_json())

# convert the object into a dict
color_hsl_dict = color_hsl_instance.to_dict()
# create an instance of ColorHsl from a dict
color_hsl_from_dict = ColorHsl.from_dict(color_hsl_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


