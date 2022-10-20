# ListImportsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**ListImportsRequestFilters**](ListImportsRequestFilters.md) |  | [optional] 
**max_results** | **int** | List imports request max results. | [optional] 
**next_token** | **str** | List imports request next token. | [optional] 

## Example

```python
from openapi_client.models.list_imports_request import ListImportsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListImportsRequest from a JSON string
list_imports_request_instance = ListImportsRequest.from_json(json)
# print the JSON string representation of the object
print(ListImportsRequest.to_json())

# convert the object into a dict
list_imports_request_dict = list_imports_request_instance.to_dict()
# create an instance of ListImportsRequest from a dict
list_imports_request_from_dict = ListImportsRequest.from_dict(list_imports_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


