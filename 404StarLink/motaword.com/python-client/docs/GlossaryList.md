# GlossaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glossaries** | [**List[Glossary]**](Glossary.md) |  | [optional] 
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.glossary_list import GlossaryList

# TODO update the JSON string below
json = "{}"
# create an instance of GlossaryList from a JSON string
glossary_list_instance = GlossaryList.from_json(json)
# print the JSON string representation of the object
print(GlossaryList.to_json())

# convert the object into a dict
glossary_list_dict = glossary_list_instance.to_dict()
# create an instance of GlossaryList from a dict
glossary_list_from_dict = GlossaryList.from_dict(glossary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


