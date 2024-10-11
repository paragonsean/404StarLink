# StringWithTranslations


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | source string content | [optional] 
**file_id** | **int** |  | [optional] 
**id** | **str** |  | [optional] 
**translations** | [**Dict[str, StringTranslation]**](StringTranslation.md) |  | [optional] 

## Example

```python
from openapi_client.models.string_with_translations import StringWithTranslations

# TODO update the JSON string below
json = "{}"
# create an instance of StringWithTranslations from a JSON string
string_with_translations_instance = StringWithTranslations.from_json(json)
# print the JSON string representation of the object
print(StringWithTranslations.to_json())

# convert the object into a dict
string_with_translations_dict = string_with_translations_instance.to_dict()
# create an instance of StringWithTranslations from a dict
string_with_translations_from_dict = StringWithTranslations.from_dict(string_with_translations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


