# StyleGuideList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**styleguides** | [**List[StyleGuide]**](StyleGuide.md) |  | [optional] 

## Example

```python
from openapi_client.models.style_guide_list import StyleGuideList

# TODO update the JSON string below
json = "{}"
# create an instance of StyleGuideList from a JSON string
style_guide_list_instance = StyleGuideList.from_json(json)
# print the JSON string representation of the object
print(StyleGuideList.to_json())

# convert the object into a dict
style_guide_list_dict = style_guide_list_instance.to_dict()
# create an instance of StyleGuideList from a dict
style_guide_list_from_dict = StyleGuideList.from_dict(style_guide_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


