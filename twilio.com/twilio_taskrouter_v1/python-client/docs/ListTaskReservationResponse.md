# ListTaskReservationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**reservations** | [**List[TaskrouterV1WorkspaceTaskTaskReservation]**](TaskrouterV1WorkspaceTaskTaskReservation.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_task_reservation_response import ListTaskReservationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTaskReservationResponse from a JSON string
list_task_reservation_response_instance = ListTaskReservationResponse.from_json(json)
# print the JSON string representation of the object
print(ListTaskReservationResponse.to_json())

# convert the object into a dict
list_task_reservation_response_dict = list_task_reservation_response_instance.to_dict()
# create an instance of ListTaskReservationResponse from a dict
list_task_reservation_response_from_dict = ListTaskReservationResponse.from_dict(list_task_reservation_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


