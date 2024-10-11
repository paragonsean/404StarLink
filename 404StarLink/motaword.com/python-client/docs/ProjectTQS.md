# ProjectTQS


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_above_average** | **bool** | Is this score above or below the average among other vendors in the same project? | [optional] 
**score** | **float** |  | [optional] 
**strings_edited** | **int** | The number of translated strings by this translator which was edited by a proofreader. | [optional] 
**strings_translated** | **int** | The number of translated strings by this translator. | [optional] 

## Example

```python
from openapi_client.models.project_tqs import ProjectTQS

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectTQS from a JSON string
project_tqs_instance = ProjectTQS.from_json(json)
# print the JSON string representation of the object
print(ProjectTQS.to_json())

# convert the object into a dict
project_tqs_dict = project_tqs_instance.to_dict()
# create an instance of ProjectTQS from a dict
project_tqs_from_dict = ProjectTQS.from_dict(project_tqs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


