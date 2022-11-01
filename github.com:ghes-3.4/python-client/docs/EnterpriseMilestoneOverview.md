# EnterpriseMilestoneOverview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closed_milestones** | **int** |  | 
**open_milestones** | **int** |  | 
**total_milestones** | **int** |  | 

## Example

```python
from openapi_client.models.enterprise_milestone_overview import EnterpriseMilestoneOverview

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseMilestoneOverview from a JSON string
enterprise_milestone_overview_instance = EnterpriseMilestoneOverview.from_json(json)
# print the JSON string representation of the object
print(EnterpriseMilestoneOverview.to_json())

# convert the object into a dict
enterprise_milestone_overview_dict = enterprise_milestone_overview_instance.to_dict()
# create an instance of EnterpriseMilestoneOverview from a dict
enterprise_milestone_overview_from_dict = EnterpriseMilestoneOverview.from_dict(enterprise_milestone_overview_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


