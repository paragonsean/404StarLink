# EndpointSendConfiguration

Specifies the content, including message variables and attributes, to use in a message that's sent directly to an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body_override** | **str** |  | [optional] 
**context** | **Dict** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**title_override** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_send_configuration import EndpointSendConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointSendConfiguration from a JSON string
endpoint_send_configuration_instance = EndpointSendConfiguration.from_json(json)
# print the JSON string representation of the object
print(EndpointSendConfiguration.to_json())

# convert the object into a dict
endpoint_send_configuration_dict = endpoint_send_configuration_instance.to_dict()
# create an instance of EndpointSendConfiguration from a dict
endpoint_send_configuration_from_dict = EndpointSendConfiguration.from_dict(endpoint_send_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


