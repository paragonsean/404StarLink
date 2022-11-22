# UpdateNetworkAnalyzerConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trace_content** | [**CreateNetworkAnalyzerConfigurationRequestTraceContent**](CreateNetworkAnalyzerConfigurationRequestTraceContent.md) |  | [optional] 
**wireless_devices_to_add** | **List[str]** | Wireless device resources to add to the network analyzer configuration. Provide the &lt;code&gt;WirelessDeviceId&lt;/code&gt; of the resource to add in the input array. | [optional] 
**wireless_devices_to_remove** | **List[str]** | Wireless device resources to remove from the network analyzer configuration. Provide the &lt;code&gt;WirelessDeviceId&lt;/code&gt; of the resources to remove in the input array. | [optional] 
**wireless_gateways_to_add** | **List[str]** | Wireless gateway resources to add to the network analyzer configuration. Provide the &lt;code&gt;WirelessGatewayId&lt;/code&gt; of the resource to add in the input array. | [optional] 
**wireless_gateways_to_remove** | **List[str]** | Wireless gateway resources to remove from the network analyzer configuration. Provide the &lt;code&gt;WirelessGatewayId&lt;/code&gt; of the resources to remove in the input array. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 

## Example

```python
from openapi_client.models.update_network_analyzer_configuration_request import UpdateNetworkAnalyzerConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateNetworkAnalyzerConfigurationRequest from a JSON string
update_network_analyzer_configuration_request_instance = UpdateNetworkAnalyzerConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateNetworkAnalyzerConfigurationRequest.to_json())

# convert the object into a dict
update_network_analyzer_configuration_request_dict = update_network_analyzer_configuration_request_instance.to_dict()
# create an instance of UpdateNetworkAnalyzerConfigurationRequest from a dict
update_network_analyzer_configuration_request_from_dict = UpdateNetworkAnalyzerConfigurationRequest.from_dict(update_network_analyzer_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


