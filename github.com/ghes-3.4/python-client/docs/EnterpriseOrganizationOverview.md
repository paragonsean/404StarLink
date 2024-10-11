# EnterpriseOrganizationOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabled_orgs** | **int** |  | 
**total_orgs** | **int** |  | 
**total_team_members** | **int** |  | 
**total_teams** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_organization_overview import EnterpriseOrganizationOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseOrganizationOverview from a JSON string
enterprise_organization_overview_instance = EnterpriseOrganizationOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseOrganizationOverview.to_json())

# convert the object into a dict
enterprise_organization_overview_dict = enterprise_organization_overview_instance.to_dict()
# create an instance of EnterpriseOrganizationOverview from a dict
enterprise_organization_overview_from_dict = EnterpriseOrganizationOverview.from_dict(enterprise_organization_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


