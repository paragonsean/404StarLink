# PlayoffAggregateScore


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **str** |  | [optional] 
**team_a_aggregate_score** | **int** |  | [optional] 
**team_a_id** | **int** |  | [optional] 
**team_b_aggregate_score** | **int** |  | [optional] 
**team_b_id** | **int** |  | [optional] 
**updated** | **str** |  | [optional] 
**winning_team_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.playoff_aggregate_score import PlayoffAggregateScore

# TODO update the JSON string below
json = "{}"
# create an instance of PlayoffAggregateScore from a JSON string
playoff_aggregate_score_instance = PlayoffAggregateScore.from_json(json)
# print the JSON string representation of the object
print(PlayoffAggregateScore.to_json())

# convert the object into a dict
playoff_aggregate_score_dict = playoff_aggregate_score_instance.to_dict()
# create an instance of PlayoffAggregateScore from a dict
playoff_aggregate_score_from_dict = PlayoffAggregateScore.from_dict(playoff_aggregate_score_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


