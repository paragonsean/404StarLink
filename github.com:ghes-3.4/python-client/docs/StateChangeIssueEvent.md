# StateChangeIssueEvent

State Change Issue Event

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
**state_reason** | **str** |  | [optional] 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.state_change_issue_event import StateChangeIssueEvent

# TODO update the JSON string below
json = "{}"
# create an instance of StateChangeIssueEvent from a JSON string
state_change_issue_event_instance = StateChangeIssueEvent.from_json(json)
# print the JSON string representation of the object
print(StateChangeIssueEvent.to_json())

# convert the object into a dict
state_change_issue_event_dict = state_change_issue_event_instance.to_dict()
# create an instance of StateChangeIssueEvent from a dict
state_change_issue_event_from_dict = StateChangeIssueEvent.from_dict(state_change_issue_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


