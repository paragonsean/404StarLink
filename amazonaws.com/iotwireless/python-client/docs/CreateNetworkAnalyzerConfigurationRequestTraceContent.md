# CreateNetworkAnalyzerConfigurationRequestTraceContent

Trace content for your wireless gateway and wireless device resources.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**wireless_device_frame_info** | [**WirelessDeviceFrameInfo**](WirelessDeviceFrameInfo.md) |  | [optional] 
**log_level** | [**LogLevel**](LogLevel.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_network_analyzer_configuration_request_trace_content import CreateNetworkAnalyzerConfigurationRequestTraceContent

# TODO update the JSON string below
json = "{}"
# create an instance of CreateNetworkAnalyzerConfigurationRequestTraceContent from a JSON string
create_network_analyzer_configuration_request_trace_content_instance = CreateNetworkAnalyzerConfigurationRequestTraceContent.from_json(json)
# print the JSON string representation of the object
print(CreateNetworkAnalyzerConfigurationRequestTraceContent.to_json())

# convert the object into a dict
create_network_analyzer_configuration_request_trace_content_dict = create_network_analyzer_configuration_request_trace_content_instance.to_dict()
# create an instance of CreateNetworkAnalyzerConfigurationRequestTraceContent from a dict
create_network_analyzer_configuration_request_trace_content_from_dict = CreateNetworkAnalyzerConfigurationRequestTraceContent.from_dict(create_network_analyzer_configuration_request_trace_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


