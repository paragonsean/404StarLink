# NetworkAnalyzerConfigurations

Network analyzer configurations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** | Name of the network analyzer configuration. | [optional] 

## Example

```python
from openapi_client.models.network_analyzer_configurations import NetworkAnalyzerConfigurations

# TODO update the JSON string below
json = "{}"
# create an instance of NetworkAnalyzerConfigurations from a JSON string
network_analyzer_configurations_instance = NetworkAnalyzerConfigurations.from_json(json)
# print the JSON string representation of the object
print(NetworkAnalyzerConfigurations.to_json())

# convert the object into a dict
network_analyzer_configurations_dict = network_analyzer_configurations_instance.to_dict()
# create an instance of NetworkAnalyzerConfigurations from a dict
network_analyzer_configurations_from_dict = NetworkAnalyzerConfigurations.from_dict(network_analyzer_configurations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


