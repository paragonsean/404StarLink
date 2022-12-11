# Formats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documents** | [**FormatsDocuments**](FormatsDocuments.md) |  | [optional] 
**glossaries** | [**FormatsGlossaries**](FormatsGlossaries.md) |  | [optional] 
**styleguides** | [**FormatsGlossaries**](FormatsGlossaries.md) |  | [optional] 

## Example

```python
from openapi_client.models.formats import Formats

# TODO update the JSON string below
json = "{}"
# create an instance of Formats from a JSON string
formats_instance = Formats.from_json(json)
# print the JSON string representation of the object
print(Formats.to_json())

# convert the object into a dict
formats_dict = formats_instance.to_dict()
# create an instance of Formats from a dict
formats_from_dict = Formats.from_dict(formats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


