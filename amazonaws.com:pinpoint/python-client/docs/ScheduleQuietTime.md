# ScheduleQuietTime


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **str** |  | [optional] 
**start** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.schedule_quiet_time import ScheduleQuietTime

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleQuietTime from a JSON string
schedule_quiet_time_instance = ScheduleQuietTime.from_json(json)
# print the JSON string representation of the object
print(ScheduleQuietTime.to_json())

# convert the object into a dict
schedule_quiet_time_dict = schedule_quiet_time_instance.to_dict()
# create an instance of ScheduleQuietTime from a dict
schedule_quiet_time_from_dict = ScheduleQuietTime.from_dict(schedule_quiet_time_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


