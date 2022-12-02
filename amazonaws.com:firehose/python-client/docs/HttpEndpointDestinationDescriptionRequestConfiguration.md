# HttpEndpointDestinationDescriptionRequestConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_encoding** | [**ContentEncoding**](ContentEncoding.md) |  | [optional] 
**common_attributes** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.http_endpoint_destination_description_request_configuration import HttpEndpointDestinationDescriptionRequestConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of HttpEndpointDestinationDescriptionRequestConfiguration from a JSON string
http_endpoint_destination_description_request_configuration_instance = HttpEndpointDestinationDescriptionRequestConfiguration.from_json(json)
# print the JSON string representation of the object
print(HttpEndpointDestinationDescriptionRequestConfiguration.to_json())

# convert the object into a dict
http_endpoint_destination_description_request_configuration_dict = http_endpoint_destination_description_request_configuration_instance.to_dict()
# create an instance of HttpEndpointDestinationDescriptionRequestConfiguration from a dict
http_endpoint_destination_description_request_configuration_from_dict = HttpEndpointDestinationDescriptionRequestConfiguration.from_dict(http_endpoint_destination_description_request_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


