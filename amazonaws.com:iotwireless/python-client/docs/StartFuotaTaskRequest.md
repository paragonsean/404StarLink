# StartFuotaTaskRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**StartFuotaTaskRequestLoRaWAN**](StartFuotaTaskRequestLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.start_fuota_task_request import StartFuotaTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartFuotaTaskRequest from a JSON string
start_fuota_task_request_instance = StartFuotaTaskRequest.from_json(json)
# print the JSON string representation of the object
print(StartFuotaTaskRequest.to_json())

# convert the object into a dict
start_fuota_task_request_dict = start_fuota_task_request_instance.to_dict()
# create an instance of StartFuotaTaskRequest from a dict
start_fuota_task_request_from_dict = StartFuotaTaskRequest.from_dict(start_fuota_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


