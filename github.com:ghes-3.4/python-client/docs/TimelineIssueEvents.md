# TimelineIssueEvents

Timeline Event

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
**milestone** | [**DemilestonedIssueEventMilestone**](DemilestonedIssueEventMilestone.md) |  | 
**rename** | [**RenamedIssueEventRename**](RenamedIssueEventRename.md) |  | 
**requested_reviewer** | [**SimpleUser**](SimpleUser.md) |  | [optional] 
**requested_team** | [**Team**](Team.md) |  | [optional] 
**review_requester** | [**SimpleUser**](SimpleUser.md) |  | 
**dismissed_review** | [**ReviewDismissedIssueEventDismissedReview**](ReviewDismissedIssueEventDismissedReview.md) |  | 
**lock_reason** | **str** |  | 
**project_card** | [**AddedToProjectIssueEventProjectCard**](AddedToProjectIssueEventProjectCard.md) |  | [optional] 
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** | The text of the review. | 
**body_html** | **str** |  | [optional] 
**body_text** | **str** |  | [optional] 
**html_url** | **str** |  | 
**issue_url** | **str** |  | 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**updated_at** | **datetime** |  | 
**user** | [**SimpleUser**](SimpleUser.md) |  | 
**source** | [**TimelineCrossReferencedEventSource**](TimelineCrossReferencedEventSource.md) |  | 
**author** | [**GitCommitAuthor**](GitCommitAuthor.md) |  | 
**committer** | [**GitCommitAuthor**](GitCommitAuthor.md) |  | 
**message** | **str** | Message describing the purpose of the commit | 
**parents** | [**List[GitCommitParentsInner]**](GitCommitParentsInner.md) |  | 
**sha** | **str** | SHA for the commit | 
**tree** | [**GitCommitTree**](GitCommitTree.md) |  | 
**verification** | [**GitCommitVerification**](GitCommitVerification.md) |  | 
**links** | [**PullRequestReviewLinks**](PullRequestReviewLinks.md) |  | 
**pull_request_url** | **str** |  | 
**state** | **str** |  | 
**submitted_at** | **datetime** |  | [optional] 
**comments** | [**List[CommitComment]**](CommitComment.md) |  | [optional] 
**assignee** | [**SimpleUser**](SimpleUser.md) |  | 
**state_reason** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.timeline_issue_events import TimelineIssueEvents

# TODO update the JSON string below
json = "{}"
# create an instance of TimelineIssueEvents from a JSON string
timeline_issue_events_instance = TimelineIssueEvents.from_json(json)
# print the JSON string representation of the object
print(TimelineIssueEvents.to_json())

# convert the object into a dict
timeline_issue_events_dict = timeline_issue_events_instance.to_dict()
# create an instance of TimelineIssueEvents from a dict
timeline_issue_events_from_dict = TimelineIssueEvents.from_dict(timeline_issue_events_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


