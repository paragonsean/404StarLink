# ListMulticastGroupsByFuotaTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**multicast_group_list** | [**List[MulticastGroupByFuotaTask]**](MulticastGroupByFuotaTask.md) | List of multicast groups associated with a FUOTA task. | [optional] 

## Example

```python
from openapi_client.models.list_multicast_groups_by_fuota_task_response import ListMulticastGroupsByFuotaTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListMulticastGroupsByFuotaTaskResponse from a JSON string
list_multicast_groups_by_fuota_task_response_instance = ListMulticastGroupsByFuotaTaskResponse.from_json(json)
# print the JSON string representation of the object
print(ListMulticastGroupsByFuotaTaskResponse.to_json())

# convert the object into a dict
list_multicast_groups_by_fuota_task_response_dict = list_multicast_groups_by_fuota_task_response_instance.to_dict()
# create an instance of ListMulticastGroupsByFuotaTaskResponse from a dict
list_multicast_groups_by_fuota_task_response_from_dict = ListMulticastGroupsByFuotaTaskResponse.from_dict(list_multicast_groups_by_fuota_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


