# ActionsCreateSelfHostedRunnerGroupForOrgRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allows_public_repositories** | **bool** | Whether the runner group can be used by &#x60;public&#x60; repositories. | [optional] [default to False]
**name** | **str** | Name of the runner group. | 
**runners** | **List[int]** | List of runner IDs to add to the runner group. | [optional] 
**selected_repository_ids** | **List[int]** | List of repository IDs that can access the runner group. | [optional] 
**visibility** | **str** | Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to private repositories. | [optional] [default to 'all']

## Example

```python
from openapi_client.models.actions_create_self_hosted_runner_group_for_org_request import ActionsCreateSelfHostedRunnerGroupForOrgRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ActionsCreateSelfHostedRunnerGroupForOrgRequest from a JSON string
actions_create_self_hosted_runner_group_for_org_request_instance = ActionsCreateSelfHostedRunnerGroupForOrgRequest.from_json(json)
# print the JSON string representation of the object
print(ActionsCreateSelfHostedRunnerGroupForOrgRequest.to_json())

# convert the object into a dict
actions_create_self_hosted_runner_group_for_org_request_dict = actions_create_self_hosted_runner_group_for_org_request_instance.to_dict()
# create an instance of ActionsCreateSelfHostedRunnerGroupForOrgRequest from a dict
actions_create_self_hosted_runner_group_for_org_request_from_dict = ActionsCreateSelfHostedRunnerGroupForOrgRequest.from_dict(actions_create_self_hosted_runner_group_for_org_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


