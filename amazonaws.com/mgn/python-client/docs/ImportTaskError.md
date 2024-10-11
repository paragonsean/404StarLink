# ImportTaskError

Import task error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_data** | [**ImportTaskErrorErrorData**](ImportTaskErrorErrorData.md) |  | [optional] 
**error_date_time** | **str** |  | [optional] 
**error_type** | [**ImportErrorType**](ImportErrorType.md) |  | [optional] 

## Example

```python
from openapi_client.models.import_task_error import ImportTaskError

# TODO update the JSON string below
json = "{}"
# create an instance of ImportTaskError from a JSON string
import_task_error_instance = ImportTaskError.from_json(json)
# print the JSON string representation of the object
print(ImportTaskError.to_json())

# convert the object into a dict
import_task_error_dict = import_task_error_instance.to_dict()
# create an instance of ImportTaskError from a dict
import_task_error_from_dict = ImportTaskError.from_dict(import_task_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


