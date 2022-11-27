# TreatmentResourceSchedule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_time** | **str** |  | [optional] 
**event_filter** | [**ScheduleEventFilter**](ScheduleEventFilter.md) |  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**is_local_time** | **bool** |  | [optional] 
**quiet_time** | [**ScheduleQuietTime**](ScheduleQuietTime.md) |  | [optional] 
**start_time** | **str** |  | 
**timezone** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.treatment_resource_schedule import TreatmentResourceSchedule

# TODO update the JSON string below
json = "{}"
# create an instance of TreatmentResourceSchedule from a JSON string
treatment_resource_schedule_instance = TreatmentResourceSchedule.from_json(json)
# print the JSON string representation of the object
print(TreatmentResourceSchedule.to_json())

# convert the object into a dict
treatment_resource_schedule_dict = treatment_resource_schedule_instance.to_dict()
# create an instance of TreatmentResourceSchedule from a dict
treatment_resource_schedule_from_dict = TreatmentResourceSchedule.from_dict(treatment_resource_schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


