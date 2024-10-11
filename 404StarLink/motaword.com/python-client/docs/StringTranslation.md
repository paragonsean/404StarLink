# StringTranslation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | source string content | [optional] 
**id** | **str** |  | [optional] 
**state** | [**StringTranslationState**](StringTranslationState.md) |  | [optional] 

## Example

```python
from openapi_client.models.string_translation import StringTranslation

# TODO update the JSON string below
json = "{}"
# create an instance of StringTranslation from a JSON string
string_translation_instance = StringTranslation.from_json(json)
# print the JSON string representation of the object
print(StringTranslation.to_json())

# convert the object into a dict
string_translation_dict = string_translation_instance.to_dict()
# create an instance of StringTranslation from a dict
string_translation_from_dict = StringTranslation.from_dict(string_translation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


