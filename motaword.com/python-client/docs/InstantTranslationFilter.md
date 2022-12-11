# InstantTranslationFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**skip_mt** | **List[str]** |  | [optional] 
**skip_post_edit** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.instant_translation_filter import InstantTranslationFilter

# TODO update the JSON string below
json = "{}"
# create an instance of InstantTranslationFilter from a JSON string
instant_translation_filter_instance = InstantTranslationFilter.from_json(json)
# print the JSON string representation of the object
print(InstantTranslationFilter.to_json())

# convert the object into a dict
instant_translation_filter_dict = instant_translation_filter_instance.to_dict()
# create an instance of InstantTranslationFilter from a dict
instant_translation_filter_from_dict = InstantTranslationFilter.from_dict(instant_translation_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


