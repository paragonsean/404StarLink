# StartExportResponse

Start export response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_task** | [**StartExportResponseExportTask**](StartExportResponseExportTask.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_export_response import StartExportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of StartExportResponse from a JSON string
start_export_response_instance = StartExportResponse.from_json(json)
# print the JSON string representation of the object
print(StartExportResponse.to_json())

# convert the object into a dict
start_export_response_dict = start_export_response_instance.to_dict()
# create an instance of StartExportResponse from a dict
start_export_response_from_dict = StartExportResponse.from_dict(start_export_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


