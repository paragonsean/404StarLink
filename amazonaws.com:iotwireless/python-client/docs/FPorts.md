# FPorts

List of FPort assigned for different LoRaWAN application packages to use

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fuota** | **int** | The Fport value. | [optional] 
**multicast** | **int** | The Fport value. | [optional] 
**clock_sync** | **int** | The Fport value. | [optional] 
**positioning** | [**FPortsPositioning**](FPortsPositioning.md) |  | [optional] 
**applications** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.f_ports import FPorts

# TODO update the JSON string below
json = "{}"
# create an instance of FPorts from a JSON string
f_ports_instance = FPorts.from_json(json)
# print the JSON string representation of the object
print(FPorts.to_json())

# convert the object into a dict
f_ports_dict = f_ports_instance.to_dict()
# create an instance of FPorts from a dict
f_ports_from_dict = FPorts.from_dict(f_ports_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


