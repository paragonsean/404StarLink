# UpdateResourceEventConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_registration_state** | [**UpdateResourceEventConfigurationRequestDeviceRegistrationState**](UpdateResourceEventConfigurationRequestDeviceRegistrationState.md) |  | [optional] 
**proximity** | [**UpdateResourceEventConfigurationRequestProximity**](UpdateResourceEventConfigurationRequestProximity.md) |  | [optional] 
**join** | [**UpdateResourceEventConfigurationRequestJoin**](UpdateResourceEventConfigurationRequestJoin.md) |  | [optional] 
**connection_status** | [**UpdateResourceEventConfigurationRequestConnectionStatus**](UpdateResourceEventConfigurationRequestConnectionStatus.md) |  | [optional] 
**message_delivery_status** | [**UpdateResourceEventConfigurationRequestMessageDeliveryStatus**](UpdateResourceEventConfigurationRequestMessageDeliveryStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_resource_event_configuration_request import UpdateResourceEventConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourceEventConfigurationRequest from a JSON string
update_resource_event_configuration_request_instance = UpdateResourceEventConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateResourceEventConfigurationRequest.to_json())

# convert the object into a dict
update_resource_event_configuration_request_dict = update_resource_event_configuration_request_instance.to_dict()
# create an instance of UpdateResourceEventConfigurationRequest from a dict
update_resource_event_configuration_request_from_dict = UpdateResourceEventConfigurationRequest.from_dict(update_resource_event_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


