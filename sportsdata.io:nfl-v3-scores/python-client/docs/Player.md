# Player


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**age** | **int** |  | [optional] 
**average_draft_position** | **float** |  | [optional] 
**birth_date** | **str** |  | [optional] 
**birth_date_string** | **str** |  | [optional] 
**bye_week** | **int** |  | [optional] 
**college** | **str** |  | [optional] 
**college_draft_pick** | **int** |  | [optional] 
**college_draft_round** | **int** |  | [optional] 
**college_draft_team** | **str** |  | [optional] 
**college_draft_year** | **int** |  | [optional] 
**current_status** | **str** |  | [optional] 
**current_team** | **str** |  | [optional] 
**declared_inactive** | **bool** |  | [optional] 
**depth_display_order** | **int** |  | [optional] 
**depth_order** | **int** |  | [optional] 
**depth_position** | **str** |  | [optional] 
**depth_position_category** | **str** |  | [optional] 
**draft_kings_name** | **str** |  | [optional] 
**draft_kings_player_id** | **int** |  | [optional] 
**experience** | **int** |  | [optional] 
**experience_string** | **str** |  | [optional] 
**fan_duel_name** | **str** |  | [optional] 
**fan_duel_player_id** | **int** |  | [optional] 
**fantasy_alarm_player_id** | **int** |  | [optional] 
**fantasy_draft_name** | **str** |  | [optional] 
**fantasy_draft_player_id** | **int** |  | [optional] 
**fantasy_position** | **str** |  | [optional] 
**fantasy_position_depth_order** | **int** |  | [optional] 
**first_name** | **str** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**height** | **str** |  | [optional] 
**height_feet** | **int** |  | [optional] 
**height_inches** | **int** |  | [optional] 
**injury_body_part** | **str** |  | [optional] 
**injury_notes** | **str** |  | [optional] 
**injury_practice** | **str** |  | [optional] 
**injury_practice_description** | **str** |  | [optional] 
**injury_start_date** | **str** |  | [optional] 
**injury_status** | **str** |  | [optional] 
**is_undrafted_free_agent** | **bool** |  | [optional] 
**last_name** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**number** | **int** |  | [optional] 
**photo_url** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**position** | **str** |  | [optional] 
**position_category** | **str** |  | [optional] 
**roto_wire_player_id** | **int** |  | [optional] 
**rotoworld_player_id** | **int** |  | [optional] 
**short_name** | **str** |  | [optional] 
**sport_radar_player_id** | **str** |  | [optional] 
**sports_direct_player_id** | **int** |  | [optional] 
**stats_player_id** | **int** |  | [optional] 
**status** | **str** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**upcoming_draft_kings_salary** | **int** |  | [optional] 
**upcoming_fan_duel_salary** | **int** |  | [optional] 
**upcoming_game_opponent** | **str** |  | [optional] 
**upcoming_game_week** | **int** |  | [optional] 
**upcoming_opponent_position_rank** | **int** |  | [optional] 
**upcoming_opponent_rank** | **int** |  | [optional] 
**upcoming_salary** | **int** |  | [optional] 
**upcoming_yahoo_salary** | **int** |  | [optional] 
**usa_today_headshot_no_background_updated** | **str** |  | [optional] 
**usa_today_headshot_no_background_url** | **str** |  | [optional] 
**usa_today_headshot_updated** | **str** |  | [optional] 
**usa_today_headshot_url** | **str** |  | [optional] 
**usa_today_player_id** | **int** |  | [optional] 
**weight** | **int** |  | [optional] 
**xml_team_player_id** | **int** |  | [optional] 
**yahoo_name** | **str** |  | [optional] 
**yahoo_player_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.player import Player

# TODO update the JSON string below
json = "{}"
# create an instance of Player from a JSON string
player_instance = Player.from_json(json)
# print the JSON string representation of the object
print(Player.to_json())

# convert the object into a dict
player_dict = player_instance.to_dict()
# create an instance of Player from a dict
player_from_dict = Player.from_dict(player_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


