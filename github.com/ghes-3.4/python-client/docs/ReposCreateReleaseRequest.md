# ReposCreateReleaseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** | Text describing the contents of the tag. | [optional] 
**draft** | **bool** | &#x60;true&#x60; to create a draft (unpublished) release, &#x60;false&#x60; to create a published one. | [optional] [default to False]
**generate_release_notes** | **bool** | Whether to automatically generate the name and body for this release. If &#x60;name&#x60; is specified, the specified name will be used; otherwise, a name will be automatically generated. If &#x60;body&#x60; is specified, the body will be pre-pended to the automatically generated notes. | [optional] [default to False]
**name** | **str** | The name of the release. | [optional] 
**prerelease** | **bool** | &#x60;true&#x60; to identify the release as a prerelease. &#x60;false&#x60; to identify the release as a full release. | [optional] [default to False]
**tag_name** | **str** | The name of the tag. | 
**target_commitish** | **str** | Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository&#39;s default branch (usually &#x60;master&#x60;). | [optional] 

## Example

```python
from openapi_client.models.repos_create_release_request import ReposCreateReleaseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReposCreateReleaseRequest from a JSON string
repos_create_release_request_instance = ReposCreateReleaseRequest.from_json(json)
# print the JSON string representation of the object
print(ReposCreateReleaseRequest.to_json())

# convert the object into a dict
repos_create_release_request_dict = repos_create_release_request_instance.to_dict()
# create an instance of ReposCreateReleaseRequest from a dict
repos_create_release_request_from_dict = ReposCreateReleaseRequest.from_dict(repos_create_release_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


