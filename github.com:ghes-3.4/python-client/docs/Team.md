# Team

Groups of organization members that gives permissions on specified repositories.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**members_url** | **str** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**parent** | [**NullableTeamSimple**](NullableTeamSimple.md) |  | 
**permission** | **str** |  | 
**permissions** | [**TeamPermissions**](TeamPermissions.md) |  | [optional] 
**privacy** | **str** |  | [optional] 
**repositories_url** | **str** |  | 
**slug** | **str** |  | 
**url** | **str** |  | 

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


