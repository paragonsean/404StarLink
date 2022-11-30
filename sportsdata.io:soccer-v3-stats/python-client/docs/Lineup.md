# Lineup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_id** | **int** |  | [optional] 
**game_minute** | **int** |  | [optional] 
**game_minute_extra** | **int** |  | [optional] 
**lineup_id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**pitch_position_horizontal** | **int** |  | [optional] 
**pitch_position_vertical** | **int** |  | [optional] 
**player_id** | **int** |  | [optional] 
**position** | **str** |  | [optional] 
**replaced_player_id** | **int** |  | [optional] 
**replaced_player_name** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.lineup import Lineup

# TODO update the JSON string below
json = "{}"
# create an instance of Lineup from a JSON string
lineup_instance = Lineup.from_json(json)
# print the JSON string representation of the object
print(Lineup.to_json())

# convert the object into a dict
lineup_dict = lineup_instance.to_dict()
# create an instance of Lineup from a dict
lineup_from_dict = Lineup.from_dict(lineup_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


