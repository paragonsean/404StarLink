# Player


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**birth_city** | **str** |  | [optional] 
**birth_country** | **str** |  | [optional] 
**birth_date** | **str** |  | [optional] 
**common_name** | **str** |  | [optional] 
**draft_kings_position** | **str** |  | [optional] 
**first_name** | **str** |  | [optional] 
**foot** | **str** |  | [optional] 
**gender** | **str** |  | [optional] 
**height** | **int** |  | [optional] 
**injury_body_part** | **str** |  | [optional] 
**injury_notes** | **str** |  | [optional] 
**injury_start_date** | **str** |  | [optional] 
**injury_status** | **str** |  | [optional] 
**jersey** | **int** |  | [optional] 
**last_name** | **str** |  | [optional] 
**nationality** | **str** |  | [optional] 
**photo_url** | **str** |  | [optional] 
**player_id** | **int** |  | [optional] 
**position** | **str** |  | [optional] 
**position_category** | **str** |  | [optional] 
**roto_wire_player_id** | **int** |  | [optional] 
**short_name** | **str** |  | [optional] 
**updated** | **str** |  | [optional] 
**usa_today_headshot_no_background_updated** | **str** |  | [optional] 
**usa_today_headshot_no_background_url** | **str** |  | [optional] 
**usa_today_headshot_updated** | **str** |  | [optional] 
**usa_today_headshot_url** | **str** |  | [optional] 
**usa_today_player_id** | **int** |  | [optional] 
**weight** | **int** |  | [optional] 

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


