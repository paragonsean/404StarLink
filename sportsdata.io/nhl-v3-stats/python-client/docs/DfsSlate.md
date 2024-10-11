# DfsSlate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dfs_slate_games** | [**List[DfsSlateGame]**](DfsSlateGame.md) |  | [optional] 
**dfs_slate_players** | [**List[DfsSlatePlayer]**](DfsSlatePlayer.md) |  | [optional] 
**is_multi_day_slate** | **bool** |  | [optional] 
**number_of_games** | **int** |  | [optional] 
**operator** | **str** |  | [optional] 
**operator_day** | **str** |  | [optional] 
**operator_game_type** | **str** |  | [optional] 
**operator_name** | **str** |  | [optional] 
**operator_slate_id** | **int** |  | [optional] 
**operator_start_time** | **str** |  | [optional] 
**removed_by_operator** | **bool** |  | [optional] 
**salary_cap** | **int** |  | [optional] 
**slate_id** | **int** |  | [optional] 
**slate_roster_slots** | **List[Optional[str]]** |  | [optional] 

## Example

```python
from openapi_client.models.dfs_slate import DfsSlate

# TODO update the JSON string below
json = "{}"
# create an instance of DfsSlate from a JSON string
dfs_slate_instance = DfsSlate.from_json(json)
# print the JSON string representation of the object
print(DfsSlate.to_json())

# convert the object into a dict
dfs_slate_dict = dfs_slate_instance.to_dict()
# create an instance of DfsSlate from a dict
dfs_slate_from_dict = DfsSlate.from_dict(dfs_slate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


