# EnterpriseOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | [**EnterpriseCommentOverview**](EnterpriseCommentOverview.md) |  | [optional] 
**gists** | [**EnterpriseGistOverview**](EnterpriseGistOverview.md) |  | [optional] 
**hooks** | [**EnterpriseHookOverview**](EnterpriseHookOverview.md) |  | [optional] 
**issues** | [**EnterpriseIssueOverview**](EnterpriseIssueOverview.md) |  | [optional] 
**milestones** | [**EnterpriseMilestoneOverview**](EnterpriseMilestoneOverview.md) |  | [optional] 
**orgs** | [**EnterpriseOrganizationOverview**](EnterpriseOrganizationOverview.md) |  | [optional] 
**pages** | [**EnterprisePageOverview**](EnterprisePageOverview.md) |  | [optional] 
**pulls** | [**EnterprisePullRequestOverview**](EnterprisePullRequestOverview.md) |  | [optional] 
**repos** | [**EnterpriseRepositoryOverview**](EnterpriseRepositoryOverview.md) |  | [optional] 
**users** | [**EnterpriseUserOverview**](EnterpriseUserOverview.md) |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_overview import EnterpriseOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseOverview from a JSON string
enterprise_overview_instance = EnterpriseOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseOverview.to_json())

# convert the object into a dict
enterprise_overview_dict = enterprise_overview_instance.to_dict()
# create an instance of EnterpriseOverview from a dict
enterprise_overview_from_dict = EnterpriseOverview.from_dict(enterprise_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


