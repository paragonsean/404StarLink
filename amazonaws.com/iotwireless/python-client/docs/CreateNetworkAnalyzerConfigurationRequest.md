# CreateNetworkAnalyzerConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the network analyzer configuration. | 
**trace_content** | [**CreateNetworkAnalyzerConfigurationRequestTraceContent**](CreateNetworkAnalyzerConfigurationRequestTraceContent.md) |  | [optional] 
**wireless_devices** | **List[str]** | Wireless device resources to add to the network analyzer configuration. Provide the &lt;code&gt;WirelessDeviceId&lt;/code&gt; of the resource to add in the input array. | [optional] 
**wireless_gateways** | **List[str]** | Wireless gateway resources to add to the network analyzer configuration. Provide the &lt;code&gt;WirelessGatewayId&lt;/code&gt; of the resource to add in the input array. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 

## Example

```python
from openapi_client.models.create_network_analyzer_configuration_request import CreateNetworkAnalyzerConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateNetworkAnalyzerConfigurationRequest from a JSON string
create_network_analyzer_configuration_request_instance = CreateNetworkAnalyzerConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(CreateNetworkAnalyzerConfigurationRequest.to_json())

# convert the object into a dict
create_network_analyzer_configuration_request_dict = create_network_analyzer_configuration_request_instance.to_dict()
# create an instance of CreateNetworkAnalyzerConfigurationRequest from a dict
create_network_analyzer_configuration_request_from_dict = CreateNetworkAnalyzerConfigurationRequest.from_dict(create_network_analyzer_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


