# ProjectCompletionReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin_user_id** | **float** | Assigned admin&#39;s user id | [optional] 
**completion_report_data** | [**List[InvitedVendorsByLanguage]**](InvitedVendorsByLanguage.md) |  | [optional] 
**id** | **float** | internal id of the project | [optional] 
**quote_id** | **float** | quote id of the project | [optional] 

## Example

```python
from openapi_client.models.project_completion_report import ProjectCompletionReport

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectCompletionReport from a JSON string
project_completion_report_instance = ProjectCompletionReport.from_json(json)
# print the JSON string representation of the object
print(ProjectCompletionReport.to_json())

# convert the object into a dict
project_completion_report_dict = project_completion_report_instance.to_dict()
# create an instance of ProjectCompletionReport from a dict
project_completion_report_from_dict = ProjectCompletionReport.from_dict(project_completion_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


