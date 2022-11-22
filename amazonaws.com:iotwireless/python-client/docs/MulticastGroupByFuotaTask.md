# MulticastGroupByFuotaTask

A multicast group that is associated with a FUOTA task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the multicast group. | [optional] 

## Example

```python
from openapi_client.models.multicast_group_by_fuota_task import MulticastGroupByFuotaTask

# TODO update the JSON string below
json = "{}"
# create an instance of MulticastGroupByFuotaTask from a JSON string
multicast_group_by_fuota_task_instance = MulticastGroupByFuotaTask.from_json(json)
# print the JSON string representation of the object
print(MulticastGroupByFuotaTask.to_json())

# convert the object into a dict
multicast_group_by_fuota_task_dict = multicast_group_by_fuota_task_instance.to_dict()
# create an instance of MulticastGroupByFuotaTask from a dict
multicast_group_by_fuota_task_from_dict = MulticastGroupByFuotaTask.from_dict(multicast_group_by_fuota_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


