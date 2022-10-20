# ListImportsResponse

List import response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_imports_response import ListImportsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListImportsResponse from a JSON string
list_imports_response_instance = ListImportsResponse.from_json(json)
# print the JSON string representation of the object
print(ListImportsResponse.to_json())

# convert the object into a dict
list_imports_response_dict = list_imports_response_instance.to_dict()
# create an instance of ListImportsResponse from a dict
list_imports_response_from_dict = ListImportsResponse.from_dict(list_imports_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


