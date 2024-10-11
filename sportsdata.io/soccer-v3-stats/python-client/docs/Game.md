# Game


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attendance** | **int** |  | [optional] 
**away_team_country_code** | **str** |  | [optional] 
**away_team_formation** | **str** |  | [optional] 
**away_team_id** | **int** |  | [optional] 
**away_team_key** | **str** |  | [optional] 
**away_team_money_line** | **int** |  | [optional] 
**away_team_name** | **str** |  | [optional] 
**away_team_point_spread_payout** | **int** |  | [optional] 
**away_team_score** | **int** |  | [optional] 
**away_team_score_extra_time** | **int** |  | [optional] 
**away_team_score_penalty** | **int** |  | [optional] 
**away_team_score_period1** | **int** |  | [optional] 
**away_team_score_period2** | **int** |  | [optional] 
**clock** | **int** |  | [optional] 
**clock_display** | **str** |  | [optional] 
**clock_extra** | **int** |  | [optional] 
**date_time** | **str** |  | [optional] 
**day** | **str** |  | [optional] 
**draw_money_line** | **int** |  | [optional] 
**game_id** | **int** |  | [optional] 
**global_away_team_id** | **int** |  | [optional] 
**global_game_id** | **int** |  | [optional] 
**global_home_team_id** | **int** |  | [optional] 
**group** | **str** |  | [optional] 
**home_team_country_code** | **str** |  | [optional] 
**home_team_formation** | **str** |  | [optional] 
**home_team_id** | **int** |  | [optional] 
**home_team_key** | **str** |  | [optional] 
**home_team_money_line** | **int** |  | [optional] 
**home_team_name** | **str** |  | [optional] 
**home_team_point_spread_payout** | **int** |  | [optional] 
**home_team_score** | **int** |  | [optional] 
**home_team_score_extra_time** | **int** |  | [optional] 
**home_team_score_penalty** | **int** |  | [optional] 
**home_team_score_period1** | **int** |  | [optional] 
**home_team_score_period2** | **int** |  | [optional] 
**is_closed** | **bool** |  | [optional] 
**over_payout** | **int** |  | [optional] 
**over_under** | **float** |  | [optional] 
**period** | **str** |  | [optional] 
**playoff_aggregate_score** | [**PlayoffAggregateScore**](PlayoffAggregateScore.md) |  | [optional] 
**point_spread** | **float** |  | [optional] 
**round_id** | **int** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**status** | **str** |  | [optional] 
**under_payout** | **int** |  | [optional] 
**updated** | **str** |  | [optional] 
**updated_utc** | **str** |  | [optional] 
**venue_id** | **int** |  | [optional] 
**venue_type** | **str** |  | [optional] 
**week** | **int** |  | [optional] 
**winner** | **str** |  | [optional] 

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


