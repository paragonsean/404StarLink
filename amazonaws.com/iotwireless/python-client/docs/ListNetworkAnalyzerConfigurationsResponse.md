# ListNetworkAnalyzerConfigurationsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**network_analyzer_configuration_list** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_network_analyzer_configurations_response import ListNetworkAnalyzerConfigurationsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListNetworkAnalyzerConfigurationsResponse from a JSON string
list_network_analyzer_configurations_response_instance = ListNetworkAnalyzerConfigurationsResponse.from_json(json)
# print the JSON string representation of the object
print(ListNetworkAnalyzerConfigurationsResponse.to_json())

# convert the object into a dict
list_network_analyzer_configurations_response_dict = list_network_analyzer_configurations_response_instance.to_dict()
# create an instance of ListNetworkAnalyzerConfigurationsResponse from a dict
list_network_analyzer_configurations_response_from_dict = ListNetworkAnalyzerConfigurationsResponse.from_dict(list_network_analyzer_configurations_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


