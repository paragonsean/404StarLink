# ContinuousProjectsList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**projects** | [**List[ContinuousProject]**](ContinuousProject.md) |  | [optional] 

## Example

```python
from openapi_client.models.continuous_projects_list import ContinuousProjectsList

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectsList from a JSON string
continuous_projects_list_instance = ContinuousProjectsList.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectsList.to_json())

# convert the object into a dict
continuous_projects_list_dict = continuous_projects_list_instance.to_dict()
# create an instance of ContinuousProjectsList from a dict
continuous_projects_list_from_dict = ContinuousProjectsList.from_dict(continuous_projects_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


