# AddressConfiguration

Specifies address-based configuration settings for a message that's sent directly to an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body_override** | **str** |  | [optional] 
**channel_type** | [**ChannelType**](ChannelType.md) |  | [optional] 
**context** | **Dict** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**title_override** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.address_configuration import AddressConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of AddressConfiguration from a JSON string
address_configuration_instance = AddressConfiguration.from_json(json)
# print the JSON string representation of the object
print(AddressConfiguration.to_json())

# convert the object into a dict
address_configuration_dict = address_configuration_instance.to_dict()
# create an instance of AddressConfiguration from a dict
address_configuration_from_dict = AddressConfiguration.from_dict(address_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


