# BoxScore


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game** | [**Game**](Game.md) |  | [optional] 
**periods** | [**List[Period]**](Period.md) |  | [optional] 
**player_games** | [**List[PlayerGame]**](PlayerGame.md) |  | [optional] 
**shootout_plays** | [**List[Play]**](Play.md) |  | [optional] 
**team_games** | [**List[TeamGame]**](TeamGame.md) |  | [optional] 

## Example

```python
from openapi_client.models.box_score import BoxScore

# TODO update the JSON string below
json = "{}"
# create an instance of BoxScore from a JSON string
box_score_instance = BoxScore.from_json(json)
# print the JSON string representation of the object
print(BoxScore.to_json())

# convert the object into a dict
box_score_dict = box_score_instance.to_dict()
# create an instance of BoxScore from a dict
box_score_from_dict = BoxScore.from_dict(box_score_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


