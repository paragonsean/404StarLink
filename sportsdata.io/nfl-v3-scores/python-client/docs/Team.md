# Team


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average_draft_position** | **float** |  | [optional] 
**average_draft_position2_qb** | **float** |  | [optional] 
**average_draft_position_dynasty** | **float** |  | [optional] 
**average_draft_position_ppr** | **float** |  | [optional] 
**bye_week** | **int** |  | [optional] 
**city** | **str** |  | [optional] 
**conference** | **str** |  | [optional] 
**defensive_coordinator** | **str** |  | [optional] 
**defensive_scheme** | **str** |  | [optional] 
**division** | **str** |  | [optional] 
**draft_kings_name** | **str** |  | [optional] 
**draft_kings_player_id** | **int** |  | [optional] 
**fan_duel_name** | **str** |  | [optional] 
**fan_duel_player_id** | **int** |  | [optional] 
**fantasy_draft_name** | **str** |  | [optional] 
**fantasy_draft_player_id** | **int** |  | [optional] 
**full_name** | **str** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**head_coach** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**offensive_coordinator** | **str** |  | [optional] 
**offensive_scheme** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**primary_color** | **str** |  | [optional] 
**quaternary_color** | **str** |  | [optional] 
**secondary_color** | **str** |  | [optional] 
**special_teams_coach** | **str** |  | [optional] 
**stadium_details** | [**Stadium**](Stadium.md) |  | [optional] 
**stadium_id** | **int** |  | [optional] 
**team_id** | **int** |  | [optional] 
**tertiary_color** | **str** |  | [optional] 
**upcoming_draft_kings_salary** | **int** |  | [optional] 
**upcoming_fan_duel_salary** | **int** |  | [optional] 
**upcoming_opponent** | **str** |  | [optional] 
**upcoming_opponent_position_rank** | **int** |  | [optional] 
**upcoming_opponent_rank** | **int** |  | [optional] 
**upcoming_salary** | **int** |  | [optional] 
**upcoming_yahoo_salary** | **int** |  | [optional] 
**wikipedia_logo_url** | **str** |  | [optional] 
**wikipedia_word_mark_url** | **str** |  | [optional] 
**yahoo_name** | **str** |  | [optional] 
**yahoo_player_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.team import Team

# TODO update the JSON string below
json = "{}"
# create an instance of Team from a JSON string
team_instance = Team.from_json(json)
# print the JSON string representation of the object
print(Team.to_json())

# convert the object into a dict
team_dict = team_instance.to_dict()
# create an instance of Team from a dict
team_from_dict = Team.from_dict(team_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


