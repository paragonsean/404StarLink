# UpdateQueueRequestReservationPlanSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitment** | [**Commitment**](Commitment.md) |  | 
**renewal_type** | [**RenewalType**](RenewalType.md) |  | 
**reserved_slots** | **int** |  | 

## Example

```python
from openapi_client.models.update_queue_request_reservation_plan_settings import UpdateQueueRequestReservationPlanSettings

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateQueueRequestReservationPlanSettings from a JSON string
update_queue_request_reservation_plan_settings_instance = UpdateQueueRequestReservationPlanSettings.from_json(json)
# print the JSON string representation of the object
print(UpdateQueueRequestReservationPlanSettings.to_json())

# convert the object into a dict
update_queue_request_reservation_plan_settings_dict = update_queue_request_reservation_plan_settings_instance.to_dict()
# create an instance of UpdateQueueRequestReservationPlanSettings from a dict
update_queue_request_reservation_plan_settings_from_dict = UpdateQueueRequestReservationPlanSettings.from_dict(update_queue_request_reservation_plan_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


