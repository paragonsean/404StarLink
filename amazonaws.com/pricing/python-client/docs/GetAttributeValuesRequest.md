# GetAttributeValuesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_code** | **str** |  | 
**attribute_name** | **str** |  | 
**next_token** | **str** |  | [optional] 
**max_results** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.get_attribute_values_request import GetAttributeValuesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetAttributeValuesRequest from a JSON string
get_attribute_values_request_instance = GetAttributeValuesRequest.from_json(json)
# print the JSON string representation of the object
print(GetAttributeValuesRequest.to_json())

# convert the object into a dict
get_attribute_values_request_dict = get_attribute_values_request_instance.to_dict()
# create an instance of GetAttributeValuesRequest from a dict
get_attribute_values_request_from_dict = GetAttributeValuesRequest.from_dict(get_attribute_values_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


