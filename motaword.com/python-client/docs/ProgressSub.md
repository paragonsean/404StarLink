# ProgressSub


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proofreading** | **float** |  | [optional] 
**total** | **float** |  | [optional] 
**translation** | **float** |  | [optional] 
**word_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.progress_sub import ProgressSub

# TODO update the JSON string below
json = "{}"
# create an instance of ProgressSub from a JSON string
progress_sub_instance = ProgressSub.from_json(json)
# print the JSON string representation of the object
print(ProgressSub.to_json())

# convert the object into a dict
progress_sub_dict = progress_sub_instance.to_dict()
# create an instance of ProgressSub from a dict
progress_sub_from_dict = ProgressSub.from_dict(progress_sub_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


