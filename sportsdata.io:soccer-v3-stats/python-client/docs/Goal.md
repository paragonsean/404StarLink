# Goal


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assisted_by_player_id1** | **int** |  | [optional] 
**assisted_by_player_id2** | **int** |  | [optional] 
**assisted_by_player_name1** | **str** |  | [optional] 
**assisted_by_player_name2** | **str** |  | [optional] 
**game_id** | **int** |  | [optional] 
**game_minute** | **int** |  | [optional] 
**game_minute_extra** | **int** |  | [optional] 
**goal_id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**team_id** | **int** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.goal import Goal

# TODO update the JSON string below
json = "{}"
# create an instance of Goal from a JSON string
goal_instance = Goal.from_json(json)
# print the JSON string representation of the object
print(Goal.to_json())

# convert the object into a dict
goal_dict = goal_instance.to_dict()
# create an instance of Goal from a dict
goal_from_dict = Goal.from_dict(goal_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


