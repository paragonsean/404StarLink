# TeamLine


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**even_strength_lines** | [**List[PlayerLine]**](PlayerLine.md) |  | [optional] 
**full_name** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**power_play_lines** | [**List[PlayerLine]**](PlayerLine.md) |  | [optional] 
**team_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.team_line import TeamLine

# TODO update the JSON string below
json = "{}"
# create an instance of TeamLine from a JSON string
team_line_instance = TeamLine.from_json(json)
# print the JSON string representation of the object
print(TeamLine.to_json())

# convert the object into a dict
team_line_dict = team_line_instance.to_dict()
# create an instance of TeamLine from a dict
team_line_from_dict = TeamLine.from_dict(team_line_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


