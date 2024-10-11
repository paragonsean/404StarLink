# PullRequestHeadRepoLicense


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**spdx_id** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.pull_request_head_repo_license import PullRequestHeadRepoLicense

# TODO update the JSON string below
json = "{}"
# create an instance of PullRequestHeadRepoLicense from a JSON string
pull_request_head_repo_license_instance = PullRequestHeadRepoLicense.from_json(json)
# print the JSON string representation of the object
print(PullRequestHeadRepoLicense.to_json())

# convert the object into a dict
pull_request_head_repo_license_dict = pull_request_head_repo_license_instance.to_dict()
# create an instance of PullRequestHeadRepoLicense from a dict
pull_request_head_repo_license_from_dict = PullRequestHeadRepoLicense.from_dict(pull_request_head_repo_license_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


