# Outlet

A selling point for tickets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Outlet&#39;s type | [optional] 
**url** | **str** | Outlet&#39;s url | [optional] 

## Example

```python
from openapi_client.models.outlet import Outlet

# TODO update the JSON string below
json = "{}"
# create an instance of Outlet from a JSON string
outlet_instance = Outlet.from_json(json)
# print the JSON string representation of the object
print(Outlet.to_json())

# convert the object into a dict
outlet_dict = outlet_instance.to_dict()
# create an instance of Outlet from a dict
outlet_from_dict = Outlet.from_dict(outlet_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


