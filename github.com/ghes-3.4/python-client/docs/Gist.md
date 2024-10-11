# Gist

Gist

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
**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | [optional] 
**public** | **bool** |  | 
**truncated** | **bool** |  | [optional] 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 

## Example

```python
from openapi_client.models.gist import Gist

# TODO update the JSON string below
json = "{}"
# create an instance of Gist from a JSON string
gist_instance = Gist.from_json(json)
# print the JSON string representation of the object
print(Gist.to_json())

# convert the object into a dict
gist_dict = gist_instance.to_dict()
# create an instance of Gist from a dict
gist_from_dict = Gist.from_dict(gist_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


