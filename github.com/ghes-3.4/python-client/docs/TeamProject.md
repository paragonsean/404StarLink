# TeamProject

A team's access to a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | 
**columns_url** | **str** |  | 
**created_at** | **str** |  | 
**creator** | [**SimpleUser**](SimpleUser.md) |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**number** | **int** |  | 
**organization_permission** | **str** | The organization permission for this project. Only present when owner is an organization. | [optional] 
**owner_url** | **str** |  | 
**permissions** | [**TeamProjectPermissions**](TeamProjectPermissions.md) |  | 
**private** | **bool** | Whether the project is private or not. Only present when owner is an organization. | [optional] 
**state** | **str** |  | 
**updated_at** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.team_project import TeamProject

# TODO update the JSON string below
json = "{}"
# create an instance of TeamProject from a JSON string
team_project_instance = TeamProject.from_json(json)
# print the JSON string representation of the object
print(TeamProject.to_json())

# convert the object into a dict
team_project_dict = team_project_instance.to_dict()
# create an instance of TeamProject from a dict
team_project_from_dict = TeamProject.from_dict(team_project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


