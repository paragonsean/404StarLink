# BoxScore


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_assistant_referee1** | [**Referee**](Referee.md) |  | [optional] 
**additional_assistant_referee2** | [**Referee**](Referee.md) |  | [optional] 
**assistant_referee1** | [**Referee**](Referee.md) |  | [optional] 
**assistant_referee2** | [**Referee**](Referee.md) |  | [optional] 
**away_team_coach** | [**Coach**](Coach.md) |  | [optional] 
**bookings** | [**List[Booking]**](Booking.md) |  | [optional] 
**fourth_referee** | [**Referee**](Referee.md) |  | [optional] 
**game** | [**Game**](Game.md) |  | [optional] 
**goals** | [**List[Goal]**](Goal.md) |  | [optional] 
**home_team_coach** | [**Coach**](Coach.md) |  | [optional] 
**lineups** | [**List[Lineup]**](Lineup.md) |  | [optional] 
**main_referee** | [**Referee**](Referee.md) |  | [optional] 
**penalty_shootouts** | [**List[PenaltyShootout]**](PenaltyShootout.md) |  | [optional] 
**player_games** | [**List[PlayerGame]**](PlayerGame.md) |  | [optional] 
**team_games** | [**List[TeamGame]**](TeamGame.md) |  | [optional] 
**video_assistant_referee** | [**Referee**](Referee.md) |  | [optional] 

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


