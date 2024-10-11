# FullRepository

Full Repository

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_auto_merge** | **bool** |  | [optional] 
**allow_forking** | **bool** |  | [optional] 
**allow_merge_commit** | **bool** |  | [optional] 
**allow_rebase_merge** | **bool** |  | [optional] 
**allow_squash_merge** | **bool** |  | [optional] 
**allow_update_branch** | **bool** |  | [optional] 
**anonymous_access_enabled** | **bool** | Whether anonymous git access is allowed. | [optional] [default to True]
**archive_url** | **str** |  | 
**archived** | **bool** |  | 
**assignees_url** | **str** |  | 
**blobs_url** | **str** |  | 
**branches_url** | **str** |  | 
**clone_url** | **str** |  | 
**code_of_conduct** | [**CodeOfConductSimple**](CodeOfConductSimple.md) |  | [optional] 
**collaborators_url** | **str** |  | 
**comments_url** | **str** |  | 
**commits_url** | **str** |  | 
**compare_url** | **str** |  | 
**contents_url** | **str** |  | 
**contributors_url** | **str** |  | 
**created_at** | **datetime** |  | 
**default_branch** | **str** |  | 
**delete_branch_on_merge** | **bool** |  | [optional] 
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
**has_downloads** | **bool** |  | 
**has_issues** | **bool** |  | 
**has_pages** | **bool** |  | 
**has_projects** | **bool** |  | 
**has_wiki** | **bool** |  | 
**homepage** | **str** |  | 
**hooks_url** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**is_template** | **bool** |  | [optional] 
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
**name** | **str** |  | 
**network_count** | **int** |  | 
**node_id** | **str** |  | 
**notifications_url** | **str** |  | 
**open_issues** | **int** |  | 
**open_issues_count** | **int** |  | 
**organization** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | [optional] 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**parent** | [**Repository**](Repository.md) |  | [optional] 
**permissions** | [**CollaboratorPermissions**](CollaboratorPermissions.md) |  | [optional] 
**private** | **bool** |  | 
**pulls_url** | **str** |  | 
**pushed_at** | **datetime** |  | 
**releases_url** | **str** |  | 
**security_and_analysis** | [**SecurityAndAnalysis**](SecurityAndAnalysis.md) |  | [optional] 
**size** | **int** | The size of the repository. Size is calculated hourly. When a repository is initially created, the size is 0. | 
**source** | [**Repository**](Repository.md) |  | [optional] 
**ssh_url** | **str** |  | 
**stargazers_count** | **int** |  | 
**stargazers_url** | **str** |  | 
**statuses_url** | **str** |  | 
**subscribers_count** | **int** |  | 
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
**visibility** | **str** | The repository visibility: public, private, or internal. | [optional] 
**watchers** | **int** |  | 
**watchers_count** | **int** |  | 

## Example

```python
from openapi_client.models.full_repository import FullRepository

# TODO update the JSON string below
json = "{}"
# create an instance of FullRepository from a JSON string
full_repository_instance = FullRepository.from_json(json)
# print the JSON string representation of the object
print(FullRepository.to_json())

# convert the object into a dict
full_repository_dict = full_repository_instance.to_dict()
# create an instance of FullRepository from a dict
full_repository_from_dict = FullRepository.from_dict(full_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


