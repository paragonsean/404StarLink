# ListExportErrorsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_id** | **str** | List export errors request export id. | 
**max_results** | **int** | List export errors request max results. | [optional] 
**next_token** | **str** | List export errors request next token. | [optional] 

## Example

```python
from openapi_client.models.list_export_errors_request import ListExportErrorsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListExportErrorsRequest from a JSON string
list_export_errors_request_instance = ListExportErrorsRequest.from_json(json)
# print the JSON string representation of the object
print(ListExportErrorsRequest.to_json())

# convert the object into a dict
list_export_errors_request_dict = list_export_errors_request_instance.to_dict()
# create an instance of ListExportErrorsRequest from a dict
list_export_errors_request_from_dict = ListExportErrorsRequest.from_dict(list_export_errors_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


