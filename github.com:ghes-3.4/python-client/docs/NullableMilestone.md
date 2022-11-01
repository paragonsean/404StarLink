# NullableMilestone

A collection of related issues and pull requests.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closed_at** | **datetime** |  | 
**closed_issues** | **int** |  | 
**created_at** | **datetime** |  | 
**creator** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**description** | **str** |  | 
**due_on** | **datetime** |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**labels_url** | **str** |  | 
**node_id** | **str** |  | 
**number** | **int** | The number of the milestone. | 
**open_issues** | **int** |  | 
**state** | **str** | The state of the milestone. | [default to 'open']
**title** | **str** | The title of the milestone. | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.nullable_milestone import NullableMilestone

# TODO update the JSON string below
json = "{}"
# create an instance of NullableMilestone from a JSON string
nullable_milestone_instance = NullableMilestone.from_json(json)
# print the JSON string representation of the object
print(NullableMilestone.to_json())

# convert the object into a dict
nullable_milestone_dict = nullable_milestone_instance.to_dict()
# create an instance of NullableMilestone from a dict
nullable_milestone_from_dict = NullableMilestone.from_dict(nullable_milestone_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


