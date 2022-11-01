# DemilestonedIssueEvent

Demilestoned Issue Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**SimpleUser**](SimpleUser.md) |  | 
**commit_id** | **str** |  | 
**commit_url** | **str** |  | 
**created_at** | **str** |  | 
**event** | **str** |  | 
**id** | **int** |  | 
**milestone** | [**DemilestonedIssueEventMilestone**](DemilestonedIssueEventMilestone.md) |  | 
**node_id** | **str** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.demilestoned_issue_event import DemilestonedIssueEvent

# TODO update the JSON string below
json = "{}"
# create an instance of DemilestonedIssueEvent from a JSON string
demilestoned_issue_event_instance = DemilestonedIssueEvent.from_json(json)
# print the JSON string representation of the object
print(DemilestonedIssueEvent.to_json())

# convert the object into a dict
demilestoned_issue_event_dict = demilestoned_issue_event_instance.to_dict()
# create an instance of DemilestonedIssueEvent from a dict
demilestoned_issue_event_from_dict = DemilestonedIssueEvent.from_dict(demilestoned_issue_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


