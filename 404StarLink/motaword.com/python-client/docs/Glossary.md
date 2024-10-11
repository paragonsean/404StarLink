# Glossary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**links** | [**DocumentLinks**](DocumentLinks.md) |  | [optional] 
**name** | **str** |  | [optional] 
**uploaded_at** | **int** | Unix epoch time | [optional] 

## Example

```python
from openapi_client.models.glossary import Glossary

# TODO update the JSON string below
json = "{}"
# create an instance of Glossary from a JSON string
glossary_instance = Glossary.from_json(json)
# print the JSON string representation of the object
print(Glossary.to_json())

# convert the object into a dict
glossary_dict = glossary_instance.to_dict()
# create an instance of Glossary from a dict
glossary_from_dict = Glossary.from_dict(glossary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


