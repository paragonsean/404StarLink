# QueueReservationPlan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitment** | [**Commitment**](Commitment.md) |  | [optional] 
**expires_at** | **datetime** |  | [optional] 
**purchased_at** | **datetime** |  | [optional] 
**renewal_type** | [**RenewalType**](RenewalType.md) |  | [optional] 
**reserved_slots** | **int** |  | [optional] 
**status** | [**ReservationPlanStatus**](ReservationPlanStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.queue_reservation_plan import QueueReservationPlan

# TODO update the JSON string below
json = "{}"
# create an instance of QueueReservationPlan from a JSON string
queue_reservation_plan_instance = QueueReservationPlan.from_json(json)
# print the JSON string representation of the object
print(QueueReservationPlan.to_json())

# convert the object into a dict
queue_reservation_plan_dict = queue_reservation_plan_instance.to_dict()
# create an instance of QueueReservationPlan from a dict
queue_reservation_plan_from_dict = QueueReservationPlan.from_dict(queue_reservation_plan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


