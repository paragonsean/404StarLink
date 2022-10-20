# ListExportErrorsResponse

List export errors response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_export_errors_response import ListExportErrorsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListExportErrorsResponse from a JSON string
list_export_errors_response_instance = ListExportErrorsResponse.from_json(json)
# print the JSON string representation of the object
print(ListExportErrorsResponse.to_json())

# convert the object into a dict
list_export_errors_response_dict = list_export_errors_response_instance.to_dict()
# create an instance of ListExportErrorsResponse from a dict
list_export_errors_response_from_dict = ListExportErrorsResponse.from_dict(list_export_errors_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


