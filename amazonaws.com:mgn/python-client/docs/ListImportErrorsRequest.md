# ListImportErrorsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**import_id** | **str** | List import errors request import id. | 
**max_results** | **int** | List import errors request max results. | [optional] 
**next_token** | **str** | List import errors request next token. | [optional] 

## Example

```python
from openapi_client.models.list_import_errors_request import ListImportErrorsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListImportErrorsRequest from a JSON string
list_import_errors_request_instance = ListImportErrorsRequest.from_json(json)
# print the JSON string representation of the object
print(ListImportErrorsRequest.to_json())

# convert the object into a dict
list_import_errors_request_dict = list_import_errors_request_instance.to_dict()
# create an instance of ListImportErrorsRequest from a dict
list_import_errors_request_from_dict = ListImportErrorsRequest.from_dict(list_import_errors_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


