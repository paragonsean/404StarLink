# HttpEndpointRequestConfiguration

The configuration of the HTTP endpoint request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_encoding** | [**ContentEncoding**](ContentEncoding.md) |  | [optional] 
**common_attributes** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_request_configuration import HttpEndpointRequestConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointRequestConfiguration from a JSON string
http_endpoint_request_configuration_instance = HttpEndpointRequestConfiguration.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointRequestConfiguration.to_json())

# convert the object into a dict
http_endpoint_request_configuration_dict = http_endpoint_request_configuration_instance.to_dict()
# create an instance of HttpEndpointRequestConfiguration from a dict
http_endpoint_request_configuration_from_dict = HttpEndpointRequestConfiguration.from_dict(http_endpoint_request_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


