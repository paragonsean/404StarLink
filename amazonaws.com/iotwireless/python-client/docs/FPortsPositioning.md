# FPortsPositioning


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clock_sync** | **int** | The Fport value. | [optional] 
**stream** | **int** | The Fport value. | [optional] 
**gnss** | **int** | The Fport value. | [optional] 

## Example

```python
from openapi_client.models.f_ports_positioning import FPortsPositioning

# TODO update the JSON string below
json = "{}"
# create an instance of FPortsPositioning from a JSON string
f_ports_positioning_instance = FPortsPositioning.from_json(json)
# print the JSON string representation of the object
print(FPortsPositioning.to_json())

# convert the object into a dict
f_ports_positioning_dict = f_ports_positioning_instance.to_dict()
# create an instance of FPortsPositioning from a dict
f_ports_positioning_from_dict = FPortsPositioning.from_dict(f_ports_positioning_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


