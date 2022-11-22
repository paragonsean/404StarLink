# UpdateFuotaTaskRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of a FUOTA task. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**lo_ra_wan** | [**CreateFuotaTaskRequestLoRaWAN**](CreateFuotaTaskRequestLoRaWAN.md) |  | [optional] 
**firmware_update_image** | **str** | The S3 URI points to a firmware update image that is to be used with a FUOTA task. | [optional] 
**firmware_update_role** | **str** | The firmware update role that is to be used with a FUOTA task. | [optional] 
**redundancy_percent** | **int** | The percentage of added redundant fragments. For example, if firmware file is 100 bytes and fragment size is 10 bytes, with &lt;code&gt;RedundancyPercent&lt;/code&gt; set to 50(%), the final number of encoded fragments is (100 / 10) + (100 / 10 * 50%) &#x3D; 15. | [optional] 
**fragment_size_bytes** | **int** | The size of each fragment in bytes. Currently only supported in fuota tasks with multicast groups. | [optional] 
**fragment_interval_ms** | **int** | The interval of sending fragments in milliseconds. Currently the interval will be rounded to the nearest second. Note that this interval only controls the timing when the cloud sends the fragments down. The actual delay of receiving fragments at device side depends on the device&#39;s class and the communication delay with the cloud. | [optional] 

## Example

```python
from openapi_client.models.update_fuota_task_request import UpdateFuotaTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateFuotaTaskRequest from a JSON string
update_fuota_task_request_instance = UpdateFuotaTaskRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateFuotaTaskRequest.to_json())

# convert the object into a dict
update_fuota_task_request_dict = update_fuota_task_request_instance.to_dict()
# create an instance of UpdateFuotaTaskRequest from a dict
update_fuota_task_request_from_dict = UpdateFuotaTaskRequest.from_dict(update_fuota_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


