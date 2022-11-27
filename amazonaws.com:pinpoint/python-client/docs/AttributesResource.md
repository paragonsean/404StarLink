# AttributesResource

Provides information about the type and the names of attributes that were removed from all the endpoints that are associated with an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**attribute_type** | **str** |  | 
**attributes** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.attributes_resource import AttributesResource

# TODO update the JSON string below
json = "{}"
# create an instance of AttributesResource from a JSON string
attributes_resource_instance = AttributesResource.from_json(json)
# print the JSON string representation of the object
print(AttributesResource.to_json())

# convert the object into a dict
attributes_resource_dict = attributes_resource_instance.to_dict()
# create an instance of AttributesResource from a dict
attributes_resource_from_dict = AttributesResource.from_dict(attributes_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


