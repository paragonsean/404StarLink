# Project

Projects are a way to organize columns and cards of work.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** | Body of the project | 
**columns_url** | **str** |  | 
**created_at** | **datetime** |  | 
**creator** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**html_url** | **str** |  | 
**id** | **int** |  | 
**name** | **str** | Name of the project | 
**node_id** | **str** |  | 
**number** | **int** |  | 
**organization_permission** | **str** | The baseline permission that all organization members have on this project. Only present if owner is an organization. | [optional] 
**owner_url** | **str** |  | 
**private** | **bool** | Whether or not this project can be seen by everyone. Only present if owner is an organization. | [optional] 
**state** | **str** | State of the project; either &#39;open&#39; or &#39;closed&#39; | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.project import Project

# TODO update the JSON string below
json = "{}"
# create an instance of Project from a JSON string
project_instance = Project.from_json(json)
# print the JSON string representation of the object
print(Project.to_json())

# convert the object into a dict
project_dict = project_instance.to_dict()
# create an instance of Project from a dict
project_from_dict = Project.from_dict(project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


