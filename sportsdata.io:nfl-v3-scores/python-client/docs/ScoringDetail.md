# ScoringDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_key** | **str** |  | [optional] 
**length** | **int** |  | [optional] 
**player_game_id** | **int** |  | [optional] 
**player_id** | **int** |  | [optional] 
**score_id** | **int** |  | [optional] 
**scoring_detail_id** | **int** |  | [optional] 
**scoring_play_id** | **int** |  | [optional] 
**scoring_type** | **str** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**team** | **str** |  | [optional] 
**week** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.scoring_detail import ScoringDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ScoringDetail from a JSON string
scoring_detail_instance = ScoringDetail.from_json(json)
# print the JSON string representation of the object
print(ScoringDetail.to_json())

# convert the object into a dict
scoring_detail_dict = scoring_detail_instance.to_dict()
# create an instance of ScoringDetail from a dict
scoring_detail_from_dict = ScoringDetail.from_dict(scoring_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


