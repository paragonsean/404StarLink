# DepartmentVisitedTag


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_value** | **str** |  | 
**scores** | [**Scores**](Scores.md) |  | 

## Example

```python
from openapi_client.models.department_visited_tag import DepartmentVisitedTag

# TODO update the JSON string below
json = "{}"
# create an instance of DepartmentVisitedTag from a JSON string
department_visited_tag_instance = DepartmentVisitedTag.from_json(json)
# print the JSON string representation of the object
print(DepartmentVisitedTag.to_json())

# convert the object into a dict
department_visited_tag_dict = department_visited_tag_instance.to_dict()
# create an instance of DepartmentVisitedTag from a dict
department_visited_tag_from_dict = DepartmentVisitedTag.from_dict(department_visited_tag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


