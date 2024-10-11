# TimelineCommittedEvent

Timeline Committed Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**GitCommitAuthor**](GitCommitAuthor.md) |  | 
**committer** | [**GitCommitAuthor**](GitCommitAuthor.md) |  | 
**event** | **str** |  | [optional] 
**html_url** | **str** |  | 
**message** | **str** | Message describing the purpose of the commit | 
**node_id** | **str** |  | 
**parents** | [**List[GitCommitParentsInner]**](GitCommitParentsInner.md) |  | 
**sha** | **str** | SHA for the commit | 
**tree** | [**GitCommitTree**](GitCommitTree.md) |  | 
**url** | **str** |  | 
**verification** | [**GitCommitVerification**](GitCommitVerification.md) |  | 

## Example

```python
from openapi_client.models.timeline_committed_event import TimelineCommittedEvent

# TODO update the JSON string below
json = "{}"
# create an instance of TimelineCommittedEvent from a JSON string
timeline_committed_event_instance = TimelineCommittedEvent.from_json(json)
# print the JSON string representation of the object
print(TimelineCommittedEvent.to_json())

# convert the object into a dict
timeline_committed_event_dict = timeline_committed_event_instance.to_dict()
# create an instance of TimelineCommittedEvent from a dict
timeline_committed_event_from_dict = TimelineCommittedEvent.from_dict(timeline_committed_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


