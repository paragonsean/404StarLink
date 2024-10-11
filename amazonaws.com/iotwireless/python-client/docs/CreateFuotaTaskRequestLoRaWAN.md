# CreateFuotaTaskRequestLoRaWAN

The LoRaWAN information used with a FUOTA task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rf_region** | [**SupportedRfRegion**](SupportedRfRegion.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_fuota_task_request_lo_ra_wan import CreateFuotaTaskRequestLoRaWAN

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFuotaTaskRequestLoRaWAN from a JSON string
create_fuota_task_request_lo_ra_wan_instance = CreateFuotaTaskRequestLoRaWAN.from_json(json)
# print the JSON string representation of the object
print(CreateFuotaTaskRequestLoRaWAN.to_json())

# convert the object into a dict
create_fuota_task_request_lo_ra_wan_dict = create_fuota_task_request_lo_ra_wan_instance.to_dict()
# create an instance of CreateFuotaTaskRequestLoRaWAN from a dict
create_fuota_task_request_lo_ra_wan_from_dict = CreateFuotaTaskRequestLoRaWAN.from_dict(create_fuota_task_request_lo_ra_wan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


