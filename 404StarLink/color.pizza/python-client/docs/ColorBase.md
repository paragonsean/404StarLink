# ColorBase


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hex** | **str** |  | [optional] 
**hsl** | [**ColorHsl**](ColorHsl.md) |  | [optional] 
**lab** | [**ColorLab**](ColorLab.md) |  | [optional] 
**luminance** | **float** |  | [optional] 
**luminance_wcag** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**rgb** | [**ColorRgb**](ColorRgb.md) |  | [optional] 
**swatch_img** | [**ColorBaseSwatchImg**](ColorBaseSwatchImg.md) |  | [optional] 

## Example

```python
from openapi_client.models.color_base import ColorBase

# TODO update the JSON string below
json = "{}"
# create an instance of ColorBase from a JSON string
color_base_instance = ColorBase.from_json(json)
# print the JSON string representation of the object
print(ColorBase.to_json())

# convert the object into a dict
color_base_dict = color_base_instance.to_dict()
# create an instance of ColorBase from a dict
color_base_from_dict = ColorBase.from_dict(color_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


