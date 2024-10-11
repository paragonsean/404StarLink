# Score


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attendance** | **int** |  | [optional] 
**away_rotation_number** | **int** |  | [optional] 
**away_score** | **int** |  | [optional] 
**away_score_overtime** | **int** |  | [optional] 
**away_score_quarter1** | **int** |  | [optional] 
**away_score_quarter2** | **int** |  | [optional] 
**away_score_quarter3** | **int** |  | [optional] 
**away_score_quarter4** | **int** |  | [optional] 
**away_team** | **str** |  | [optional] 
**away_team_id** | **int** |  | [optional] 
**away_team_money_line** | **int** |  | [optional] 
**away_timeouts** | **int** |  | [optional] 
**canceled** | **bool** |  | [optional] 
**channel** | **str** |  | [optional] 
**closed** | **bool** |  | [optional] 
**var_date** | **str** |  | [optional] 
**date_time** | **str** |  | [optional] 
**date_time_utc** | **str** |  | [optional] 
**day** | **str** |  | [optional] 
**distance** | **str** |  | [optional] 
**down** | **int** |  | [optional] 
**down_and_distance** | **str** |  | [optional] 
**forecast_description** | **str** |  | [optional] 
**forecast_temp_high** | **int** |  | [optional] 
**forecast_temp_low** | **int** |  | [optional] 
**forecast_wind_chill** | **int** |  | [optional] 
**forecast_wind_speed** | **int** |  | [optional] 
**game_end_date_time** | **str** |  | [optional] 
**game_key** | **str** |  | [optional] 
**geo_lat** | **float** |  | [optional] 
**geo_long** | **float** |  | [optional] 
**global_away_team_id** | **int** |  | [optional] 
**global_game_id** | **int** |  | [optional] 
**global_home_team_id** | **int** |  | [optional] 
**has1st_quarter_started** | **bool** |  | [optional] 
**has2nd_quarter_started** | **bool** |  | [optional] 
**has3rd_quarter_started** | **bool** |  | [optional] 
**has4th_quarter_started** | **bool** |  | [optional] 
**has_started** | **bool** |  | [optional] 
**home_rotation_number** | **int** |  | [optional] 
**home_score** | **int** |  | [optional] 
**home_score_overtime** | **int** |  | [optional] 
**home_score_quarter1** | **int** |  | [optional] 
**home_score_quarter2** | **int** |  | [optional] 
**home_score_quarter3** | **int** |  | [optional] 
**home_score_quarter4** | **int** |  | [optional] 
**home_team** | **str** |  | [optional] 
**home_team_id** | **int** |  | [optional] 
**home_team_money_line** | **int** |  | [optional] 
**home_timeouts** | **int** |  | [optional] 
**is_in_progress** | **bool** |  | [optional] 
**is_over** | **bool** |  | [optional] 
**is_overtime** | **bool** |  | [optional] 
**last_play** | **str** |  | [optional] 
**last_updated** | **str** |  | [optional] 
**neutral_venue** | **bool** |  | [optional] 
**over_payout** | **int** |  | [optional] 
**over_under** | **float** |  | [optional] 
**point_spread** | **float** |  | [optional] 
**point_spread_away_team_money_line** | **int** |  | [optional] 
**point_spread_home_team_money_line** | **int** |  | [optional] 
**possession** | **str** |  | [optional] 
**quarter** | **str** |  | [optional] 
**quarter_description** | **str** |  | [optional] 
**red_zone** | **str** |  | [optional] 
**referee_id** | **int** |  | [optional] 
**score_id** | **int** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**stadium_details** | [**Stadium**](Stadium.md) |  | [optional] 
**stadium_id** | **int** |  | [optional] 
**status** | **str** |  | [optional] 
**time_remaining** | **str** |  | [optional] 
**under_payout** | **int** |  | [optional] 
**week** | **int** |  | [optional] 
**yard_line** | **int** |  | [optional] 
**yard_line_territory** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.score import Score

# TODO update the JSON string below
json = "{}"
# create an instance of Score from a JSON string
score_instance = Score.from_json(json)
# print the JSON string representation of the object
print(Score.to_json())

# convert the object into a dict
score_dict = score_instance.to_dict()
# create an instance of Score from a dict
score_from_dict = Score.from_dict(score_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


