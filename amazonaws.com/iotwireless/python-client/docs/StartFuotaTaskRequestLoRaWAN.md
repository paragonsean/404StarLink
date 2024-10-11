# StartFuotaTaskRequestLoRaWAN

The LoRaWAN information used to start a FUOTA task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_time** | **datetime** | Start time of a FUOTA task. | [optional] 

## Example

```python
from openapi_client.models.start_fuota_task_request_lo_ra_wan import StartFuotaTaskRequestLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of StartFuotaTaskRequestLoRaWAN from a JSON string
start_fuota_task_request_lo_ra_wan_instance = StartFuotaTaskRequestLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(StartFuotaTaskRequestLoRaWAN.to_json())

# convert the object into a dict
start_fuota_task_request_lo_ra_wan_dict = start_fuota_task_request_lo_ra_wan_instance.to_dict()
# create an instance of StartFuotaTaskRequestLoRaWAN from a dict
start_fuota_task_request_lo_ra_wan_from_dict = StartFuotaTaskRequestLoRaWAN.from_dict(start_fuota_task_request_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


