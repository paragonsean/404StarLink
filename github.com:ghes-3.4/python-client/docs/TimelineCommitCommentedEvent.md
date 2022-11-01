# TimelineCommitCommentedEvent

Timeline Commit Commented Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | [**List[CommitComment]**](CommitComment.md) |  | [optional] 
**commit_id** | **str** |  | [optional] 
**event** | **str** |  | [optional] 
**node_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.timeline_commit_commented_event import TimelineCommitCommentedEvent

# TODO update the JSON string below
json = "{}"
# create an instance of TimelineCommitCommentedEvent from a JSON string
timeline_commit_commented_event_instance = TimelineCommitCommentedEvent.from_json(json)
# print the JSON string representation of the object
print(TimelineCommitCommentedEvent.to_json())

# convert the object into a dict
timeline_commit_commented_event_dict = timeline_commit_commented_event_instance.to_dict()
# create an instance of TimelineCommitCommentedEvent from a dict
timeline_commit_commented_event_from_dict = TimelineCommitCommentedEvent.from_dict(timeline_commit_commented_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


