# MinimalRepository

Minimal Repository

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_forking** | **bool** |  | [optional] 
**archive_url** | **str** |  | 
**archived** | **bool** |  | [optional] 
**assignees_url** | **str** |  | 
**blobs_url** | **str** |  | 
**branches_url** | **str** |  | 
**clone_url** | **str** |  | [optional] 
**code_of_conduct** | [**CodeOfConduct**](CodeOfConduct.md) |  | [optional] 
**collaborators_url** | **str** |  | 
**comments_url** | **str** |  | 
**commits_url** | **str** |  | 
**compare_url** | **str** |  | 
**contents_url** | **str** |  | 
**contributors_url** | **str** |  | 
**created_at** | **datetime** |  | [optional] 
**default_branch** | **str** |  | [optional] 
**delete_branch_on_merge** | **bool** |  | [optional] 
**deployments_url** | **str** |  | 
**description** | **str** |  | 
**disabled** | **bool** |  | [optional] 
**downloads_url** | **str** |  | 
**events_url** | **str** |  | 
**fork** | **bool** |  | 
**forks** | **int** |  | [optional] 
**forks_count** | **int** |  | [optional] 
**forks_url** | **str** |  | 
**full_name** | **str** |  | 
**git_commits_url** | **str** |  | 
**git_refs_url** | **str** |  | 
**git_tags_url** | **str** |  | 
**git_url** | **str** |  | [optional] 
**has_downloads** | **bool** |  | [optional] 
**has_issues** | **bool** |  | [optional] 
**has_pages** | **bool** |  | [optional] 
**has_projects** | **bool** |  | [optional] 
**has_wiki** | **bool** |  | [optional] 
**homepage** | **str** |  | [optional] 
**hooks_url** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**is_template** | **bool** |  | [optional] 
**issue_comment_url** | **str** |  | 
**issue_events_url** | **str** |  | 
**issues_url** | **str** |  | 
**keys_url** | **str** |  | 
**labels_url** | **str** |  | 
**language** | **str** |  | [optional] 
**languages_url** | **str** |  | 
**license** | [**MinimalRepositoryLicense**](MinimalRepositoryLicense.md) |  | [optional] 
**merges_url** | **str** |  | 
**milestones_url** | **str** |  | 
**mirror_url** | **str** |  | [optional] 
**name** | **str** |  | 
**network_count** | **int** |  | [optional] 
**node_id** | **str** |  | 
**notifications_url** | **str** |  | 
**open_issues** | **int** |  | [optional] 
**open_issues_count** | **int** |  | [optional] 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**permissions** | [**MinimalRepositoryPermissions**](MinimalRepositoryPermissions.md) |  | [optional] 
**private** | **bool** |  | 
**pulls_url** | **str** |  | 
**pushed_at** | **datetime** |  | [optional] 
**releases_url** | **str** |  | 
**size** | **int** | The size of the repository. Size is calculated hourly. When a repository is initially created, the size is 0. | [optional] 
**ssh_url** | **str** |  | [optional] 
**stargazers_count** | **int** |  | [optional] 
**stargazers_url** | **str** |  | 
**statuses_url** | **str** |  | 
**subscribers_count** | **int** |  | [optional] 
**subscribers_url** | **str** |  | 
**subscription_url** | **str** |  | 
**svn_url** | **str** |  | [optional] 
**tags_url** | **str** |  | 
**teams_url** | **str** |  | 
**temp_clone_token** | **str** |  | [optional] 
**topics** | **List[str]** |  | [optional] 
**trees_url** | **str** |  | 
**updated_at** | **datetime** |  | [optional] 
**url** | **str** |  | 
**visibility** | **str** |  | [optional] 
**watchers** | **int** |  | [optional] 
**watchers_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.minimal_repository import MinimalRepository

# TODO update the JSON string below
json = "{}"
# create an instance of MinimalRepository from a JSON string
minimal_repository_instance = MinimalRepository.from_json(json)
# print the JSON string representation of the object
print(MinimalRepository.to_json())

# convert the object into a dict
minimal_repository_dict = minimal_repository_instance.to_dict()
# create an instance of MinimalRepository from a dict
minimal_repository_from_dict = MinimalRepository.from_dict(minimal_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


