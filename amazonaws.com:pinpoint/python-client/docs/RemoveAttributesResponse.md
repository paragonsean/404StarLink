# RemoveAttributesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes_resource** | [**AttributesResource**](AttributesResource.md) |  | 

## Example

```python
from openapi_client.models.remove_attributes_response import RemoveAttributesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveAttributesResponse from a JSON string
remove_attributes_response_instance = RemoveAttributesResponse.from_json(json)
# print the JSON string representation of the object
print(RemoveAttributesResponse.to_json())

# convert the object into a dict
remove_attributes_response_dict = remove_attributes_response_instance.to_dict()
# create an instance of RemoveAttributesResponse from a dict
remove_attributes_response_from_dict = RemoveAttributesResponse.from_dict(remove_attributes_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


