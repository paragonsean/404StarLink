# GetResourceEventConfigurationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_registration_state** | [**GetResourceEventConfigurationResponseDeviceRegistrationState**](GetResourceEventConfigurationResponseDeviceRegistrationState.md) |  | [optional] 
**proximity** | [**GetResourceEventConfigurationResponseProximity**](GetResourceEventConfigurationResponseProximity.md) |  | [optional] 
**join** | [**GetResourceEventConfigurationResponseJoin**](GetResourceEventConfigurationResponseJoin.md) |  | [optional] 
**connection_status** | [**GetResourceEventConfigurationResponseConnectionStatus**](GetResourceEventConfigurationResponseConnectionStatus.md) |  | [optional] 
**message_delivery_status** | [**GetResourceEventConfigurationResponseMessageDeliveryStatus**](GetResourceEventConfigurationResponseMessageDeliveryStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_resource_event_configuration_response import GetResourceEventConfigurationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetResourceEventConfigurationResponse from a JSON string
get_resource_event_configuration_response_instance = GetResourceEventConfigurationResponse.from_json(json)
# print the JSON string representation of the object
print(GetResourceEventConfigurationResponse.to_json())

# convert the object into a dict
get_resource_event_configuration_response_dict = get_resource_event_configuration_response_instance.to_dict()
# create an instance of GetResourceEventConfigurationResponse from a dict
get_resource_event_configuration_response_from_dict = GetResourceEventConfigurationResponse.from_dict(get_resource_event_configuration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


