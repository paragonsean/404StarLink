# HttpEndpointDestinationConfigurationEndpointConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** |  | 
**name** | **str** |  | [optional] 
**access_key** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_destination_configuration_endpoint_configuration import HttpEndpointDestinationConfigurationEndpointConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDestinationConfigurationEndpointConfiguration from a JSON string
http_endpoint_destination_configuration_endpoint_configuration_instance = HttpEndpointDestinationConfigurationEndpointConfiguration.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDestinationConfigurationEndpointConfiguration.to_json())

# convert the object into a dict
http_endpoint_destination_configuration_endpoint_configuration_dict = http_endpoint_destination_configuration_endpoint_configuration_instance.to_dict()
# create an instance of HttpEndpointDestinationConfigurationEndpointConfiguration from a dict
http_endpoint_destination_configuration_endpoint_configuration_from_dict = HttpEndpointDestinationConfigurationEndpointConfiguration.from_dict(http_endpoint_destination_configuration_endpoint_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


