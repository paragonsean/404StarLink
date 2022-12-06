# PlayerGame


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assists** | **float** |  | [optional] 
**bench_penalty_minutes** | **float** |  | [optional] 
**blocks** | **float** |  | [optional] 
**date_time** | **str** |  | [optional] 
**day** | **str** |  | [optional] 
**draft_kings_position** | **str** |  | [optional] 
**draft_kings_salary** | **int** |  | [optional] 
**empty_net_goals** | **float** |  | [optional] 
**faceoffs_lost** | **float** |  | [optional] 
**faceoffs_won** | **float** |  | [optional] 
**fan_duel_position** | **str** |  | [optional] 
**fan_duel_salary** | **int** |  | [optional] 
**fantasy_data_salary** | **int** |  | [optional] 
**fantasy_draft_position** | **str** |  | [optional] 
**fantasy_draft_salary** | **int** |  | [optional] 
**fantasy_points** | **float** |  | [optional] 
**fantasy_points_draft_kings** | **float** |  | [optional] 
**fantasy_points_fan_duel** | **float** |  | [optional] 
**fantasy_points_fantasy_draft** | **float** |  | [optional] 
**fantasy_points_yahoo** | **float** |  | [optional] 
**game_id** | **int** |  | [optional] 
**games** | **int** |  | [optional] 
**giveaways** | **float** |  | [optional] 
**global_game_id** | **int** |  | [optional] 
**global_opponent_id** | **int** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**goals** | **float** |  | [optional] 
**goaltending_goals_against** | **float** |  | [optional] 
**goaltending_losses** | **float** |  | [optional] 
**goaltending_minutes** | **int** |  | [optional] 
**goaltending_overtime_losses** | **float** |  | [optional] 
**goaltending_saves** | **float** |  | [optional] 
**goaltending_seconds** | **int** |  | [optional] 
**goaltending_shots_against** | **float** |  | [optional] 
**goaltending_shutouts** | **float** |  | [optional] 
**goaltending_wins** | **float** |  | [optional] 
**hat_tricks** | **float** |  | [optional] 
**hits** | **float** |  | [optional] 
**home_or_away** | **str** |  | [optional] 
**injury_body_part** | **str** |  | [optional] 
**injury_notes** | **str** |  | [optional] 
**injury_start_date** | **str** |  | [optional] 
**injury_status** | **str** |  | [optional] 
**is_game_over** | **bool** |  | [optional] 
**minutes** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**opponent** | **str** |  | [optional] 
**opponent_id** | **int** |  | [optional] 
**opponent_position_rank** | **int** |  | [optional] 
**opponent_rank** | **int** |  | [optional] 
**penalty_minutes** | **float** |  | [optional] 
**player_id** | **int** |  | [optional] 
**plus_minus** | **float** |  | [optional] 
**position** | **str** |  | [optional] 
**power_play_assists** | **float** |  | [optional] 
**power_play_goals** | **float** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**seconds** | **int** |  | [optional] 
**shifts** | **float** |  | [optional] 
**shootout_goals** | **float** |  | [optional] 
**short_handed_assists** | **float** |  | [optional] 
**short_handed_goals** | **float** |  | [optional] 
**shots_on_goal** | **float** |  | [optional] 
**started** | **int** |  | [optional] 
**stat_id** | **int** |  | [optional] 
**takeaways** | **float** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**updated** | **str** |  | [optional] 
**yahoo_position** | **str** |  | [optional] 
**yahoo_salary** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.player_game import PlayerGame

# TODO update the JSON string below
json = "{}"
# create an instance of PlayerGame from a JSON string
player_game_instance = PlayerGame.from_json(json)
# print the JSON string representation of the object
print(PlayerGame.to_json())

# convert the object into a dict
player_game_dict = player_game_instance.to_dict()
# create an instance of PlayerGame from a dict
player_game_from_dict = PlayerGame.from_dict(player_game_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


