# StartImportResponse

Start import response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**import_task** | [**StartImportResponseImportTask**](StartImportResponseImportTask.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_import_response import StartImportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of StartImportResponse from a JSON string
start_import_response_instance = StartImportResponse.from_json(json)
# print the JSON string representation of the object
print(StartImportResponse.to_json())

# convert the object into a dict
start_import_response_dict = start_import_response_instance.to_dict()
# create an instance of StartImportResponse from a dict
start_import_response_from_dict = StartImportResponse.from_dict(start_import_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


