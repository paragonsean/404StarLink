# ReservationPlanSettings

Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitment** | [**Commitment**](Commitment.md) |  | 
**renewal_type** | [**RenewalType**](RenewalType.md) |  | 
**reserved_slots** | **int** |  | 

## Example

```python
from openapi_client.models.reservation_plan_settings import ReservationPlanSettings

# TODO update the JSON string below
json = "{}"
# create an instance of ReservationPlanSettings from a JSON string
reservation_plan_settings_instance = ReservationPlanSettings.from_json(json)
# print the JSON string representation of the object
print(ReservationPlanSettings.to_json())

# convert the object into a dict
reservation_plan_settings_dict = reservation_plan_settings_instance.to_dict()
# create an instance of ReservationPlanSettings from a dict
reservation_plan_settings_from_dict = ReservationPlanSettings.from_dict(reservation_plan_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


