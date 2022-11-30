# Team


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **bool** |  | [optional] 
**address** | **str** |  | [optional] 
**area_id** | **int** |  | [optional] 
**area_name** | **str** |  | [optional] 
**city** | **str** |  | [optional] 
**club_color1** | **str** |  | [optional] 
**club_color2** | **str** |  | [optional] 
**club_color3** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**fax** | **str** |  | [optional] 
**founded** | **int** |  | [optional] 
**full_name** | **str** |  | [optional] 
**gender** | **str** |  | [optional] 
**global_team_id** | **int** |  | [optional] 
**key** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**nickname1** | **str** |  | [optional] 
**nickname2** | **str** |  | [optional] 
**nickname3** | **str** |  | [optional] 
**phone** | **str** |  | [optional] 
**team_id** | **int** |  | [optional] 
**type** | **str** |  | [optional] 
**venue_id** | **int** |  | [optional] 
**venue_name** | **str** |  | [optional] 
**website** | **str** |  | [optional] 
**wikipedia_logo_url** | **str** |  | [optional] 
**wikipedia_word_mark_url** | **str** |  | [optional] 
**zip** | **str** |  | [optional] 

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


