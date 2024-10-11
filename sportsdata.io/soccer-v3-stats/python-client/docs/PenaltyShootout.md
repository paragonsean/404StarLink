# PenaltyShootout


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**order** | **int** |  | [optional] 
**penalty_shootout_id** | **int** |  | [optional] 
**player_id** | **int** |  | [optional] 
**position** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.penalty_shootout import PenaltyShootout

# TODO update the JSON string below
json = "{}"
# create an instance of PenaltyShootout from a JSON string
penalty_shootout_instance = PenaltyShootout.from_json(json)
# print the JSON string representation of the object
print(PenaltyShootout.to_json())

# convert the object into a dict
penalty_shootout_dict = penalty_shootout_instance.to_dict()
# create an instance of PenaltyShootout from a dict
penalty_shootout_from_dict = PenaltyShootout.from_dict(penalty_shootout_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


