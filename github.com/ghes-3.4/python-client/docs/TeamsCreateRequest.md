# TeamsCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The description of the team. | [optional] 
**ldap_dn** | **str** | The [distinguished name](https://www.ldap.com/ldap-dns-and-rdns) (DN) of the LDAP entry to map to a team. LDAP synchronization must be enabled to map LDAP entries to a team. Use the \&quot;[Update LDAP mapping for a team](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#update-ldap-mapping-for-a-team)\&quot; endpoint to change the LDAP DN. For more information, see \&quot;[Using LDAP](https://docs.github.com/enterprise-server@3.4/admin/identity-and-access-management/authenticating-users-for-your-github-enterprise-server-instance/using-ldap#enabling-ldap-sync).\&quot; | [optional] 
**maintainers** | **List[str]** | List GitHub IDs for organization members who will become team maintainers. | [optional] 
**name** | **str** | The name of the team. | 
**parent_team_id** | **int** | The ID of a team to set as the parent team. | [optional] 
**permission** | **str** | **Deprecated**. The permission that new repositories will be added to the team with when none is specified. | [optional] [default to 'pull']
**privacy** | **str** | The level of privacy this team should have. The options are:   **For a non-nested team:**    * &#x60;secret&#x60; - only visible to organization owners and members of this team.    * &#x60;closed&#x60; - visible to all members of this organization.   Default: &#x60;secret&#x60;   **For a parent or child team:**    * &#x60;closed&#x60; - visible to all members of this organization.   Default for child team: &#x60;closed&#x60; | [optional] 
**repo_names** | **List[str]** | The full name (e.g., \&quot;organization-name/repository-name\&quot;) of repositories to add the team to. | [optional] 

## Example

```python
from openapi_client.models.teams_create_request import TeamsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TeamsCreateRequest from a JSON string
teams_create_request_instance = TeamsCreateRequest.from_json(json)
# print the JSON string representation of the object
print(TeamsCreateRequest.to_json())

# convert the object into a dict
teams_create_request_dict = teams_create_request_instance.to_dict()
# create an instance of TeamsCreateRequest from a dict
teams_create_request_from_dict = TeamsCreateRequest.from_dict(teams_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


