# TeamsUpdateLegacyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The description of the team. | [optional] 
**name** | **str** | The name of the team. | 
**parent_team_id** | **int** | The ID of a team to set as the parent team. | [optional] 
**permission** | **str** | **Deprecated**. The permission that new repositories will be added to the team with when none is specified. | [optional] [default to 'pull']
**privacy** | **str** | The level of privacy this team should have. Editing teams without specifying this parameter leaves &#x60;privacy&#x60; intact. The options are:   **For a non-nested team:**    * &#x60;secret&#x60; - only visible to organization owners and members of this team.    * &#x60;closed&#x60; - visible to all members of this organization.   **For a parent or child team:**    * &#x60;closed&#x60; - visible to all members of this organization. | [optional] 

## Example

```python
from openapi_client.models.teams_update_legacy_request import TeamsUpdateLegacyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TeamsUpdateLegacyRequest from a JSON string
teams_update_legacy_request_instance = TeamsUpdateLegacyRequest.from_json(json)
# print the JSON string representation of the object
print(TeamsUpdateLegacyRequest.to_json())

# convert the object into a dict
teams_update_legacy_request_dict = teams_update_legacy_request_instance.to_dict()
# create an instance of TeamsUpdateLegacyRequest from a dict
teams_update_legacy_request_from_dict = TeamsUpdateLegacyRequest.from_dict(teams_update_legacy_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


