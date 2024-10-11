# EnterpriseRepositoryOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fork_repos** | **int** |  | 
**org_repos** | **int** |  | 
**root_repos** | **int** |  | 
**total_pushes** | **int** |  | 
**total_repos** | **int** |  | 
**total_wikis** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_repository_overview import EnterpriseRepositoryOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseRepositoryOverview from a JSON string
enterprise_repository_overview_instance = EnterpriseRepositoryOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseRepositoryOverview.to_json())

# convert the object into a dict
enterprise_repository_overview_dict = enterprise_repository_overview_instance.to_dict()
# create an instance of EnterpriseRepositoryOverview from a dict
enterprise_repository_overview_from_dict = EnterpriseRepositoryOverview.from_dict(enterprise_repository_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


