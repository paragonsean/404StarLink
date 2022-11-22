# ParticipatingGateways

Specify the list of gateways to which you want to send downlink data traffic when the wireless device is running in class B or class C mode.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downlink_mode** | [**DownlinkMode**](DownlinkMode.md) |  | 
**gateway_list** | **List** |  | 
**transmission_interval** | **int** |  | 

## Example

```python
from openapi_client.models.participating_gateways import ParticipatingGateways

# TODO update the JSON string below
json = "{}"
# create an instance of ParticipatingGateways from a JSON string
participating_gateways_instance = ParticipatingGateways.from_json(json)
# print the JSON string representation of the object
print(ParticipatingGateways.to_json())

# convert the object into a dict
participating_gateways_dict = participating_gateways_instance.to_dict()
# create an instance of ParticipatingGateways from a dict
participating_gateways_from_dict = ParticipatingGateways.from_dict(participating_gateways_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


