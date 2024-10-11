# TeamSeason


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assists** | **float** |  | [optional] 
**blocked_shots** | **float** |  | [optional] 
**corners_won** | **float** |  | [optional] 
**crosses** | **float** |  | [optional] 
**defender_clean_sheets** | **float** |  | [optional] 
**fantasy_points** | **float** |  | [optional] 
**fantasy_points_draft_kings** | **float** |  | [optional] 
**fantasy_points_fan_duel** | **float** |  | [optional] 
**fantasy_points_mondogoal** | **float** |  | [optional] 
**fantasy_points_yahoo** | **float** |  | [optional] 
**fouled** | **float** |  | [optional] 
**fouls** | **float** |  | [optional] 
**games** | **int** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**goalkeeper_clean_sheets** | **float** |  | [optional] 
**goalkeeper_goals_against** | **float** |  | [optional] 
**goalkeeper_saves** | **float** |  | [optional] 
**goalkeeper_single_goal_against** | **float** |  | [optional] 
**goalkeeper_wins** | **float** |  | [optional] 
**goals** | **float** |  | [optional] 
**interceptions** | **float** |  | [optional] 
**last_man_tackle** | **float** |  | [optional] 
**minutes** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**offsides** | **float** |  | [optional] 
**opponent_score** | **float** |  | [optional] 
**own_goals** | **float** |  | [optional] 
**passes** | **float** |  | [optional] 
**passes_completed** | **float** |  | [optional] 
**penalties_conceded** | **float** |  | [optional] 
**penalties_won** | **float** |  | [optional] 
**penalty_kick_goals** | **float** |  | [optional] 
**penalty_kick_misses** | **float** |  | [optional] 
**penalty_kick_saves** | **float** |  | [optional] 
**possession** | **float** |  | [optional] 
**red_cards** | **float** |  | [optional] 
**round_id** | **int** |  | [optional] 
**score** | **float** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**shots** | **float** |  | [optional] 
**shots_on_goal** | **float** |  | [optional] 
**stat_id** | **int** |  | [optional] 
**tackles** | **float** |  | [optional] 
**tackles_won** | **float** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**touches** | **float** |  | [optional] 
**updated** | **str** |  | [optional] 
**updated_utc** | **str** |  | [optional] 
**yellow_cards** | **float** |  | [optional] 
**yellow_red_cards** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.team_season import TeamSeason

# TODO update the JSON string below
json = "{}"
# create an instance of TeamSeason from a JSON string
team_season_instance = TeamSeason.from_json(json)
# print the JSON string representation of the object
print(TeamSeason.to_json())

# convert the object into a dict
team_season_dict = team_season_instance.to_dict()
# create an instance of TeamSeason from a dict
team_season_from_dict = TeamSeason.from_dict(team_season_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


