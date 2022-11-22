# LoRaWANFuotaTask

The LoRaWAN information used with a FUOTA task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rf_region** | [**SupportedRfRegion**](SupportedRfRegion.md) |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_fuota_task import LoRaWANFuotaTask

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANFuotaTask from a JSON string
lo_ra_wan_fuota_task_instance = LoRaWANFuotaTask.from_json(json)
# print the JSON string representation of the object
print(LoRaWANFuotaTask.to_json())

# convert the object into a dict
lo_ra_wan_fuota_task_dict = lo_ra_wan_fuota_task_instance.to_dict()
# create an instance of LoRaWANFuotaTask from a dict
lo_ra_wan_fuota_task_from_dict = LoRaWANFuotaTask.from_dict(lo_ra_wan_fuota_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


