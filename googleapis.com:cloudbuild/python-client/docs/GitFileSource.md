# GitFileSource

GitFileSource describes a file within a (possibly remote) code repository.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitbucket_server_config** | **str** | The full resource name of the bitbucket server config. Format: &#x60;projects/{project}/locations/{location}/bitbucketServerConfigs/{id}&#x60;. | [optional] 
**github_enterprise_config** | **str** | The full resource name of the github enterprise config. Format: &#x60;projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}&#x60;. &#x60;projects/{project}/githubEnterpriseConfigs/{id}&#x60;. | [optional] 
**path** | **str** | The path of the file, with the repo root as the root of the path. | [optional] 
**repo_type** | **str** | See RepoType above. | [optional] 
**revision** | **str** | The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path. | [optional] 
**uri** | **str** | The URI of the repo. Either uri or repository can be specified. If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path. | [optional] 

## Example

```python
from openapi_client.models.git_file_source import GitFileSource

# TODO update the JSON string below
json = "{}"
# create an instance of GitFileSource from a JSON string
git_file_source_instance = GitFileSource.from_json(json)
# print the JSON string representation of the object
print(GitFileSource.to_json())

# convert the object into a dict
git_file_source_dict = git_file_source_instance.to_dict()
# create an instance of GitFileSource from a dict
git_file_source_from_dict = GitFileSource.from_dict(git_file_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


