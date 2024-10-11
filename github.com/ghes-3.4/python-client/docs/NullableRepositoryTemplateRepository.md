# NullableRepositoryTemplateRepository


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_auto_merge** | **bool** |  | [optional] 
**allow_merge_commit** | **bool** |  | [optional] 
**allow_rebase_merge** | **bool** |  | [optional] 
**allow_squash_merge** | **bool** |  | [optional] 
**allow_update_branch** | **bool** |  | [optional] 
**archive_url** | **str** |  | [optional] 
**archived** | **bool** |  | [optional] 
**assignees_url** | **str** |  | [optional] 
**blobs_url** | **str** |  | [optional] 
**branches_url** | **str** |  | [optional] 
**clone_url** | **str** |  | [optional] 
**collaborators_url** | **str** |  | [optional] 
**comments_url** | **str** |  | [optional] 
**commits_url** | **str** |  | [optional] 
**compare_url** | **str** |  | [optional] 
**contents_url** | **str** |  | [optional] 
**contributors_url** | **str** |  | [optional] 
**created_at** | **str** |  | [optional] 
**default_branch** | **str** |  | [optional] 
**delete_branch_on_merge** | **bool** |  | [optional] 
**deployments_url** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**disabled** | **bool** |  | [optional] 
**downloads_url** | **str** |  | [optional] 
**events_url** | **str** |  | [optional] 
**fork** | **bool** |  | [optional] 
**forks_count** | **int** |  | [optional] 
**forks_url** | **str** |  | [optional] 
**full_name** | **str** |  | [optional] 
**git_commits_url** | **str** |  | [optional] 
**git_refs_url** | **str** |  | [optional] 
**git_tags_url** | **str** |  | [optional] 
**git_url** | **str** |  | [optional] 
**has_downloads** | **bool** |  | [optional] 
**has_issues** | **bool** |  | [optional] 
**has_pages** | **bool** |  | [optional] 
**has_projects** | **bool** |  | [optional] 
**has_wiki** | **bool** |  | [optional] 
**homepage** | **str** |  | [optional] 
**hooks_url** | **str** |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**is_template** | **bool** |  | [optional] 
**issue_comment_url** | **str** |  | [optional] 
**issue_events_url** | **str** |  | [optional] 
**issues_url** | **str** |  | [optional] 
**keys_url** | **str** |  | [optional] 
**labels_url** | **str** |  | [optional] 
**language** | **str** |  | [optional] 
**languages_url** | **str** |  | [optional] 
**merges_url** | **str** |  | [optional] 
**milestones_url** | **str** |  | [optional] 
**mirror_url** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**network_count** | **int** |  | [optional] 
**node_id** | **str** |  | [optional] 
**notifications_url** | **str** |  | [optional] 
**open_issues_count** | **int** |  | [optional] 
**owner** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  | [optional] 
**permissions** | [**MinimalRepositoryPermissions**](MinimalRepositoryPermissions.md) |  | [optional] 
**private** | **bool** |  | [optional] 
**pulls_url** | **str** |  | [optional] 
**pushed_at** | **str** |  | [optional] 
**releases_url** | **str** |  | [optional] 
**size** | **int** |  | [optional] 
**ssh_url** | **str** |  | [optional] 
**stargazers_count** | **int** |  | [optional] 
**stargazers_url** | **str** |  | [optional] 
**statuses_url** | **str** |  | [optional] 
**subscribers_count** | **int** |  | [optional] 
**subscribers_url** | **str** |  | [optional] 
**subscription_url** | **str** |  | [optional] 
**svn_url** | **str** |  | [optional] 
**tags_url** | **str** |  | [optional] 
**teams_url** | **str** |  | [optional] 
**temp_clone_token** | **str** |  | [optional] 
**topics** | **List[str]** |  | [optional] 
**trees_url** | **str** |  | [optional] 
**updated_at** | **str** |  | [optional] 
**url** | **str** |  | [optional] 
**visibility** | **str** |  | [optional] 
**watchers_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.nullable_repository_template_repository import NullableRepositoryTemplateRepository

# TODO update the JSON string below
json = "{}"
# create an instance of NullableRepositoryTemplateRepository from a JSON string
nullable_repository_template_repository_instance = NullableRepositoryTemplateRepository.from_json(json)
# print the JSON string representation of the object
print(NullableRepositoryTemplateRepository.to_json())

# convert the object into a dict
nullable_repository_template_repository_dict = nullable_repository_template_repository_instance.to_dict()
# create an instance of NullableRepositoryTemplateRepository from a dict
nullable_repository_template_repository_from_dict = NullableRepositoryTemplateRepository.from_dict(nullable_repository_template_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


