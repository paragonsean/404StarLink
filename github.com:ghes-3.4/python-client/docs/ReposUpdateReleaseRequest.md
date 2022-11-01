# ReposUpdateReleaseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** | Text describing the contents of the tag. | [optional] 
**draft** | **bool** | &#x60;true&#x60; makes the release a draft, and &#x60;false&#x60; publishes the release. | [optional] 
**name** | **str** | The name of the release. | [optional] 
**prerelease** | **bool** | &#x60;true&#x60; to identify the release as a prerelease, &#x60;false&#x60; to identify the release as a full release. | [optional] 
**tag_name** | **str** | The name of the tag. | [optional] 
**target_commitish** | **str** | Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository&#39;s default branch (usually &#x60;master&#x60;). | [optional] 

## Example

```python
from openapi_client.models.repos_update_release_request import ReposUpdateReleaseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReposUpdateReleaseRequest from a JSON string
repos_update_release_request_instance = ReposUpdateReleaseRequest.from_json(json)
# print the JSON string representation of the object
print(ReposUpdateReleaseRequest.to_json())

# convert the object into a dict
repos_update_release_request_dict = repos_update_release_request_instance.to_dict()
# create an instance of ReposUpdateReleaseRequest from a dict
repos_update_release_request_from_dict = ReposUpdateReleaseRequest.from_dict(repos_update_release_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


