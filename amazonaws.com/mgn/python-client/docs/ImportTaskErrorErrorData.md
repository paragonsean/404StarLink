# ImportTaskErrorErrorData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**ec2_launch_template_id** | **str** |  | [optional] 
**raw_error** | **str** |  | [optional] 
**row_number** | **int** |  | [optional] 
**source_server_id** | **str** |  | [optional] 
**wave_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.import_task_error_error_data import ImportTaskErrorErrorData

# TODO update the JSON string below
json = "{}"
# create an instance of ImportTaskErrorErrorData from a JSON string
import_task_error_error_data_instance = ImportTaskErrorErrorData.from_json(json)
# print the JSON string representation of the object
print(ImportTaskErrorErrorData.to_json())

# convert the object into a dict
import_task_error_error_data_dict = import_task_error_error_data_instance.to_dict()
# create an instance of ImportTaskErrorErrorData from a dict
import_task_error_error_data_from_dict = ImportTaskErrorErrorData.from_dict(import_task_error_error_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


