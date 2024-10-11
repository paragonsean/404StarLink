# CreateQueueRequestReservationPlanSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitment** | [**Commitment**](Commitment.md) |  | 
**renewal_type** | [**RenewalType**](RenewalType.md) |  | 
**reserved_slots** | **int** |  | 

## Example

```python
from openapi_client.models.create_queue_request_reservation_plan_settings import CreateQueueRequestReservationPlanSettings

# TODO update the JSON string below
json = "{}"
# create an instance of CreateQueueRequestReservationPlanSettings from a JSON string
create_queue_request_reservation_plan_settings_instance = CreateQueueRequestReservationPlanSettings.from_json(json)
# print the JSON string representation of the object
print(CreateQueueRequestReservationPlanSettings.to_json())

# convert the object into a dict
create_queue_request_reservation_plan_settings_dict = create_queue_request_reservation_plan_settings_instance.to_dict()
# create an instance of CreateQueueRequestReservationPlanSettings from a dict
create_queue_request_reservation_plan_settings_from_dict = CreateQueueRequestReservationPlanSettings.from_dict(create_queue_request_reservation_plan_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


