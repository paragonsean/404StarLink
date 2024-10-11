# UpdateEventConfigurationByResourceTypesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_registration_state** | [**UpdateEventConfigurationByResourceTypesRequestDeviceRegistrationState**](UpdateEventConfigurationByResourceTypesRequestDeviceRegistrationState.md) |  | [optional] 
**proximity** | [**UpdateEventConfigurationByResourceTypesRequestProximity**](UpdateEventConfigurationByResourceTypesRequestProximity.md) |  | [optional] 
**join** | [**UpdateEventConfigurationByResourceTypesRequestJoin**](UpdateEventConfigurationByResourceTypesRequestJoin.md) |  | [optional] 
**connection_status** | [**UpdateEventConfigurationByResourceTypesRequestConnectionStatus**](UpdateEventConfigurationByResourceTypesRequestConnectionStatus.md) |  | [optional] 
**message_delivery_status** | [**UpdateEventConfigurationByResourceTypesRequestMessageDeliveryStatus**](UpdateEventConfigurationByResourceTypesRequestMessageDeliveryStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_event_configuration_by_resource_types_request import UpdateEventConfigurationByResourceTypesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEventConfigurationByResourceTypesRequest from a JSON string
update_event_configuration_by_resource_types_request_instance = UpdateEventConfigurationByResourceTypesRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEventConfigurationByResourceTypesRequest.to_json())

# convert the object into a dict
update_event_configuration_by_resource_types_request_dict = update_event_configuration_by_resource_types_request_instance.to_dict()
# create an instance of UpdateEventConfigurationByResourceTypesRequest from a dict
update_event_configuration_by_resource_types_request_from_dict = UpdateEventConfigurationByResourceTypesRequest.from_dict(update_event_configuration_by_resource_types_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


