# LoRaWANStartFuotaTask

The LoRaWAN information used to start a FUOTA task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_time** | **datetime** | Start time of a FUOTA task. | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_start_fuota_task import LoRaWANStartFuotaTask

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANStartFuotaTask from a JSON string
lo_ra_wan_start_fuota_task_instance = LoRaWANStartFuotaTask.from_json(json)
# print the JSON string representation of the object
print(LoRaWANStartFuotaTask.to_json())

# convert the object into a dict
lo_ra_wan_start_fuota_task_dict = lo_ra_wan_start_fuota_task_instance.to_dict()
# create an instance of LoRaWANStartFuotaTask from a dict
lo_ra_wan_start_fuota_task_from_dict = LoRaWANStartFuotaTask.from_dict(lo_ra_wan_start_fuota_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


