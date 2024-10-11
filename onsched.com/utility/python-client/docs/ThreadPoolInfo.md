# ThreadPoolInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available_completion_threads** | **int** |  | [optional] 
**available_worker_threads** | **int** |  | [optional] 
**max_completion_threads** | **int** |  | [optional] 
**max_worker_threads** | **int** |  | [optional] 
**min_completion_threads** | **int** |  | [optional] 
**min_worker_threads** | **int** |  | [optional] 
**occupied_completion_threads** | **int** |  | [optional] 
**occupied_worker_threads** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.thread_pool_info import ThreadPoolInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ThreadPoolInfo from a JSON string
thread_pool_info_instance = ThreadPoolInfo.from_json(json)
# print the JSON string representation of the object
print(ThreadPoolInfo.to_json())

# convert the object into a dict
thread_pool_info_dict = thread_pool_info_instance.to_dict()
# create an instance of ThreadPoolInfo from a dict
thread_pool_info_from_dict = ThreadPoolInfo.from_dict(thread_pool_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


