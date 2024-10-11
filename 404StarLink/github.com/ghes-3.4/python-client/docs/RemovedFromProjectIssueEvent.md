# RemovedFromProjectIssueEvent

Removed from Project Issue Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**SimpleUser**](SimpleUser.md) |  | 
**commit_id** | **str** |  | 
**commit_url** | **str** |  | 
**created_at** | **str** |  | 
**event** | **str** |  | 
**id** | **int** |  | 
**node_id** | **str** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | 
**project_card** | [**AddedToProjectIssueEventProjectCard**](AddedToProjectIssueEventProjectCard.md) |  | [optional] 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.removed_from_project_issue_event import RemovedFromProjectIssueEvent

# TODO update the JSON string below
json = "{}"
# create an instance of RemovedFromProjectIssueEvent from a JSON string
removed_from_project_issue_event_instance = RemovedFromProjectIssueEvent.from_json(json)
# print the JSON string representation of the object
print(RemovedFromProjectIssueEvent.to_json())

# convert the object into a dict
removed_from_project_issue_event_dict = removed_from_project_issue_event_instance.to_dict()
# create an instance of RemovedFromProjectIssueEvent from a dict
removed_from_project_issue_event_from_dict = RemovedFromProjectIssueEvent.from_dict(removed_from_project_issue_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


