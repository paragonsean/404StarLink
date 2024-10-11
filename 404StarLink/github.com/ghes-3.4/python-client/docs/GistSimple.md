# GistSimple

Gist Simple

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **int** |  | [optional] 
**comments_url** | **str** |  | [optional] 
**commits_url** | **str** |  | [optional] 
**created_at** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**files** | [**Dict[str, GistSimpleFilesValue]**](GistSimpleFilesValue.md) |  | [optional] 
**fork_of** | [**Gist**](Gist.md) |  | [optional] 
**forks** | [**List[GistSimpleForksInner]**](GistSimpleForksInner.md) |  | [optional] 
**forks_url** | **str** |  | [optional] 
**git_pull_url** | **str** |  | [optional] 
**git_push_url** | **str** |  | [optional] 
**history** | [**List[GistHistory]**](GistHistory.md) |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**node_id** | **str** |  | [optional] 
**owner** | [**SimpleUser**](SimpleUser.md) |  | [optional] 
**public** | **bool** |  | [optional] 
**truncated** | **bool** |  | [optional] 
**updated_at** | **str** |  | [optional] 
**url** | **str** |  | [optional] 
**user** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.gist_simple import GistSimple

# TODO update the JSON string below
json = "{}"
# create an instance of GistSimple from a JSON string
gist_simple_instance = GistSimple.from_json(json)
# print the JSON string representation of the object
print(GistSimple.to_json())

# convert the object into a dict
gist_simple_dict = gist_simple_instance.to_dict()
# create an instance of GistSimple from a dict
gist_simple_from_dict = GistSimple.from_dict(gist_simple_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


