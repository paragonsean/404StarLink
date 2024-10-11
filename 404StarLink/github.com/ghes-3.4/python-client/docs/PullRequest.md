# PullRequest

Pull requests let you tell others about changes you've pushed to a repository on GitHub. Once a pull request is sent, interested parties can review the set of changes, discuss potential modifications, and even push follow-up commits if necessary.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PullRequestLinks**](PullRequestLinks.md) |  | 
**active_lock_reason** | **str** |  | [optional] 
**additions** | **int** |  | 
**assignee** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**assignees** | [**List[SimpleUser]**](SimpleUser.md) |  | [optional] 
**author_association** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**auto_merge** | [**AutoMerge**](AutoMerge.md) |  | 
**base** | [**PullRequestBase**](PullRequestBase.md) |  | 
**body** | **str** |  | 
**changed_files** | **int** |  | 
**closed_at** | **datetime** |  | 
**comments** | **int** |  | 
**comments_url** | **str** |  | 
**commits** | **int** |  | 
**commits_url** | **str** |  | 
**created_at** | **datetime** |  | 
**deletions** | **int** |  | 
**diff_url** | **str** |  | 
**draft** | **bool** | Indicates whether or not the pull request is a draft. | [optional] 
**head** | [**PullRequestHead**](PullRequestHead.md) |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**issue_url** | **str** |  | 
**labels** | [**List[PullRequestLabelsInner]**](PullRequestLabelsInner.md) |  | 
**locked** | **bool** |  | 
**maintainer_can_modify** | **bool** | Indicates whether maintainers can modify the pull request. | 
**merge_commit_sha** | **str** |  | 
**mergeable** | **bool** |  | 
**mergeable_state** | **str** |  | 
**merged** | **bool** |  | 
**merged_at** | **datetime** |  | 
**merged_by** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**milestone** | [**NullableMilestone**](NullableMilestone.md) |  | 
**node_id** | **str** |  | 
**number** | **int** | Number uniquely identifying the pull request within its repository. | 
**patch_url** | **str** |  | 
**rebaseable** | **bool** |  | [optional] 
**requested_reviewers** | [**List[SimpleUser]**](SimpleUser.md) |  | [optional] 
**requested_teams** | [**List[TeamSimple]**](TeamSimple.md) |  | [optional] 
**review_comment_url** | **str** |  | 
**review_comments** | **int** |  | 
**review_comments_url** | **str** |  | 
**state** | **str** | State of this Pull Request. Either &#x60;open&#x60; or &#x60;closed&#x60;. | 
**statuses_url** | **str** |  | 
**title** | **str** | The title of the pull request. | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.pull_request import PullRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequest from a JSON string
pull_request_instance = PullRequest.from_json(json)
# print the JSON string representation of the object
print(PullRequest.to_json())

# convert the object into a dict
pull_request_dict = pull_request_instance.to_dict()
# create an instance of PullRequest from a dict
pull_request_from_dict = PullRequest.from_dict(pull_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


