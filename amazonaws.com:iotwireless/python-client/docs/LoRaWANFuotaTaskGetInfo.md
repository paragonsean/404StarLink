# LoRaWANFuotaTaskGetInfo

The LoRaWAN information returned from getting a FUOTA task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rf_region** | **str** | The frequency band (RFRegion) value. | [optional] 
**start_time** | **datetime** | Start time of a FUOTA task. | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_fuota_task_get_info import LoRaWANFuotaTaskGetInfo

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANFuotaTaskGetInfo from a JSON string
lo_ra_wan_fuota_task_get_info_instance = LoRaWANFuotaTaskGetInfo.from_json(json)
# print the JSON string representation of the object
print(LoRaWANFuotaTaskGetInfo.to_json())

# convert the object into a dict
lo_ra_wan_fuota_task_get_info_dict = lo_ra_wan_fuota_task_get_info_instance.to_dict()
# create an instance of LoRaWANFuotaTaskGetInfo from a dict
lo_ra_wan_fuota_task_get_info_from_dict = LoRaWANFuotaTaskGetInfo.from_dict(lo_ra_wan_fuota_task_get_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


