# LdapMappingTeam


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**ldap_dn** | **str** |  | [optional] 
**members_url** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**node_id** | **str** |  | [optional] 
**parent** | **object** |  | [optional] 
**permission** | **str** |  | [optional] 
**privacy** | **str** |  | [optional] 
**repositories_url** | **str** |  | [optional] 
**slug** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.ldap_mapping_team import LdapMappingTeam

# TODO update the JSON string below
json = "{}"
# create an instance of LdapMappingTeam from a JSON string
ldap_mapping_team_instance = LdapMappingTeam.from_json(json)
# print the JSON string representation of the object
print(LdapMappingTeam.to_json())

# convert the object into a dict
ldap_mapping_team_dict = ldap_mapping_team_instance.to_dict()
# create an instance of LdapMappingTeam from a dict
ldap_mapping_team_from_dict = LdapMappingTeam.from_dict(ldap_mapping_team_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


