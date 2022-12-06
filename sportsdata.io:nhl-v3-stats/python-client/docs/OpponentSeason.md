# OpponentSeason


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assists** | **float** |  | [optional] 
**bench_penalty_minutes** | **float** |  | [optional] 
**blocks** | **float** |  | [optional] 
**empty_net_goals** | **float** |  | [optional] 
**faceoffs_lost** | **float** |  | [optional] 
**faceoffs_won** | **float** |  | [optional] 
**fantasy_points** | **float** |  | [optional] 
**fantasy_points_draft_kings** | **float** |  | [optional] 
**fantasy_points_fan_duel** | **float** |  | [optional] 
**fantasy_points_fantasy_draft** | **float** |  | [optional] 
**fantasy_points_yahoo** | **float** |  | [optional] 
**games** | **int** |  | [optional] 
**giveaways** | **float** |  | [optional] 
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
**losses** | **int** |  | [optional] 
**minutes** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**opponent_position** | **str** |  | [optional] 
**overtime_losses** | **int** |  | [optional] 
**penalty_minutes** | **float** |  | [optional] 
**plus_minus** | **float** |  | [optional] 
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
**wins** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.opponent_season import OpponentSeason

# TODO update the JSON string below
json = "{}"
# create an instance of OpponentSeason from a JSON string
opponent_season_instance = OpponentSeason.from_json(json)
# print the JSON string representation of the object
print(OpponentSeason.to_json())

# convert the object into a dict
opponent_season_dict = opponent_season_instance.to_dict()
# create an instance of OpponentSeason from a dict
opponent_season_from_dict = OpponentSeason.from_dict(opponent_season_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


