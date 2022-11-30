# Round


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_round** | **bool** |  | [optional] 
**current_week** | **int** |  | [optional] 
**end_date** | **str** |  | [optional] 
**games** | [**List[Game]**](Game.md) |  | [optional] 
**name** | **str** |  | [optional] 
**player_seasons** | [**List[PlayerSeason]**](PlayerSeason.md) |  | [optional] 
**round_id** | **int** |  | [optional] 
**season** | **int** |  | [optional] 
**season_id** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**standings** | [**List[Standing]**](Standing.md) |  | [optional] 
**start_date** | **str** |  | [optional] 
**team_seasons** | [**List[TeamSeason]**](TeamSeason.md) |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.round import Round

# TODO update the JSON string below
json = "{}"
# create an instance of Round from a JSON string
round_instance = Round.from_json(json)
# print the JSON string representation of the object
print(Round.to_json())

# convert the object into a dict
round_dict = round_instance.to_dict()
# create an instance of Round from a dict
round_from_dict = Round.from_dict(round_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


