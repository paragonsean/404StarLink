# openapi_client.ReposApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repos_accept_invitation_for_authenticated_user**](ReposApi.md#repos_accept_invitation_for_authenticated_user) | **PATCH** /user/repository_invitations/{invitation_id} | Accept a repository invitation
[**repos_add_app_access_restrictions**](ReposApi.md#repos_add_app_access_restrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Add app access restrictions
[**repos_add_collaborator**](ReposApi.md#repos_add_collaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{username} | Add a repository collaborator
[**repos_add_status_check_contexts**](ReposApi.md#repos_add_status_check_contexts) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Add status check contexts
[**repos_add_team_access_restrictions**](ReposApi.md#repos_add_team_access_restrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Add team access restrictions
[**repos_add_user_access_restrictions**](ReposApi.md#repos_add_user_access_restrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Add user access restrictions
[**repos_check_collaborator**](ReposApi.md#repos_check_collaborator) | **GET** /repos/{owner}/{repo}/collaborators/{username} | Check if a user is a repository collaborator
[**repos_compare_commits**](ReposApi.md#repos_compare_commits) | **GET** /repos/{owner}/{repo}/compare/{basehead} | Compare two commits
[**repos_create_autolink**](ReposApi.md#repos_create_autolink) | **POST** /repos/{owner}/{repo}/autolinks | Create an autolink reference for a repository
[**repos_create_commit_comment**](ReposApi.md#repos_create_commit_comment) | **POST** /repos/{owner}/{repo}/commits/{commit_sha}/comments | Create a commit comment
[**repos_create_commit_signature_protection**](ReposApi.md#repos_create_commit_signature_protection) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Create commit signature protection
[**repos_create_commit_status**](ReposApi.md#repos_create_commit_status) | **POST** /repos/{owner}/{repo}/statuses/{sha} | Create a commit status
[**repos_create_deploy_key**](ReposApi.md#repos_create_deploy_key) | **POST** /repos/{owner}/{repo}/keys | Create a deploy key
[**repos_create_deployment**](ReposApi.md#repos_create_deployment) | **POST** /repos/{owner}/{repo}/deployments | Create a deployment
[**repos_create_deployment_branch_policy**](ReposApi.md#repos_create_deployment_branch_policy) | **POST** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies | Create a deployment branch policy
[**repos_create_deployment_status**](ReposApi.md#repos_create_deployment_status) | **POST** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses | Create a deployment status
[**repos_create_dispatch_event**](ReposApi.md#repos_create_dispatch_event) | **POST** /repos/{owner}/{repo}/dispatches | Create a repository dispatch event
[**repos_create_for_authenticated_user**](ReposApi.md#repos_create_for_authenticated_user) | **POST** /user/repos | Create a repository for the authenticated user
[**repos_create_fork**](ReposApi.md#repos_create_fork) | **POST** /repos/{owner}/{repo}/forks | Create a fork
[**repos_create_in_org**](ReposApi.md#repos_create_in_org) | **POST** /orgs/{org}/repos | Create an organization repository
[**repos_create_or_update_environment**](ReposApi.md#repos_create_or_update_environment) | **PUT** /repos/{owner}/{repo}/environments/{environment_name} | Create or update an environment
[**repos_create_or_update_file_contents**](ReposApi.md#repos_create_or_update_file_contents) | **PUT** /repos/{owner}/{repo}/contents/{path} | Create or update file contents
[**repos_create_pages_site**](ReposApi.md#repos_create_pages_site) | **POST** /repos/{owner}/{repo}/pages | Create a GitHub Enterprise Server Pages site
[**repos_create_release**](ReposApi.md#repos_create_release) | **POST** /repos/{owner}/{repo}/releases | Create a release
[**repos_create_using_template**](ReposApi.md#repos_create_using_template) | **POST** /repos/{template_owner}/{template_repo}/generate | Create a repository using a template
[**repos_create_webhook**](ReposApi.md#repos_create_webhook) | **POST** /repos/{owner}/{repo}/hooks | Create a repository webhook
[**repos_decline_invitation_for_authenticated_user**](ReposApi.md#repos_decline_invitation_for_authenticated_user) | **DELETE** /user/repository_invitations/{invitation_id} | Decline a repository invitation
[**repos_delete**](ReposApi.md#repos_delete) | **DELETE** /repos/{owner}/{repo} | Delete a repository
[**repos_delete_access_restrictions**](ReposApi.md#repos_delete_access_restrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions | Delete access restrictions
[**repos_delete_admin_branch_protection**](ReposApi.md#repos_delete_admin_branch_protection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Delete admin branch protection
[**repos_delete_an_environment**](ReposApi.md#repos_delete_an_environment) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name} | Delete an environment
[**repos_delete_autolink**](ReposApi.md#repos_delete_autolink) | **DELETE** /repos/{owner}/{repo}/autolinks/{autolink_id} | Delete an autolink reference from a repository
[**repos_delete_branch_protection**](ReposApi.md#repos_delete_branch_protection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection | Delete branch protection
[**repos_delete_commit_comment**](ReposApi.md#repos_delete_commit_comment) | **DELETE** /repos/{owner}/{repo}/comments/{comment_id} | Delete a commit comment
[**repos_delete_commit_signature_protection**](ReposApi.md#repos_delete_commit_signature_protection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Delete commit signature protection
[**repos_delete_deploy_key**](ReposApi.md#repos_delete_deploy_key) | **DELETE** /repos/{owner}/{repo}/keys/{key_id} | Delete a deploy key
[**repos_delete_deployment**](ReposApi.md#repos_delete_deployment) | **DELETE** /repos/{owner}/{repo}/deployments/{deployment_id} | Delete a deployment
[**repos_delete_deployment_branch_policy**](ReposApi.md#repos_delete_deployment_branch_policy) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Delete a deployment branch policy
[**repos_delete_file**](ReposApi.md#repos_delete_file) | **DELETE** /repos/{owner}/{repo}/contents/{path} | Delete a file
[**repos_delete_invitation**](ReposApi.md#repos_delete_invitation) | **DELETE** /repos/{owner}/{repo}/invitations/{invitation_id} | Delete a repository invitation
[**repos_delete_pages_site**](ReposApi.md#repos_delete_pages_site) | **DELETE** /repos/{owner}/{repo}/pages | Delete a GitHub Enterprise Server Pages site
[**repos_delete_pull_request_review_protection**](ReposApi.md#repos_delete_pull_request_review_protection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Delete pull request review protection
[**repos_delete_release**](ReposApi.md#repos_delete_release) | **DELETE** /repos/{owner}/{repo}/releases/{release_id} | Delete a release
[**repos_delete_release_asset**](ReposApi.md#repos_delete_release_asset) | **DELETE** /repos/{owner}/{repo}/releases/assets/{asset_id} | Delete a release asset
[**repos_delete_webhook**](ReposApi.md#repos_delete_webhook) | **DELETE** /repos/{owner}/{repo}/hooks/{hook_id} | Delete a repository webhook
[**repos_disable_lfs_for_repo**](ReposApi.md#repos_disable_lfs_for_repo) | **DELETE** /repos/{owner}/{repo}/lfs | Disable Git LFS for a repository
[**repos_download_tarball_archive**](ReposApi.md#repos_download_tarball_archive) | **GET** /repos/{owner}/{repo}/tarball/{ref} | Download a repository archive (tar)
[**repos_download_zipball_archive**](ReposApi.md#repos_download_zipball_archive) | **GET** /repos/{owner}/{repo}/zipball/{ref} | Download a repository archive (zip)
[**repos_enable_lfs_for_repo**](ReposApi.md#repos_enable_lfs_for_repo) | **PUT** /repos/{owner}/{repo}/lfs | Enable Git LFS for a repository
[**repos_generate_release_notes**](ReposApi.md#repos_generate_release_notes) | **POST** /repos/{owner}/{repo}/releases/generate-notes | Generate release notes content for a release
[**repos_get**](ReposApi.md#repos_get) | **GET** /repos/{owner}/{repo} | Get a repository
[**repos_get_access_restrictions**](ReposApi.md#repos_get_access_restrictions) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions | Get access restrictions
[**repos_get_admin_branch_protection**](ReposApi.md#repos_get_admin_branch_protection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Get admin branch protection
[**repos_get_all_environments**](ReposApi.md#repos_get_all_environments) | **GET** /repos/{owner}/{repo}/environments | List environments
[**repos_get_all_status_check_contexts**](ReposApi.md#repos_get_all_status_check_contexts) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Get all status check contexts
[**repos_get_all_topics**](ReposApi.md#repos_get_all_topics) | **GET** /repos/{owner}/{repo}/topics | Get all repository topics
[**repos_get_apps_with_access_to_protected_branch**](ReposApi.md#repos_get_apps_with_access_to_protected_branch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Get apps with access to the protected branch
[**repos_get_autolink**](ReposApi.md#repos_get_autolink) | **GET** /repos/{owner}/{repo}/autolinks/{autolink_id} | Get an autolink reference of a repository
[**repos_get_branch**](ReposApi.md#repos_get_branch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Get a branch
[**repos_get_branch_protection**](ReposApi.md#repos_get_branch_protection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection | Get branch protection
[**repos_get_code_frequency_stats**](ReposApi.md#repos_get_code_frequency_stats) | **GET** /repos/{owner}/{repo}/stats/code_frequency | Get the weekly commit activity
[**repos_get_collaborator_permission_level**](ReposApi.md#repos_get_collaborator_permission_level) | **GET** /repos/{owner}/{repo}/collaborators/{username}/permission | Get repository permissions for a user
[**repos_get_combined_status_for_ref**](ReposApi.md#repos_get_combined_status_for_ref) | **GET** /repos/{owner}/{repo}/commits/{ref}/status | Get the combined status for a specific reference
[**repos_get_commit**](ReposApi.md#repos_get_commit) | **GET** /repos/{owner}/{repo}/commits/{ref} | Get a commit
[**repos_get_commit_activity_stats**](ReposApi.md#repos_get_commit_activity_stats) | **GET** /repos/{owner}/{repo}/stats/commit_activity | Get the last year of commit activity
[**repos_get_commit_comment**](ReposApi.md#repos_get_commit_comment) | **GET** /repos/{owner}/{repo}/comments/{comment_id} | Get a commit comment
[**repos_get_commit_signature_protection**](ReposApi.md#repos_get_commit_signature_protection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Get commit signature protection
[**repos_get_content**](ReposApi.md#repos_get_content) | **GET** /repos/{owner}/{repo}/contents/{path} | Get repository content
[**repos_get_contributors_stats**](ReposApi.md#repos_get_contributors_stats) | **GET** /repos/{owner}/{repo}/stats/contributors | Get all contributor commit activity
[**repos_get_deploy_key**](ReposApi.md#repos_get_deploy_key) | **GET** /repos/{owner}/{repo}/keys/{key_id} | Get a deploy key
[**repos_get_deployment**](ReposApi.md#repos_get_deployment) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id} | Get a deployment
[**repos_get_deployment_branch_policy**](ReposApi.md#repos_get_deployment_branch_policy) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Get a deployment branch policy
[**repos_get_deployment_status**](ReposApi.md#repos_get_deployment_status) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id} | Get a deployment status
[**repos_get_environment**](ReposApi.md#repos_get_environment) | **GET** /repos/{owner}/{repo}/environments/{environment_name} | Get an environment
[**repos_get_latest_pages_build**](ReposApi.md#repos_get_latest_pages_build) | **GET** /repos/{owner}/{repo}/pages/builds/latest | Get latest Pages build
[**repos_get_latest_release**](ReposApi.md#repos_get_latest_release) | **GET** /repos/{owner}/{repo}/releases/latest | Get the latest release
[**repos_get_pages**](ReposApi.md#repos_get_pages) | **GET** /repos/{owner}/{repo}/pages | Get a GitHub Enterprise Server Pages site
[**repos_get_pages_build**](ReposApi.md#repos_get_pages_build) | **GET** /repos/{owner}/{repo}/pages/builds/{build_id} | Get GitHub Enterprise Server Pages build
[**repos_get_participation_stats**](ReposApi.md#repos_get_participation_stats) | **GET** /repos/{owner}/{repo}/stats/participation | Get the weekly commit count
[**repos_get_pull_request_review_protection**](ReposApi.md#repos_get_pull_request_review_protection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Get pull request review protection
[**repos_get_punch_card_stats**](ReposApi.md#repos_get_punch_card_stats) | **GET** /repos/{owner}/{repo}/stats/punch_card | Get the hourly commit count for each day
[**repos_get_readme**](ReposApi.md#repos_get_readme) | **GET** /repos/{owner}/{repo}/readme | Get a repository README
[**repos_get_readme_in_directory**](ReposApi.md#repos_get_readme_in_directory) | **GET** /repos/{owner}/{repo}/readme/{dir} | Get a repository README for a directory
[**repos_get_release**](ReposApi.md#repos_get_release) | **GET** /repos/{owner}/{repo}/releases/{release_id} | Get a release
[**repos_get_release_asset**](ReposApi.md#repos_get_release_asset) | **GET** /repos/{owner}/{repo}/releases/assets/{asset_id} | Get a release asset
[**repos_get_release_by_tag**](ReposApi.md#repos_get_release_by_tag) | **GET** /repos/{owner}/{repo}/releases/tags/{tag} | Get a release by tag name
[**repos_get_status_checks_protection**](ReposApi.md#repos_get_status_checks_protection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Get status checks protection
[**repos_get_teams_with_access_to_protected_branch**](ReposApi.md#repos_get_teams_with_access_to_protected_branch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Get teams with access to the protected branch
[**repos_get_users_with_access_to_protected_branch**](ReposApi.md#repos_get_users_with_access_to_protected_branch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Get users with access to the protected branch
[**repos_get_webhook**](ReposApi.md#repos_get_webhook) | **GET** /repos/{owner}/{repo}/hooks/{hook_id} | Get a repository webhook
[**repos_get_webhook_config_for_repo**](ReposApi.md#repos_get_webhook_config_for_repo) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/config | Get a webhook configuration for a repository
[**repos_get_webhook_delivery**](ReposApi.md#repos_get_webhook_delivery) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id} | Get a delivery for a repository webhook
[**repos_list_autolinks**](ReposApi.md#repos_list_autolinks) | **GET** /repos/{owner}/{repo}/autolinks | List all autolinks of a repository
[**repos_list_branches**](ReposApi.md#repos_list_branches) | **GET** /repos/{owner}/{repo}/branches | List branches
[**repos_list_branches_for_head_commit**](ReposApi.md#repos_list_branches_for_head_commit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head | List branches for HEAD commit
[**repos_list_cache_info**](ReposApi.md#repos_list_cache_info) | **GET** /repos/{owner}/{repo}/replicas/caches | List repository cache replication status
[**repos_list_collaborators**](ReposApi.md#repos_list_collaborators) | **GET** /repos/{owner}/{repo}/collaborators | List repository collaborators
[**repos_list_comments_for_commit**](ReposApi.md#repos_list_comments_for_commit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/comments | List commit comments
[**repos_list_commit_comments_for_repo**](ReposApi.md#repos_list_commit_comments_for_repo) | **GET** /repos/{owner}/{repo}/comments | List commit comments for a repository
[**repos_list_commit_statuses_for_ref**](ReposApi.md#repos_list_commit_statuses_for_ref) | **GET** /repos/{owner}/{repo}/commits/{ref}/statuses | List commit statuses for a reference
[**repos_list_commits**](ReposApi.md#repos_list_commits) | **GET** /repos/{owner}/{repo}/commits | List commits
[**repos_list_contributors**](ReposApi.md#repos_list_contributors) | **GET** /repos/{owner}/{repo}/contributors | List repository contributors
[**repos_list_deploy_keys**](ReposApi.md#repos_list_deploy_keys) | **GET** /repos/{owner}/{repo}/keys | List deploy keys
[**repos_list_deployment_branch_policies**](ReposApi.md#repos_list_deployment_branch_policies) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies | List deployment branch policies
[**repos_list_deployment_statuses**](ReposApi.md#repos_list_deployment_statuses) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses | List deployment statuses
[**repos_list_deployments**](ReposApi.md#repos_list_deployments) | **GET** /repos/{owner}/{repo}/deployments | List deployments
[**repos_list_for_authenticated_user**](ReposApi.md#repos_list_for_authenticated_user) | **GET** /user/repos | List repositories for the authenticated user
[**repos_list_for_org**](ReposApi.md#repos_list_for_org) | **GET** /orgs/{org}/repos | List organization repositories
[**repos_list_for_user**](ReposApi.md#repos_list_for_user) | **GET** /users/{username}/repos | List repositories for a user
[**repos_list_forks**](ReposApi.md#repos_list_forks) | **GET** /repos/{owner}/{repo}/forks | List forks
[**repos_list_invitations**](ReposApi.md#repos_list_invitations) | **GET** /repos/{owner}/{repo}/invitations | List repository invitations
[**repos_list_invitations_for_authenticated_user**](ReposApi.md#repos_list_invitations_for_authenticated_user) | **GET** /user/repository_invitations | List repository invitations for the authenticated user
[**repos_list_languages**](ReposApi.md#repos_list_languages) | **GET** /repos/{owner}/{repo}/languages | List repository languages
[**repos_list_pages_builds**](ReposApi.md#repos_list_pages_builds) | **GET** /repos/{owner}/{repo}/pages/builds | List GitHub Enterprise Server Pages builds
[**repos_list_public**](ReposApi.md#repos_list_public) | **GET** /repositories | List public repositories
[**repos_list_pull_requests_associated_with_commit**](ReposApi.md#repos_list_pull_requests_associated_with_commit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/pulls | List pull requests associated with a commit
[**repos_list_release_assets**](ReposApi.md#repos_list_release_assets) | **GET** /repos/{owner}/{repo}/releases/{release_id}/assets | List release assets
[**repos_list_releases**](ReposApi.md#repos_list_releases) | **GET** /repos/{owner}/{repo}/releases | List releases
[**repos_list_tags**](ReposApi.md#repos_list_tags) | **GET** /repos/{owner}/{repo}/tags | List repository tags
[**repos_list_teams**](ReposApi.md#repos_list_teams) | **GET** /repos/{owner}/{repo}/teams | List repository teams
[**repos_list_webhook_deliveries**](ReposApi.md#repos_list_webhook_deliveries) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries | List deliveries for a repository webhook
[**repos_list_webhooks**](ReposApi.md#repos_list_webhooks) | **GET** /repos/{owner}/{repo}/hooks | List repository webhooks
[**repos_merge**](ReposApi.md#repos_merge) | **POST** /repos/{owner}/{repo}/merges | Merge a branch
[**repos_merge_upstream**](ReposApi.md#repos_merge_upstream) | **POST** /repos/{owner}/{repo}/merge-upstream | Sync a fork branch with the upstream repository
[**repos_ping_webhook**](ReposApi.md#repos_ping_webhook) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/pings | Ping a repository webhook
[**repos_redeliver_webhook_delivery**](ReposApi.md#repos_redeliver_webhook_delivery) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}/attempts | Redeliver a delivery for a repository webhook
[**repos_remove_app_access_restrictions**](ReposApi.md#repos_remove_app_access_restrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Remove app access restrictions
[**repos_remove_collaborator**](ReposApi.md#repos_remove_collaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{username} | Remove a repository collaborator
[**repos_remove_status_check_contexts**](ReposApi.md#repos_remove_status_check_contexts) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Remove status check contexts
[**repos_remove_status_check_protection**](ReposApi.md#repos_remove_status_check_protection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Remove status check protection
[**repos_remove_team_access_restrictions**](ReposApi.md#repos_remove_team_access_restrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Remove team access restrictions
[**repos_remove_user_access_restrictions**](ReposApi.md#repos_remove_user_access_restrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Remove user access restrictions
[**repos_rename_branch**](ReposApi.md#repos_rename_branch) | **POST** /repos/{owner}/{repo}/branches/{branch}/rename | Rename a branch
[**repos_replace_all_topics**](ReposApi.md#repos_replace_all_topics) | **PUT** /repos/{owner}/{repo}/topics | Replace all repository topics
[**repos_request_pages_build**](ReposApi.md#repos_request_pages_build) | **POST** /repos/{owner}/{repo}/pages/builds | Request a GitHub Enterprise Server Pages build
[**repos_set_admin_branch_protection**](ReposApi.md#repos_set_admin_branch_protection) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Set admin branch protection
[**repos_set_app_access_restrictions**](ReposApi.md#repos_set_app_access_restrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Set app access restrictions
[**repos_set_status_check_contexts**](ReposApi.md#repos_set_status_check_contexts) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Set status check contexts
[**repos_set_team_access_restrictions**](ReposApi.md#repos_set_team_access_restrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Set team access restrictions
[**repos_set_user_access_restrictions**](ReposApi.md#repos_set_user_access_restrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Set user access restrictions
[**repos_test_push_webhook**](ReposApi.md#repos_test_push_webhook) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/tests | Test the push repository webhook
[**repos_transfer**](ReposApi.md#repos_transfer) | **POST** /repos/{owner}/{repo}/transfer | Transfer a repository
[**repos_update**](ReposApi.md#repos_update) | **PATCH** /repos/{owner}/{repo} | Update a repository
[**repos_update_branch_protection**](ReposApi.md#repos_update_branch_protection) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection | Update branch protection
[**repos_update_commit_comment**](ReposApi.md#repos_update_commit_comment) | **PATCH** /repos/{owner}/{repo}/comments/{comment_id} | Update a commit comment
[**repos_update_deployment_branch_policy**](ReposApi.md#repos_update_deployment_branch_policy) | **PUT** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Update a deployment branch policy
[**repos_update_information_about_pages_site**](ReposApi.md#repos_update_information_about_pages_site) | **PUT** /repos/{owner}/{repo}/pages | Update information about a GitHub Enterprise Server Pages site
[**repos_update_invitation**](ReposApi.md#repos_update_invitation) | **PATCH** /repos/{owner}/{repo}/invitations/{invitation_id} | Update a repository invitation
[**repos_update_pull_request_review_protection**](ReposApi.md#repos_update_pull_request_review_protection) | **PATCH** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Update pull request review protection
[**repos_update_release**](ReposApi.md#repos_update_release) | **PATCH** /repos/{owner}/{repo}/releases/{release_id} | Update a release
[**repos_update_release_asset**](ReposApi.md#repos_update_release_asset) | **PATCH** /repos/{owner}/{repo}/releases/assets/{asset_id} | Update a release asset
[**repos_update_status_check_protection**](ReposApi.md#repos_update_status_check_protection) | **PATCH** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Update status check protection
[**repos_update_webhook**](ReposApi.md#repos_update_webhook) | **PATCH** /repos/{owner}/{repo}/hooks/{hook_id} | Update a repository webhook
[**repos_update_webhook_config_for_repo**](ReposApi.md#repos_update_webhook_config_for_repo) | **PATCH** /repos/{owner}/{repo}/hooks/{hook_id}/config | Update a webhook configuration for a repository
[**repos_upload_release_asset**](ReposApi.md#repos_upload_release_asset) | **POST** /repos/{owner}/{repo}/releases/{release_id}/assets | Upload a release asset


# **repos_accept_invitation_for_authenticated_user**
> repos_accept_invitation_for_authenticated_user(invitation_id)

Accept a repository invitation



### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    invitation_id = 56 # int | The unique identifier of the invitation.

    try:
        # Accept a repository invitation
        api_instance.repos_accept_invitation_for_authenticated_user(invitation_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_accept_invitation_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitation_id** | **int**| The unique identifier of the invitation. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**304** | Not modified |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_add_app_access_restrictions**
> List[Integration] repos_add_app_access_restrictions(owner, repo, branch, repos_set_app_access_restrictions_request=repos_set_app_access_restrictions_request)

Add app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified apps push access for this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.

### Example


```python
import openapi_client
from openapi_client.models.integration import Integration
from openapi_client.models.repos_set_app_access_restrictions_request import ReposSetAppAccessRestrictionsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_set_app_access_restrictions_request = {"apps":["octoapp"]} # ReposSetAppAccessRestrictionsRequest |  (optional)

    try:
        # Add app access restrictions
        api_response = api_instance.repos_add_app_access_restrictions(owner, repo, branch, repos_set_app_access_restrictions_request=repos_set_app_access_restrictions_request)
        print("The response of ReposApi->repos_add_app_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_add_app_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_set_app_access_restrictions_request** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional] 

### Return type

[**List[Integration]**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_add_collaborator**
> RepositoryInvitation repos_add_collaborator(owner, repo, username, repos_add_collaborator_request=repos_add_collaborator_request)

Add a repository collaborator

This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.  For more information on permission levels, see \"[Repository permission levels for an organization](https://docs.github.com/enterprise-server@3.4/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)\". There are restrictions on which permissions can be granted to organization members when an organization base role is in place. In this case, the permission being given must be equal to or higher than the org base permission. Otherwise, the request will fail with:  ``` Cannot assign {member} permission of {role name} ```  Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see \"[HTTP verbs](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#http-verbs).\"  The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#invitations).  **Updating an existing collaborator's permission level**  The endpoint can also be used to change the permissions of an existing collaborator without first removing and re-adding the collaborator. To change the permissions, use the same endpoint and pass a different `permission` parameter. The response will be a `204`, with no other indication that the permission level changed.  **Rate limits**  You are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.

### Example


```python
import openapi_client
from openapi_client.models.repos_add_collaborator_request import ReposAddCollaboratorRequest
from openapi_client.models.repository_invitation import RepositoryInvitation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.
    repos_add_collaborator_request = {"permission":"triage"} # ReposAddCollaboratorRequest |  (optional)

    try:
        # Add a repository collaborator
        api_response = api_instance.repos_add_collaborator(owner, repo, username, repos_add_collaborator_request=repos_add_collaborator_request)
        print("The response of ReposApi->repos_add_collaborator:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_add_collaborator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 
 **repos_add_collaborator_request** | [**ReposAddCollaboratorRequest**](ReposAddCollaboratorRequest.md)|  | [optional] 

### Return type

[**RepositoryInvitation**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response when a new invitation is created |  -  |
**204** | Response when: - an existing collaborator is added as a collaborator - an organization member is added as an individual collaborator - an existing team member (whose team is also a repository collaborator) is added as an individual collaborator |  -  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_add_status_check_contexts**
> List[str] repos_add_status_check_contexts(owner, repo, branch, request_body=request_body)

Add status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    request_body = ["continuous-integration/travis-ci","continuous-integration/jenkins"] # List[str] |  (optional)

    try:
        # Add status check contexts
        api_response = api_instance.repos_add_status_check_contexts(owner, repo, branch, request_body=request_body)
        print("The response of ReposApi->repos_add_status_check_contexts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_add_status_check_contexts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **request_body** | [**List[str]**](str.md)|  | [optional] 

### Return type

**List[str]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_add_team_access_restrictions**
> List[Team] repos_add_team_access_restrictions(owner, repo, branch, request_body=request_body)

Add team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified teams push access for this branch. You can also give push access to child teams.

### Example


```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    request_body = ["justice-league"] # List[str] |  (optional)

    try:
        # Add team access restrictions
        api_response = api_instance.repos_add_team_access_restrictions(owner, repo, branch, request_body=request_body)
        print("The response of ReposApi->repos_add_team_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_add_team_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **request_body** | [**List[str]**](str.md)|  | [optional] 

### Return type

[**List[Team]**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_add_user_access_restrictions**
> List[SimpleUser] repos_add_user_access_restrictions(owner, repo, branch, repos_set_user_access_restrictions_request=repos_set_user_access_restrictions_request)

Add user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified people push access for this branch.  | Type    | Description                                                                                                                   | | ------- | ----------------------------------------------------------------------------------------------------------------------------- | | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example


```python
import openapi_client
from openapi_client.models.repos_set_user_access_restrictions_request import ReposSetUserAccessRestrictionsRequest
from openapi_client.models.simple_user import SimpleUser
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_set_user_access_restrictions_request = {"users":["octocat"]} # ReposSetUserAccessRestrictionsRequest |  (optional)

    try:
        # Add user access restrictions
        api_response = api_instance.repos_add_user_access_restrictions(owner, repo, branch, repos_set_user_access_restrictions_request=repos_set_user_access_restrictions_request)
        print("The response of ReposApi->repos_add_user_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_add_user_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_set_user_access_restrictions_request** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional] 

### Return type

[**List[SimpleUser]**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_check_collaborator**
> repos_check_collaborator(owner, repo, username)

Check if a user is a repository collaborator

For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.  Team members will include the members of child teams.  You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Check if a user is a repository collaborator
        api_instance.repos_check_collaborator(owner, repo, username)
    except Exception as e:
        print("Exception when calling ReposApi->repos_check_collaborator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response if user is a collaborator |  -  |
**404** | Not Found if user is not a collaborator |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_compare_commits**
> CommitComparison repos_compare_commits(owner, repo, basehead, page=page, per_page=per_page)

Compare two commits

Compares two commits against one another. You can compare branches in the same repository, or you can compare branches that exist in different repositories within the same repository network, including fork branches. For more information about how to view a repository's network, see \"[Understanding connections between repositories](https://docs.github.com/enterprise-server@3.4/repositories/viewing-activity-and-data-for-your-repository/understanding-connections-between-repositories).\"  This endpoint is equivalent to running the `git log BASE...HEAD` command, but it returns commits in a different order. The `git log BASE...HEAD` command returns commits in reverse chronological order, whereas the API returns commits in chronological order. You can pass the appropriate [media type](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.  The API response includes details about the files that were changed between the two commits. This includes the status of the change (if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.  When calling this endpoint without any paging parameter (`per_page` or `page`), the returned list is limited to 250 commits, and the last commit in the list is the most recent of the entire comparison.  **Working with large comparisons**  To process a response with a large number of commits, use a query parameter (`per_page` or `page`) to paginate the results. When using pagination:  - The list of changed files is only shown on the first page of results, but it includes all changed files for the entire comparison. - The results are returned in chronological order, but the last commit in the returned list may not be the most recent one in the entire set if there are more pages of results.  For more information on working with pagination, see \"[Using pagination in the REST API](https://docs.github.com/enterprise-server@3.4/rest/guides/using-pagination-in-the-rest-api).\"  **Signature verification object**  The response will include a `verification` object that describes the result of verifying the commit's signature. The `verification` object includes the following fields:  | Name | Type | Description | | ---- | ---- | ----------- | | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. | | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. | | `signature` | `string` | The signature that was extracted from the commit. | | `payload` | `string` | The value that was signed. |  These are the possible values for `reason` in the `verification` object:  | Value | Description | | ----- | ----------- | | `expired_key` | The key that made the signature is expired. | | `not_signing_key` | The \"signing\" flag is not among the usage flags in the GPG key that made the signature. | | `gpgverify_error` | There was an error communicating with the signature verification service. | | `gpgverify_unavailable` | The signature verification service is currently unavailable. | | `unsigned` | The object does not include a signature. | | `unknown_signature_type` | A non-PGP signature was found in the commit. | | `no_user` | No user was associated with the `committer` email address in the commit. | | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. | | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. | | `unknown_key` | The key that made the signature has not been registered with any user's account. | | `malformed_signature` | There was an error parsing the signature. | | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | `valid` | None of the above errors applied, so the signature is considered to be verified. |

### Example


```python
import openapi_client
from openapi_client.models.commit_comparison import CommitComparison
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    basehead = 'basehead_example' # str | The base branch and head branch to compare. This parameter expects the format `BASE...HEAD`. Both must be branch names in `repo`. To compare with a branch that exists in a different repository in the same network as `repo`, the `basehead` parameter expects the format `USERNAME:BASE...USERNAME:HEAD`.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # Compare two commits
        api_response = api_instance.repos_compare_commits(owner, repo, basehead, page=page, per_page=per_page)
        print("The response of ReposApi->repos_compare_commits:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_compare_commits: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **basehead** | **str**| The base branch and head branch to compare. This parameter expects the format &#x60;BASE...HEAD&#x60;. Both must be branch names in &#x60;repo&#x60;. To compare with a branch that exists in a different repository in the same network as &#x60;repo&#x60;, the &#x60;basehead&#x60; parameter expects the format &#x60;USERNAME:BASE...USERNAME:HEAD&#x60;. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**CommitComparison**](CommitComparison.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**500** | Internal Error |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_autolink**
> Autolink repos_create_autolink(owner, repo, repos_create_autolink_request)

Create an autolink reference for a repository

Users with admin access to the repository can create an autolink.

### Example


```python
import openapi_client
from openapi_client.models.autolink import Autolink
from openapi_client.models.repos_create_autolink_request import ReposCreateAutolinkRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_autolink_request = {"is_alphanumeric":true,"key_prefix":"TICKET-","url_template":"https://example.com/TICKET?query=<num>"} # ReposCreateAutolinkRequest | 

    try:
        # Create an autolink reference for a repository
        api_response = api_instance.repos_create_autolink(owner, repo, repos_create_autolink_request)
        print("The response of ReposApi->repos_create_autolink:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_autolink: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_autolink_request** | [**ReposCreateAutolinkRequest**](ReposCreateAutolinkRequest.md)|  | 

### Return type

[**Autolink**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | response |  * Location -  <br>  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_commit_comment**
> CommitComment repos_create_commit_comment(owner, repo, commit_sha, repos_create_commit_comment_request)

Create a commit comment

Create a comment for a commit using its `:commit_sha`.  This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.commit_comment import CommitComment
from openapi_client.models.repos_create_commit_comment_request import ReposCreateCommitCommentRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    commit_sha = 'commit_sha_example' # str | The SHA of the commit.
    repos_create_commit_comment_request = {"body":"Great stuff","line":1,"path":"file1.txt","position":4} # ReposCreateCommitCommentRequest | 

    try:
        # Create a commit comment
        api_response = api_instance.repos_create_commit_comment(owner, repo, commit_sha, repos_create_commit_comment_request)
        print("The response of ReposApi->repos_create_commit_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_commit_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **commit_sha** | **str**| The SHA of the commit. | 
 **repos_create_commit_comment_request** | [**ReposCreateCommitCommentRequest**](ReposCreateCommitCommentRequest.md)|  | 

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_commit_signature_protection**
> ProtectedBranchAdminEnforced repos_create_commit_signature_protection(owner, repo, branch)

Create commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.

### Example


```python
import openapi_client
from openapi_client.models.protected_branch_admin_enforced import ProtectedBranchAdminEnforced
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Create commit signature protection
        api_response = api_instance.repos_create_commit_signature_protection(owner, repo, branch)
        print("The response of ReposApi->repos_create_commit_signature_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_commit_signature_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_commit_status**
> Status repos_create_commit_status(owner, repo, sha, repos_create_commit_status_request)

Create a commit status

Users with push access in a repository can create commit statuses for a given SHA.  Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.

### Example


```python
import openapi_client
from openapi_client.models.repos_create_commit_status_request import ReposCreateCommitStatusRequest
from openapi_client.models.status import Status
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    sha = 'sha_example' # str | 
    repos_create_commit_status_request = {"context":"continuous-integration/jenkins","description":"The build succeeded!","state":"success","target_url":"https://example.com/build/status"} # ReposCreateCommitStatusRequest | 

    try:
        # Create a commit status
        api_response = api_instance.repos_create_commit_status(owner, repo, sha, repos_create_commit_status_request)
        print("The response of ReposApi->repos_create_commit_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_commit_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **sha** | **str**|  | 
 **repos_create_commit_status_request** | [**ReposCreateCommitStatusRequest**](ReposCreateCommitStatusRequest.md)|  | 

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_deploy_key**
> DeployKey repos_create_deploy_key(owner, repo, repos_create_deploy_key_request)

Create a deploy key

You can create a read-only deploy key.

### Example


```python
import openapi_client
from openapi_client.models.deploy_key import DeployKey
from openapi_client.models.repos_create_deploy_key_request import ReposCreateDeployKeyRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_deploy_key_request = {"key":"ssh-rsa AAA...","read_only":true,"title":"octocat@octomac"} # ReposCreateDeployKeyRequest | 

    try:
        # Create a deploy key
        api_response = api_instance.repos_create_deploy_key(owner, repo, repos_create_deploy_key_request)
        print("The response of ReposApi->repos_create_deploy_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_deploy_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_deploy_key_request** | [**ReposCreateDeployKeyRequest**](ReposCreateDeployKeyRequest.md)|  | 

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_deployment**
> Deployment repos_create_deployment(owner, repo, repos_create_deployment_request)

Create a deployment

Deployments offer a few configurable parameters with certain defaults.  The `ref` parameter can be any named branch, tag, or SHA. At GitHub Enterprise Server we often deploy branches and verify them before we merge a pull request.  The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter makes it easier to track which environments have requested deployments. The default environment is `production`.  The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds, the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will return a failure response.  By default, [commit statuses](https://docs.github.com/enterprise-server@3.4/rest/commits/statuses) for every submitted context must be in a `success` state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do not require any contexts or create any commit statuses, the deployment will always succeed.  The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text field that will be passed on when a deployment event is dispatched.  The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an application with debugging enabled.  Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref.  #### Merged branch response You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating a deployment. This auto-merge happens when: *   Auto-merge option is enabled in the repository *   Topic branch does not include the latest changes on the base branch, which is `master` in the response example *   There are no merge conflicts  If there are no new commits in the base branch, a new request to create a deployment should give a successful response.  #### Merge conflict response This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.  #### Failed commit status checks This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success` status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.

### Example


```python
import openapi_client
from openapi_client.models.deployment import Deployment
from openapi_client.models.repos_create_deployment_request import ReposCreateDeploymentRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_deployment_request = {"auto_merge":false,"description":"Deploy request from hubot","payload":"{ \"deploy\": \"migrate\" }","ref":"topic-branch","required_contexts":["ci/janky","security/brakeman"]} # ReposCreateDeploymentRequest | 

    try:
        # Create a deployment
        api_response = api_instance.repos_create_deployment(owner, repo, repos_create_deployment_request)
        print("The response of ReposApi->repos_create_deployment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_deployment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_deployment_request** | [**ReposCreateDeploymentRequest**](ReposCreateDeploymentRequest.md)|  | 

### Return type

[**Deployment**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**202** | Merged branch response |  -  |
**409** | Conflict when there is a merge conflict or the commit&#39;s status checks failed |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_deployment_branch_policy**
> DeploymentBranchPolicy repos_create_deployment_branch_policy(owner, repo, environment_name, deployment_branch_policy_name_pattern)

Create a deployment branch policy

Creates a deployment branch policy for an environment.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.deployment_branch_policy import DeploymentBranchPolicy
from openapi_client.models.deployment_branch_policy_name_pattern import DeploymentBranchPolicyNamePattern
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.
    deployment_branch_policy_name_pattern = {"name":"main"} # DeploymentBranchPolicyNamePattern | 

    try:
        # Create a deployment branch policy
        api_response = api_instance.repos_create_deployment_branch_policy(owner, repo, environment_name, deployment_branch_policy_name_pattern)
        print("The response of ReposApi->repos_create_deployment_branch_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_deployment_branch_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 
 **deployment_branch_policy_name_pattern** | [**DeploymentBranchPolicyNamePattern**](DeploymentBranchPolicyNamePattern.md)|  | 

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**303** | Response if the same branch name pattern already exists |  -  |
**404** | Not Found or &#x60;deployment_branch_policy.custom_branch_policies&#x60; property for the environment is set to false |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_deployment_status**
> DeploymentStatus repos_create_deployment_status(owner, repo, deployment_id, repos_create_deployment_status_request)

Create a deployment status

Users with `push` access can create deployment statuses for a given deployment.  GitHub Apps require `read & write` access to \"Deployments\" and `read-only` access to \"Repo contents\" (for private repos). OAuth Apps require the `repo_deployment` scope.

### Example


```python
import openapi_client
from openapi_client.models.deployment_status import DeploymentStatus
from openapi_client.models.repos_create_deployment_status_request import ReposCreateDeploymentStatusRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    deployment_id = 56 # int | deployment_id parameter
    repos_create_deployment_status_request = {"description":"Deployment finished successfully.","environment":"production","log_url":"https://example.com/deployment/42/output","state":"success"} # ReposCreateDeploymentStatusRequest | 

    try:
        # Create a deployment status
        api_response = api_instance.repos_create_deployment_status(owner, repo, deployment_id, repos_create_deployment_status_request)
        print("The response of ReposApi->repos_create_deployment_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_deployment_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **deployment_id** | **int**| deployment_id parameter | 
 **repos_create_deployment_status_request** | [**ReposCreateDeploymentStatusRequest**](ReposCreateDeploymentStatusRequest.md)|  | 

### Return type

[**DeploymentStatus**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_dispatch_event**
> repos_create_dispatch_event(owner, repo, repos_create_dispatch_event_request)

Create a repository dispatch event

You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub Enterprise Server to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see \"[RepositoryDispatchEvent](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads/#repository_dispatch).\"  The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow.  This endpoint requires write access to the repository by providing either:    - Personal access tokens with `repo` scope. For more information, see \"[Creating a personal access token for the command line](https://docs.github.com/enterprise-server@3.4/articles/creating-a-personal-access-token-for-the-command-line)\" in the GitHub Help documentation.   - GitHub Apps with both `metadata:read` and `contents:read&write` permissions.  This input example shows how you can use the `client_payload` as a test to debug your workflow.

### Example


```python
import openapi_client
from openapi_client.models.repos_create_dispatch_event_request import ReposCreateDispatchEventRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_dispatch_event_request = {"client_payload":{"integration":true,"unit":false},"event_type":"on-demand-test"} # ReposCreateDispatchEventRequest | 

    try:
        # Create a repository dispatch event
        api_instance.repos_create_dispatch_event(owner, repo, repos_create_dispatch_event_request)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_dispatch_event: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_dispatch_event_request** | [**ReposCreateDispatchEventRequest**](ReposCreateDispatchEventRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_for_authenticated_user**
> Repository repos_create_for_authenticated_user(repos_create_for_authenticated_user_request)

Create a repository for the authenticated user

Creates a new repository for the authenticated user.  **OAuth scope requirements**  When using [OAuth](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:  *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository. *   `repo` scope to create a private repository.

### Example


```python
import openapi_client
from openapi_client.models.repos_create_for_authenticated_user_request import ReposCreateForAuthenticatedUserRequest
from openapi_client.models.repository import Repository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    repos_create_for_authenticated_user_request = {"description":"This is your first repo!","homepage":"https://github.com","is_template":true,"name":"Hello-World","private":false} # ReposCreateForAuthenticatedUserRequest | 

    try:
        # Create a repository for the authenticated user
        api_response = api_instance.repos_create_for_authenticated_user(repos_create_for_authenticated_user_request)
        print("The response of ReposApi->repos_create_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repos_create_for_authenticated_user_request** | [**ReposCreateForAuthenticatedUserRequest**](ReposCreateForAuthenticatedUserRequest.md)|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**304** | Not modified |  -  |
**400** | Bad Request |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_fork**
> FullRepository repos_create_fork(owner, repo, repos_create_fork_request=repos_create_fork_request)

Create a fork

Create a fork for the authenticated user.  **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Enterprise Server Support](https://support.github.com/contact?tags=dotcom-rest-api).

### Example


```python
import openapi_client
from openapi_client.models.full_repository import FullRepository
from openapi_client.models.repos_create_fork_request import ReposCreateForkRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_fork_request = {"default_branch_only":true,"name":"Hello-World","organization":"octocat"} # ReposCreateForkRequest |  (optional)

    try:
        # Create a fork
        api_response = api_instance.repos_create_fork(owner, repo, repos_create_fork_request=repos_create_fork_request)
        print("The response of ReposApi->repos_create_fork:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_fork: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_fork_request** | [**ReposCreateForkRequest**](ReposCreateForkRequest.md)|  | [optional] 

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Response |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_in_org**
> Repository repos_create_in_org(org, repos_create_in_org_request)

Create an organization repository

Creates a new repository in the specified organization. The authenticated user must be a member of the organization.  **OAuth scope requirements**  When using [OAuth](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:  *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository. *   `repo` scope to create a private repository

### Example


```python
import openapi_client
from openapi_client.models.repos_create_in_org_request import ReposCreateInOrgRequest
from openapi_client.models.repository import Repository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    repos_create_in_org_request = {"description":"This is your first repository","has_issues":true,"has_projects":true,"has_wiki":true,"homepage":"https://github.com","name":"Hello-World","private":false} # ReposCreateInOrgRequest | 

    try:
        # Create an organization repository
        api_response = api_instance.repos_create_in_org(org, repos_create_in_org_request)
        print("The response of ReposApi->repos_create_in_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_in_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **repos_create_in_org_request** | [**ReposCreateInOrgRequest**](ReposCreateInOrgRequest.md)|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_or_update_environment**
> Environment repos_create_or_update_environment(owner, repo, environment_name, repos_create_or_update_environment_request=repos_create_or_update_environment_request)

Create or update an environment

Create or update an environment with protection rules, such as required reviewers. For more information about environment protection rules, see \"[Environments](/actions/reference/environments#environment-protection-rules).\"  **Note:** To create or update name patterns that branches must match in order to deploy to this environment, see \"[Deployment branch policies](/rest/deployments/branch-policies).\"  **Note:** To create or update secrets for an environment, see \"[Secrets](/rest/reference/actions#secrets).\"  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.environment import Environment
from openapi_client.models.repos_create_or_update_environment_request import ReposCreateOrUpdateEnvironmentRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.
    repos_create_or_update_environment_request = {"deployment_branch_policy":{"custom_branch_policies":true,"protected_branches":false},"reviewers":[{"id":1,"type":"User"},{"id":1,"type":"Team"}],"wait_timer":30} # ReposCreateOrUpdateEnvironmentRequest |  (optional)

    try:
        # Create or update an environment
        api_response = api_instance.repos_create_or_update_environment(owner, repo, environment_name, repos_create_or_update_environment_request=repos_create_or_update_environment_request)
        print("The response of ReposApi->repos_create_or_update_environment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_or_update_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 
 **repos_create_or_update_environment_request** | [**ReposCreateOrUpdateEnvironmentRequest**](ReposCreateOrUpdateEnvironmentRequest.md)|  | [optional] 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation error when the environment name is invalid or when &#x60;protected_branches&#x60; and &#x60;custom_branch_policies&#x60; in &#x60;deployment_branch_policy&#x60; are set to the same value |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_or_update_file_contents**
> FileCommit repos_create_or_update_file_contents(owner, repo, path, repos_create_or_update_file_contents_request)

Create or update file contents

Creates a new file or replaces an existing file in a repository. You must authenticate using an access token with the `workflow` scope to use this endpoint.  **Note:** If you use this endpoint and the \"[Delete a file](https://docs.github.com/enterprise-server@3.4/rest/reference/repos/#delete-file)\" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.

### Example


```python
import openapi_client
from openapi_client.models.file_commit import FileCommit
from openapi_client.models.repos_create_or_update_file_contents_request import ReposCreateOrUpdateFileContentsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    path = 'path_example' # str | path parameter
    repos_create_or_update_file_contents_request = {"committer":{"email":"octocat@github.com","name":"Monalisa Octocat"},"content":"bXkgbmV3IGZpbGUgY29udGVudHM=","message":"my commit message"} # ReposCreateOrUpdateFileContentsRequest | 

    try:
        # Create or update file contents
        api_response = api_instance.repos_create_or_update_file_contents(owner, repo, path, repos_create_or_update_file_contents_request)
        print("The response of ReposApi->repos_create_or_update_file_contents:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_or_update_file_contents: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **path** | **str**| path parameter | 
 **repos_create_or_update_file_contents_request** | [**ReposCreateOrUpdateFileContentsRequest**](ReposCreateOrUpdateFileContentsRequest.md)|  | 

### Return type

[**FileCommit**](FileCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**201** | Response |  -  |
**404** | Resource not found |  -  |
**409** | Conflict |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_pages_site**
> Page repos_create_pages_site(owner, repo, repos_create_pages_site_request)

Create a GitHub Enterprise Server Pages site

Configures a GitHub Enterprise Server Pages site. For more information, see \"[About GitHub Pages](/github/working-with-github-pages/about-github-pages).\"  To use this endpoint, you must be a repository administrator, maintainer, or have the 'manage GitHub Pages settings' permission. A token with the `repo` scope or Pages write permission is required. GitHub Apps must have the `administration:write` and `pages:write` permissions.

### Example


```python
import openapi_client
from openapi_client.models.page import Page
from openapi_client.models.repos_create_pages_site_request import ReposCreatePagesSiteRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_pages_site_request = {"source":{"branch":"main","path":"/docs"}} # ReposCreatePagesSiteRequest | 

    try:
        # Create a GitHub Enterprise Server Pages site
        api_response = api_instance.repos_create_pages_site(owner, repo, repos_create_pages_site_request)
        print("The response of ReposApi->repos_create_pages_site:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_pages_site: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_pages_site_request** | [**ReposCreatePagesSiteRequest**](ReposCreatePagesSiteRequest.md)|  | 

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**409** | Conflict |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_release**
> Release repos_create_release(owner, repo, repos_create_release_request)

Create a release

Users with push access to the repository can create a release.  This endpoint triggers [notifications](https://docs.github.com/enterprise-server@3.4/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See \"[Secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#secondary-rate-limits)\" and \"[Dealing with secondary rate limits](https://docs.github.com/enterprise-server@3.4/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)\" for details.

### Example


```python
import openapi_client
from openapi_client.models.release import Release
from openapi_client.models.repos_create_release_request import ReposCreateReleaseRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_release_request = {"body":"Description of the release","draft":false,"generate_release_notes":false,"name":"v1.0.0","prerelease":false,"tag_name":"v1.0.0","target_commitish":"master"} # ReposCreateReleaseRequest | 

    try:
        # Create a release
        api_response = api_instance.repos_create_release(owner, repo, repos_create_release_request)
        print("The response of ReposApi->repos_create_release:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_release: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_release_request** | [**ReposCreateReleaseRequest**](ReposCreateReleaseRequest.md)|  | 

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_using_template**
> Repository repos_create_using_template(template_owner, template_repo, repos_create_using_template_request)

Create a repository using a template

Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. If the repository is not public, the authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [Get a repository](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#get-a-repository) endpoint and check that the `is_template` key is `true`.  **OAuth scope requirements**  When using [OAuth](https://docs.github.com/enterprise-server@3.4/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:  *   `public_repo` scope or `repo` scope to create a public repository. Note: For GitHub AE, use `repo` scope to create an internal repository. *   `repo` scope to create a private repository

### Example


```python
import openapi_client
from openapi_client.models.repos_create_using_template_request import ReposCreateUsingTemplateRequest
from openapi_client.models.repository import Repository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    template_owner = 'template_owner_example' # str | 
    template_repo = 'template_repo_example' # str | 
    repos_create_using_template_request = {"description":"This is your first repository","include_all_branches":false,"name":"Hello-World","owner":"octocat","private":false} # ReposCreateUsingTemplateRequest | 

    try:
        # Create a repository using a template
        api_response = api_instance.repos_create_using_template(template_owner, template_repo, repos_create_using_template_request)
        print("The response of ReposApi->repos_create_using_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_using_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_owner** | **str**|  | 
 **template_repo** | **str**|  | 
 **repos_create_using_template_request** | [**ReposCreateUsingTemplateRequest**](ReposCreateUsingTemplateRequest.md)|  | 

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_create_webhook**
> Hook repos_create_webhook(owner, repo, repos_create_webhook_request=repos_create_webhook_request)

Create a repository webhook

Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can share the same `config` as long as those webhooks do not have any `events` that overlap.

### Example


```python
import openapi_client
from openapi_client.models.hook import Hook
from openapi_client.models.repos_create_webhook_request import ReposCreateWebhookRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_create_webhook_request = {"active":true,"config":{"content_type":"json","insecure_ssl":"0","url":"https://example.com/webhook"},"events":["push","pull_request"],"name":"web"} # ReposCreateWebhookRequest |  (optional)

    try:
        # Create a repository webhook
        api_response = api_instance.repos_create_webhook(owner, repo, repos_create_webhook_request=repos_create_webhook_request)
        print("The response of ReposApi->repos_create_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_create_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_create_webhook_request** | [**ReposCreateWebhookRequest**](ReposCreateWebhookRequest.md)|  | [optional] 

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  * Location -  <br>  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_decline_invitation_for_authenticated_user**
> repos_decline_invitation_for_authenticated_user(invitation_id)

Decline a repository invitation



### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    invitation_id = 56 # int | The unique identifier of the invitation.

    try:
        # Decline a repository invitation
        api_instance.repos_decline_invitation_for_authenticated_user(invitation_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_decline_invitation_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitation_id** | **int**| The unique identifier of the invitation. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**304** | Not modified |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete**
> repos_delete(owner, repo)

Delete a repository

Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.  If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, you will get a `403 Forbidden` response.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Delete a repository
        api_instance.repos_delete(owner, repo)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**307** | Temporary Redirect |  -  |
**403** | If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response: |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_access_restrictions**
> repos_delete_access_restrictions(owner, repo, branch)

Delete access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Disables the ability to restrict who can push to this branch.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Delete access restrictions
        api_instance.repos_delete_access_restrictions(owner, repo, branch)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_admin_branch_protection**
> repos_delete_admin_branch_protection(owner, repo, branch)

Delete admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Delete admin branch protection
        api_instance.repos_delete_admin_branch_protection(owner, repo, branch)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_admin_branch_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_an_environment**
> repos_delete_an_environment(owner, repo, environment_name)

Delete an environment

You must authenticate using an access token with the repo scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.

    try:
        # Delete an environment
        api_instance.repos_delete_an_environment(owner, repo, environment_name)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_an_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_autolink**
> repos_delete_autolink(owner, repo, autolink_id)

Delete an autolink reference from a repository

This deletes a single autolink reference by ID that was configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    autolink_id = 56 # int | The unique identifier of the autolink.

    try:
        # Delete an autolink reference from a repository
        api_instance.repos_delete_autolink(owner, repo, autolink_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_autolink: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **autolink_id** | **int**| The unique identifier of the autolink. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_branch_protection**
> repos_delete_branch_protection(owner, repo, branch)

Delete branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Delete branch protection
        api_instance.repos_delete_branch_protection(owner, repo, branch)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_branch_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_commit_comment**
> repos_delete_commit_comment(owner, repo, comment_id)

Delete a commit comment



### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.

    try:
        # Delete a commit comment
        api_instance.repos_delete_commit_comment(owner, repo, comment_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_commit_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_commit_signature_protection**
> repos_delete_commit_signature_protection(owner, repo, branch)

Delete commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Delete commit signature protection
        api_instance.repos_delete_commit_signature_protection(owner, repo, branch)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_commit_signature_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_deploy_key**
> repos_delete_deploy_key(owner, repo, key_id)

Delete a deploy key

Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    key_id = 56 # int | The unique identifier of the key.

    try:
        # Delete a deploy key
        api_instance.repos_delete_deploy_key(owner, repo, key_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_deploy_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **key_id** | **int**| The unique identifier of the key. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_deployment**
> repos_delete_deployment(owner, repo, deployment_id)

Delete a deployment

If the repository only has one deployment, you can delete the deployment regardless of its status. If the repository has more than one deployment, you can only delete inactive deployments. This ensures that repositories with multiple deployments will always have an active deployment. Anyone with `repo` or `repo_deployment` scopes can delete a deployment.  To set a deployment as inactive, you must:  *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment. *   Mark the active deployment as inactive by adding any non-successful deployment status.  For more information, see \"[Create a deployment](https://docs.github.com/enterprise-server@3.4/rest/deployments/deployments/#create-a-deployment)\" and \"[Create a deployment status](https://docs.github.com/enterprise-server@3.4/rest/deployments/deployment-statuses#create-a-deployment-status).\"

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    deployment_id = 56 # int | deployment_id parameter

    try:
        # Delete a deployment
        api_instance.repos_delete_deployment(owner, repo, deployment_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_deployment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **deployment_id** | **int**| deployment_id parameter | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_deployment_branch_policy**
> repos_delete_deployment_branch_policy(owner, repo, environment_name, branch_policy_id)

Delete a deployment branch policy

Deletes a deployment branch policy for an environment.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.
    branch_policy_id = 56 # int | The unique identifier of the branch policy.

    try:
        # Delete a deployment branch policy
        api_instance.repos_delete_deployment_branch_policy(owner, repo, environment_name, branch_policy_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_deployment_branch_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 
 **branch_policy_id** | **int**| The unique identifier of the branch policy. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_file**
> FileCommit repos_delete_file(owner, repo, path, repos_delete_file_request)

Delete a file

Deletes a file in a repository.  You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.  The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.  You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.  **Note:** If you use this endpoint and the \"[Create or update file contents](https://docs.github.com/enterprise-server@3.4/rest/reference/repos/#create-or-update-file-contents)\" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.

### Example


```python
import openapi_client
from openapi_client.models.file_commit import FileCommit
from openapi_client.models.repos_delete_file_request import ReposDeleteFileRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    path = 'path_example' # str | path parameter
    repos_delete_file_request = {"committer":{"email":"octocat@github.com","name":"Monalisa Octocat"},"message":"my commit message","sha":"329688480d39049927147c162b9d2deaf885005f"} # ReposDeleteFileRequest | 

    try:
        # Delete a file
        api_response = api_instance.repos_delete_file(owner, repo, path, repos_delete_file_request)
        print("The response of ReposApi->repos_delete_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **path** | **str**| path parameter | 
 **repos_delete_file_request** | [**ReposDeleteFileRequest**](ReposDeleteFileRequest.md)|  | 

### Return type

[**FileCommit**](FileCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**409** | Conflict |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_invitation**
> repos_delete_invitation(owner, repo, invitation_id)

Delete a repository invitation



### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    invitation_id = 56 # int | The unique identifier of the invitation.

    try:
        # Delete a repository invitation
        api_instance.repos_delete_invitation(owner, repo, invitation_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_invitation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **invitation_id** | **int**| The unique identifier of the invitation. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_pages_site**
> repos_delete_pages_site(owner, repo)

Delete a GitHub Enterprise Server Pages site

Deletes a GitHub Enterprise Server Pages site. For more information, see \"[About GitHub Pages](/github/working-with-github-pages/about-github-pages).  To use this endpoint, you must be a repository administrator, maintainer, or have the 'manage GitHub Pages settings' permission. A token with the `repo` scope or Pages write permission is required. GitHub Apps must have the `administration:write` and `pages:write` permissions.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Delete a GitHub Enterprise Server Pages site
        api_instance.repos_delete_pages_site(owner, repo)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_pages_site: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |
**409** | Conflict |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_pull_request_review_protection**
> repos_delete_pull_request_review_protection(owner, repo, branch)

Delete pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Delete pull request review protection
        api_instance.repos_delete_pull_request_review_protection(owner, repo, branch)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_pull_request_review_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_release**
> repos_delete_release(owner, repo, release_id)

Delete a release

Users with push access to the repository can delete a release.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    release_id = 56 # int | The unique identifier of the release.

    try:
        # Delete a release
        api_instance.repos_delete_release(owner, repo, release_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_release: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **release_id** | **int**| The unique identifier of the release. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_release_asset**
> repos_delete_release_asset(owner, repo, asset_id)

Delete a release asset



### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    asset_id = 56 # int | The unique identifier of the asset.

    try:
        # Delete a release asset
        api_instance.repos_delete_release_asset(owner, repo, asset_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_release_asset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **asset_id** | **int**| The unique identifier of the asset. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_delete_webhook**
> repos_delete_webhook(owner, repo, hook_id)

Delete a repository webhook



### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Delete a repository webhook
        api_instance.repos_delete_webhook(owner, repo, hook_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_delete_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_disable_lfs_for_repo**
> repos_disable_lfs_for_repo(owner, repo)

Disable Git LFS for a repository

Disables Git LFS for a repository. Access tokens must have the `admin:enterprise` scope.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Disable Git LFS for a repository
        api_instance.repos_disable_lfs_for_repo(owner, repo)
    except Exception as e:
        print("Exception when calling ReposApi->repos_disable_lfs_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_download_tarball_archive**
> repos_download_tarball_archive(owner, repo, ref)

Download a repository archive (tar)

Gets a redirect URL to download a tar archive for a repository. If you omit `:ref`, the repository’s default branch (usually `main`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the `Location` header to make a second `GET` request. **Note**: For private repositories, these links are temporary and expire after five minutes.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    ref = 'ref_example' # str | 

    try:
        # Download a repository archive (tar)
        api_instance.repos_download_tarball_archive(owner, repo, ref)
    except Exception as e:
        print("Exception when calling ReposApi->repos_download_tarball_archive: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **ref** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**302** | Response |  * Location -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_download_zipball_archive**
> repos_download_zipball_archive(owner, repo, ref)

Download a repository archive (zip)

Gets a redirect URL to download a zip archive for a repository. If you omit `:ref`, the repository’s default branch (usually `main`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the `Location` header to make a second `GET` request.  **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    ref = 'ref_example' # str | 

    try:
        # Download a repository archive (zip)
        api_instance.repos_download_zipball_archive(owner, repo, ref)
    except Exception as e:
        print("Exception when calling ReposApi->repos_download_zipball_archive: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **ref** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**302** | Response |  * Location -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_enable_lfs_for_repo**
> object repos_enable_lfs_for_repo(owner, repo)

Enable Git LFS for a repository

Enables Git LFS for a repository. Access tokens must have the `admin:enterprise` scope.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Enable Git LFS for a repository
        api_response = api_instance.repos_enable_lfs_for_repo(owner, repo)
        print("The response of ReposApi->repos_enable_lfs_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_enable_lfs_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |
**403** | We will return a 403 with one of the following messages:  - Git LFS support not enabled because Git LFS is globally disabled. - Git LFS support not enabled because Git LFS is disabled for the root repository in the network. - Git LFS support not enabled because Git LFS is disabled for &lt;owner&gt;. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_generate_release_notes**
> ReleaseNotesContent repos_generate_release_notes(owner, repo, repos_generate_release_notes_request)

Generate release notes content for a release

Generate a name and body describing a [release](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#releases). The body content will be markdown formatted and contain information like the changes since last release and users who contributed. The generated release notes are not saved anywhere. They are intended to be generated and used when creating a new release.

### Example


```python
import openapi_client
from openapi_client.models.release_notes_content import ReleaseNotesContent
from openapi_client.models.repos_generate_release_notes_request import ReposGenerateReleaseNotesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_generate_release_notes_request = {"configuration_file_path":".github/custom_release_config.yml","previous_tag_name":"v0.9.2","tag_name":"v1.0.0","target_commitish":"main"} # ReposGenerateReleaseNotesRequest | 

    try:
        # Generate release notes content for a release
        api_response = api_instance.repos_generate_release_notes(owner, repo, repos_generate_release_notes_request)
        print("The response of ReposApi->repos_generate_release_notes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_generate_release_notes: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_generate_release_notes_request** | [**ReposGenerateReleaseNotesRequest**](ReposGenerateReleaseNotesRequest.md)|  | 

### Return type

[**ReleaseNotesContent**](ReleaseNotesContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Name and body of generated release notes |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get**
> FullRepository repos_get(owner, repo)

Get a repository

The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.  **Note:** In order to see the `security_and_analysis` block for a repository you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \"[Managing security managers in your organization](https://docs.github.com/enterprise-server@3.4/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\"

### Example


```python
import openapi_client
from openapi_client.models.full_repository import FullRepository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get a repository
        api_response = api_instance.repos_get(owner, repo)
        print("The response of ReposApi->repos_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**301** | Moved permanently |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_access_restrictions**
> BranchRestrictionPolicy repos_get_access_restrictions(owner, repo, branch)

Get access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists who has access to this protected branch.  **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.

### Example


```python
import openapi_client
from openapi_client.models.branch_restriction_policy import BranchRestrictionPolicy
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get access restrictions
        api_response = api_instance.repos_get_access_restrictions(owner, repo, branch)
        print("The response of ReposApi->repos_get_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**BranchRestrictionPolicy**](BranchRestrictionPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_admin_branch_protection**
> ProtectedBranchAdminEnforced repos_get_admin_branch_protection(owner, repo, branch)

Get admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.models.protected_branch_admin_enforced import ProtectedBranchAdminEnforced
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get admin branch protection
        api_response = api_instance.repos_get_admin_branch_protection(owner, repo, branch)
        print("The response of ReposApi->repos_get_admin_branch_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_admin_branch_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_all_environments**
> ReposGetAllEnvironments200Response repos_get_all_environments(owner, repo, per_page=per_page, page=page)

List environments

Lists the environments for a repository.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.repos_get_all_environments200_response import ReposGetAllEnvironments200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List environments
        api_response = api_instance.repos_get_all_environments(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_get_all_environments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_all_environments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ReposGetAllEnvironments200Response**](ReposGetAllEnvironments200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_all_status_check_contexts**
> List[str] repos_get_all_status_check_contexts(owner, repo, branch)

Get all status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get all status check contexts
        api_response = api_instance.repos_get_all_status_check_contexts(owner, repo, branch)
        print("The response of ReposApi->repos_get_all_status_check_contexts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_all_status_check_contexts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

**List[str]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_all_topics**
> Topic repos_get_all_topics(owner, repo, page=page, per_page=per_page)

Get all repository topics



### Example


```python
import openapi_client
from openapi_client.models.topic import Topic
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # Get all repository topics
        api_response = api_instance.repos_get_all_topics(owner, repo, page=page, per_page=per_page)
        print("The response of ReposApi->repos_get_all_topics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_all_topics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_apps_with_access_to_protected_branch**
> List[Integration] repos_get_apps_with_access_to_protected_branch(owner, repo, branch)

Get apps with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.

### Example


```python
import openapi_client
from openapi_client.models.integration import Integration
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get apps with access to the protected branch
        api_response = api_instance.repos_get_apps_with_access_to_protected_branch(owner, repo, branch)
        print("The response of ReposApi->repos_get_apps_with_access_to_protected_branch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_apps_with_access_to_protected_branch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**List[Integration]**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_autolink**
> Autolink repos_get_autolink(owner, repo, autolink_id)

Get an autolink reference of a repository

This returns a single autolink reference by ID that was configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example


```python
import openapi_client
from openapi_client.models.autolink import Autolink
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    autolink_id = 56 # int | The unique identifier of the autolink.

    try:
        # Get an autolink reference of a repository
        api_response = api_instance.repos_get_autolink(owner, repo, autolink_id)
        print("The response of ReposApi->repos_get_autolink:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_autolink: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **autolink_id** | **int**| The unique identifier of the autolink. | 

### Return type

[**Autolink**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_branch**
> BranchWithProtection repos_get_branch(owner, repo, branch)

Get a branch



### Example


```python
import openapi_client
from openapi_client.models.branch_with_protection import BranchWithProtection
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get a branch
        api_response = api_instance.repos_get_branch(owner, repo, branch)
        print("The response of ReposApi->repos_get_branch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_branch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**BranchWithProtection**](BranchWithProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**301** | Moved permanently |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_branch_protection**
> BranchProtection repos_get_branch_protection(owner, repo, branch)

Get branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.models.branch_protection import BranchProtection
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get branch protection
        api_response = api_instance.repos_get_branch_protection(owner, repo, branch)
        print("The response of ReposApi->repos_get_branch_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_branch_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**BranchProtection**](BranchProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_code_frequency_stats**
> List[List[int]] repos_get_code_frequency_stats(owner, repo)

Get the weekly commit activity

Returns a weekly aggregate of the number of additions and deletions pushed to a repository.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get the weekly commit activity
        api_response = api_instance.repos_get_code_frequency_stats(owner, repo)
        print("The response of ReposApi->repos_get_code_frequency_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_code_frequency_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

**List[List[int]]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a weekly aggregate of the number of additions and deletions pushed to a repository. |  -  |
**202** | Accepted |  -  |
**204** | A header with no content is returned. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_collaborator_permission_level**
> RepositoryCollaboratorPermission repos_get_collaborator_permission_level(owner, repo, username)

Get repository permissions for a user

Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`.

### Example


```python
import openapi_client
from openapi_client.models.repository_collaborator_permission import RepositoryCollaboratorPermission
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Get repository permissions for a user
        api_response = api_instance.repos_get_collaborator_permission_level(owner, repo, username)
        print("The response of ReposApi->repos_get_collaborator_permission_level:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_collaborator_permission_level: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

### Return type

[**RepositoryCollaboratorPermission**](RepositoryCollaboratorPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | if user has admin permissions |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_combined_status_for_ref**
> CombinedCommitStatus repos_get_combined_status_for_ref(owner, repo, ref, per_page=per_page, page=page)

Get the combined status for a specific reference

Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.   Additionally, a combined `state` is returned. The `state` is one of:  *   **failure** if any of the contexts report as `error` or `failure` *   **pending** if there are no statuses or a context is `pending` *   **success** if the latest status for all contexts is `success`

### Example


```python
import openapi_client
from openapi_client.models.combined_commit_status import CombinedCommitStatus
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    ref = 'ref_example' # str | ref parameter
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # Get the combined status for a specific reference
        api_response = api_instance.repos_get_combined_status_for_ref(owner, repo, ref, per_page=per_page, page=page)
        print("The response of ReposApi->repos_get_combined_status_for_ref:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_combined_status_for_ref: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **ref** | **str**| ref parameter | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**CombinedCommitStatus**](CombinedCommitStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_commit**
> Commit repos_get_commit(owner, repo, ref, page=page, per_page=per_page)

Get a commit

Returns the contents of a single commit reference. You must have `read` access for the repository to use this endpoint.  **Note:** If there are more than 300 files in the commit diff, the response will include pagination link headers for the remaining files, up to a limit of 3000 files. Each page contains the static commit information, and the only changes are to the file listing.  You can pass the appropriate [media type](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to  fetch `diff` and `patch` formats. Diffs with binary data will have no `patch` property.  To return only the SHA-1 hash of the commit reference, you can provide the `sha` custom [media type](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) in the `Accept` header. You can use this endpoint to check if a remote reference's SHA-1 hash is the same as your local reference's SHA-1 hash by providing the local SHA-1 reference as the ETag.  **Signature verification object**  The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:  | Name | Type | Description | | ---- | ---- | ----------- | | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. | | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. | | `signature` | `string` | The signature that was extracted from the commit. | | `payload` | `string` | The value that was signed. |  These are the possible values for `reason` in the `verification` object:  | Value | Description | | ----- | ----------- | | `expired_key` | The key that made the signature is expired. | | `not_signing_key` | The \"signing\" flag is not among the usage flags in the GPG key that made the signature. | | `gpgverify_error` | There was an error communicating with the signature verification service. | | `gpgverify_unavailable` | The signature verification service is currently unavailable. | | `unsigned` | The object does not include a signature. | | `unknown_signature_type` | A non-PGP signature was found in the commit. | | `no_user` | No user was associated with the `committer` email address in the commit. | | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. | | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. | | `unknown_key` | The key that made the signature has not been registered with any user's account. | | `malformed_signature` | There was an error parsing the signature. | | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | `valid` | None of the above errors applied, so the signature is considered to be verified. |

### Example


```python
import openapi_client
from openapi_client.models.commit import Commit
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    ref = 'ref_example' # str | ref parameter
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # Get a commit
        api_response = api_instance.repos_get_commit(owner, repo, ref, page=page, per_page=per_page)
        print("The response of ReposApi->repos_get_commit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_commit: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **ref** | **str**| ref parameter | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |
**500** | Internal Error |  -  |
**503** | Service unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_commit_activity_stats**
> List[CommitActivity] repos_get_commit_activity_stats(owner, repo)

Get the last year of commit activity

Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.

### Example


```python
import openapi_client
from openapi_client.models.commit_activity import CommitActivity
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get the last year of commit activity
        api_response = api_instance.repos_get_commit_activity_stats(owner, repo)
        print("The response of ReposApi->repos_get_commit_activity_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_commit_activity_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**List[CommitActivity]**](CommitActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**202** | Accepted |  -  |
**204** | A header with no content is returned. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_commit_comment**
> CommitComment repos_get_commit_comment(owner, repo, comment_id)

Get a commit comment



### Example


```python
import openapi_client
from openapi_client.models.commit_comment import CommitComment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.

    try:
        # Get a commit comment
        api_response = api_instance.repos_get_commit_comment(owner, repo, comment_id)
        print("The response of ReposApi->repos_get_commit_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_commit_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_commit_signature_protection**
> ProtectedBranchAdminEnforced repos_get_commit_signature_protection(owner, repo, branch)

Get commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://docs.github.com/enterprise-server@3.4/articles/signing-commits-with-gpg) in GitHub Help.  **Note**: You must enable branch protection to require signed commits.

### Example


```python
import openapi_client
from openapi_client.models.protected_branch_admin_enforced import ProtectedBranchAdminEnforced
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get commit signature protection
        api_response = api_instance.repos_get_commit_signature_protection(owner, repo, branch)
        print("The response of ReposApi->repos_get_commit_signature_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_commit_signature_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_content**
> ReposGetContent200Response repos_get_content(owner, repo, path, ref=ref)

Get repository content

Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit `:path`, you will receive the contents of the repository's root directory. See the description below regarding what the API response includes for directories.   Files and symlinks support [a custom media type](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML (when supported). All content types support [a custom media type](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#custom-media-types) to ensure the content is returned in a consistent object format.  **Notes**: *   To get a repository's contents recursively, you can [recursively get the tree](https://docs.github.com/enterprise-server@3.4/rest/reference/git#trees). *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees API](https://docs.github.com/enterprise-server@3.4/rest/reference/git#get-a-tree).  *  Download URLs expire and are meant to be used just once. To ensure the download URL does not expire, please use the contents API to obtain a fresh download URL for each download.  *   This API supports files up to 1 megabyte in size.  #### If the content is a directory The response will be an array of objects, one object for each item in the directory. When listing the contents of a directory, submodules have their \"type\" specified as \"file\". Logically, the value _should_ be \"submodule\". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW). In the next major version of the API, the type will be returned as \"submodule\".  #### If the content is a symlink  If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the API responds with the content of the file (in the format shown in the example. Otherwise, the API responds with an object  describing the symlink itself.  #### If the content is a submodule The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out the submodule at that specific commit.  If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links[\"git\"]`) and the github.com URLs (`html_url` and `_links[\"html\"]`) will have null values.

### Example


```python
import openapi_client
from openapi_client.models.repos_get_content200_response import ReposGetContent200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    path = 'path_example' # str | path parameter
    ref = 'ref_example' # str | The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`) (optional)

    try:
        # Get repository content
        api_response = api_instance.repos_get_content(owner, repo, path, ref=ref)
        print("The response of ReposApi->repos_get_content:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_content: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **path** | **str**| path parameter | 
 **ref** | **str**| The name of the commit/branch/tag. Default: the repository’s default branch (usually &#x60;master&#x60;) | [optional] 

### Return type

[**ReposGetContent200Response**](ReposGetContent200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.github.object

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**302** | Found |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_contributors_stats**
> List[ContributorActivity] repos_get_contributors_stats(owner, repo)

Get all contributor commit activity

 Returns the `total` number of commits authored by the contributor. In addition, the response includes a Weekly Hash (`weeks` array) with the following information:  *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time). *   `a` - Number of additions *   `d` - Number of deletions *   `c` - Number of commits

### Example


```python
import openapi_client
from openapi_client.models.contributor_activity import ContributorActivity
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get all contributor commit activity
        api_response = api_instance.repos_get_contributors_stats(owner, repo)
        print("The response of ReposApi->repos_get_contributors_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_contributors_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**List[ContributorActivity]**](ContributorActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**202** | Accepted |  -  |
**204** | A header with no content is returned. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_deploy_key**
> DeployKey repos_get_deploy_key(owner, repo, key_id)

Get a deploy key



### Example


```python
import openapi_client
from openapi_client.models.deploy_key import DeployKey
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    key_id = 56 # int | The unique identifier of the key.

    try:
        # Get a deploy key
        api_response = api_instance.repos_get_deploy_key(owner, repo, key_id)
        print("The response of ReposApi->repos_get_deploy_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_deploy_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **key_id** | **int**| The unique identifier of the key. | 

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_deployment**
> Deployment repos_get_deployment(owner, repo, deployment_id)

Get a deployment



### Example


```python
import openapi_client
from openapi_client.models.deployment import Deployment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    deployment_id = 56 # int | deployment_id parameter

    try:
        # Get a deployment
        api_response = api_instance.repos_get_deployment(owner, repo, deployment_id)
        print("The response of ReposApi->repos_get_deployment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_deployment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **deployment_id** | **int**| deployment_id parameter | 

### Return type

[**Deployment**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_deployment_branch_policy**
> DeploymentBranchPolicy repos_get_deployment_branch_policy(owner, repo, environment_name, branch_policy_id)

Get a deployment branch policy

Gets a deployment branch policy for an environment.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.deployment_branch_policy import DeploymentBranchPolicy
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.
    branch_policy_id = 56 # int | The unique identifier of the branch policy.

    try:
        # Get a deployment branch policy
        api_response = api_instance.repos_get_deployment_branch_policy(owner, repo, environment_name, branch_policy_id)
        print("The response of ReposApi->repos_get_deployment_branch_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_deployment_branch_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 
 **branch_policy_id** | **int**| The unique identifier of the branch policy. | 

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_deployment_status**
> DeploymentStatus repos_get_deployment_status(owner, repo, deployment_id, status_id)

Get a deployment status

Users with pull access can view a deployment status for a deployment:

### Example


```python
import openapi_client
from openapi_client.models.deployment_status import DeploymentStatus
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    deployment_id = 56 # int | deployment_id parameter
    status_id = 56 # int | 

    try:
        # Get a deployment status
        api_response = api_instance.repos_get_deployment_status(owner, repo, deployment_id, status_id)
        print("The response of ReposApi->repos_get_deployment_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_deployment_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **deployment_id** | **int**| deployment_id parameter | 
 **status_id** | **int**|  | 

### Return type

[**DeploymentStatus**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_environment**
> Environment repos_get_environment(owner, repo, environment_name)

Get an environment

**Note:** To get information about name patterns that branches must match in order to deploy to this environment, see \"[Get a deployment branch policy](/rest/deployments/branch-policies#get-a-deployment-branch-policy).\"  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.environment import Environment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.

    try:
        # Get an environment
        api_response = api_instance.repos_get_environment(owner, repo, environment_name)
        print("The response of ReposApi->repos_get_environment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_latest_pages_build**
> PageBuild repos_get_latest_pages_build(owner, repo)

Get latest Pages build



### Example


```python
import openapi_client
from openapi_client.models.page_build import PageBuild
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get latest Pages build
        api_response = api_instance.repos_get_latest_pages_build(owner, repo)
        print("The response of ReposApi->repos_get_latest_pages_build:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_latest_pages_build: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**PageBuild**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_latest_release**
> Release repos_get_latest_release(owner, repo)

Get the latest release

View the latest published full release for the repository.  The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.

### Example


```python
import openapi_client
from openapi_client.models.release import Release
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get the latest release
        api_response = api_instance.repos_get_latest_release(owner, repo)
        print("The response of ReposApi->repos_get_latest_release:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_latest_release: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_pages**
> Page repos_get_pages(owner, repo)

Get a GitHub Enterprise Server Pages site



### Example


```python
import openapi_client
from openapi_client.models.page import Page
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get a GitHub Enterprise Server Pages site
        api_response = api_instance.repos_get_pages(owner, repo)
        print("The response of ReposApi->repos_get_pages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_pages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_pages_build**
> PageBuild repos_get_pages_build(owner, repo, build_id)

Get GitHub Enterprise Server Pages build



### Example


```python
import openapi_client
from openapi_client.models.page_build import PageBuild
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    build_id = 56 # int | 

    try:
        # Get GitHub Enterprise Server Pages build
        api_response = api_instance.repos_get_pages_build(owner, repo, build_id)
        print("The response of ReposApi->repos_get_pages_build:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_pages_build: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **build_id** | **int**|  | 

### Return type

[**PageBuild**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_participation_stats**
> ParticipationStats repos_get_participation_stats(owner, repo)

Get the weekly commit count

Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.  The array order is oldest week (index 0) to most recent week.

### Example


```python
import openapi_client
from openapi_client.models.participation_stats import ParticipationStats
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get the weekly commit count
        api_response = api_instance.repos_get_participation_stats(owner, repo)
        print("The response of ReposApi->repos_get_participation_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_participation_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**ParticipationStats**](ParticipationStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The array order is oldest week (index 0) to most recent week. |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_pull_request_review_protection**
> ProtectedBranchPullRequestReview repos_get_pull_request_review_protection(owner, repo, branch)

Get pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.models.protected_branch_pull_request_review import ProtectedBranchPullRequestReview
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get pull request review protection
        api_response = api_instance.repos_get_pull_request_review_protection(owner, repo, branch)
        print("The response of ReposApi->repos_get_pull_request_review_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_pull_request_review_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**ProtectedBranchPullRequestReview**](ProtectedBranchPullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_punch_card_stats**
> List[List[int]] repos_get_punch_card_stats(owner, repo)

Get the hourly commit count for each day

Each array contains the day number, hour number, and number of commits:  *   `0-6`: Sunday - Saturday *   `0-23`: Hour of day *   Number of commits  For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get the hourly commit count for each day
        api_response = api_instance.repos_get_punch_card_stats(owner, repo)
        print("The response of ReposApi->repos_get_punch_card_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_punch_card_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

**List[List[int]]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | For example, &#x60;[2, 14, 25]&#x60; indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits. |  -  |
**204** | A header with no content is returned. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_readme**
> ContentFile repos_get_readme(owner, repo, ref=ref)

Get a repository README

Gets the preferred README for a repository.  READMEs support [custom media types](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.

### Example


```python
import openapi_client
from openapi_client.models.content_file import ContentFile
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    ref = 'ref_example' # str | The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`) (optional)

    try:
        # Get a repository README
        api_response = api_instance.repos_get_readme(owner, repo, ref=ref)
        print("The response of ReposApi->repos_get_readme:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_readme: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **ref** | **str**| The name of the commit/branch/tag. Default: the repository’s default branch (usually &#x60;master&#x60;) | [optional] 

### Return type

[**ContentFile**](ContentFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_readme_in_directory**
> ContentFile repos_get_readme_in_directory(owner, repo, dir, ref=ref)

Get a repository README for a directory

Gets the README from a repository directory.  READMEs support [custom media types](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#custom-media-types) for retrieving the raw content or rendered HTML.

### Example


```python
import openapi_client
from openapi_client.models.content_file import ContentFile
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    dir = 'dir_example' # str | The alternate path to look for a README file
    ref = 'ref_example' # str | The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`) (optional)

    try:
        # Get a repository README for a directory
        api_response = api_instance.repos_get_readme_in_directory(owner, repo, dir, ref=ref)
        print("The response of ReposApi->repos_get_readme_in_directory:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_readme_in_directory: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **dir** | **str**| The alternate path to look for a README file | 
 **ref** | **str**| The name of the commit/branch/tag. Default: the repository’s default branch (usually &#x60;master&#x60;) | [optional] 

### Return type

[**ContentFile**](ContentFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_release**
> Release repos_get_release(owner, repo, release_id)

Get a release

**Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#hypermedia).

### Example


```python
import openapi_client
from openapi_client.models.release import Release
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    release_id = 56 # int | The unique identifier of the release.

    try:
        # Get a release
        api_response = api_instance.repos_get_release(owner, repo, release_id)
        print("The response of ReposApi->repos_get_release:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_release: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **release_id** | **int**| The unique identifier of the release. | 

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | **Note:** This returns an &#x60;upload_url&#x60; key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#hypermedia). |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_release_asset**
> ReleaseAsset repos_get_release_asset(owner, repo, asset_id)

Get a release asset

To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.

### Example


```python
import openapi_client
from openapi_client.models.release_asset import ReleaseAsset
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    asset_id = 56 # int | The unique identifier of the asset.

    try:
        # Get a release asset
        api_response = api_instance.repos_get_release_asset(owner, repo, asset_id)
        print("The response of ReposApi->repos_get_release_asset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_release_asset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **asset_id** | **int**| The unique identifier of the asset. | 

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**302** | Found |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_release_by_tag**
> Release repos_get_release_by_tag(owner, repo, tag)

Get a release by tag name

Get a published release with the specified tag.

### Example


```python
import openapi_client
from openapi_client.models.release import Release
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    tag = 'tag_example' # str | tag parameter

    try:
        # Get a release by tag name
        api_response = api_instance.repos_get_release_by_tag(owner, repo, tag)
        print("The response of ReposApi->repos_get_release_by_tag:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_release_by_tag: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **tag** | **str**| tag parameter | 

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_status_checks_protection**
> StatusCheckPolicy repos_get_status_checks_protection(owner, repo, branch)

Get status checks protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.models.status_check_policy import StatusCheckPolicy
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get status checks protection
        api_response = api_instance.repos_get_status_checks_protection(owner, repo, branch)
        print("The response of ReposApi->repos_get_status_checks_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_status_checks_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**StatusCheckPolicy**](StatusCheckPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_teams_with_access_to_protected_branch**
> List[Team] repos_get_teams_with_access_to_protected_branch(owner, repo, branch)

Get teams with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the teams who have push access to this branch. The list includes child teams.

### Example


```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get teams with access to the protected branch
        api_response = api_instance.repos_get_teams_with_access_to_protected_branch(owner, repo, branch)
        print("The response of ReposApi->repos_get_teams_with_access_to_protected_branch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_teams_with_access_to_protected_branch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**List[Team]**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_users_with_access_to_protected_branch**
> List[SimpleUser] repos_get_users_with_access_to_protected_branch(owner, repo, branch)

Get users with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the people who have push access to this branch.

### Example


```python
import openapi_client
from openapi_client.models.simple_user import SimpleUser
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Get users with access to the protected branch
        api_response = api_instance.repos_get_users_with_access_to_protected_branch(owner, repo, branch)
        print("The response of ReposApi->repos_get_users_with_access_to_protected_branch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_users_with_access_to_protected_branch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**List[SimpleUser]**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_webhook**
> Hook repos_get_webhook(owner, repo, hook_id)

Get a repository webhook

Returns a webhook configured in a repository. To get only the webhook `config` properties, see \"[Get a webhook configuration for a repository](/rest/reference/repos#get-a-webhook-configuration-for-a-repository).\"

### Example


```python
import openapi_client
from openapi_client.models.hook import Hook
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Get a repository webhook
        api_response = api_instance.repos_get_webhook(owner, repo, hook_id)
        print("The response of ReposApi->repos_get_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_webhook_config_for_repo**
> WebhookConfig repos_get_webhook_config_for_repo(owner, repo, hook_id)

Get a webhook configuration for a repository

Returns the webhook configuration for a repository. To get more information about the webhook, including the `active` state and `events`, use \"[Get a repository webhook](/rest/reference/orgs#get-a-repository-webhook).\"  Access tokens must have the `read:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:read` permission.

### Example


```python
import openapi_client
from openapi_client.models.webhook_config import WebhookConfig
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Get a webhook configuration for a repository
        api_response = api_instance.repos_get_webhook_config_for_repo(owner, repo, hook_id)
        print("The response of ReposApi->repos_get_webhook_config_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_webhook_config_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_get_webhook_delivery**
> HookDelivery repos_get_webhook_delivery(owner, repo, hook_id, delivery_id)

Get a delivery for a repository webhook

Returns a delivery for a webhook configured in a repository.

### Example


```python
import openapi_client
from openapi_client.models.hook_delivery import HookDelivery
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    delivery_id = 56 # int | 

    try:
        # Get a delivery for a repository webhook
        api_response = api_instance.repos_get_webhook_delivery(owner, repo, hook_id, delivery_id)
        print("The response of ReposApi->repos_get_webhook_delivery:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_get_webhook_delivery: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **delivery_id** | **int**|  | 

### Return type

[**HookDelivery**](HookDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**400** | Bad Request |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_autolinks**
> List[Autolink] repos_list_autolinks(owner, repo, page=page)

List all autolinks of a repository

This returns a list of autolinks configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example


```python
import openapi_client
from openapi_client.models.autolink import Autolink
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List all autolinks of a repository
        api_response = api_instance.repos_list_autolinks(owner, repo, page=page)
        print("The response of ReposApi->repos_list_autolinks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_autolinks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Autolink]**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_branches**
> List[ShortBranch] repos_list_branches(owner, repo, protected=protected, per_page=per_page, page=page)

List branches



### Example


```python
import openapi_client
from openapi_client.models.short_branch import ShortBranch
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    protected = True # bool | Setting to `true` returns only protected branches. When set to `false`, only unprotected branches are returned. Omitting this parameter returns all branches. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List branches
        api_response = api_instance.repos_list_branches(owner, repo, protected=protected, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_branches:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_branches: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **protected** | **bool**| Setting to &#x60;true&#x60; returns only protected branches. When set to &#x60;false&#x60;, only unprotected branches are returned. Omitting this parameter returns all branches. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[ShortBranch]**](ShortBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_branches_for_head_commit**
> List[BranchShort] repos_list_branches_for_head_commit(owner, repo, commit_sha)

List branches for HEAD commit

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.

### Example


```python
import openapi_client
from openapi_client.models.branch_short import BranchShort
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    commit_sha = 'commit_sha_example' # str | The SHA of the commit.

    try:
        # List branches for HEAD commit
        api_response = api_instance.repos_list_branches_for_head_commit(owner, repo, commit_sha)
        print("The response of ReposApi->repos_list_branches_for_head_commit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_branches_for_head_commit: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **commit_sha** | **str**| The SHA of the commit. | 

### Return type

[**List[BranchShort]**](BranchShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_cache_info**
> List[ReposListCacheInfo200ResponseInner] repos_list_cache_info(owner, repo, per_page=per_page, page=page)

List repository cache replication status

Lists the status of each repository cache replica.

### Example


```python
import openapi_client
from openapi_client.models.repos_list_cache_info200_response_inner import ReposListCacheInfo200ResponseInner
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository cache replication status
        api_response = api_instance.repos_list_cache_info(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_cache_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_cache_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[ReposListCacheInfo200ResponseInner]**](ReposListCacheInfo200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status information for cache replicas |  * Link -  <br>  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_collaborators**
> List[Collaborator] repos_list_collaborators(owner, repo, affiliation=affiliation, per_page=per_page, page=page)

List repository collaborators

For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. Organization members with write, maintain, or admin privileges on the organization-owned repository can use this endpoint.  Team members will include the members of child teams.  You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.collaborator import Collaborator
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    affiliation = all # str | Filter collaborators returned by their affiliation. `outside` means all outside collaborators of an organization-owned repository. `direct` means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. `all` means all collaborators the authenticated user can see. (optional) (default to all)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository collaborators
        api_response = api_instance.repos_list_collaborators(owner, repo, affiliation=affiliation, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_collaborators:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_collaborators: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **affiliation** | **str**| Filter collaborators returned by their affiliation. &#x60;outside&#x60; means all outside collaborators of an organization-owned repository. &#x60;direct&#x60; means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. &#x60;all&#x60; means all collaborators the authenticated user can see. | [optional] [default to all]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Collaborator]**](Collaborator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_comments_for_commit**
> List[CommitComment] repos_list_comments_for_commit(owner, repo, commit_sha, per_page=per_page, page=page)

List commit comments

Use the `:commit_sha` to specify the commit that will have its comments listed.

### Example


```python
import openapi_client
from openapi_client.models.commit_comment import CommitComment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    commit_sha = 'commit_sha_example' # str | The SHA of the commit.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List commit comments
        api_response = api_instance.repos_list_comments_for_commit(owner, repo, commit_sha, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_comments_for_commit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_comments_for_commit: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **commit_sha** | **str**| The SHA of the commit. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[CommitComment]**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_commit_comments_for_repo**
> List[CommitComment] repos_list_commit_comments_for_repo(owner, repo, per_page=per_page, page=page)

List commit comments for a repository

Commit Comments use [these custom media types](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#custom-media-types). You can read more about the use of media types in the API [here](https://docs.github.com/enterprise-server@3.4/rest/overview/media-types/).  Comments are ordered by ascending ID.

### Example


```python
import openapi_client
from openapi_client.models.commit_comment import CommitComment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List commit comments for a repository
        api_response = api_instance.repos_list_commit_comments_for_repo(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_commit_comments_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_commit_comments_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[CommitComment]**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_commit_statuses_for_ref**
> List[Status] repos_list_commit_statuses_for_ref(owner, repo, ref, per_page=per_page, page=page)

List commit statuses for a reference

Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.  This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.

### Example


```python
import openapi_client
from openapi_client.models.status import Status
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    ref = 'ref_example' # str | ref parameter
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List commit statuses for a reference
        api_response = api_instance.repos_list_commit_statuses_for_ref(owner, repo, ref, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_commit_statuses_for_ref:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_commit_statuses_for_ref: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **ref** | **str**| ref parameter | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Status]**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**301** | Moved permanently |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_commits**
> List[Commit] repos_list_commits(owner, repo, sha=sha, path=path, author=author, since=since, until=until, per_page=per_page, page=page)

List commits

**Signature verification object**  The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:  | Name | Type | Description | | ---- | ---- | ----------- | | `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. | | `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. | | `signature` | `string` | The signature that was extracted from the commit. | | `payload` | `string` | The value that was signed. |  These are the possible values for `reason` in the `verification` object:  | Value | Description | | ----- | ----------- | | `expired_key` | The key that made the signature is expired. | | `not_signing_key` | The \"signing\" flag is not among the usage flags in the GPG key that made the signature. | | `gpgverify_error` | There was an error communicating with the signature verification service. | | `gpgverify_unavailable` | The signature verification service is currently unavailable. | | `unsigned` | The object does not include a signature. | | `unknown_signature_type` | A non-PGP signature was found in the commit. | | `no_user` | No user was associated with the `committer` email address in the commit. | | `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. | | `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. | | `unknown_key` | The key that made the signature has not been registered with any user's account. | | `malformed_signature` | There was an error parsing the signature. | | `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | `valid` | None of the above errors applied, so the signature is considered to be verified. |

### Example


```python
import openapi_client
from openapi_client.models.commit import Commit
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    sha = 'sha_example' # str | SHA or branch to start listing commits from. Default: the repository’s default branch (usually `main`). (optional)
    path = 'path_example' # str | Only commits containing this file path will be returned. (optional)
    author = 'author_example' # str | GitHub login or email address by which to filter by commit author. (optional)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    until = '2013-10-20T19:20:30+01:00' # datetime | Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List commits
        api_response = api_instance.repos_list_commits(owner, repo, sha=sha, path=path, author=author, since=since, until=until, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_commits:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_commits: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **sha** | **str**| SHA or branch to start listing commits from. Default: the repository’s default branch (usually &#x60;main&#x60;). | [optional] 
 **path** | **str**| Only commits containing this file path will be returned. | [optional] 
 **author** | **str**| GitHub login or email address by which to filter by commit author. | [optional] 
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **until** | **datetime**| Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Commit]**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**400** | Bad Request |  -  |
**404** | Resource not found |  -  |
**409** | Conflict |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_contributors**
> List[Contributor] repos_list_contributors(owner, repo, anon=anon, per_page=per_page, page=page)

List repository contributors

Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API caches contributor data to improve performance.  GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.

### Example


```python
import openapi_client
from openapi_client.models.contributor import Contributor
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    anon = 'anon_example' # str | Set to `1` or `true` to include anonymous contributors in results. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository contributors
        api_response = api_instance.repos_list_contributors(owner, repo, anon=anon, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_contributors:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_contributors: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **anon** | **str**| Set to &#x60;1&#x60; or &#x60;true&#x60; to include anonymous contributors in results. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Contributor]**](Contributor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | if repository contains content |  * Link -  <br>  |
**204** | Response if repository is empty |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_deploy_keys**
> List[DeployKey] repos_list_deploy_keys(owner, repo, per_page=per_page, page=page)

List deploy keys



### Example


```python
import openapi_client
from openapi_client.models.deploy_key import DeployKey
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List deploy keys
        api_response = api_instance.repos_list_deploy_keys(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_deploy_keys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_deploy_keys: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[DeployKey]**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_deployment_branch_policies**
> ReposListDeploymentBranchPolicies200Response repos_list_deployment_branch_policies(owner, repo, environment_name, per_page=per_page, page=page)

List deployment branch policies

Lists the deployment branch policies for an environment.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.repos_list_deployment_branch_policies200_response import ReposListDeploymentBranchPolicies200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List deployment branch policies
        api_response = api_instance.repos_list_deployment_branch_policies(owner, repo, environment_name, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_deployment_branch_policies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_deployment_branch_policies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ReposListDeploymentBranchPolicies200Response**](ReposListDeploymentBranchPolicies200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_deployment_statuses**
> List[DeploymentStatus] repos_list_deployment_statuses(owner, repo, deployment_id, per_page=per_page, page=page)

List deployment statuses

Users with pull access can view deployment statuses for a deployment:

### Example


```python
import openapi_client
from openapi_client.models.deployment_status import DeploymentStatus
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    deployment_id = 56 # int | deployment_id parameter
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List deployment statuses
        api_response = api_instance.repos_list_deployment_statuses(owner, repo, deployment_id, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_deployment_statuses:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_deployment_statuses: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **deployment_id** | **int**| deployment_id parameter | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[DeploymentStatus]**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_deployments**
> List[Deployment] repos_list_deployments(owner, repo, sha=sha, ref=ref, task=task, environment=environment, per_page=per_page, page=page)

List deployments

Simple filtering of deployments is available via query parameters:

### Example


```python
import openapi_client
from openapi_client.models.deployment import Deployment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    sha = 'none' # str | The SHA recorded at creation time. (optional) (default to 'none')
    ref = 'none' # str | The name of the ref. This can be a branch, tag, or SHA. (optional) (default to 'none')
    task = 'none' # str | The name of the task for the deployment (e.g., `deploy` or `deploy:migrations`). (optional) (default to 'none')
    environment = 'none' # str | The name of the environment that was deployed to (e.g., `staging` or `production`). (optional) (default to 'none')
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List deployments
        api_response = api_instance.repos_list_deployments(owner, repo, sha=sha, ref=ref, task=task, environment=environment, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_deployments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_deployments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **sha** | **str**| The SHA recorded at creation time. | [optional] [default to &#39;none&#39;]
 **ref** | **str**| The name of the ref. This can be a branch, tag, or SHA. | [optional] [default to &#39;none&#39;]
 **task** | **str**| The name of the task for the deployment (e.g., &#x60;deploy&#x60; or &#x60;deploy:migrations&#x60;). | [optional] [default to &#39;none&#39;]
 **environment** | **str**| The name of the environment that was deployed to (e.g., &#x60;staging&#x60; or &#x60;production&#x60;). | [optional] [default to &#39;none&#39;]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Deployment]**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_for_authenticated_user**
> List[Repository] repos_list_for_authenticated_user(visibility=visibility, affiliation=affiliation, type=type, sort=sort, direction=direction, per_page=per_page, page=page, since=since, before=before)

List repositories for the authenticated user

Lists repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.

### Example


```python
import openapi_client
from openapi_client.models.repository import Repository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    visibility = all # str | Limit results to repositories with the specified visibility. (optional) (default to all)
    affiliation = 'owner,collaborator,organization_member' # str | Comma-separated list of values. Can include:    * `owner`: Repositories that are owned by the authenticated user.    * `collaborator`: Repositories that the user has been added to as a collaborator.    * `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on. (optional) (default to 'owner,collaborator,organization_member')
    type = all # str | Limit results to repositories of the specified type. Will cause a `422` error if used in the same request as **visibility** or **affiliation**. (optional) (default to all)
    sort = full_name # str | The property to sort the results by. (optional) (default to full_name)
    direction = 'direction_example' # str | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    since = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)
    before = '2013-10-20T19:20:30+01:00' # datetime | Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. (optional)

    try:
        # List repositories for the authenticated user
        api_response = api_instance.repos_list_for_authenticated_user(visibility=visibility, affiliation=affiliation, type=type, sort=sort, direction=direction, per_page=per_page, page=page, since=since, before=before)
        print("The response of ReposApi->repos_list_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **visibility** | **str**| Limit results to repositories with the specified visibility. | [optional] [default to all]
 **affiliation** | **str**| Comma-separated list of values. Can include:    * &#x60;owner&#x60;: Repositories that are owned by the authenticated user.    * &#x60;collaborator&#x60;: Repositories that the user has been added to as a collaborator.    * &#x60;organization_member&#x60;: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on. | [optional] [default to &#39;owner,collaborator,organization_member&#39;]
 **type** | **str**| Limit results to repositories of the specified type. Will cause a &#x60;422&#x60; error if used in the same request as **visibility** or **affiliation**. | [optional] [default to all]
 **sort** | **str**| The property to sort the results by. | [optional] [default to full_name]
 **direction** | **str**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **since** | **datetime**| Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
 **before** | **datetime**| Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 

### Return type

[**List[Repository]**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_for_org**
> List[MinimalRepository] repos_list_for_org(org, type=type, sort=sort, direction=direction, per_page=per_page, page=page)

List organization repositories

Lists repositories for the specified organization.

### Example


```python
import openapi_client
from openapi_client.models.minimal_repository import MinimalRepository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    type = 'type_example' # str | Specifies the types of repositories you want returned. `internal` is not yet supported when a GitHub App calls this endpoint with an installation access token. (optional)
    sort = created # str | The property to sort the results by. (optional) (default to created)
    direction = 'direction_example' # str | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization repositories
        api_response = api_instance.repos_list_for_org(org, type=type, sort=sort, direction=direction, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **type** | **str**| Specifies the types of repositories you want returned. &#x60;internal&#x60; is not yet supported when a GitHub App calls this endpoint with an installation access token. | [optional] 
 **sort** | **str**| The property to sort the results by. | [optional] [default to created]
 **direction** | **str**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[MinimalRepository]**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_for_user**
> List[MinimalRepository] repos_list_for_user(username, type=type, sort=sort, direction=direction, per_page=per_page, page=page)

List repositories for a user

Lists public repositories for the specified user. Note: For GitHub AE, this endpoint will list internal repositories for the specified user.

### Example


```python
import openapi_client
from openapi_client.models.minimal_repository import MinimalRepository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    type = owner # str | Limit results to repositories of the specified type. (optional) (default to owner)
    sort = full_name # str | The property to sort the results by. (optional) (default to full_name)
    direction = 'direction_example' # str | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repositories for a user
        api_response = api_instance.repos_list_for_user(username, type=type, sort=sort, direction=direction, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **type** | **str**| Limit results to repositories of the specified type. | [optional] [default to owner]
 **sort** | **str**| The property to sort the results by. | [optional] [default to full_name]
 **direction** | **str**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[MinimalRepository]**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_forks**
> List[MinimalRepository] repos_list_forks(owner, repo, sort=sort, per_page=per_page, page=page)

List forks



### Example


```python
import openapi_client
from openapi_client.models.minimal_repository import MinimalRepository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    sort = newest # str | The sort order. `stargazers` will sort by star count. (optional) (default to newest)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List forks
        api_response = api_instance.repos_list_forks(owner, repo, sort=sort, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_forks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_forks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **sort** | **str**| The sort order. &#x60;stargazers&#x60; will sort by star count. | [optional] [default to newest]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[MinimalRepository]**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_invitations**
> List[RepositoryInvitation] repos_list_invitations(owner, repo, per_page=per_page, page=page)

List repository invitations

When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.

### Example


```python
import openapi_client
from openapi_client.models.repository_invitation import RepositoryInvitation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository invitations
        api_response = api_instance.repos_list_invitations(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_invitations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_invitations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[RepositoryInvitation]**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_invitations_for_authenticated_user**
> List[RepositoryInvitation] repos_list_invitations_for_authenticated_user(per_page=per_page, page=page)

List repository invitations for the authenticated user

When authenticating as a user, this endpoint will list all currently open repository invitations for that user.

### Example


```python
import openapi_client
from openapi_client.models.repository_invitation import RepositoryInvitation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository invitations for the authenticated user
        api_response = api_instance.repos_list_invitations_for_authenticated_user(per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_invitations_for_authenticated_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_invitations_for_authenticated_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[RepositoryInvitation]**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**304** | Not modified |  -  |
**401** | Requires authentication |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_languages**
> Dict[str, int] repos_list_languages(owner, repo)

List repository languages

Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # List repository languages
        api_response = api_instance.repos_list_languages(owner, repo)
        print("The response of ReposApi->repos_list_languages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_languages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

**Dict[str, int]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_pages_builds**
> List[PageBuild] repos_list_pages_builds(owner, repo, per_page=per_page, page=page)

List GitHub Enterprise Server Pages builds



### Example


```python
import openapi_client
from openapi_client.models.page_build import PageBuild
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List GitHub Enterprise Server Pages builds
        api_response = api_instance.repos_list_pages_builds(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_pages_builds:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_pages_builds: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[PageBuild]**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_public**
> List[MinimalRepository] repos_list_public(since=since, visibility=visibility)

List public repositories

Lists all public repositories in the order that they were created.  Note: - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise. - Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of repositories.

### Example


```python
import openapi_client
from openapi_client.models.minimal_repository import MinimalRepository
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    since = 56 # int | A repository ID. Only return repositories with an ID greater than this ID. (optional)
    visibility = public # str | Specifies the types of repositories to return. This endpoint will only list repositories available to all users on the enterprise. (optional) (default to public)

    try:
        # List public repositories
        api_response = api_instance.repos_list_public(since=since, visibility=visibility)
        print("The response of ReposApi->repos_list_public:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_public: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **int**| A repository ID. Only return repositories with an ID greater than this ID. | [optional] 
 **visibility** | **str**| Specifies the types of repositories to return. This endpoint will only list repositories available to all users on the enterprise. | [optional] [default to public]

### Return type

[**List[MinimalRepository]**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**304** | Not modified |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_pull_requests_associated_with_commit**
> List[PullRequestSimple] repos_list_pull_requests_associated_with_commit(owner, repo, commit_sha, per_page=per_page, page=page)

List pull requests associated with a commit

Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, will only return open pull requests associated with the commit.

### Example


```python
import openapi_client
from openapi_client.models.pull_request_simple import PullRequestSimple
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    commit_sha = 'commit_sha_example' # str | The SHA of the commit.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List pull requests associated with a commit
        api_response = api_instance.repos_list_pull_requests_associated_with_commit(owner, repo, commit_sha, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_pull_requests_associated_with_commit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_pull_requests_associated_with_commit: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **commit_sha** | **str**| The SHA of the commit. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[PullRequestSimple]**](PullRequestSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_release_assets**
> List[ReleaseAsset] repos_list_release_assets(owner, repo, release_id, per_page=per_page, page=page)

List release assets



### Example


```python
import openapi_client
from openapi_client.models.release_asset import ReleaseAsset
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    release_id = 56 # int | The unique identifier of the release.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List release assets
        api_response = api_instance.repos_list_release_assets(owner, repo, release_id, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_release_assets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_release_assets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **release_id** | **int**| The unique identifier of the release. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[ReleaseAsset]**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_releases**
> List[Release] repos_list_releases(owner, repo, per_page=per_page, page=page)

List releases

This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#list-repository-tags).  Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.

### Example


```python
import openapi_client
from openapi_client.models.release import Release
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List releases
        api_response = api_instance.repos_list_releases(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_releases:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_releases: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Release]**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_tags**
> List[Tag] repos_list_tags(owner, repo, per_page=per_page, page=page)

List repository tags



### Example


```python
import openapi_client
from openapi_client.models.tag import Tag
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository tags
        api_response = api_instance.repos_list_tags(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_tags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_tags: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Tag]**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_teams**
> List[Team] repos_list_teams(owner, repo, per_page=per_page, page=page)

List repository teams



### Example


```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository teams
        api_response = api_instance.repos_list_teams(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_teams:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_teams: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Team]**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_webhook_deliveries**
> List[HookDeliveryItem] repos_list_webhook_deliveries(owner, repo, hook_id, per_page=per_page, cursor=cursor, redelivery=redelivery)

List deliveries for a repository webhook

Returns a list of webhook deliveries for a webhook configured in a repository.

### Example


```python
import openapi_client
from openapi_client.models.hook_delivery_item import HookDeliveryItem
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    cursor = 'cursor_example' # str | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors. (optional)
    redelivery = True # bool |  (optional)

    try:
        # List deliveries for a repository webhook
        api_response = api_instance.repos_list_webhook_deliveries(owner, repo, hook_id, per_page=per_page, cursor=cursor, redelivery=redelivery)
        print("The response of ReposApi->repos_list_webhook_deliveries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_webhook_deliveries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **cursor** | **str**| Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the &#x60;link&#x60; header for the next and previous page cursors. | [optional] 
 **redelivery** | **bool**|  | [optional] 

### Return type

[**List[HookDeliveryItem]**](HookDeliveryItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**400** | Bad Request |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_list_webhooks**
> List[Hook] repos_list_webhooks(owner, repo, per_page=per_page, page=page)

List repository webhooks

Lists webhooks for a repository. `last response` may return null if there have not been any deliveries within 30 days.

### Example


```python
import openapi_client
from openapi_client.models.hook import Hook
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository webhooks
        api_response = api_instance.repos_list_webhooks(owner, repo, per_page=per_page, page=page)
        print("The response of ReposApi->repos_list_webhooks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_list_webhooks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Hook]**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  * Link -  <br>  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_merge**
> Commit repos_merge(owner, repo, repos_merge_request)

Merge a branch



### Example


```python
import openapi_client
from openapi_client.models.commit import Commit
from openapi_client.models.repos_merge_request import ReposMergeRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_merge_request = {"base":"master","commit_message":"Shipped cool_feature!","head":"cool_feature"} # ReposMergeRequest | 

    try:
        # Merge a branch
        api_response = api_instance.repos_merge(owner, repo, repos_merge_request)
        print("The response of ReposApi->repos_merge:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_merge: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_merge_request** | [**ReposMergeRequest**](ReposMergeRequest.md)|  | 

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful Response (The resulting merge commit) |  -  |
**204** | Response when already merged |  -  |
**403** | Forbidden |  -  |
**404** | Not Found when the base or head does not exist |  -  |
**409** | Conflict when there is a merge conflict |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_merge_upstream**
> MergedUpstream repos_merge_upstream(owner, repo, repos_merge_upstream_request)

Sync a fork branch with the upstream repository

Sync a branch of a forked repository to keep it up-to-date with the upstream repository.

### Example


```python
import openapi_client
from openapi_client.models.merged_upstream import MergedUpstream
from openapi_client.models.repos_merge_upstream_request import ReposMergeUpstreamRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_merge_upstream_request = {"branch":"main"} # ReposMergeUpstreamRequest | 

    try:
        # Sync a fork branch with the upstream repository
        api_response = api_instance.repos_merge_upstream(owner, repo, repos_merge_upstream_request)
        print("The response of ReposApi->repos_merge_upstream:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_merge_upstream: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_merge_upstream_request** | [**ReposMergeUpstreamRequest**](ReposMergeUpstreamRequest.md)|  | 

### Return type

[**MergedUpstream**](MergedUpstream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The branch has been successfully synced with the upstream repository |  -  |
**409** | The branch could not be synced because of a merge conflict |  -  |
**422** | The branch could not be synced for some other reason |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_ping_webhook**
> repos_ping_webhook(owner, repo, hook_id)

Ping a repository webhook

This will trigger a [ping event](https://docs.github.com/enterprise-server@3.4/webhooks/#ping-event) to be sent to the hook.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Ping a repository webhook
        api_instance.repos_ping_webhook(owner, repo, hook_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_ping_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_redeliver_webhook_delivery**
> object repos_redeliver_webhook_delivery(owner, repo, hook_id, delivery_id)

Redeliver a delivery for a repository webhook

Redeliver a webhook delivery for a webhook configured in a repository.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    delivery_id = 56 # int | 

    try:
        # Redeliver a delivery for a repository webhook
        api_response = api_instance.repos_redeliver_webhook_delivery(owner, repo, hook_id, delivery_id)
        print("The response of ReposApi->repos_redeliver_webhook_delivery:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_redeliver_webhook_delivery: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **delivery_id** | **int**|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_remove_app_access_restrictions**
> List[Integration] repos_remove_app_access_restrictions(owner, repo, branch, repos_set_app_access_restrictions_request=repos_set_app_access_restrictions_request)

Remove app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of an app to push to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.

### Example


```python
import openapi_client
from openapi_client.models.integration import Integration
from openapi_client.models.repos_set_app_access_restrictions_request import ReposSetAppAccessRestrictionsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_set_app_access_restrictions_request = {"apps":["my-app"]} # ReposSetAppAccessRestrictionsRequest |  (optional)

    try:
        # Remove app access restrictions
        api_response = api_instance.repos_remove_app_access_restrictions(owner, repo, branch, repos_set_app_access_restrictions_request=repos_set_app_access_restrictions_request)
        print("The response of ReposApi->repos_remove_app_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_remove_app_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_set_app_access_restrictions_request** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional] 

### Return type

[**List[Integration]**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_remove_collaborator**
> repos_remove_collaborator(owner, repo, username)

Remove a repository collaborator



### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Remove a repository collaborator
        api_instance.repos_remove_collaborator(owner, repo, username)
    except Exception as e:
        print("Exception when calling ReposApi->repos_remove_collaborator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **username** | **str**| The handle for the GitHub user account. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_remove_status_check_contexts**
> List[str] repos_remove_status_check_contexts(owner, repo, branch, request_body=request_body)

Remove status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    request_body = ["continuous-integration/jenkins"] # List[str] |  (optional)

    try:
        # Remove status check contexts
        api_response = api_instance.repos_remove_status_check_contexts(owner, repo, branch, request_body=request_body)
        print("The response of ReposApi->repos_remove_status_check_contexts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_remove_status_check_contexts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **request_body** | [**List[str]**](str.md)|  | [optional] 

### Return type

**List[str]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_remove_status_check_protection**
> repos_remove_status_check_protection(owner, repo, branch)

Remove status check protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Remove status check protection
        api_instance.repos_remove_status_check_protection(owner, repo, branch)
    except Exception as e:
        print("Exception when calling ReposApi->repos_remove_status_check_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_remove_team_access_restrictions**
> List[Team] repos_remove_team_access_restrictions(owner, repo, branch, request_body=request_body)

Remove team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of a team to push to this branch. You can also remove push access for child teams.

### Example


```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    request_body = ["octocats"] # List[str] |  (optional)

    try:
        # Remove team access restrictions
        api_response = api_instance.repos_remove_team_access_restrictions(owner, repo, branch, request_body=request_body)
        print("The response of ReposApi->repos_remove_team_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_remove_team_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **request_body** | [**List[str]**](str.md)|  | [optional] 

### Return type

[**List[Team]**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_remove_user_access_restrictions**
> List[SimpleUser] repos_remove_user_access_restrictions(owner, repo, branch, repos_set_user_access_restrictions_request=repos_set_user_access_restrictions_request)

Remove user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of a user to push to this branch.  | Type    | Description                                                                                                                                   | | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- | | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example


```python
import openapi_client
from openapi_client.models.repos_set_user_access_restrictions_request import ReposSetUserAccessRestrictionsRequest
from openapi_client.models.simple_user import SimpleUser
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_set_user_access_restrictions_request = {"users":["octocat"]} # ReposSetUserAccessRestrictionsRequest |  (optional)

    try:
        # Remove user access restrictions
        api_response = api_instance.repos_remove_user_access_restrictions(owner, repo, branch, repos_set_user_access_restrictions_request=repos_set_user_access_restrictions_request)
        print("The response of ReposApi->repos_remove_user_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_remove_user_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_set_user_access_restrictions_request** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional] 

### Return type

[**List[SimpleUser]**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_rename_branch**
> BranchWithProtection repos_rename_branch(owner, repo, branch, repos_rename_branch_request)

Rename a branch

Renames a branch in a repository.  **Note:** Although the API responds immediately, the branch rename process might take some extra time to complete in the background. You won't be able to push to the old branch name while the rename process is in progress. For more information, see \"[Renaming a branch](https://docs.github.com/enterprise-server@3.4/github/administering-a-repository/renaming-a-branch)\".  The permissions required to use this endpoint depends on whether you are renaming the default branch.  To rename a non-default branch:  * Users must have push access. * GitHub Apps must have the `contents:write` repository permission.  To rename the default branch:  * Users must have admin or owner permissions. * GitHub Apps must have the `administration:write` repository permission.

### Example


```python
import openapi_client
from openapi_client.models.branch_with_protection import BranchWithProtection
from openapi_client.models.repos_rename_branch_request import ReposRenameBranchRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_rename_branch_request = {"new_name":"my_renamed_branch"} # ReposRenameBranchRequest | 

    try:
        # Rename a branch
        api_response = api_instance.repos_rename_branch(owner, repo, branch, repos_rename_branch_request)
        print("The response of ReposApi->repos_rename_branch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_rename_branch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_rename_branch_request** | [**ReposRenameBranchRequest**](ReposRenameBranchRequest.md)|  | 

### Return type

[**BranchWithProtection**](BranchWithProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_replace_all_topics**
> Topic repos_replace_all_topics(owner, repo, repos_replace_all_topics_request)

Replace all repository topics



### Example


```python
import openapi_client
from openapi_client.models.repos_replace_all_topics_request import ReposReplaceAllTopicsRequest
from openapi_client.models.topic import Topic
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_replace_all_topics_request = {"names":["octocat","atom","electron","api"]} # ReposReplaceAllTopicsRequest | 

    try:
        # Replace all repository topics
        api_response = api_instance.repos_replace_all_topics(owner, repo, repos_replace_all_topics_request)
        print("The response of ReposApi->repos_replace_all_topics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_replace_all_topics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_replace_all_topics_request** | [**ReposReplaceAllTopicsRequest**](ReposReplaceAllTopicsRequest.md)|  | 

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_request_pages_build**
> PageBuildStatus repos_request_pages_build(owner, repo)

Request a GitHub Enterprise Server Pages build

You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.  Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.

### Example


```python
import openapi_client
from openapi_client.models.page_build_status import PageBuildStatus
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Request a GitHub Enterprise Server Pages build
        api_response = api_instance.repos_request_pages_build(owner, repo)
        print("The response of ReposApi->repos_request_pages_build:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_request_pages_build: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**PageBuildStatus**](PageBuildStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_set_admin_branch_protection**
> ProtectedBranchAdminEnforced repos_set_admin_branch_protection(owner, repo, branch)

Set admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.

### Example


```python
import openapi_client
from openapi_client.models.protected_branch_admin_enforced import ProtectedBranchAdminEnforced
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).

    try:
        # Set admin branch protection
        api_response = api_instance.repos_set_admin_branch_protection(owner, repo, branch)
        print("The response of ReposApi->repos_set_admin_branch_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_set_admin_branch_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_set_app_access_restrictions**
> List[Integration] repos_set_app_access_restrictions(owner, repo, branch, repos_set_app_access_restrictions_request=repos_set_app_access_restrictions_request)

Set app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.

### Example


```python
import openapi_client
from openapi_client.models.integration import Integration
from openapi_client.models.repos_set_app_access_restrictions_request import ReposSetAppAccessRestrictionsRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_set_app_access_restrictions_request = {"apps":["octoapp"]} # ReposSetAppAccessRestrictionsRequest |  (optional)

    try:
        # Set app access restrictions
        api_response = api_instance.repos_set_app_access_restrictions(owner, repo, branch, repos_set_app_access_restrictions_request=repos_set_app_access_restrictions_request)
        print("The response of ReposApi->repos_set_app_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_set_app_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_set_app_access_restrictions_request** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional] 

### Return type

[**List[Integration]**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_set_status_check_contexts**
> List[str] repos_set_status_check_contexts(owner, repo, branch, request_body=request_body)

Set status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    request_body = ["continuous-integration/travis-ci"] # List[str] |  (optional)

    try:
        # Set status check contexts
        api_response = api_instance.repos_set_status_check_contexts(owner, repo, branch, request_body=request_body)
        print("The response of ReposApi->repos_set_status_check_contexts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_set_status_check_contexts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **request_body** | [**List[str]**](str.md)|  | [optional] 

### Return type

**List[str]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_set_team_access_restrictions**
> List[Team] repos_set_team_access_restrictions(owner, repo, branch, request_body=request_body)

Set team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.

### Example


```python
import openapi_client
from openapi_client.models.team import Team
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    request_body = ["justice-league"] # List[str] |  (optional)

    try:
        # Set team access restrictions
        api_response = api_instance.repos_set_team_access_restrictions(owner, repo, branch, request_body=request_body)
        print("The response of ReposApi->repos_set_team_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_set_team_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **request_body** | [**List[str]**](str.md)|  | [optional] 

### Return type

[**List[Team]**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_set_user_access_restrictions**
> List[SimpleUser] repos_set_user_access_restrictions(owner, repo, branch, repos_set_user_access_restrictions_request=repos_set_user_access_restrictions_request)

Set user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.  | Type    | Description                                                                                                                   | | ------- | ----------------------------------------------------------------------------------------------------------------------------- | | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example


```python
import openapi_client
from openapi_client.models.repos_set_user_access_restrictions_request import ReposSetUserAccessRestrictionsRequest
from openapi_client.models.simple_user import SimpleUser
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_set_user_access_restrictions_request = {"users":["octocat"]} # ReposSetUserAccessRestrictionsRequest |  (optional)

    try:
        # Set user access restrictions
        api_response = api_instance.repos_set_user_access_restrictions(owner, repo, branch, repos_set_user_access_restrictions_request=repos_set_user_access_restrictions_request)
        print("The response of ReposApi->repos_set_user_access_restrictions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_set_user_access_restrictions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_set_user_access_restrictions_request** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional] 

### Return type

[**List[SimpleUser]**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_test_push_webhook**
> repos_test_push_webhook(owner, repo, hook_id)

Test the push repository webhook

This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.  **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Test the push repository webhook
        api_instance.repos_test_push_webhook(owner, repo, hook_id)
    except Exception as e:
        print("Exception when calling ReposApi->repos_test_push_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_transfer**
> MinimalRepository repos_transfer(owner, repo, repos_transfer_request)

Transfer a repository

A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/enterprise-server@3.4/articles/about-repository-transfers/).

### Example


```python
import openapi_client
from openapi_client.models.minimal_repository import MinimalRepository
from openapi_client.models.repos_transfer_request import ReposTransferRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_transfer_request = {"new_owner":"github","team_ids":[12,345]} # ReposTransferRequest | 

    try:
        # Transfer a repository
        api_response = api_instance.repos_transfer(owner, repo, repos_transfer_request)
        print("The response of ReposApi->repos_transfer:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_transfer: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_transfer_request** | [**ReposTransferRequest**](ReposTransferRequest.md)|  | 

### Return type

[**MinimalRepository**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update**
> FullRepository repos_update(owner, repo, repos_update_request=repos_update_request)

Update a repository

**Note**: To edit a repository's topics, use the [Replace all repository topics](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#replace-all-repository-topics) endpoint.

### Example


```python
import openapi_client
from openapi_client.models.full_repository import FullRepository
from openapi_client.models.repos_update_request import ReposUpdateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_update_request = {"description":"This is your first repository","has_issues":true,"has_projects":true,"has_wiki":true,"homepage":"https://github.com","name":"Hello-World","private":true} # ReposUpdateRequest |  (optional)

    try:
        # Update a repository
        api_response = api_instance.repos_update(owner, repo, repos_update_request=repos_update_request)
        print("The response of ReposApi->repos_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_update_request** | [**ReposUpdateRequest**](ReposUpdateRequest.md)|  | [optional] 

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**307** | Temporary Redirect |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_branch_protection**
> ProtectedBranch repos_update_branch_protection(owner, repo, branch, repos_update_branch_protection_request)

Update branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Protecting a branch requires admin or owner permissions to the repository.  **Note**: Passing new arrays of `users` and `teams` replaces their previous values.  **Note**: The list of users, apps, and teams in total is limited to 100 items.

### Example


```python
import openapi_client
from openapi_client.models.protected_branch import ProtectedBranch
from openapi_client.models.repos_update_branch_protection_request import ReposUpdateBranchProtectionRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_update_branch_protection_request = {"allow_deletions":true,"allow_force_pushes":true,"block_creations":true,"enforce_admins":true,"required_conversation_resolution":true,"required_linear_history":true,"required_pull_request_reviews":{"bypass_pull_request_allowances":{"teams":["justice-league"],"users":["octocat"]},"dismiss_stale_reviews":true,"dismissal_restrictions":{"teams":["justice-league"],"users":["octocat"]},"require_code_owner_reviews":true,"required_approving_review_count":2},"required_status_checks":{"contexts":["continuous-integration/travis-ci"],"strict":true},"restrictions":{"apps":["super-ci"],"teams":["justice-league"],"users":["octocat"]}} # ReposUpdateBranchProtectionRequest | 

    try:
        # Update branch protection
        api_response = api_instance.repos_update_branch_protection(owner, repo, branch, repos_update_branch_protection_request)
        print("The response of ReposApi->repos_update_branch_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_branch_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_update_branch_protection_request** | [**ReposUpdateBranchProtectionRequest**](ReposUpdateBranchProtectionRequest.md)|  | 

### Return type

[**ProtectedBranch**](ProtectedBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**403** | Forbidden |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_commit_comment**
> CommitComment repos_update_commit_comment(owner, repo, comment_id, repos_update_commit_comment_request)

Update a commit comment



### Example


```python
import openapi_client
from openapi_client.models.commit_comment import CommitComment
from openapi_client.models.repos_update_commit_comment_request import ReposUpdateCommitCommentRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    comment_id = 56 # int | The unique identifier of the comment.
    repos_update_commit_comment_request = {"body":"Nice change"} # ReposUpdateCommitCommentRequest | 

    try:
        # Update a commit comment
        api_response = api_instance.repos_update_commit_comment(owner, repo, comment_id, repos_update_commit_comment_request)
        print("The response of ReposApi->repos_update_commit_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_commit_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **comment_id** | **int**| The unique identifier of the comment. | 
 **repos_update_commit_comment_request** | [**ReposUpdateCommitCommentRequest**](ReposUpdateCommitCommentRequest.md)|  | 

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_deployment_branch_policy**
> DeploymentBranchPolicy repos_update_deployment_branch_policy(owner, repo, environment_name, branch_policy_id, deployment_branch_policy_name_pattern)

Update a deployment branch policy

Updates a deployment branch policy for an environment.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.deployment_branch_policy import DeploymentBranchPolicy
from openapi_client.models.deployment_branch_policy_name_pattern import DeploymentBranchPolicyNamePattern
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    environment_name = 'environment_name_example' # str | The name of the environment.
    branch_policy_id = 56 # int | The unique identifier of the branch policy.
    deployment_branch_policy_name_pattern = {"name":"release/*"} # DeploymentBranchPolicyNamePattern | 

    try:
        # Update a deployment branch policy
        api_response = api_instance.repos_update_deployment_branch_policy(owner, repo, environment_name, branch_policy_id, deployment_branch_policy_name_pattern)
        print("The response of ReposApi->repos_update_deployment_branch_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_deployment_branch_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **environment_name** | **str**| The name of the environment. | 
 **branch_policy_id** | **int**| The unique identifier of the branch policy. | 
 **deployment_branch_policy_name_pattern** | [**DeploymentBranchPolicyNamePattern**](DeploymentBranchPolicyNamePattern.md)|  | 

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_information_about_pages_site**
> repos_update_information_about_pages_site(owner, repo, repos_update_information_about_pages_site_request)

Update information about a GitHub Enterprise Server Pages site

Updates information for a GitHub Enterprise Server Pages site. For more information, see \"[About GitHub Pages](/github/working-with-github-pages/about-github-pages).  To use this endpoint, you must be a repository administrator, maintainer, or have the 'manage GitHub Pages settings' permission. A token with the `repo` scope or Pages write permission is required. GitHub Apps must have the `administration:write` and `pages:write` permissions.

### Example


```python
import openapi_client
from openapi_client.models.repos_update_information_about_pages_site_request import ReposUpdateInformationAboutPagesSiteRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    repos_update_information_about_pages_site_request = {"cname":"octocatblog.com","source":{"branch":"main","path":"/"}} # ReposUpdateInformationAboutPagesSiteRequest | 

    try:
        # Update information about a GitHub Enterprise Server Pages site
        api_instance.repos_update_information_about_pages_site(owner, repo, repos_update_information_about_pages_site_request)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_information_about_pages_site: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **repos_update_information_about_pages_site_request** | [**ReposUpdateInformationAboutPagesSiteRequest**](ReposUpdateInformationAboutPagesSiteRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |
**400** | Bad Request |  -  |
**409** | Conflict |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_invitation**
> RepositoryInvitation repos_update_invitation(owner, repo, invitation_id, repos_update_invitation_request=repos_update_invitation_request)

Update a repository invitation



### Example


```python
import openapi_client
from openapi_client.models.repos_update_invitation_request import ReposUpdateInvitationRequest
from openapi_client.models.repository_invitation import RepositoryInvitation
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    invitation_id = 56 # int | The unique identifier of the invitation.
    repos_update_invitation_request = {"permissions":"write"} # ReposUpdateInvitationRequest |  (optional)

    try:
        # Update a repository invitation
        api_response = api_instance.repos_update_invitation(owner, repo, invitation_id, repos_update_invitation_request=repos_update_invitation_request)
        print("The response of ReposApi->repos_update_invitation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_invitation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **invitation_id** | **int**| The unique identifier of the invitation. | 
 **repos_update_invitation_request** | [**ReposUpdateInvitationRequest**](ReposUpdateInvitationRequest.md)|  | [optional] 

### Return type

[**RepositoryInvitation**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_pull_request_review_protection**
> ProtectedBranchPullRequestReview repos_update_pull_request_review_protection(owner, repo, branch, repos_update_pull_request_review_protection_request=repos_update_pull_request_review_protection_request)

Update pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.  **Note**: Passing new arrays of `users` and `teams` replaces their previous values.

### Example


```python
import openapi_client
from openapi_client.models.protected_branch_pull_request_review import ProtectedBranchPullRequestReview
from openapi_client.models.repos_update_pull_request_review_protection_request import ReposUpdatePullRequestReviewProtectionRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_update_pull_request_review_protection_request = {"bypass_pull_request_allowances":{"apps":["octoapp"],"teams":["justice-league"],"users":["octocat"]},"dismiss_stale_reviews":true,"dismissal_restrictions":{"apps":["octoapp"],"teams":["justice-league"],"users":["octocat"]},"require_code_owner_reviews":true,"required_approving_review_count":2} # ReposUpdatePullRequestReviewProtectionRequest |  (optional)

    try:
        # Update pull request review protection
        api_response = api_instance.repos_update_pull_request_review_protection(owner, repo, branch, repos_update_pull_request_review_protection_request=repos_update_pull_request_review_protection_request)
        print("The response of ReposApi->repos_update_pull_request_review_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_pull_request_review_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_update_pull_request_review_protection_request** | [**ReposUpdatePullRequestReviewProtectionRequest**](ReposUpdatePullRequestReviewProtectionRequest.md)|  | [optional] 

### Return type

[**ProtectedBranchPullRequestReview**](ProtectedBranchPullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_release**
> Release repos_update_release(owner, repo, release_id, repos_update_release_request=repos_update_release_request)

Update a release

Users with push access to the repository can edit a release.

### Example


```python
import openapi_client
from openapi_client.models.release import Release
from openapi_client.models.repos_update_release_request import ReposUpdateReleaseRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    release_id = 56 # int | The unique identifier of the release.
    repos_update_release_request = {"body":"Description of the release","draft":false,"name":"v1.0.0","prerelease":false,"tag_name":"v1.0.0","target_commitish":"master"} # ReposUpdateReleaseRequest |  (optional)

    try:
        # Update a release
        api_response = api_instance.repos_update_release(owner, repo, release_id, repos_update_release_request=repos_update_release_request)
        print("The response of ReposApi->repos_update_release:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_release: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **release_id** | **int**| The unique identifier of the release. | 
 **repos_update_release_request** | [**ReposUpdateReleaseRequest**](ReposUpdateReleaseRequest.md)|  | [optional] 

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_release_asset**
> ReleaseAsset repos_update_release_asset(owner, repo, asset_id, repos_update_release_asset_request=repos_update_release_asset_request)

Update a release asset

Users with push access to the repository can edit a release asset.

### Example


```python
import openapi_client
from openapi_client.models.release_asset import ReleaseAsset
from openapi_client.models.repos_update_release_asset_request import ReposUpdateReleaseAssetRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    asset_id = 56 # int | The unique identifier of the asset.
    repos_update_release_asset_request = {"label":"Mac binary","name":"foo-1.0.0-osx.zip"} # ReposUpdateReleaseAssetRequest |  (optional)

    try:
        # Update a release asset
        api_response = api_instance.repos_update_release_asset(owner, repo, asset_id, repos_update_release_asset_request=repos_update_release_asset_request)
        print("The response of ReposApi->repos_update_release_asset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_release_asset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **asset_id** | **int**| The unique identifier of the asset. | 
 **repos_update_release_asset_request** | [**ReposUpdateReleaseAssetRequest**](ReposUpdateReleaseAssetRequest.md)|  | [optional] 

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_status_check_protection**
> StatusCheckPolicy repos_update_status_check_protection(owner, repo, branch, repos_update_status_check_protection_request=repos_update_status_check_protection_request)

Update status check protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub's products](https://docs.github.com/enterprise-server@3.4/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.

### Example


```python
import openapi_client
from openapi_client.models.repos_update_status_check_protection_request import ReposUpdateStatusCheckProtectionRequest
from openapi_client.models.status_check_policy import StatusCheckPolicy
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    branch = 'branch_example' # str | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql).
    repos_update_status_check_protection_request = {"contexts":["continuous-integration/travis-ci"],"strict":true} # ReposUpdateStatusCheckProtectionRequest |  (optional)

    try:
        # Update status check protection
        api_response = api_instance.repos_update_status_check_protection(owner, repo, branch, repos_update_status_check_protection_request=repos_update_status_check_protection_request)
        print("The response of ReposApi->repos_update_status_check_protection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_status_check_protection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **branch** | **str**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/enterprise-server@3.4/graphql). | 
 **repos_update_status_check_protection_request** | [**ReposUpdateStatusCheckProtectionRequest**](ReposUpdateStatusCheckProtectionRequest.md)|  | [optional] 

### Return type

[**StatusCheckPolicy**](StatusCheckPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_webhook**
> Hook repos_update_webhook(owner, repo, hook_id, repos_update_webhook_request)

Update a repository webhook

Updates a webhook configured in a repository. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use \"[Update a webhook configuration for a repository](/rest/reference/repos#update-a-webhook-configuration-for-a-repository).\"

### Example


```python
import openapi_client
from openapi_client.models.hook import Hook
from openapi_client.models.repos_update_webhook_request import ReposUpdateWebhookRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    repos_update_webhook_request = {"active":true,"add_events":["pull_request"]} # ReposUpdateWebhookRequest | 

    try:
        # Update a repository webhook
        api_response = api_instance.repos_update_webhook(owner, repo, hook_id, repos_update_webhook_request)
        print("The response of ReposApi->repos_update_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **repos_update_webhook_request** | [**ReposUpdateWebhookRequest**](ReposUpdateWebhookRequest.md)|  | 

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**404** | Resource not found |  -  |
**422** | Validation failed, or the endpoint has been spammed. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_update_webhook_config_for_repo**
> WebhookConfig repos_update_webhook_config_for_repo(owner, repo, hook_id, repos_update_webhook_config_for_repo_request=repos_update_webhook_config_for_repo_request)

Update a webhook configuration for a repository

Updates the webhook configuration for a repository. To update more information about the webhook, including the `active` state and `events`, use \"[Update a repository webhook](/rest/reference/orgs#update-a-repository-webhook).\"  Access tokens must have the `write:repo_hook` or `repo` scope, and GitHub Apps must have the `repository_hooks:write` permission.

### Example


```python
import openapi_client
from openapi_client.models.repos_update_webhook_config_for_repo_request import ReposUpdateWebhookConfigForRepoRequest
from openapi_client.models.webhook_config import WebhookConfig
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    hook_id = 56 # int | The unique identifier of the hook.
    repos_update_webhook_config_for_repo_request = {"content_type":"json","url":"https://example.com/webhook"} # ReposUpdateWebhookConfigForRepoRequest |  (optional)

    try:
        # Update a webhook configuration for a repository
        api_response = api_instance.repos_update_webhook_config_for_repo(owner, repo, hook_id, repos_update_webhook_config_for_repo_request=repos_update_webhook_config_for_repo_request)
        print("The response of ReposApi->repos_update_webhook_config_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_update_webhook_config_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **hook_id** | **int**| The unique identifier of the hook. | 
 **repos_update_webhook_config_for_repo_request** | [**ReposUpdateWebhookConfigForRepoRequest**](ReposUpdateWebhookConfigForRepoRequest.md)|  | [optional] 

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **repos_upload_release_asset**
> ReleaseAsset repos_upload_release_asset(owner, repo, release_id, name, label=label, body=body)

Upload a release asset

This endpoint makes use of [a Hypermedia relation](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the `upload_url` returned in the response of the [Create a release endpoint](https://docs.github.com/enterprise-server@3.4/rest/releases/releases#create-a-release) to upload a release asset.  You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.  Most libraries will set the required `Content-Length` header automatically. Use the required `Content-Type` header to provide the media type of the asset. For a list of media types, see [Media Types](https://www.iana.org/assignments/media-types/media-types.xhtml). For example:   `application/zip`  GitHub Enterprise Server expects the asset data in its raw binary form, rather than JSON. You will send the raw binary content of the asset as the request body. Everything else about the endpoint is the same as the rest of the API. For example, you'll still need to pass your authentication to be able to upload an asset.  When an upstream failure occurs, you will receive a `502 Bad Gateway` status. This may leave an empty asset with a state of `starter`. It can be safely deleted.  **Notes:** *   GitHub Enterprise Server renames asset filenames that have special characters, non-alphanumeric characters, and leading or trailing periods. The \"[List assets for a release](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#list-assets-for-a-release)\" endpoint lists the renamed filenames. For more information and help, contact [GitHub Enterprise Server Support](https://support.github.com/contact?tags=dotcom-rest-api). *   To find the `release_id` query the [`GET /repos/{owner}/{repo}/releases/latest` endpoint](https://docs.github.com/enterprise-server@3.4/rest/releases/releases#get-the-latest-release).  *   If you upload an asset with the same filename as another uploaded asset, you'll receive an error and must delete the old file before you can re-upload the new asset.

### Example


```python
import openapi_client
from openapi_client.models.release_asset import ReleaseAsset
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ReposApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    release_id = 56 # int | The unique identifier of the release.
    name = 'name_example' # str | 
    label = 'label_example' # str |  (optional)
    body = @example.zip # bytearray |  (optional)

    try:
        # Upload a release asset
        api_response = api_instance.repos_upload_release_asset(owner, repo, release_id, name, label=label, body=body)
        print("The response of ReposApi->repos_upload_release_asset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReposApi->repos_upload_release_asset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **release_id** | **int**| The unique identifier of the release. | 
 **name** | **str**|  | 
 **label** | **str**|  | [optional] 
 **body** | **bytearray**|  | [optional] 

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response for successful upload |  -  |
**422** | Response if you upload an asset with the same filename as another uploaded asset |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

