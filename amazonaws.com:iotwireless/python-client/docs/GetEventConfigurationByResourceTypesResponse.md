# GetEventConfigurationByResourceTypesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_registration_state** | [**GetEventConfigurationByResourceTypesResponseDeviceRegistrationState**](GetEventConfigurationByResourceTypesResponseDeviceRegistrationState.md) |  | [optional] 
**proximity** | [**GetEventConfigurationByResourceTypesResponseProximity**](GetEventConfigurationByResourceTypesResponseProximity.md) |  | [optional] 
**join** | [**GetEventConfigurationByResourceTypesResponseJoin**](GetEventConfigurationByResourceTypesResponseJoin.md) |  | [optional] 
**connection_status** | [**GetEventConfigurationByResourceTypesResponseConnectionStatus**](GetEventConfigurationByResourceTypesResponseConnectionStatus.md) |  | [optional] 
**message_delivery_status** | [**GetEventConfigurationByResourceTypesResponseMessageDeliveryStatus**](GetEventConfigurationByResourceTypesResponseMessageDeliveryStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_event_configuration_by_resource_types_response import GetEventConfigurationByResourceTypesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetEventConfigurationByResourceTypesResponse from a JSON string
get_event_configuration_by_resource_types_response_instance = GetEventConfigurationByResourceTypesResponse.from_json(json)
# print the JSON string representation of the object
print(GetEventConfigurationByResourceTypesResponse.to_json())

# convert the object into a dict
get_event_configuration_by_resource_types_response_dict = get_event_configuration_by_resource_types_response_instance.to_dict()
# create an instance of GetEventConfigurationByResourceTypesResponse from a dict
get_event_configuration_by_resource_types_response_from_dict = GetEventConfigurationByResourceTypesResponse.from_dict(get_event_configuration_by_resource_types_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


