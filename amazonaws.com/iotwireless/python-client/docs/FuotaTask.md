# FuotaTask

A FUOTA task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of a FUOTA task. | [optional] 
**arn** | **str** | The arn of a FUOTA task. | [optional] 
**name** | **str** | The name of a FUOTA task. | [optional] 

## Example

```python
from openapi_client.models.fuota_task import FuotaTask

# TODO update the JSON string below
json = "{}"
# create an instance of FuotaTask from a JSON string
fuota_task_instance = FuotaTask.from_json(json)
# print the JSON string representation of the object
print(FuotaTask.to_json())

# convert the object into a dict
fuota_task_dict = fuota_task_instance.to_dict()
# create an instance of FuotaTask from a dict
fuota_task_from_dict = FuotaTask.from_dict(fuota_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


