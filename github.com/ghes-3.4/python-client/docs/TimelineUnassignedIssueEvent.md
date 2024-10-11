# TimelineUnassignedIssueEvent

Timeline Unassigned Issue Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**SimpleUser**](SimpleUser.md) |  | 
**assignee** | [**SimpleUser**](SimpleUser.md) |  | 
**commit_id** | **str** |  | 
**commit_url** | **str** |  | 
**created_at** | **str** |  | 
**event** | **str** |  | 
**id** | **int** |  | 
**node_id** | **str** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.timeline_unassigned_issue_event import TimelineUnassignedIssueEvent

# TODO update the JSON string below
json = "{}"
# create an instance of TimelineUnassignedIssueEvent from a JSON string
timeline_unassigned_issue_event_instance = TimelineUnassignedIssueEvent.from_json(json)
# print the JSON string representation of the object
print(TimelineUnassignedIssueEvent.to_json())

# convert the object into a dict
timeline_unassigned_issue_event_dict = timeline_unassigned_issue_event_instance.to_dict()
# create an instance of TimelineUnassignedIssueEvent from a dict
timeline_unassigned_issue_event_from_dict = TimelineUnassignedIssueEvent.from_dict(timeline_unassigned_issue_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


