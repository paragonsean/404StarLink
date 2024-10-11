# Player


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**birth_city** | **str** |  | [optional] 
**birth_date** | **str** |  | [optional] 
**birth_state** | **str** |  | [optional] 
**catches** | **str** |  | [optional] 
**depth_chart_order** | **int** |  | [optional] 
**depth_chart_position** | **str** |  | [optional] 
**draft_kings_name** | **str** |  | [optional] 
**draft_kings_player_id** | **int** |  | [optional] 
**fan_duel_name** | **str** |  | [optional] 
**fan_duel_player_id** | **int** |  | [optional] 
**fantasy_alarm_player_id** | **int** |  | [optional] 
**fantasy_draft_name** | **str** |  | [optional] 
**fantasy_draft_player_id** | **int** |  | [optional] 
**first_name** | **str** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**height** | **int** |  | [optional] 
**injury_body_part** | **str** |  | [optional] 
**injury_notes** | **str** |  | [optional] 
**injury_start_date** | **str** |  | [optional] 
**injury_status** | **str** |  | [optional] 
**jersey** | **int** |  | [optional] 
**last_name** | **str** |  | [optional] 
**photo_url** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**position** | **str** |  | [optional] 
**roto_wire_player_id** | **int** |  | [optional] 
**rotoworld_player_id** | **int** |  | [optional] 
**shoots** | **str** |  | [optional] 
**sport_radar_player_id** | **str** |  | [optional] 
**sports_direct_player_id** | **int** |  | [optional] 
**stats_player_id** | **int** |  | [optional] 
**status** | **str** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
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


