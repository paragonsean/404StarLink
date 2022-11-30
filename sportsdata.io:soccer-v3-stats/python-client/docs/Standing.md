# Standing


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**draws** | **int** |  | [optional] 
**games** | **int** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**goals_against** | **int** |  | [optional] 
**goals_differential** | **int** |  | [optional] 
**goals_scored** | **int** |  | [optional] 
**group** | **str** |  | [optional] 
**losses** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**order** | **int** |  | [optional] 
**points** | **int** |  | [optional] 
**round_id** | **int** |  | [optional] 
**scope** | **str** |  | [optional] 
**short_name** | **str** |  | [optional] 
**standing_id** | **int** |  | [optional] 
**team_id** | **int** |  | [optional] 
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


