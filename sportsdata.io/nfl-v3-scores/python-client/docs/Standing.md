# Standing


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conference** | **str** |  | [optional] 
**conference_losses** | **int** |  | [optional] 
**conference_rank** | **int** |  | [optional] 
**conference_ties** | **int** |  | [optional] 
**conference_wins** | **int** |  | [optional] 
**division** | **str** |  | [optional] 
**division_losses** | **int** |  | [optional] 
**division_rank** | **int** |  | [optional] 
**division_ties** | **int** |  | [optional] 
**division_wins** | **int** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**losses** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**net_points** | **int** |  | [optional] 
**percentage** | **float** |  | [optional] 
**points_against** | **int** |  | [optional] 
**points_for** | **int** |  | [optional] 
**season** | **int** |  | [optional] 
**season_type** | **int** |  | [optional] 
**team** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**ties** | **int** |  | [optional] 
**touchdowns** | **int** |  | [optional] 
**wins** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.standing import Standing

# TODO update the JSON string below
json = "{}"
# create an instance of Standing from a JSON string
standing_instance = Standing.from_json(json)
# print the JSON string representation of the object
print(Standing.to_json())

# convert the object into a dict
standing_dict = standing_instance.to_dict()
# create an instance of Standing from a dict
standing_from_dict = Standing.from_dict(standing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


