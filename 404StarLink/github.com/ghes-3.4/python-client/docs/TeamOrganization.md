# TeamOrganization

Team Organization

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**billing_email** | **str** |  | [optional] 
**blog** | **str** |  | [optional] 
**collaborators** | **int** |  | [optional] 
**company** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**default_repository_permission** | **str** |  | [optional] 
**description** | **str** |  | 
**disk_usage** | **int** |  | [optional] 
**email** | **str** |  | [optional] 
**events_url** | **str** |  | 
**followers** | **int** |  | 
**following** | **int** |  | 
**has_organization_projects** | **bool** |  | 
**has_repository_projects** | **bool** |  | 
**hooks_url** | **str** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**is_verified** | **bool** |  | [optional] 
**issues_url** | **str** |  | 
**location** | **str** |  | [optional] 
**login** | **str** |  | 
**members_allowed_repository_creation_type** | **str** |  | [optional] 
**members_can_create_internal_repositories** | **bool** |  | [optional] 
**members_can_create_pages** | **bool** |  | [optional] 
**members_can_create_private_pages** | **bool** |  | [optional] 
**members_can_create_private_repositories** | **bool** |  | [optional] 
**members_can_create_public_pages** | **bool** |  | [optional] 
**members_can_create_public_repositories** | **bool** |  | [optional] 
**members_can_create_repositories** | **bool** |  | [optional] 
**members_can_fork_private_repositories** | **bool** |  | [optional] 
**members_url** | **str** |  | 
**name** | **str** |  | [optional] 
**node_id** | **str** |  | 
**owned_private_repos** | **int** |  | [optional] 
**plan** | [**OrganizationFullPlan**](OrganizationFullPlan.md) |  | [optional] 
**private_gists** | **int** |  | [optional] 
**public_gists** | **int** |  | 
**public_members_url** | **str** |  | 
**public_repos** | **int** |  | 
**repos_url** | **str** |  | 
**total_private_repos** | **int** |  | [optional] 
**twitter_username** | **str** |  | [optional] 
**two_factor_requirement_enabled** | **bool** |  | [optional] 
**type** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.team_organization import TeamOrganization

# TODO update the JSON string below
json = "{}"
# create an instance of TeamOrganization from a JSON string
team_organization_instance = TeamOrganization.from_json(json)
# print the JSON string representation of the object
print(TeamOrganization.to_json())

# convert the object into a dict
team_organization_dict = team_organization_instance.to_dict()
# create an instance of TeamOrganization from a dict
team_organization_from_dict = TeamOrganization.from_dict(team_organization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


