# OrganizationFullPlan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filled_seats** | **int** |  | [optional] 
**name** | **str** |  | 
**private_repos** | **int** |  | 
**seats** | **int** |  | [optional] 
**space** | **int** |  | 

## Example

```python
from openapi_client.models.organization_full_plan import OrganizationFullPlan

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationFullPlan from a JSON string
organization_full_plan_instance = OrganizationFullPlan.from_json(json)
# print the JSON string representation of the object
print(OrganizationFullPlan.to_json())

# convert the object into a dict
organization_full_plan_dict = organization_full_plan_instance.to_dict()
# create an instance of OrganizationFullPlan from a dict
organization_full_plan_from_dict = OrganizationFullPlan.from_dict(organization_full_plan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


