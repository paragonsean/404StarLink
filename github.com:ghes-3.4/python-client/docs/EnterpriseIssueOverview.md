# EnterpriseIssueOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closed_issues** | **int** |  | 
**open_issues** | **int** |  | 
**total_issues** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_issue_overview import EnterpriseIssueOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseIssueOverview from a JSON string
enterprise_issue_overview_instance = EnterpriseIssueOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseIssueOverview.to_json())

# convert the object into a dict
enterprise_issue_overview_dict = enterprise_issue_overview_instance.to_dict()
# create an instance of EnterpriseIssueOverview from a dict
enterprise_issue_overview_from_dict = EnterpriseIssueOverview.from_dict(enterprise_issue_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


