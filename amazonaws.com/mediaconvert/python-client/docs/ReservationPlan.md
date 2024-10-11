# ReservationPlan

Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.

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
from openapi_client.models.reservation_plan import ReservationPlan

# TODO update the JSON string below
json = "{}"
# create an instance of ReservationPlan from a JSON string
reservation_plan_instance = ReservationPlan.from_json(json)
# print the JSON string representation of the object
print(ReservationPlan.to_json())

# convert the object into a dict
reservation_plan_dict = reservation_plan_instance.to_dict()
# create an instance of ReservationPlan from a dict
reservation_plan_from_dict = ReservationPlan.from_dict(reservation_plan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


