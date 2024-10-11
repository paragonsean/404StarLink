# ListExportsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**ListExportsRequestFilters**](ListExportsRequestFilters.md) |  | [optional] 
**max_results** | **int** | List export request max results. | [optional] 
**next_token** | **str** | List export request next token. | [optional] 

## Example

```python
from openapi_client.models.list_exports_request import ListExportsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListExportsRequest from a JSON string
list_exports_request_instance = ListExportsRequest.from_json(json)
# print the JSON string representation of the object
print(ListExportsRequest.to_json())

# convert the object into a dict
list_exports_request_dict = list_exports_request_instance.to_dict()
# create an instance of ListExportsRequest from a dict
list_exports_request_from_dict = ListExportsRequest.from_dict(list_exports_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


