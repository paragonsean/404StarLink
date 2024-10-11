# ListExportsRequestFilters

List exports request filters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_ids** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_exports_request_filters import ListExportsRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of ListExportsRequestFilters from a JSON string
list_exports_request_filters_instance = ListExportsRequestFilters.from_json(json)
# print the JSON string representation of the object
print(ListExportsRequestFilters.to_json())

# convert the object into a dict
list_exports_request_filters_dict = list_exports_request_filters_instance.to_dict()
# create an instance of ListExportsRequestFilters from a dict
list_exports_request_filters_from_dict = ListExportsRequestFilters.from_dict(list_exports_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


