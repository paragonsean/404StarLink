# PullRequestFilter

PullRequestFilter contains filter properties for matching GitHub Pull Requests.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **str** | Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax | [optional] 
**comment_control** | **str** | Configure builds to run whether a repository owner or collaborator need to comment &#x60;/gcbrun&#x60;. | [optional] 
**invert_regex** | **bool** | If true, branches that do NOT match the git_ref will trigger a build. | [optional] 

## Example

```python
from openapi_client.models.pull_request_filter import PullRequestFilter

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestFilter from a JSON string
pull_request_filter_instance = PullRequestFilter.from_json(json)
# print the JSON string representation of the object
print(PullRequestFilter.to_json())

# convert the object into a dict
pull_request_filter_dict = pull_request_filter_instance.to_dict()
# create an instance of PullRequestFilter from a dict
pull_request_filter_from_dict = PullRequestFilter.from_dict(pull_request_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


