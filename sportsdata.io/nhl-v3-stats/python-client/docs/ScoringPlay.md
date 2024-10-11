# ScoringPlay


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed_by_team_id** | **int** |  | [optional] 
**assisted_by_player_id1** | **int** |  | [optional] 
**assisted_by_player_id2** | **int** |  | [optional] 
**away_team_score** | **int** |  | [optional] 
**empty_net** | **bool** |  | [optional] 
**home_team_score** | **int** |  | [optional] 
**period_id** | **int** |  | [optional] 
**power_play** | **bool** |  | [optional] 
**scored_by_player_id** | **int** |  | [optional] 
**scored_by_team_id** | **int** |  | [optional] 
**scoring_play_id** | **int** |  | [optional] 
**sequence** | **int** |  | [optional] 
**short_handed** | **bool** |  | [optional] 
**time_remaining_minutes** | **int** |  | [optional] 
**time_remaining_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.scoring_play import ScoringPlay

# TODO update the JSON string below
json = "{}"
# create an instance of ScoringPlay from a JSON string
scoring_play_instance = ScoringPlay.from_json(json)
# print the JSON string representation of the object
print(ScoringPlay.to_json())

# convert the object into a dict
scoring_play_dict = scoring_play_instance.to_dict()
# create an instance of ScoringPlay from a dict
scoring_play_from_dict = ScoringPlay.from_dict(scoring_play_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


