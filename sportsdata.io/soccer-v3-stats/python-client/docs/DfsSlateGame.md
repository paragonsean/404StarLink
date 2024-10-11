# DfsSlateGame


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game** | [**Game**](Game.md) |  | [optional] 
**game_id** | **int** |  | [optional] 
**operator_game_id** | **int** |  | [optional] 
**removed_by_operator** | **bool** |  | [optional] 
**slate_game_id** | **int** |  | [optional] 
**slate_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dfs_slate_game import DfsSlateGame

# TODO update the JSON string below
json = "{}"
# create an instance of DfsSlateGame from a JSON string
dfs_slate_game_instance = DfsSlateGame.from_json(json)
# print the JSON string representation of the object
print(DfsSlateGame.to_json())

# convert the object into a dict
dfs_slate_game_dict = dfs_slate_game_instance.to_dict()
# create an instance of DfsSlateGame from a dict
dfs_slate_game_from_dict = DfsSlateGame.from_dict(dfs_slate_game_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


