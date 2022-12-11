# Progress


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proofreading** | **float** |  | [optional] 
**total** | **float** |  | [optional] 
**translation** | **float** |  | [optional] 
**word_count** | **int** |  | [optional] 
**languages** | [**Dict[str, ProgressSub]**](ProgressSub.md) |  | [optional] 
**links** | [**ProgressLink**](ProgressLink.md) |  | [optional] 
**project_status** | [**ProjectStatus**](ProjectStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.progress import Progress

# TODO update the JSON string below
json = "{}"
# create an instance of Progress from a JSON string
progress_instance = Progress.from_json(json)
# print the JSON string representation of the object
print(Progress.to_json())

# convert the object into a dict
progress_dict = progress_instance.to_dict()
# create an instance of Progress from a dict
progress_from_dict = Progress.from_dict(progress_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


