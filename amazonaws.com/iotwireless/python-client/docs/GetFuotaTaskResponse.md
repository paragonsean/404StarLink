# GetFuotaTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** | The arn of a FUOTA task. | [optional] 
**id** | **str** | The ID of a FUOTA task. | [optional] 
**status** | [**FuotaTaskStatus**](FuotaTaskStatus.md) |  | [optional] 
**name** | **str** | The name of a FUOTA task. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**lo_ra_wan** | [**LoRaWANFuotaTaskGetInfo**](LoRaWANFuotaTaskGetInfo.md) |  | [optional] 
**firmware_update_image** | **str** | The S3 URI points to a firmware update image that is to be used with a FUOTA task. | [optional] 
**firmware_update_role** | **str** | The firmware update role that is to be used with a FUOTA task. | [optional] 
**created_at** | **datetime** | Created at timestamp for the resource. | [optional] 
**redundancy_percent** | **int** | The percentage of added redundant fragments. For example, if firmware file is 100 bytes and fragment size is 10 bytes, with &lt;code&gt;RedundancyPercent&lt;/code&gt; set to 50(%), the final number of encoded fragments is (100 / 10) + (100 / 10 * 50%) &#x3D; 15. | [optional] 
**fragment_size_bytes** | **int** | The size of each fragment in bytes. Currently only supported in fuota tasks with multicast groups. | [optional] 
**fragment_interval_ms** | **int** | The interval of sending fragments in milliseconds. Currently the interval will be rounded to the nearest second. Note that this interval only controls the timing when the cloud sends the fragments down. The actual delay of receiving fragments at device side depends on the device&#39;s class and the communication delay with the cloud. | [optional] 

## Example

```python
from openapi_client.models.get_fuota_task_response import GetFuotaTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetFuotaTaskResponse from a JSON string
get_fuota_task_response_instance = GetFuotaTaskResponse.from_json(json)
# print the JSON string representation of the object
print(GetFuotaTaskResponse.to_json())

# convert the object into a dict
get_fuota_task_response_dict = get_fuota_task_response_instance.to_dict()
# create an instance of GetFuotaTaskResponse from a dict
get_fuota_task_response_from_dict = GetFuotaTaskResponse.from_dict(get_fuota_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


