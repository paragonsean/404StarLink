# ListFuotaTasksResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**fuota_task_list** | [**List[FuotaTask]**](FuotaTask.md) | Lists the FUOTA tasks registered to your AWS account. | [optional] 

## Example

```python
from openapi_client.models.list_fuota_tasks_response import ListFuotaTasksResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListFuotaTasksResponse from a JSON string
list_fuota_tasks_response_instance = ListFuotaTasksResponse.from_json(json)
# print the JSON string representation of the object
print(ListFuotaTasksResponse.to_json())

# convert the object into a dict
list_fuota_tasks_response_dict = list_fuota_tasks_response_instance.to_dict()
# create an instance of ListFuotaTasksResponse from a dict
list_fuota_tasks_response_from_dict = ListFuotaTasksResponse.from_dict(list_fuota_tasks_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


