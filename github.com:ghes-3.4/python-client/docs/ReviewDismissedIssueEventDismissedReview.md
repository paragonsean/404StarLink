# ReviewDismissedIssueEventDismissedReview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dismissal_commit_id** | **str** |  | [optional] 
**dismissal_message** | **str** |  | 
**review_id** | **int** |  | 
**state** | **str** |  | 

## Example

```python
from openapi_client.models.review_dismissed_issue_event_dismissed_review import ReviewDismissedIssueEventDismissedReview

# TODO update the JSON string below
json = "{}"
# create an instance of ReviewDismissedIssueEventDismissedReview from a JSON string
review_dismissed_issue_event_dismissed_review_instance = ReviewDismissedIssueEventDismissedReview.from_json(json)
# print the JSON string representation of the object
print(ReviewDismissedIssueEventDismissedReview.to_json())

# convert the object into a dict
review_dismissed_issue_event_dismissed_review_dict = review_dismissed_issue_event_dismissed_review_instance.to_dict()
# create an instance of ReviewDismissedIssueEventDismissedReview from a dict
review_dismissed_issue_event_dismissed_review_from_dict = ReviewDismissedIssueEventDismissedReview.from_dict(review_dismissed_issue_event_dismissed_review_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


