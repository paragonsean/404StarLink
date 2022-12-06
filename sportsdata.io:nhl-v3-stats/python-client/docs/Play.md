# Play


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**away_team_score** | **int** |  | [optional] 
**category** | **str** |  | [optional] 
**clock_minutes** | **int** |  | [optional] 
**clock_seconds** | **int** |  | [optional] 
**created** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**first_assisted_by_player_id** | **int** |  | [optional] 
**home_team_score** | **int** |  | [optional] 
**opponent** | **str** |  | [optional] 
**opponent_id** | **int** |  | [optional] 
**opposing_player_id** | **int** |  | [optional] 
**period_id** | **int** |  | [optional] 
**period_name** | **str** |  | [optional] 
**play_id** | **int** |  | [optional] 
**player_id** | **int** |  | [optional] 
**power_play_team** | **str** |  | [optional] 
**power_play_team_id** | **int** |  | [optional] 
**second_assisted_by_player_id** | **int** |  | [optional] 
**sequence** | **int** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**type** | **str** |  | [optional] 
**updated** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.play import Play

# TODO update the JSON string below
json = "{}"
# create an instance of Play from a JSON string
play_instance = Play.from_json(json)
# print the JSON string representation of the object
print(Play.to_json())

# convert the object into a dict
play_dict = play_instance.to_dict()
# create an instance of Play from a dict
play_from_dict = Play.from_dict(play_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


