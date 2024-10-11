# ProjectColumn

Project columns contain cards of work.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cards_url** | **str** |  | 
**created_at** | **datetime** |  | 
**id** | **int** | The unique identifier of the project column | 
**name** | **str** | Name of the project column | 
**node_id** | **str** |  | 
**project_url** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.project_column import ProjectColumn

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectColumn from a JSON string
project_column_instance = ProjectColumn.from_json(json)
# print the JSON string representation of the object
print(ProjectColumn.to_json())

# convert the object into a dict
project_column_dict = project_column_instance.to_dict()
# create an instance of ProjectColumn from a dict
project_column_from_dict = ProjectColumn.from_dict(project_column_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


