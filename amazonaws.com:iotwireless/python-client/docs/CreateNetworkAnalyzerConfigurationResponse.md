# CreateNetworkAnalyzerConfigurationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** | Name of the network analyzer configuration. | [optional] 

## Example

```python
from openapi_client.models.create_network_analyzer_configuration_response import CreateNetworkAnalyzerConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateNetworkAnalyzerConfigurationResponse from a JSON string
create_network_analyzer_configuration_response_instance = CreateNetworkAnalyzerConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(CreateNetworkAnalyzerConfigurationResponse.to_json())

# convert the object into a dict
create_network_analyzer_configuration_response_dict = create_network_analyzer_configuration_response_instance.to_dict()
# create an instance of CreateNetworkAnalyzerConfigurationResponse from a dict
create_network_analyzer_configuration_response_from_dict = CreateNetworkAnalyzerConfigurationResponse.from_dict(create_network_analyzer_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


