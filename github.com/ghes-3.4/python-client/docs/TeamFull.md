# TeamFull

Groups of organization members that gives permissions on specified repositories.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**description** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** | Unique identifier of the team | 
**ldap_dn** | **str** | Distinguished Name (DN) that team maps to within LDAP environment | [optional] 
**members_count** | **int** |  | 
**members_url** | **str** |  | 
**name** | **str** | Name of the team | 
**node_id** | **str** |  | 
**organization** | [**TeamOrganization**](TeamOrganization.md) |  | 
**parent** | [**NullableTeamSimple**](NullableTeamSimple.md) |  | [optional] 
**permission** | **str** | Permission that the team will have for its repositories | 
**privacy** | **str** | The level of privacy this team should have | [optional] 
**repos_count** | **int** |  | 
**repositories_url** | **str** |  | 
**slug** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** | URL for the team | 

## Example

```python
from openapi_client.models.team_full import TeamFull

# TODO update the JSON string below
json = "{}"
# create an instance of TeamFull from a JSON string
team_full_instance = TeamFull.from_json(json)
# print the JSON string representation of the object
print(TeamFull.to_json())

# convert the object into a dict
team_full_dict = team_full_instance.to_dict()
# create an instance of TeamFull from a dict
team_full_from_dict = TeamFull.from_dict(team_full_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


