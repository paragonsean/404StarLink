# GetAttributeValuesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute_values** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_attribute_values_response import GetAttributeValuesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetAttributeValuesResponse from a JSON string
get_attribute_values_response_instance = GetAttributeValuesResponse.from_json(json)
# print the JSON string representation of the object
print(GetAttributeValuesResponse.to_json())

# convert the object into a dict
get_attribute_values_response_dict = get_attribute_values_response_instance.to_dict()
# create an instance of GetAttributeValuesResponse from a dict
get_attribute_values_response_from_dict = GetAttributeValuesResponse.from_dict(get_attribute_values_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


