# PullRequestBaseRepoOwner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**events_url** | **str** |  | 
**followers_url** | **str** |  | 
**following_url** | **str** |  | 
**gists_url** | **str** |  | 
**gravatar_id** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**login** | **str** |  | 
**node_id** | **str** |  | 
**organizations_url** | **str** |  | 
**received_events_url** | **str** |  | 
**repos_url** | **str** |  | 
**site_admin** | **bool** |  | 
**starred_url** | **str** |  | 
**subscriptions_url** | **str** |  | 
**type** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.pull_request_base_repo_owner import PullRequestBaseRepoOwner

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestBaseRepoOwner from a JSON string
pull_request_base_repo_owner_instance = PullRequestBaseRepoOwner.from_json(json)
# print the JSON string representation of the object
print(PullRequestBaseRepoOwner.to_json())

# convert the object into a dict
pull_request_base_repo_owner_dict = pull_request_base_repo_owner_instance.to_dict()
# create an instance of PullRequestBaseRepoOwner from a dict
pull_request_base_repo_owner_from_dict = PullRequestBaseRepoOwner.from_dict(pull_request_base_repo_owner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


