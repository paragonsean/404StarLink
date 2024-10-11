# GitRepoSource

GitRepoSource describes a repo and ref of a code repository.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitbucket_server_config** | **str** | The full resource name of the bitbucket server config. Format: &#x60;projects/{project}/locations/{location}/bitbucketServerConfigs/{id}&#x60;. | [optional] 
**github_enterprise_config** | **str** | The full resource name of the github enterprise config. Format: &#x60;projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}&#x60;. &#x60;projects/{project}/githubEnterpriseConfigs/{id}&#x60;. | [optional] 
**ref** | **str** | The branch or tag to use. Must start with \&quot;refs/\&quot; (required). | [optional] 
**repo_type** | **str** | See RepoType below. | [optional] 
**uri** | **str** | The URI of the repo. Either uri or repository can be specified and is required. | [optional] 

## Example

```python
from openapi_client.models.git_repo_source import GitRepoSource

# TODO update the JSON string below
json = "{}"
# create an instance of GitRepoSource from a JSON string
git_repo_source_instance = GitRepoSource.from_json(json)
# print the JSON string representation of the object
print(GitRepoSource.to_json())

# convert the object into a dict
git_repo_source_dict = git_repo_source_instance.to_dict()
# create an instance of GitRepoSource from a dict
git_repo_source_from_dict = GitRepoSource.from_dict(git_repo_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


