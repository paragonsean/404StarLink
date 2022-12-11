# ProjectWordCountAnalysis


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base** | **float** |  | [optional] 
**duplicate** | **float** |  | [optional] 
**exclusion** | **float** |  | [optional] 
**final** | **float** |  | [optional] 
**tm** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.project_word_count_analysis import ProjectWordCountAnalysis

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectWordCountAnalysis from a JSON string
project_word_count_analysis_instance = ProjectWordCountAnalysis.from_json(json)
# print the JSON string representation of the object
print(ProjectWordCountAnalysis.to_json())

# convert the object into a dict
project_word_count_analysis_dict = project_word_count_analysis_instance.to_dict()
# create an instance of ProjectWordCountAnalysis from a dict
project_word_count_analysis_from_dict = ProjectWordCountAnalysis.from_dict(project_word_count_analysis_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


