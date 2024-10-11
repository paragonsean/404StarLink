# AssociateWirelessDeviceWithThingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thing_arn** | **str** | The ARN of the thing to associate with the wireless device. | 

## Example

```python
from openapi_client.models.associate_wireless_device_with_thing_request import AssociateWirelessDeviceWithThingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateWirelessDeviceWithThingRequest from a JSON string
associate_wireless_device_with_thing_request_instance = AssociateWirelessDeviceWithThingRequest.from_json(json)
# print the JSON string representation of the object
print(AssociateWirelessDeviceWithThingRequest.to_json())

# convert the object into a dict
associate_wireless_device_with_thing_request_dict = associate_wireless_device_with_thing_request_instance.to_dict()
# create an instance of AssociateWirelessDeviceWithThingRequest from a dict
associate_wireless_device_with_thing_request_from_dict = AssociateWirelessDeviceWithThingRequest.from_dict(associate_wireless_device_with_thing_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


