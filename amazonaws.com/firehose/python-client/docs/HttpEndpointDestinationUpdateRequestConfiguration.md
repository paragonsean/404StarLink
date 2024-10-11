# HttpEndpointDestinationUpdateRequestConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_encoding** | [**ContentEncoding**](ContentEncoding.md) |  | [optional] 
**common_attributes** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_destination_update_request_configuration import HttpEndpointDestinationUpdateRequestConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDestinationUpdateRequestConfiguration from a JSON string
http_endpoint_destination_update_request_configuration_instance = HttpEndpointDestinationUpdateRequestConfiguration.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDestinationUpdateRequestConfiguration.to_json())

# convert the object into a dict
http_endpoint_destination_update_request_configuration_dict = http_endpoint_destination_update_request_configuration_instance.to_dict()
# create an instance of HttpEndpointDestinationUpdateRequestConfiguration from a dict
http_endpoint_destination_update_request_configuration_from_dict = HttpEndpointDestinationUpdateRequestConfiguration.from_dict(http_endpoint_destination_update_request_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


