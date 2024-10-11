# AppPermissions

The permissions granted to the user-to-server access token.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | **str** | The level of permission to grant the access token for GitHub Actions workflows, workflow runs, and artifacts. | [optional] 
**administration** | **str** | The level of permission to grant the access token for repository creation, deletion, settings, teams, and collaborators creation. | [optional] 
**checks** | **str** | The level of permission to grant the access token for checks on code. | [optional] 
**contents** | **str** | The level of permission to grant the access token for repository contents, commits, branches, downloads, releases, and merges. | [optional] 
**deployments** | **str** | The level of permission to grant the access token for deployments and deployment statuses. | [optional] 
**environments** | **str** | The level of permission to grant the access token for managing repository environments. | [optional] 
**issues** | **str** | The level of permission to grant the access token for issues and related comments, assignees, labels, and milestones. | [optional] 
**members** | **str** | The level of permission to grant the access token for organization teams and members. | [optional] 
**metadata** | **str** | The level of permission to grant the access token to search repositories, list collaborators, and access repository metadata. | [optional] 
**organization_administration** | **str** | The level of permission to grant the access token to manage access to an organization. | [optional] 
**organization_hooks** | **str** | The level of permission to grant the access token to manage the post-receive hooks for an organization. | [optional] 
**organization_packages** | **str** | The level of permission to grant the access token for organization packages published to GitHub Packages. | [optional] 
**organization_plan** | **str** | The level of permission to grant the access token for viewing an organization&#39;s plan. | [optional] 
**organization_projects** | **str** | The level of permission to grant the access token to manage organization projects and projects beta (where available). | [optional] 
**organization_secrets** | **str** | The level of permission to grant the access token to manage organization secrets. | [optional] 
**organization_self_hosted_runners** | **str** | The level of permission to grant the access token to view and manage GitHub Actions self-hosted runners available to an organization. | [optional] 
**organization_user_blocking** | **str** | The level of permission to grant the access token to view and manage users blocked by the organization. | [optional] 
**packages** | **str** | The level of permission to grant the access token for packages published to GitHub Packages. | [optional] 
**pages** | **str** | The level of permission to grant the access token to retrieve Pages statuses, configuration, and builds, as well as create new builds. | [optional] 
**pull_requests** | **str** | The level of permission to grant the access token for pull requests and related comments, assignees, labels, milestones, and merges. | [optional] 
**repository_hooks** | **str** | The level of permission to grant the access token to manage the post-receive hooks for a repository. | [optional] 
**repository_projects** | **str** | The level of permission to grant the access token to manage repository projects, columns, and cards. | [optional] 
**secret_scanning_alerts** | **str** | The level of permission to grant the access token to view and manage secret scanning alerts. | [optional] 
**secrets** | **str** | The level of permission to grant the access token to manage repository secrets. | [optional] 
**security_events** | **str** | The level of permission to grant the access token to view and manage security events like code scanning alerts. | [optional] 
**single_file** | **str** | The level of permission to grant the access token to manage just a single file. | [optional] 
**statuses** | **str** | The level of permission to grant the access token for commit statuses. | [optional] 
**team_discussions** | **str** | The level of permission to grant the access token to manage team discussions and related comments. | [optional] 
**vulnerability_alerts** | **str** | The level of permission to grant the access token to manage Dependabot alerts. | [optional] 
**workflows** | **str** | The level of permission to grant the access token to update GitHub Actions workflow files. | [optional] 

## Example

```python
from openapi_client.models.app_permissions import AppPermissions

# TODO update the JSON string below
json = "{}"
# create an instance of AppPermissions from a JSON string
app_permissions_instance = AppPermissions.from_json(json)
# print the JSON string representation of the object
print(AppPermissions.to_json())

# convert the object into a dict
app_permissions_dict = app_permissions_instance.to_dict()
# create an instance of AppPermissions from a dict
app_permissions_from_dict = AppPermissions.from_dict(app_permissions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


