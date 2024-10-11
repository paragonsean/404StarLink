# DfsSlatePlayer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator_player_id** | **str** |  | [optional] 
**operator_player_name** | **str** |  | [optional] 
**operator_position** | **str** |  | [optional] 
**operator_roster_slots** | **List[Optional[str]]** |  | [optional] 
**operator_salary** | **int** |  | [optional] 
**operator_slate_player_id** | **str** |  | [optional] 
**player_game_projection_stat_id** | **int** |  | [optional] 
**player_id** | **int** |  | [optional] 
**removed_by_operator** | **bool** |  | [optional] 
**slate_game_id** | **int** |  | [optional] 
**slate_id** | **int** |  | [optional] 
**slate_player_id** | **int** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.dfs_slate_player import DfsSlatePlayer

# TODO update the JSON string below
json = "{}"
# create an instance of DfsSlatePlayer from a JSON string
dfs_slate_player_instance = DfsSlatePlayer.from_json(json)
# print the JSON string representation of the object
print(DfsSlatePlayer.to_json())

# convert the object into a dict
dfs_slate_player_dict = dfs_slate_player_instance.to_dict()
# create an instance of DfsSlatePlayer from a dict
dfs_slate_player_from_dict = DfsSlatePlayer.from_dict(dfs_slate_player_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


