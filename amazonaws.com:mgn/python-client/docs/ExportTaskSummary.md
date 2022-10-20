# ExportTaskSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applications_count** | **int** |  | [optional] 
**servers_count** | **int** |  | [optional] 
**waves_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.export_task_summary import ExportTaskSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ExportTaskSummary from a JSON string
export_task_summary_instance = ExportTaskSummary.from_json(json)
# print the JSON string representation of the object
print(ExportTaskSummary.to_json())

# convert the object into a dict
export_task_summary_dict = export_task_summary_instance.to_dict()
# create an instance of ExportTaskSummary from a dict
export_task_summary_from_dict = ExportTaskSummary.from_dict(export_task_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


