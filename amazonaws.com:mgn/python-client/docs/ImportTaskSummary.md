# ImportTaskSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applications** | [**ImportTaskSummaryApplications**](ImportTaskSummaryApplications.md) |  | [optional] 
**servers** | [**ImportTaskSummaryServers**](ImportTaskSummaryServers.md) |  | [optional] 
**waves** | [**ImportTaskSummaryWaves**](ImportTaskSummaryWaves.md) |  | [optional] 

## Example

```python
from openapi_client.models.import_task_summary import ImportTaskSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ImportTaskSummary from a JSON string
import_task_summary_instance = ImportTaskSummary.from_json(json)
# print the JSON string representation of the object
print(ImportTaskSummary.to_json())

# convert the object into a dict
import_task_summary_dict = import_task_summary_instance.to_dict()
# create an instance of ImportTaskSummary from a dict
import_task_summary_from_dict = ImportTaskSummary.from_dict(import_task_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


