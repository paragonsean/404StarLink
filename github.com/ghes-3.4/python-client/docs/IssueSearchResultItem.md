# IssueSearchResultItem

Issue Search Result Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_lock_reason** | **str** |  | [optional] 
**assignee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**assignees** | [**List[SimpleUser]**](SimpleUser.md) |  | [optional] 
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **str** |  | [optional] 
**body_html** | **str** |  | [optional] 
**body_text** | **str** |  | [optional] 
**closed_at** | **datetime** |  | 
**comments** | **int** |  | 
**comments_url** | **str** |  | 
**created_at** | **datetime** |  | 
**draft** | **bool** |  | [optional] 
**events_url** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**labels** | [**List[IssueSearchResultItemLabelsInner]**](IssueSearchResultItemLabelsInner.md) |  | 
**labels_url** | **str** |  | 
**locked** | **bool** |  | 
**milestone** | [**NullableMilestone**](NullableMilestone.md) |  | 
**node_id** | **str** |  | 
**number** | **int** |  | 
**performed_via_github_app** | [**NullableIntegration**](NullableIntegration.md) |  | [optional] 
**pull_request** | [**IssuePullRequest**](IssuePullRequest.md) |  | [optional] 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**repository** | [**Repository**](Repository.md) |  | [optional] 
**repository_url** | **str** |  | 
**score** | **float** |  | 
**state** | **str** |  | 
**state_reason** | **str** |  | [optional] 
**text_matches** | [**List[SearchResultTextMatchesInner]**](SearchResultTextMatchesInner.md) |  | [optional] 
**timeline_url** | **str** |  | [optional] 
**title** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.issue_search_result_item import IssueSearchResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of IssueSearchResultItem from a JSON string
issue_search_result_item_instance = IssueSearchResultItem.from_json(json)
# print the JSON string representation of the object
print(IssueSearchResultItem.to_json())

# convert the object into a dict
issue_search_result_item_dict = issue_search_result_item_instance.to_dict()
# create an instance of IssueSearchResultItem from a dict
issue_search_result_item_from_dict = IssueSearchResultItem.from_dict(issue_search_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


