# ActionsEnterprisePermissions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed_actions** | [**AllowedActions**](AllowedActions.md) |  | [optional] 
**enabled_organizations** | [**EnabledOrganizations**](EnabledOrganizations.md) |  | 
**selected_actions_url** | **str** | The API URL to use to get or set the actions that are allowed to run, when &#x60;allowed_actions&#x60; is set to &#x60;selected&#x60;. | [optional] 
**selected_organizations_url** | **str** | The API URL to use to get or set the selected organizations that are allowed to run GitHub Actions, when &#x60;enabled_organizations&#x60; is set to &#x60;selected&#x60;. | [optional] 

## Example

```python
from openapi_client.models.actions_enterprise_permissions import ActionsEnterprisePermissions

# TODO update the JSON string below
json = "{}"
# create an instance of ActionsEnterprisePermissions from a JSON string
actions_enterprise_permissions_instance = ActionsEnterprisePermissions.from_json(json)
# print the JSON string representation of the object
print(ActionsEnterprisePermissions.to_json())

# convert the object into a dict
actions_enterprise_permissions_dict = actions_enterprise_permissions_instance.to_dict()
# create an instance of ActionsEnterprisePermissions from a dict
actions_enterprise_permissions_from_dict = ActionsEnterprisePermissions.from_dict(actions_enterprise_permissions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


