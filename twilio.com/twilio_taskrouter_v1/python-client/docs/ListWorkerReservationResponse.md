# ListWorkerReservationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**reservations** | [**List[TaskrouterV1WorkspaceWorkerWorkerReservation]**](TaskrouterV1WorkspaceWorkerWorkerReservation.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_worker_reservation_response import ListWorkerReservationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWorkerReservationResponse from a JSON string
list_worker_reservation_response_instance = ListWorkerReservationResponse.from_json(json)
# print the JSON string representation of the object
print(ListWorkerReservationResponse.to_json())

# convert the object into a dict
list_worker_reservation_response_dict = list_worker_reservation_response_instance.to_dict()
# create an instance of ListWorkerReservationResponse from a dict
list_worker_reservation_response_from_dict = ListWorkerReservationResponse.from_dict(list_worker_reservation_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


