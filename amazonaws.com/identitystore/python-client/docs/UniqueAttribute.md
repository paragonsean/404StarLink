# UniqueAttribute

An entity attribute that's unique to a specific entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute_path** | **str** |  | 
**attribute_value** | **object** |  | 

## Example

```python
from openapi_client.models.unique_attribute import UniqueAttribute

# TODO update the JSON string below
json = "{}"
# create an instance of UniqueAttribute from a JSON string
unique_attribute_instance = UniqueAttribute.from_json(json)
# print the JSON string representation of the object
print(UniqueAttribute.to_json())

# convert the object into a dict
unique_attribute_dict = unique_attribute_instance.to_dict()
# create an instance of UniqueAttribute from a dict
unique_attribute_from_dict = UniqueAttribute.from_dict(unique_attribute_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


