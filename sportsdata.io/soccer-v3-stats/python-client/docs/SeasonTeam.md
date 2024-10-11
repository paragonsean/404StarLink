# SeasonTeam


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**gender** | **str** |  | [optional] 
**season_id** | **int** |  | [optional] 
**season_team_id** | **int** |  | [optional] 
**team** | [**Team**](Team.md) |  | [optional] 
**team_id** | **int** |  | [optional] 
**team_name** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.season_team import SeasonTeam

# TODO update the JSON string below
json = "{}"
# create an instance of SeasonTeam from a JSON string
season_team_instance = SeasonTeam.from_json(json)
# print the JSON string representation of the object
print(SeasonTeam.to_json())

# convert the object into a dict
season_team_dict = season_team_instance.to_dict()
# create an instance of SeasonTeam from a dict
season_team_from_dict = SeasonTeam.from_dict(season_team_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


