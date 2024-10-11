# EnterpriseSettingsEnterpriseGithubOauth


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** |  | [optional] 
**client_secret** | **str** |  | [optional] 
**organization_name** | **str** |  | [optional] 
**organization_team** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_settings_enterprise_github_oauth import EnterpriseSettingsEnterpriseGithubOauth

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseSettingsEnterpriseGithubOauth from a JSON string
enterprise_settings_enterprise_github_oauth_instance = EnterpriseSettingsEnterpriseGithubOauth.from_json(json)
# print the JSON string representation of the object
print(EnterpriseSettingsEnterpriseGithubOauth.to_json())

# convert the object into a dict
enterprise_settings_enterprise_github_oauth_dict = enterprise_settings_enterprise_github_oauth_instance.to_dict()
# create an instance of EnterpriseSettingsEnterpriseGithubOauth from a dict
enterprise_settings_enterprise_github_oauth_from_dict = EnterpriseSettingsEnterpriseGithubOauth.from_dict(enterprise_settings_enterprise_github_oauth_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


