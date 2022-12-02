# HttpEndpointDestinationConfigurationRetryOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration_in_seconds** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_destination_configuration_retry_options import HttpEndpointDestinationConfigurationRetryOptions

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDestinationConfigurationRetryOptions from a JSON string
http_endpoint_destination_configuration_retry_options_instance = HttpEndpointDestinationConfigurationRetryOptions.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDestinationConfigurationRetryOptions.to_json())

# convert the object into a dict
http_endpoint_destination_configuration_retry_options_dict = http_endpoint_destination_configuration_retry_options_instance.to_dict()
# create an instance of HttpEndpointDestinationConfigurationRetryOptions from a dict
http_endpoint_destination_configuration_retry_options_from_dict = HttpEndpointDestinationConfigurationRetryOptions.from_dict(http_endpoint_destination_configuration_retry_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


