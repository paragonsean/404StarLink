# ReviewDismissedIssueEvent

Review Dismissed Issue Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**SimpleUser**](SimpleUser.md) |  | 
**commit_id** | **str** |  | 
**commit_url** | **str** |  | 
**created_at** | **str** |  | 
**dismissed_review** | [**ReviewDismissedIssueEventDismissedReview**](ReviewDismissedIssueEventDismissedReview.md) |  | 
**event** | **str** |  | 
**id** | **int** |  | 
**node_id** | **str** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.review_dismissed_issue_event import ReviewDismissedIssueEvent

# TODO update the JSON string below
json = "{}"
# create an instance of ReviewDismissedIssueEvent from a JSON string
review_dismissed_issue_event_instance = ReviewDismissedIssueEvent.from_json(json)
# print the JSON string representation of the object
print(ReviewDismissedIssueEvent.to_json())

# convert the object into a dict
review_dismissed_issue_event_dict = review_dismissed_issue_event_instance.to_dict()
# create an instance of ReviewDismissedIssueEvent from a dict
review_dismissed_issue_event_from_dict = ReviewDismissedIssueEvent.from_dict(review_dismissed_issue_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


