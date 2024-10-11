# PullRequestSimple

Pull Request Simple

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PullRequestLinks**](PullRequestLinks.md) |  | 
**active_lock_reason** | **str** |  | [optional] 
**assignee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**assignees** | [**List[SimpleUser]**](SimpleUser.md) |  | [optional] 
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**auto_merge** | [**AutoMerge**](AutoMerge.md) |  | 
**base** | [**PullRequestSimpleBase**](PullRequestSimpleBase.md) |  | 
**body** | **str** |  | 
**closed_at** | **datetime** |  | 
**comments_url** | **str** |  | 
**commits_url** | **str** |  | 
**created_at** | **datetime** |  | 
**diff_url** | **str** |  | 
**draft** | **bool** | Indicates whether or not the pull request is a draft. | [optional] 
**head** | [**PullRequestSimpleBase**](PullRequestSimpleBase.md) |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**issue_url** | **str** |  | 
**labels** | [**List[PullRequestSimpleLabelsInner]**](PullRequestSimpleLabelsInner.md) |  | 
**locked** | **bool** |  | 
**merge_commit_sha** | **str** |  | 
**merged_at** | **datetime** |  | 
**milestone** | [**NullableMilestone**](NullableMilestone.md) |  | 
**node_id** | **str** |  | 
**number** | **int** |  | 
**patch_url** | **str** |  | 
**requested_reviewers** | [**List[SimpleUser]**](SimpleUser.md) |  | [optional] 
**requested_teams** | [**List[Team]**](Team.md) |  | [optional] 
**review_comment_url** | **str** |  | 
**review_comments_url** | **str** |  | 
**state** | **str** |  | 
**statuses_url** | **str** |  | 
**title** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.pull_request_simple import PullRequestSimple

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestSimple from a JSON string
pull_request_simple_instance = PullRequestSimple.from_json(json)
# print the JSON string representation of the object
print(PullRequestSimple.to_json())

# convert the object into a dict
pull_request_simple_dict = pull_request_simple_instance.to_dict()
# create an instance of PullRequestSimple from a dict
pull_request_simple_from_dict = PullRequestSimple.from_dict(pull_request_simple_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


