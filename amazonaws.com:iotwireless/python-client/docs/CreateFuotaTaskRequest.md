# CreateFuotaTaskRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of a FUOTA task. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 
**lo_ra_wan** | [**CreateFuotaTaskRequestLoRaWAN**](CreateFuotaTaskRequestLoRaWAN.md) |  | [optional] 
**firmware_update_image** | **str** | The S3 URI points to a firmware update image that is to be used with a FUOTA task. | 
**firmware_update_role** | **str** | The firmware update role that is to be used with a FUOTA task. | 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 
**redundancy_percent** | **int** | The percentage of added redundant fragments. For example, if firmware file is 100 bytes and fragment size is 10 bytes, with &lt;code&gt;RedundancyPercent&lt;/code&gt; set to 50(%), the final number of encoded fragments is (100 / 10) + (100 / 10 * 50%) &#x3D; 15. | [optional] 
**fragment_size_bytes** | **int** | The size of each fragment in bytes. Currently only supported in fuota tasks with multicast groups. | [optional] 
**fragment_interval_ms** | **int** | The interval of sending fragments in milliseconds. Currently the interval will be rounded to the nearest second. Note that this interval only controls the timing when the cloud sends the fragments down. The actual delay of receiving fragments at device side depends on the device&#39;s class and the communication delay with the cloud. | [optional] 

## Example

```python
from openapi_client.models.create_fuota_task_request import CreateFuotaTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFuotaTaskRequest from a JSON string
create_fuota_task_request_instance = CreateFuotaTaskRequest.from_json(json)
# print the JSON string representation of the object
print(CreateFuotaTaskRequest.to_json())

# convert the object into a dict
create_fuota_task_request_dict = create_fuota_task_request_instance.to_dict()
# create an instance of CreateFuotaTaskRequest from a dict
create_fuota_task_request_from_dict = CreateFuotaTaskRequest.from_dict(create_fuota_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


