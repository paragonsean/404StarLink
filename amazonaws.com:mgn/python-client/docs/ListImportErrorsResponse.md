# ListImportErrorsResponse

List imports errors response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_import_errors_response import ListImportErrorsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListImportErrorsResponse from a JSON string
list_import_errors_response_instance = ListImportErrorsResponse.from_json(json)
# print the JSON string representation of the object
print(ListImportErrorsResponse.to_json())

# convert the object into a dict
list_import_errors_response_dict = list_import_errors_response_instance.to_dict()
# create an instance of ListImportErrorsResponse from a dict
list_import_errors_response_from_dict = ListImportErrorsResponse.from_dict(list_import_errors_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


