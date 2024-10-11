# UpdateFPortsPositioning


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clock_sync** | **int** | The Fport value. | [optional] 
**stream** | **int** | The Fport value. | [optional] 
**gnss** | **int** | The Fport value. | [optional] 

## Example

```python
from openapi_client.models.update_f_ports_positioning import UpdateFPortsPositioning

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateFPortsPositioning from a JSON string
update_f_ports_positioning_instance = UpdateFPortsPositioning.from_json(json)
# print the JSON string representation of the object
print(UpdateFPortsPositioning.to_json())

# convert the object into a dict
update_f_ports_positioning_dict = update_f_ports_positioning_instance.to_dict()
# create an instance of UpdateFPortsPositioning from a dict
update_f_ports_positioning_from_dict = UpdateFPortsPositioning.from_dict(update_f_ports_positioning_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


