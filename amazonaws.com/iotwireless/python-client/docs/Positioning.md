# Positioning

The FPorts for the position information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clock_sync** | **int** | The Fport value. | [optional] 
**stream** | **int** | The Fport value. | [optional] 
**gnss** | **int** | The Fport value. | [optional] 

## Example

```python
from openapi_client.models.positioning import Positioning

# TODO update the JSON string below
json = "{}"
# create an instance of Positioning from a JSON string
positioning_instance = Positioning.from_json(json)
# print the JSON string representation of the object
print(Positioning.to_json())

# convert the object into a dict
positioning_dict = positioning_instance.to_dict()
# create an instance of Positioning from a dict
positioning_from_dict = Positioning.from_dict(positioning_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


