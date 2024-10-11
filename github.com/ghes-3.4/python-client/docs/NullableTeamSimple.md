# NullableTeamSimple

Groups of organization members that gives permissions on specified repositories.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Description of the team | 
**html_url** | **str** |  | 
**id** | **int** | Unique identifier of the team | 
**ldap_dn** | **str** | Distinguished Name (DN) that team maps to within LDAP environment | [optional] 
**members_url** | **str** |  | 
**name** | **str** | Name of the team | 
**node_id** | **str** |  | 
**permission** | **str** | Permission that the team will have for its repositories | 
**privacy** | **str** | The level of privacy this team should have | [optional] 
**repositories_url** | **str** |  | 
**slug** | **str** |  | 
**url** | **str** | URL for the team | 

## Example

```python
from openapi_client.models.nullable_team_simple import NullableTeamSimple

# TODO update the JSON string below
json = "{}"
# create an instance of NullableTeamSimple from a JSON string
nullable_team_simple_instance = NullableTeamSimple.from_json(json)
# print the JSON string representation of the object
print(NullableTeamSimple.to_json())

# convert the object into a dict
nullable_team_simple_dict = nullable_team_simple_instance.to_dict()
# create an instance of NullableTeamSimple from a dict
nullable_team_simple_from_dict = NullableTeamSimple.from_dict(nullable_team_simple_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


