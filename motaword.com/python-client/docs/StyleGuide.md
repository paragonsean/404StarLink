# StyleGuide


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**links** | [**DocumentLinks**](DocumentLinks.md) |  | [optional] 
**name** | **str** |  | [optional] 
**uploaded_at** | **int** | Unix epoch time | [optional] 

## Example

```python
from openapi_client.models.style_guide import StyleGuide

# TODO update the JSON string below
json = "{}"
# create an instance of StyleGuide from a JSON string
style_guide_instance = StyleGuide.from_json(json)
# print the JSON string representation of the object
print(StyleGuide.to_json())

# convert the object into a dict
style_guide_dict = style_guide_instance.to_dict()
# create an instance of StyleGuide from a dict
style_guide_from_dict = StyleGuide.from_dict(style_guide_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


