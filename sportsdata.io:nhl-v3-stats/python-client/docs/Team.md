# Team


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**city** | **str** |  | [optional] 
**conference** | **str** |  | [optional] 
**division** | **str** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**key** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**primary_color** | **str** |  | [optional] 
**quaternary_color** | **str** |  | [optional] 
**secondary_color** | **str** |  | [optional] 
**stadium_id** | **int** |  | [optional] 
**team_id** | **int** |  | [optional] 
**tertiary_color** | **str** |  | [optional] 
**wikipedia_logo_url** | **str** |  | [optional] 
**wikipedia_word_mark_url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.team import Team

# TODO update the JSON string below
json = "{}"
# create an instance of Team from a JSON string
team_instance = Team.from_json(json)
# print the JSON string representation of the object
print(Team.to_json())

# convert the object into a dict
team_dict = team_instance.to_dict()
# create an instance of Team from a dict
team_from_dict = Team.from_dict(team_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


