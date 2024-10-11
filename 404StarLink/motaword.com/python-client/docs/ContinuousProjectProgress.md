# ContinuousProjectProgress


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**costs** | [**ContinuousProjectCosts**](ContinuousProjectCosts.md) |  | [optional] 
**progress** | [**Progress**](Progress.md) |  | [optional] 
**word_counts** | [**ContinuousProjectWordCounts**](ContinuousProjectWordCounts.md) |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_progress import ContinuousProjectProgress

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectProgress from a JSON string
continuous_project_progress_instance = ContinuousProjectProgress.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectProgress.to_json())

# convert the object into a dict
continuous_project_progress_dict = continuous_project_progress_instance.to_dict()
# create an instance of ContinuousProjectProgress from a dict
continuous_project_progress_from_dict = ContinuousProjectProgress.from_dict(continuous_project_progress_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


