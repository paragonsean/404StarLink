# openapi_client.EnterpriseAdminApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterprise_admin_add_authorized_ssh_key**](EnterpriseAdminApi.md#enterprise_admin_add_authorized_ssh_key) | **POST** /setup/api/settings/authorized-keys | Add an authorized SSH key
[**enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise) | **POST** /enterprises/{enterprise}/actions/runners/{runner_id}/labels | Add custom labels to a self-hosted runner for an enterprise
[**enterprise_admin_add_org_access_to_self_hosted_runner_group_in_enterprise**](EnterpriseAdminApi.md#enterprise_admin_add_org_access_to_self_hosted_runner_group_in_enterprise) | **PUT** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/organizations/{org_id} | Add organization access to a self-hosted runner group in an enterprise
[**enterprise_admin_add_self_hosted_runner_to_group_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_add_self_hosted_runner_to_group_for_enterprise) | **PUT** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/runners/{runner_id} | Add a self-hosted runner to a group for an enterprise
[**enterprise_admin_create_enterprise_server_license**](EnterpriseAdminApi.md#enterprise_admin_create_enterprise_server_license) | **POST** /setup/api/start | Create a GitHub license
[**enterprise_admin_create_global_webhook**](EnterpriseAdminApi.md#enterprise_admin_create_global_webhook) | **POST** /admin/hooks | Create a global webhook
[**enterprise_admin_create_impersonation_o_auth_token**](EnterpriseAdminApi.md#enterprise_admin_create_impersonation_o_auth_token) | **POST** /admin/users/{username}/authorizations | Create an impersonation OAuth token
[**enterprise_admin_create_org**](EnterpriseAdminApi.md#enterprise_admin_create_org) | **POST** /admin/organizations | Create an organization
[**enterprise_admin_create_pre_receive_environment**](EnterpriseAdminApi.md#enterprise_admin_create_pre_receive_environment) | **POST** /admin/pre-receive-environments | Create a pre-receive environment
[**enterprise_admin_create_pre_receive_hook**](EnterpriseAdminApi.md#enterprise_admin_create_pre_receive_hook) | **POST** /admin/pre-receive-hooks | Create a pre-receive hook
[**enterprise_admin_create_registration_token_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_create_registration_token_for_enterprise) | **POST** /enterprises/{enterprise}/actions/runners/registration-token | Create a registration token for an enterprise
[**enterprise_admin_create_remove_token_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_create_remove_token_for_enterprise) | **POST** /enterprises/{enterprise}/actions/runners/remove-token | Create a remove token for an enterprise
[**enterprise_admin_create_self_hosted_runner_group_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_create_self_hosted_runner_group_for_enterprise) | **POST** /enterprises/{enterprise}/actions/runner-groups | Create a self-hosted runner group for an enterprise
[**enterprise_admin_create_user**](EnterpriseAdminApi.md#enterprise_admin_create_user) | **POST** /admin/users | Create a user
[**enterprise_admin_delete_global_webhook**](EnterpriseAdminApi.md#enterprise_admin_delete_global_webhook) | **DELETE** /admin/hooks/{hook_id} | Delete a global webhook
[**enterprise_admin_delete_impersonation_o_auth_token**](EnterpriseAdminApi.md#enterprise_admin_delete_impersonation_o_auth_token) | **DELETE** /admin/users/{username}/authorizations | Delete an impersonation OAuth token
[**enterprise_admin_delete_personal_access_token**](EnterpriseAdminApi.md#enterprise_admin_delete_personal_access_token) | **DELETE** /admin/tokens/{token_id} | Delete a personal access token
[**enterprise_admin_delete_pre_receive_environment**](EnterpriseAdminApi.md#enterprise_admin_delete_pre_receive_environment) | **DELETE** /admin/pre-receive-environments/{pre_receive_environment_id} | Delete a pre-receive environment
[**enterprise_admin_delete_pre_receive_hook**](EnterpriseAdminApi.md#enterprise_admin_delete_pre_receive_hook) | **DELETE** /admin/pre-receive-hooks/{pre_receive_hook_id} | Delete a pre-receive hook
[**enterprise_admin_delete_public_key**](EnterpriseAdminApi.md#enterprise_admin_delete_public_key) | **DELETE** /admin/keys/{key_ids} | Delete a public key
[**enterprise_admin_delete_self_hosted_runner_from_enterprise**](EnterpriseAdminApi.md#enterprise_admin_delete_self_hosted_runner_from_enterprise) | **DELETE** /enterprises/{enterprise}/actions/runners/{runner_id} | Delete a self-hosted runner from an enterprise
[**enterprise_admin_delete_self_hosted_runner_group_from_enterprise**](EnterpriseAdminApi.md#enterprise_admin_delete_self_hosted_runner_group_from_enterprise) | **DELETE** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id} | Delete a self-hosted runner group from an enterprise
[**enterprise_admin_delete_user**](EnterpriseAdminApi.md#enterprise_admin_delete_user) | **DELETE** /admin/users/{username} | Delete a user
[**enterprise_admin_demote_site_administrator**](EnterpriseAdminApi.md#enterprise_admin_demote_site_administrator) | **DELETE** /users/{username}/site_admin | Demote a site administrator
[**enterprise_admin_disable_selected_organization_github_actions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_disable_selected_organization_github_actions_enterprise) | **DELETE** /enterprises/{enterprise}/actions/permissions/organizations/{org_id} | Disable a selected organization for GitHub Actions in an enterprise
[**enterprise_admin_enable_or_disable_maintenance_mode**](EnterpriseAdminApi.md#enterprise_admin_enable_or_disable_maintenance_mode) | **POST** /setup/api/maintenance | Enable or disable maintenance mode
[**enterprise_admin_enable_selected_organization_github_actions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_enable_selected_organization_github_actions_enterprise) | **PUT** /enterprises/{enterprise}/actions/permissions/organizations/{org_id} | Enable a selected organization for GitHub Actions in an enterprise
[**enterprise_admin_get_all_authorized_ssh_keys**](EnterpriseAdminApi.md#enterprise_admin_get_all_authorized_ssh_keys) | **GET** /setup/api/settings/authorized-keys | Get all authorized SSH keys
[**enterprise_admin_get_all_stats**](EnterpriseAdminApi.md#enterprise_admin_get_all_stats) | **GET** /enterprise/stats/all | Get all statistics
[**enterprise_admin_get_allowed_actions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_get_allowed_actions_enterprise) | **GET** /enterprises/{enterprise}/actions/permissions/selected-actions | Get allowed actions for an enterprise
[**enterprise_admin_get_announcement**](EnterpriseAdminApi.md#enterprise_admin_get_announcement) | **GET** /enterprise/announcement | Get the global announcement banner
[**enterprise_admin_get_audit_log**](EnterpriseAdminApi.md#enterprise_admin_get_audit_log) | **GET** /enterprises/{enterprise}/audit-log | Get the audit log for an enterprise
[**enterprise_admin_get_comment_stats**](EnterpriseAdminApi.md#enterprise_admin_get_comment_stats) | **GET** /enterprise/stats/comments | Get comment statistics
[**enterprise_admin_get_configuration_status**](EnterpriseAdminApi.md#enterprise_admin_get_configuration_status) | **GET** /setup/api/configcheck | Get the configuration status
[**enterprise_admin_get_download_status_for_pre_receive_environment**](EnterpriseAdminApi.md#enterprise_admin_get_download_status_for_pre_receive_environment) | **GET** /admin/pre-receive-environments/{pre_receive_environment_id}/downloads/latest | Get the download status for a pre-receive environment
[**enterprise_admin_get_gist_stats**](EnterpriseAdminApi.md#enterprise_admin_get_gist_stats) | **GET** /enterprise/stats/gists | Get gist statistics
[**enterprise_admin_get_github_actions_permissions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_get_github_actions_permissions_enterprise) | **GET** /enterprises/{enterprise}/actions/permissions | Get GitHub Actions permissions for an enterprise
[**enterprise_admin_get_global_webhook**](EnterpriseAdminApi.md#enterprise_admin_get_global_webhook) | **GET** /admin/hooks/{hook_id} | Get a global webhook
[**enterprise_admin_get_hooks_stats**](EnterpriseAdminApi.md#enterprise_admin_get_hooks_stats) | **GET** /enterprise/stats/hooks | Get hooks statistics
[**enterprise_admin_get_issue_stats**](EnterpriseAdminApi.md#enterprise_admin_get_issue_stats) | **GET** /enterprise/stats/issues | Get issue statistics
[**enterprise_admin_get_license_information**](EnterpriseAdminApi.md#enterprise_admin_get_license_information) | **GET** /enterprise/settings/license | Get license information
[**enterprise_admin_get_maintenance_status**](EnterpriseAdminApi.md#enterprise_admin_get_maintenance_status) | **GET** /setup/api/maintenance | Get the maintenance status
[**enterprise_admin_get_milestone_stats**](EnterpriseAdminApi.md#enterprise_admin_get_milestone_stats) | **GET** /enterprise/stats/milestones | Get milestone statistics
[**enterprise_admin_get_org_stats**](EnterpriseAdminApi.md#enterprise_admin_get_org_stats) | **GET** /enterprise/stats/orgs | Get organization statistics
[**enterprise_admin_get_pages_stats**](EnterpriseAdminApi.md#enterprise_admin_get_pages_stats) | **GET** /enterprise/stats/pages | Get pages statistics
[**enterprise_admin_get_pre_receive_environment**](EnterpriseAdminApi.md#enterprise_admin_get_pre_receive_environment) | **GET** /admin/pre-receive-environments/{pre_receive_environment_id} | Get a pre-receive environment
[**enterprise_admin_get_pre_receive_hook**](EnterpriseAdminApi.md#enterprise_admin_get_pre_receive_hook) | **GET** /admin/pre-receive-hooks/{pre_receive_hook_id} | Get a pre-receive hook
[**enterprise_admin_get_pre_receive_hook_for_org**](EnterpriseAdminApi.md#enterprise_admin_get_pre_receive_hook_for_org) | **GET** /orgs/{org}/pre-receive-hooks/{pre_receive_hook_id} | Get a pre-receive hook for an organization
[**enterprise_admin_get_pre_receive_hook_for_repo**](EnterpriseAdminApi.md#enterprise_admin_get_pre_receive_hook_for_repo) | **GET** /repos/{owner}/{repo}/pre-receive-hooks/{pre_receive_hook_id} | Get a pre-receive hook for a repository
[**enterprise_admin_get_pull_request_stats**](EnterpriseAdminApi.md#enterprise_admin_get_pull_request_stats) | **GET** /enterprise/stats/pulls | Get pull request statistics
[**enterprise_admin_get_repo_stats**](EnterpriseAdminApi.md#enterprise_admin_get_repo_stats) | **GET** /enterprise/stats/repos | Get repository statistics
[**enterprise_admin_get_self_hosted_runner_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_get_self_hosted_runner_for_enterprise) | **GET** /enterprises/{enterprise}/actions/runners/{runner_id} | Get a self-hosted runner for an enterprise
[**enterprise_admin_get_self_hosted_runner_group_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_get_self_hosted_runner_group_for_enterprise) | **GET** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id} | Get a self-hosted runner group for an enterprise
[**enterprise_admin_get_settings**](EnterpriseAdminApi.md#enterprise_admin_get_settings) | **GET** /setup/api/settings | Get settings
[**enterprise_admin_get_user_stats**](EnterpriseAdminApi.md#enterprise_admin_get_user_stats) | **GET** /enterprise/stats/users | Get users statistics
[**enterprise_admin_list_global_webhooks**](EnterpriseAdminApi.md#enterprise_admin_list_global_webhooks) | **GET** /admin/hooks | List global webhooks
[**enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise) | **GET** /enterprises/{enterprise}/actions/runners/{runner_id}/labels | List labels for a self-hosted runner for an enterprise
[**enterprise_admin_list_org_access_to_self_hosted_runner_group_in_enterprise**](EnterpriseAdminApi.md#enterprise_admin_list_org_access_to_self_hosted_runner_group_in_enterprise) | **GET** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/organizations | List organization access to a self-hosted runner group in an enterprise
[**enterprise_admin_list_personal_access_tokens**](EnterpriseAdminApi.md#enterprise_admin_list_personal_access_tokens) | **GET** /admin/tokens | List personal access tokens
[**enterprise_admin_list_pre_receive_environments**](EnterpriseAdminApi.md#enterprise_admin_list_pre_receive_environments) | **GET** /admin/pre-receive-environments | List pre-receive environments
[**enterprise_admin_list_pre_receive_hooks**](EnterpriseAdminApi.md#enterprise_admin_list_pre_receive_hooks) | **GET** /admin/pre-receive-hooks | List pre-receive hooks
[**enterprise_admin_list_pre_receive_hooks_for_org**](EnterpriseAdminApi.md#enterprise_admin_list_pre_receive_hooks_for_org) | **GET** /orgs/{org}/pre-receive-hooks | List pre-receive hooks for an organization
[**enterprise_admin_list_pre_receive_hooks_for_repo**](EnterpriseAdminApi.md#enterprise_admin_list_pre_receive_hooks_for_repo) | **GET** /repos/{owner}/{repo}/pre-receive-hooks | List pre-receive hooks for a repository
[**enterprise_admin_list_public_keys**](EnterpriseAdminApi.md#enterprise_admin_list_public_keys) | **GET** /admin/keys | List public keys
[**enterprise_admin_list_runner_applications_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_list_runner_applications_for_enterprise) | **GET** /enterprises/{enterprise}/actions/runners/downloads | List runner applications for an enterprise
[**enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise) | **GET** /enterprises/{enterprise}/actions/permissions/organizations | List selected organizations enabled for GitHub Actions in an enterprise
[**enterprise_admin_list_self_hosted_runner_groups_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_list_self_hosted_runner_groups_for_enterprise) | **GET** /enterprises/{enterprise}/actions/runner-groups | List self-hosted runner groups for an enterprise
[**enterprise_admin_list_self_hosted_runners_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_list_self_hosted_runners_for_enterprise) | **GET** /enterprises/{enterprise}/actions/runners | List self-hosted runners for an enterprise
[**enterprise_admin_list_self_hosted_runners_in_group_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_list_self_hosted_runners_in_group_for_enterprise) | **GET** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/runners | List self-hosted runners in a group for an enterprise
[**enterprise_admin_ping_global_webhook**](EnterpriseAdminApi.md#enterprise_admin_ping_global_webhook) | **POST** /admin/hooks/{hook_id}/pings | Ping a global webhook
[**enterprise_admin_promote_user_to_be_site_administrator**](EnterpriseAdminApi.md#enterprise_admin_promote_user_to_be_site_administrator) | **PUT** /users/{username}/site_admin | Promote a user to be a site administrator
[**enterprise_admin_remove_all_custom_labels_from_self_hosted_runner_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_remove_all_custom_labels_from_self_hosted_runner_for_enterprise) | **DELETE** /enterprises/{enterprise}/actions/runners/{runner_id}/labels | Remove all custom labels from a self-hosted runner for an enterprise
[**enterprise_admin_remove_announcement**](EnterpriseAdminApi.md#enterprise_admin_remove_announcement) | **DELETE** /enterprise/announcement | Remove the global announcement banner
[**enterprise_admin_remove_authorized_ssh_key**](EnterpriseAdminApi.md#enterprise_admin_remove_authorized_ssh_key) | **DELETE** /setup/api/settings/authorized-keys | Remove an authorized SSH key
[**enterprise_admin_remove_custom_label_from_self_hosted_runner_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_remove_custom_label_from_self_hosted_runner_for_enterprise) | **DELETE** /enterprises/{enterprise}/actions/runners/{runner_id}/labels/{name} | Remove a custom label from a self-hosted runner for an enterprise
[**enterprise_admin_remove_org_access_to_self_hosted_runner_group_in_enterprise**](EnterpriseAdminApi.md#enterprise_admin_remove_org_access_to_self_hosted_runner_group_in_enterprise) | **DELETE** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/organizations/{org_id} | Remove organization access to a self-hosted runner group in an enterprise
[**enterprise_admin_remove_pre_receive_hook_enforcement_for_org**](EnterpriseAdminApi.md#enterprise_admin_remove_pre_receive_hook_enforcement_for_org) | **DELETE** /orgs/{org}/pre-receive-hooks/{pre_receive_hook_id} | Remove pre-receive hook enforcement for an organization
[**enterprise_admin_remove_pre_receive_hook_enforcement_for_repo**](EnterpriseAdminApi.md#enterprise_admin_remove_pre_receive_hook_enforcement_for_repo) | **DELETE** /repos/{owner}/{repo}/pre-receive-hooks/{pre_receive_hook_id} | Remove pre-receive hook enforcement for a repository
[**enterprise_admin_remove_self_hosted_runner_from_group_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_remove_self_hosted_runner_from_group_for_enterprise) | **DELETE** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/runners/{runner_id} | Remove a self-hosted runner from a group for an enterprise
[**enterprise_admin_set_allowed_actions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_set_allowed_actions_enterprise) | **PUT** /enterprises/{enterprise}/actions/permissions/selected-actions | Set allowed actions for an enterprise
[**enterprise_admin_set_announcement**](EnterpriseAdminApi.md#enterprise_admin_set_announcement) | **PATCH** /enterprise/announcement | Set the global announcement banner
[**enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise) | **PUT** /enterprises/{enterprise}/actions/runners/{runner_id}/labels | Set custom labels for a self-hosted runner for an enterprise
[**enterprise_admin_set_github_actions_permissions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_set_github_actions_permissions_enterprise) | **PUT** /enterprises/{enterprise}/actions/permissions | Set GitHub Actions permissions for an enterprise
[**enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise**](EnterpriseAdminApi.md#enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise) | **PUT** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/organizations | Set organization access for a self-hosted runner group in an enterprise
[**enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise**](EnterpriseAdminApi.md#enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise) | **PUT** /enterprises/{enterprise}/actions/permissions/organizations | Set selected organizations enabled for GitHub Actions in an enterprise
[**enterprise_admin_set_self_hosted_runners_in_group_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_set_self_hosted_runners_in_group_for_enterprise) | **PUT** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id}/runners | Set self-hosted runners in a group for an enterprise
[**enterprise_admin_set_settings**](EnterpriseAdminApi.md#enterprise_admin_set_settings) | **PUT** /setup/api/settings | Set settings
[**enterprise_admin_start_configuration_process**](EnterpriseAdminApi.md#enterprise_admin_start_configuration_process) | **POST** /setup/api/configure | Start a configuration process
[**enterprise_admin_start_pre_receive_environment_download**](EnterpriseAdminApi.md#enterprise_admin_start_pre_receive_environment_download) | **POST** /admin/pre-receive-environments/{pre_receive_environment_id}/downloads | Start a pre-receive environment download
[**enterprise_admin_suspend_user**](EnterpriseAdminApi.md#enterprise_admin_suspend_user) | **PUT** /users/{username}/suspended | Suspend a user
[**enterprise_admin_sync_ldap_mapping_for_team**](EnterpriseAdminApi.md#enterprise_admin_sync_ldap_mapping_for_team) | **POST** /admin/ldap/teams/{team_id}/sync | Sync LDAP mapping for a team
[**enterprise_admin_sync_ldap_mapping_for_user**](EnterpriseAdminApi.md#enterprise_admin_sync_ldap_mapping_for_user) | **POST** /admin/ldap/users/{username}/sync | Sync LDAP mapping for a user
[**enterprise_admin_unsuspend_user**](EnterpriseAdminApi.md#enterprise_admin_unsuspend_user) | **DELETE** /users/{username}/suspended | Unsuspend a user
[**enterprise_admin_update_global_webhook**](EnterpriseAdminApi.md#enterprise_admin_update_global_webhook) | **PATCH** /admin/hooks/{hook_id} | Update a global webhook
[**enterprise_admin_update_ldap_mapping_for_team**](EnterpriseAdminApi.md#enterprise_admin_update_ldap_mapping_for_team) | **PATCH** /admin/ldap/teams/{team_id}/mapping | Update LDAP mapping for a team
[**enterprise_admin_update_ldap_mapping_for_user**](EnterpriseAdminApi.md#enterprise_admin_update_ldap_mapping_for_user) | **PATCH** /admin/ldap/users/{username}/mapping | Update LDAP mapping for a user
[**enterprise_admin_update_org_name**](EnterpriseAdminApi.md#enterprise_admin_update_org_name) | **PATCH** /admin/organizations/{org} | Update an organization name
[**enterprise_admin_update_pre_receive_environment**](EnterpriseAdminApi.md#enterprise_admin_update_pre_receive_environment) | **PATCH** /admin/pre-receive-environments/{pre_receive_environment_id} | Update a pre-receive environment
[**enterprise_admin_update_pre_receive_hook**](EnterpriseAdminApi.md#enterprise_admin_update_pre_receive_hook) | **PATCH** /admin/pre-receive-hooks/{pre_receive_hook_id} | Update a pre-receive hook
[**enterprise_admin_update_pre_receive_hook_enforcement_for_org**](EnterpriseAdminApi.md#enterprise_admin_update_pre_receive_hook_enforcement_for_org) | **PATCH** /orgs/{org}/pre-receive-hooks/{pre_receive_hook_id} | Update pre-receive hook enforcement for an organization
[**enterprise_admin_update_pre_receive_hook_enforcement_for_repo**](EnterpriseAdminApi.md#enterprise_admin_update_pre_receive_hook_enforcement_for_repo) | **PATCH** /repos/{owner}/{repo}/pre-receive-hooks/{pre_receive_hook_id} | Update pre-receive hook enforcement for a repository
[**enterprise_admin_update_self_hosted_runner_group_for_enterprise**](EnterpriseAdminApi.md#enterprise_admin_update_self_hosted_runner_group_for_enterprise) | **PATCH** /enterprises/{enterprise}/actions/runner-groups/{runner_group_id} | Update a self-hosted runner group for an enterprise
[**enterprise_admin_update_username_for_user**](EnterpriseAdminApi.md#enterprise_admin_update_username_for_user) | **PATCH** /admin/users/{username} | Update the username for a user
[**enterprise_admin_upgrade_license**](EnterpriseAdminApi.md#enterprise_admin_upgrade_license) | **POST** /setup/api/upgrade | Upgrade a license


# **enterprise_admin_add_authorized_ssh_key**
> List[SshKey] enterprise_admin_add_authorized_ssh_key(authorized_key)

Add an authorized SSH key

**Note:** The request body for this operation must be submitted as `application/x-www-form-urlencoded` data. You can submit a parameter value as a string, or you can use a tool such as `curl` to submit a parameter value as the contents of a text file. For more information, see the [`curl` documentation](https://curl.se/docs/manpage.html#--data-urlencode).

### Example


```python
import openapi_client
from openapi_client.models.ssh_key import SshKey
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    authorized_key = 'authorized_key_example' # str | The public SSH key.

    try:
        # Add an authorized SSH key
        api_response = api_instance.enterprise_admin_add_authorized_ssh_key(authorized_key)
        print("The response of EnterpriseAdminApi->enterprise_admin_add_authorized_ssh_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_add_authorized_ssh_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorized_key** | **str**| The public SSH key. | 

### Return type

[**List[SshKey]**](SshKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise(enterprise, runner_id, enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request)

Add custom labels to a self-hosted runner for an enterprise

Add custom labels to a self-hosted runner configured in an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request import EnterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseRequest
from openapi_client.models.enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response import EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request = {"labels":["gpu","accelerated"]} # EnterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseRequest | 

    try:
        # Add custom labels to a self-hosted runner for an enterprise
        api_response = api_instance.enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise(enterprise, runner_id, enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 
 **enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request** | [**EnterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseRequest**](EnterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseRequest.md)|  | 

### Return type

[**EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response**](EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.md)

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

# **enterprise_admin_add_org_access_to_self_hosted_runner_group_in_enterprise**
> enterprise_admin_add_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, org_id)

Add organization access to a self-hosted runner group in an enterprise

Adds an organization to the list of selected organizations that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see \"[Create a self-hosted runner group for an enterprise](#create-a-self-hosted-runner-group-for-an-enterprise).\"  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    org_id = 56 # int | The unique identifier of the organization.

    try:
        # Add organization access to a self-hosted runner group in an enterprise
        api_instance.enterprise_admin_add_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, org_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_add_org_access_to_self_hosted_runner_group_in_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **org_id** | **int**| The unique identifier of the organization. | 

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

# **enterprise_admin_add_self_hosted_runner_to_group_for_enterprise**
> enterprise_admin_add_self_hosted_runner_to_group_for_enterprise(enterprise, runner_group_id, runner_id)

Add a self-hosted runner to a group for an enterprise

Adds a self-hosted runner to a runner group configured in an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Add a self-hosted runner to a group for an enterprise
        api_instance.enterprise_admin_add_self_hosted_runner_to_group_for_enterprise(enterprise, runner_group_id, runner_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_add_self_hosted_runner_to_group_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 

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

# **enterprise_admin_create_enterprise_server_license**
> enterprise_admin_create_enterprise_server_license(license, password=password, settings=settings)

Create a GitHub license

When you boot a GitHub instance for the first time, you can use the following endpoint to upload a license.  Note that you need to `POST` to [`/setup/api/configure`](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#start-a-configuration-process) to start the actual configuration process.  When using this endpoint, your GitHub instance must have a password set. This can be accomplished two ways:  1.  If you're working directly with the API before accessing the web interface, you must pass in the password parameter to set your password. 2.  If you set up your instance via the web interface before accessing the API, your calls to this endpoint do not need the password parameter.  **Note:** The request body for this operation must be submitted as `multipart/form-data` data. You can can reference the license file by prefixing the filename with the `@` symbol using `curl`. For more information, see the [`curl` documentation](https://curl.se/docs/manpage.html#-F).

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    license = 'license_example' # str | The content of your _.ghl_ license file.
    password = 'password_example' # str | You **must** provide a password _only if_ you are uploading your license for the first time. If you previously set a password through the web interface, you don't need this parameter. (optional)
    settings = 'settings_example' # str | An optional JSON string containing the installation settings. For a list of the available settings, see the [Get settings endpoint](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#get-settings). (optional)

    try:
        # Create a GitHub license
        api_instance.enterprise_admin_create_enterprise_server_license(license, password=password, settings=settings)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_enterprise_server_license: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license** | **str**| The content of your _.ghl_ license file. | 
 **password** | **str**| You **must** provide a password _only if_ you are uploading your license for the first time. If you previously set a password through the web interface, you don&#39;t need this parameter. | [optional] 
 **settings** | **str**| An optional JSON string containing the installation settings. For a list of the available settings, see the [Get settings endpoint](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#get-settings). | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_create_global_webhook**
> GlobalHook enterprise_admin_create_global_webhook(enterprise_admin_create_global_webhook_request)

Create a global webhook



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_create_global_webhook_request import EnterpriseAdminCreateGlobalWebhookRequest
from openapi_client.models.global_hook import GlobalHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise_admin_create_global_webhook_request = {"config":{"content_type":"json","secret":"secret","url":"https://example.com/webhook"},"events":["organization","user"],"name":"web"} # EnterpriseAdminCreateGlobalWebhookRequest | 

    try:
        # Create a global webhook
        api_response = api_instance.enterprise_admin_create_global_webhook(enterprise_admin_create_global_webhook_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_global_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_global_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise_admin_create_global_webhook_request** | [**EnterpriseAdminCreateGlobalWebhookRequest**](EnterpriseAdminCreateGlobalWebhookRequest.md)|  | 

### Return type

[**GlobalHook**](GlobalHook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_create_impersonation_o_auth_token**
> Authorization enterprise_admin_create_impersonation_o_auth_token(username, enterprise_admin_create_impersonation_o_auth_token_request)

Create an impersonation OAuth token



### Example


```python
import openapi_client
from openapi_client.models.authorization import Authorization
from openapi_client.models.enterprise_admin_create_impersonation_o_auth_token_request import EnterpriseAdminCreateImpersonationOAuthTokenRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    enterprise_admin_create_impersonation_o_auth_token_request = {"scopes":["public_repo"]} # EnterpriseAdminCreateImpersonationOAuthTokenRequest | 

    try:
        # Create an impersonation OAuth token
        api_response = api_instance.enterprise_admin_create_impersonation_o_auth_token(username, enterprise_admin_create_impersonation_o_auth_token_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_impersonation_o_auth_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_impersonation_o_auth_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **enterprise_admin_create_impersonation_o_auth_token_request** | [**EnterpriseAdminCreateImpersonationOAuthTokenRequest**](EnterpriseAdminCreateImpersonationOAuthTokenRequest.md)|  | 

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response when getting an existing impersonation OAuth token |  -  |
**201** | Response when creating a new impersonation OAuth token |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_create_org**
> OrganizationSimple enterprise_admin_create_org(enterprise_admin_create_org_request)

Create an organization



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_create_org_request import EnterpriseAdminCreateOrgRequest
from openapi_client.models.organization_simple import OrganizationSimple
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise_admin_create_org_request = {"admin":"monalisaoctocat","login":"github","profile_name":"GitHub, Inc."} # EnterpriseAdminCreateOrgRequest | 

    try:
        # Create an organization
        api_response = api_instance.enterprise_admin_create_org(enterprise_admin_create_org_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise_admin_create_org_request** | [**EnterpriseAdminCreateOrgRequest**](EnterpriseAdminCreateOrgRequest.md)|  | 

### Return type

[**OrganizationSimple**](OrganizationSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_create_pre_receive_environment**
> PreReceiveEnvironment enterprise_admin_create_pre_receive_environment(enterprise_admin_create_pre_receive_environment_request)

Create a pre-receive environment



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_create_pre_receive_environment_request import EnterpriseAdminCreatePreReceiveEnvironmentRequest
from openapi_client.models.pre_receive_environment import PreReceiveEnvironment
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise_admin_create_pre_receive_environment_request = {"image_url":"https://my_file_server/path/to/devtools_env.tar.gz","name":"DevTools Hook Env"} # EnterpriseAdminCreatePreReceiveEnvironmentRequest | 

    try:
        # Create a pre-receive environment
        api_response = api_instance.enterprise_admin_create_pre_receive_environment(enterprise_admin_create_pre_receive_environment_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_pre_receive_environment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_pre_receive_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise_admin_create_pre_receive_environment_request** | [**EnterpriseAdminCreatePreReceiveEnvironmentRequest**](EnterpriseAdminCreatePreReceiveEnvironmentRequest.md)|  | 

### Return type

[**PreReceiveEnvironment**](PreReceiveEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_create_pre_receive_hook**
> PreReceiveHook enterprise_admin_create_pre_receive_hook(enterprise_admin_create_pre_receive_hook_request)

Create a pre-receive hook



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_create_pre_receive_hook_request import EnterpriseAdminCreatePreReceiveHookRequest
from openapi_client.models.pre_receive_hook import PreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise_admin_create_pre_receive_hook_request = {"allow_downstream_configuration":false,"enforcement":"disabled","environment":{"id":2},"name":"Check Commits","script":"scripts/commit_check.sh","script_repository":{"full_name":"DevIT/hooks"}} # EnterpriseAdminCreatePreReceiveHookRequest | 

    try:
        # Create a pre-receive hook
        api_response = api_instance.enterprise_admin_create_pre_receive_hook(enterprise_admin_create_pre_receive_hook_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_pre_receive_hook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_pre_receive_hook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise_admin_create_pre_receive_hook_request** | [**EnterpriseAdminCreatePreReceiveHookRequest**](EnterpriseAdminCreatePreReceiveHookRequest.md)|  | 

### Return type

[**PreReceiveHook**](PreReceiveHook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_create_registration_token_for_enterprise**
> AuthenticationToken enterprise_admin_create_registration_token_for_enterprise(enterprise)

Create a registration token for an enterprise

Returns a token that you can pass to the `config` script. The token expires after one hour.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.  #### Example using registration token  Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.  ``` ./config.sh --url https://github.com/enterprises/octo-enterprise --token TOKEN ```

### Example


```python
import openapi_client
from openapi_client.models.authentication_token import AuthenticationToken
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.

    try:
        # Create a registration token for an enterprise
        api_response = api_instance.enterprise_admin_create_registration_token_for_enterprise(enterprise)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_registration_token_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_registration_token_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

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

# **enterprise_admin_create_remove_token_for_enterprise**
> AuthenticationToken enterprise_admin_create_remove_token_for_enterprise(enterprise)

Create a remove token for an enterprise

Returns a token that you can pass to the `config` script to remove a self-hosted runner from an enterprise. The token expires after one hour.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.  #### Example using remove token  To remove your self-hosted runner from an enterprise, replace `TOKEN` with the remove token provided by this endpoint.  ``` ./config.sh remove --token TOKEN ```

### Example


```python
import openapi_client
from openapi_client.models.authentication_token import AuthenticationToken
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.

    try:
        # Create a remove token for an enterprise
        api_response = api_instance.enterprise_admin_create_remove_token_for_enterprise(enterprise)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_remove_token_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_remove_token_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

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

# **enterprise_admin_create_self_hosted_runner_group_for_enterprise**
> RunnerGroupsEnterprise enterprise_admin_create_self_hosted_runner_group_for_enterprise(enterprise, enterprise_admin_create_self_hosted_runner_group_for_enterprise_request)

Create a self-hosted runner group for an enterprise

Creates a new self-hosted runner group for an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_create_self_hosted_runner_group_for_enterprise_request import EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest
from openapi_client.models.runner_groups_enterprise import RunnerGroupsEnterprise
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    enterprise_admin_create_self_hosted_runner_group_for_enterprise_request = {"name":"Expensive hardware runners","runners":[9,2],"selected_organization_ids":[32,91],"visibility":"selected"} # EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest | 

    try:
        # Create a self-hosted runner group for an enterprise
        api_response = api_instance.enterprise_admin_create_self_hosted_runner_group_for_enterprise(enterprise, enterprise_admin_create_self_hosted_runner_group_for_enterprise_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_self_hosted_runner_group_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_self_hosted_runner_group_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **enterprise_admin_create_self_hosted_runner_group_for_enterprise_request** | [**EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest**](EnterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseRequest.md)|  | 

### Return type

[**RunnerGroupsEnterprise**](RunnerGroupsEnterprise.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_create_user**
> SimpleUser enterprise_admin_create_user(enterprise_admin_create_user_request)

Create a user

If an external authentication mechanism is used, the login name should match the login name in the external system. If you are using LDAP authentication, you should also [update the LDAP mapping](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#update-ldap-mapping-for-a-user) for the user.  The login name will be normalized to only contain alphanumeric characters or single hyphens. For example, if you send `\"octo_cat\"` as the login, a user named `\"octo-cat\"` will be created.  If the login name or email address is already associated with an account, the server will return a `422` response.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_create_user_request import EnterpriseAdminCreateUserRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise_admin_create_user_request = {"email":"octocat@github.com","login":"monalisa"} # EnterpriseAdminCreateUserRequest | 

    try:
        # Create a user
        api_response = api_instance.enterprise_admin_create_user(enterprise_admin_create_user_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_create_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_create_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise_admin_create_user_request** | [**EnterpriseAdminCreateUserRequest**](EnterpriseAdminCreateUserRequest.md)|  | 

### Return type

[**SimpleUser**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_delete_global_webhook**
> enterprise_admin_delete_global_webhook(hook_id)

Delete a global webhook



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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Delete a global webhook
        api_instance.enterprise_admin_delete_global_webhook(hook_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_global_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook_id** | **int**| The unique identifier of the hook. | 

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

# **enterprise_admin_delete_impersonation_o_auth_token**
> enterprise_admin_delete_impersonation_o_auth_token(username)

Delete an impersonation OAuth token



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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Delete an impersonation OAuth token
        api_instance.enterprise_admin_delete_impersonation_o_auth_token(username)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_impersonation_o_auth_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **enterprise_admin_delete_personal_access_token**
> enterprise_admin_delete_personal_access_token(token_id)

Delete a personal access token

Deletes a personal access token. Returns a `403 - Forbidden` status when a personal access token is in use. For example, if you access this endpoint with the same personal access token that you are trying to delete, you will receive this error.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    token_id = 56 # int | The unique identifier of the token.

    try:
        # Delete a personal access token
        api_instance.enterprise_admin_delete_personal_access_token(token_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_personal_access_token: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | **int**| The unique identifier of the token. | 

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

# **enterprise_admin_delete_pre_receive_environment**
> enterprise_admin_delete_pre_receive_environment(pre_receive_environment_id)

Delete a pre-receive environment

If you attempt to delete an environment that cannot be deleted, you will receive a `422 Unprocessable Entity` response.  The possible error messages are:  *   _Cannot modify or delete the default environment_ *   _Cannot delete environment that has hooks_ *   _Cannot delete environment when download is in progress_

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_environment_id = 56 # int | The unique identifier of the pre-receive environment.

    try:
        # Delete a pre-receive environment
        api_instance.enterprise_admin_delete_pre_receive_environment(pre_receive_environment_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_pre_receive_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_environment_id** | **int**| The unique identifier of the pre-receive environment. | 

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
**422** | Client Errors |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_delete_pre_receive_hook**
> enterprise_admin_delete_pre_receive_hook(pre_receive_hook_id)

Delete a pre-receive hook



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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.

    try:
        # Delete a pre-receive hook
        api_instance.enterprise_admin_delete_pre_receive_hook(pre_receive_hook_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_pre_receive_hook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 

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

# **enterprise_admin_delete_public_key**
> enterprise_admin_delete_public_key(key_ids)

Delete a public key



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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    key_ids = 'key_ids_example' # str | The unique identifier of the key.

    try:
        # Delete a public key
        api_instance.enterprise_admin_delete_public_key(key_ids)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_public_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_ids** | **str**| The unique identifier of the key. | 

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

# **enterprise_admin_delete_self_hosted_runner_from_enterprise**
> enterprise_admin_delete_self_hosted_runner_from_enterprise(enterprise, runner_id)

Delete a self-hosted runner from an enterprise

Forces the removal of a self-hosted runner from an enterprise. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Delete a self-hosted runner from an enterprise
        api_instance.enterprise_admin_delete_self_hosted_runner_from_enterprise(enterprise, runner_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_self_hosted_runner_from_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 

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

# **enterprise_admin_delete_self_hosted_runner_group_from_enterprise**
> enterprise_admin_delete_self_hosted_runner_group_from_enterprise(enterprise, runner_group_id)

Delete a self-hosted runner group from an enterprise

Deletes a self-hosted runner group for an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.

    try:
        # Delete a self-hosted runner group from an enterprise
        api_instance.enterprise_admin_delete_self_hosted_runner_group_from_enterprise(enterprise, runner_group_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_self_hosted_runner_group_from_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 

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

# **enterprise_admin_delete_user**
> enterprise_admin_delete_user(username)

Delete a user

Deleting a user will delete all their repositories, gists, applications, and personal settings. [Suspending a user](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#suspend-a-user) is often a better option.  You can delete any user account except your own.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Delete a user
        api_instance.enterprise_admin_delete_user(username)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_delete_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **enterprise_admin_demote_site_administrator**
> enterprise_admin_demote_site_administrator(username)

Demote a site administrator

You can demote any user account except your own.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Demote a site administrator
        api_instance.enterprise_admin_demote_site_administrator(username)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_demote_site_administrator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **enterprise_admin_disable_selected_organization_github_actions_enterprise**
> enterprise_admin_disable_selected_organization_github_actions_enterprise(enterprise, org_id)

Disable a selected organization for GitHub Actions in an enterprise

Removes an organization from the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise).\"  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    org_id = 56 # int | The unique identifier of the organization.

    try:
        # Disable a selected organization for GitHub Actions in an enterprise
        api_instance.enterprise_admin_disable_selected_organization_github_actions_enterprise(enterprise, org_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_disable_selected_organization_github_actions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **org_id** | **int**| The unique identifier of the organization. | 

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

# **enterprise_admin_enable_or_disable_maintenance_mode**
> MaintenanceStatus enterprise_admin_enable_or_disable_maintenance_mode(maintenance)

Enable or disable maintenance mode

**Note:** The request body for this operation must be submitted as `application/x-www-form-urlencoded` data. You can submit a parameter value as a string, or you can use a tool such as `curl` to submit a parameter value as the contents of a text file. For more information, see the [`curl` documentation](https://curl.se/docs/manpage.html#--data-urlencode).

### Example


```python
import openapi_client
from openapi_client.models.maintenance_status import MaintenanceStatus
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    maintenance = 'maintenance_example' # str | A JSON string with the attributes `enabled` and `when`.  The possible values for `enabled` are `true` and `false`. When it's `false`, the attribute `when` is ignored and the maintenance mode is turned off. `when` defines the time period when the maintenance was enabled.  The possible values for `when` are `now` or any date parseable by [mojombo/chronic](https://github.com/mojombo/chronic).

    try:
        # Enable or disable maintenance mode
        api_response = api_instance.enterprise_admin_enable_or_disable_maintenance_mode(maintenance)
        print("The response of EnterpriseAdminApi->enterprise_admin_enable_or_disable_maintenance_mode:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_enable_or_disable_maintenance_mode: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maintenance** | **str**| A JSON string with the attributes &#x60;enabled&#x60; and &#x60;when&#x60;.  The possible values for &#x60;enabled&#x60; are &#x60;true&#x60; and &#x60;false&#x60;. When it&#39;s &#x60;false&#x60;, the attribute &#x60;when&#x60; is ignored and the maintenance mode is turned off. &#x60;when&#x60; defines the time period when the maintenance was enabled.  The possible values for &#x60;when&#x60; are &#x60;now&#x60; or any date parseable by [mojombo/chronic](https://github.com/mojombo/chronic). | 

### Return type

[**MaintenanceStatus**](MaintenanceStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_enable_selected_organization_github_actions_enterprise**
> enterprise_admin_enable_selected_organization_github_actions_enterprise(enterprise, org_id)

Enable a selected organization for GitHub Actions in an enterprise

Adds an organization to the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise).\"  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    org_id = 56 # int | The unique identifier of the organization.

    try:
        # Enable a selected organization for GitHub Actions in an enterprise
        api_instance.enterprise_admin_enable_selected_organization_github_actions_enterprise(enterprise, org_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_enable_selected_organization_github_actions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **org_id** | **int**| The unique identifier of the organization. | 

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

# **enterprise_admin_get_all_authorized_ssh_keys**
> List[SshKey] enterprise_admin_get_all_authorized_ssh_keys()

Get all authorized SSH keys



### Example


```python
import openapi_client
from openapi_client.models.ssh_key import SshKey
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get all authorized SSH keys
        api_response = api_instance.enterprise_admin_get_all_authorized_ssh_keys()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_all_authorized_ssh_keys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_all_authorized_ssh_keys: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[SshKey]**](SshKey.md)

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

# **enterprise_admin_get_all_stats**
> EnterpriseOverview enterprise_admin_get_all_stats()

Get all statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_overview import EnterpriseOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get all statistics
        api_response = api_instance.enterprise_admin_get_all_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_all_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_all_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseOverview**](EnterpriseOverview.md)

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

# **enterprise_admin_get_allowed_actions_enterprise**
> SelectedActions enterprise_admin_get_allowed_actions_enterprise(enterprise)

Get allowed actions for an enterprise

Gets the selected actions that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise).\"  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.selected_actions import SelectedActions
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.

    try:
        # Get allowed actions for an enterprise
        api_response = api_instance.enterprise_admin_get_allowed_actions_enterprise(enterprise)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_allowed_actions_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_allowed_actions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 

### Return type

[**SelectedActions**](SelectedActions.md)

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

# **enterprise_admin_get_announcement**
> Announcement enterprise_admin_get_announcement()

Get the global announcement banner

Gets the current message and expiration date of the global announcement banner in your enterprise.

### Example


```python
import openapi_client
from openapi_client.models.announcement import Announcement
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get the global announcement banner
        api_response = api_instance.enterprise_admin_get_announcement()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_announcement:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_announcement: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Announcement**](Announcement.md)

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

# **enterprise_admin_get_audit_log**
> List[AuditLogEvent] enterprise_admin_get_audit_log(enterprise, phrase=phrase, include=include, after=after, before=before, order=order, page=page, per_page=per_page)

Get the audit log for an enterprise

Gets the audit log for an enterprise. To use this endpoint, you must be an enterprise admin, and you must use an access token with the `admin:enterprise` scope.

### Example


```python
import openapi_client
from openapi_client.models.audit_log_event import AuditLogEvent
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    phrase = 'phrase_example' # str | A search phrase. For more information, see [Searching the audit log](https://docs.github.com/enterprise-server@3.4/admin/monitoring-activity-in-your-enterprise/reviewing-audit-logs-for-your-enterprise/searching-the-audit-log-for-your-enterprise#searching-the-audit-log). (optional)
    include = 'include_example' # str | The event types to include:  - `web` - returns web (non-Git) events. - `git` - returns Git events. - `all` - returns both web and Git events.  The default is `web`. (optional)
    after = 'after_example' # str | A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. (optional)
    before = 'before_example' # str | A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. (optional)
    order = 'order_example' # str | The order of audit log events. To list newest events first, specify `desc`. To list oldest events first, specify `asc`.  The default is `desc`. (optional)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # Get the audit log for an enterprise
        api_response = api_instance.enterprise_admin_get_audit_log(enterprise, phrase=phrase, include=include, after=after, before=before, order=order, page=page, per_page=per_page)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_audit_log:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_audit_log: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **phrase** | **str**| A search phrase. For more information, see [Searching the audit log](https://docs.github.com/enterprise-server@3.4/admin/monitoring-activity-in-your-enterprise/reviewing-audit-logs-for-your-enterprise/searching-the-audit-log-for-your-enterprise#searching-the-audit-log). | [optional] 
 **include** | **str**| The event types to include:  - &#x60;web&#x60; - returns web (non-Git) events. - &#x60;git&#x60; - returns Git events. - &#x60;all&#x60; - returns both web and Git events.  The default is &#x60;web&#x60;. | [optional] 
 **after** | **str**| A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. | [optional] 
 **before** | **str**| A cursor, as given in the [Link header](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. | [optional] 
 **order** | **str**| The order of audit log events. To list newest events first, specify &#x60;desc&#x60;. To list oldest events first, specify &#x60;asc&#x60;.  The default is &#x60;desc&#x60;. | [optional] 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**List[AuditLogEvent]**](AuditLogEvent.md)

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

# **enterprise_admin_get_comment_stats**
> EnterpriseCommentOverview enterprise_admin_get_comment_stats()

Get comment statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_comment_overview import EnterpriseCommentOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get comment statistics
        api_response = api_instance.enterprise_admin_get_comment_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_comment_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_comment_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseCommentOverview**](EnterpriseCommentOverview.md)

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

# **enterprise_admin_get_configuration_status**
> ConfigurationStatus enterprise_admin_get_configuration_status()

Get the configuration status

This endpoint allows you to check the status of the most recent configuration process:  Note that you may need to wait several seconds after you start a process before you can check its status.  The different statuses are:  | Status        | Description                       | | ------------- | --------------------------------- | | `PENDING`     | The job has not started yet       | | `CONFIGURING` | The job is running                | | `DONE`        | The job has finished correctly    | | `FAILED`      | The job has finished unexpectedly |

### Example


```python
import openapi_client
from openapi_client.models.configuration_status import ConfigurationStatus
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get the configuration status
        api_response = api_instance.enterprise_admin_get_configuration_status()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_configuration_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_configuration_status: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ConfigurationStatus**](ConfigurationStatus.md)

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

# **enterprise_admin_get_download_status_for_pre_receive_environment**
> PreReceiveEnvironmentDownloadStatus enterprise_admin_get_download_status_for_pre_receive_environment(pre_receive_environment_id)

Get the download status for a pre-receive environment

In addition to seeing the download status at the \"[Get a pre-receive environment](#get-a-pre-receive-environment)\" endpoint, there is also this separate endpoint for just the download status.

### Example


```python
import openapi_client
from openapi_client.models.pre_receive_environment_download_status import PreReceiveEnvironmentDownloadStatus
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_environment_id = 56 # int | The unique identifier of the pre-receive environment.

    try:
        # Get the download status for a pre-receive environment
        api_response = api_instance.enterprise_admin_get_download_status_for_pre_receive_environment(pre_receive_environment_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_download_status_for_pre_receive_environment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_download_status_for_pre_receive_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_environment_id** | **int**| The unique identifier of the pre-receive environment. | 

### Return type

[**PreReceiveEnvironmentDownloadStatus**](PreReceiveEnvironmentDownloadStatus.md)

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

# **enterprise_admin_get_gist_stats**
> EnterpriseGistOverview enterprise_admin_get_gist_stats()

Get gist statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_gist_overview import EnterpriseGistOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get gist statistics
        api_response = api_instance.enterprise_admin_get_gist_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_gist_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_gist_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseGistOverview**](EnterpriseGistOverview.md)

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

# **enterprise_admin_get_github_actions_permissions_enterprise**
> ActionsEnterprisePermissions enterprise_admin_get_github_actions_permissions_enterprise(enterprise)

Get GitHub Actions permissions for an enterprise

Gets the GitHub Actions permissions policy for organizations and allowed actions in an enterprise.  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_enterprise_permissions import ActionsEnterprisePermissions
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.

    try:
        # Get GitHub Actions permissions for an enterprise
        api_response = api_instance.enterprise_admin_get_github_actions_permissions_enterprise(enterprise)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_github_actions_permissions_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_github_actions_permissions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 

### Return type

[**ActionsEnterprisePermissions**](ActionsEnterprisePermissions.md)

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

# **enterprise_admin_get_global_webhook**
> GlobalHook enterprise_admin_get_global_webhook(hook_id)

Get a global webhook



### Example


```python
import openapi_client
from openapi_client.models.global_hook import GlobalHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Get a global webhook
        api_response = api_instance.enterprise_admin_get_global_webhook(hook_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_global_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_global_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook_id** | **int**| The unique identifier of the hook. | 

### Return type

[**GlobalHook**](GlobalHook.md)

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

# **enterprise_admin_get_hooks_stats**
> EnterpriseHookOverview enterprise_admin_get_hooks_stats()

Get hooks statistics

### Example


```python
import openapi_client
from openapi_client.models.enterprise_hook_overview import EnterpriseHookOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get hooks statistics
        api_response = api_instance.enterprise_admin_get_hooks_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_hooks_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_hooks_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseHookOverview**](EnterpriseHookOverview.md)

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

# **enterprise_admin_get_issue_stats**
> EnterpriseIssueOverview enterprise_admin_get_issue_stats()

Get issue statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_issue_overview import EnterpriseIssueOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get issue statistics
        api_response = api_instance.enterprise_admin_get_issue_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_issue_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_issue_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseIssueOverview**](EnterpriseIssueOverview.md)

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

# **enterprise_admin_get_license_information**
> LicenseInfo enterprise_admin_get_license_information()

Get license information



### Example


```python
import openapi_client
from openapi_client.models.license_info import LicenseInfo
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get license information
        api_response = api_instance.enterprise_admin_get_license_information()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_license_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_license_information: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**LicenseInfo**](LicenseInfo.md)

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

# **enterprise_admin_get_maintenance_status**
> MaintenanceStatus enterprise_admin_get_maintenance_status()

Get the maintenance status

Check your installation's maintenance status:

### Example


```python
import openapi_client
from openapi_client.models.maintenance_status import MaintenanceStatus
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get the maintenance status
        api_response = api_instance.enterprise_admin_get_maintenance_status()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_maintenance_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_maintenance_status: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**MaintenanceStatus**](MaintenanceStatus.md)

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

# **enterprise_admin_get_milestone_stats**
> EnterpriseMilestoneOverview enterprise_admin_get_milestone_stats()

Get milestone statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_milestone_overview import EnterpriseMilestoneOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get milestone statistics
        api_response = api_instance.enterprise_admin_get_milestone_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_milestone_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_milestone_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseMilestoneOverview**](EnterpriseMilestoneOverview.md)

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

# **enterprise_admin_get_org_stats**
> EnterpriseOrganizationOverview enterprise_admin_get_org_stats()

Get organization statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_organization_overview import EnterpriseOrganizationOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get organization statistics
        api_response = api_instance.enterprise_admin_get_org_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_org_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_org_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseOrganizationOverview**](EnterpriseOrganizationOverview.md)

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

# **enterprise_admin_get_pages_stats**
> EnterprisePageOverview enterprise_admin_get_pages_stats()

Get pages statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_page_overview import EnterprisePageOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get pages statistics
        api_response = api_instance.enterprise_admin_get_pages_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_pages_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_pages_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterprisePageOverview**](EnterprisePageOverview.md)

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

# **enterprise_admin_get_pre_receive_environment**
> PreReceiveEnvironment enterprise_admin_get_pre_receive_environment(pre_receive_environment_id)

Get a pre-receive environment



### Example


```python
import openapi_client
from openapi_client.models.pre_receive_environment import PreReceiveEnvironment
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_environment_id = 56 # int | The unique identifier of the pre-receive environment.

    try:
        # Get a pre-receive environment
        api_response = api_instance.enterprise_admin_get_pre_receive_environment(pre_receive_environment_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_pre_receive_environment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_pre_receive_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_environment_id** | **int**| The unique identifier of the pre-receive environment. | 

### Return type

[**PreReceiveEnvironment**](PreReceiveEnvironment.md)

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

# **enterprise_admin_get_pre_receive_hook**
> PreReceiveHook enterprise_admin_get_pre_receive_hook(pre_receive_hook_id)

Get a pre-receive hook



### Example


```python
import openapi_client
from openapi_client.models.pre_receive_hook import PreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.

    try:
        # Get a pre-receive hook
        api_response = api_instance.enterprise_admin_get_pre_receive_hook(pre_receive_hook_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_pre_receive_hook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_pre_receive_hook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 

### Return type

[**PreReceiveHook**](PreReceiveHook.md)

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

# **enterprise_admin_get_pre_receive_hook_for_org**
> OrgPreReceiveHook enterprise_admin_get_pre_receive_hook_for_org(org, pre_receive_hook_id)

Get a pre-receive hook for an organization



### Example


```python
import openapi_client
from openapi_client.models.org_pre_receive_hook import OrgPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.

    try:
        # Get a pre-receive hook for an organization
        api_response = api_instance.enterprise_admin_get_pre_receive_hook_for_org(org, pre_receive_hook_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_pre_receive_hook_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_pre_receive_hook_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 

### Return type

[**OrgPreReceiveHook**](OrgPreReceiveHook.md)

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

# **enterprise_admin_get_pre_receive_hook_for_repo**
> RepositoryPreReceiveHook enterprise_admin_get_pre_receive_hook_for_repo(owner, repo, pre_receive_hook_id)

Get a pre-receive hook for a repository



### Example


```python
import openapi_client
from openapi_client.models.repository_pre_receive_hook import RepositoryPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.

    try:
        # Get a pre-receive hook for a repository
        api_response = api_instance.enterprise_admin_get_pre_receive_hook_for_repo(owner, repo, pre_receive_hook_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_pre_receive_hook_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_pre_receive_hook_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 

### Return type

[**RepositoryPreReceiveHook**](RepositoryPreReceiveHook.md)

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

# **enterprise_admin_get_pull_request_stats**
> EnterprisePullRequestOverview enterprise_admin_get_pull_request_stats()

Get pull request statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_pull_request_overview import EnterprisePullRequestOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get pull request statistics
        api_response = api_instance.enterprise_admin_get_pull_request_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_pull_request_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_pull_request_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterprisePullRequestOverview**](EnterprisePullRequestOverview.md)

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

# **enterprise_admin_get_repo_stats**
> EnterpriseRepositoryOverview enterprise_admin_get_repo_stats()

Get repository statistics

### Example


```python
import openapi_client
from openapi_client.models.enterprise_repository_overview import EnterpriseRepositoryOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get repository statistics
        api_response = api_instance.enterprise_admin_get_repo_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_repo_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_repo_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseRepositoryOverview**](EnterpriseRepositoryOverview.md)

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

# **enterprise_admin_get_self_hosted_runner_for_enterprise**
> Runner enterprise_admin_get_self_hosted_runner_for_enterprise(enterprise, runner_id)

Get a self-hosted runner for an enterprise

Gets a specific self-hosted runner configured in an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.runner import Runner
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Get a self-hosted runner for an enterprise
        api_response = api_instance.enterprise_admin_get_self_hosted_runner_for_enterprise(enterprise, runner_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_self_hosted_runner_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_self_hosted_runner_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 

### Return type

[**Runner**](Runner.md)

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

# **enterprise_admin_get_self_hosted_runner_group_for_enterprise**
> RunnerGroupsEnterprise enterprise_admin_get_self_hosted_runner_group_for_enterprise(enterprise, runner_group_id)

Get a self-hosted runner group for an enterprise

Gets a specific self-hosted runner group for an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.runner_groups_enterprise import RunnerGroupsEnterprise
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.

    try:
        # Get a self-hosted runner group for an enterprise
        api_response = api_instance.enterprise_admin_get_self_hosted_runner_group_for_enterprise(enterprise, runner_group_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_get_self_hosted_runner_group_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_self_hosted_runner_group_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 

### Return type

[**RunnerGroupsEnterprise**](RunnerGroupsEnterprise.md)

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

# **enterprise_admin_get_settings**
> EnterpriseSettings enterprise_admin_get_settings()

Get settings

Gets the settings for your instance. To change settings, see the [Set settings endpoint](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#set-settings).  **Note:** You cannot retrieve the management console password with the Enterprise administration API.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_settings import EnterpriseSettings
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get settings
        api_response = api_instance.enterprise_admin_get_settings()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_settings: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseSettings**](EnterpriseSettings.md)

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

# **enterprise_admin_get_user_stats**
> EnterpriseUserOverview enterprise_admin_get_user_stats()

Get users statistics



### Example


```python
import openapi_client
from openapi_client.models.enterprise_user_overview import EnterpriseUserOverview
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Get users statistics
        api_response = api_instance.enterprise_admin_get_user_stats()
        print("The response of EnterpriseAdminApi->enterprise_admin_get_user_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_get_user_stats: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**EnterpriseUserOverview**](EnterpriseUserOverview.md)

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

# **enterprise_admin_list_global_webhooks**
> List[GlobalHook] enterprise_admin_list_global_webhooks(per_page=per_page, page=page)

List global webhooks



### Example


```python
import openapi_client
from openapi_client.models.global_hook import GlobalHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List global webhooks
        api_response = api_instance.enterprise_admin_list_global_webhooks(per_page=per_page, page=page)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_global_webhooks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_global_webhooks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[GlobalHook]**](GlobalHook.md)

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

# **enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise(enterprise, runner_id)

List labels for a self-hosted runner for an enterprise

Lists all labels for a self-hosted runner configured in an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response import EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # List labels for a self-hosted runner for an enterprise
        api_response = api_instance.enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise(enterprise, runner_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 

### Return type

[**EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response**](EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.md)

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

# **enterprise_admin_list_org_access_to_self_hosted_runner_group_in_enterprise**
> EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response enterprise_admin_list_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, per_page=per_page, page=page)

List organization access to a self-hosted runner group in an enterprise

Lists the organizations with access to a self-hosted runner group.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise200_response import EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization access to a self-hosted runner group in an enterprise
        api_response = api_instance.enterprise_admin_list_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, per_page=per_page, page=page)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_org_access_to_self_hosted_runner_group_in_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_org_access_to_self_hosted_runner_group_in_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response**](EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response.md)

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

# **enterprise_admin_list_personal_access_tokens**
> List[Authorization] enterprise_admin_list_personal_access_tokens(per_page=per_page, page=page)

List personal access tokens

Lists personal access tokens for all users, including admin users.

### Example


```python
import openapi_client
from openapi_client.models.authorization import Authorization
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List personal access tokens
        api_response = api_instance.enterprise_admin_list_personal_access_tokens(per_page=per_page, page=page)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_personal_access_tokens:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_personal_access_tokens: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**List[Authorization]**](Authorization.md)

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

# **enterprise_admin_list_pre_receive_environments**
> List[PreReceiveEnvironment] enterprise_admin_list_pre_receive_environments(per_page=per_page, page=page, direction=direction, sort=sort)

List pre-receive environments



### Example


```python
import openapi_client
from openapi_client.models.pre_receive_environment import PreReceiveEnvironment
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    sort = created # str |  (optional) (default to created)

    try:
        # List pre-receive environments
        api_response = api_instance.enterprise_admin_list_pre_receive_environments(per_page=per_page, page=page, direction=direction, sort=sort)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_pre_receive_environments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_pre_receive_environments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **sort** | **str**|  | [optional] [default to created]

### Return type

[**List[PreReceiveEnvironment]**](PreReceiveEnvironment.md)

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

# **enterprise_admin_list_pre_receive_hooks**
> List[PreReceiveHook] enterprise_admin_list_pre_receive_hooks(per_page=per_page, page=page, direction=direction, sort=sort)

List pre-receive hooks



### Example


```python
import openapi_client
from openapi_client.models.pre_receive_hook import PreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    sort = created # str | The property to sort the results by. (optional) (default to created)

    try:
        # List pre-receive hooks
        api_response = api_instance.enterprise_admin_list_pre_receive_hooks(per_page=per_page, page=page, direction=direction, sort=sort)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_pre_receive_hooks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_pre_receive_hooks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **sort** | **str**| The property to sort the results by. | [optional] [default to created]

### Return type

[**List[PreReceiveHook]**](PreReceiveHook.md)

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

# **enterprise_admin_list_pre_receive_hooks_for_org**
> List[OrgPreReceiveHook] enterprise_admin_list_pre_receive_hooks_for_org(org, per_page=per_page, page=page, direction=direction, sort=sort)

List pre-receive hooks for an organization

List all pre-receive hooks that are enabled or testing for this organization as well as any disabled hooks that can be configured at the organization level. Globally disabled pre-receive hooks that do not allow downstream configuration are not listed.

### Example


```python
import openapi_client
from openapi_client.models.org_pre_receive_hook import OrgPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    sort = created # str | The sort order for the response collection. (optional) (default to created)

    try:
        # List pre-receive hooks for an organization
        api_response = api_instance.enterprise_admin_list_pre_receive_hooks_for_org(org, per_page=per_page, page=page, direction=direction, sort=sort)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_pre_receive_hooks_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_pre_receive_hooks_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **sort** | **str**| The sort order for the response collection. | [optional] [default to created]

### Return type

[**List[OrgPreReceiveHook]**](OrgPreReceiveHook.md)

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

# **enterprise_admin_list_pre_receive_hooks_for_repo**
> List[RepositoryPreReceiveHook] enterprise_admin_list_pre_receive_hooks_for_repo(owner, repo, per_page=per_page, page=page, direction=direction, sort=sort)

List pre-receive hooks for a repository

List all pre-receive hooks that are enabled or testing for this repository as well as any disabled hooks that are allowed to be enabled at the repository level. Pre-receive hooks that are disabled at a higher level and are not configurable will not be listed.

### Example


```python
import openapi_client
from openapi_client.models.repository_pre_receive_hook import RepositoryPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    sort = created # str |  (optional) (default to created)

    try:
        # List pre-receive hooks for a repository
        api_response = api_instance.enterprise_admin_list_pre_receive_hooks_for_repo(owner, repo, per_page=per_page, page=page, direction=direction, sort=sort)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_pre_receive_hooks_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_pre_receive_hooks_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **sort** | **str**|  | [optional] [default to created]

### Return type

[**List[RepositoryPreReceiveHook]**](RepositoryPreReceiveHook.md)

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

# **enterprise_admin_list_public_keys**
> List[PublicKeyFull] enterprise_admin_list_public_keys(per_page=per_page, page=page, direction=direction, sort=sort, since=since)

List public keys



### Example


```python
import openapi_client
from openapi_client.models.public_key_full import PublicKeyFull
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    direction = desc # str | The direction to sort the results by. (optional) (default to desc)
    sort = created # str |  (optional) (default to created)
    since = 'since_example' # str | Only show public keys accessed after the given time. (optional)

    try:
        # List public keys
        api_response = api_instance.enterprise_admin_list_public_keys(per_page=per_page, page=page, direction=direction, sort=sort, since=since)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_public_keys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_public_keys: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **direction** | **str**| The direction to sort the results by. | [optional] [default to desc]
 **sort** | **str**|  | [optional] [default to created]
 **since** | **str**| Only show public keys accessed after the given time. | [optional] 

### Return type

[**List[PublicKeyFull]**](PublicKeyFull.md)

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

# **enterprise_admin_list_runner_applications_for_enterprise**
> List[RunnerApplication] enterprise_admin_list_runner_applications_for_enterprise(enterprise)

List runner applications for an enterprise

Lists binaries for the runner application that you can download and run.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.runner_application import RunnerApplication
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.

    try:
        # List runner applications for an enterprise
        api_response = api_instance.enterprise_admin_list_runner_applications_for_enterprise(enterprise)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_runner_applications_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_runner_applications_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 

### Return type

[**List[RunnerApplication]**](RunnerApplication.md)

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

# **enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise**
> EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise(enterprise, per_page=per_page, page=page)

List selected organizations enabled for GitHub Actions in an enterprise

Lists the organizations that are selected to have GitHub Actions enabled in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise).\"  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise200_response import EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List selected organizations enabled for GitHub Actions in an enterprise
        api_response = api_instance.enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise(enterprise, per_page=per_page, page=page)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_selected_organizations_enabled_github_actions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response**](EnterpriseAdminListSelectedOrganizationsEnabledGithubActionsEnterprise200Response.md)

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

# **enterprise_admin_list_self_hosted_runner_groups_for_enterprise**
> EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response enterprise_admin_list_self_hosted_runner_groups_for_enterprise(enterprise, per_page=per_page, page=page)

List self-hosted runner groups for an enterprise

Lists all self-hosted runner groups for an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_self_hosted_runner_groups_for_enterprise200_response import EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List self-hosted runner groups for an enterprise
        api_response = api_instance.enterprise_admin_list_self_hosted_runner_groups_for_enterprise(enterprise, per_page=per_page, page=page)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_self_hosted_runner_groups_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_self_hosted_runner_groups_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response**](EnterpriseAdminListSelfHostedRunnerGroupsForEnterprise200Response.md)

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

# **enterprise_admin_list_self_hosted_runners_for_enterprise**
> EnterpriseAdminListSelfHostedRunnersForEnterprise200Response enterprise_admin_list_self_hosted_runners_for_enterprise(enterprise, per_page=per_page, page=page)

List self-hosted runners for an enterprise

Lists all self-hosted runners configured for an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_self_hosted_runners_for_enterprise200_response import EnterpriseAdminListSelfHostedRunnersForEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List self-hosted runners for an enterprise
        api_response = api_instance.enterprise_admin_list_self_hosted_runners_for_enterprise(enterprise, per_page=per_page, page=page)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_self_hosted_runners_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_self_hosted_runners_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**EnterpriseAdminListSelfHostedRunnersForEnterprise200Response**](EnterpriseAdminListSelfHostedRunnersForEnterprise200Response.md)

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

# **enterprise_admin_list_self_hosted_runners_in_group_for_enterprise**
> EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response enterprise_admin_list_self_hosted_runners_in_group_for_enterprise(enterprise, runner_group_id, per_page=per_page, page=page)

List self-hosted runners in a group for an enterprise

Lists the self-hosted runners that are in a specific enterprise group.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_self_hosted_runners_in_group_for_enterprise200_response import EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List self-hosted runners in a group for an enterprise
        api_response = api_instance.enterprise_admin_list_self_hosted_runners_in_group_for_enterprise(enterprise, runner_group_id, per_page=per_page, page=page)
        print("The response of EnterpriseAdminApi->enterprise_admin_list_self_hosted_runners_in_group_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_list_self_hosted_runners_in_group_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response**](EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response.md)

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

# **enterprise_admin_ping_global_webhook**
> enterprise_admin_ping_global_webhook(hook_id)

Ping a global webhook

This will trigger a [ping event](https://docs.github.com/enterprise-server@3.4/webhooks/#ping-event) to be sent to the webhook.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    hook_id = 56 # int | The unique identifier of the hook.

    try:
        # Ping a global webhook
        api_instance.enterprise_admin_ping_global_webhook(hook_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_ping_global_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook_id** | **int**| The unique identifier of the hook. | 

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

# **enterprise_admin_promote_user_to_be_site_administrator**
> enterprise_admin_promote_user_to_be_site_administrator(username)

Promote a user to be a site administrator

Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see \"[HTTP verbs](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#http-verbs).\"

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Promote a user to be a site administrator
        api_instance.enterprise_admin_promote_user_to_be_site_administrator(username)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_promote_user_to_be_site_administrator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **enterprise_admin_remove_all_custom_labels_from_self_hosted_runner_for_enterprise**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response enterprise_admin_remove_all_custom_labels_from_self_hosted_runner_for_enterprise(enterprise, runner_id)

Remove all custom labels from a self-hosted runner for an enterprise

Remove all custom labels from a self-hosted runner configured in an enterprise. Returns the remaining read-only labels from the runner.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response import EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Remove all custom labels from a self-hosted runner for an enterprise
        api_response = api_instance.enterprise_admin_remove_all_custom_labels_from_self_hosted_runner_for_enterprise(enterprise, runner_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_remove_all_custom_labels_from_self_hosted_runner_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_all_custom_labels_from_self_hosted_runner_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 

### Return type

[**EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response**](EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.md)

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

# **enterprise_admin_remove_announcement**
> enterprise_admin_remove_announcement()

Remove the global announcement banner

Removes the global announcement banner in your enterprise.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Remove the global announcement banner
        api_instance.enterprise_admin_remove_announcement()
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_announcement: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

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

# **enterprise_admin_remove_authorized_ssh_key**
> List[SshKey] enterprise_admin_remove_authorized_ssh_key(authorized_key)

Remove an authorized SSH key

**Note:** The request body for this operation must be submitted as `application/x-www-form-urlencoded` data. You can submit a parameter value as a string, or you can use a tool such as `curl` to submit a parameter value as the contents of a text file. For more information, see the [`curl` documentation](https://curl.se/docs/manpage.html#--data-urlencode).

### Example


```python
import openapi_client
from openapi_client.models.ssh_key import SshKey
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    authorized_key = 'authorized_key_example' # str | The public SSH key.

    try:
        # Remove an authorized SSH key
        api_response = api_instance.enterprise_admin_remove_authorized_ssh_key(authorized_key)
        print("The response of EnterpriseAdminApi->enterprise_admin_remove_authorized_ssh_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_authorized_ssh_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorized_key** | **str**| The public SSH key. | 

### Return type

[**List[SshKey]**](SshKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_remove_custom_label_from_self_hosted_runner_for_enterprise**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response enterprise_admin_remove_custom_label_from_self_hosted_runner_for_enterprise(enterprise, runner_id, name)

Remove a custom label from a self-hosted runner for an enterprise

Remove a custom label from a self-hosted runner configured in an enterprise. Returns the remaining labels from the runner.  This endpoint returns a `404 Not Found` status if the custom label is not present on the runner.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response import EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    name = 'name_example' # str | The name of a self-hosted runner's custom label.

    try:
        # Remove a custom label from a self-hosted runner for an enterprise
        api_response = api_instance.enterprise_admin_remove_custom_label_from_self_hosted_runner_for_enterprise(enterprise, runner_id, name)
        print("The response of EnterpriseAdminApi->enterprise_admin_remove_custom_label_from_self_hosted_runner_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_custom_label_from_self_hosted_runner_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 
 **name** | **str**| The name of a self-hosted runner&#39;s custom label. | 

### Return type

[**EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response**](EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.md)

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

# **enterprise_admin_remove_org_access_to_self_hosted_runner_group_in_enterprise**
> enterprise_admin_remove_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, org_id)

Remove organization access to a self-hosted runner group in an enterprise

Removes an organization from the list of selected organizations that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see \"[Create a self-hosted runner group for an enterprise](#create-a-self-hosted-runner-group-for-an-enterprise).\"  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    org_id = 56 # int | The unique identifier of the organization.

    try:
        # Remove organization access to a self-hosted runner group in an enterprise
        api_instance.enterprise_admin_remove_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, org_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_org_access_to_self_hosted_runner_group_in_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **org_id** | **int**| The unique identifier of the organization. | 

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

# **enterprise_admin_remove_pre_receive_hook_enforcement_for_org**
> OrgPreReceiveHook enterprise_admin_remove_pre_receive_hook_enforcement_for_org(org, pre_receive_hook_id)

Remove pre-receive hook enforcement for an organization

Removes any overrides for this hook at the org level for this org.

### Example


```python
import openapi_client
from openapi_client.models.org_pre_receive_hook import OrgPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.

    try:
        # Remove pre-receive hook enforcement for an organization
        api_response = api_instance.enterprise_admin_remove_pre_receive_hook_enforcement_for_org(org, pre_receive_hook_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_remove_pre_receive_hook_enforcement_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_pre_receive_hook_enforcement_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 

### Return type

[**OrgPreReceiveHook**](OrgPreReceiveHook.md)

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

# **enterprise_admin_remove_pre_receive_hook_enforcement_for_repo**
> RepositoryPreReceiveHook enterprise_admin_remove_pre_receive_hook_enforcement_for_repo(owner, repo, pre_receive_hook_id)

Remove pre-receive hook enforcement for a repository

Deletes any overridden enforcement on this repository for the specified hook.  Responds with effective values inherited from owner and/or global level.

### Example


```python
import openapi_client
from openapi_client.models.repository_pre_receive_hook import RepositoryPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.

    try:
        # Remove pre-receive hook enforcement for a repository
        api_response = api_instance.enterprise_admin_remove_pre_receive_hook_enforcement_for_repo(owner, repo, pre_receive_hook_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_remove_pre_receive_hook_enforcement_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_pre_receive_hook_enforcement_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 

### Return type

[**RepositoryPreReceiveHook**](RepositoryPreReceiveHook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Responds with effective values inherited from owner and/or global level. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_remove_self_hosted_runner_from_group_for_enterprise**
> enterprise_admin_remove_self_hosted_runner_from_group_for_enterprise(enterprise, runner_group_id, runner_id)

Remove a self-hosted runner from a group for an enterprise

Removes a self-hosted runner from a group configured in an enterprise. The runner is then returned to the default group.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Remove a self-hosted runner from a group for an enterprise
        api_instance.enterprise_admin_remove_self_hosted_runner_from_group_for_enterprise(enterprise, runner_group_id, runner_id)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_remove_self_hosted_runner_from_group_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 

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

# **enterprise_admin_set_allowed_actions_enterprise**
> enterprise_admin_set_allowed_actions_enterprise(enterprise, selected_actions)

Set allowed actions for an enterprise

Sets the actions that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise).\"  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.selected_actions import SelectedActions
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    selected_actions = openapi_client.SelectedActions() # SelectedActions | 

    try:
        # Set allowed actions for an enterprise
        api_instance.enterprise_admin_set_allowed_actions_enterprise(enterprise, selected_actions)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_allowed_actions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **selected_actions** | [**SelectedActions**](SelectedActions.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_set_announcement**
> Announcement enterprise_admin_set_announcement(announcement)

Set the global announcement banner

Sets the message and expiration time for the global announcement banner in your enterprise.

### Example


```python
import openapi_client
from openapi_client.models.announcement import Announcement
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    announcement = {"announcement":"Very **important** announcement about _something_.","expires_at":"2021-01-01T00:00:00.000+00:00"} # Announcement | 

    try:
        # Set the global announcement banner
        api_response = api_instance.enterprise_admin_set_announcement(announcement)
        print("The response of EnterpriseAdminApi->enterprise_admin_set_announcement:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_announcement: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **announcement** | [**Announcement**](Announcement.md)|  | 

### Return type

[**Announcement**](Announcement.md)

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

# **enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise(enterprise, runner_id, enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request)

Set custom labels for a self-hosted runner for an enterprise

Remove all previous custom labels and set the new custom labels for a specific self-hosted runner configured in an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_list_labels_for_self_hosted_runner_for_enterprise200_response import EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response
from openapi_client.models.enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request import EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request = {"labels":["gpu","accelerated"]} # EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest | 

    try:
        # Set custom labels for a self-hosted runner for an enterprise
        api_response = api_instance.enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise(enterprise, runner_id, enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_id** | **int**| Unique identifier of the self-hosted runner. | 
 **enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request** | [**EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest**](EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest.md)|  | 

### Return type

[**EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response**](EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response.md)

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

# **enterprise_admin_set_github_actions_permissions_enterprise**
> enterprise_admin_set_github_actions_permissions_enterprise(enterprise, enterprise_admin_set_github_actions_permissions_enterprise_request)

Set GitHub Actions permissions for an enterprise

Sets the GitHub Actions permissions policy for organizations and allowed actions in an enterprise.  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_set_github_actions_permissions_enterprise_request import EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    enterprise_admin_set_github_actions_permissions_enterprise_request = {"allowed_actions":"selected","enabled_organizations":"all"} # EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest | 

    try:
        # Set GitHub Actions permissions for an enterprise
        api_instance.enterprise_admin_set_github_actions_permissions_enterprise(enterprise, enterprise_admin_set_github_actions_permissions_enterprise_request)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_github_actions_permissions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **enterprise_admin_set_github_actions_permissions_enterprise_request** | [**EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest**](EnterpriseAdminSetGithubActionsPermissionsEnterpriseRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise**
> enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request)

Set organization access for a self-hosted runner group in an enterprise

Replaces the list of organizations that have access to a self-hosted runner configured in an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request import EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request = {"selected_organization_ids":[32,91]} # EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest | 

    try:
        # Set organization access for a self-hosted runner group in an enterprise
        api_instance.enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise(enterprise, runner_group_id, enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **enterprise_admin_set_org_access_to_self_hosted_runner_group_in_enterprise_request** | [**EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest**](EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise**
> enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise(enterprise, enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request)

Set selected organizations enabled for GitHub Actions in an enterprise

Replaces the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise).\"  You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request import EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request = {"selected_organization_ids":[32,91]} # EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest | 

    try:
        # Set selected organizations enabled for GitHub Actions in an enterprise
        api_instance.enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise(enterprise, enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **enterprise_admin_set_selected_organizations_enabled_github_actions_enterprise_request** | [**EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest**](EnterpriseAdminSetSelectedOrganizationsEnabledGithubActionsEnterpriseRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_set_self_hosted_runners_in_group_for_enterprise**
> enterprise_admin_set_self_hosted_runners_in_group_for_enterprise(enterprise, runner_group_id, enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request)

Set self-hosted runners in a group for an enterprise

Replaces the list of self-hosted runners that are part of an enterprise runner group.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request import EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request = {"runners":[9,2]} # EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest | 

    try:
        # Set self-hosted runners in a group for an enterprise
        api_instance.enterprise_admin_set_self_hosted_runners_in_group_for_enterprise(enterprise, runner_group_id, enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_self_hosted_runners_in_group_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request** | [**EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest**](EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_set_settings**
> enterprise_admin_set_settings(settings)

Set settings

Applies settings on your instance. For a list of the available settings, see the [Get settings endpoint](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#get-settings).  **Notes:**  - The request body for this operation must be submitted as `application/x-www-form-urlencoded` data. You can submit a parameter value as a string, or you can use a tool such as `curl` to submit a parameter value as the contents of a text file. For more information, see the [`curl` documentation](https://curl.se/docs/manpage.html#--data-urlencode). - You cannot set the management console password with the Enterprise administration API. Use the `ghe-set-password` utility to change the management console password. For more information, see \"[Command-line utilities](https://docs.github.com/enterprise-server@3.4/admin/configuration/configuring-your-enterprise/command-line-utilities#ghe-set-password).\"

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    settings = 'settings_example' # str | A JSON string with the new settings. Note that you only need to pass the specific settings you want to modify. For a list of the available settings, see the [Get settings endpoint](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#get-settings).

    try:
        # Set settings
        api_instance.enterprise_admin_set_settings(settings)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_set_settings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settings** | **str**| A JSON string with the new settings. Note that you only need to pass the specific settings you want to modify. For a list of the available settings, see the [Get settings endpoint](https://docs.github.com/enterprise-server@3.4/rest/reference/enterprise-admin#get-settings). | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_start_configuration_process**
> enterprise_admin_start_configuration_process()

Start a configuration process

This endpoint allows you to start a configuration process at any time for your updated settings to take effect:

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)

    try:
        # Start a configuration process
        api_instance.enterprise_admin_start_configuration_process()
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_start_configuration_process: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

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
**202** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_start_pre_receive_environment_download**
> PreReceiveEnvironmentDownloadStatus enterprise_admin_start_pre_receive_environment_download(pre_receive_environment_id)

Start a pre-receive environment download

Triggers a new download of the environment tarball from the environment's `image_url`. When the download is finished, the newly downloaded tarball will overwrite the existing environment.  If a download cannot be triggered, you will receive a `422 Unprocessable Entity` response.  The possible error messages are:  * _Cannot modify or delete the default environment_ * _Can not start a new download when a download is in progress_

### Example


```python
import openapi_client
from openapi_client.models.pre_receive_environment_download_status import PreReceiveEnvironmentDownloadStatus
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_environment_id = 56 # int | The unique identifier of the pre-receive environment.

    try:
        # Start a pre-receive environment download
        api_response = api_instance.enterprise_admin_start_pre_receive_environment_download(pre_receive_environment_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_start_pre_receive_environment_download:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_start_pre_receive_environment_download: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_environment_id** | **int**| The unique identifier of the pre-receive environment. | 

### Return type

[**PreReceiveEnvironmentDownloadStatus**](PreReceiveEnvironmentDownloadStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Response |  -  |
**422** | Client Errors |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_suspend_user**
> enterprise_admin_suspend_user(username, enterprise_admin_suspend_user_request=enterprise_admin_suspend_user_request)

Suspend a user

If your GitHub instance uses [LDAP Sync with Active Directory LDAP servers](https://docs.github.com/enterprise-server@3.4/admin/identity-and-access-management/using-ldap-for-enterprise-iam/using-ldap), Active Directory LDAP-authenticated users cannot be suspended through this API. If you attempt to suspend an Active Directory LDAP-authenticated user through this API, it will return a `403` response.  You can suspend any user account except your own.  Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see \"[HTTP verbs](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#http-verbs).\"

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_suspend_user_request import EnterpriseAdminSuspendUserRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    enterprise_admin_suspend_user_request = {"reason":"Suspended during leave of absence."} # EnterpriseAdminSuspendUserRequest |  (optional)

    try:
        # Suspend a user
        api_instance.enterprise_admin_suspend_user(username, enterprise_admin_suspend_user_request=enterprise_admin_suspend_user_request)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_suspend_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **enterprise_admin_suspend_user_request** | [**EnterpriseAdminSuspendUserRequest**](EnterpriseAdminSuspendUserRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_sync_ldap_mapping_for_team**
> EnterpriseAdminSyncLdapMappingForTeam201Response enterprise_admin_sync_ldap_mapping_for_team(team_id)

Sync LDAP mapping for a team

Note that this API call does not automatically initiate an LDAP sync. Rather, if a `201` is returned, the sync job is queued successfully, and is performed when the instance is ready.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_sync_ldap_mapping_for_team201_response import EnterpriseAdminSyncLdapMappingForTeam201Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    team_id = 56 # int | The unique identifier of the team.

    try:
        # Sync LDAP mapping for a team
        api_response = api_instance.enterprise_admin_sync_ldap_mapping_for_team(team_id)
        print("The response of EnterpriseAdminApi->enterprise_admin_sync_ldap_mapping_for_team:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_sync_ldap_mapping_for_team: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **team_id** | **int**| The unique identifier of the team. | 

### Return type

[**EnterpriseAdminSyncLdapMappingForTeam201Response**](EnterpriseAdminSyncLdapMappingForTeam201Response.md)

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

# **enterprise_admin_sync_ldap_mapping_for_user**
> EnterpriseAdminSyncLdapMappingForTeam201Response enterprise_admin_sync_ldap_mapping_for_user(username)

Sync LDAP mapping for a user

Note that this API call does not automatically initiate an LDAP sync. Rather, if a `201` is returned, the sync job is queued successfully, and is performed when the instance is ready.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_sync_ldap_mapping_for_team201_response import EnterpriseAdminSyncLdapMappingForTeam201Response
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.

    try:
        # Sync LDAP mapping for a user
        api_response = api_instance.enterprise_admin_sync_ldap_mapping_for_user(username)
        print("The response of EnterpriseAdminApi->enterprise_admin_sync_ldap_mapping_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_sync_ldap_mapping_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 

### Return type

[**EnterpriseAdminSyncLdapMappingForTeam201Response**](EnterpriseAdminSyncLdapMappingForTeam201Response.md)

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

# **enterprise_admin_unsuspend_user**
> enterprise_admin_unsuspend_user(username, enterprise_admin_unsuspend_user_request=enterprise_admin_unsuspend_user_request)

Unsuspend a user

If your GitHub instance uses [LDAP Sync with Active Directory LDAP servers](https://docs.github.com/enterprise-server@3.4/admin/identity-and-access-management/using-ldap-for-enterprise-iam/using-ldap), this API is disabled and will return a `403` response. Active Directory LDAP-authenticated users cannot be unsuspended using the API.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_unsuspend_user_request import EnterpriseAdminUnsuspendUserRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    enterprise_admin_unsuspend_user_request = {"reason":"Unsuspended after leave of absence."} # EnterpriseAdminUnsuspendUserRequest |  (optional)

    try:
        # Unsuspend a user
        api_instance.enterprise_admin_unsuspend_user(username, enterprise_admin_unsuspend_user_request=enterprise_admin_unsuspend_user_request)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_unsuspend_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **enterprise_admin_unsuspend_user_request** | [**EnterpriseAdminUnsuspendUserRequest**](EnterpriseAdminUnsuspendUserRequest.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_update_global_webhook**
> GlobalHook2 enterprise_admin_update_global_webhook(hook_id, enterprise_admin_update_global_webhook_request)

Update a global webhook

Parameters that are not provided will be overwritten with the default value or removed if no default exists.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_global_webhook_request import EnterpriseAdminUpdateGlobalWebhookRequest
from openapi_client.models.global_hook2 import GlobalHook2
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    hook_id = 56 # int | The unique identifier of the hook.
    enterprise_admin_update_global_webhook_request = {"config":{"url":"https://example.com/webhook"},"events":["organization"]} # EnterpriseAdminUpdateGlobalWebhookRequest | 

    try:
        # Update a global webhook
        api_response = api_instance.enterprise_admin_update_global_webhook(hook_id, enterprise_admin_update_global_webhook_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_global_webhook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_global_webhook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hook_id** | **int**| The unique identifier of the hook. | 
 **enterprise_admin_update_global_webhook_request** | [**EnterpriseAdminUpdateGlobalWebhookRequest**](EnterpriseAdminUpdateGlobalWebhookRequest.md)|  | 

### Return type

[**GlobalHook2**](GlobalHook2.md)

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

# **enterprise_admin_update_ldap_mapping_for_team**
> LdapMappingTeam enterprise_admin_update_ldap_mapping_for_team(team_id, enterprise_admin_update_ldap_mapping_for_team_request)

Update LDAP mapping for a team

Updates the [distinguished name](https://www.ldap.com/ldap-dns-and-rdns) (DN) of the LDAP entry to map to a team. [LDAP synchronization](https://docs.github.com/enterprise-server@3.4/admin/identity-and-access-management/using-ldap-for-enterprise-iam/using-ldap#enabling-ldap-sync) must be enabled to map LDAP entries to a team. Use the [Create a team](https://docs.github.com/enterprise-server@3.4/rest/reference/teams/#create-a-team) endpoint to create a team with LDAP mapping.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_ldap_mapping_for_team_request import EnterpriseAdminUpdateLdapMappingForTeamRequest
from openapi_client.models.ldap_mapping_team import LdapMappingTeam
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    team_id = 56 # int | The unique identifier of the team.
    enterprise_admin_update_ldap_mapping_for_team_request = {"ldap_dn":"cn=Enterprise Ops,ou=teams,dc=github,dc=com"} # EnterpriseAdminUpdateLdapMappingForTeamRequest | 

    try:
        # Update LDAP mapping for a team
        api_response = api_instance.enterprise_admin_update_ldap_mapping_for_team(team_id, enterprise_admin_update_ldap_mapping_for_team_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_ldap_mapping_for_team:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_ldap_mapping_for_team: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **team_id** | **int**| The unique identifier of the team. | 
 **enterprise_admin_update_ldap_mapping_for_team_request** | [**EnterpriseAdminUpdateLdapMappingForTeamRequest**](EnterpriseAdminUpdateLdapMappingForTeamRequest.md)|  | 

### Return type

[**LdapMappingTeam**](LdapMappingTeam.md)

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

# **enterprise_admin_update_ldap_mapping_for_user**
> LdapMappingUser enterprise_admin_update_ldap_mapping_for_user(username, enterprise_admin_update_ldap_mapping_for_team_request)

Update LDAP mapping for a user



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_ldap_mapping_for_team_request import EnterpriseAdminUpdateLdapMappingForTeamRequest
from openapi_client.models.ldap_mapping_user import LdapMappingUser
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    enterprise_admin_update_ldap_mapping_for_team_request = {"ldap_dn":"uid=asdf,ou=users,dc=github,dc=com"} # EnterpriseAdminUpdateLdapMappingForTeamRequest | 

    try:
        # Update LDAP mapping for a user
        api_response = api_instance.enterprise_admin_update_ldap_mapping_for_user(username, enterprise_admin_update_ldap_mapping_for_team_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_ldap_mapping_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_ldap_mapping_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **enterprise_admin_update_ldap_mapping_for_team_request** | [**EnterpriseAdminUpdateLdapMappingForTeamRequest**](EnterpriseAdminUpdateLdapMappingForTeamRequest.md)|  | 

### Return type

[**LdapMappingUser**](LdapMappingUser.md)

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

# **enterprise_admin_update_org_name**
> EnterpriseAdminUpdateOrgName202Response enterprise_admin_update_org_name(org, enterprise_admin_update_org_name_request)

Update an organization name



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_org_name202_response import EnterpriseAdminUpdateOrgName202Response
from openapi_client.models.enterprise_admin_update_org_name_request import EnterpriseAdminUpdateOrgNameRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    enterprise_admin_update_org_name_request = {"login":"the-new-octocats"} # EnterpriseAdminUpdateOrgNameRequest | 

    try:
        # Update an organization name
        api_response = api_instance.enterprise_admin_update_org_name(org, enterprise_admin_update_org_name_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_org_name:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_org_name: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **enterprise_admin_update_org_name_request** | [**EnterpriseAdminUpdateOrgNameRequest**](EnterpriseAdminUpdateOrgNameRequest.md)|  | 

### Return type

[**EnterpriseAdminUpdateOrgName202Response**](EnterpriseAdminUpdateOrgName202Response.md)

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

# **enterprise_admin_update_pre_receive_environment**
> PreReceiveEnvironment enterprise_admin_update_pre_receive_environment(pre_receive_environment_id, enterprise_admin_update_pre_receive_environment_request=enterprise_admin_update_pre_receive_environment_request)

Update a pre-receive environment

You cannot modify the default environment. If you attempt to modify the default environment, you will receive a `422 Unprocessable Entity` response.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_pre_receive_environment_request import EnterpriseAdminUpdatePreReceiveEnvironmentRequest
from openapi_client.models.pre_receive_environment import PreReceiveEnvironment
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_environment_id = 56 # int | The unique identifier of the pre-receive environment.
    enterprise_admin_update_pre_receive_environment_request = {"image_url":"https://my_file_server/path/to/devtools_env.tar.gz","name":"DevTools Hook Env"} # EnterpriseAdminUpdatePreReceiveEnvironmentRequest |  (optional)

    try:
        # Update a pre-receive environment
        api_response = api_instance.enterprise_admin_update_pre_receive_environment(pre_receive_environment_id, enterprise_admin_update_pre_receive_environment_request=enterprise_admin_update_pre_receive_environment_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_pre_receive_environment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_pre_receive_environment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_environment_id** | **int**| The unique identifier of the pre-receive environment. | 
 **enterprise_admin_update_pre_receive_environment_request** | [**EnterpriseAdminUpdatePreReceiveEnvironmentRequest**](EnterpriseAdminUpdatePreReceiveEnvironmentRequest.md)|  | [optional] 

### Return type

[**PreReceiveEnvironment**](PreReceiveEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response |  -  |
**422** | Client Errors |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enterprise_admin_update_pre_receive_hook**
> PreReceiveHook enterprise_admin_update_pre_receive_hook(pre_receive_hook_id, enterprise_admin_update_pre_receive_hook_request=enterprise_admin_update_pre_receive_hook_request)

Update a pre-receive hook



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_pre_receive_hook_request import EnterpriseAdminUpdatePreReceiveHookRequest
from openapi_client.models.pre_receive_hook import PreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.
    enterprise_admin_update_pre_receive_hook_request = {"allow_downstream_configuration":true,"environment":{"id":1},"name":"Check Commits"} # EnterpriseAdminUpdatePreReceiveHookRequest |  (optional)

    try:
        # Update a pre-receive hook
        api_response = api_instance.enterprise_admin_update_pre_receive_hook(pre_receive_hook_id, enterprise_admin_update_pre_receive_hook_request=enterprise_admin_update_pre_receive_hook_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_pre_receive_hook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_pre_receive_hook: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 
 **enterprise_admin_update_pre_receive_hook_request** | [**EnterpriseAdminUpdatePreReceiveHookRequest**](EnterpriseAdminUpdatePreReceiveHookRequest.md)|  | [optional] 

### Return type

[**PreReceiveHook**](PreReceiveHook.md)

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

# **enterprise_admin_update_pre_receive_hook_enforcement_for_org**
> OrgPreReceiveHook enterprise_admin_update_pre_receive_hook_enforcement_for_org(org, pre_receive_hook_id, enterprise_admin_update_pre_receive_hook_enforcement_for_org_request=enterprise_admin_update_pre_receive_hook_enforcement_for_org_request)

Update pre-receive hook enforcement for an organization

For pre-receive hooks which are allowed to be configured at the org level, you can set `enforcement` and `allow_downstream_configuration`

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_pre_receive_hook_enforcement_for_org_request import EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest
from openapi_client.models.org_pre_receive_hook import OrgPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.
    enterprise_admin_update_pre_receive_hook_enforcement_for_org_request = {"allow_downstream_configuration":false,"enforcement":"enabled"} # EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest |  (optional)

    try:
        # Update pre-receive hook enforcement for an organization
        api_response = api_instance.enterprise_admin_update_pre_receive_hook_enforcement_for_org(org, pre_receive_hook_id, enterprise_admin_update_pre_receive_hook_enforcement_for_org_request=enterprise_admin_update_pre_receive_hook_enforcement_for_org_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_pre_receive_hook_enforcement_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_pre_receive_hook_enforcement_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 
 **enterprise_admin_update_pre_receive_hook_enforcement_for_org_request** | [**EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest**](EnterpriseAdminUpdatePreReceiveHookEnforcementForOrgRequest.md)|  | [optional] 

### Return type

[**OrgPreReceiveHook**](OrgPreReceiveHook.md)

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

# **enterprise_admin_update_pre_receive_hook_enforcement_for_repo**
> RepositoryPreReceiveHook enterprise_admin_update_pre_receive_hook_enforcement_for_repo(owner, repo, pre_receive_hook_id, enterprise_admin_update_pre_receive_hook_enforcement_for_repo_request=enterprise_admin_update_pre_receive_hook_enforcement_for_repo_request)

Update pre-receive hook enforcement for a repository

For pre-receive hooks which are allowed to be configured at the repo level, you can set `enforcement`

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_pre_receive_hook_enforcement_for_repo_request import EnterpriseAdminUpdatePreReceiveHookEnforcementForRepoRequest
from openapi_client.models.repository_pre_receive_hook import RepositoryPreReceiveHook
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    pre_receive_hook_id = 56 # int | The unique identifier of the pre-receive hook.
    enterprise_admin_update_pre_receive_hook_enforcement_for_repo_request = {"enforcement":"enabled"} # EnterpriseAdminUpdatePreReceiveHookEnforcementForRepoRequest |  (optional)

    try:
        # Update pre-receive hook enforcement for a repository
        api_response = api_instance.enterprise_admin_update_pre_receive_hook_enforcement_for_repo(owner, repo, pre_receive_hook_id, enterprise_admin_update_pre_receive_hook_enforcement_for_repo_request=enterprise_admin_update_pre_receive_hook_enforcement_for_repo_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_pre_receive_hook_enforcement_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_pre_receive_hook_enforcement_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **pre_receive_hook_id** | **int**| The unique identifier of the pre-receive hook. | 
 **enterprise_admin_update_pre_receive_hook_enforcement_for_repo_request** | [**EnterpriseAdminUpdatePreReceiveHookEnforcementForRepoRequest**](EnterpriseAdminUpdatePreReceiveHookEnforcementForRepoRequest.md)|  | [optional] 

### Return type

[**RepositoryPreReceiveHook**](RepositoryPreReceiveHook.md)

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

# **enterprise_admin_update_self_hosted_runner_group_for_enterprise**
> RunnerGroupsEnterprise enterprise_admin_update_self_hosted_runner_group_for_enterprise(enterprise, runner_group_id, enterprise_admin_update_self_hosted_runner_group_for_enterprise_request=enterprise_admin_update_self_hosted_runner_group_for_enterprise_request)

Update a self-hosted runner group for an enterprise

Updates the `name` and `visibility` of a self-hosted runner group in an enterprise.  You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_self_hosted_runner_group_for_enterprise_request import EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequest
from openapi_client.models.runner_groups_enterprise import RunnerGroupsEnterprise
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    enterprise = 'enterprise_example' # str | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    enterprise_admin_update_self_hosted_runner_group_for_enterprise_request = {"name":"Expensive hardware runners","visibility":"selected"} # EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequest |  (optional)

    try:
        # Update a self-hosted runner group for an enterprise
        api_response = api_instance.enterprise_admin_update_self_hosted_runner_group_for_enterprise(enterprise, runner_group_id, enterprise_admin_update_self_hosted_runner_group_for_enterprise_request=enterprise_admin_update_self_hosted_runner_group_for_enterprise_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_self_hosted_runner_group_for_enterprise:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_self_hosted_runner_group_for_enterprise: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **str**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **enterprise_admin_update_self_hosted_runner_group_for_enterprise_request** | [**EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequest**](EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequest.md)|  | [optional] 

### Return type

[**RunnerGroupsEnterprise**](RunnerGroupsEnterprise.md)

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

# **enterprise_admin_update_username_for_user**
> EnterpriseAdminUpdateOrgName202Response enterprise_admin_update_username_for_user(username, enterprise_admin_update_username_for_user_request)

Update the username for a user



### Example


```python
import openapi_client
from openapi_client.models.enterprise_admin_update_org_name202_response import EnterpriseAdminUpdateOrgName202Response
from openapi_client.models.enterprise_admin_update_username_for_user_request import EnterpriseAdminUpdateUsernameForUserRequest
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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    username = 'username_example' # str | The handle for the GitHub user account.
    enterprise_admin_update_username_for_user_request = {"login":"thenewmonalisa"} # EnterpriseAdminUpdateUsernameForUserRequest | 

    try:
        # Update the username for a user
        api_response = api_instance.enterprise_admin_update_username_for_user(username, enterprise_admin_update_username_for_user_request)
        print("The response of EnterpriseAdminApi->enterprise_admin_update_username_for_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_update_username_for_user: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The handle for the GitHub user account. | 
 **enterprise_admin_update_username_for_user_request** | [**EnterpriseAdminUpdateUsernameForUserRequest**](EnterpriseAdminUpdateUsernameForUserRequest.md)|  | 

### Return type

[**EnterpriseAdminUpdateOrgName202Response**](EnterpriseAdminUpdateOrgName202Response.md)

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

# **enterprise_admin_upgrade_license**
> enterprise_admin_upgrade_license(license=license)

Upgrade a license

This API upgrades your license and also triggers the configuration process.  **Note:** The request body for this operation must be submitted as `multipart/form-data` data. You can can reference the license file by prefixing the filename with the `@` symbol using `curl`. For more information, see the [`curl` documentation](https://curl.se/docs/manpage.html#-F).

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
    api_instance = openapi_client.EnterpriseAdminApi(api_client)
    license = 'license_example' # str | The content of your new _.ghl_ license file. (optional)

    try:
        # Upgrade a license
        api_instance.enterprise_admin_upgrade_license(license=license)
    except Exception as e:
        print("Exception when calling EnterpriseAdminApi->enterprise_admin_upgrade_license: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license** | **str**| The content of your new _.ghl_ license file. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

