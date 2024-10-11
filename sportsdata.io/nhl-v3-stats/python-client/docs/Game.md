# Game


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attendance** | **int** |  | [optional] 
**away_rotation_number** | **int** |  | [optional] 
**away_team** | **str** |  | [optional] 
**away_team_id** | **int** |  | [optional] 
**away_team_money_line** | **int** |  | [optional] 
**away_team_score** | **int** |  | [optional] 
**channel** | **str** |  | [optional] 
**date_time** | **str** |  | [optional] 
**date_time_utc** | **str** |  | [optional] 
**day** | **str** |  | [optional] 
**game_end_date_time** | **str** |  | [optional] 
**game_id** | **int** |  | [optional] 
**global_away_team_id** | **int** |  | [optional] 
**global_game_id** | **int** |  | [optional] 
**global_home_team_id** | **int** |  | [optional] 
**home_rotation_number** | **int** |  | [optional] 
**home_team** | **str** |  | [optional] 
**home_team_id** | **int** |  | [optional] 
**home_team_money_line** | **int** |  | [optional] 
**home_team_score** | **int** |  | [optional] 
**is_closed** | **bool** |  | [optional] 
**last_play** | **str** |  | [optional] 
**neutral_venue** | **bool** |  | [optional] 
**over_payout** | **int** |  | [optional] 
**over_under** | **float** |  | [optional] 
**period** | **str** |  | [optional] 
**periods** | [**List[Period]**](Period.md) |  | [optional] 
**point_spread** | **float** |  | [optional] 
**point_spread_away_team_money_line** | **int** |  | [optional] 
**point_spread_home_team_money_line** | **int** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**series_info** | [**Series**](Series.md) |  | [optional] 
**stadium_id** | **int** |  | [optional] 
**status** | **str** |  | [optional] 
**time_remaining_minutes** | **int** |  | [optional] 
**time_remaining_seconds** | **int** |  | [optional] 
**under_payout** | **int** |  | [optional] 
**updated** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.game import Game

# TODO update the JSON string below
json = "{}"
# create an instance of Game from a JSON string
game_instance = Game.from_json(json)
# print the JSON string representation of the object
print(Game.to_json())

# convert the object into a dict
game_dict = game_instance.to_dict()
# create an instance of Game from a dict
game_from_dict = Game.from_dict(game_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


