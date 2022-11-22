# GetNetworkAnalyzerConfigurationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trace_content** | [**TraceContent**](TraceContent.md) |  | [optional] 
**wireless_devices** | **List** |  | [optional] 
**wireless_gateways** | **List** |  | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**arn** | **str** |  | [optional] 
**name** | **str** | Name of the network analyzer configuration. | [optional] 

## Example

```python
from openapi_client.models.get_network_analyzer_configuration_response import GetNetworkAnalyzerConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetNetworkAnalyzerConfigurationResponse from a JSON string
get_network_analyzer_configuration_response_instance = GetNetworkAnalyzerConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(GetNetworkAnalyzerConfigurationResponse.to_json())

# convert the object into a dict
get_network_analyzer_configuration_response_dict = get_network_analyzer_configuration_response_instance.to_dict()
# create an instance of GetNetworkAnalyzerConfigurationResponse from a dict
get_network_analyzer_configuration_response_from_dict = GetNetworkAnalyzerConfigurationResponse.from_dict(get_network_analyzer_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


