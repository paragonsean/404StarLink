# TeamRepository

A team's access to a repository.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_auto_merge** | **bool** | Whether to allow Auto-merge to be used on pull requests. | [optional] [default to False]
**allow_forking** | **bool** | Whether to allow forking this repo | [optional] [default to False]
**allow_merge_commit** | **bool** | Whether to allow merge commits for pull requests. | [optional] [default to True]
**allow_rebase_merge** | **bool** | Whether to allow rebase merges for pull requests. | [optional] [default to True]
**allow_squash_merge** | **bool** | Whether to allow squash merges for pull requests. | [optional] [default to True]
**archive_url** | **str** |  | 
**archived** | **bool** | Whether the repository is archived. | [default to False]
**assignees_url** | **str** |  | 
**blobs_url** | **str** |  | 
**branches_url** | **str** |  | 
**clone_url** | **str** |  | 
**collaborators_url** | **str** |  | 
**comments_url** | **str** |  | 
**commits_url** | **str** |  | 
**compare_url** | **str** |  | 
**contents_url** | **str** |  | 
**contributors_url** | **str** |  | 
**created_at** | **datetime** |  | 
**default_branch** | **str** | The default branch of the repository. | 
**delete_branch_on_merge** | **bool** | Whether to delete head branches when pull requests are merged | [optional] [default to False]
**deployments_url** | **str** |  | 
**description** | **str** |  | 
**disabled** | **bool** | Returns whether or not this repository disabled. | 
**downloads_url** | **str** |  | 
**events_url** | **str** |  | 
**fork** | **bool** |  | 
**forks** | **int** |  | 
**forks_count** | **int** |  | 
**forks_url** | **str** |  | 
**full_name** | **str** |  | 
**git_commits_url** | **str** |  | 
**git_refs_url** | **str** |  | 
**git_tags_url** | **str** |  | 
**git_url** | **str** |  | 
**has_downloads** | **bool** | Whether downloads are enabled. | [default to True]
**has_issues** | **bool** | Whether issues are enabled. | [default to True]
**has_pages** | **bool** |  | 
**has_projects** | **bool** | Whether projects are enabled. | [default to True]
**has_wiki** | **bool** | Whether the wiki is enabled. | [default to True]
**homepage** | **str** |  | 
**hooks_url** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** | Unique identifier of the repository | 
**is_template** | **bool** | Whether this repository acts as a template that can be used to generate new repositories. | [optional] [default to False]
**issue_comment_url** | **str** |  | 
**issue_events_url** | **str** |  | 
**issues_url** | **str** |  | 
**keys_url** | **str** |  | 
**labels_url** | **str** |  | 
**language** | **str** |  | 
**languages_url** | **str** |  | 
**license** | [**NullableLicenseSimple**](NullableLicenseSimple.md) |  | 
**master_branch** | **str** |  | [optional] 
**merges_url** | **str** |  | 
**milestones_url** | **str** |  | 
**mirror_url** | **str** |  | 
**name** | **str** | The name of the repository. | 
**network_count** | **int** |  | [optional] 
**node_id** | **str** |  | 
**notifications_url** | **str** |  | 
**open_issues** | **int** |  | 
**open_issues_count** | **int** |  | 
**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**permissions** | [**CollaboratorPermissions**](CollaboratorPermissions.md) |  | [optional] 
**private** | **bool** | Whether the repository is private or public. | [default to False]
**pulls_url** | **str** |  | 
**pushed_at** | **datetime** |  | 
**releases_url** | **str** |  | 
**size** | **int** |  | 
**ssh_url** | **str** |  | 
**stargazers_count** | **int** |  | 
**stargazers_url** | **str** |  | 
**statuses_url** | **str** |  | 
**subscribers_count** | **int** |  | [optional] 
**subscribers_url** | **str** |  | 
**subscription_url** | **str** |  | 
**svn_url** | **str** |  | 
**tags_url** | **str** |  | 
**teams_url** | **str** |  | 
**temp_clone_token** | **str** |  | [optional] 
**template_repository** | [**NullableRepository**](NullableRepository.md) |  | [optional] 
**topics** | **List[str]** |  | [optional] 
**trees_url** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**visibility** | **str** | The repository visibility: public, private, or internal. | [optional] [default to 'public']
**watchers** | **int** |  | 
**watchers_count** | **int** |  | 

## Example

```python
from openapi_client.models.team_repository import TeamRepository

# TODO update the JSON string below
json = "{}"
# create an instance of TeamRepository from a JSON string
team_repository_instance = TeamRepository.from_json(json)
# print the JSON string representation of the object
print(TeamRepository.to_json())

# convert the object into a dict
team_repository_dict = team_repository_instance.to_dict()
# create an instance of TeamRepository from a dict
team_repository_from_dict = TeamRepository.from_dict(team_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


