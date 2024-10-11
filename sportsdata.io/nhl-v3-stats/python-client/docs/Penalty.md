# Penalty


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bench_penalty_served_by_player_id** | **int** |  | [optional] 
**description** | **str** |  | [optional] 
**drawn_by_player_id** | **int** |  | [optional] 
**drawn_by_team_id** | **int** |  | [optional] 
**is_bench_penalty** | **bool** |  | [optional] 
**penalized_player_id** | **int** |  | [optional] 
**penalized_team_id** | **int** |  | [optional] 
**penalty_id** | **int** |  | [optional] 
**penalty_minutes** | **int** |  | [optional] 
**period_id** | **int** |  | [optional] 
**sequence** | **int** |  | [optional] 
**time_remaining_minutes** | **int** |  | [optional] 
**time_remaining_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.penalty import Penalty

# TODO update the JSON string below
json = "{}"
# create an instance of Penalty from a JSON string
penalty_instance = Penalty.from_json(json)
# print the JSON string representation of the object
print(Penalty.to_json())

# convert the object into a dict
penalty_dict = penalty_instance.to_dict()
# create an instance of Penalty from a dict
penalty_from_dict = Penalty.from_dict(penalty_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


