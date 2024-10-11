# EnterprisePullRequestOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mergeable_pulls** | **int** |  | 
**merged_pulls** | **int** |  | 
**total_pulls** | **int** |  | 
**unmergeable_pulls** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_pull_request_overview import EnterprisePullRequestOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterprisePullRequestOverview from a JSON string
enterprise_pull_request_overview_instance = EnterprisePullRequestOverview.from_json(json)
# print the JSON string representation of the object
print(EnterprisePullRequestOverview.to_json())

# convert the object into a dict
enterprise_pull_request_overview_dict = enterprise_pull_request_overview_instance.to_dict()
# create an instance of EnterprisePullRequestOverview from a dict
enterprise_pull_request_overview_from_dict = EnterprisePullRequestOverview.from_dict(enterprise_pull_request_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


