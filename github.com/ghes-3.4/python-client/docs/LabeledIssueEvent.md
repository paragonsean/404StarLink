# LabeledIssueEvent

Labeled Issue Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**SimpleUser**](SimpleUser.md) |  | 
**commit_id** | **str** |  | 
**commit_url** | **str** |  | 
**created_at** | **str** |  | 
**event** | **str** |  | 
**id** | **int** |  | 
**label** | [**LabeledIssueEventLabel**](LabeledIssueEventLabel.md) |  | 
**node_id** | **str** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.labeled_issue_event import LabeledIssueEvent

# TODO update the JSON string below
json = "{}"
# create an instance of LabeledIssueEvent from a JSON string
labeled_issue_event_instance = LabeledIssueEvent.from_json(json)
# print the JSON string representation of the object
print(LabeledIssueEvent.to_json())

# convert the object into a dict
labeled_issue_event_dict = labeled_issue_event_instance.to_dict()
# create an instance of LabeledIssueEvent from a dict
labeled_issue_event_from_dict = LabeledIssueEvent.from_dict(labeled_issue_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


