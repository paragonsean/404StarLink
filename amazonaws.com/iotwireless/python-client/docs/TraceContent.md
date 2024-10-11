# TraceContent

Trace content for your wireless gateway and wireless device resources.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_device_frame_info** | [**WirelessDeviceFrameInfo**](WirelessDeviceFrameInfo.md) |  | [optional] 
**log_level** | [**LogLevel**](LogLevel.md) |  | [optional] 

## Example

```python
from openapi_client.models.trace_content import TraceContent

# TODO update the JSON string below
json = "{}"
# create an instance of TraceContent from a JSON string
trace_content_instance = TraceContent.from_json(json)
# print the JSON string representation of the object
print(TraceContent.to_json())

# convert the object into a dict
trace_content_dict = trace_content_instance.to_dict()
# create an instance of TraceContent from a dict
trace_content_from_dict = TraceContent.from_dict(trace_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


