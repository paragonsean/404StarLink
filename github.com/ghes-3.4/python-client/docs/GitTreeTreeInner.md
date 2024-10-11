# GitTreeTreeInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **str** |  | [optional] 
**path** | **str** |  | [optional] 
**sha** | **str** |  | [optional] 
**size** | **int** |  | [optional] 
**type** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.git_tree_tree_inner import GitTreeTreeInner

# TODO update the JSON string below
json = "{}"
# create an instance of GitTreeTreeInner from a JSON string
git_tree_tree_inner_instance = GitTreeTreeInner.from_json(json)
# print the JSON string representation of the object
print(GitTreeTreeInner.to_json())

# convert the object into a dict
git_tree_tree_inner_dict = git_tree_tree_inner_instance.to_dict()
# create an instance of GitTreeTreeInner from a dict
git_tree_tree_inner_from_dict = GitTreeTreeInner.from_dict(git_tree_tree_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


