# Release

A release.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**List[ReleaseAsset]**](ReleaseAsset.md) |  | 
**assets_url** | **str** |  | 
**author** | [**SimpleUser**](SimpleUser.md) |  | 
**body** | **str** |  | [optional] 
**body_html** | **str** |  | [optional] 
**body_text** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**draft** | **bool** | true to create a draft (unpublished) release, false to create a published one. | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**mentions_count** | **int** |  | [optional] 
**name** | **str** |  | 
**node_id** | **str** |  | 
**prerelease** | **bool** | Whether to identify the release as a prerelease or a full release. | 
**published_at** | **datetime** |  | 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  | [optional] 
**tag_name** | **str** | The name of the tag. | 
**tarball_url** | **str** |  | 
**target_commitish** | **str** | Specifies the commitish value that determines where the Git tag is created from. | 
**upload_url** | **str** |  | 
**url** | **str** |  | 
**zipball_url** | **str** |  | 

## Example

```python
from openapi_client.models.release import Release

# TODO update the JSON string below
json = "{}"
# create an instance of Release from a JSON string
release_instance = Release.from_json(json)
# print the JSON string representation of the object
print(Release.to_json())

# convert the object into a dict
release_dict = release_instance.to_dict()
# create an instance of Release from a dict
release_from_dict = Release.from_dict(release_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


