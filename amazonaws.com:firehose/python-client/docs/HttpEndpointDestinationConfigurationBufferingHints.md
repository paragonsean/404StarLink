# HttpEndpointDestinationConfigurationBufferingHints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size_in_mbs** | **int** |  | [optional] 
**interval_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_destination_configuration_buffering_hints import HttpEndpointDestinationConfigurationBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDestinationConfigurationBufferingHints from a JSON string
http_endpoint_destination_configuration_buffering_hints_instance = HttpEndpointDestinationConfigurationBufferingHints.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDestinationConfigurationBufferingHints.to_json())

# convert the object into a dict
http_endpoint_destination_configuration_buffering_hints_dict = http_endpoint_destination_configuration_buffering_hints_instance.to_dict()
# create an instance of HttpEndpointDestinationConfigurationBufferingHints from a dict
http_endpoint_destination_configuration_buffering_hints_from_dict = HttpEndpointDestinationConfigurationBufferingHints.from_dict(http_endpoint_destination_configuration_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


