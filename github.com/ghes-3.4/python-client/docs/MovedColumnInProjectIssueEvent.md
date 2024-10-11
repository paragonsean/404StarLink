# MovedColumnInProjectIssueEvent

Moved Column in Project Issue Event

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
from openapi_client.models.moved_column_in_project_issue_event import MovedColumnInProjectIssueEvent

# TODO update the JSON string below
json = "{}"
# create an instance of MovedColumnInProjectIssueEvent from a JSON string
moved_column_in_project_issue_event_instance = MovedColumnInProjectIssueEvent.from_json(json)
# print the JSON string representation of the object
print(MovedColumnInProjectIssueEvent.to_json())

# convert the object into a dict
moved_column_in_project_issue_event_dict = moved_column_in_project_issue_event_instance.to_dict()
# create an instance of MovedColumnInProjectIssueEvent from a dict
moved_column_in_project_issue_event_from_dict = MovedColumnInProjectIssueEvent.from_dict(moved_column_in_project_issue_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


