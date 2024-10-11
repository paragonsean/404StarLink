# TimelineCommentEvent

Timeline Comment Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**SimpleUser**](SimpleUser.md) |  | 
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** | Contents of the issue comment | [optional] 
**body_html** | **str** |  | [optional] 
**body_text** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**event** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** | Unique identifier of the issue comment | 
**issue_url** | **str** |  | 
**node_id** | **str** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | [optional] 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**updated_at** | **datetime** |  | 
**url** | **str** | URL for the issue comment | 
**user** | [**SimpleUser**](SimpleUser.md) |  | 

## Example

```python
from openapi_client.models.timeline_comment_event import TimelineCommentEvent

# TODO update the JSON string below
json = "{}"
# create an instance of TimelineCommentEvent from a JSON string
timeline_comment_event_instance = TimelineCommentEvent.from_json(json)
# print the JSON string representation of the object
print(TimelineCommentEvent.to_json())

# convert the object into a dict
timeline_comment_event_dict = timeline_comment_event_instance.to_dict()
# create an instance of TimelineCommentEvent from a dict
timeline_comment_event_from_dict = TimelineCommentEvent.from_dict(timeline_comment_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


