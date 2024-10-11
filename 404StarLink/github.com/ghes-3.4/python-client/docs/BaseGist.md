# BaseGist

Base Gist

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **int** |  | 
**comments_url** | **str** |  | 
**commits_url** | **str** |  | 
**created_at** | **datetime** |  | 
**description** | **str** |  | 
**files** | [**Dict[str, BaseGistFilesValue]**](BaseGistFilesValue.md) |  | 
**forks** | **List[object]** |  | [optional] 
**forks_url** | **str** |  | 
**git_pull_url** | **str** |  | 
**git_push_url** | **str** |  | 
**history** | **List[object]** |  | [optional] 
**html_url** | **str** |  | 
**id** | **str** |  | 
**node_id** | **str** |  | 
**owner** | [**SimpleUser**](SimpleUser.md) |  | [optional] 
**public** | **bool** |  | 
**truncated** | **bool** |  | [optional] 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.base_gist import BaseGist

# TODO update the JSON string below
json = "{}"
# create an instance of BaseGist from a JSON string
base_gist_instance = BaseGist.from_json(json)
# print the JSON string representation of the object
print(BaseGist.to_json())

# convert the object into a dict
base_gist_dict = base_gist_instance.to_dict()
# create an instance of BaseGist from a dict
base_gist_from_dict = BaseGist.from_dict(base_gist_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


