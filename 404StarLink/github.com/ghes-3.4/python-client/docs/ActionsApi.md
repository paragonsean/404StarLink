# openapi_client.ActionsApi

All URIs are relative to *https://github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actions_add_custom_labels_to_self_hosted_runner_for_org**](ActionsApi.md#actions_add_custom_labels_to_self_hosted_runner_for_org) | **POST** /orgs/{org}/actions/runners/{runner_id}/labels | Add custom labels to a self-hosted runner for an organization
[**actions_add_custom_labels_to_self_hosted_runner_for_repo**](ActionsApi.md#actions_add_custom_labels_to_self_hosted_runner_for_repo) | **POST** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Add custom labels to a self-hosted runner for a repository
[**actions_add_repo_access_to_self_hosted_runner_group_in_org**](ActionsApi.md#actions_add_repo_access_to_self_hosted_runner_group_in_org) | **PUT** /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories/{repository_id} | Add repository access to a self-hosted runner group in an organization
[**actions_add_selected_repo_to_org_secret**](ActionsApi.md#actions_add_selected_repo_to_org_secret) | **PUT** /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret
[**actions_add_self_hosted_runner_to_group_for_org**](ActionsApi.md#actions_add_self_hosted_runner_to_group_for_org) | **PUT** /orgs/{org}/actions/runner-groups/{runner_group_id}/runners/{runner_id} | Add a self-hosted runner to a group for an organization
[**actions_cancel_workflow_run**](ActionsApi.md#actions_cancel_workflow_run) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/cancel | Cancel a workflow run
[**actions_create_or_update_environment_secret**](ActionsApi.md#actions_create_or_update_environment_secret) | **PUT** /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name} | Create or update an environment secret
[**actions_create_or_update_org_secret**](ActionsApi.md#actions_create_or_update_org_secret) | **PUT** /orgs/{org}/actions/secrets/{secret_name} | Create or update an organization secret
[**actions_create_or_update_repo_secret**](ActionsApi.md#actions_create_or_update_repo_secret) | **PUT** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Create or update a repository secret
[**actions_create_registration_token_for_org**](ActionsApi.md#actions_create_registration_token_for_org) | **POST** /orgs/{org}/actions/runners/registration-token | Create a registration token for an organization
[**actions_create_registration_token_for_repo**](ActionsApi.md#actions_create_registration_token_for_repo) | **POST** /repos/{owner}/{repo}/actions/runners/registration-token | Create a registration token for a repository
[**actions_create_remove_token_for_org**](ActionsApi.md#actions_create_remove_token_for_org) | **POST** /orgs/{org}/actions/runners/remove-token | Create a remove token for an organization
[**actions_create_remove_token_for_repo**](ActionsApi.md#actions_create_remove_token_for_repo) | **POST** /repos/{owner}/{repo}/actions/runners/remove-token | Create a remove token for a repository
[**actions_create_self_hosted_runner_group_for_org**](ActionsApi.md#actions_create_self_hosted_runner_group_for_org) | **POST** /orgs/{org}/actions/runner-groups | Create a self-hosted runner group for an organization
[**actions_create_workflow_dispatch**](ActionsApi.md#actions_create_workflow_dispatch) | **POST** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/dispatches | Create a workflow dispatch event
[**actions_delete_artifact**](ActionsApi.md#actions_delete_artifact) | **DELETE** /repos/{owner}/{repo}/actions/artifacts/{artifact_id} | Delete an artifact
[**actions_delete_environment_secret**](ActionsApi.md#actions_delete_environment_secret) | **DELETE** /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name} | Delete an environment secret
[**actions_delete_org_secret**](ActionsApi.md#actions_delete_org_secret) | **DELETE** /orgs/{org}/actions/secrets/{secret_name} | Delete an organization secret
[**actions_delete_repo_secret**](ActionsApi.md#actions_delete_repo_secret) | **DELETE** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Delete a repository secret
[**actions_delete_self_hosted_runner_from_org**](ActionsApi.md#actions_delete_self_hosted_runner_from_org) | **DELETE** /orgs/{org}/actions/runners/{runner_id} | Delete a self-hosted runner from an organization
[**actions_delete_self_hosted_runner_from_repo**](ActionsApi.md#actions_delete_self_hosted_runner_from_repo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id} | Delete a self-hosted runner from a repository
[**actions_delete_self_hosted_runner_group_from_org**](ActionsApi.md#actions_delete_self_hosted_runner_group_from_org) | **DELETE** /orgs/{org}/actions/runner-groups/{runner_group_id} | Delete a self-hosted runner group from an organization
[**actions_delete_workflow_run**](ActionsApi.md#actions_delete_workflow_run) | **DELETE** /repos/{owner}/{repo}/actions/runs/{run_id} | Delete a workflow run
[**actions_delete_workflow_run_logs**](ActionsApi.md#actions_delete_workflow_run_logs) | **DELETE** /repos/{owner}/{repo}/actions/runs/{run_id}/logs | Delete workflow run logs
[**actions_disable_selected_repository_github_actions_organization**](ActionsApi.md#actions_disable_selected_repository_github_actions_organization) | **DELETE** /orgs/{org}/actions/permissions/repositories/{repository_id} | Disable a selected repository for GitHub Actions in an organization
[**actions_disable_workflow**](ActionsApi.md#actions_disable_workflow) | **PUT** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/disable | Disable a workflow
[**actions_download_artifact**](ActionsApi.md#actions_download_artifact) | **GET** /repos/{owner}/{repo}/actions/artifacts/{artifact_id}/{archive_format} | Download an artifact
[**actions_download_job_logs_for_workflow_run**](ActionsApi.md#actions_download_job_logs_for_workflow_run) | **GET** /repos/{owner}/{repo}/actions/jobs/{job_id}/logs | Download job logs for a workflow run
[**actions_download_workflow_run_logs**](ActionsApi.md#actions_download_workflow_run_logs) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/logs | Download workflow run logs
[**actions_enable_selected_repository_github_actions_organization**](ActionsApi.md#actions_enable_selected_repository_github_actions_organization) | **PUT** /orgs/{org}/actions/permissions/repositories/{repository_id} | Enable a selected repository for GitHub Actions in an organization
[**actions_enable_workflow**](ActionsApi.md#actions_enable_workflow) | **PUT** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/enable | Enable a workflow
[**actions_get_allowed_actions_organization**](ActionsApi.md#actions_get_allowed_actions_organization) | **GET** /orgs/{org}/actions/permissions/selected-actions | Get allowed actions for an organization
[**actions_get_allowed_actions_repository**](ActionsApi.md#actions_get_allowed_actions_repository) | **GET** /repos/{owner}/{repo}/actions/permissions/selected-actions | Get allowed actions for a repository
[**actions_get_artifact**](ActionsApi.md#actions_get_artifact) | **GET** /repos/{owner}/{repo}/actions/artifacts/{artifact_id} | Get an artifact
[**actions_get_environment_public_key**](ActionsApi.md#actions_get_environment_public_key) | **GET** /repositories/{repository_id}/environments/{environment_name}/secrets/public-key | Get an environment public key
[**actions_get_environment_secret**](ActionsApi.md#actions_get_environment_secret) | **GET** /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name} | Get an environment secret
[**actions_get_github_actions_permissions_organization**](ActionsApi.md#actions_get_github_actions_permissions_organization) | **GET** /orgs/{org}/actions/permissions | Get GitHub Actions permissions for an organization
[**actions_get_github_actions_permissions_repository**](ActionsApi.md#actions_get_github_actions_permissions_repository) | **GET** /repos/{owner}/{repo}/actions/permissions | Get GitHub Actions permissions for a repository
[**actions_get_job_for_workflow_run**](ActionsApi.md#actions_get_job_for_workflow_run) | **GET** /repos/{owner}/{repo}/actions/jobs/{job_id} | Get a job for a workflow run
[**actions_get_org_public_key**](ActionsApi.md#actions_get_org_public_key) | **GET** /orgs/{org}/actions/secrets/public-key | Get an organization public key
[**actions_get_org_secret**](ActionsApi.md#actions_get_org_secret) | **GET** /orgs/{org}/actions/secrets/{secret_name} | Get an organization secret
[**actions_get_pending_deployments_for_run**](ActionsApi.md#actions_get_pending_deployments_for_run) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments | Get pending deployments for a workflow run
[**actions_get_repo_public_key**](ActionsApi.md#actions_get_repo_public_key) | **GET** /repos/{owner}/{repo}/actions/secrets/public-key | Get a repository public key
[**actions_get_repo_secret**](ActionsApi.md#actions_get_repo_secret) | **GET** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Get a repository secret
[**actions_get_reviews_for_run**](ActionsApi.md#actions_get_reviews_for_run) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/approvals | Get the review history for a workflow run
[**actions_get_self_hosted_runner_for_org**](ActionsApi.md#actions_get_self_hosted_runner_for_org) | **GET** /orgs/{org}/actions/runners/{runner_id} | Get a self-hosted runner for an organization
[**actions_get_self_hosted_runner_for_repo**](ActionsApi.md#actions_get_self_hosted_runner_for_repo) | **GET** /repos/{owner}/{repo}/actions/runners/{runner_id} | Get a self-hosted runner for a repository
[**actions_get_self_hosted_runner_group_for_org**](ActionsApi.md#actions_get_self_hosted_runner_group_for_org) | **GET** /orgs/{org}/actions/runner-groups/{runner_group_id} | Get a self-hosted runner group for an organization
[**actions_get_workflow**](ActionsApi.md#actions_get_workflow) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id} | Get a workflow
[**actions_get_workflow_run**](ActionsApi.md#actions_get_workflow_run) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id} | Get a workflow run
[**actions_list_artifacts_for_repo**](ActionsApi.md#actions_list_artifacts_for_repo) | **GET** /repos/{owner}/{repo}/actions/artifacts | List artifacts for a repository
[**actions_list_environment_secrets**](ActionsApi.md#actions_list_environment_secrets) | **GET** /repositories/{repository_id}/environments/{environment_name}/secrets | List environment secrets
[**actions_list_jobs_for_workflow_run**](ActionsApi.md#actions_list_jobs_for_workflow_run) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/jobs | List jobs for a workflow run
[**actions_list_labels_for_self_hosted_runner_for_org**](ActionsApi.md#actions_list_labels_for_self_hosted_runner_for_org) | **GET** /orgs/{org}/actions/runners/{runner_id}/labels | List labels for a self-hosted runner for an organization
[**actions_list_labels_for_self_hosted_runner_for_repo**](ActionsApi.md#actions_list_labels_for_self_hosted_runner_for_repo) | **GET** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | List labels for a self-hosted runner for a repository
[**actions_list_org_secrets**](ActionsApi.md#actions_list_org_secrets) | **GET** /orgs/{org}/actions/secrets | List organization secrets
[**actions_list_repo_access_to_self_hosted_runner_group_in_org**](ActionsApi.md#actions_list_repo_access_to_self_hosted_runner_group_in_org) | **GET** /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories | List repository access to a self-hosted runner group in an organization
[**actions_list_repo_secrets**](ActionsApi.md#actions_list_repo_secrets) | **GET** /repos/{owner}/{repo}/actions/secrets | List repository secrets
[**actions_list_repo_workflows**](ActionsApi.md#actions_list_repo_workflows) | **GET** /repos/{owner}/{repo}/actions/workflows | List repository workflows
[**actions_list_runner_applications_for_org**](ActionsApi.md#actions_list_runner_applications_for_org) | **GET** /orgs/{org}/actions/runners/downloads | List runner applications for an organization
[**actions_list_runner_applications_for_repo**](ActionsApi.md#actions_list_runner_applications_for_repo) | **GET** /repos/{owner}/{repo}/actions/runners/downloads | List runner applications for a repository
[**actions_list_selected_repos_for_org_secret**](ActionsApi.md#actions_list_selected_repos_for_org_secret) | **GET** /orgs/{org}/actions/secrets/{secret_name}/repositories | List selected repositories for an organization secret
[**actions_list_selected_repositories_enabled_github_actions_organization**](ActionsApi.md#actions_list_selected_repositories_enabled_github_actions_organization) | **GET** /orgs/{org}/actions/permissions/repositories | List selected repositories enabled for GitHub Actions in an organization
[**actions_list_self_hosted_runner_groups_for_org**](ActionsApi.md#actions_list_self_hosted_runner_groups_for_org) | **GET** /orgs/{org}/actions/runner-groups | List self-hosted runner groups for an organization
[**actions_list_self_hosted_runners_for_org**](ActionsApi.md#actions_list_self_hosted_runners_for_org) | **GET** /orgs/{org}/actions/runners | List self-hosted runners for an organization
[**actions_list_self_hosted_runners_for_repo**](ActionsApi.md#actions_list_self_hosted_runners_for_repo) | **GET** /repos/{owner}/{repo}/actions/runners | List self-hosted runners for a repository
[**actions_list_self_hosted_runners_in_group_for_org**](ActionsApi.md#actions_list_self_hosted_runners_in_group_for_org) | **GET** /orgs/{org}/actions/runner-groups/{runner_group_id}/runners | List self-hosted runners in a group for an organization
[**actions_list_workflow_run_artifacts**](ActionsApi.md#actions_list_workflow_run_artifacts) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts | List workflow run artifacts
[**actions_list_workflow_runs**](ActionsApi.md#actions_list_workflow_runs) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs | List workflow runs for a workflow
[**actions_list_workflow_runs_for_repo**](ActionsApi.md#actions_list_workflow_runs_for_repo) | **GET** /repos/{owner}/{repo}/actions/runs | List workflow runs for a repository
[**actions_re_run_workflow**](ActionsApi.md#actions_re_run_workflow) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/rerun | Re-run a workflow
[**actions_remove_all_custom_labels_from_self_hosted_runner_for_org**](ActionsApi.md#actions_remove_all_custom_labels_from_self_hosted_runner_for_org) | **DELETE** /orgs/{org}/actions/runners/{runner_id}/labels | Remove all custom labels from a self-hosted runner for an organization
[**actions_remove_all_custom_labels_from_self_hosted_runner_for_repo**](ActionsApi.md#actions_remove_all_custom_labels_from_self_hosted_runner_for_repo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Remove all custom labels from a self-hosted runner for a repository
[**actions_remove_custom_label_from_self_hosted_runner_for_org**](ActionsApi.md#actions_remove_custom_label_from_self_hosted_runner_for_org) | **DELETE** /orgs/{org}/actions/runners/{runner_id}/labels/{name} | Remove a custom label from a self-hosted runner for an organization
[**actions_remove_custom_label_from_self_hosted_runner_for_repo**](ActionsApi.md#actions_remove_custom_label_from_self_hosted_runner_for_repo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels/{name} | Remove a custom label from a self-hosted runner for a repository
[**actions_remove_repo_access_to_self_hosted_runner_group_in_org**](ActionsApi.md#actions_remove_repo_access_to_self_hosted_runner_group_in_org) | **DELETE** /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories/{repository_id} | Remove repository access to a self-hosted runner group in an organization
[**actions_remove_selected_repo_from_org_secret**](ActionsApi.md#actions_remove_selected_repo_from_org_secret) | **DELETE** /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret
[**actions_remove_self_hosted_runner_from_group_for_org**](ActionsApi.md#actions_remove_self_hosted_runner_from_group_for_org) | **DELETE** /orgs/{org}/actions/runner-groups/{runner_group_id}/runners/{runner_id} | Remove a self-hosted runner from a group for an organization
[**actions_review_pending_deployments_for_run**](ActionsApi.md#actions_review_pending_deployments_for_run) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments | Review pending deployments for a workflow run
[**actions_set_allowed_actions_organization**](ActionsApi.md#actions_set_allowed_actions_organization) | **PUT** /orgs/{org}/actions/permissions/selected-actions | Set allowed actions for an organization
[**actions_set_allowed_actions_repository**](ActionsApi.md#actions_set_allowed_actions_repository) | **PUT** /repos/{owner}/{repo}/actions/permissions/selected-actions | Set allowed actions for a repository
[**actions_set_custom_labels_for_self_hosted_runner_for_org**](ActionsApi.md#actions_set_custom_labels_for_self_hosted_runner_for_org) | **PUT** /orgs/{org}/actions/runners/{runner_id}/labels | Set custom labels for a self-hosted runner for an organization
[**actions_set_custom_labels_for_self_hosted_runner_for_repo**](ActionsApi.md#actions_set_custom_labels_for_self_hosted_runner_for_repo) | **PUT** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Set custom labels for a self-hosted runner for a repository
[**actions_set_github_actions_permissions_organization**](ActionsApi.md#actions_set_github_actions_permissions_organization) | **PUT** /orgs/{org}/actions/permissions | Set GitHub Actions permissions for an organization
[**actions_set_github_actions_permissions_repository**](ActionsApi.md#actions_set_github_actions_permissions_repository) | **PUT** /repos/{owner}/{repo}/actions/permissions | Set GitHub Actions permissions for a repository
[**actions_set_repo_access_to_self_hosted_runner_group_in_org**](ActionsApi.md#actions_set_repo_access_to_self_hosted_runner_group_in_org) | **PUT** /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories | Set repository access for a self-hosted runner group in an organization
[**actions_set_selected_repos_for_org_secret**](ActionsApi.md#actions_set_selected_repos_for_org_secret) | **PUT** /orgs/{org}/actions/secrets/{secret_name}/repositories | Set selected repositories for an organization secret
[**actions_set_selected_repositories_enabled_github_actions_organization**](ActionsApi.md#actions_set_selected_repositories_enabled_github_actions_organization) | **PUT** /orgs/{org}/actions/permissions/repositories | Set selected repositories enabled for GitHub Actions in an organization
[**actions_set_self_hosted_runners_in_group_for_org**](ActionsApi.md#actions_set_self_hosted_runners_in_group_for_org) | **PUT** /orgs/{org}/actions/runner-groups/{runner_group_id}/runners | Set self-hosted runners in a group for an organization
[**actions_update_self_hosted_runner_group_for_org**](ActionsApi.md#actions_update_self_hosted_runner_group_for_org) | **PATCH** /orgs/{org}/actions/runner-groups/{runner_group_id} | Update a self-hosted runner group for an organization


# **actions_add_custom_labels_to_self_hosted_runner_for_org**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_add_custom_labels_to_self_hosted_runner_for_org(org, runner_id, enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request)

Add custom labels to a self-hosted runner for an organization

Add custom labels to a self-hosted runner configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request = {"labels":["gpu","accelerated"]} # EnterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseRequest | 

    try:
        # Add custom labels to a self-hosted runner for an organization
        api_response = api_instance.actions_add_custom_labels_to_self_hosted_runner_for_org(org, runner_id, enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request)
        print("The response of ActionsApi->actions_add_custom_labels_to_self_hosted_runner_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_add_custom_labels_to_self_hosted_runner_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_add_custom_labels_to_self_hosted_runner_for_repo**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_add_custom_labels_to_self_hosted_runner_for_repo(owner, repo, runner_id, enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request)

Add custom labels to a self-hosted runner for a repository

Add custom labels to a self-hosted runner configured in a repository.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request = {"labels":["gpu","accelerated"]} # EnterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseRequest | 

    try:
        # Add custom labels to a self-hosted runner for a repository
        api_response = api_instance.actions_add_custom_labels_to_self_hosted_runner_for_repo(owner, repo, runner_id, enterprise_admin_add_custom_labels_to_self_hosted_runner_for_enterprise_request)
        print("The response of ActionsApi->actions_add_custom_labels_to_self_hosted_runner_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_add_custom_labels_to_self_hosted_runner_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
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

# **actions_add_repo_access_to_self_hosted_runner_group_in_org**
> actions_add_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, repository_id)

Add repository access to a self-hosted runner group in an organization

Adds a repository to the list of selected repositories that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see \"[Create a self-hosted runner group for an organization](#create-a-self-hosted-runner-group-for-an-organization).\"  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    repository_id = 56 # int | The unique identifier of the repository.

    try:
        # Add repository access to a self-hosted runner group in an organization
        api_instance.actions_add_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, repository_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_add_repo_access_to_self_hosted_runner_group_in_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **repository_id** | **int**| The unique identifier of the repository. | 

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

# **actions_add_selected_repo_to_org_secret**
> actions_add_selected_repo_to_org_secret(org, secret_name, repository_id)

Add selected repository to an organization secret

Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/enterprise-server@3.4/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    repository_id = 56 # int | 

    try:
        # Add selected repository to an organization secret
        api_instance.actions_add_selected_repo_to_org_secret(org, secret_name, repository_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_add_selected_repo_to_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **repository_id** | **int**|  | 

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
**204** | No Content when repository was added to the selected list |  -  |
**409** | Conflict when visibility type is not set to selected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_add_self_hosted_runner_to_group_for_org**
> actions_add_self_hosted_runner_to_group_for_org(org, runner_group_id, runner_id)

Add a self-hosted runner to a group for an organization

Adds a self-hosted runner to a runner group configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Add a self-hosted runner to a group for an organization
        api_instance.actions_add_self_hosted_runner_to_group_for_org(org, runner_group_id, runner_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_add_self_hosted_runner_to_group_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_cancel_workflow_run**
> object actions_cancel_workflow_run(owner, repo, run_id)

Cancel a workflow run

Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.

    try:
        # Cancel a workflow run
        api_response = api_instance.actions_cancel_workflow_run(owner, repo, run_id)
        print("The response of ActionsApi->actions_cancel_workflow_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_cancel_workflow_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 

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
**202** | Response |  -  |
**409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_create_or_update_environment_secret**
> object actions_create_or_update_environment_secret(repository_id, environment_name, secret_name, actions_create_or_update_environment_secret_request)

Create or update an environment secret

Creates or updates an environment secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  ``` const sodium = require('libsodium-wrappers') const secret = 'plain-text-secret' // replace with the secret you want to encrypt const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() => {   // Convert Secret & Base64 key to Uint8Array.   let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec = sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes = sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); ```  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  ``` from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -> str:   \"\"\"Encrypt a Unicode string using the public key.\"\"\"   public_key = public.PublicKey(public_key.encode(\"utf-8\"), encoding.Base64Encoder())   sealed_box = public.SealedBox(public_key)   encrypted = sealed_box.encrypt(secret_value.encode(\"utf-8\"))   return b64encode(encrypted).decode(\"utf-8\") ```  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  ``` var secretValue = System.Text.Encoding.UTF8.GetBytes(\"mySecret\"); var publicKey = Convert.FromBase64String(\"2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=\");  var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); ```  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  ```ruby require \"rbnacl\" require \"base64\"  key = Base64.decode64(\"+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=\") public_key = RbNaCl::PublicKey.new(key)  box = RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret = box.encrypt(\"my_secret\")  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) ```

### Example


```python
import openapi_client
from openapi_client.models.actions_create_or_update_environment_secret_request import ActionsCreateOrUpdateEnvironmentSecretRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    repository_id = 56 # int | The unique identifier of the repository.
    environment_name = 'environment_name_example' # str | The name of the environment.
    secret_name = 'secret_name_example' # str | The name of the secret.
    actions_create_or_update_environment_secret_request = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678"} # ActionsCreateOrUpdateEnvironmentSecretRequest | 

    try:
        # Create or update an environment secret
        api_response = api_instance.actions_create_or_update_environment_secret(repository_id, environment_name, secret_name, actions_create_or_update_environment_secret_request)
        print("The response of ActionsApi->actions_create_or_update_environment_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_or_update_environment_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository_id** | **int**| The unique identifier of the repository. | 
 **environment_name** | **str**| The name of the environment. | 
 **secret_name** | **str**| The name of the secret. | 
 **actions_create_or_update_environment_secret_request** | [**ActionsCreateOrUpdateEnvironmentSecretRequest**](ActionsCreateOrUpdateEnvironmentSecretRequest.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response when creating a secret |  -  |
**204** | Response when updating a secret |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_create_or_update_org_secret**
> object actions_create_or_update_org_secret(org, secret_name, actions_create_or_update_org_secret_request)

Create or update an organization secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  ``` const sodium = require('libsodium-wrappers') const secret = 'plain-text-secret' // replace with the secret you want to encrypt const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() => {   // Convert Secret & Base64 key to Uint8Array.   let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec = sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes = sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); ```  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  ``` from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -> str:   \"\"\"Encrypt a Unicode string using the public key.\"\"\"   public_key = public.PublicKey(public_key.encode(\"utf-8\"), encoding.Base64Encoder())   sealed_box = public.SealedBox(public_key)   encrypted = sealed_box.encrypt(secret_value.encode(\"utf-8\"))   return b64encode(encrypted).decode(\"utf-8\") ```  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  ``` var secretValue = System.Text.Encoding.UTF8.GetBytes(\"mySecret\"); var publicKey = Convert.FromBase64String(\"2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=\");  var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); ```  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  ```ruby require \"rbnacl\" require \"base64\"  key = Base64.decode64(\"+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=\") public_key = RbNaCl::PublicKey.new(key)  box = RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret = box.encrypt(\"my_secret\")  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) ```

### Example


```python
import openapi_client
from openapi_client.models.actions_create_or_update_org_secret_request import ActionsCreateOrUpdateOrgSecretRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    actions_create_or_update_org_secret_request = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678","selected_repository_ids":[1296269,1296280],"visibility":"selected"} # ActionsCreateOrUpdateOrgSecretRequest | 

    try:
        # Create or update an organization secret
        api_response = api_instance.actions_create_or_update_org_secret(org, secret_name, actions_create_or_update_org_secret_request)
        print("The response of ActionsApi->actions_create_or_update_org_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_or_update_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **actions_create_or_update_org_secret_request** | [**ActionsCreateOrUpdateOrgSecretRequest**](ActionsCreateOrUpdateOrgSecretRequest.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response when creating a secret |  -  |
**204** | Response when updating a secret |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_create_or_update_repo_secret**
> object actions_create_or_update_repo_secret(owner, repo, secret_name, actions_create_or_update_repo_secret_request)

Create or update a repository secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.  #### Example encrypting a secret using Node.js  Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.  ``` const sodium = require('libsodium-wrappers') const secret = 'plain-text-secret' // replace with the secret you want to encrypt const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key  //Check if libsodium is ready and then proceed. sodium.ready.then(() => {   // Convert Secret & Base64 key to Uint8Array.   let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)   let binsec = sodium.from_string(secret)    //Encrypt the secret using LibSodium   let encBytes = sodium.crypto_box_seal(binsec, binkey)    // Convert encrypted Uint8Array to Base64   let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)    console.log(output) }); ```  #### Example encrypting a secret using Python  Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.  ``` from base64 import b64encode from nacl import encoding, public  def encrypt(public_key: str, secret_value: str) -> str:   \"\"\"Encrypt a Unicode string using the public key.\"\"\"   public_key = public.PublicKey(public_key.encode(\"utf-8\"), encoding.Base64Encoder())   sealed_box = public.SealedBox(public_key)   encrypted = sealed_box.encrypt(secret_value.encode(\"utf-8\"))   return b64encode(encrypted).decode(\"utf-8\") ```  #### Example encrypting a secret using C#  Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.  ``` var secretValue = System.Text.Encoding.UTF8.GetBytes(\"mySecret\"); var publicKey = Convert.FromBase64String(\"2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=\");  var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);  Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox)); ```  #### Example encrypting a secret using Ruby  Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.  ```ruby require \"rbnacl\" require \"base64\"  key = Base64.decode64(\"+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=\") public_key = RbNaCl::PublicKey.new(key)  box = RbNaCl::Boxes::Sealed.from_public_key(public_key) encrypted_secret = box.encrypt(\"my_secret\")  # Print the base64 encoded secret puts Base64.strict_encode64(encrypted_secret) ```

### Example


```python
import openapi_client
from openapi_client.models.actions_create_or_update_repo_secret_request import ActionsCreateOrUpdateRepoSecretRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    actions_create_or_update_repo_secret_request = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678"} # ActionsCreateOrUpdateRepoSecretRequest | 

    try:
        # Create or update a repository secret
        api_response = api_instance.actions_create_or_update_repo_secret(owner, repo, secret_name, actions_create_or_update_repo_secret_request)
        print("The response of ActionsApi->actions_create_or_update_repo_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_or_update_repo_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **actions_create_or_update_repo_secret_request** | [**ActionsCreateOrUpdateRepoSecretRequest**](ActionsCreateOrUpdateRepoSecretRequest.md)|  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response when creating a secret |  -  |
**204** | Response when updating a secret |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_create_registration_token_for_org**
> AuthenticationToken actions_create_registration_token_for_org(org)

Create a registration token for an organization

Returns a token that you can pass to the `config` script. The token expires after one hour.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.  #### Example using registration token  Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.  ``` ./config.sh --url https://github.com/octo-org --token TOKEN ```

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Create a registration token for an organization
        api_response = api_instance.actions_create_registration_token_for_org(org)
        print("The response of ActionsApi->actions_create_registration_token_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_registration_token_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

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

# **actions_create_registration_token_for_repo**
> AuthenticationToken actions_create_registration_token_for_repo(owner, repo)

Create a registration token for a repository

Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.  #### Example using registration token   Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.  ``` ./config.sh --url https://github.com/octo-org/octo-repo-artifacts --token TOKEN ```

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Create a registration token for a repository
        api_response = api_instance.actions_create_registration_token_for_repo(owner, repo)
        print("The response of ActionsApi->actions_create_registration_token_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_registration_token_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

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

# **actions_create_remove_token_for_org**
> AuthenticationToken actions_create_remove_token_for_org(org)

Create a remove token for an organization

Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.  #### Example using remove token  To remove your self-hosted runner from an organization, replace `TOKEN` with the remove token provided by this endpoint.  ``` ./config.sh remove --token TOKEN ```

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Create a remove token for an organization
        api_response = api_instance.actions_create_remove_token_for_org(org)
        print("The response of ActionsApi->actions_create_remove_token_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_remove_token_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

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

# **actions_create_remove_token_for_repo**
> AuthenticationToken actions_create_remove_token_for_repo(owner, repo)

Create a remove token for a repository

Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.  #### Example using remove token   To remove your self-hosted runner from a repository, replace TOKEN with the remove token provided by this endpoint.  ``` ./config.sh remove --token TOKEN ```

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Create a remove token for a repository
        api_response = api_instance.actions_create_remove_token_for_repo(owner, repo)
        print("The response of ActionsApi->actions_create_remove_token_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_remove_token_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

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

# **actions_create_self_hosted_runner_group_for_org**
> RunnerGroupsOrg actions_create_self_hosted_runner_group_for_org(org, actions_create_self_hosted_runner_group_for_org_request)

Create a self-hosted runner group for an organization

Creates a new self-hosted runner group for an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_create_self_hosted_runner_group_for_org_request import ActionsCreateSelfHostedRunnerGroupForOrgRequest
from openapi_client.models.runner_groups_org import RunnerGroupsOrg
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    actions_create_self_hosted_runner_group_for_org_request = {"name":"Expensive hardware runners","runners":[9,2],"selected_repository_ids":[32,91],"visibility":"selected"} # ActionsCreateSelfHostedRunnerGroupForOrgRequest | 

    try:
        # Create a self-hosted runner group for an organization
        api_response = api_instance.actions_create_self_hosted_runner_group_for_org(org, actions_create_self_hosted_runner_group_for_org_request)
        print("The response of ActionsApi->actions_create_self_hosted_runner_group_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_self_hosted_runner_group_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **actions_create_self_hosted_runner_group_for_org_request** | [**ActionsCreateSelfHostedRunnerGroupForOrgRequest**](ActionsCreateSelfHostedRunnerGroupForOrgRequest.md)|  | 

### Return type

[**RunnerGroupsOrg**](RunnerGroupsOrg.md)

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

# **actions_create_workflow_dispatch**
> actions_create_workflow_dispatch(owner, repo, workflow_id, actions_create_workflow_dispatch_request)

Create a workflow dispatch event

You can use this endpoint to manually trigger a GitHub Actions workflow run. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.  You must configure your GitHub Actions workflow to run when the [`workflow_dispatch` webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The `inputs` are configured in the workflow file. For more information about how to configure the `workflow_dispatch` event in the workflow file, see \"[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch).\"  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see \"[Creating a personal access token for the command line](https://docs.github.com/enterprise-server@3.4/articles/creating-a-personal-access-token-for-the-command-line).\"

### Example


```python
import openapi_client
from openapi_client.models.actions_create_workflow_dispatch_request import ActionsCreateWorkflowDispatchRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    workflow_id = openapi_client.ActionsGetWorkflowWorkflowIdParameter() # ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    actions_create_workflow_dispatch_request = {"inputs":{"home":"San Francisco, CA","name":"Mona the Octocat"},"ref":"topic-branch"} # ActionsCreateWorkflowDispatchRequest | 

    try:
        # Create a workflow dispatch event
        api_instance.actions_create_workflow_dispatch(owner, repo, workflow_id, actions_create_workflow_dispatch_request)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_create_workflow_dispatch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **workflow_id** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | 
 **actions_create_workflow_dispatch_request** | [**ActionsCreateWorkflowDispatchRequest**](ActionsCreateWorkflowDispatchRequest.md)|  | 

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

# **actions_delete_artifact**
> actions_delete_artifact(owner, repo, artifact_id)

Delete an artifact

Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    artifact_id = 56 # int | The unique identifier of the artifact.

    try:
        # Delete an artifact
        api_instance.actions_delete_artifact(owner, repo, artifact_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_artifact: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **artifact_id** | **int**| The unique identifier of the artifact. | 

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

# **actions_delete_environment_secret**
> actions_delete_environment_secret(repository_id, environment_name, secret_name)

Delete an environment secret

Deletes a secret in an environment using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    repository_id = 56 # int | The unique identifier of the repository.
    environment_name = 'environment_name_example' # str | The name of the environment.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Delete an environment secret
        api_instance.actions_delete_environment_secret(repository_id, environment_name, secret_name)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_environment_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository_id** | **int**| The unique identifier of the repository. | 
 **environment_name** | **str**| The name of the environment. | 
 **secret_name** | **str**| The name of the secret. | 

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

# **actions_delete_org_secret**
> actions_delete_org_secret(org, secret_name)

Delete an organization secret

Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Delete an organization secret
        api_instance.actions_delete_org_secret(org, secret_name)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

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

# **actions_delete_repo_secret**
> actions_delete_repo_secret(owner, repo, secret_name)

Delete a repository secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Delete a repository secret
        api_instance.actions_delete_repo_secret(owner, repo, secret_name)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_repo_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

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

# **actions_delete_self_hosted_runner_from_org**
> actions_delete_self_hosted_runner_from_org(org, runner_id)

Delete a self-hosted runner from an organization

Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Delete a self-hosted runner from an organization
        api_instance.actions_delete_self_hosted_runner_from_org(org, runner_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_self_hosted_runner_from_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_delete_self_hosted_runner_from_repo**
> actions_delete_self_hosted_runner_from_repo(owner, repo, runner_id)

Delete a self-hosted runner from a repository

Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Delete a self-hosted runner from a repository
        api_instance.actions_delete_self_hosted_runner_from_repo(owner, repo, runner_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_self_hosted_runner_from_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
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

# **actions_delete_self_hosted_runner_group_from_org**
> actions_delete_self_hosted_runner_group_from_org(org, runner_group_id)

Delete a self-hosted runner group from an organization

Deletes a self-hosted runner group for an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.

    try:
        # Delete a self-hosted runner group from an organization
        api_instance.actions_delete_self_hosted_runner_group_from_org(org, runner_group_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_self_hosted_runner_group_from_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_delete_workflow_run**
> actions_delete_workflow_run(owner, repo, run_id)

Delete a workflow run

Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.

    try:
        # Delete a workflow run
        api_instance.actions_delete_workflow_run(owner, repo, run_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_workflow_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 

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

# **actions_delete_workflow_run_logs**
> actions_delete_workflow_run_logs(owner, repo, run_id)

Delete workflow run logs

Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.

    try:
        # Delete workflow run logs
        api_instance.actions_delete_workflow_run_logs(owner, repo, run_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_delete_workflow_run_logs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 

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
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_disable_selected_repository_github_actions_organization**
> actions_disable_selected_repository_github_actions_organization(org, repository_id)

Disable a selected repository for GitHub Actions in an organization

Removes a repository from the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\"  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    repository_id = 56 # int | The unique identifier of the repository.

    try:
        # Disable a selected repository for GitHub Actions in an organization
        api_instance.actions_disable_selected_repository_github_actions_organization(org, repository_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_disable_selected_repository_github_actions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **repository_id** | **int**| The unique identifier of the repository. | 

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

# **actions_disable_workflow**
> actions_disable_workflow(owner, repo, workflow_id)

Disable a workflow

Disables a workflow and sets the `state` of the workflow to `disabled_manually`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    workflow_id = openapi_client.ActionsGetWorkflowWorkflowIdParameter() # ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.

    try:
        # Disable a workflow
        api_instance.actions_disable_workflow(owner, repo, workflow_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_disable_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **workflow_id** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | 

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

# **actions_download_artifact**
> actions_download_artifact(owner, repo, artifact_id, archive_format)

Download an artifact

Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    artifact_id = 56 # int | The unique identifier of the artifact.
    archive_format = 'archive_format_example' # str | 

    try:
        # Download an artifact
        api_instance.actions_download_artifact(owner, repo, artifact_id, archive_format)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_download_artifact: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **artifact_id** | **int**| The unique identifier of the artifact. | 
 **archive_format** | **str**|  | 

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
**302** | Response |  * Location -  <br>  |
**410** | Gone |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_download_job_logs_for_workflow_run**
> actions_download_job_logs_for_workflow_run(owner, repo, job_id)

Download job logs for a workflow run

Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    job_id = 56 # int | The unique identifier of the job.

    try:
        # Download job logs for a workflow run
        api_instance.actions_download_job_logs_for_workflow_run(owner, repo, job_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_download_job_logs_for_workflow_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **job_id** | **int**| The unique identifier of the job. | 

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

# **actions_download_workflow_run_logs**
> actions_download_workflow_run_logs(owner, repo, run_id)

Download workflow run logs

Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.

    try:
        # Download workflow run logs
        api_instance.actions_download_workflow_run_logs(owner, repo, run_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_download_workflow_run_logs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 

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

# **actions_enable_selected_repository_github_actions_organization**
> actions_enable_selected_repository_github_actions_organization(org, repository_id)

Enable a selected repository for GitHub Actions in an organization

Adds a repository to the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\"  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    repository_id = 56 # int | The unique identifier of the repository.

    try:
        # Enable a selected repository for GitHub Actions in an organization
        api_instance.actions_enable_selected_repository_github_actions_organization(org, repository_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_enable_selected_repository_github_actions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **repository_id** | **int**| The unique identifier of the repository. | 

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

# **actions_enable_workflow**
> actions_enable_workflow(owner, repo, workflow_id)

Enable a workflow

Enables a workflow and sets the `state` of the workflow to `active`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    workflow_id = openapi_client.ActionsGetWorkflowWorkflowIdParameter() # ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.

    try:
        # Enable a workflow
        api_instance.actions_enable_workflow(owner, repo, workflow_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_enable_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **workflow_id** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | 

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

# **actions_get_allowed_actions_organization**
> SelectedActions actions_get_allowed_actions_organization(org)

Get allowed actions for an organization

Gets the selected actions that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\"\"  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Get allowed actions for an organization
        api_response = api_instance.actions_get_allowed_actions_organization(org)
        print("The response of ActionsApi->actions_get_allowed_actions_organization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_allowed_actions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

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

# **actions_get_allowed_actions_repository**
> SelectedActions actions_get_allowed_actions_repository(owner, repo)

Get allowed actions for a repository

Gets the settings for selected actions that are allowed in a repository. To use this endpoint, the repository policy for `allowed_actions` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository).\"  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get allowed actions for a repository
        api_response = api_instance.actions_get_allowed_actions_repository(owner, repo)
        print("The response of ActionsApi->actions_get_allowed_actions_repository:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_allowed_actions_repository: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

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

# **actions_get_artifact**
> Artifact actions_get_artifact(owner, repo, artifact_id)

Get an artifact

Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.artifact import Artifact
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    artifact_id = 56 # int | The unique identifier of the artifact.

    try:
        # Get an artifact
        api_response = api_instance.actions_get_artifact(owner, repo, artifact_id)
        print("The response of ActionsApi->actions_get_artifact:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_artifact: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **artifact_id** | **int**| The unique identifier of the artifact. | 

### Return type

[**Artifact**](Artifact.md)

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

# **actions_get_environment_public_key**
> ActionsPublicKey actions_get_environment_public_key(repository_id, environment_name)

Get an environment public key

Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_public_key import ActionsPublicKey
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    repository_id = 56 # int | The unique identifier of the repository.
    environment_name = 'environment_name_example' # str | The name of the environment.

    try:
        # Get an environment public key
        api_response = api_instance.actions_get_environment_public_key(repository_id, environment_name)
        print("The response of ActionsApi->actions_get_environment_public_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_environment_public_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository_id** | **int**| The unique identifier of the repository. | 
 **environment_name** | **str**| The name of the environment. | 

### Return type

[**ActionsPublicKey**](ActionsPublicKey.md)

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

# **actions_get_environment_secret**
> ActionsSecret actions_get_environment_secret(repository_id, environment_name, secret_name)

Get an environment secret

Gets a single environment secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_secret import ActionsSecret
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    repository_id = 56 # int | The unique identifier of the repository.
    environment_name = 'environment_name_example' # str | The name of the environment.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Get an environment secret
        api_response = api_instance.actions_get_environment_secret(repository_id, environment_name, secret_name)
        print("The response of ActionsApi->actions_get_environment_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_environment_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository_id** | **int**| The unique identifier of the repository. | 
 **environment_name** | **str**| The name of the environment. | 
 **secret_name** | **str**| The name of the secret. | 

### Return type

[**ActionsSecret**](ActionsSecret.md)

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

# **actions_get_github_actions_permissions_organization**
> ActionsOrganizationPermissions actions_get_github_actions_permissions_organization(org)

Get GitHub Actions permissions for an organization

Gets the GitHub Actions permissions policy for repositories and allowed actions in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

### Example


```python
import openapi_client
from openapi_client.models.actions_organization_permissions import ActionsOrganizationPermissions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Get GitHub Actions permissions for an organization
        api_response = api_instance.actions_get_github_actions_permissions_organization(org)
        print("The response of ActionsApi->actions_get_github_actions_permissions_organization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_github_actions_permissions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

### Return type

[**ActionsOrganizationPermissions**](ActionsOrganizationPermissions.md)

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

# **actions_get_github_actions_permissions_repository**
> ActionsRepositoryPermissions actions_get_github_actions_permissions_repository(owner, repo)

Get GitHub Actions permissions for a repository

Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions allowed to run in the repository.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

### Example


```python
import openapi_client
from openapi_client.models.actions_repository_permissions import ActionsRepositoryPermissions
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get GitHub Actions permissions for a repository
        api_response = api_instance.actions_get_github_actions_permissions_repository(owner, repo)
        print("The response of ActionsApi->actions_get_github_actions_permissions_repository:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_github_actions_permissions_repository: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**ActionsRepositoryPermissions**](ActionsRepositoryPermissions.md)

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

# **actions_get_job_for_workflow_run**
> Job actions_get_job_for_workflow_run(owner, repo, job_id)

Get a job for a workflow run

Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.job import Job
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    job_id = 56 # int | The unique identifier of the job.

    try:
        # Get a job for a workflow run
        api_response = api_instance.actions_get_job_for_workflow_run(owner, repo, job_id)
        print("The response of ActionsApi->actions_get_job_for_workflow_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_job_for_workflow_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **job_id** | **int**| The unique identifier of the job. | 

### Return type

[**Job**](Job.md)

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

# **actions_get_org_public_key**
> ActionsPublicKey actions_get_org_public_key(org)

Get an organization public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_public_key import ActionsPublicKey
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # Get an organization public key
        api_response = api_instance.actions_get_org_public_key(org)
        print("The response of ActionsApi->actions_get_org_public_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_org_public_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

### Return type

[**ActionsPublicKey**](ActionsPublicKey.md)

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

# **actions_get_org_secret**
> OrganizationActionsSecret actions_get_org_secret(org, secret_name)

Get an organization secret

Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.organization_actions_secret import OrganizationActionsSecret
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Get an organization secret
        api_response = api_instance.actions_get_org_secret(org, secret_name)
        print("The response of ActionsApi->actions_get_org_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

### Return type

[**OrganizationActionsSecret**](OrganizationActionsSecret.md)

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

# **actions_get_pending_deployments_for_run**
> List[PendingDeployment] actions_get_pending_deployments_for_run(owner, repo, run_id)

Get pending deployments for a workflow run

Get all deployment environments for a workflow run that are waiting for protection rules to pass.  Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.pending_deployment import PendingDeployment
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.

    try:
        # Get pending deployments for a workflow run
        api_response = api_instance.actions_get_pending_deployments_for_run(owner, repo, run_id)
        print("The response of ActionsApi->actions_get_pending_deployments_for_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_pending_deployments_for_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 

### Return type

[**List[PendingDeployment]**](PendingDeployment.md)

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

# **actions_get_repo_public_key**
> ActionsPublicKey actions_get_repo_public_key(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_public_key import ActionsPublicKey
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # Get a repository public key
        api_response = api_instance.actions_get_repo_public_key(owner, repo)
        print("The response of ActionsApi->actions_get_repo_public_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_repo_public_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

### Return type

[**ActionsPublicKey**](ActionsPublicKey.md)

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

# **actions_get_repo_secret**
> ActionsSecret actions_get_repo_secret(owner, repo, secret_name)

Get a repository secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_secret import ActionsSecret
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.

    try:
        # Get a repository secret
        api_response = api_instance.actions_get_repo_secret(owner, repo, secret_name)
        print("The response of ActionsApi->actions_get_repo_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_repo_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 

### Return type

[**ActionsSecret**](ActionsSecret.md)

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

# **actions_get_reviews_for_run**
> List[EnvironmentApprovals] actions_get_reviews_for_run(owner, repo, run_id)

Get the review history for a workflow run

Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.environment_approvals import EnvironmentApprovals
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.

    try:
        # Get the review history for a workflow run
        api_response = api_instance.actions_get_reviews_for_run(owner, repo, run_id)
        print("The response of ActionsApi->actions_get_reviews_for_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_reviews_for_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 

### Return type

[**List[EnvironmentApprovals]**](EnvironmentApprovals.md)

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

# **actions_get_self_hosted_runner_for_org**
> Runner actions_get_self_hosted_runner_for_org(org, runner_id)

Get a self-hosted runner for an organization

Gets a specific self-hosted runner configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Get a self-hosted runner for an organization
        api_response = api_instance.actions_get_self_hosted_runner_for_org(org, runner_id)
        print("The response of ActionsApi->actions_get_self_hosted_runner_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_self_hosted_runner_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_get_self_hosted_runner_for_repo**
> Runner actions_get_self_hosted_runner_for_repo(owner, repo, runner_id)

Get a self-hosted runner for a repository

Gets a specific self-hosted runner configured in a repository.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Get a self-hosted runner for a repository
        api_response = api_instance.actions_get_self_hosted_runner_for_repo(owner, repo, runner_id)
        print("The response of ActionsApi->actions_get_self_hosted_runner_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_self_hosted_runner_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
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

# **actions_get_self_hosted_runner_group_for_org**
> RunnerGroupsOrg actions_get_self_hosted_runner_group_for_org(org, runner_group_id)

Get a self-hosted runner group for an organization

Gets a specific self-hosted runner group for an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.runner_groups_org import RunnerGroupsOrg
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.

    try:
        # Get a self-hosted runner group for an organization
        api_response = api_instance.actions_get_self_hosted_runner_group_for_org(org, runner_group_id)
        print("The response of ActionsApi->actions_get_self_hosted_runner_group_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_self_hosted_runner_group_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 

### Return type

[**RunnerGroupsOrg**](RunnerGroupsOrg.md)

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

# **actions_get_workflow**
> Workflow actions_get_workflow(owner, repo, workflow_id)

Get a workflow

Gets a specific workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.workflow import Workflow
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    workflow_id = openapi_client.ActionsGetWorkflowWorkflowIdParameter() # ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.

    try:
        # Get a workflow
        api_response = api_instance.actions_get_workflow(owner, repo, workflow_id)
        print("The response of ActionsApi->actions_get_workflow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **workflow_id** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | 

### Return type

[**Workflow**](Workflow.md)

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

# **actions_get_workflow_run**
> WorkflowRun actions_get_workflow_run(owner, repo, run_id, exclude_pull_requests=exclude_pull_requests)

Get a workflow run

Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.workflow_run import WorkflowRun
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.
    exclude_pull_requests = False # bool | If `true` pull requests are omitted from the response (empty array). (optional) (default to False)

    try:
        # Get a workflow run
        api_response = api_instance.actions_get_workflow_run(owner, repo, run_id, exclude_pull_requests=exclude_pull_requests)
        print("The response of ActionsApi->actions_get_workflow_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_get_workflow_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 
 **exclude_pull_requests** | **bool**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to False]

### Return type

[**WorkflowRun**](WorkflowRun.md)

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

# **actions_list_artifacts_for_repo**
> ActionsListArtifactsForRepo200Response actions_list_artifacts_for_repo(owner, repo, per_page=per_page, page=page, name=name)

List artifacts for a repository

Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_artifacts_for_repo200_response import ActionsListArtifactsForRepo200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    name = 'name_example' # str | Filters artifacts by exact match on their name field. (optional)

    try:
        # List artifacts for a repository
        api_response = api_instance.actions_list_artifacts_for_repo(owner, repo, per_page=per_page, page=page, name=name)
        print("The response of ActionsApi->actions_list_artifacts_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_artifacts_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **name** | **str**| Filters artifacts by exact match on their name field. | [optional] 

### Return type

[**ActionsListArtifactsForRepo200Response**](ActionsListArtifactsForRepo200Response.md)

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

# **actions_list_environment_secrets**
> ActionsListRepoSecrets200Response actions_list_environment_secrets(repository_id, environment_name, per_page=per_page, page=page)

List environment secrets

Lists all secrets available in an environment without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_repo_secrets200_response import ActionsListRepoSecrets200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    repository_id = 56 # int | The unique identifier of the repository.
    environment_name = 'environment_name_example' # str | The name of the environment.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List environment secrets
        api_response = api_instance.actions_list_environment_secrets(repository_id, environment_name, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_environment_secrets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_environment_secrets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository_id** | **int**| The unique identifier of the repository. | 
 **environment_name** | **str**| The name of the environment. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListRepoSecrets200Response**](ActionsListRepoSecrets200Response.md)

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

# **actions_list_jobs_for_workflow_run**
> ActionsListJobsForWorkflowRun200Response actions_list_jobs_for_workflow_run(owner, repo, run_id, filter=filter, per_page=per_page, page=page)

List jobs for a workflow run

Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#parameters).

### Example


```python
import openapi_client
from openapi_client.models.actions_list_jobs_for_workflow_run200_response import ActionsListJobsForWorkflowRun200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.
    filter = latest # str | Filters jobs by their `completed_at` timestamp. `latest` returns jobs from the most recent execution of the workflow run. `all` returns all jobs for a workflow run, including from old executions of the workflow run. (optional) (default to latest)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List jobs for a workflow run
        api_response = api_instance.actions_list_jobs_for_workflow_run(owner, repo, run_id, filter=filter, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_jobs_for_workflow_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_jobs_for_workflow_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 
 **filter** | **str**| Filters jobs by their &#x60;completed_at&#x60; timestamp. &#x60;latest&#x60; returns jobs from the most recent execution of the workflow run. &#x60;all&#x60; returns all jobs for a workflow run, including from old executions of the workflow run. | [optional] [default to latest]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListJobsForWorkflowRun200Response**](ActionsListJobsForWorkflowRun200Response.md)

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

# **actions_list_labels_for_self_hosted_runner_for_org**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_list_labels_for_self_hosted_runner_for_org(org, runner_id)

List labels for a self-hosted runner for an organization

Lists all labels for a self-hosted runner configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # List labels for a self-hosted runner for an organization
        api_response = api_instance.actions_list_labels_for_self_hosted_runner_for_org(org, runner_id)
        print("The response of ActionsApi->actions_list_labels_for_self_hosted_runner_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_labels_for_self_hosted_runner_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_list_labels_for_self_hosted_runner_for_repo**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_list_labels_for_self_hosted_runner_for_repo(owner, repo, runner_id)

List labels for a self-hosted runner for a repository

Lists all labels for a self-hosted runner configured in a repository.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # List labels for a self-hosted runner for a repository
        api_response = api_instance.actions_list_labels_for_self_hosted_runner_for_repo(owner, repo, runner_id)
        print("The response of ActionsApi->actions_list_labels_for_self_hosted_runner_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_labels_for_self_hosted_runner_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
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

# **actions_list_org_secrets**
> ActionsListOrgSecrets200Response actions_list_org_secrets(org, per_page=per_page, page=page)

List organization secrets

Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_org_secrets200_response import ActionsListOrgSecrets200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List organization secrets
        api_response = api_instance.actions_list_org_secrets(org, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_org_secrets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_org_secrets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListOrgSecrets200Response**](ActionsListOrgSecrets200Response.md)

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

# **actions_list_repo_access_to_self_hosted_runner_group_in_org**
> ActionsListRepoAccessToSelfHostedRunnerGroupInOrg200Response actions_list_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, page=page, per_page=per_page)

List repository access to a self-hosted runner group in an organization

Lists the repositories with access to a self-hosted runner group configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_repo_access_to_self_hosted_runner_group_in_org200_response import ActionsListRepoAccessToSelfHostedRunnerGroupInOrg200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List repository access to a self-hosted runner group in an organization
        api_response = api_instance.actions_list_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, page=page, per_page=per_page)
        print("The response of ActionsApi->actions_list_repo_access_to_self_hosted_runner_group_in_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_repo_access_to_self_hosted_runner_group_in_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**ActionsListRepoAccessToSelfHostedRunnerGroupInOrg200Response**](ActionsListRepoAccessToSelfHostedRunnerGroupInOrg200Response.md)

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

# **actions_list_repo_secrets**
> ActionsListRepoSecrets200Response actions_list_repo_secrets(owner, repo, per_page=per_page, page=page)

List repository secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_repo_secrets200_response import ActionsListRepoSecrets200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository secrets
        api_response = api_instance.actions_list_repo_secrets(owner, repo, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_repo_secrets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_repo_secrets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListRepoSecrets200Response**](ActionsListRepoSecrets200Response.md)

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

# **actions_list_repo_workflows**
> ActionsListRepoWorkflows200Response actions_list_repo_workflows(owner, repo, per_page=per_page, page=page)

List repository workflows

Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_repo_workflows200_response import ActionsListRepoWorkflows200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List repository workflows
        api_response = api_instance.actions_list_repo_workflows(owner, repo, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_repo_workflows:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_repo_workflows: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListRepoWorkflows200Response**](ActionsListRepoWorkflows200Response.md)

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

# **actions_list_runner_applications_for_org**
> List[RunnerApplication] actions_list_runner_applications_for_org(org)

List runner applications for an organization

Lists binaries for the runner application that you can download and run.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.

    try:
        # List runner applications for an organization
        api_response = api_instance.actions_list_runner_applications_for_org(org)
        print("The response of ActionsApi->actions_list_runner_applications_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_runner_applications_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 

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

# **actions_list_runner_applications_for_repo**
> List[RunnerApplication] actions_list_runner_applications_for_repo(owner, repo)

List runner applications for a repository

Lists binaries for the runner application that you can download and run.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.

    try:
        # List runner applications for a repository
        api_response = api_instance.actions_list_runner_applications_for_repo(owner, repo)
        print("The response of ActionsApi->actions_list_runner_applications_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_runner_applications_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 

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

# **actions_list_selected_repos_for_org_secret**
> ActionsListSelectedReposForOrgSecret200Response actions_list_selected_repos_for_org_secret(org, secret_name, page=page, per_page=per_page)

List selected repositories for an organization secret

Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_selected_repos_for_org_secret200_response import ActionsListSelectedReposForOrgSecret200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)

    try:
        # List selected repositories for an organization secret
        api_response = api_instance.actions_list_selected_repos_for_org_secret(org, secret_name, page=page, per_page=per_page)
        print("The response of ActionsApi->actions_list_selected_repos_for_org_secret:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_selected_repos_for_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

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

# **actions_list_selected_repositories_enabled_github_actions_organization**
> ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response actions_list_selected_repositories_enabled_github_actions_organization(org, per_page=per_page, page=page)

List selected repositories enabled for GitHub Actions in an organization

Lists the selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\"  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_selected_repositories_enabled_github_actions_organization200_response import ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List selected repositories enabled for GitHub Actions in an organization
        api_response = api_instance.actions_list_selected_repositories_enabled_github_actions_organization(org, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_selected_repositories_enabled_github_actions_organization:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_selected_repositories_enabled_github_actions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response**](ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response.md)

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

# **actions_list_self_hosted_runner_groups_for_org**
> ActionsListSelfHostedRunnerGroupsForOrg200Response actions_list_self_hosted_runner_groups_for_org(org, per_page=per_page, page=page)

List self-hosted runner groups for an organization

Lists all self-hosted runner groups configured in an organization and inherited from an enterprise.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_self_hosted_runner_groups_for_org200_response import ActionsListSelfHostedRunnerGroupsForOrg200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List self-hosted runner groups for an organization
        api_response = api_instance.actions_list_self_hosted_runner_groups_for_org(org, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_self_hosted_runner_groups_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_self_hosted_runner_groups_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListSelfHostedRunnerGroupsForOrg200Response**](ActionsListSelfHostedRunnerGroupsForOrg200Response.md)

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

# **actions_list_self_hosted_runners_for_org**
> ActionsListSelfHostedRunnersForOrg200Response actions_list_self_hosted_runners_for_org(org, per_page=per_page, page=page)

List self-hosted runners for an organization

Lists all self-hosted runners configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_self_hosted_runners_for_org200_response import ActionsListSelfHostedRunnersForOrg200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List self-hosted runners for an organization
        api_response = api_instance.actions_list_self_hosted_runners_for_org(org, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_self_hosted_runners_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_self_hosted_runners_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListSelfHostedRunnersForOrg200Response**](ActionsListSelfHostedRunnersForOrg200Response.md)

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

# **actions_list_self_hosted_runners_for_repo**
> ActionsListSelfHostedRunnersForOrg200Response actions_list_self_hosted_runners_for_repo(owner, repo, per_page=per_page, page=page)

List self-hosted runners for a repository

Lists all self-hosted runners configured in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_self_hosted_runners_for_org200_response import ActionsListSelfHostedRunnersForOrg200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List self-hosted runners for a repository
        api_response = api_instance.actions_list_self_hosted_runners_for_repo(owner, repo, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_self_hosted_runners_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_self_hosted_runners_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListSelfHostedRunnersForOrg200Response**](ActionsListSelfHostedRunnersForOrg200Response.md)

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

# **actions_list_self_hosted_runners_in_group_for_org**
> EnterpriseAdminListSelfHostedRunnersInGroupForEnterprise200Response actions_list_self_hosted_runners_in_group_for_org(org, runner_group_id, per_page=per_page, page=page)

List self-hosted runners in a group for an organization

Lists self-hosted runners that are in a specific organization group.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List self-hosted runners in a group for an organization
        api_response = api_instance.actions_list_self_hosted_runners_in_group_for_org(org, runner_group_id, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_self_hosted_runners_in_group_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_self_hosted_runners_in_group_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_list_workflow_run_artifacts**
> ActionsListArtifactsForRepo200Response actions_list_workflow_run_artifacts(owner, repo, run_id, per_page=per_page, page=page)

List workflow run artifacts

Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_artifacts_for_repo200_response import ActionsListArtifactsForRepo200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)

    try:
        # List workflow run artifacts
        api_response = api_instance.actions_list_workflow_run_artifacts(owner, repo, run_id, per_page=per_page, page=page)
        print("The response of ActionsApi->actions_list_workflow_run_artifacts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_workflow_run_artifacts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]

### Return type

[**ActionsListArtifactsForRepo200Response**](ActionsListArtifactsForRepo200Response.md)

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

# **actions_list_workflow_runs**
> ActionsListWorkflowRunsForRepo200Response actions_list_workflow_runs(owner, repo, workflow_id, actor=actor, branch=branch, event=event, status=status, per_page=per_page, page=page, created=created, exclude_pull_requests=exclude_pull_requests)

List workflow runs for a workflow

List all workflow runs for a workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_workflow_runs_for_repo200_response import ActionsListWorkflowRunsForRepo200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    workflow_id = openapi_client.ActionsGetWorkflowWorkflowIdParameter() # ActionsGetWorkflowWorkflowIdParameter | The ID of the workflow. You can also pass the workflow file name as a string.
    actor = 'actor_example' # str | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. (optional)
    branch = 'branch_example' # str | Returns workflow runs associated with a branch. Use the name of the branch of the `push`. (optional)
    event = 'event_example' # str | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see \"[Events that trigger workflows](https://docs.github.com/enterprise-server@3.4/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\" (optional)
    status = 'status_example' # str | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    created = '2013-10-20T19:20:30+01:00' # datetime | Returns workflow runs created within the given date-time range. For more information on the syntax, see \"[Understanding the search syntax](https://docs.github.com/enterprise-server@3.4/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\" (optional)
    exclude_pull_requests = False # bool | If `true` pull requests are omitted from the response (empty array). (optional) (default to False)

    try:
        # List workflow runs for a workflow
        api_response = api_instance.actions_list_workflow_runs(owner, repo, workflow_id, actor=actor, branch=branch, event=event, status=status, per_page=per_page, page=page, created=created, exclude_pull_requests=exclude_pull_requests)
        print("The response of ActionsApi->actions_list_workflow_runs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_workflow_runs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **workflow_id** | [**ActionsGetWorkflowWorkflowIdParameter**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. | 
 **actor** | **str**| Returns someone&#39;s workflow runs. Use the login for the user who created the &#x60;push&#x60; associated with the check suite or workflow run. | [optional] 
 **branch** | **str**| Returns workflow runs associated with a branch. Use the name of the branch of the &#x60;push&#x60;. | [optional] 
 **event** | **str**| Returns workflow run triggered by the event you specify. For example, &#x60;push&#x60;, &#x60;pull_request&#x60; or &#x60;issue&#x60;. For more information, see \&quot;[Events that trigger workflows](https://docs.github.com/enterprise-server@3.4/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\&quot; | [optional] 
 **status** | **str**| Returns workflow runs with the check run &#x60;status&#x60; or &#x60;conclusion&#x60; that you specify. For example, a conclusion can be &#x60;success&#x60; or a status can be &#x60;in_progress&#x60;. Only GitHub can set a status of &#x60;waiting&#x60; or &#x60;requested&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **created** | **datetime**| Returns workflow runs created within the given date-time range. For more information on the syntax, see \&quot;[Understanding the search syntax](https://docs.github.com/enterprise-server@3.4/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] 
 **exclude_pull_requests** | **bool**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to False]

### Return type

[**ActionsListWorkflowRunsForRepo200Response**](ActionsListWorkflowRunsForRepo200Response.md)

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

# **actions_list_workflow_runs_for_repo**
> ActionsListWorkflowRunsForRepo200Response actions_list_workflow_runs_for_repo(owner, repo, actor=actor, branch=branch, event=event, status=status, per_page=per_page, page=page, created=created, exclude_pull_requests=exclude_pull_requests)

List workflow runs for a repository

Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/enterprise-server@3.4/rest/overview/resources-in-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_list_workflow_runs_for_repo200_response import ActionsListWorkflowRunsForRepo200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    actor = 'actor_example' # str | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. (optional)
    branch = 'branch_example' # str | Returns workflow runs associated with a branch. Use the name of the branch of the `push`. (optional)
    event = 'event_example' # str | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see \"[Events that trigger workflows](https://docs.github.com/enterprise-server@3.4/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\" (optional)
    status = 'status_example' # str | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. (optional)
    per_page = 30 # int | The number of results per page (max 100). (optional) (default to 30)
    page = 1 # int | Page number of the results to fetch. (optional) (default to 1)
    created = '2013-10-20T19:20:30+01:00' # datetime | Returns workflow runs created within the given date-time range. For more information on the syntax, see \"[Understanding the search syntax](https://docs.github.com/enterprise-server@3.4/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\" (optional)
    exclude_pull_requests = False # bool | If `true` pull requests are omitted from the response (empty array). (optional) (default to False)

    try:
        # List workflow runs for a repository
        api_response = api_instance.actions_list_workflow_runs_for_repo(owner, repo, actor=actor, branch=branch, event=event, status=status, per_page=per_page, page=page, created=created, exclude_pull_requests=exclude_pull_requests)
        print("The response of ActionsApi->actions_list_workflow_runs_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_list_workflow_runs_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **actor** | **str**| Returns someone&#39;s workflow runs. Use the login for the user who created the &#x60;push&#x60; associated with the check suite or workflow run. | [optional] 
 **branch** | **str**| Returns workflow runs associated with a branch. Use the name of the branch of the &#x60;push&#x60;. | [optional] 
 **event** | **str**| Returns workflow run triggered by the event you specify. For example, &#x60;push&#x60;, &#x60;pull_request&#x60; or &#x60;issue&#x60;. For more information, see \&quot;[Events that trigger workflows](https://docs.github.com/enterprise-server@3.4/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\&quot; | [optional] 
 **status** | **str**| Returns workflow runs with the check run &#x60;status&#x60; or &#x60;conclusion&#x60; that you specify. For example, a conclusion can be &#x60;success&#x60; or a status can be &#x60;in_progress&#x60;. Only GitHub can set a status of &#x60;waiting&#x60; or &#x60;requested&#x60;. | [optional] 
 **per_page** | **int**| The number of results per page (max 100). | [optional] [default to 30]
 **page** | **int**| Page number of the results to fetch. | [optional] [default to 1]
 **created** | **datetime**| Returns workflow runs created within the given date-time range. For more information on the syntax, see \&quot;[Understanding the search syntax](https://docs.github.com/enterprise-server@3.4/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] 
 **exclude_pull_requests** | **bool**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to False]

### Return type

[**ActionsListWorkflowRunsForRepo200Response**](ActionsListWorkflowRunsForRepo200Response.md)

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

# **actions_re_run_workflow**
> object actions_re_run_workflow(owner, repo, run_id, body=body)

Re-run a workflow

Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.
    body = None # object |  (optional)

    try:
        # Re-run a workflow
        api_response = api_instance.actions_re_run_workflow(owner, repo, run_id, body=body)
        print("The response of ActionsApi->actions_re_run_workflow:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_re_run_workflow: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 
 **body** | **object**|  | [optional] 

### Return type

**object**

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

# **actions_remove_all_custom_labels_from_self_hosted_runner_for_org**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_remove_all_custom_labels_from_self_hosted_runner_for_org(org, runner_id)

Remove all custom labels from a self-hosted runner for an organization

Remove all custom labels from a self-hosted runner configured in an organization. Returns the remaining read-only labels from the runner.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Remove all custom labels from a self-hosted runner for an organization
        api_response = api_instance.actions_remove_all_custom_labels_from_self_hosted_runner_for_org(org, runner_id)
        print("The response of ActionsApi->actions_remove_all_custom_labels_from_self_hosted_runner_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_remove_all_custom_labels_from_self_hosted_runner_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_remove_all_custom_labels_from_self_hosted_runner_for_repo**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_remove_all_custom_labels_from_self_hosted_runner_for_repo(owner, repo, runner_id)

Remove all custom labels from a self-hosted runner for a repository

Remove all custom labels from a self-hosted runner configured in a repository. Returns the remaining read-only labels from the runner.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Remove all custom labels from a self-hosted runner for a repository
        api_response = api_instance.actions_remove_all_custom_labels_from_self_hosted_runner_for_repo(owner, repo, runner_id)
        print("The response of ActionsApi->actions_remove_all_custom_labels_from_self_hosted_runner_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_remove_all_custom_labels_from_self_hosted_runner_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
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

# **actions_remove_custom_label_from_self_hosted_runner_for_org**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_remove_custom_label_from_self_hosted_runner_for_org(org, runner_id, name)

Remove a custom label from a self-hosted runner for an organization

Remove a custom label from a self-hosted runner configured in an organization. Returns the remaining labels from the runner.  This endpoint returns a `404 Not Found` status if the custom label is not present on the runner.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    name = 'name_example' # str | The name of a self-hosted runner's custom label.

    try:
        # Remove a custom label from a self-hosted runner for an organization
        api_response = api_instance.actions_remove_custom_label_from_self_hosted_runner_for_org(org, runner_id, name)
        print("The response of ActionsApi->actions_remove_custom_label_from_self_hosted_runner_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_remove_custom_label_from_self_hosted_runner_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_remove_custom_label_from_self_hosted_runner_for_repo**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_remove_custom_label_from_self_hosted_runner_for_repo(owner, repo, runner_id, name)

Remove a custom label from a self-hosted runner for a repository

Remove a custom label from a self-hosted runner configured in a repository. Returns the remaining labels from the runner.  This endpoint returns a `404 Not Found` status if the custom label is not present on the runner.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    name = 'name_example' # str | The name of a self-hosted runner's custom label.

    try:
        # Remove a custom label from a self-hosted runner for a repository
        api_response = api_instance.actions_remove_custom_label_from_self_hosted_runner_for_repo(owner, repo, runner_id, name)
        print("The response of ActionsApi->actions_remove_custom_label_from_self_hosted_runner_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_remove_custom_label_from_self_hosted_runner_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
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

# **actions_remove_repo_access_to_self_hosted_runner_group_in_org**
> actions_remove_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, repository_id)

Remove repository access to a self-hosted runner group in an organization

Removes a repository from the list of selected repositories that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see \"[Create a self-hosted runner group for an organization](#create-a-self-hosted-runner-group-for-an-organization).\"  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    repository_id = 56 # int | The unique identifier of the repository.

    try:
        # Remove repository access to a self-hosted runner group in an organization
        api_instance.actions_remove_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, repository_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_remove_repo_access_to_self_hosted_runner_group_in_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **repository_id** | **int**| The unique identifier of the repository. | 

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

# **actions_remove_selected_repo_from_org_secret**
> actions_remove_selected_repo_from_org_secret(org, secret_name, repository_id)

Remove selected repository from an organization secret

Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/enterprise-server@3.4/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    repository_id = 56 # int | 

    try:
        # Remove selected repository from an organization secret
        api_instance.actions_remove_selected_repo_from_org_secret(org, secret_name, repository_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_remove_selected_repo_from_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **repository_id** | **int**|  | 

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
**204** | Response when repository was removed from the selected list |  -  |
**409** | Conflict when visibility type not set to selected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **actions_remove_self_hosted_runner_from_group_for_org**
> actions_remove_self_hosted_runner_from_group_for_org(org, runner_group_id, runner_id)

Remove a self-hosted runner from a group for an organization

Removes a self-hosted runner from a group configured in an organization. The runner is then returned to the default group.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.

    try:
        # Remove a self-hosted runner from a group for an organization
        api_instance.actions_remove_self_hosted_runner_from_group_for_org(org, runner_group_id, runner_id)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_remove_self_hosted_runner_from_group_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_review_pending_deployments_for_run**
> List[Deployment] actions_review_pending_deployments_for_run(owner, repo, run_id, actions_review_pending_deployments_for_run_request)

Review pending deployments for a workflow run

Approve or reject pending deployments that are waiting on approval by a required reviewer.  Required reviewers with read access to the repository contents and deployments can use this endpoint. Required reviewers must authenticate using an access token with the `repo` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_review_pending_deployments_for_run_request import ActionsReviewPendingDeploymentsForRunRequest
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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    run_id = 56 # int | The unique identifier of the workflow run.
    actions_review_pending_deployments_for_run_request = {"comment":"Ship it!","environment_ids":[161171787],"state":"approved"} # ActionsReviewPendingDeploymentsForRunRequest | 

    try:
        # Review pending deployments for a workflow run
        api_response = api_instance.actions_review_pending_deployments_for_run(owner, repo, run_id, actions_review_pending_deployments_for_run_request)
        print("The response of ActionsApi->actions_review_pending_deployments_for_run:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_review_pending_deployments_for_run: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **run_id** | **int**| The unique identifier of the workflow run. | 
 **actions_review_pending_deployments_for_run_request** | [**ActionsReviewPendingDeploymentsForRunRequest**](ActionsReviewPendingDeploymentsForRunRequest.md)|  | 

### Return type

[**List[Deployment]**](Deployment.md)

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

# **actions_set_allowed_actions_organization**
> actions_set_allowed_actions_organization(org, selected_actions=selected_actions)

Set allowed actions for an organization

Sets the actions that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\"  If the organization belongs to an enterprise that has `selected` actions set at the enterprise level, then you cannot override any of the enterprise's allowed actions settings.  To use the `patterns_allowed` setting for private repositories, the organization must belong to an enterprise. If the organization does not belong to an enterprise, then the `patterns_allowed` setting only applies to public repositories in the organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    selected_actions = openapi_client.SelectedActions() # SelectedActions |  (optional)

    try:
        # Set allowed actions for an organization
        api_instance.actions_set_allowed_actions_organization(org, selected_actions=selected_actions)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_allowed_actions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **selected_actions** | [**SelectedActions**](SelectedActions.md)|  | [optional] 

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

# **actions_set_allowed_actions_repository**
> actions_set_allowed_actions_repository(owner, repo, selected_actions=selected_actions)

Set allowed actions for a repository

Sets the actions that are allowed in a repository. To use this endpoint, the repository permission policy for `allowed_actions` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository).\"  If the repository belongs to an organization or enterprise that has `selected` actions set at the organization or enterprise levels, then you cannot override any of the allowed actions settings.  To use the `patterns_allowed` setting for private repositories, the repository must belong to an enterprise. If the repository does not belong to an enterprise, then the `patterns_allowed` setting only applies to public repositories.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    selected_actions = openapi_client.SelectedActions() # SelectedActions |  (optional)

    try:
        # Set allowed actions for a repository
        api_instance.actions_set_allowed_actions_repository(owner, repo, selected_actions=selected_actions)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_allowed_actions_repository: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **selected_actions** | [**SelectedActions**](SelectedActions.md)|  | [optional] 

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

# **actions_set_custom_labels_for_self_hosted_runner_for_org**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_set_custom_labels_for_self_hosted_runner_for_org(org, runner_id, enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request)

Set custom labels for a self-hosted runner for an organization

Remove all previous custom labels and set the new custom labels for a specific self-hosted runner configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request = {"labels":["gpu","accelerated"]} # EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest | 

    try:
        # Set custom labels for a self-hosted runner for an organization
        api_response = api_instance.actions_set_custom_labels_for_self_hosted_runner_for_org(org, runner_id, enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request)
        print("The response of ActionsApi->actions_set_custom_labels_for_self_hosted_runner_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_custom_labels_for_self_hosted_runner_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_set_custom_labels_for_self_hosted_runner_for_repo**
> EnterpriseAdminListLabelsForSelfHostedRunnerForEnterprise200Response actions_set_custom_labels_for_self_hosted_runner_for_repo(owner, repo, runner_id, enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request)

Set custom labels for a self-hosted runner for a repository

Remove all previous custom labels and set the new custom labels for a specific self-hosted runner configured in a repository.  You must authenticate using an access token with the `repo` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    runner_id = 56 # int | Unique identifier of the self-hosted runner.
    enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request = {"labels":["gpu","accelerated"]} # EnterpriseAdminSetCustomLabelsForSelfHostedRunnerForEnterpriseRequest | 

    try:
        # Set custom labels for a self-hosted runner for a repository
        api_response = api_instance.actions_set_custom_labels_for_self_hosted_runner_for_repo(owner, repo, runner_id, enterprise_admin_set_custom_labels_for_self_hosted_runner_for_enterprise_request)
        print("The response of ActionsApi->actions_set_custom_labels_for_self_hosted_runner_for_repo:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_custom_labels_for_self_hosted_runner_for_repo: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
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

# **actions_set_github_actions_permissions_organization**
> actions_set_github_actions_permissions_organization(org, actions_set_github_actions_permissions_organization_request)

Set GitHub Actions permissions for an organization

Sets the GitHub Actions permissions policy for repositories and allowed actions in an organization.  If the organization belongs to an enterprise that has set restrictive permissions at the enterprise level, such as `allowed_actions` to `selected` actions, then you cannot override them for the organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

### Example


```python
import openapi_client
from openapi_client.models.actions_set_github_actions_permissions_organization_request import ActionsSetGithubActionsPermissionsOrganizationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    actions_set_github_actions_permissions_organization_request = {"allowed_actions":"selected","enabled_repositories":"all"} # ActionsSetGithubActionsPermissionsOrganizationRequest | 

    try:
        # Set GitHub Actions permissions for an organization
        api_instance.actions_set_github_actions_permissions_organization(org, actions_set_github_actions_permissions_organization_request)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_github_actions_permissions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **actions_set_github_actions_permissions_organization_request** | [**ActionsSetGithubActionsPermissionsOrganizationRequest**](ActionsSetGithubActionsPermissionsOrganizationRequest.md)|  | 

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

# **actions_set_github_actions_permissions_repository**
> actions_set_github_actions_permissions_repository(owner, repo, actions_set_github_actions_permissions_repository_request)

Set GitHub Actions permissions for a repository

Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions in the repository.  If the repository belongs to an organization or enterprise that has set restrictive permissions at the organization or enterprise levels, such as `allowed_actions` to `selected` actions, then you cannot override them for the repository.  You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

### Example


```python
import openapi_client
from openapi_client.models.actions_set_github_actions_permissions_repository_request import ActionsSetGithubActionsPermissionsRepositoryRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    owner = 'owner_example' # str | The account owner of the repository. The name is not case sensitive.
    repo = 'repo_example' # str | The name of the repository. The name is not case sensitive.
    actions_set_github_actions_permissions_repository_request = {"allowed_actions":"selected","enabled":true} # ActionsSetGithubActionsPermissionsRepositoryRequest | 

    try:
        # Set GitHub Actions permissions for a repository
        api_instance.actions_set_github_actions_permissions_repository(owner, repo, actions_set_github_actions_permissions_repository_request)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_github_actions_permissions_repository: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| The account owner of the repository. The name is not case sensitive. | 
 **repo** | **str**| The name of the repository. The name is not case sensitive. | 
 **actions_set_github_actions_permissions_repository_request** | [**ActionsSetGithubActionsPermissionsRepositoryRequest**](ActionsSetGithubActionsPermissionsRepositoryRequest.md)|  | 

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

# **actions_set_repo_access_to_self_hosted_runner_group_in_org**
> actions_set_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, actions_set_repo_access_to_self_hosted_runner_group_in_org_request)

Set repository access for a self-hosted runner group in an organization

Replaces the list of repositories that have access to a self-hosted runner group configured in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_set_repo_access_to_self_hosted_runner_group_in_org_request import ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    actions_set_repo_access_to_self_hosted_runner_group_in_org_request = {"selected_repository_ids":[32,91]} # ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequest | 

    try:
        # Set repository access for a self-hosted runner group in an organization
        api_instance.actions_set_repo_access_to_self_hosted_runner_group_in_org(org, runner_group_id, actions_set_repo_access_to_self_hosted_runner_group_in_org_request)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_repo_access_to_self_hosted_runner_group_in_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **actions_set_repo_access_to_self_hosted_runner_group_in_org_request** | [**ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequest**](ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequest.md)|  | 

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

# **actions_set_selected_repos_for_org_secret**
> actions_set_selected_repos_for_org_secret(org, secret_name, actions_set_selected_repos_for_org_secret_request)

Set selected repositories for an organization secret

Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/enterprise-server@3.4/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_set_selected_repos_for_org_secret_request import ActionsSetSelectedReposForOrgSecretRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    secret_name = 'secret_name_example' # str | The name of the secret.
    actions_set_selected_repos_for_org_secret_request = {"selected_repository_ids":[64780797]} # ActionsSetSelectedReposForOrgSecretRequest | 

    try:
        # Set selected repositories for an organization secret
        api_instance.actions_set_selected_repos_for_org_secret(org, secret_name, actions_set_selected_repos_for_org_secret_request)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_selected_repos_for_org_secret: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **secret_name** | **str**| The name of the secret. | 
 **actions_set_selected_repos_for_org_secret_request** | [**ActionsSetSelectedReposForOrgSecretRequest**](ActionsSetSelectedReposForOrgSecretRequest.md)|  | 

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

# **actions_set_selected_repositories_enabled_github_actions_organization**
> actions_set_selected_repositories_enabled_github_actions_organization(org, actions_set_selected_repositories_enabled_github_actions_organization_request)

Set selected repositories enabled for GitHub Actions in an organization

Replaces the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see \"[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\"  You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

### Example


```python
import openapi_client
from openapi_client.models.actions_set_selected_repositories_enabled_github_actions_organization_request import ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    actions_set_selected_repositories_enabled_github_actions_organization_request = {"selected_repository_ids":[32,42]} # ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest | 

    try:
        # Set selected repositories enabled for GitHub Actions in an organization
        api_instance.actions_set_selected_repositories_enabled_github_actions_organization(org, actions_set_selected_repositories_enabled_github_actions_organization_request)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_selected_repositories_enabled_github_actions_organization: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **actions_set_selected_repositories_enabled_github_actions_organization_request** | [**ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest**](ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest.md)|  | 

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

# **actions_set_self_hosted_runners_in_group_for_org**
> actions_set_self_hosted_runners_in_group_for_org(org, runner_group_id, enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request)

Set self-hosted runners in a group for an organization

Replaces the list of self-hosted runners that are part of an organization runner group.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

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
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request = {"runners":[9,2]} # EnterpriseAdminSetSelfHostedRunnersInGroupForEnterpriseRequest | 

    try:
        # Set self-hosted runners in a group for an organization
        api_instance.actions_set_self_hosted_runners_in_group_for_org(org, runner_group_id, enterprise_admin_set_self_hosted_runners_in_group_for_enterprise_request)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_set_self_hosted_runners_in_group_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
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

# **actions_update_self_hosted_runner_group_for_org**
> RunnerGroupsOrg actions_update_self_hosted_runner_group_for_org(org, runner_group_id, actions_update_self_hosted_runner_group_for_org_request)

Update a self-hosted runner group for an organization

Updates the `name` and `visibility` of a self-hosted runner group in an organization.  You must authenticate using an access token with the `admin:org` scope to use this endpoint.

### Example


```python
import openapi_client
from openapi_client.models.actions_update_self_hosted_runner_group_for_org_request import ActionsUpdateSelfHostedRunnerGroupForOrgRequest
from openapi_client.models.runner_groups_org import RunnerGroupsOrg
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://github.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://github.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ActionsApi(api_client)
    org = 'org_example' # str | The organization name. The name is not case sensitive.
    runner_group_id = 56 # int | Unique identifier of the self-hosted runner group.
    actions_update_self_hosted_runner_group_for_org_request = {"name":"Expensive hardware runners","visibility":"selected"} # ActionsUpdateSelfHostedRunnerGroupForOrgRequest | 

    try:
        # Update a self-hosted runner group for an organization
        api_response = api_instance.actions_update_self_hosted_runner_group_for_org(org, runner_group_id, actions_update_self_hosted_runner_group_for_org_request)
        print("The response of ActionsApi->actions_update_self_hosted_runner_group_for_org:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ActionsApi->actions_update_self_hosted_runner_group_for_org: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **str**| The organization name. The name is not case sensitive. | 
 **runner_group_id** | **int**| Unique identifier of the self-hosted runner group. | 
 **actions_update_self_hosted_runner_group_for_org_request** | [**ActionsUpdateSelfHostedRunnerGroupForOrgRequest**](ActionsUpdateSelfHostedRunnerGroupForOrgRequest.md)|  | 

### Return type

[**RunnerGroupsOrg**](RunnerGroupsOrg.md)

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

