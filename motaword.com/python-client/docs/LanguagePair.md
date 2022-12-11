# LanguagePair


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_language** | **str** |  | [optional] 
**target_language** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.language_pair import LanguagePair

# TODO update the JSON string below
json = "{}"
# create an instance of LanguagePair from a JSON string
language_pair_instance = LanguagePair.from_json(json)
# print the JSON string representation of the object
print(LanguagePair.to_json())

# convert the object into a dict
language_pair_dict = language_pair_instance.to_dict()
# create an instance of LanguagePair from a dict
language_pair_from_dict = LanguagePair.from_dict(language_pair_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


